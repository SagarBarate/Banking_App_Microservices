package com.tus.accounts.exception;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.http.ResponseEntity;
import com.tus.accounts.dto.ErrorResponseDto;
import org.springframework.web.context.request.WebRequest;
import org.springframework.http.HttpStatus;
import java.time.LocalDateTime;

@controllerAdvice
public class GlobalExcepptionHandler {

}
