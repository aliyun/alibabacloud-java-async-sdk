// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sts20150401.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AssumeRoleWithSAMLRequest} extends {@link RequestModel}
 *
 * <p>AssumeRoleWithSAMLRequest</p>
 */
public class AssumeRoleWithSAMLRequest extends Request {
    @Query
    @NameInMap("DurationSeconds")
    private Long durationSeconds;

    @Query
    @NameInMap("Policy")
    private String policy;

    @Query
    @NameInMap("RoleArn")
    private String roleArn;

    @Query
    @NameInMap("SAMLAssertion")
    private String SAMLAssertion;

    @Query
    @NameInMap("SAMLProviderArn")
    private String SAMLProviderArn;

    private AssumeRoleWithSAMLRequest(Builder builder) {
        super(builder);
        this.durationSeconds = builder.durationSeconds;
        this.policy = builder.policy;
        this.roleArn = builder.roleArn;
        this.SAMLAssertion = builder.SAMLAssertion;
        this.SAMLProviderArn = builder.SAMLProviderArn;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AssumeRoleWithSAMLRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return durationSeconds
     */
    public Long getDurationSeconds() {
        return this.durationSeconds;
    }

    /**
     * @return policy
     */
    public String getPolicy() {
        return this.policy;
    }

    /**
     * @return roleArn
     */
    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * @return SAMLAssertion
     */
    public String getSAMLAssertion() {
        return this.SAMLAssertion;
    }

    /**
     * @return SAMLProviderArn
     */
    public String getSAMLProviderArn() {
        return this.SAMLProviderArn;
    }

    public static final class Builder extends Request.Builder<AssumeRoleWithSAMLRequest, Builder> {
        private Long durationSeconds; 
        private String policy; 
        private String roleArn; 
        private String SAMLAssertion; 
        private String SAMLProviderArn; 

        private Builder() {
            super();
        } 

        private Builder(AssumeRoleWithSAMLRequest request) {
            super(request);
            this.durationSeconds = request.durationSeconds;
            this.policy = request.policy;
            this.roleArn = request.roleArn;
            this.SAMLAssertion = request.SAMLAssertion;
            this.SAMLProviderArn = request.SAMLProviderArn;
        } 

        /**
         * The validity period of the STS token. Unit: seconds.
         * <p>
         * 
         * Minimum value: 900. Maximum value: the value of the `MaxSessionDuration` parameter. Default value: 3600.
         * 
         * You can call the CreateRole or UpdateRole operation to configure the `MaxSessionDuration` parameter. For more information, see [CreateRole](~~28710~~) or [UpdateRole](~~28712~~).
         */
        public Builder durationSeconds(Long durationSeconds) {
            this.putQueryParameter("DurationSeconds", durationSeconds);
            this.durationSeconds = durationSeconds;
            return this;
        }

        /**
         * The policy that specifies the permissions of the returned STS token. You can use this parameter to grant the STS token fewer permissions than the permissions granted to the RAM role.
         * <p>
         * 
         * *   If you specify this parameter, the permissions of the returned STS token are the permissions that are included in the value of this parameter and owned by the RAM role.
         * *   If you do not specify this parameter, the returned STS token has all the permissions of the RAM role.
         * 
         * The value must be 1 to 2,048 characters in length.
         */
        public Builder policy(String policy) {
            this.putQueryParameter("Policy", policy);
            this.policy = policy;
            return this;
        }

        /**
         * The ARN of the RAM role.
         * <p>
         * 
         * The trust entity of the RAM role is a SAML IdP. For more information, see [Create a RAM role for a trusted IdP](~~116805~~) or [CreateRole](~~28710~~).
         * 
         * Format: `acs:ram::<account_id>:role/<role_name>`.
         * 
         * You can view the ARN in the RAM console or by calling operations.
         * 
         * *   For more information about how to view the ARN in the RAM console, see [How do I view the ARN of the RAM role?](~~39744~~).
         * *   For more information about how to view the ARN by calling operations, see [ListRoles](~~28713~~) or [GetRole](~~28711~~).
         */
        public Builder roleArn(String roleArn) {
            this.putQueryParameter("RoleArn", roleArn);
            this.roleArn = roleArn;
            return this;
        }

        /**
         * The Base64-encoded SAML assertion.
         * <p>
         * 
         * The value must be 4 to 100,000 characters in length.
         * 
         * > A complete SAML response rather than a single SAMLAssertion field must be retrieved from the external IdP.
         */
        public Builder SAMLAssertion(String SAMLAssertion) {
            this.putQueryParameter("SAMLAssertion", SAMLAssertion);
            this.SAMLAssertion = SAMLAssertion;
            return this;
        }

        /**
         * The Alibaba Cloud Resource Name (ARN) of the SAML IdP that is created in the RAM console.
         * <p>
         * 
         * Format: `acs:ram::<account_id>:saml-provider/<saml_provider_id>`.
         * 
         * You can view the ARN in the RAM console or by calling operations.
         * 
         * *   For more information about how to view the ARN in the RAM console, see [How do I view the ARN of a RAM role?](~~116795~~)
         * *   For more information about how to view the ARN by calling operations, see [GetSAMLProvider](~~186833~~) or [ListSAMLProviders](~~186851~~).
         */
        public Builder SAMLProviderArn(String SAMLProviderArn) {
            this.putQueryParameter("SAMLProviderArn", SAMLProviderArn);
            this.SAMLProviderArn = SAMLProviderArn;
            return this;
        }

        @Override
        public AssumeRoleWithSAMLRequest build() {
            return new AssumeRoleWithSAMLRequest(this);
        } 

    } 

}
