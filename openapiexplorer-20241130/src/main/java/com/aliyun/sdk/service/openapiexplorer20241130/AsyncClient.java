// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.openapiexplorer20241130;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.openapiexplorer20241130.models.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;

import java.util.concurrent.CompletableFuture;

public interface AsyncClient extends SdkAutoCloseable {

    static DefaultAsyncClientBuilder builder() {
        return new DefaultAsyncClientBuilder();
    }

    static AsyncClient create() {
        return builder().build();
    }

    /**
     * @param request the request parameters of ApiMcpServerValidateHcl  ApiMcpServerValidateHclRequest
     * @return ApiMcpServerValidateHclResponse
     */
    CompletableFuture<ApiMcpServerValidateHclResponse> apiMcpServerValidateHcl(ApiMcpServerValidateHclRequest request);

    /**
     * @param request the request parameters of CreateApiMcpServer  CreateApiMcpServerRequest
     * @return CreateApiMcpServerResponse
     */
    CompletableFuture<CreateApiMcpServerResponse> createApiMcpServer(CreateApiMcpServerRequest request);

    /**
     * @param request the request parameters of DeleteApiMcpServer  DeleteApiMcpServerRequest
     * @return DeleteApiMcpServerResponse
     */
    CompletableFuture<DeleteApiMcpServerResponse> deleteApiMcpServer(DeleteApiMcpServerRequest request);

    /**
     * @param request the request parameters of GenerateCLICommand  GenerateCLICommandRequest
     * @return GenerateCLICommandResponse
     */
    CompletableFuture<GenerateCLICommandResponse> generateCLICommand(GenerateCLICommandRequest request);

    /**
     * @param request the request parameters of GetApiDefinition  GetApiDefinitionRequest
     * @return GetApiDefinitionResponse
     */
    CompletableFuture<GetApiDefinitionResponse> getApiDefinition(GetApiDefinitionRequest request);

    /**
     * @param request the request parameters of GetApiMcpServer  GetApiMcpServerRequest
     * @return GetApiMcpServerResponse
     */
    CompletableFuture<GetApiMcpServerResponse> getApiMcpServer(GetApiMcpServerRequest request);

    /**
     * @param request the request parameters of GetApiMcpServerUserConfig  GetApiMcpServerUserConfigRequest
     * @return GetApiMcpServerUserConfigResponse
     */
    CompletableFuture<GetApiMcpServerUserConfigResponse> getApiMcpServerUserConfig(GetApiMcpServerUserConfigRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this API operation to query public information instead of special information, such as the account ownership. Permissions on this API operation cannot be granted to other members.</p>
     * 
     * @param request the request parameters of GetErrorCodeSolutions  GetErrorCodeSolutionsRequest
     * @return GetErrorCodeSolutionsResponse
     */
    CompletableFuture<GetErrorCodeSolutionsResponse> getErrorCodeSolutions(GetErrorCodeSolutionsRequest request);

    /**
     * <b>description</b> :
     * <p>Permissions on this API cannot be granted to other members.</p>
     * 
     * @param request the request parameters of GetOwnRequestLog  GetOwnRequestLogRequest
     * @return GetOwnRequestLogResponse
     */
    CompletableFuture<GetOwnRequestLogResponse> getOwnRequestLog(GetOwnRequestLogRequest request);

    /**
     * @param request the request parameters of GetProductEndpoints  GetProductEndpointsRequest
     * @return GetProductEndpointsResponse
     */
    CompletableFuture<GetProductEndpointsResponse> getProductEndpoints(GetProductEndpointsRequest request);

    /**
     * <b>description</b> :
     * <p>You can grant permissions to a Resource Access Management (RAM) user or assume a role to query the log of an API call across RAM users or Alibaba Cloud accounts. For more information, see <a href="https://help.aliyun.com/document_detail/2868101.html">Grant permissions to troubleshoot API errors across accounts</a>.</p>
     * 
     * @param request the request parameters of GetRequestLog  GetRequestLogRequest
     * @return GetRequestLogResponse
     */
    CompletableFuture<GetRequestLogResponse> getRequestLog(GetRequestLogRequest request);

    /**
     * @param request the request parameters of ListApiDefinitions  ListApiDefinitionsRequest
     * @return ListApiDefinitionsResponse
     */
    CompletableFuture<ListApiDefinitionsResponse> listApiDefinitions(ListApiDefinitionsRequest request);

    /**
     * @param request the request parameters of ListApiMcpServerSystemTools  ListApiMcpServerSystemToolsRequest
     * @return ListApiMcpServerSystemToolsResponse
     */
    CompletableFuture<ListApiMcpServerSystemToolsResponse> listApiMcpServerSystemTools(ListApiMcpServerSystemToolsRequest request);

    /**
     * @param request the request parameters of ListApiMcpServers  ListApiMcpServersRequest
     * @return ListApiMcpServersResponse
     */
    CompletableFuture<ListApiMcpServersResponse> listApiMcpServers(ListApiMcpServersRequest request);

    /**
     * @param request the request parameters of UpdateApiMcpServer  UpdateApiMcpServerRequest
     * @return UpdateApiMcpServerResponse
     */
    CompletableFuture<UpdateApiMcpServerResponse> updateApiMcpServer(UpdateApiMcpServerRequest request);

    /**
     * @param request the request parameters of UpdateApiMcpServerUserConfig  UpdateApiMcpServerUserConfigRequest
     * @return UpdateApiMcpServerUserConfigResponse
     */
    CompletableFuture<UpdateApiMcpServerUserConfigResponse> updateApiMcpServerUserConfig(UpdateApiMcpServerUserConfigRequest request);

}
