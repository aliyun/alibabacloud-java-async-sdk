// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.marketplaceintl20221230;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.marketplaceintl20221230.models.*;
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
     * @param request the request parameters of NoticeInstanceUser  NoticeInstanceUserRequest
     * @return NoticeInstanceUserResponse
     */
    CompletableFuture<NoticeInstanceUserResponse> noticeInstanceUser(NoticeInstanceUserRequest request);

    /**
     * @param request the request parameters of PushMeteringData  PushMeteringDataRequest
     * @return PushMeteringDataResponse
     */
    CompletableFuture<PushMeteringDataResponse> pushMeteringData(PushMeteringDataRequest request);

}
