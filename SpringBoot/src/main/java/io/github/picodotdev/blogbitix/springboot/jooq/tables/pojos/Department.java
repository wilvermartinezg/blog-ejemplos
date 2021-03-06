/**
 * This class is generated by jOOQ
 */
package io.github.picodotdev.blogbitix.springboot.jooq.tables.pojos;


import io.github.picodotdev.blogbitix.springboot.jooq.tables.interfaces.IDepartment;

import javax.annotation.Generated;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


/**
 * This class is generated by jOOQ.
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.1"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Department implements IDepartment {

	private static final long serialVersionUID = 866872915;

	private Long   id;
	private String name;

	public Department() {}

	public Department(Department value) {
		this.id = value.id;
		this.name = value.name;
	}

	public Department(
		Long   id,
		String name
	) {
		this.id = id;
		this.name = name;
	}

	@NotNull
	@Override
	public Long getId() {
		return this.id;
	}

	@Override
	public void setId(Long id) {
		this.id = id;
	}

	@NotNull
	@Size(max = 256)
	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("Department (");

		sb.append(id);
		sb.append(", ").append(name);

		sb.append(")");
		return sb.toString();
	}

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void from(IDepartment from) {
		setId(from.getId());
		setName(from.getName());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public <E extends IDepartment> E into(E into) {
		into.from(this);
		return into;
	}
}
