// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dytnsapi20230101;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.dytnsapi20230101.models.*;
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
     * @param request the request parameters of DescribeNumberHLR  DescribeNumberHLRRequest
     * @return DescribeNumberHLRResponse
     */
    CompletableFuture<DescribeNumberHLRResponse> describeNumberHLR(DescribeNumberHLRRequest request);

    /**
     * @param request the request parameters of DescribeNumberMccMnc  DescribeNumberMccMncRequest
     * @return DescribeNumberMccMncResponse
     */
    CompletableFuture<DescribeNumberMccMncResponse> describeNumberMccMnc(DescribeNumberMccMncRequest request);

    /**
     * @param request the request parameters of GetPhoneNumberIdentificationResult  GetPhoneNumberIdentificationResultRequest
     * @return GetPhoneNumberIdentificationResultResponse
     */
    CompletableFuture<GetPhoneNumberIdentificationResultResponse> getPhoneNumberIdentificationResult(GetPhoneNumberIdentificationResultRequest request);

    /**
     * @param request the request parameters of GetPhoneNumberIdentificationUrl  GetPhoneNumberIdentificationUrlRequest
     * @return GetPhoneNumberIdentificationUrlResponse
     */
    CompletableFuture<GetPhoneNumberIdentificationUrlResponse> getPhoneNumberIdentificationUrl(GetPhoneNumberIdentificationUrlRequest request);

}
