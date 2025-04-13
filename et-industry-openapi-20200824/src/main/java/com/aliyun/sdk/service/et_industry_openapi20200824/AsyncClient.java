// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.et_industry_openapi20200824;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.et_industry_openapi20200824.models.*;
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
     * @param request the request parameters of GetMqttConnect  GetMqttConnectRequest
     * @return GetMqttConnectResponse
     */
    CompletableFuture<GetMqttConnectResponse> getMqttConnect(GetMqttConnectRequest request);

    /**
     * @param request the request parameters of GetNonce  GetNonceRequest
     * @return GetNonceResponse
     */
    CompletableFuture<GetNonceResponse> getNonce(GetNonceRequest request);

    /**
     * @param request the request parameters of ListMeasurePointListByNodeCodePage  ListMeasurePointListByNodeCodePageRequest
     * @return ListMeasurePointListByNodeCodePageResponse
     */
    CompletableFuture<ListMeasurePointListByNodeCodePageResponse> listMeasurePointListByNodeCodePage(ListMeasurePointListByNodeCodePageRequest request);

    /**
     * @param request the request parameters of MultiFieldBatchUpload  MultiFieldBatchUploadRequest
     * @return MultiFieldBatchUploadResponse
     */
    CompletableFuture<MultiFieldBatchUploadResponse> multiFieldBatchUpload(MultiFieldBatchUploadRequest request);

    /**
     * @param request the request parameters of MultiSourcePointBatchUpload  MultiSourcePointBatchUploadRequest
     * @return MultiSourcePointBatchUploadResponse
     */
    CompletableFuture<MultiSourcePointBatchUploadResponse> multiSourcePointBatchUpload(MultiSourcePointBatchUploadRequest request);

    /**
     * @param request the request parameters of QueryFieldLatestBySourcePoint  QueryFieldLatestBySourcePointRequest
     * @return QueryFieldLatestBySourcePointResponse
     */
    CompletableFuture<QueryFieldLatestBySourcePointResponse> queryFieldLatestBySourcePoint(QueryFieldLatestBySourcePointRequest request);

    /**
     * @param request the request parameters of QueryIndustryDeviceData  QueryIndustryDeviceDataRequest
     * @return QueryIndustryDeviceDataResponse
     */
    CompletableFuture<QueryIndustryDeviceDataResponse> queryIndustryDeviceData(QueryIndustryDeviceDataRequest request);

    /**
     * @param request the request parameters of QueryIndustryDeviceLimitsData  QueryIndustryDeviceLimitsDataRequest
     * @return QueryIndustryDeviceLimitsDataResponse
     */
    CompletableFuture<QueryIndustryDeviceLimitsDataResponse> queryIndustryDeviceLimitsData(QueryIndustryDeviceLimitsDataRequest request);

    /**
     * @param request the request parameters of QueryIndustryDeviceStatusData  QueryIndustryDeviceStatusDataRequest
     * @return QueryIndustryDeviceStatusDataResponse
     */
    CompletableFuture<QueryIndustryDeviceStatusDataResponse> queryIndustryDeviceStatusData(QueryIndustryDeviceStatusDataRequest request);

    /**
     * @param request the request parameters of SourcePointBatch  SourcePointBatchRequest
     * @return SourcePointBatchResponse
     */
    CompletableFuture<SourcePointBatchResponse> sourcePointBatch(SourcePointBatchRequest request);

    /**
     * @param request the request parameters of UploadIndustryDeviceData  UploadIndustryDeviceDataRequest
     * @return UploadIndustryDeviceDataResponse
     */
    CompletableFuture<UploadIndustryDeviceDataResponse> uploadIndustryDeviceData(UploadIndustryDeviceDataRequest request);

}
