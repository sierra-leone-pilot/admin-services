package io.mosip.kernel.smsnotification.msg91.constant;

/**
 * This enum provides all the exception constants for sms notification.
 * 
 * @author Ritesh sinha
 * @since 1.0.0
 *
 */
public enum SmsExceptionConstants {

	SMS_ILLEGAL_INPUT("KER-NOS-001", "Number and message can't be empty, null"),
	SMS_INVALID_CONTACT_NUMBER("KER-NOS-002","Contact number cannot contains alphabet,special character or less than 10 digits");

	/**
	 * The error code.
	 */
	private String errorCode;

	/**
	 * The error message.
	 */
	private String errorMessage;

	/**
	 * @param errorCode
	 *            The error code to be set.
	 * @param errorMessage
	 *            The error message to be set.
	 */
	private SmsExceptionConstants(String errorCode, String errorMessage) {
		this.errorCode = errorCode;
		this.errorMessage = errorMessage;
	}

	/**
	 * @return the error code.
	 */
	public String getErrorCode() {
		return errorCode;
	}

	/**
	 * @return the error message.
	 */
	public String getErrorMessage() {
		return errorMessage;
	}

}
