// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.idaas_doraemon20210520;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.idaas_doraemon20210520.models.*;
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

    CompletableFuture<CreateAuthenticatorRegistrationResponse> createAuthenticatorRegistration(CreateAuthenticatorRegistrationRequest request);

    CompletableFuture<CreateUserAuthenticateOptionsResponse> createUserAuthenticateOptions(CreateUserAuthenticateOptionsRequest request);

    CompletableFuture<DeregisterAuthenticatorResponse> deregisterAuthenticator(DeregisterAuthenticatorRequest request);

    CompletableFuture<FetchAccessTokenResponse> fetchAccessToken(FetchAccessTokenRequest request);

    CompletableFuture<GetAuthenticatorResponse> getAuthenticator(GetAuthenticatorRequest request);

    CompletableFuture<ListAuthenticationLogsResponse> listAuthenticationLogs(ListAuthenticationLogsRequest request);

    CompletableFuture<ListAuthenticatorOpsLogsResponse> listAuthenticatorOpsLogs(ListAuthenticatorOpsLogsRequest request);

    CompletableFuture<ListAuthenticatorsResponse> listAuthenticators(ListAuthenticatorsRequest request);

    CompletableFuture<ListCostUnitOrdersResponse> listCostUnitOrders(ListCostUnitOrdersRequest request);

    CompletableFuture<ListOrderConsumeStatisticRecordsResponse> listOrderConsumeStatisticRecords(ListOrderConsumeStatisticRecordsRequest request);

    CompletableFuture<ListPwnedPasswordsResponse> listPwnedPasswords(ListPwnedPasswordsRequest request);

    CompletableFuture<ListUsersResponse> listUsers(ListUsersRequest request);

    CompletableFuture<QuerySmsReportsResponse> querySmsReports(QuerySmsReportsRequest request);

    CompletableFuture<QuerySmsUpsResponse> querySmsUps(QuerySmsUpsRequest request);

    CompletableFuture<RegisterAuthenticatorResponse> registerAuthenticator(RegisterAuthenticatorRequest request);

    CompletableFuture<ServiceInvokeResponse> serviceInvoke(ServiceInvokeRequest request);

    CompletableFuture<UpdateAuthenticatorAttributeResponse> updateAuthenticatorAttribute(UpdateAuthenticatorAttributeRequest request);

    CompletableFuture<VerifyIdTokenResponse> verifyIdToken(VerifyIdTokenRequest request);

    CompletableFuture<VerifyUserAuthenticationResponse> verifyUserAuthentication(VerifyUserAuthenticationRequest request);

}
