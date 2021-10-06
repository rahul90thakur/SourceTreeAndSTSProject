package com.wellsfargo.group5.springbootdata.restapi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wellsfargo.group5.springbootdata.exception.AddressBookException;
import com.wellsfargo.group5.springbootdata.model.AddressGroupModel;
import com.wellsfargo.group5.springbootdata.service.AddressGroupService;

@RestController
@RequestMapping("/groups")
public class AddressGroupApi {
	@Autowired
	private AddressGroupService agService;
	
	@GetMapping
	public ResponseEntity<List<AddressGroupModel>> groupsAction() throws AddressBookException{
		return new ResponseEntity<>(agService.getAll(),HttpStatus.OK);
	}
	@GetMapping("/{gid}")
	public ResponseEntity<AddressGroupModel> groupAction(@PathVariable("gid")int groupId) throws AddressBookException{
		return new ResponseEntity<>(agService.get(groupId),HttpStatus.OK);
	}
	
	
}
