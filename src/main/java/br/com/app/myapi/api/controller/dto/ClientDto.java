package br.com.app.myapi.api.controller.dto;

import org.springframework.data.domain.Page;

import br.com.app.myapi.model.Client;

public class ClientDto {

	private long id;

	private String name;

	private String address;

	private String phone;

	public ClientDto(Client client) {
		this.id = client.getId();
		this.name = client.getName();
		this.address = client.getAddress();
		this.phone = client.getPhone();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public static Page<ClientDto> converter(Page<Client> clients) {
		return clients.map(ClientDto::new);
	}

}