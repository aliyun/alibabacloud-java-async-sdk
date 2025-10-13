// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.metaspace20221014;

import com.aliyun.core.http.*;
import com.aliyun.sdk.service.metaspace20221014.models.*;
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
        this.product = "metaspace";
        this.version = "2022-10-14";
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
     * <li>该API为内部使用，主要用于协同者发起流协同。</li>
     * <li><code>DependOnMainStream</code>参数指定了是否依赖主流的状态来建立或断开协同流。</li>
     * <li>当<code>InitiatorType</code>设置为强制协同类型时（如<code>ADMIN_INITIATE_FORCE</code>或<code>COORDINATOR_INITIATE_FORCE</code>），将返回一个<code>CoordinateTicket</code>。</li>
     * <li>协同资源列表<code>CoordinationResourceCandidates</code>中必须包含至少一项资源信息，并且所有提供的资源ID、类型和地区等信息需准确无误。</li>
     * <li>确保<code>OwnerAliUid</code>与协同者的租户ID相同，否则可能无法成功发起协同请求。</li>
     * <li>对于AD用户，请务必填写<code>AdDomainName</code>字段。</li>
     * </ul>
     * 
     * @param request the request parameters of ApplyCoordinationForCoordinator  ApplyCoordinationForCoordinatorRequest
     * @return ApplyCoordinationForCoordinatorResponse
     */
    @Override
    public CompletableFuture<ApplyCoordinationForCoordinatorResponse> applyCoordinationForCoordinator(ApplyCoordinationForCoordinatorRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ApplyCoordinationForCoordinator").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ApplyCoordinationForCoordinatorResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ApplyCoordinationForCoordinatorResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CancelCoordination  CancelCoordinationRequest
     * @return CancelCoordinationResponse
     */
    @Override
    public CompletableFuture<CancelCoordinationResponse> cancelCoordination(CancelCoordinationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CancelCoordination").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CancelCoordinationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CancelCoordinationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetCoordinationTicket  GetCoordinationTicketRequest
     * @return GetCoordinationTicketResponse
     */
    @Override
    public CompletableFuture<GetCoordinationTicketResponse> getCoordinationTicket(GetCoordinationTicketRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetCoordinationTicket").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetCoordinationTicketResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetCoordinationTicketResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

}
