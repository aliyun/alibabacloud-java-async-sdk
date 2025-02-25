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
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <ul>
     * <li>本接口支持通过POST或GET方法调用。</li>
     * <li><code>Accept-Language</code>请求头必须设置为<code>zh-CN</code>或<code>en-US</code>之一，用于指定返回结果的语言类型。</li>
     * <li>错误码格式需符合特定规则，特别是针对OSS的错误码应遵循正则表达式<code>[0-9]{4}-[0-9]{8}</code>。</li>
     * <li>当前实现中未使用<code>maxResults</code>和<code>nextToken</code>参数。</li>
     * <li>如果请求失败，将根据不同的错误情况返回相应的错误代码及描述信息。</li>
     * </ul>
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
     * <h2>请求说明</h2>
     * <ul>
     * <li>本接口主要用于帮助用户通过提供具体的<code>apiRequestId</code>来获取相关API请求的详细日志信息。</li>
     * <li><code>apiRequestId</code>必须是大写形式的UUID，并且应确保该ID确实来自于您之前对某个OpenAPI的实际调用。</li>
     * <li>如果提供的<code>apiRequestId</code>无效或者没有找到对应的日志记录，系统将返回相应的错误提示。</li>
     * <li>在使用此接口时，请注意检查您的网络环境以及权限设置，以保证能够顺利访问到所需资源。</li>
     * </ul>
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
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <ul>
     * <li>本接口主要用于帮助用户通过提供具体的<code>apiRequestId</code>来获取相关API请求的详细日志信息。</li>
     * <li><code>apiRequestId</code>必须是大写形式的UUID，并且应确保该ID确实来自于您之前对某个OpenAPI的实际调用。</li>
     * <li>如果提供的<code>apiRequestId</code>无效或者没有找到对应的日志记录，系统将返回相应的错误提示。</li>
     * <li>在使用此接口时，请注意检查您的网络环境以及权限设置，以保证能够顺利访问到所需资源。</li>
     * </ul>
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

}
