package gov.cdc.helper.common;

import org.json.JSONException;
import org.json.JSONObject;

public class ServiceException extends Exception {

	private static final long serialVersionUID = 3638768641142369946L;

	private final String obj;

	/**
	 * Constructs a new ServiceException with the specified message
	 *
	 * @param message string describing exception
	 */
	public ServiceException(String message) {
		super(message);
		obj = null;
	}

	/**
	 * Constructs a new ServiceException with the specified exception
	 *
	 * @param e exception to be wrapped by ServiceException
	 */
	public ServiceException(Exception e) {
		super(e);
		obj = null;
	}

	/**
	 * Constructs a new ServiceException with the specified JSONObject
	 *
	 * @param obj exception details
	 */
	public ServiceException(JSONObject obj) {
		this.obj = obj.toString();
	}

	/**
	 * Returns ServiceException details if the ServiceException was created with a JSONObject
	 *
	 * @return JSONObject details of ServiceException if it was created with JSONObject. Otherwise returns null
	 * @throws JSONException
	 */
	public JSONObject getObj() throws JSONException {
		return obj != null ? new JSONObject(obj) : null;
	}

}
