package com.skcc.market;

import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.skcc.market.eda.comment.core.command.WriteCommentCommand;

@RestController
@RequestMapping("/v1")
public class CommentRestEndpoint {

	private final CommandGateway commandGateway;
	
	public CommentRestEndpoint(CommandGateway commandGateway) {
		this.commandGateway = commandGateway;
	}
	
	@GetMapping("/comment")
	public void writeComment() {
		commandGateway.send(new WriteCommentCommand((long) 1, (long) 1, "01", "test", "Y"));
	}
}
