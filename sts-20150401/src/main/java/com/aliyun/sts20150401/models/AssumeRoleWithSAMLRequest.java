// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sts20150401.models;

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
    @NameInMap("SAMLProviderArn")
    private String SAMLProviderArn;

    @Query
    @NameInMap("SAMLAssertion")
    private String SAMLAssertion;

    @Query
    @NameInMap("RoleArn")
    private String roleArn;

    private AssumeRoleWithSAMLRequest(Builder builder) {
        super(builder);
        this.durationSeconds = builder.durationSeconds;
        this.policy = builder.policy;
        this.SAMLProviderArn = builder.SAMLProviderArn;
        this.SAMLAssertion = builder.SAMLAssertion;
        this.roleArn = builder.roleArn;
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
     * @return SAMLProviderArn
     */
    public String getSAMLProviderArn() {
        return this.SAMLProviderArn;
    }

    /**
     * @return SAMLAssertion
     */
    public String getSAMLAssertion() {
        return this.SAMLAssertion;
    }

    /**
     * @return roleArn
     */
    public String getRoleArn() {
        return this.roleArn;
    }

    public static final class Builder extends Request.Builder<AssumeRoleWithSAMLRequest, Builder> {
        private Long durationSeconds; 
        private String policy; 
        private String SAMLProviderArn; 
        private String SAMLAssertion; 
        private String roleArn; 

        private Builder() {
            super();
        } 

        private Builder(AssumeRoleWithSAMLRequest response) {
            super(response);
            this.durationSeconds = response.durationSeconds;
            this.policy = response.policy;
            this.SAMLProviderArn = response.SAMLProviderArn;
            this.SAMLAssertion = response.SAMLAssertion;
            this.roleArn = response.roleArn;
        } 

        /**
         * The expiration time. Unit: seconds.
         * <p>
         * 
         * The minimum validity period is 900 seconds, and the maximum validity period is set to "MaxSessionDuration". The default value is 3600 seconds.
         * 
         * > You can set the maximum session time of the role "MaxSessionDuration" by using the CreateRole or UpdateRole API ". For more information, see [CreateRole](~~ 28710 ~~) or [UpdateRole](~~ 28712 ~~).
         */
        public Builder durationSeconds(Long durationSeconds) {
            this.putQueryParameter("DurationSeconds", durationSeconds);
            this.durationSeconds = durationSeconds;
            return this;
        }

        /**
         * An additional policy added for STS Token to further restrict STS Token permissions. The details are as follows:
         * <p>
         * -If this policy is specified, the final permission STS Token the intersection of the RAM role policy and this policy.
         * -If this policy is not specified, the final permission of the STS Token is the permission of the RAM role.
         * 
         * The description must be 1 to 1024 characters in length.
         */
        public Builder policy(String policy) {
            this.putQueryParameter("Policy", policy);
            this.policy = policy;
            return this;
        }

        /**
         * The ARN Of The SAML identity provider created in RAM.
         * <p>
         * 
         * Format: "acs:ram ::< account_id>:saml-provider/<saml_provider_id>".
         * 
         * > You can view the ARN of the identity provider through the RAM console or API. The details are as follows:
         * > - RAM console: For more information, see [view SAML identity provider information](~~ 116795 ~~).
         * > - API: For more information, see [GetSAMLProvider](~~ 186833 ~~) or [ListSAMLProviders](~~ 186851 ~~).
         */
        public Builder SAMLProviderArn(String SAMLProviderArn) {
            this.putQueryParameter("SAMLProviderArn", SAMLProviderArn);
            this.SAMLProviderArn = SAMLProviderArn;
            return this;
        }

        /**
         * The base64-encoded SAML assertion.
         * <p>
         * 
         * The description must be 4 to 100000 characters in length.
         * 
         * > you need to obtain the complete SAML response from the IdP. It cannot be a separate SAML assertion field.
         */
        public Builder SAMLAssertion(String SAMLAssertion) {
            this.putQueryParameter("SAMLAssertion", SAMLAssertion);
            this.SAMLAssertion = SAMLAssertion;
            return this;
        }

        /**
         * The ARN of the RAM role to assume.
         * <p>
         * 
         * This role is a RAM role whose trusted entity is the SAML identity provider. For more information, see [create a RAM role with a trusted entity as an identity provider](~~~) or [CreateRole](~~ 28710 ~~).
         * 
         * Format: "acs:ram ::< account_id>:role/<role_name>".
         * 
         * > You can view the role ARN through the RAM console or API. The details are as follows:
         * > - RAM console: For more information, see [how to view the ARN of a RAM role?] (~~ 39744 ~~).
         * > - API: For more information, see [ListRoles](~~ 28713 ~~) or [GetRole](~~ 28711 ~~).
         */
        public Builder roleArn(String roleArn) {
            this.putQueryParameter("RoleArn", roleArn);
            this.roleArn = roleArn;
            return this;
        }

        @Override
        public AssumeRoleWithSAMLRequest build() {
            return new AssumeRoleWithSAMLRequest(this);
        } 

    } 

}
