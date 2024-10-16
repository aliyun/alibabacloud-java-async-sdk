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

    /**
     * @param request the request parameters of CancelByMsgId  CancelByMsgIdRequest
     * @return CancelByMsgIdResponse
     */
    CompletableFuture<CancelByMsgIdResponse> cancelByMsgId(CancelByMsgIdRequest request);

    /**
     * @param request the request parameters of QueryMsgStat  QueryMsgStatRequest
     * @return QueryMsgStatResponse
     */
    CompletableFuture<QueryMsgStatResponse> queryMsgStat(QueryMsgStatRequest request);

    /**
     * @param request the request parameters of SendByAlias  SendByAliasRequest
     * @return SendByAliasResponse
     */
    CompletableFuture<SendByAliasResponse> sendByAlias(SendByAliasRequest request);

    /**
     * @param request the request parameters of SendByAliasFileId  SendByAliasFileIdRequest
     * @return SendByAliasFileIdResponse
     */
    CompletableFuture<SendByAliasFileIdResponse> sendByAliasFileId(SendByAliasFileIdRequest request);

    /**
     * @param request the request parameters of SendByApp  SendByAppRequest
     * @return SendByAppResponse
     */
    CompletableFuture<SendByAppResponse> sendByApp(SendByAppRequest request);

    /**
     * @param request the request parameters of SendByDevice  SendByDeviceRequest
     * @return SendByDeviceResponse
     */
    CompletableFuture<SendByDeviceResponse> sendByDevice(SendByDeviceRequest request);

    /**
     * @param request the request parameters of SendByDeviceFileId  SendByDeviceFileIdRequest
     * @return SendByDeviceFileIdResponse
     */
    CompletableFuture<SendByDeviceFileIdResponse> sendByDeviceFileId(SendByDeviceFileIdRequest request);

    /**
     * @param request the request parameters of SendByFilter  SendByFilterRequest
     * @return SendByFilterResponse
     */
    CompletableFuture<SendByFilterResponse> sendByFilter(SendByFilterRequest request);

    /**
     * @param request the request parameters of UploadDevice  UploadDeviceRequest
     * @return UploadDeviceResponse
     */
    CompletableFuture<UploadDeviceResponse> uploadDevice(UploadDeviceRequest request);

}
