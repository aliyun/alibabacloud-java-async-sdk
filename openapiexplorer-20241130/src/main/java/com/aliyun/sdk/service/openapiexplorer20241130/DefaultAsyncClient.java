// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.openapiexplorer20241130;

import com.aliyun.core.http.*;
import com.aliyun.sdk.service.openapiexplorer20241130.models.*;
import darabonba.core.utils.*;
import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;

import java.util.concurrent.CompletableFuture;


/**
 * <p>Main client.</p>
 */
public final class DefaultAsyncClient implements AsyncClient {

    protected final String product;
    protected final String version;
    protected final String endpointRule;
    protected final java.util.Map<String, String> endpointMap;
    protected final TeaRequest REQUEST;
    protected final TeaAsyncHandler handler;

    protected DefaultAsyncClient(ClientConfiguration configuration) {
        this.handler = new TeaAsyncHandler(configuration);
        this.product = "OpenAPIExplorer";
        this.version = "2024-11-30";
        this.endpointRule = "";
        this.endpointMap = new java.util.HashMap<>();
        this.REQUEST = TeaRequest.create().setProduct(product).setEndpointRule(endpointRule).setEndpointMap(endpointMap).setVersion(version);
    }

    @Override
    public void close() {
        this.handler.close();
    }

    /**
     * @param request the request parameters of ApiMcpServerValidateHcl  ApiMcpServerValidateHclRequest
     * @return ApiMcpServerValidateHclResponse
     */
    @Override
    public CompletableFuture<ApiMcpServerValidateHclResponse> apiMcpServerValidateHcl(ApiMcpServerValidateHclRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ApiMcpServerValidateHcl").setMethod(HttpMethod.POST).setPathRegex("/terraform/validate").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ApiMcpServerValidateHclResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ApiMcpServerValidateHclResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateApiMcpServer  CreateApiMcpServerRequest
     * @return CreateApiMcpServerResponse
     */
    @Override
    public CompletableFuture<CreateApiMcpServerResponse> createApiMcpServer(CreateApiMcpServerRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateApiMcpServer").setMethod(HttpMethod.POST).setPathRegex("/apimcpserver").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateApiMcpServerResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateApiMcpServerResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteApiMcpServer  DeleteApiMcpServerRequest
     * @return DeleteApiMcpServerResponse
     */
    @Override
    public CompletableFuture<DeleteApiMcpServerResponse> deleteApiMcpServer(DeleteApiMcpServerRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteApiMcpServer").setMethod(HttpMethod.DELETE).setPathRegex("/apimcpserver").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteApiMcpServerResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteApiMcpServerResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GenerateCLICommand  GenerateCLICommandRequest
     * @return GenerateCLICommandResponse
     */
    @Override
    public CompletableFuture<GenerateCLICommandResponse> generateCLICommand(GenerateCLICommandRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GenerateCLICommand").setMethod(HttpMethod.POST).setPathRegex("/api/cli/makeCode").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GenerateCLICommandResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GenerateCLICommandResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetApiDefinition  GetApiDefinitionRequest
     * @return GetApiDefinitionResponse
     */
    @Override
    public CompletableFuture<GetApiDefinitionResponse> getApiDefinition(GetApiDefinitionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetApiDefinition").setMethod(HttpMethod.GET).setPathRegex("/api/definition").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetApiDefinitionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetApiDefinitionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetApiMcpServer  GetApiMcpServerRequest
     * @return GetApiMcpServerResponse
     */
    @Override
    public CompletableFuture<GetApiMcpServerResponse> getApiMcpServer(GetApiMcpServerRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetApiMcpServer").setMethod(HttpMethod.GET).setPathRegex("/apimcpserver").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetApiMcpServerResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetApiMcpServerResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call this API operation to query public information instead of special information, such as the account ownership. Permissions on this API operation cannot be granted to other members.</p>
     * 
     * @param request the request parameters of GetErrorCodeSolutions  GetErrorCodeSolutionsRequest
     * @return GetErrorCodeSolutionsResponse
     */
    @Override
    public CompletableFuture<GetErrorCodeSolutionsResponse> getErrorCodeSolutions(GetErrorCodeSolutionsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetErrorCodeSolutions").setMethod(HttpMethod.GET).setPathRegex("/getErrorCodeSolutions").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetErrorCodeSolutionsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetErrorCodeSolutionsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Permissions on this API cannot be granted to other members.</p>
     * 
     * @param request the request parameters of GetOwnRequestLog  GetOwnRequestLogRequest
     * @return GetOwnRequestLogResponse
     */
    @Override
    public CompletableFuture<GetOwnRequestLogResponse> getOwnRequestLog(GetOwnRequestLogRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetOwnRequestLog").setMethod(HttpMethod.GET).setPathRegex("/getOwnRequestLog").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetOwnRequestLogResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetOwnRequestLogResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetProductEndpoints  GetProductEndpointsRequest
     * @return GetProductEndpointsResponse
     */
    @Override
    public CompletableFuture<GetProductEndpointsResponse> getProductEndpoints(GetProductEndpointsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetProductEndpoints").setMethod(HttpMethod.GET).setPathRegex("/product/endpoints").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetProductEndpointsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetProductEndpointsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can grant permissions to a Resource Access Management (RAM) user or assume a role to query the log of an API call across RAM users or Alibaba Cloud accounts. For more information, see <a href="https://help.aliyun.com/document_detail/2868101.html">Grant permissions to troubleshoot API errors across accounts</a>.</p>
     * 
     * @param request the request parameters of GetRequestLog  GetRequestLogRequest
     * @return GetRequestLogResponse
     */
    @Override
    public CompletableFuture<GetRequestLogResponse> getRequestLog(GetRequestLogRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetRequestLog").setMethod(HttpMethod.GET).setPathRegex("/getRequestLog").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetRequestLogResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetRequestLogResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListApiDefinitions  ListApiDefinitionsRequest
     * @return ListApiDefinitionsResponse
     */
    @Override
    public CompletableFuture<ListApiDefinitionsResponse> listApiDefinitions(ListApiDefinitionsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListApiDefinitions").setMethod(HttpMethod.GET).setPathRegex("/api/definitions").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListApiDefinitionsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListApiDefinitionsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListApiMcpServerSystemTools  ListApiMcpServerSystemToolsRequest
     * @return ListApiMcpServerSystemToolsResponse
     */
    @Override
    public CompletableFuture<ListApiMcpServerSystemToolsResponse> listApiMcpServerSystemTools(ListApiMcpServerSystemToolsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListApiMcpServerSystemTools").setMethod(HttpMethod.GET).setPathRegex("/mcpSystemTools").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListApiMcpServerSystemToolsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListApiMcpServerSystemToolsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListApiMcpServers  ListApiMcpServersRequest
     * @return ListApiMcpServersResponse
     */
    @Override
    public CompletableFuture<ListApiMcpServersResponse> listApiMcpServers(ListApiMcpServersRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListApiMcpServers").setMethod(HttpMethod.GET).setPathRegex("/apimcpservers").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListApiMcpServersResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListApiMcpServersResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateApiMcpServer  UpdateApiMcpServerRequest
     * @return UpdateApiMcpServerResponse
     */
    @Override
    public CompletableFuture<UpdateApiMcpServerResponse> updateApiMcpServer(UpdateApiMcpServerRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateApiMcpServer").setMethod(HttpMethod.PATCH).setPathRegex("/apimcpserver").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateApiMcpServerResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateApiMcpServerResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

}
