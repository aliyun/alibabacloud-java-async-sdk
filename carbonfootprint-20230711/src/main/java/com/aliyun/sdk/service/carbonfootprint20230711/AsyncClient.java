// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.carbonfootprint20230711;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.carbonfootprint20230711.models.*;
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

    CompletableFuture<AllowResponse> allow(AllowRequest request);

    CompletableFuture<GetSummaryDataResponse> getSummaryData(GetSummaryDataRequest request);

    CompletableFuture<QueryCarbonTrackResponse> queryCarbonTrack(QueryCarbonTrackRequest request);

    CompletableFuture<QueryMultiAccountCarbonTrackResponse> queryMultiAccountCarbonTrack(QueryMultiAccountCarbonTrackRequest request);

    CompletableFuture<VerifyResponse> verify(VerifyRequest request);

}
