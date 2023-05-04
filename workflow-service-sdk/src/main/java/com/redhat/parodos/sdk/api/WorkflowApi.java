/*
 * Parodos Workflow Service API
 * This is the API documentation for the Parodos Workflow Service. It provides operations to execute assessments to determine infrastructure options (tooling + environments). Also executes infrastructure task workflows to call downstream systems to stand-up an infrastructure option.
 *
 * The version of the OpenAPI document: v1.0.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.redhat.parodos.sdk.api;

import com.redhat.parodos.sdk.invoker.ApiCallback;
import com.redhat.parodos.sdk.invoker.ApiClient;
import com.redhat.parodos.sdk.invoker.ApiException;
import com.redhat.parodos.sdk.invoker.ApiResponse;
import com.redhat.parodos.sdk.invoker.Configuration;
import com.redhat.parodos.sdk.invoker.Pair;
import com.redhat.parodos.sdk.invoker.ProgressRequestBody;
import com.redhat.parodos.sdk.invoker.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;

import java.util.UUID;
import com.redhat.parodos.sdk.model.WorkFlowCheckerTaskRequestDTO;
import com.redhat.parodos.sdk.model.WorkFlowContextResponseDTO;
import com.redhat.parodos.sdk.model.WorkFlowRequestDTO;
import com.redhat.parodos.sdk.model.WorkFlowResponseDTO;
import com.redhat.parodos.sdk.model.WorkFlowStatusResponseDTO;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class WorkflowApi {

	private ApiClient localVarApiClient;

	private int localHostIndex;

	private String localCustomBaseUrl;

	public WorkflowApi() {
		this(Configuration.getDefaultApiClient());
	}

	public WorkflowApi(ApiClient apiClient) {
		this.localVarApiClient = apiClient;
	}

	public ApiClient getApiClient() {
		return localVarApiClient;
	}

	public void setApiClient(ApiClient apiClient) {
		this.localVarApiClient = apiClient;
	}

	public int getHostIndex() {
		return localHostIndex;
	}

	public void setHostIndex(int hostIndex) {
		this.localHostIndex = hostIndex;
	}

	public String getCustomBaseUrl() {
		return localCustomBaseUrl;
	}

	public void setCustomBaseUrl(String customBaseUrl) {
		this.localCustomBaseUrl = customBaseUrl;
	}

	/**
	 * Build call for execute
	 * @param workFlowRequestDTO (required)
	 * @param _callback Callback for upload/download progress
	 * @return Call to execute
	 * @throws ApiException If fail to serialize the request body object
	 * @http.response.details
	 * <table summary="Response Details" border="1">
	 * <tr>
	 * <td>Status Code</td>
	 * <td>Description</td>
	 * <td>Response Headers</td>
	 * </tr>
	 * <tr>
	 * <td>200</td>
	 * <td>Succeeded</td>
	 * <td>-</td>
	 * </tr>
	 * <tr>
	 * <td>401</td>
	 * <td>Unauthorized</td>
	 * <td>-</td>
	 * </tr>
	 * <tr>
	 * <td>403</td>
	 * <td>Forbidden</td>
	 * <td>-</td>
	 * </tr>
	 * </table>
	 */
	public okhttp3.Call executeCall(WorkFlowRequestDTO workFlowRequestDTO, final ApiCallback _callback)
			throws ApiException {
		String basePath = null;
		// Operation Servers
		String[] localBasePaths = new String[] {};

		// Determine Base Path to Use
		if (localCustomBaseUrl != null) {
			basePath = localCustomBaseUrl;
		}
		else if (localBasePaths.length > 0) {
			basePath = localBasePaths[localHostIndex];
		}
		else {
			basePath = null;
		}

		Object localVarPostBody = workFlowRequestDTO;

		// create path and map variables
		String localVarPath = "/api/v1/workflows";

		List<Pair> localVarQueryParams = new ArrayList<Pair>();
		List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
		Map<String, String> localVarHeaderParams = new HashMap<String, String>();
		Map<String, String> localVarCookieParams = new HashMap<String, String>();
		Map<String, Object> localVarFormParams = new HashMap<String, Object>();

		final String[] localVarAccepts = { "application/json" };
		final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
		if (localVarAccept != null) {
			localVarHeaderParams.put("Accept", localVarAccept);
		}

		final String[] localVarContentTypes = { "application/json" };
		final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
		if (localVarContentType != null) {
			localVarHeaderParams.put("Content-Type", localVarContentType);
		}

		String[] localVarAuthNames = new String[] {};
		return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams,
				localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams,
				localVarFormParams, localVarAuthNames, _callback);
	}

	@SuppressWarnings("rawtypes")
	private okhttp3.Call executeValidateBeforeCall(WorkFlowRequestDTO workFlowRequestDTO, final ApiCallback _callback)
			throws ApiException {
		// verify the required parameter 'workFlowRequestDTO' is set
		if (workFlowRequestDTO == null) {
			throw new ApiException("Missing the required parameter 'workFlowRequestDTO' when calling execute(Async)");
		}

		return executeCall(workFlowRequestDTO, _callback);

	}

	/**
	 * Executes a workflow
	 * @param workFlowRequestDTO (required)
	 * @return WorkFlowResponseDTO
	 * @throws ApiException If fail to call the API, e.g. server error or cannot
	 * deserialize the response body
	 * @http.response.details
	 * <table summary="Response Details" border="1">
	 * <tr>
	 * <td>Status Code</td>
	 * <td>Description</td>
	 * <td>Response Headers</td>
	 * </tr>
	 * <tr>
	 * <td>200</td>
	 * <td>Succeeded</td>
	 * <td>-</td>
	 * </tr>
	 * <tr>
	 * <td>401</td>
	 * <td>Unauthorized</td>
	 * <td>-</td>
	 * </tr>
	 * <tr>
	 * <td>403</td>
	 * <td>Forbidden</td>
	 * <td>-</td>
	 * </tr>
	 * </table>
	 */
	public WorkFlowResponseDTO execute(WorkFlowRequestDTO workFlowRequestDTO) throws ApiException {
		ApiResponse<WorkFlowResponseDTO> localVarResp = executeWithHttpInfo(workFlowRequestDTO);
		return localVarResp.getData();
	}

	/**
	 * Executes a workflow
	 * @param workFlowRequestDTO (required)
	 * @return ApiResponse&lt;WorkFlowResponseDTO&gt;
	 * @throws ApiException If fail to call the API, e.g. server error or cannot
	 * deserialize the response body
	 * @http.response.details
	 * <table summary="Response Details" border="1">
	 * <tr>
	 * <td>Status Code</td>
	 * <td>Description</td>
	 * <td>Response Headers</td>
	 * </tr>
	 * <tr>
	 * <td>200</td>
	 * <td>Succeeded</td>
	 * <td>-</td>
	 * </tr>
	 * <tr>
	 * <td>401</td>
	 * <td>Unauthorized</td>
	 * <td>-</td>
	 * </tr>
	 * <tr>
	 * <td>403</td>
	 * <td>Forbidden</td>
	 * <td>-</td>
	 * </tr>
	 * </table>
	 */
	public ApiResponse<WorkFlowResponseDTO> executeWithHttpInfo(WorkFlowRequestDTO workFlowRequestDTO)
			throws ApiException {
		okhttp3.Call localVarCall = executeValidateBeforeCall(workFlowRequestDTO, null);
		Type localVarReturnType = new TypeToken<WorkFlowResponseDTO>() {
		}.getType();
		return localVarApiClient.execute(localVarCall, localVarReturnType);
	}

	/**
	 * Executes a workflow (asynchronously)
	 * @param workFlowRequestDTO (required)
	 * @param _callback The callback to be executed when the API call finishes
	 * @return The request call
	 * @throws ApiException If fail to process the API call, e.g. serializing the request
	 * body object
	 * @http.response.details
	 * <table summary="Response Details" border="1">
	 * <tr>
	 * <td>Status Code</td>
	 * <td>Description</td>
	 * <td>Response Headers</td>
	 * </tr>
	 * <tr>
	 * <td>200</td>
	 * <td>Succeeded</td>
	 * <td>-</td>
	 * </tr>
	 * <tr>
	 * <td>401</td>
	 * <td>Unauthorized</td>
	 * <td>-</td>
	 * </tr>
	 * <tr>
	 * <td>403</td>
	 * <td>Forbidden</td>
	 * <td>-</td>
	 * </tr>
	 * </table>
	 */
	public okhttp3.Call executeAsync(WorkFlowRequestDTO workFlowRequestDTO,
			final ApiCallback<WorkFlowResponseDTO> _callback) throws ApiException {

		okhttp3.Call localVarCall = executeValidateBeforeCall(workFlowRequestDTO, _callback);
		Type localVarReturnType = new TypeToken<WorkFlowResponseDTO>() {
		}.getType();
		localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
		return localVarCall;
	}

	/**
	 * Build call for getStatus
	 * @param workFlowExecutionId (required)
	 * @param _callback Callback for upload/download progress
	 * @return Call to execute
	 * @throws ApiException If fail to serialize the request body object
	 * @http.response.details
	 * <table summary="Response Details" border="1">
	 * <tr>
	 * <td>Status Code</td>
	 * <td>Description</td>
	 * <td>Response Headers</td>
	 * </tr>
	 * <tr>
	 * <td>200</td>
	 * <td>Succeeded</td>
	 * <td>-</td>
	 * </tr>
	 * <tr>
	 * <td>401</td>
	 * <td>Unauthorized</td>
	 * <td>-</td>
	 * </tr>
	 * <tr>
	 * <td>403</td>
	 * <td>Forbidden</td>
	 * <td>-</td>
	 * </tr>
	 * </table>
	 */
	public okhttp3.Call getStatusCall(UUID workFlowExecutionId, final ApiCallback _callback) throws ApiException {
		String basePath = null;
		// Operation Servers
		String[] localBasePaths = new String[] {};

		// Determine Base Path to Use
		if (localCustomBaseUrl != null) {
			basePath = localCustomBaseUrl;
		}
		else if (localBasePaths.length > 0) {
			basePath = localBasePaths[localHostIndex];
		}
		else {
			basePath = null;
		}

		Object localVarPostBody = null;

		// create path and map variables
		String localVarPath = "/api/v1/workflows/{workFlowExecutionId}/status".replace(
				"{" + "workFlowExecutionId" + "}", localVarApiClient.escapeString(workFlowExecutionId.toString()));

		List<Pair> localVarQueryParams = new ArrayList<Pair>();
		List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
		Map<String, String> localVarHeaderParams = new HashMap<String, String>();
		Map<String, String> localVarCookieParams = new HashMap<String, String>();
		Map<String, Object> localVarFormParams = new HashMap<String, Object>();

		final String[] localVarAccepts = { "application/json" };
		final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
		if (localVarAccept != null) {
			localVarHeaderParams.put("Accept", localVarAccept);
		}

		final String[] localVarContentTypes = {};
		final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
		if (localVarContentType != null) {
			localVarHeaderParams.put("Content-Type", localVarContentType);
		}

		String[] localVarAuthNames = new String[] {};
		return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams,
				localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams,
				localVarFormParams, localVarAuthNames, _callback);
	}

	@SuppressWarnings("rawtypes")
	private okhttp3.Call getStatusValidateBeforeCall(UUID workFlowExecutionId, final ApiCallback _callback)
			throws ApiException {
		// verify the required parameter 'workFlowExecutionId' is set
		if (workFlowExecutionId == null) {
			throw new ApiException(
					"Missing the required parameter 'workFlowExecutionId' when calling getStatus(Async)");
		}

		return getStatusCall(workFlowExecutionId, _callback);

	}

	/**
	 * Returns a workflow status
	 * @param workFlowExecutionId (required)
	 * @return WorkFlowStatusResponseDTO
	 * @throws ApiException If fail to call the API, e.g. server error or cannot
	 * deserialize the response body
	 * @http.response.details
	 * <table summary="Response Details" border="1">
	 * <tr>
	 * <td>Status Code</td>
	 * <td>Description</td>
	 * <td>Response Headers</td>
	 * </tr>
	 * <tr>
	 * <td>200</td>
	 * <td>Succeeded</td>
	 * <td>-</td>
	 * </tr>
	 * <tr>
	 * <td>401</td>
	 * <td>Unauthorized</td>
	 * <td>-</td>
	 * </tr>
	 * <tr>
	 * <td>403</td>
	 * <td>Forbidden</td>
	 * <td>-</td>
	 * </tr>
	 * </table>
	 */
	public WorkFlowStatusResponseDTO getStatus(UUID workFlowExecutionId) throws ApiException {
		ApiResponse<WorkFlowStatusResponseDTO> localVarResp = getStatusWithHttpInfo(workFlowExecutionId);
		return localVarResp.getData();
	}

	/**
	 * Returns a workflow status
	 * @param workFlowExecutionId (required)
	 * @return ApiResponse&lt;WorkFlowStatusResponseDTO&gt;
	 * @throws ApiException If fail to call the API, e.g. server error or cannot
	 * deserialize the response body
	 * @http.response.details
	 * <table summary="Response Details" border="1">
	 * <tr>
	 * <td>Status Code</td>
	 * <td>Description</td>
	 * <td>Response Headers</td>
	 * </tr>
	 * <tr>
	 * <td>200</td>
	 * <td>Succeeded</td>
	 * <td>-</td>
	 * </tr>
	 * <tr>
	 * <td>401</td>
	 * <td>Unauthorized</td>
	 * <td>-</td>
	 * </tr>
	 * <tr>
	 * <td>403</td>
	 * <td>Forbidden</td>
	 * <td>-</td>
	 * </tr>
	 * </table>
	 */
	public ApiResponse<WorkFlowStatusResponseDTO> getStatusWithHttpInfo(UUID workFlowExecutionId) throws ApiException {
		okhttp3.Call localVarCall = getStatusValidateBeforeCall(workFlowExecutionId, null);
		Type localVarReturnType = new TypeToken<WorkFlowStatusResponseDTO>() {
		}.getType();
		return localVarApiClient.execute(localVarCall, localVarReturnType);
	}

	/**
	 * Returns a workflow status (asynchronously)
	 * @param workFlowExecutionId (required)
	 * @param _callback The callback to be executed when the API call finishes
	 * @return The request call
	 * @throws ApiException If fail to process the API call, e.g. serializing the request
	 * body object
	 * @http.response.details
	 * <table summary="Response Details" border="1">
	 * <tr>
	 * <td>Status Code</td>
	 * <td>Description</td>
	 * <td>Response Headers</td>
	 * </tr>
	 * <tr>
	 * <td>200</td>
	 * <td>Succeeded</td>
	 * <td>-</td>
	 * </tr>
	 * <tr>
	 * <td>401</td>
	 * <td>Unauthorized</td>
	 * <td>-</td>
	 * </tr>
	 * <tr>
	 * <td>403</td>
	 * <td>Forbidden</td>
	 * <td>-</td>
	 * </tr>
	 * </table>
	 */
	public okhttp3.Call getStatusAsync(UUID workFlowExecutionId, final ApiCallback<WorkFlowStatusResponseDTO> _callback)
			throws ApiException {

		okhttp3.Call localVarCall = getStatusValidateBeforeCall(workFlowExecutionId, _callback);
		Type localVarReturnType = new TypeToken<WorkFlowStatusResponseDTO>() {
		}.getType();
		localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
		return localVarCall;
	}

	/**
	 * Build call for getWorkflowParameters
	 * @param workFlowExecutionId (required)
	 * @param param (required)
	 * @param _callback Callback for upload/download progress
	 * @return Call to execute
	 * @throws ApiException If fail to serialize the request body object
	 * @http.response.details
	 * <table summary="Response Details" border="1">
	 * <tr>
	 * <td>Status Code</td>
	 * <td>Description</td>
	 * <td>Response Headers</td>
	 * </tr>
	 * <tr>
	 * <td>200</td>
	 * <td>Succeeded</td>
	 * <td>-</td>
	 * </tr>
	 * <tr>
	 * <td>401</td>
	 * <td>Unauthorized</td>
	 * <td>-</td>
	 * </tr>
	 * <tr>
	 * <td>403</td>
	 * <td>Forbidden</td>
	 * <td>-</td>
	 * </tr>
	 * </table>
	 */
	public okhttp3.Call getWorkflowParametersCall(UUID workFlowExecutionId, List<String> param,
			final ApiCallback _callback) throws ApiException {
		String basePath = null;
		// Operation Servers
		String[] localBasePaths = new String[] {};

		// Determine Base Path to Use
		if (localCustomBaseUrl != null) {
			basePath = localCustomBaseUrl;
		}
		else if (localBasePaths.length > 0) {
			basePath = localBasePaths[localHostIndex];
		}
		else {
			basePath = null;
		}

		Object localVarPostBody = null;

		// create path and map variables
		String localVarPath = "/api/v1/workflows/{workFlowExecutionId}/context".replace(
				"{" + "workFlowExecutionId" + "}", localVarApiClient.escapeString(workFlowExecutionId.toString()));

		List<Pair> localVarQueryParams = new ArrayList<Pair>();
		List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
		Map<String, String> localVarHeaderParams = new HashMap<String, String>();
		Map<String, String> localVarCookieParams = new HashMap<String, String>();
		Map<String, Object> localVarFormParams = new HashMap<String, Object>();

		if (param != null) {
			localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("multi", "param", param));
		}

		final String[] localVarAccepts = { "application/json" };
		final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
		if (localVarAccept != null) {
			localVarHeaderParams.put("Accept", localVarAccept);
		}

		final String[] localVarContentTypes = {};
		final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
		if (localVarContentType != null) {
			localVarHeaderParams.put("Content-Type", localVarContentType);
		}

		String[] localVarAuthNames = new String[] {};
		return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams,
				localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams,
				localVarFormParams, localVarAuthNames, _callback);
	}

	@SuppressWarnings("rawtypes")
	private okhttp3.Call getWorkflowParametersValidateBeforeCall(UUID workFlowExecutionId, List<String> param,
			final ApiCallback _callback) throws ApiException {
		// verify the required parameter 'workFlowExecutionId' is set
		if (workFlowExecutionId == null) {
			throw new ApiException(
					"Missing the required parameter 'workFlowExecutionId' when calling getWorkflowParameters(Async)");
		}

		// verify the required parameter 'param' is set
		if (param == null) {
			throw new ApiException("Missing the required parameter 'param' when calling getWorkflowParameters(Async)");
		}

		return getWorkflowParametersCall(workFlowExecutionId, param, _callback);

	}

	/**
	 * Returns workflow context parameters
	 * @param workFlowExecutionId (required)
	 * @param param (required)
	 * @return WorkFlowContextResponseDTO
	 * @throws ApiException If fail to call the API, e.g. server error or cannot
	 * deserialize the response body
	 * @http.response.details
	 * <table summary="Response Details" border="1">
	 * <tr>
	 * <td>Status Code</td>
	 * <td>Description</td>
	 * <td>Response Headers</td>
	 * </tr>
	 * <tr>
	 * <td>200</td>
	 * <td>Succeeded</td>
	 * <td>-</td>
	 * </tr>
	 * <tr>
	 * <td>401</td>
	 * <td>Unauthorized</td>
	 * <td>-</td>
	 * </tr>
	 * <tr>
	 * <td>403</td>
	 * <td>Forbidden</td>
	 * <td>-</td>
	 * </tr>
	 * </table>
	 */
	public WorkFlowContextResponseDTO getWorkflowParameters(UUID workFlowExecutionId, List<String> param)
			throws ApiException {
		ApiResponse<WorkFlowContextResponseDTO> localVarResp = getWorkflowParametersWithHttpInfo(workFlowExecutionId,
				param);
		return localVarResp.getData();
	}

	/**
	 * Returns workflow context parameters
	 * @param workFlowExecutionId (required)
	 * @param param (required)
	 * @return ApiResponse&lt;WorkFlowContextResponseDTO&gt;
	 * @throws ApiException If fail to call the API, e.g. server error or cannot
	 * deserialize the response body
	 * @http.response.details
	 * <table summary="Response Details" border="1">
	 * <tr>
	 * <td>Status Code</td>
	 * <td>Description</td>
	 * <td>Response Headers</td>
	 * </tr>
	 * <tr>
	 * <td>200</td>
	 * <td>Succeeded</td>
	 * <td>-</td>
	 * </tr>
	 * <tr>
	 * <td>401</td>
	 * <td>Unauthorized</td>
	 * <td>-</td>
	 * </tr>
	 * <tr>
	 * <td>403</td>
	 * <td>Forbidden</td>
	 * <td>-</td>
	 * </tr>
	 * </table>
	 */
	public ApiResponse<WorkFlowContextResponseDTO> getWorkflowParametersWithHttpInfo(UUID workFlowExecutionId,
			List<String> param) throws ApiException {
		okhttp3.Call localVarCall = getWorkflowParametersValidateBeforeCall(workFlowExecutionId, param, null);
		Type localVarReturnType = new TypeToken<WorkFlowContextResponseDTO>() {
		}.getType();
		return localVarApiClient.execute(localVarCall, localVarReturnType);
	}

	/**
	 * Returns workflow context parameters (asynchronously)
	 * @param workFlowExecutionId (required)
	 * @param param (required)
	 * @param _callback The callback to be executed when the API call finishes
	 * @return The request call
	 * @throws ApiException If fail to process the API call, e.g. serializing the request
	 * body object
	 * @http.response.details
	 * <table summary="Response Details" border="1">
	 * <tr>
	 * <td>Status Code</td>
	 * <td>Description</td>
	 * <td>Response Headers</td>
	 * </tr>
	 * <tr>
	 * <td>200</td>
	 * <td>Succeeded</td>
	 * <td>-</td>
	 * </tr>
	 * <tr>
	 * <td>401</td>
	 * <td>Unauthorized</td>
	 * <td>-</td>
	 * </tr>
	 * <tr>
	 * <td>403</td>
	 * <td>Forbidden</td>
	 * <td>-</td>
	 * </tr>
	 * </table>
	 */
	public okhttp3.Call getWorkflowParametersAsync(UUID workFlowExecutionId, List<String> param,
			final ApiCallback<WorkFlowContextResponseDTO> _callback) throws ApiException {

		okhttp3.Call localVarCall = getWorkflowParametersValidateBeforeCall(workFlowExecutionId, param, _callback);
		Type localVarReturnType = new TypeToken<WorkFlowContextResponseDTO>() {
		}.getType();
		localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
		return localVarCall;
	}

	/**
	 * Build call for updateWorkFlowCheckerTaskStatus
	 * @param workFlowExecutionId (required)
	 * @param workFlowCheckerTaskName (required)
	 * @param workFlowCheckerTaskRequestDTO (required)
	 * @param _callback Callback for upload/download progress
	 * @return Call to execute
	 * @throws ApiException If fail to serialize the request body object
	 * @http.response.details
	 * <table summary="Response Details" border="1">
	 * <tr>
	 * <td>Status Code</td>
	 * <td>Description</td>
	 * <td>Response Headers</td>
	 * </tr>
	 * <tr>
	 * <td>200</td>
	 * <td>Succeeded</td>
	 * <td>-</td>
	 * </tr>
	 * <tr>
	 * <td>401</td>
	 * <td>Unauthorized</td>
	 * <td>-</td>
	 * </tr>
	 * <tr>
	 * <td>403</td>
	 * <td>Forbidden</td>
	 * <td>-</td>
	 * </tr>
	 * <tr>
	 * <td>404</td>
	 * <td>Not found</td>
	 * <td>-</td>
	 * </tr>
	 * </table>
	 */
	public okhttp3.Call updateWorkFlowCheckerTaskStatusCall(UUID workFlowExecutionId, String workFlowCheckerTaskName,
			WorkFlowCheckerTaskRequestDTO workFlowCheckerTaskRequestDTO, final ApiCallback _callback)
			throws ApiException {
		String basePath = null;
		// Operation Servers
		String[] localBasePaths = new String[] {};

		// Determine Base Path to Use
		if (localCustomBaseUrl != null) {
			basePath = localCustomBaseUrl;
		}
		else if (localBasePaths.length > 0) {
			basePath = localBasePaths[localHostIndex];
		}
		else {
			basePath = null;
		}

		Object localVarPostBody = workFlowCheckerTaskRequestDTO;

		// create path and map variables
		String localVarPath = "/api/v1/workflows/{workFlowExecutionId}/checkers/{workFlowCheckerTaskName}"
				.replace("{" + "workFlowExecutionId" + "}",
						localVarApiClient.escapeString(workFlowExecutionId.toString()))
				.replace("{" + "workFlowCheckerTaskName" + "}",
						localVarApiClient.escapeString(workFlowCheckerTaskName.toString()));

		List<Pair> localVarQueryParams = new ArrayList<Pair>();
		List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
		Map<String, String> localVarHeaderParams = new HashMap<String, String>();
		Map<String, String> localVarCookieParams = new HashMap<String, String>();
		Map<String, Object> localVarFormParams = new HashMap<String, Object>();

		final String[] localVarAccepts = { "application/json" };
		final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
		if (localVarAccept != null) {
			localVarHeaderParams.put("Accept", localVarAccept);
		}

		final String[] localVarContentTypes = { "application/json" };
		final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
		if (localVarContentType != null) {
			localVarHeaderParams.put("Content-Type", localVarContentType);
		}

		String[] localVarAuthNames = new String[] {};
		return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams,
				localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams,
				localVarFormParams, localVarAuthNames, _callback);
	}

	@SuppressWarnings("rawtypes")
	private okhttp3.Call updateWorkFlowCheckerTaskStatusValidateBeforeCall(UUID workFlowExecutionId,
			String workFlowCheckerTaskName, WorkFlowCheckerTaskRequestDTO workFlowCheckerTaskRequestDTO,
			final ApiCallback _callback) throws ApiException {
		// verify the required parameter 'workFlowExecutionId' is set
		if (workFlowExecutionId == null) {
			throw new ApiException(
					"Missing the required parameter 'workFlowExecutionId' when calling updateWorkFlowCheckerTaskStatus(Async)");
		}

		// verify the required parameter 'workFlowCheckerTaskName' is set
		if (workFlowCheckerTaskName == null) {
			throw new ApiException(
					"Missing the required parameter 'workFlowCheckerTaskName' when calling updateWorkFlowCheckerTaskStatus(Async)");
		}

		// verify the required parameter 'workFlowCheckerTaskRequestDTO' is set
		if (workFlowCheckerTaskRequestDTO == null) {
			throw new ApiException(
					"Missing the required parameter 'workFlowCheckerTaskRequestDTO' when calling updateWorkFlowCheckerTaskStatus(Async)");
		}

		return updateWorkFlowCheckerTaskStatusCall(workFlowExecutionId, workFlowCheckerTaskName,
				workFlowCheckerTaskRequestDTO, _callback);

	}

	/**
	 * Updates a workflow checker task status
	 * @param workFlowExecutionId (required)
	 * @param workFlowCheckerTaskName (required)
	 * @param workFlowCheckerTaskRequestDTO (required)
	 * @return String
	 * @throws ApiException If fail to call the API, e.g. server error or cannot
	 * deserialize the response body
	 * @http.response.details
	 * <table summary="Response Details" border="1">
	 * <tr>
	 * <td>Status Code</td>
	 * <td>Description</td>
	 * <td>Response Headers</td>
	 * </tr>
	 * <tr>
	 * <td>200</td>
	 * <td>Succeeded</td>
	 * <td>-</td>
	 * </tr>
	 * <tr>
	 * <td>401</td>
	 * <td>Unauthorized</td>
	 * <td>-</td>
	 * </tr>
	 * <tr>
	 * <td>403</td>
	 * <td>Forbidden</td>
	 * <td>-</td>
	 * </tr>
	 * <tr>
	 * <td>404</td>
	 * <td>Not found</td>
	 * <td>-</td>
	 * </tr>
	 * </table>
	 */
	public String updateWorkFlowCheckerTaskStatus(UUID workFlowExecutionId, String workFlowCheckerTaskName,
			WorkFlowCheckerTaskRequestDTO workFlowCheckerTaskRequestDTO) throws ApiException {
		ApiResponse<String> localVarResp = updateWorkFlowCheckerTaskStatusWithHttpInfo(workFlowExecutionId,
				workFlowCheckerTaskName, workFlowCheckerTaskRequestDTO);
		return localVarResp.getData();
	}

	/**
	 * Updates a workflow checker task status
	 * @param workFlowExecutionId (required)
	 * @param workFlowCheckerTaskName (required)
	 * @param workFlowCheckerTaskRequestDTO (required)
	 * @return ApiResponse&lt;String&gt;
	 * @throws ApiException If fail to call the API, e.g. server error or cannot
	 * deserialize the response body
	 * @http.response.details
	 * <table summary="Response Details" border="1">
	 * <tr>
	 * <td>Status Code</td>
	 * <td>Description</td>
	 * <td>Response Headers</td>
	 * </tr>
	 * <tr>
	 * <td>200</td>
	 * <td>Succeeded</td>
	 * <td>-</td>
	 * </tr>
	 * <tr>
	 * <td>401</td>
	 * <td>Unauthorized</td>
	 * <td>-</td>
	 * </tr>
	 * <tr>
	 * <td>403</td>
	 * <td>Forbidden</td>
	 * <td>-</td>
	 * </tr>
	 * <tr>
	 * <td>404</td>
	 * <td>Not found</td>
	 * <td>-</td>
	 * </tr>
	 * </table>
	 */
	public ApiResponse<String> updateWorkFlowCheckerTaskStatusWithHttpInfo(UUID workFlowExecutionId,
			String workFlowCheckerTaskName, WorkFlowCheckerTaskRequestDTO workFlowCheckerTaskRequestDTO)
			throws ApiException {
		okhttp3.Call localVarCall = updateWorkFlowCheckerTaskStatusValidateBeforeCall(workFlowExecutionId,
				workFlowCheckerTaskName, workFlowCheckerTaskRequestDTO, null);
		Type localVarReturnType = new TypeToken<String>() {
		}.getType();
		return localVarApiClient.execute(localVarCall, localVarReturnType);
	}

	/**
	 * Updates a workflow checker task status (asynchronously)
	 * @param workFlowExecutionId (required)
	 * @param workFlowCheckerTaskName (required)
	 * @param workFlowCheckerTaskRequestDTO (required)
	 * @param _callback The callback to be executed when the API call finishes
	 * @return The request call
	 * @throws ApiException If fail to process the API call, e.g. serializing the request
	 * body object
	 * @http.response.details
	 * <table summary="Response Details" border="1">
	 * <tr>
	 * <td>Status Code</td>
	 * <td>Description</td>
	 * <td>Response Headers</td>
	 * </tr>
	 * <tr>
	 * <td>200</td>
	 * <td>Succeeded</td>
	 * <td>-</td>
	 * </tr>
	 * <tr>
	 * <td>401</td>
	 * <td>Unauthorized</td>
	 * <td>-</td>
	 * </tr>
	 * <tr>
	 * <td>403</td>
	 * <td>Forbidden</td>
	 * <td>-</td>
	 * </tr>
	 * <tr>
	 * <td>404</td>
	 * <td>Not found</td>
	 * <td>-</td>
	 * </tr>
	 * </table>
	 */
	public okhttp3.Call updateWorkFlowCheckerTaskStatusAsync(UUID workFlowExecutionId, String workFlowCheckerTaskName,
			WorkFlowCheckerTaskRequestDTO workFlowCheckerTaskRequestDTO, final ApiCallback<String> _callback)
			throws ApiException {

		okhttp3.Call localVarCall = updateWorkFlowCheckerTaskStatusValidateBeforeCall(workFlowExecutionId,
				workFlowCheckerTaskName, workFlowCheckerTaskRequestDTO, _callback);
		Type localVarReturnType = new TypeToken<String>() {
		}.getType();
		localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
		return localVarCall;
	}

}
