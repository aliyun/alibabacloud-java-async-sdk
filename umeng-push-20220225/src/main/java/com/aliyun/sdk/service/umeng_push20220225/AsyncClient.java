// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.umeng_push20220225;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.umeng_push20220225.models.*;
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

    CompletableFuture<CancelByMsgIdResponse> cancelByMsgId(CancelByMsgIdRequest request);

    CompletableFuture<QueryMsgStatResponse> queryMsgStat(QueryMsgStatRequest request);

    CompletableFuture<SendByAliasResponse> sendByAlias(SendByAliasRequest request);

    CompletableFuture<SendByAliasFileIdResponse> sendByAliasFileId(SendByAliasFileIdRequest request);

    CompletableFuture<SendByAppResponse> sendByApp(SendByAppRequest request);

    CompletableFuture<SendByDeviceResponse> sendByDevice(SendByDeviceRequest request);

    CompletableFuture<SendByDeviceFileIdResponse> sendByDeviceFileId(SendByDeviceFileIdRequest request);

    CompletableFuture<SendByFilterResponse> sendByFilter(SendByFilterRequest request);

    CompletableFuture<UploadDeviceResponse> uploadDevice(UploadDeviceRequest request);

}
