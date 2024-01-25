// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.umeng_finplus20211130;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.umeng_finplus20211130.models.*;
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

    CompletableFuture<CancelComputeTaskByBcIdResponse> cancelComputeTaskByBcId(CancelComputeTaskByBcIdRequest request);

    CompletableFuture<CreateComputeTaskByDataSetIdResponse> createComputeTaskByDataSetId(CreateComputeTaskByDataSetIdRequest request);

    CompletableFuture<CreateComputeTaskByMultiDataSetIdResponse> createComputeTaskByMultiDataSetId(CreateComputeTaskByMultiDataSetIdRequest request);

    CompletableFuture<GetAvailableDataSetListResponse> getAvailableDataSetList(GetAvailableDataSetListRequest request);

    CompletableFuture<GetComputeResultResponse> getComputeResult(GetComputeResultRequest request);

    CompletableFuture<GetDataSetStatusResponse> getDataSetStatus(GetDataSetStatusRequest request);

    CompletableFuture<GetDataSetStsAKResponse> getDataSetStsAK(GetDataSetStsAKRequest request);

    CompletableFuture<SubmitDataSetTaskResponse> submitDataSetTask(SubmitDataSetTaskRequest request);

    CompletableFuture<CancelYydTaskByBcIdResponse> cancelYydTaskByBcId(CancelYydTaskByBcIdRequest request);

    CompletableFuture<CreateYydComputeTaskResponse> createYydComputeTask(CreateYydComputeTaskRequest request);

    CompletableFuture<CreateYydDataSetResponse> createYydDataSet(CreateYydDataSetRequest request);

    CompletableFuture<ListYydComputeTaskListResponse> listYydComputeTaskList(ListYydComputeTaskListRequest request);

    CompletableFuture<ListYydDataSetResponse> listYydDataSet(ListYydDataSetRequest request);

}
