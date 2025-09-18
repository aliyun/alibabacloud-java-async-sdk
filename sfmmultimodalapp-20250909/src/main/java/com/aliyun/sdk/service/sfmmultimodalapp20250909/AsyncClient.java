// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sfmmultimodalapp20250909;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.sfmmultimodalapp20250909.models.*;
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
     * @param request the request parameters of CreateCommand  CreateCommandRequest
     * @return CreateCommandResponse
     */
    CompletableFuture<CreateCommandResponse> createCommand(CreateCommandRequest request);

    /**
     * @param request the request parameters of CreateMmApp  CreateMmAppRequest
     * @return CreateMmAppResponse
     */
    CompletableFuture<CreateMmAppResponse> createMmApp(CreateMmAppRequest request);

    /**
     * @param request the request parameters of DeleteCommand  DeleteCommandRequest
     * @return DeleteCommandResponse
     */
    CompletableFuture<DeleteCommandResponse> deleteCommand(DeleteCommandRequest request);

    /**
     * @param request the request parameters of DeleteMmApp  DeleteMmAppRequest
     * @return DeleteMmAppResponse
     */
    CompletableFuture<DeleteMmAppResponse> deleteMmApp(DeleteMmAppRequest request);

    /**
     * @param request the request parameters of DescribeCommand  DescribeCommandRequest
     * @return DescribeCommandResponse
     */
    CompletableFuture<DescribeCommandResponse> describeCommand(DescribeCommandRequest request);

    /**
     * @param request the request parameters of DescribeMmApp  DescribeMmAppRequest
     * @return DescribeMmAppResponse
     */
    CompletableFuture<DescribeMmAppResponse> describeMmApp(DescribeMmAppRequest request);

    /**
     * @param request the request parameters of ListCommand  ListCommandRequest
     * @return ListCommandResponse
     */
    CompletableFuture<ListCommandResponse> listCommand(ListCommandRequest request);

    /**
     * @param request the request parameters of ListMmApp  ListMmAppRequest
     * @return ListMmAppResponse
     */
    CompletableFuture<ListMmAppResponse> listMmApp(ListMmAppRequest request);

    /**
     * @param request the request parameters of ListPublishedMmApp  ListPublishedMmAppRequest
     * @return ListPublishedMmAppResponse
     */
    CompletableFuture<ListPublishedMmAppResponse> listPublishedMmApp(ListPublishedMmAppRequest request);

    /**
     * @param request the request parameters of PublishMmApp  PublishMmAppRequest
     * @return PublishMmAppResponse
     */
    CompletableFuture<PublishMmAppResponse> publishMmApp(PublishMmAppRequest request);

    /**
     * @param request the request parameters of UpdateCommand  UpdateCommandRequest
     * @return UpdateCommandResponse
     */
    CompletableFuture<UpdateCommandResponse> updateCommand(UpdateCommandRequest request);

    /**
     * @param request the request parameters of UpdateMmApp  UpdateMmAppRequest
     * @return UpdateMmAppResponse
     */
    CompletableFuture<UpdateMmAppResponse> updateMmApp(UpdateMmAppRequest request);

}
