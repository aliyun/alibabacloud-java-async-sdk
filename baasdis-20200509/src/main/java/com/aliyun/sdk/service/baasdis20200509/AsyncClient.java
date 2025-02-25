// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baasdis20200509;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.baasdis20200509.models.*;
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

    CompletableFuture<CreateEenterpriseDIDResponse> createEenterpriseDID(CreateEenterpriseDIDRequest request);

    CompletableFuture<CreatePersonalDIDResponse> createPersonalDID(CreatePersonalDIDRequest request);

    CompletableFuture<CreateTenantDIDResponse> createTenantDID(CreateTenantDIDRequest request);

    CompletableFuture<GetDIDResponse> getDID(GetDIDRequest request);

    CompletableFuture<IssueNormalVerifiableVCResponse> issueNormalVerifiableVC(IssueNormalVerifiableVCRequest request);

    CompletableFuture<UpdateVCResponse> updateVC(UpdateVCRequest request);

    CompletableFuture<VerifyVerifiableClaimResponse> verifyVerifiableClaim(VerifyVerifiableClaimRequest request);

}
