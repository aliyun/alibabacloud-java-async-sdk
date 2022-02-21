// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.support_plan20210706;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.support_plan20210706.models.*;
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

    CompletableFuture<CloseTaskOrderResponse> closeTaskOrder(CloseTaskOrderRequest request);

    CompletableFuture<CreateTaskOrderResponse> createTaskOrder(CreateTaskOrderRequest request);

    CompletableFuture<CreateTaskOrderByEventReportResponse> createTaskOrderByEventReport(CreateTaskOrderByEventReportRequest request);

    CompletableFuture<DeleteEnterpriseDingtalkGroupCustomerMemberResponse> deleteEnterpriseDingtalkGroupCustomerMember(DeleteEnterpriseDingtalkGroupCustomerMemberRequest request);

    CompletableFuture<GetEnterpriseDingtalkGroupResponse> getEnterpriseDingtalkGroup(GetEnterpriseDingtalkGroupRequest request);

    CompletableFuture<GetEnterpriseDingtalkGroupCustomerMemberResponse> getEnterpriseDingtalkGroupCustomerMember(GetEnterpriseDingtalkGroupCustomerMemberRequest request);

    CompletableFuture<ListDdTaskOrderResponse> listDdTaskOrder(ListDdTaskOrderRequest request);

    CompletableFuture<ListEnterpriseDingtalkGroupCustomerMembersResponse> listEnterpriseDingtalkGroupCustomerMembers(ListEnterpriseDingtalkGroupCustomerMembersRequest request);

    CompletableFuture<ListEnterpriseDingtalkGroupsResponse> listEnterpriseDingtalkGroups(ListEnterpriseDingtalkGroupsRequest request);

    CompletableFuture<ListProductByGroupResponse> listProductByGroup(ListProductByGroupRequest request);

    CompletableFuture<QueryTaskInfoResponse> queryTaskInfo(QueryTaskInfoRequest request);

    CompletableFuture<ReplyMessageApiResponse> replyMessageApi(ReplyMessageApiRequest request);

    CompletableFuture<RestOpenTaskOrderResponse> restOpenTaskOrder(RestOpenTaskOrderRequest request);

}
