// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sts20150401;

import com.aliyun.sts20150401.models.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;

import java.util.concurrent.CompletableFuture;

public interface AsyncClient {

    static DefaultAsyncClientBuilder builder() {
        return new DefaultAsyncClientBuilder();
    }

    static AsyncClient create() {
        return builder().build();
    }

    /**
     * ### Prerequisites
    Make sure that the RAM user who calls this API has been granted the STS administrative permission (AliyunSTSAssumeRoleAccess). Otherwise, an error is reported. The error message is as follows:
    
    "You are not authorized to do this action. You should be authorized by RAM ."
    
    The causes and solutions are as follows:
    
    -The RAM user is not authorized to assume a role by STS. Add a system policy (AliyunSTSAssumeRoleAccess) or a custom policy to the RAM user. For more information, see [authorize a RAM user](~~ 116146 ~~) and [specify which RAM role a RAM user can play](~~ 39744 ~~).
    -The RAM role trust policy does not include the RAM user you are using, that is, the RAM role does not allow the RAM user to assume: please add a trust policy for the RAM role to allow the RAM user to assume. For more information, see [Modify the trust policy for a RAM role](~~ 116819 ~~).
    
    
    ### QPS limit
    This API can be called up to 6,000 times per minute, and an Alibaba Cloud account, RAM users and RAM roles under this account share the same 6,000 times. If the number of requests exceeds 6,000, an error is returned. The error message is as follows:
    
    "Request was denied due to user flow control ."
    
    
     */
    CompletableFuture<AssumeRoleResponse> assumeRole(AssumeRoleRequest request);

    /**
     * ### Prerequisites
    -Make sure that the OIDC Token (OIDC Token) has been obtained from an external identity provider (IdP).
    -Make sure that you have created an OIDC identity provider in RAM. For more information, see [create an OIDC identity provider](~~ 327123 ~~) or [CreateOIDCProvider](~~ 327135 ~~).
    -Make sure that you have created a RAM role with the trusted entity as the OIDC identity provider in RAM. For more information, see [create a RAM role with a trusted entity as an identity provider](~~ 116805 ~~) or [CreateRole](~~ 28710 ~~).
     */
    CompletableFuture<AssumeRoleWithOIDCResponse> assumeRoleWithOIDC(AssumeRoleWithOIDCRequest request);

    /**
     * ### Prerequisites
    -Make sure that the SAML response is obtained from an external identity provider (IdP).
    -Make sure that you have created a SAML identity provider in RAM. For more information, see [create a SAML identity provider](~~ 116083 ~~) or [CreateSAMLProvider](~~ 186846 ~~).
    -Make sure that you have created a RAM role with the trusted entity as the SAML identity provider in RAM. For more information, see [create a RAM role with a trusted entity as an identity provider](~~ 116805 ~~) or [CreateRole](~~ 28710 ~~).
     */
    CompletableFuture<AssumeRoleWithSAMLResponse> assumeRoleWithSAML(AssumeRoleWithSAMLRequest request);

    CompletableFuture<GetCallerIdentityResponse> getCallerIdentity(GetCallerIdentityRequest request);

}
