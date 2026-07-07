// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20210602;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.ecd20210602.models.*;
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
     * @param request the request parameters of CreateTenantSkill  CreateTenantSkillRequest
     * @return CreateTenantSkillResponse
     */
    CompletableFuture<CreateTenantSkillResponse> createTenantSkill(CreateTenantSkillRequest request);

    /**
     * @param request the request parameters of DeleteTenantSkills  DeleteTenantSkillsRequest
     * @return DeleteTenantSkillsResponse
     */
    CompletableFuture<DeleteTenantSkillsResponse> deleteTenantSkills(DeleteTenantSkillsRequest request);

    /**
     * @param request the request parameters of GetOssStsToken  GetOssStsTokenRequest
     * @return GetOssStsTokenResponse
     */
    CompletableFuture<GetOssStsTokenResponse> getOssStsToken(GetOssStsTokenRequest request);

    /**
     * @param request the request parameters of GetParseProgress  GetParseProgressRequest
     * @return GetParseProgressResponse
     */
    CompletableFuture<GetParseProgressResponse> getParseProgress(GetParseProgressRequest request);

    /**
     * @param request the request parameters of ListSecureSkillIdentities  ListSecureSkillIdentitiesRequest
     * @return ListSecureSkillIdentitiesResponse
     */
    CompletableFuture<ListSecureSkillIdentitiesResponse> listSecureSkillIdentities(ListSecureSkillIdentitiesRequest request);

    /**
     * @param request the request parameters of ListSkillAuthedIdentities  ListSkillAuthedIdentitiesRequest
     * @return ListSkillAuthedIdentitiesResponse
     */
    CompletableFuture<ListSkillAuthedIdentitiesResponse> listSkillAuthedIdentities(ListSkillAuthedIdentitiesRequest request);

    /**
     * @param request the request parameters of ListSkills  ListSkillsRequest
     * @return ListSkillsResponse
     */
    CompletableFuture<ListSkillsResponse> listSkills(ListSkillsRequest request);

    /**
     * @param request the request parameters of ParseSkillPackage  ParseSkillPackageRequest
     * @return ParseSkillPackageResponse
     */
    CompletableFuture<ParseSkillPackageResponse> parseSkillPackage(ParseSkillPackageRequest request);

    /**
     * @param request the request parameters of SetIdentitySkillAuth  SetIdentitySkillAuthRequest
     * @return SetIdentitySkillAuthResponse
     */
    CompletableFuture<SetIdentitySkillAuthResponse> setIdentitySkillAuth(SetIdentitySkillAuthRequest request);

    /**
     * @param request the request parameters of SetIdentitySkillSecurity  SetIdentitySkillSecurityRequest
     * @return SetIdentitySkillSecurityResponse
     */
    CompletableFuture<SetIdentitySkillSecurityResponse> setIdentitySkillSecurity(SetIdentitySkillSecurityRequest request);

    /**
     * @param request the request parameters of SetTenantSkillEnabled  SetTenantSkillEnabledRequest
     * @return SetTenantSkillEnabledResponse
     */
    CompletableFuture<SetTenantSkillEnabledResponse> setTenantSkillEnabled(SetTenantSkillEnabledRequest request);

}
