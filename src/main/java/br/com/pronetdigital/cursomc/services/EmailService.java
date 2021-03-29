package br.com.pronetdigital.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import br.com.pronetdigital.cursomc.domain.Pedido;

public interface EmailService {

	void sendOrderConfirmationEmail(Pedido obj);

	void sendEmail(SimpleMailMessage msg);
}