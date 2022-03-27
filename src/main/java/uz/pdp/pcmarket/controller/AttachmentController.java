package uz.pdp.pcmarket.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import uz.pdp.pcmarket.pyload.ApiResponse;
import uz.pdp.pcmarket.service.AttachmentService;

import javax.servlet.http.HttpServletResponse;


@RestController
@RequestMapping("/attachment")
public class AttachmentController {

    private final AttachmentService attachmentService;
    @Autowired
    public AttachmentController(AttachmentService attachmentService) {
        this.attachmentService = attachmentService;
    }
    @PostMapping("/upload")
    public ResponseEntity<?> addFile(MultipartHttpServletRequest request){
        ApiResponse apiResponse = attachmentService.addAttachment(request);
        return ResponseEntity.status(apiResponse.getIsSuccess()? 201:409).body(apiResponse);
    }

    @GetMapping("/dowlond/{id}")
    public ResponseEntity<ApiResponse> getFile(@PathVariable Integer id, HttpServletResponse response){
        ApiResponse apiResponse = attachmentService.getFile(id, response);
        return ResponseEntity.ok(apiResponse);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ApiResponse> editFile(@PathVariable Integer id,MultipartHttpServletRequest request){
        ApiResponse apiResponse = attachmentService.editUpload(id, request);
       return ResponseEntity.status(apiResponse.getIsSuccess()?202:409).body(apiResponse);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<ApiResponse> deletedFile(@PathVariable Integer id){
        ApiResponse apiResponse = attachmentService.deletedAttachment(id);
        return (ResponseEntity<ApiResponse>) ResponseEntity.noContent();
    }
}
