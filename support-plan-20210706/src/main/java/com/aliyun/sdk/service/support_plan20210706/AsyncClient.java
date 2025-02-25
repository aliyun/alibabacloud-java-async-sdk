// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.support_plan20210706;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.support_plan20210706.models.*;
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
     * @param request the request parameters of AddEnterpriseGroupMemberToTaskGroup  AddEnterpriseGroupMemberToTaskGroupRequest
     * @return AddEnterpriseGroupMemberToTaskGroupResponse
     */
    CompletableFuture<AddEnterpriseGroupMemberToTaskGroupResponse> addEnterpriseGroupMemberToTaskGroup(AddEnterpriseGroupMemberToTaskGroupRequest request);

    /**
     * @param request the request parameters of CreateTaskOrder  CreateTaskOrderRequest
     * @return CreateTaskOrderResponse
     */
    CompletableFuture<CreateTaskOrderResponse> createTaskOrder(CreateTaskOrderRequest request);

    /**
     * @param request the request parameters of ListDdTaskOrder  ListDdTaskOrderRequest
     * @return ListDdTaskOrderResponse
     */
    CompletableFuture<ListDdTaskOrderResponse> listDdTaskOrder(ListDdTaskOrderRequest request);

    /**
     * @param request the request parameters of ListEnterpriseDingtalkGroupCustomerMembers  ListEnterpriseDingtalkGroupCustomerMembersRequest
     * @return ListEnterpriseDingtalkGroupCustomerMembersResponse
     */
    CompletableFuture<ListEnterpriseDingtalkGroupCustomerMembersResponse> listEnterpriseDingtalkGroupCustomerMembers(ListEnterpriseDingtalkGroupCustomerMembersRequest request);

    /**
     * @param request the request parameters of ListEnterpriseDingtalkGroups  ListEnterpriseDingtalkGroupsRequest
     * @return ListEnterpriseDingtalkGroupsResponse
     */
    CompletableFuture<ListEnterpriseDingtalkGroupsResponse> listEnterpriseDingtalkGroups(ListEnterpriseDingtalkGroupsRequest request);

    /**
     * @param request the request parameters of ListProductByGroup  ListProductByGroupRequest
     * @return ListProductByGroupResponse
     */
    CompletableFuture<ListProductByGroupResponse> listProductByGroup(ListProductByGroupRequest request);

}
