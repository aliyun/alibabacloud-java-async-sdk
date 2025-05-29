// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bailianmodelonchip20240816;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.bailianmodelonchip20240816.models.*;
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
     * @param request the request parameters of CreateChannelSign  CreateChannelSignRequest
     * @return CreateChannelSignResponse
     */
    CompletableFuture<CreateChannelSignResponse> createChannelSign(CreateChannelSignRequest request);

    /**
     * @param request the request parameters of CreateProduct  CreateProductRequest
     * @return CreateProductResponse
     */
    CompletableFuture<CreateProductResponse> createProduct(CreateProductRequest request);

    /**
     * @param request the request parameters of DeleteProduct  DeleteProductRequest
     * @return DeleteProductResponse
     */
    CompletableFuture<DeleteProductResponse> deleteProduct(DeleteProductRequest request);

    /**
     * @param request the request parameters of DeviceRegister  DeviceRegisterRequest
     * @return DeviceRegisterResponse
     */
    CompletableFuture<DeviceRegisterResponse> deviceRegister(DeviceRegisterRequest request);

    /**
     * @param request the request parameters of GetChannelSign  GetChannelSignRequest
     * @return GetChannelSignResponse
     */
    CompletableFuture<GetChannelSignResponse> getChannelSign(GetChannelSignRequest request);

    /**
     * @param request the request parameters of GetQuotaInfo  GetQuotaInfoRequest
     * @return GetQuotaInfoResponse
     */
    CompletableFuture<GetQuotaInfoResponse> getQuotaInfo(GetQuotaInfoRequest request);

    /**
     * @param request the request parameters of GetToken  GetTokenRequest
     * @return GetTokenResponse
     */
    CompletableFuture<GetTokenResponse> getToken(GetTokenRequest request);

    /**
     * @param request the request parameters of HalfLLMAppCall  HalfLLMAppCallRequest
     * @return HalfLLMAppCallResponse
     */
    CompletableFuture<HalfLLMAppCallResponse> halfLLMAppCall(HalfLLMAppCallRequest request);

<ReturnT> CompletableFuture<ReturnT> halfLLMAppCallWithAsyncResponseHandler(HalfLLMAppCallRequest request, AsyncResponseHandler<HalfLLMAppCallResponse, ReturnT> responseHandler);

    ResponseIterable<HalfLLMAppCallResponseBody> halfLLMAppCallWithResponseIterable(HalfLLMAppCallRequest request);

    /**
     * @param request the request parameters of HalfLLMChat  HalfLLMChatRequest
     * @return HalfLLMChatResponse
     */
    CompletableFuture<HalfLLMChatResponse> halfLLMChat(HalfLLMChatRequest request);

<ReturnT> CompletableFuture<ReturnT> halfLLMChatWithAsyncResponseHandler(HalfLLMChatRequest request, AsyncResponseHandler<HalfLLMChatResponse, ReturnT> responseHandler);

    ResponseIterable<HalfLLMChatResponseBody> halfLLMChatWithResponseIterable(HalfLLMChatRequest request);

    /**
     * @param request the request parameters of HalfLLMImageChat  HalfLLMImageChatRequest
     * @return HalfLLMImageChatResponse
     */
    CompletableFuture<HalfLLMImageChatResponse> halfLLMImageChat(HalfLLMImageChatRequest request);

<ReturnT> CompletableFuture<ReturnT> halfLLMImageChatWithAsyncResponseHandler(HalfLLMImageChatRequest request, AsyncResponseHandler<HalfLLMImageChatResponse, ReturnT> responseHandler);

    ResponseIterable<HalfLLMImageChatResponseBody> halfLLMImageChatWithResponseIterable(HalfLLMImageChatRequest request);

    /**
     * @param request the request parameters of HalfLLMImageOcr  HalfLLMImageOcrRequest
     * @return HalfLLMImageOcrResponse
     */
    CompletableFuture<HalfLLMImageOcrResponse> halfLLMImageOcr(HalfLLMImageOcrRequest request);

<ReturnT> CompletableFuture<ReturnT> halfLLMImageOcrWithAsyncResponseHandler(HalfLLMImageOcrRequest request, AsyncResponseHandler<HalfLLMImageOcrResponse, ReturnT> responseHandler);

    ResponseIterable<HalfLLMImageOcrResponseBody> halfLLMImageOcrWithResponseIterable(HalfLLMImageOcrRequest request);

    /**
     * @param request the request parameters of HalfLLMTTSChat  HalfLLMTTSChatRequest
     * @return HalfLLMTTSChatResponse
     */
    CompletableFuture<HalfLLMTTSChatResponse> halfLLMTTSChat(HalfLLMTTSChatRequest request);

<ReturnT> CompletableFuture<ReturnT> halfLLMTTSChatWithAsyncResponseHandler(HalfLLMTTSChatRequest request, AsyncResponseHandler<HalfLLMTTSChatResponse, ReturnT> responseHandler);

    ResponseIterable<HalfLLMTTSChatResponseBody> halfLLMTTSChatWithResponseIterable(HalfLLMTTSChatRequest request);

    /**
     * @param request the request parameters of QueryDevicePage  QueryDevicePageRequest
     * @return QueryDevicePageResponse
     */
    CompletableFuture<QueryDevicePageResponse> queryDevicePage(QueryDevicePageRequest request);

    /**
     * @param request the request parameters of QueryProductPage  QueryProductPageRequest
     * @return QueryProductPageResponse
     */
    CompletableFuture<QueryProductPageResponse> queryProductPage(QueryProductPageRequest request);

    /**
     * @param request the request parameters of QueryProductQuotaPage  QueryProductQuotaPageRequest
     * @return QueryProductQuotaPageResponse
     */
    CompletableFuture<QueryProductQuotaPageResponse> queryProductQuotaPage(QueryProductQuotaPageRequest request);

    /**
     * @param request the request parameters of QueryTokenUsage  QueryTokenUsageRequest
     * @return QueryTokenUsageResponse
     */
    CompletableFuture<QueryTokenUsageResponse> queryTokenUsage(QueryTokenUsageRequest request);

    /**
     * @param request the request parameters of RevokeChannelSign  RevokeChannelSignRequest
     * @return RevokeChannelSignResponse
     */
    CompletableFuture<RevokeChannelSignResponse> revokeChannelSign(RevokeChannelSignRequest request);

    /**
     * @param request the request parameters of UpdateDeviceStatus  UpdateDeviceStatusRequest
     * @return UpdateDeviceStatusResponse
     */
    CompletableFuture<UpdateDeviceStatusResponse> updateDeviceStatus(UpdateDeviceStatusRequest request);

    /**
     * @param request the request parameters of UpdateImageQuota  UpdateImageQuotaRequest
     * @return UpdateImageQuotaResponse
     */
    CompletableFuture<UpdateImageQuotaResponse> updateImageQuota(UpdateImageQuotaRequest request);

    /**
     * @param request the request parameters of UpdateQuota  UpdateQuotaRequest
     * @return UpdateQuotaResponse
     */
    CompletableFuture<UpdateQuotaResponse> updateQuota(UpdateQuotaRequest request);

}
