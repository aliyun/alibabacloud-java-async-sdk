// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sgx_dcap_server20200726;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.sgx_dcap_server20200726.models.*;
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

    CompletableFuture<GetQeIdentityResponse> getQeIdentity(GetQeIdentityRequest request);

    CompletableFuture<GetQveIdentityResponse> getQveIdentity(GetQveIdentityRequest request);

    CompletableFuture<GetTcbInfoResponse> getTcbInfo(GetTcbInfoRequest request);

    CompletableFuture<PckCrlResponse> pckCrl(PckCrlRequest request);

    CompletableFuture<RootCaCrlResponse> rootCaCrl(RootCaCrlRequest request);

    CompletableFuture<SimplePackagePckCertResponse> simplePackagePckCert(SimplePackagePckCertRequest request);

}
