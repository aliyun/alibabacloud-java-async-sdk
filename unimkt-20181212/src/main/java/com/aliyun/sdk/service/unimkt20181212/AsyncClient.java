// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.unimkt20181212;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.unimkt20181212.models.*;
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
     * @param request the request parameters of CreateProxyBrandUser  CreateProxyBrandUserRequest
     * @return CreateProxyBrandUserResponse
     */
    CompletableFuture<CreateProxyBrandUserResponse> createProxyBrandUser(CreateProxyBrandUserRequest request);

    /**
     * @param request the request parameters of CreateUnionTask  CreateUnionTaskRequest
     * @return CreateUnionTaskResponse
     */
    CompletableFuture<CreateUnionTaskResponse> createUnionTask(CreateUnionTaskRequest request);

    /**
     * @param request the request parameters of DeleteUnionBrand  DeleteUnionBrandRequest
     * @return DeleteUnionBrandResponse
     */
    CompletableFuture<DeleteUnionBrandResponse> deleteUnionBrand(DeleteUnionBrandRequest request);

    /**
     * @param request the request parameters of EndUnionTask  EndUnionTaskRequest
     * @return EndUnionTaskResponse
     */
    CompletableFuture<EndUnionTaskResponse> endUnionTask(EndUnionTaskRequest request);

    /**
     * @param request the request parameters of ListUnionMediaIndustry  ListUnionMediaIndustryRequest
     * @return ListUnionMediaIndustryResponse
     */
    CompletableFuture<ListUnionMediaIndustryResponse> listUnionMediaIndustry(ListUnionMediaIndustryRequest request);

    /**
     * @param request the request parameters of QueryAvailableBalance  QueryAvailableBalanceRequest
     * @return QueryAvailableBalanceResponse
     */
    CompletableFuture<QueryAvailableBalanceResponse> queryAvailableBalance(QueryAvailableBalanceRequest request);

    /**
     * @param request the request parameters of QueryContentList  QueryContentListRequest
     * @return QueryContentListResponse
     */
    CompletableFuture<QueryContentListResponse> queryContentList(QueryContentListRequest request);

    /**
     * @param request the request parameters of QueryIndustryLabelBag  QueryIndustryLabelBagRequest
     * @return QueryIndustryLabelBagResponse
     */
    CompletableFuture<QueryIndustryLabelBagResponse> queryIndustryLabelBag(QueryIndustryLabelBagRequest request);

    /**
     * @param request the request parameters of QueryTaskBizType  QueryTaskBizTypeRequest
     * @return QueryTaskBizTypeResponse
     */
    CompletableFuture<QueryTaskBizTypeResponse> queryTaskBizType(QueryTaskBizTypeRequest request);

    /**
     * @param request the request parameters of QueryTaskRuleLimit  QueryTaskRuleLimitRequest
     * @return QueryTaskRuleLimitResponse
     */
    CompletableFuture<QueryTaskRuleLimitResponse> queryTaskRuleLimit(QueryTaskRuleLimitRequest request);

    /**
     * @param request the request parameters of QueryUnionChannel  QueryUnionChannelRequest
     * @return QueryUnionChannelResponse
     */
    CompletableFuture<QueryUnionChannelResponse> queryUnionChannel(QueryUnionChannelRequest request);

    /**
     * @param request the request parameters of QueryUnionContentInfo  QueryUnionContentInfoRequest
     * @return QueryUnionContentInfoResponse
     */
    CompletableFuture<QueryUnionContentInfoResponse> queryUnionContentInfo(QueryUnionContentInfoRequest request);

    /**
     * @param request the request parameters of QueryUnionTaskInfo  QueryUnionTaskInfoRequest
     * @return QueryUnionTaskInfoResponse
     */
    CompletableFuture<QueryUnionTaskInfoResponse> queryUnionTaskInfo(QueryUnionTaskInfoRequest request);

    /**
     * @param request the request parameters of QueryUnionTaskList  QueryUnionTaskListRequest
     * @return QueryUnionTaskListResponse
     */
    CompletableFuture<QueryUnionTaskListResponse> queryUnionTaskList(QueryUnionTaskListRequest request);

    /**
     * @param request the request parameters of StartUnionTask  StartUnionTaskRequest
     * @return StartUnionTaskResponse
     */
    CompletableFuture<StartUnionTaskResponse> startUnionTask(StartUnionTaskRequest request);

    /**
     * @param request the request parameters of StopUnionTask  StopUnionTaskRequest
     * @return StopUnionTaskResponse
     */
    CompletableFuture<StopUnionTaskResponse> stopUnionTask(StopUnionTaskRequest request);

    /**
     * @param request the request parameters of UpdateUnionTask  UpdateUnionTaskRequest
     * @return UpdateUnionTaskResponse
     */
    CompletableFuture<UpdateUnionTaskResponse> updateUnionTask(UpdateUnionTaskRequest request);

}
