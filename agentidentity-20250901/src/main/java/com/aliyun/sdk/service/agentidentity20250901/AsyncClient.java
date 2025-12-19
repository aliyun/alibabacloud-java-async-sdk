// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentidentity20250901;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.agentidentity20250901.models.*;
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
     * @param request the request parameters of CreateAPIKeyCredentialProvider  CreateAPIKeyCredentialProviderRequest
     * @return CreateAPIKeyCredentialProviderResponse
     */
    CompletableFuture<CreateAPIKeyCredentialProviderResponse> createAPIKeyCredentialProvider(CreateAPIKeyCredentialProviderRequest request);

    /**
     * @param request the request parameters of CreateIdentityProvider  CreateIdentityProviderRequest
     * @return CreateIdentityProviderResponse
     */
    CompletableFuture<CreateIdentityProviderResponse> createIdentityProvider(CreateIdentityProviderRequest request);

    /**
     * @param request the request parameters of CreateOAuth2CredentialProvider  CreateOAuth2CredentialProviderRequest
     * @return CreateOAuth2CredentialProviderResponse
     */
    CompletableFuture<CreateOAuth2CredentialProviderResponse> createOAuth2CredentialProvider(CreateOAuth2CredentialProviderRequest request);

    /**
     * @param request the request parameters of CreateWorkloadIdentity  CreateWorkloadIdentityRequest
     * @return CreateWorkloadIdentityResponse
     */
    CompletableFuture<CreateWorkloadIdentityResponse> createWorkloadIdentity(CreateWorkloadIdentityRequest request);

    /**
     * @param request the request parameters of DeleteAPIKeyCredentialProvider  DeleteAPIKeyCredentialProviderRequest
     * @return DeleteAPIKeyCredentialProviderResponse
     */
    CompletableFuture<DeleteAPIKeyCredentialProviderResponse> deleteAPIKeyCredentialProvider(DeleteAPIKeyCredentialProviderRequest request);

    /**
     * @param request the request parameters of DeleteIdentityProvider  DeleteIdentityProviderRequest
     * @return DeleteIdentityProviderResponse
     */
    CompletableFuture<DeleteIdentityProviderResponse> deleteIdentityProvider(DeleteIdentityProviderRequest request);

    /**
     * @param request the request parameters of DeleteOAuth2CredentialProvider  DeleteOAuth2CredentialProviderRequest
     * @return DeleteOAuth2CredentialProviderResponse
     */
    CompletableFuture<DeleteOAuth2CredentialProviderResponse> deleteOAuth2CredentialProvider(DeleteOAuth2CredentialProviderRequest request);

    /**
     * @param request the request parameters of DeleteWorkloadIdentity  DeleteWorkloadIdentityRequest
     * @return DeleteWorkloadIdentityResponse
     */
    CompletableFuture<DeleteWorkloadIdentityResponse> deleteWorkloadIdentity(DeleteWorkloadIdentityRequest request);

    /**
     * @param request the request parameters of GetAPIKeyCredentialProvider  GetAPIKeyCredentialProviderRequest
     * @return GetAPIKeyCredentialProviderResponse
     */
    CompletableFuture<GetAPIKeyCredentialProviderResponse> getAPIKeyCredentialProvider(GetAPIKeyCredentialProviderRequest request);

    /**
     * @param request the request parameters of GetIdentityProvider  GetIdentityProviderRequest
     * @return GetIdentityProviderResponse
     */
    CompletableFuture<GetIdentityProviderResponse> getIdentityProvider(GetIdentityProviderRequest request);

    /**
     * @param request the request parameters of GetOAuth2CredentialProvider  GetOAuth2CredentialProviderRequest
     * @return GetOAuth2CredentialProviderResponse
     */
    CompletableFuture<GetOAuth2CredentialProviderResponse> getOAuth2CredentialProvider(GetOAuth2CredentialProviderRequest request);

    /**
     * @param request the request parameters of GetWorkloadIdentity  GetWorkloadIdentityRequest
     * @return GetWorkloadIdentityResponse
     */
    CompletableFuture<GetWorkloadIdentityResponse> getWorkloadIdentity(GetWorkloadIdentityRequest request);

    /**
     * @param request the request parameters of ListAPIKeyCredentialProviders  ListAPIKeyCredentialProvidersRequest
     * @return ListAPIKeyCredentialProvidersResponse
     */
    CompletableFuture<ListAPIKeyCredentialProvidersResponse> listAPIKeyCredentialProviders(ListAPIKeyCredentialProvidersRequest request);

    /**
     * @param request the request parameters of ListIdentityProviders  ListIdentityProvidersRequest
     * @return ListIdentityProvidersResponse
     */
    CompletableFuture<ListIdentityProvidersResponse> listIdentityProviders(ListIdentityProvidersRequest request);

    /**
     * @param request the request parameters of ListOAuth2CredentialProviders  ListOAuth2CredentialProvidersRequest
     * @return ListOAuth2CredentialProvidersResponse
     */
    CompletableFuture<ListOAuth2CredentialProvidersResponse> listOAuth2CredentialProviders(ListOAuth2CredentialProvidersRequest request);

    /**
     * @param request the request parameters of ListWorkloadIdentities  ListWorkloadIdentitiesRequest
     * @return ListWorkloadIdentitiesResponse
     */
    CompletableFuture<ListWorkloadIdentitiesResponse> listWorkloadIdentities(ListWorkloadIdentitiesRequest request);

    /**
     * @param request the request parameters of UpdateAPIKeyCredentialProvider  UpdateAPIKeyCredentialProviderRequest
     * @return UpdateAPIKeyCredentialProviderResponse
     */
    CompletableFuture<UpdateAPIKeyCredentialProviderResponse> updateAPIKeyCredentialProvider(UpdateAPIKeyCredentialProviderRequest request);

    /**
     * @param request the request parameters of UpdateIdentityProvider  UpdateIdentityProviderRequest
     * @return UpdateIdentityProviderResponse
     */
    CompletableFuture<UpdateIdentityProviderResponse> updateIdentityProvider(UpdateIdentityProviderRequest request);

    /**
     * @param request the request parameters of UpdateOAuth2CredentialProvider  UpdateOAuth2CredentialProviderRequest
     * @return UpdateOAuth2CredentialProviderResponse
     */
    CompletableFuture<UpdateOAuth2CredentialProviderResponse> updateOAuth2CredentialProvider(UpdateOAuth2CredentialProviderRequest request);

    /**
     * @param request the request parameters of UpdateWorkloadIdentity  UpdateWorkloadIdentityRequest
     * @return UpdateWorkloadIdentityResponse
     */
    CompletableFuture<UpdateWorkloadIdentityResponse> updateWorkloadIdentity(UpdateWorkloadIdentityRequest request);

}
