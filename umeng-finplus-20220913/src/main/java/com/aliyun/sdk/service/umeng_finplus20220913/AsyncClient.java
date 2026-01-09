// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.umeng_finplus20220913;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.umeng_finplus20220913.models.*;
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
     * @param request the request parameters of BuildStsAK  BuildStsAKRequest
     * @return BuildStsAKResponse
     */
    CompletableFuture<BuildStsAKResponse> buildStsAK(BuildStsAKRequest request);

    /**
     * @param request the request parameters of BuildStsAK2  BuildStsAK2Request
     * @return BuildStsAK2Response
     */
    CompletableFuture<BuildStsAK2Response> buildStsAK2(BuildStsAK2Request request);

    /**
     * @param request the request parameters of CancelTask  CancelTaskRequest
     * @return CancelTaskResponse
     */
    CompletableFuture<CancelTaskResponse> cancelTask(CancelTaskRequest request);

    /**
     * @param request the request parameters of CancelTask2  CancelTask2Request
     * @return CancelTask2Response
     */
    CompletableFuture<CancelTask2Response> cancelTask2(CancelTask2Request request);

    /**
     * @param request the request parameters of CreateComputeTask  CreateComputeTaskRequest
     * @return CreateComputeTaskResponse
     */
    CompletableFuture<CreateComputeTaskResponse> createComputeTask(CreateComputeTaskRequest request);

    /**
     * @param request the request parameters of CreateComputeTask2  CreateComputeTask2Request
     * @return CreateComputeTask2Response
     */
    CompletableFuture<CreateComputeTask2Response> createComputeTask2(CreateComputeTask2Request request);

    /**
     * @param request the request parameters of CreateDataSet  CreateDataSetRequest
     * @return CreateDataSetResponse
     */
    CompletableFuture<CreateDataSetResponse> createDataSet(CreateDataSetRequest request);

    /**
     * @param request the request parameters of CreateDataSet2  CreateDataSet2Request
     * @return CreateDataSet2Response
     */
    CompletableFuture<CreateDataSet2Response> createDataSet2(CreateDataSet2Request request);

    /**
     * @param request the request parameters of CreateInstanceTask  CreateInstanceTaskRequest
     * @return CreateInstanceTaskResponse
     */
    CompletableFuture<CreateInstanceTaskResponse> createInstanceTask(CreateInstanceTaskRequest request);

    /**
     * @param request the request parameters of CreateKnowLedge  CreateKnowLedgeRequest
     * @return CreateKnowLedgeResponse
     */
    CompletableFuture<CreateKnowLedgeResponse> createKnowLedge(CreateKnowLedgeRequest request);

    /**
     * @param request the request parameters of EncryptInvoke  EncryptInvokeRequest
     * @return EncryptInvokeResponse
     */
    CompletableFuture<EncryptInvokeResponse> encryptInvoke(EncryptInvokeRequest request);

    /**
     * @param request the request parameters of GetCrowdDataset  GetCrowdDatasetRequest
     * @return GetCrowdDatasetResponse
     */
    CompletableFuture<GetCrowdDatasetResponse> getCrowdDataset(GetCrowdDatasetRequest request);

    /**
     * @param request the request parameters of GetKnowledgeData  GetKnowledgeDataRequest
     * @return GetKnowledgeDataResponse
     */
    CompletableFuture<GetKnowledgeDataResponse> getKnowledgeData(GetKnowledgeDataRequest request);

    /**
     * @param request the request parameters of GetYzdInstanceTaskResult  GetYzdInstanceTaskResultRequest
     * @return GetYzdInstanceTaskResultResponse
     */
    CompletableFuture<GetYzdInstanceTaskResultResponse> getYzdInstanceTaskResult(GetYzdInstanceTaskResultRequest request);

    /**
     * @param request the request parameters of GetYzdStsAK  GetYzdStsAKRequest
     * @return GetYzdStsAKResponse
     */
    CompletableFuture<GetYzdStsAKResponse> getYzdStsAK(GetYzdStsAKRequest request);

    /**
     * @param request the request parameters of ListComputeTask  ListComputeTaskRequest
     * @return ListComputeTaskResponse
     */
    CompletableFuture<ListComputeTaskResponse> listComputeTask(ListComputeTaskRequest request);

    /**
     * @param request the request parameters of ListComputeTask2  ListComputeTask2Request
     * @return ListComputeTask2Response
     */
    CompletableFuture<ListComputeTask2Response> listComputeTask2(ListComputeTask2Request request);

    /**
     * @param request the request parameters of ListDataSet  ListDataSetRequest
     * @return ListDataSetResponse
     */
    CompletableFuture<ListDataSetResponse> listDataSet(ListDataSetRequest request);

    /**
     * @param request the request parameters of ListDataSet2  ListDataSet2Request
     * @return ListDataSet2Response
     */
    CompletableFuture<ListDataSet2Response> listDataSet2(ListDataSet2Request request);

    /**
     * @param request the request parameters of RemoveDataSet  RemoveDataSetRequest
     * @return RemoveDataSetResponse
     */
    CompletableFuture<RemoveDataSetResponse> removeDataSet(RemoveDataSetRequest request);

    /**
     * @param request the request parameters of RemoveDataSet2  RemoveDataSet2Request
     * @return RemoveDataSet2Response
     */
    CompletableFuture<RemoveDataSet2Response> removeDataSet2(RemoveDataSet2Request request);

    /**
     * @param request the request parameters of SaveCrowdDatasetAndBindingDataset  SaveCrowdDatasetAndBindingDatasetRequest
     * @return SaveCrowdDatasetAndBindingDatasetResponse
     */
    CompletableFuture<SaveCrowdDatasetAndBindingDatasetResponse> saveCrowdDatasetAndBindingDataset(SaveCrowdDatasetAndBindingDatasetRequest request);

    /**
     * @param request the request parameters of SelectComputeTask  SelectComputeTaskRequest
     * @return SelectComputeTaskResponse
     */
    CompletableFuture<SelectComputeTaskResponse> selectComputeTask(SelectComputeTaskRequest request);

    /**
     * @param request the request parameters of SelectComputeTask2  SelectComputeTask2Request
     * @return SelectComputeTask2Response
     */
    CompletableFuture<SelectComputeTask2Response> selectComputeTask2(SelectComputeTask2Request request);

    /**
     * @param request the request parameters of SelectDataSet  SelectDataSetRequest
     * @return SelectDataSetResponse
     */
    CompletableFuture<SelectDataSetResponse> selectDataSet(SelectDataSetRequest request);

    /**
     * @param request the request parameters of SelectDataSet2  SelectDataSet2Request
     * @return SelectDataSet2Response
     */
    CompletableFuture<SelectDataSet2Response> selectDataSet2(SelectDataSet2Request request);

    /**
     * @param request the request parameters of SubmitDataSetTask  SubmitDataSetTaskRequest
     * @return SubmitDataSetTaskResponse
     */
    CompletableFuture<SubmitDataSetTaskResponse> submitDataSetTask(SubmitDataSetTaskRequest request);

    /**
     * @param request the request parameters of SubmitDataSetTask2  SubmitDataSetTask2Request
     * @return SubmitDataSetTask2Response
     */
    CompletableFuture<SubmitDataSetTask2Response> submitDataSetTask2(SubmitDataSetTask2Request request);

    /**
     * @param request the request parameters of ValidateKnowLedge  ValidateKnowLedgeRequest
     * @return ValidateKnowLedgeResponse
     */
    CompletableFuture<ValidateKnowLedgeResponse> validateKnowLedge(ValidateKnowLedgeRequest request);

}
