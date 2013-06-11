/**
 * This class is generated by jOOQ
 */
package org.wikapidia.core.jooq.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "3.0.0"},
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked" })
public class LocalPageRecord extends org.jooq.impl.UpdatableRecordImpl<org.wikapidia.core.jooq.tables.records.LocalPageRecord> implements org.jooq.Record5<java.lang.Long, java.lang.Short, java.lang.Integer, java.lang.String, java.lang.Short> {

	private static final long serialVersionUID = 298694052;

	/**
	 * Setter for <code>PUBLIC.LOCAL_PAGE.ID</code>. 
	 */
	public void setId(java.lang.Long value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>PUBLIC.LOCAL_PAGE.ID</code>. 
	 */
	public java.lang.Long getId() {
		return (java.lang.Long) getValue(0);
	}

	/**
	 * Setter for <code>PUBLIC.LOCAL_PAGE.LANG_ID</code>. 
	 */
	public void setLangId(java.lang.Short value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>PUBLIC.LOCAL_PAGE.LANG_ID</code>. 
	 */
	public java.lang.Short getLangId() {
		return (java.lang.Short) getValue(1);
	}

	/**
	 * Setter for <code>PUBLIC.LOCAL_PAGE.PAGE_ID</code>. 
	 */
	public void setPageId(java.lang.Integer value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>PUBLIC.LOCAL_PAGE.PAGE_ID</code>. 
	 */
	public java.lang.Integer getPageId() {
		return (java.lang.Integer) getValue(2);
	}

	/**
	 * Setter for <code>PUBLIC.LOCAL_PAGE.TITLE</code>. 
	 */
	public void setTitle(java.lang.String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>PUBLIC.LOCAL_PAGE.TITLE</code>. 
	 */
	public java.lang.String getTitle() {
		return (java.lang.String) getValue(3);
	}

	/**
	 * Setter for <code>PUBLIC.LOCAL_PAGE.PAGE_TYPE</code>. 
	 */
	public void setPageType(java.lang.Short value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>PUBLIC.LOCAL_PAGE.PAGE_TYPE</code>. 
	 */
	public java.lang.Short getPageType() {
		return (java.lang.Short) getValue(4);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Record1<java.lang.Long> key() {
		return (org.jooq.Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record5 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row5<java.lang.Long, java.lang.Short, java.lang.Integer, java.lang.String, java.lang.Short> fieldsRow() {
		return (org.jooq.Row5) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row5<java.lang.Long, java.lang.Short, java.lang.Integer, java.lang.String, java.lang.Short> valuesRow() {
		return (org.jooq.Row5) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field1() {
		return org.wikapidia.core.jooq.tables.LocalPage.LOCAL_PAGE.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Short> field2() {
		return org.wikapidia.core.jooq.tables.LocalPage.LOCAL_PAGE.LANG_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field3() {
		return org.wikapidia.core.jooq.tables.LocalPage.LOCAL_PAGE.PAGE_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field4() {
		return org.wikapidia.core.jooq.tables.LocalPage.LOCAL_PAGE.TITLE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Short> field5() {
		return org.wikapidia.core.jooq.tables.LocalPage.LOCAL_PAGE.PAGE_TYPE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value1() {
		return getId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Short value2() {
		return getLangId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value3() {
		return getPageId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value4() {
		return getTitle();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Short value5() {
		return getPageType();
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached LocalPageRecord
	 */
	public LocalPageRecord() {
		super(org.wikapidia.core.jooq.tables.LocalPage.LOCAL_PAGE);
	}
}
