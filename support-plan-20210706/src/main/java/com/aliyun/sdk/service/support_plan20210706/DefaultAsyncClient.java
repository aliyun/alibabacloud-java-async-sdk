// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.support_plan20210706;

import com.aliyun.core.http.*;
import com.aliyun.sdk.service.support_plan20210706.models.*;
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
        this.product = "support-plan";
        this.version = "2021-07-06";
        this.endpointRule = "";
        this.endpointMap = new java.util.HashMap<>();
        this.REQUEST = TeaRequest.create().setProduct(product).setEndpointRule(endpointRule).setEndpointMap(endpointMap).setVersion(version);
    }

    @Override
    public void close() {
        this.handler.close();
    }

    /**
     * @param request the request parameters of AddEnterpriseGroupMemberToTaskGroup  AddEnterpriseGroupMemberToTaskGroupRequest
     * @return AddEnterpriseGroupMemberToTaskGroupResponse
     */
    @Override
    public CompletableFuture<AddEnterpriseGroupMemberToTaskGroupResponse> addEnterpriseGroupMemberToTaskGroup(AddEnterpriseGroupMemberToTaskGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AddEnterpriseGroupMemberToTaskGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddEnterpriseGroupMemberToTaskGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddEnterpriseGroupMemberToTaskGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateTaskOrder  CreateTaskOrderRequest
     * @return CreateTaskOrderResponse
     */
    @Override
    public CompletableFuture<CreateTaskOrderResponse> createTaskOrder(CreateTaskOrderRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateTaskOrder").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateTaskOrderResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateTaskOrderResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListDdTaskOrder  ListDdTaskOrderRequest
     * @return ListDdTaskOrderResponse
     */
    @Override
    public CompletableFuture<ListDdTaskOrderResponse> listDdTaskOrder(ListDdTaskOrderRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListDdTaskOrder").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListDdTaskOrderResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListDdTaskOrderResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListEnterpriseDingtalkGroupCustomerMembers  ListEnterpriseDingtalkGroupCustomerMembersRequest
     * @return ListEnterpriseDingtalkGroupCustomerMembersResponse
     */
    @Override
    public CompletableFuture<ListEnterpriseDingtalkGroupCustomerMembersResponse> listEnterpriseDingtalkGroupCustomerMembers(ListEnterpriseDingtalkGroupCustomerMembersRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListEnterpriseDingtalkGroupCustomerMembers").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListEnterpriseDingtalkGroupCustomerMembersResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListEnterpriseDingtalkGroupCustomerMembersResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListEnterpriseDingtalkGroups  ListEnterpriseDingtalkGroupsRequest
     * @return ListEnterpriseDingtalkGroupsResponse
     */
    @Override
    public CompletableFuture<ListEnterpriseDingtalkGroupsResponse> listEnterpriseDingtalkGroups(ListEnterpriseDingtalkGroupsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListEnterpriseDingtalkGroups").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListEnterpriseDingtalkGroupsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListEnterpriseDingtalkGroupsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListProductByGroup  ListProductByGroupRequest
     * @return ListProductByGroupResponse
     */
    @Override
    public CompletableFuture<ListProductByGroupResponse> listProductByGroup(ListProductByGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListProductByGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListProductByGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListProductByGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

}
