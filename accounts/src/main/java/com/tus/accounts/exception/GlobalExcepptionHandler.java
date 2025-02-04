package com.tus.accounts.exception;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.http.ResponseEntity;
import com.tus.accounts.dto.ErrorResponseDto;
import org.springframework.web.context.request.WebRequest;
import org.springframework.http.HttpStatus;
import java.time.LocalDateTime;

@ControllerAdvice
public class GlobalExcepptionHandler {
    @ExceptionHandler(CustomerAlreadyExistsException.class)
    public ResponseEntity<ErrorResponseDto> handleCustomerAlreadyExistsException(CustomerAlreadyExistsException exception, WebRequest webRequest){
        ErrorResponseDto errorResponseDTO = new ErrorResponseDto(
            webRequest.getDescription(false),
            HttpStatus.NOT_FOUND,
            exception.getMessage(),
            LocalDateTime.now()
        );
        return new ResponseEntity<>(errorResponseDTO,HttpStatus.NOT_FOUND);
    }

}
