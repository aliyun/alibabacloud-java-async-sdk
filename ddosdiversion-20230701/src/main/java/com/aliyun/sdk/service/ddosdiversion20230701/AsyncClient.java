// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddosdiversion20230701;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.ddosdiversion20230701.models.*;
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
     * @param request the request parameters of ConfigNetStatus  ConfigNetStatusRequest
     * @return ConfigNetStatusResponse
     */
    CompletableFuture<ConfigNetStatusResponse> configNetStatus(ConfigNetStatusRequest request);

    /**
     * @param request the request parameters of ListInstance  ListInstanceRequest
     * @return ListInstanceResponse
     */
    CompletableFuture<ListInstanceResponse> listInstance(ListInstanceRequest request);

    /**
     * @param request the request parameters of QueryNetList  QueryNetListRequest
     * @return QueryNetListResponse
     */
    CompletableFuture<QueryNetListResponse> queryNetList(QueryNetListRequest request);

}
