// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.videoenhan20200320;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.videoenhan20200320.models.*;
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

    CompletableFuture<DeleteFaceVideoTemplateResponse> deleteFaceVideoTemplate(DeleteFaceVideoTemplateRequest request);

    CompletableFuture<GetAsyncJobResultResponse> getAsyncJobResult(GetAsyncJobResultRequest request);

    CompletableFuture<QueryFaceVideoTemplateResponse> queryFaceVideoTemplate(QueryFaceVideoTemplateRequest request);

}
