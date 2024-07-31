package br.com.sp.emailDTO.output;

import java.util.UUID;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record EmailRecordDTO(
		@NotNull UUID userId, 
		@NotBlank String emailTo, 
		@NotBlank String subject, 
		@NotBlank String text) {

}
