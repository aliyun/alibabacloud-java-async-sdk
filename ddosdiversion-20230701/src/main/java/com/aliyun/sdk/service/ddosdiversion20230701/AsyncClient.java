// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddosdiversion20230701;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.ddosdiversion20230701.models.*;
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

    CompletableFuture<ConfigNetStatusResponse> configNetStatus(ConfigNetStatusRequest request);

    CompletableFuture<ListInstanceResponse> listInstance(ListInstanceRequest request);

    CompletableFuture<QueryNetListResponse> queryNetList(QueryNetListRequest request);

}
