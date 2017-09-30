package javaConfig;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.AbstractWebSocketMessageBrokerConfigurer;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;

@Configurable
@EnableWebSocketMessageBroker
public class WebsocketConfig extends AbstractWebSocketMessageBrokerConfigurer{

	@Override
	public void registerStompEndpoints(StompEndpointRegistry registry) {
		registry.addEndpoint("/websocket").withSockJS();
	}
	
	@Override
	public void configureMessageBroker(MessageBrokerRegistry registry){
		registry.enableSimpleBroker();
		registry.setApplicationDestinationPrefixes("/app");
		
	}

	
}
