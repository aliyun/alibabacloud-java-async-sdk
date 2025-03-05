// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agency20250227;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.agency20250227.models.*;
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
     * @param request the request parameters of GetBillDetailFileList  GetBillDetailFileListRequest
     * @return GetBillDetailFileListResponse
     */
    CompletableFuture<GetBillDetailFileListResponse> getBillDetailFileList(GetBillDetailFileListRequest request);

    /**
     * @param request the request parameters of GetCommissionDetailFileList  GetCommissionDetailFileListRequest
     * @return GetCommissionDetailFileListResponse
     */
    CompletableFuture<GetCommissionDetailFileListResponse> getCommissionDetailFileList(GetCommissionDetailFileListRequest request);

    /**
     * @param request the request parameters of GetCustomerOrderList  GetCustomerOrderListRequest
     * @return GetCustomerOrderListResponse
     */
    CompletableFuture<GetCustomerOrderListResponse> getCustomerOrderList(GetCustomerOrderListRequest request);

    /**
     * @param request the request parameters of GetRenewalRateList  GetRenewalRateListRequest
     * @return GetRenewalRateListResponse
     */
    CompletableFuture<GetRenewalRateListResponse> getRenewalRateList(GetRenewalRateListRequest request);

    /**
     * @param request the request parameters of GetSubPartnerList  GetSubPartnerListRequest
     * @return GetSubPartnerListResponse
     */
    CompletableFuture<GetSubPartnerListResponse> getSubPartnerList(GetSubPartnerListRequest request);

    /**
     * @param request the request parameters of GetSubPartnerOrderList  GetSubPartnerOrderListRequest
     * @return GetSubPartnerOrderListResponse
     */
    CompletableFuture<GetSubPartnerOrderListResponse> getSubPartnerOrderList(GetSubPartnerOrderListRequest request);

}
