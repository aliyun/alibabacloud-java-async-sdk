// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agenticbas20260630;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.agenticbas20260630.models.*;
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
     * @param request the request parameters of CreatePentestTask  CreatePentestTaskRequest
     * @return CreatePentestTaskResponse
     */
    CompletableFuture<CreatePentestTaskResponse> createPentestTask(CreatePentestTaskRequest request);

    /**
     * @param request the request parameters of DescribePentestReportContent  DescribePentestReportContentRequest
     * @return DescribePentestReportContentResponse
     */
    CompletableFuture<DescribePentestReportContentResponse> describePentestReportContent(DescribePentestReportContentRequest request);

    /**
     * @param request the request parameters of DescribePentestTaskList  DescribePentestTaskListRequest
     * @return DescribePentestTaskListResponse
     */
    CompletableFuture<DescribePentestTaskListResponse> describePentestTaskList(DescribePentestTaskListRequest request);

    /**
     * @param request the request parameters of DescribePentestVulnList  DescribePentestVulnListRequest
     * @return DescribePentestVulnListResponse
     */
    CompletableFuture<DescribePentestVulnListResponse> describePentestVulnList(DescribePentestVulnListRequest request);

}
