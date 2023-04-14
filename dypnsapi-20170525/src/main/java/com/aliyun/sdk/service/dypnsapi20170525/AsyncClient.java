// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dypnsapi20170525;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.dypnsapi20170525.models.*;
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

    CompletableFuture<CreateVerifySchemeResponse> createVerifyScheme(CreateVerifySchemeRequest request);

    CompletableFuture<DeleteVerifySchemeResponse> deleteVerifyScheme(DeleteVerifySchemeRequest request);

    CompletableFuture<DescribeVerifySchemeResponse> describeVerifyScheme(DescribeVerifySchemeRequest request);

    CompletableFuture<GetAuthTokenResponse> getAuthToken(GetAuthTokenRequest request);

    CompletableFuture<GetAuthorizationUrlResponse> getAuthorizationUrl(GetAuthorizationUrlRequest request);

    CompletableFuture<GetFusionAuthTokenResponse> getFusionAuthToken(GetFusionAuthTokenRequest request);

    CompletableFuture<GetMobileResponse> getMobile(GetMobileRequest request);

    CompletableFuture<GetPhoneWithTokenResponse> getPhoneWithToken(GetPhoneWithTokenRequest request);

    CompletableFuture<GetSmsAuthTokensResponse> getSmsAuthTokens(GetSmsAuthTokensRequest request);

    CompletableFuture<QueryGateVerifyBillingPublicResponse> queryGateVerifyBillingPublic(QueryGateVerifyBillingPublicRequest request);

    CompletableFuture<QueryGateVerifyStatisticPublicResponse> queryGateVerifyStatisticPublic(QueryGateVerifyStatisticPublicRequest request);

    CompletableFuture<VerifyMobileResponse> verifyMobile(VerifyMobileRequest request);

    CompletableFuture<VerifyPhoneWithTokenResponse> verifyPhoneWithToken(VerifyPhoneWithTokenRequest request);

    CompletableFuture<VerifySmsCodeResponse> verifySmsCode(VerifySmsCodeRequest request);

    CompletableFuture<VerifyWithFusionAuthTokenResponse> verifyWithFusionAuthToken(VerifyWithFusionAuthTokenRequest request);

}
