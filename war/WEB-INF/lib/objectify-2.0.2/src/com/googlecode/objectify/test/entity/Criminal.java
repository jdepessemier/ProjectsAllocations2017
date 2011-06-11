package com.googlecode.objectify.test.entity;

import java.util.List;

import javax.persistence.Embedded;
import javax.persistence.Id;

import com.googlecode.objectify.annotation.Cached;

/**
 * Entity for testing null/empty embedded arrays and collections
 */
@Cached
public class Criminal
{
	@Id
	public Long id;
	
	@Embedded
	public Name[] aliases;
	
	@Embedded
	public List<Name> moreAliases;

	public Criminal()
	{
	}
}
