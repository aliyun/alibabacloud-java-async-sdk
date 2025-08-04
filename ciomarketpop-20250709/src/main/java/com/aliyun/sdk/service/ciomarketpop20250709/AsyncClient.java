// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ciomarketpop20250709;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.ciomarketpop20250709.models.*;
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
     * @param request the request parameters of GetEveryOneSellsFormList  GetEveryOneSellsFormListRequest
     * @return GetEveryOneSellsFormListResponse
     */
    CompletableFuture<GetEveryOneSellsFormListResponse> getEveryOneSellsFormList(GetEveryOneSellsFormListRequest request);

    /**
     * @param request the request parameters of PushEveryOneSellMsg  PushEveryOneSellMsgRequest
     * @return PushEveryOneSellMsgResponse
     */
    CompletableFuture<PushEveryOneSellMsgResponse> pushEveryOneSellMsg(PushEveryOneSellMsgRequest request);

}
