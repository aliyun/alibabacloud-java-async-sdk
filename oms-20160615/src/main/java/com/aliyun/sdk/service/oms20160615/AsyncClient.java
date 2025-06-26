// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oms20160615;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.oms20160615.models.*;
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
     * @param request the request parameters of DeleteDomainPart  DeleteDomainPartRequest
     * @return DeleteDomainPartResponse
     */
    CompletableFuture<DeleteDomainPartResponse> deleteDomainPart(DeleteDomainPartRequest request);

    /**
     * @param request the request parameters of DeleteDomainPartByProxy  DeleteDomainPartByProxyRequest
     * @return DeleteDomainPartByProxyResponse
     */
    CompletableFuture<DeleteDomainPartByProxyResponse> deleteDomainPartByProxy(DeleteDomainPartByProxyRequest request);

    /**
     * @param request the request parameters of DeleteMeasureData  DeleteMeasureDataRequest
     * @return DeleteMeasureDataResponse
     */
    CompletableFuture<DeleteMeasureDataResponse> deleteMeasureData(DeleteMeasureDataRequest request);

    /**
     * @param request the request parameters of GetDomainPart  GetDomainPartRequest
     * @return GetDomainPartResponse
     */
    CompletableFuture<GetDomainPartResponse> getDomainPart(GetDomainPartRequest request);

    /**
     * @param request the request parameters of GetDomainPartByProxy  GetDomainPartByProxyRequest
     * @return GetDomainPartByProxyResponse
     */
    CompletableFuture<GetDomainPartByProxyResponse> getDomainPartByProxy(GetDomainPartByProxyRequest request);

    /**
     * @param request the request parameters of GetIncrementMeasureDataByProxy  GetIncrementMeasureDataByProxyRequest
     * @return GetIncrementMeasureDataByProxyResponse
     */
    CompletableFuture<GetIncrementMeasureDataByProxyResponse> getIncrementMeasureDataByProxy(GetIncrementMeasureDataByProxyRequest request);

    /**
     * @param request the request parameters of GetMeasureData  GetMeasureDataRequest
     * @return GetMeasureDataResponse
     */
    CompletableFuture<GetMeasureDataResponse> getMeasureData(GetMeasureDataRequest request);

    /**
     * @param request the request parameters of GetReadyFlag  GetReadyFlagRequest
     * @return GetReadyFlagResponse
     */
    CompletableFuture<GetReadyFlagResponse> getReadyFlag(GetReadyFlagRequest request);

    /**
     * @param request the request parameters of GetReadyFlagByProxy  GetReadyFlagByProxyRequest
     * @return GetReadyFlagByProxyResponse
     */
    CompletableFuture<GetReadyFlagByProxyResponse> getReadyFlagByProxy(GetReadyFlagByProxyRequest request);

    /**
     * @param request the request parameters of PutDomainPart  PutDomainPartRequest
     * @return PutDomainPartResponse
     */
    CompletableFuture<PutDomainPartResponse> putDomainPart(PutDomainPartRequest request);

    /**
     * @param request the request parameters of PutDomainPartByProxy  PutDomainPartByProxyRequest
     * @return PutDomainPartByProxyResponse
     */
    CompletableFuture<PutDomainPartByProxyResponse> putDomainPartByProxy(PutDomainPartByProxyRequest request);

    /**
     * @param request the request parameters of PutMeasureData  PutMeasureDataRequest
     * @return PutMeasureDataResponse
     */
    CompletableFuture<PutMeasureDataResponse> putMeasureData(PutMeasureDataRequest request);

    /**
     * @param request the request parameters of PutMeasureDataByProxy  PutMeasureDataByProxyRequest
     * @return PutMeasureDataByProxyResponse
     */
    CompletableFuture<PutMeasureDataByProxyResponse> putMeasureDataByProxy(PutMeasureDataByProxyRequest request);

    /**
     * @param request the request parameters of PutReadyFlag  PutReadyFlagRequest
     * @return PutReadyFlagResponse
     */
    CompletableFuture<PutReadyFlagResponse> putReadyFlag(PutReadyFlagRequest request);

    /**
     * @param request the request parameters of PutReadyFlagByProxy  PutReadyFlagByProxyRequest
     * @return PutReadyFlagByProxyResponse
     */
    CompletableFuture<PutReadyFlagByProxyResponse> putReadyFlagByProxy(PutReadyFlagByProxyRequest request);

}
