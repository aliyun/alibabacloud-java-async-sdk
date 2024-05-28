// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.antirisk20221128;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.antirisk20221128.models.*;
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

    CompletableFuture<GetRealTimeRiskInfoResponse> getRealTimeRiskInfo(GetRealTimeRiskInfoRequest request);

    CompletableFuture<GetZidTagByAtokenResponse> getZidTagByAtoken(GetZidTagByAtokenRequest request);

    CompletableFuture<GetZidTagScoreByAtokenResponse> getZidTagScoreByAtoken(GetZidTagScoreByAtokenRequest request);

    CompletableFuture<ListChannelRiskDetailsResponse> listChannelRiskDetails(ListChannelRiskDetailsRequest request);

    CompletableFuture<ListUninstallDetailResponse> listUninstallDetail(ListUninstallDetailRequest request);

}
