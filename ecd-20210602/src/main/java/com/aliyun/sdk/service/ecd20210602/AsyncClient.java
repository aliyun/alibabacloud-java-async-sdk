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
     * <b>description</b> :
     * <p>The obtained SecurityToken is valid for 15 minutes.</p>
     * 
     * @param request the request parameters of GetOssStsToken  GetOssStsTokenRequest
     * @return GetOssStsTokenResponse
     */
    CompletableFuture<GetOssStsTokenResponse> getOssStsToken(GetOssStsTokenRequest request);

    /**
     * <b>description</b> :
     * <p>Call the ParseSkillPackage operation first. Poll this operation every 3 seconds.</p>
     * 
     * @param request the request parameters of GetParseProgress  GetParseProgressRequest
     * @return GetParseProgressResponse
     */
    CompletableFuture<GetParseProgressResponse> getParseProgress(GetParseProgressRequest request);

    /**
     * <b>description</b> :
     * <p>The resource type supports only cloud computers.</p>
     * 
     * @param request the request parameters of ListSecureSkillIdentities  ListSecureSkillIdentitiesRequest
     * @return ListSecureSkillIdentitiesResponse
     */
    CompletableFuture<ListSecureSkillIdentitiesResponse> listSecureSkillIdentities(ListSecureSkillIdentitiesRequest request);

    /**
     * <b>description</b> :
     * <p>Authorized objects support only cloud computers.</p>
     * 
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
     * <b>description</b> :
     * <p>The query scope is determined by the caller identity and includes applications uploaded by the current tenant and marketplace applications that the tenant is authorized to view. The visibility of marketplace applications is subject to authorization and display policy restrictions. The authorization and auto-installation information in the list represents application configurations and does not indicate the actual installation result on a specific device.</p>
     * <ul>
     * <li><strong>Application identity</strong>: Id is a numeric application ID, and AppUid is a character string UID. The two cannot be used interchangeably.</li>
     * <li><strong>Authorization scope</strong>: DistributeType is used together with AuthType. For example, <code>AuthType=auth_type_user</code> and <code>DistributeType=ALL</code> indicate that the application is allocated to all users on a per-user dimension.</li>
     * <li><strong>Auto-installation</strong>: AutoInstallmentType specifies the auto-installation scope policy, which is used to distinguish between full, partial, or disabled auto-installation.</li>
     * <li><strong>Partial auto-installation</strong>: When AutoInstallmentType is set to 1, use SetAutoInstallUser or SetAutoInstallDesktop to configure specific users or cloud desktops. OperationType=1 indicates enabled, and OperationType=2 indicates disabled. ListTenantApp only returns configurations and does not modify auto-installation settings.</li>
     * <li><strong>Capabilities and execution results</strong>: The silent installation capability is application metadata returned in the response. To determine the actual installation or execution result on a device, use the corresponding execution result query capability.</li>
     * <li><strong>Optional information</strong>: Information such as timestamps may be empty.</li>
     * <li><strong>Compatibility handling</strong>: Extension information and subtype do not use closed enumerations. Clients should ignore unrecognized extension fields and be compatible with new enumeration values.</li>
     * </ul>
     * 
     * @param request the request parameters of ListTenantApp  ListTenantAppRequest
     * @return ListTenantAppResponse
     */
    CompletableFuture<ListTenantAppResponse> listTenantApp(ListTenantAppRequest request);

    /**
     * @param request the request parameters of ParseSkillPackage  ParseSkillPackageRequest
     * @return ParseSkillPackageResponse
     */
    CompletableFuture<ParseSkillPackageResponse> parseSkillPackage(ParseSkillPackageRequest request);

    /**
     * <b>description</b> :
     * <p>The authorized object supports only cloud computers.</p>
     * 
     * @param request the request parameters of SetIdentitySkillAuth  SetIdentitySkillAuthRequest
     * @return SetIdentitySkillAuthResponse
     */
    CompletableFuture<SetIdentitySkillAuthResponse> setIdentitySkillAuth(SetIdentitySkillAuthRequest request);

    /**
     * <b>description</b> :
     * <p>The resource type supports only cloud computers.</p>
     * 
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
