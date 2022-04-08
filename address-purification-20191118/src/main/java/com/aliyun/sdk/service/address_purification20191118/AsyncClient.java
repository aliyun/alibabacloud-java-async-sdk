// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.address_purification20191118;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.address_purification20191118.models.*;
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

    CompletableFuture<CorrectAddressResponse> correctAddress(CorrectAddressRequest request);

    CompletableFuture<ExtractAddressResponse> extractAddress(ExtractAddressRequest request);

    CompletableFuture<ExtractNameResponse> extractName(ExtractNameRequest request);

    CompletableFuture<ExtractPhoneResponse> extractPhone(ExtractPhoneRequest request);

    CompletableFuture<GetAddressDivisionCodeResponse> getAddressDivisionCode(GetAddressDivisionCodeRequest request);

    CompletableFuture<GetAddressSimilarityResponse> getAddressSimilarity(GetAddressSimilarityRequest request);

    CompletableFuture<GetZipcodeResponse> getZipcode(GetZipcodeRequest request);

    CompletableFuture<StructureAddressResponse> structureAddress(StructureAddressRequest request);

}
