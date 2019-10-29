package jdk11.jep.http321;

import java.net.Authenticator;
import java.net.InetSocketAddress;
import java.net.ProxySelector;
import java.net.http.HttpClient;
import java.net.http.HttpClient.Version;

public class HttpCient {
	public static void main(String[] args) {
		HttpClient client = HttpClient.newBuilder().version(Version.HTTP_2)
//	      .followRedirects(Redirect.SAME_PROTOCOL)
	      .proxy(ProxySelector.of(new InetSocketAddress("www.baidu.com", 80)))
	      .authenticator(Authenticator.getDefault())
	      .build();
		
		client.executor();
	}
}
