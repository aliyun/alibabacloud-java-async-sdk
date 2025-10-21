// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rai20240701;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.rai20240701.models.*;
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
     * @param request the request parameters of BatchContentAsyncDetect  BatchContentAsyncDetectRequest
     * @return BatchContentAsyncDetectResponse
     */
    CompletableFuture<BatchContentAsyncDetectResponse> batchContentAsyncDetect(BatchContentAsyncDetectRequest request);

    /**
     * @param request the request parameters of BatchContentSyncDetect  BatchContentSyncDetectRequest
     * @return BatchContentSyncDetectResponse
     */
    CompletableFuture<BatchContentSyncDetectResponse> batchContentSyncDetect(BatchContentSyncDetectRequest request);

    /**
     * @param request the request parameters of CheckAccount  CheckAccountRequest
     * @return CheckAccountResponse
     */
    CompletableFuture<CheckAccountResponse> checkAccount(CheckAccountRequest request);

    /**
     * @param request the request parameters of ContentAsyncDetect  ContentAsyncDetectRequest
     * @return ContentAsyncDetectResponse
     */
    CompletableFuture<ContentAsyncDetectResponse> contentAsyncDetect(ContentAsyncDetectRequest request);

    /**
     * @param request the request parameters of ContentSyncDetect  ContentSyncDetectRequest
     * @return ContentSyncDetectResponse
     */
    CompletableFuture<ContentSyncDetectResponse> contentSyncDetect(ContentSyncDetectRequest request);

    /**
     * @param request the request parameters of CreateModelInstance  CreateModelInstanceRequest
     * @return CreateModelInstanceResponse
     */
    CompletableFuture<CreateModelInstanceResponse> createModelInstance(CreateModelInstanceRequest request);

    /**
     * @param request the request parameters of CreatePolicy  CreatePolicyRequest
     * @return CreatePolicyResponse
     */
    CompletableFuture<CreatePolicyResponse> createPolicy(CreatePolicyRequest request);

    /**
     * @param request the request parameters of CreateTopic  CreateTopicRequest
     * @return CreateTopicResponse
     */
    CompletableFuture<CreateTopicResponse> createTopic(CreateTopicRequest request);

    /**
     * @param request the request parameters of CreateWordGroup  CreateWordGroupRequest
     * @return CreateWordGroupResponse
     */
    CompletableFuture<CreateWordGroupResponse> createWordGroup(CreateWordGroupRequest request);

    /**
     * @param request the request parameters of DeleteModelInstance  DeleteModelInstanceRequest
     * @return DeleteModelInstanceResponse
     */
    CompletableFuture<DeleteModelInstanceResponse> deleteModelInstance(DeleteModelInstanceRequest request);

    /**
     * @param request the request parameters of DeletePolicy  DeletePolicyRequest
     * @return DeletePolicyResponse
     */
    CompletableFuture<DeletePolicyResponse> deletePolicy(DeletePolicyRequest request);

    /**
     * @param request the request parameters of DeleteTopic  DeleteTopicRequest
     * @return DeleteTopicResponse
     */
    CompletableFuture<DeleteTopicResponse> deleteTopic(DeleteTopicRequest request);

    /**
     * @param request the request parameters of DeleteWordGroup  DeleteWordGroupRequest
     * @return DeleteWordGroupResponse
     */
    CompletableFuture<DeleteWordGroupResponse> deleteWordGroup(DeleteWordGroupRequest request);

    /**
     * @param request the request parameters of GetContentDetectResult  GetContentDetectResultRequest
     * @return GetContentDetectResultResponse
     */
    CompletableFuture<GetContentDetectResultResponse> getContentDetectResult(GetContentDetectResultRequest request);

    /**
     * @param request the request parameters of GetModelInputContentDetectResult  GetModelInputContentDetectResultRequest
     * @return GetModelInputContentDetectResultResponse
     */
    CompletableFuture<GetModelInputContentDetectResultResponse> getModelInputContentDetectResult(GetModelInputContentDetectResultRequest request);

    /**
     * @param request the request parameters of GetModelInstanceInfo  GetModelInstanceInfoRequest
     * @return GetModelInstanceInfoResponse
     */
    CompletableFuture<GetModelInstanceInfoResponse> getModelInstanceInfo(GetModelInstanceInfoRequest request);

    /**
     * @param request the request parameters of GetModelOutputContentDetectResult  GetModelOutputContentDetectResultRequest
     * @return GetModelOutputContentDetectResultResponse
     */
    CompletableFuture<GetModelOutputContentDetectResultResponse> getModelOutputContentDetectResult(GetModelOutputContentDetectResultRequest request);

    /**
     * @param request the request parameters of GetPolicyDefaultOptions  GetPolicyDefaultOptionsRequest
     * @return GetPolicyDefaultOptionsResponse
     */
    CompletableFuture<GetPolicyDefaultOptionsResponse> getPolicyDefaultOptions(GetPolicyDefaultOptionsRequest request);

    /**
     * @param request the request parameters of GetPolicyInfo  GetPolicyInfoRequest
     * @return GetPolicyInfoResponse
     */
    CompletableFuture<GetPolicyInfoResponse> getPolicyInfo(GetPolicyInfoRequest request);

    /**
     * @param request the request parameters of GetTopic  GetTopicRequest
     * @return GetTopicResponse
     */
    CompletableFuture<GetTopicResponse> getTopic(GetTopicRequest request);

    /**
     * @param request the request parameters of GetWordGroup  GetWordGroupRequest
     * @return GetWordGroupResponse
     */
    CompletableFuture<GetWordGroupResponse> getWordGroup(GetWordGroupRequest request);

    /**
     * @param request the request parameters of ListModelCategory  ListModelCategoryRequest
     * @return ListModelCategoryResponse
     */
    CompletableFuture<ListModelCategoryResponse> listModelCategory(ListModelCategoryRequest request);

    /**
     * @param request the request parameters of ListModelInstance  ListModelInstanceRequest
     * @return ListModelInstanceResponse
     */
    CompletableFuture<ListModelInstanceResponse> listModelInstance(ListModelInstanceRequest request);

    /**
     * @param request the request parameters of ListPolicy  ListPolicyRequest
     * @return ListPolicyResponse
     */
    CompletableFuture<ListPolicyResponse> listPolicy(ListPolicyRequest request);

    /**
     * @param request the request parameters of ListTopic  ListTopicRequest
     * @return ListTopicResponse
     */
    CompletableFuture<ListTopicResponse> listTopic(ListTopicRequest request);

    /**
     * @param request the request parameters of ListWordGroup  ListWordGroupRequest
     * @return ListWordGroupResponse
     */
    CompletableFuture<ListWordGroupResponse> listWordGroup(ListWordGroupRequest request);

    /**
     * @param request the request parameters of ModelInputContentAsyncDetect  ModelInputContentAsyncDetectRequest
     * @return ModelInputContentAsyncDetectResponse
     */
    CompletableFuture<ModelInputContentAsyncDetectResponse> modelInputContentAsyncDetect(ModelInputContentAsyncDetectRequest request);

    /**
     * @param request the request parameters of ModelInputContentSyncDetect  ModelInputContentSyncDetectRequest
     * @return ModelInputContentSyncDetectResponse
     */
    CompletableFuture<ModelInputContentSyncDetectResponse> modelInputContentSyncDetect(ModelInputContentSyncDetectRequest request);

    /**
     * @param request the request parameters of ModelOutputContentAsyncDetect  ModelOutputContentAsyncDetectRequest
     * @return ModelOutputContentAsyncDetectResponse
     */
    CompletableFuture<ModelOutputContentAsyncDetectResponse> modelOutputContentAsyncDetect(ModelOutputContentAsyncDetectRequest request);

    /**
     * @param request the request parameters of ModelOutputContentSyncDetect  ModelOutputContentSyncDetectRequest
     * @return ModelOutputContentSyncDetectResponse
     */
    CompletableFuture<ModelOutputContentSyncDetectResponse> modelOutputContentSyncDetect(ModelOutputContentSyncDetectRequest request);

    /**
     * @param request the request parameters of RegisterAccount  RegisterAccountRequest
     * @return RegisterAccountResponse
     */
    CompletableFuture<RegisterAccountResponse> registerAccount(RegisterAccountRequest request);

    /**
     * @param request the request parameters of UpdateModelInstance  UpdateModelInstanceRequest
     * @return UpdateModelInstanceResponse
     */
    CompletableFuture<UpdateModelInstanceResponse> updateModelInstance(UpdateModelInstanceRequest request);

    /**
     * @param request the request parameters of UpdatePolicy  UpdatePolicyRequest
     * @return UpdatePolicyResponse
     */
    CompletableFuture<UpdatePolicyResponse> updatePolicy(UpdatePolicyRequest request);

    /**
     * @param request the request parameters of UpdateTopic  UpdateTopicRequest
     * @return UpdateTopicResponse
     */
    CompletableFuture<UpdateTopicResponse> updateTopic(UpdateTopicRequest request);

    /**
     * @param request the request parameters of UpdateWordGroup  UpdateWordGroupRequest
     * @return UpdateWordGroupResponse
     */
    CompletableFuture<UpdateWordGroupResponse> updateWordGroup(UpdateWordGroupRequest request);

}
