// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iqs20241121;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.iqs20241121.models.*;
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
     * @param request the request parameters of ExpandSearchExpiredTime  ExpandSearchExpiredTimeRequest
     * @return ExpandSearchExpiredTimeResponse
     */
    CompletableFuture<ExpandSearchExpiredTimeResponse> expandSearchExpiredTime(ExpandSearchExpiredTimeRequest request);

    /**
     * @param request the request parameters of ManageSearchAccountInfo  ManageSearchAccountInfoRequest
     * @return ManageSearchAccountInfoResponse
     */
    CompletableFuture<ManageSearchAccountInfoResponse> manageSearchAccountInfo(ManageSearchAccountInfoRequest request);

}
