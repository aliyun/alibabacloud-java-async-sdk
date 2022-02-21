// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dysmsapi20170525;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.dysmsapi20170525.models.*;
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

    CompletableFuture<AddShortUrlResponse> addShortUrl(AddShortUrlRequest request);

    CompletableFuture<AddSmsSignResponse> addSmsSign(AddSmsSignRequest request);

    CompletableFuture<AddSmsTemplateResponse> addSmsTemplate(AddSmsTemplateRequest request);

    CompletableFuture<DeleteShortUrlResponse> deleteShortUrl(DeleteShortUrlRequest request);

    CompletableFuture<DeleteSmsSignResponse> deleteSmsSign(DeleteSmsSignRequest request);

    CompletableFuture<DeleteSmsTemplateResponse> deleteSmsTemplate(DeleteSmsTemplateRequest request);

    CompletableFuture<ListTagResourcesResponse> listTagResources(ListTagResourcesRequest request);

    CompletableFuture<ModifySmsSignResponse> modifySmsSign(ModifySmsSignRequest request);

    CompletableFuture<ModifySmsTemplateResponse> modifySmsTemplate(ModifySmsTemplateRequest request);

    CompletableFuture<QuerySendDetailsResponse> querySendDetails(QuerySendDetailsRequest request);

    CompletableFuture<QuerySendStatisticsResponse> querySendStatistics(QuerySendStatisticsRequest request);

    CompletableFuture<QueryShortUrlResponse> queryShortUrl(QueryShortUrlRequest request);

    CompletableFuture<QuerySmsSignResponse> querySmsSign(QuerySmsSignRequest request);

    CompletableFuture<QuerySmsSignListResponse> querySmsSignList(QuerySmsSignListRequest request);

    CompletableFuture<QuerySmsTemplateResponse> querySmsTemplate(QuerySmsTemplateRequest request);

    CompletableFuture<QuerySmsTemplateListResponse> querySmsTemplateList(QuerySmsTemplateListRequest request);

    CompletableFuture<SendBatchSmsResponse> sendBatchSms(SendBatchSmsRequest request);

    CompletableFuture<SendSmsResponse> sendSms(SendSmsRequest request);

    CompletableFuture<TagResourcesResponse> tagResources(TagResourcesRequest request);

    CompletableFuture<UntagResourcesResponse> untagResources(UntagResourcesRequest request);

}
