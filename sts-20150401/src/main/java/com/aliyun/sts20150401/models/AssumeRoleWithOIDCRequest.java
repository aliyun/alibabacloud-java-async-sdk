// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sts20150401.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AssumeRoleWithOIDCRequest} extends {@link RequestModel}
 *
 * <p>AssumeRoleWithOIDCRequest</p>
 */
public class AssumeRoleWithOIDCRequest extends Request {
    @Query
    @NameInMap("RoleArn")
    private String roleArn;

    @Query
    @NameInMap("OIDCToken")
    private String OIDCToken;

    @Query
    @NameInMap("OIDCProviderArn")
    private String OIDCProviderArn;

    @Query
    @NameInMap("DurationSeconds")
    private Long durationSeconds;

    @Query
    @NameInMap("RoleSessionName")
    private String roleSessionName;

    @Query
    @NameInMap("Policy")
    private String policy;

    private AssumeRoleWithOIDCRequest(Builder builder) {
        super(builder);
        this.roleArn = builder.roleArn;
        this.OIDCToken = builder.OIDCToken;
        this.OIDCProviderArn = builder.OIDCProviderArn;
        this.durationSeconds = builder.durationSeconds;
        this.roleSessionName = builder.roleSessionName;
        this.policy = builder.policy;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AssumeRoleWithOIDCRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return roleArn
     */
    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * @return OIDCToken
     */
    public String getOIDCToken() {
        return this.OIDCToken;
    }

    /**
     * @return OIDCProviderArn
     */
    public String getOIDCProviderArn() {
        return this.OIDCProviderArn;
    }

    /**
     * @return durationSeconds
     */
    public Long getDurationSeconds() {
        return this.durationSeconds;
    }

    /**
     * @return roleSessionName
     */
    public String getRoleSessionName() {
        return this.roleSessionName;
    }

    /**
     * @return policy
     */
    public String getPolicy() {
        return this.policy;
    }

    public static final class Builder extends Request.Builder<AssumeRoleWithOIDCRequest, Builder> {
        private String roleArn; 
        private String OIDCToken; 
        private String OIDCProviderArn; 
        private Long durationSeconds; 
        private String roleSessionName; 
        private String policy; 

        private Builder() {
            super();
        } 

        private Builder(AssumeRoleWithOIDCRequest response) {
            super(response);
            this.roleArn = response.roleArn;
            this.OIDCToken = response.OIDCToken;
            this.OIDCProviderArn = response.OIDCProviderArn;
            this.durationSeconds = response.durationSeconds;
            this.roleSessionName = response.roleSessionName;
            this.policy = response.policy;
        } 

        /**
         * The RAM role ARN to be assumed.
         * <p>
         * 
         * You can view the role ARN through the RAM console or API. The details are as follows:
         * 
         * -RAM console: For more information, see [how to view the ARN of a RAM role](~~ 39744 ~~).
         * -API: For more information, see [ListRoles](~~ 28713 ~~) or [GetRole](~~ 28711 ~~).
         */
        public Builder roleArn(String roleArn) {
            this.putQueryParameter("RoleArn", roleArn);
            this.roleArn = roleArn;
            return this;
        }

        /**
         * The OIDC Token (OIDC Token) issued by an external IdP.
         * <p>
         * 
         * The description must be 4 to 20000 characters in length.
         * 
         * > enter the original OIDC Token. No Base64 decoding is required.
         */
        public Builder OIDCToken(String OIDCToken) {
            this.putQueryParameter("OIDCToken", OIDCToken);
            this.OIDCToken = OIDCToken;
            return this;
        }

        /**
         * The ARN of the OIDC identity provider.
         * <p>
         * 
         * You can view the ARN of the OIDC identity provider through the RAM console or API. The details are as follows:
         * 
         * -RAM console: For more information, see [view OIDC identity provider information](~~ 327123 ~~).
         * -API: For more information, see [GetOIDCProvider](~~ 327126 ~~) or [ListOIDCProviders](~~ 327127 ~~).
         */
        public Builder OIDCProviderArn(String OIDCProviderArn) {
            this.putQueryParameter("OIDCProviderArn", OIDCProviderArn);
            this.OIDCProviderArn = OIDCProviderArn;
            return this;
        }

        /**
         * The expiration time of the session. Unit: seconds.
         * <p>
         * 
         * Default value: 3600. Minimum value: 900. Maximum value: the time set by "MaxSessionDuration.
         * 
         * > For more information about how to set the maximum session time of a role, see [CreateRole](~~ 28710 ~~) or [UpdateRole](~~ 28712 ~~).
         */
        public Builder durationSeconds(Long durationSeconds) {
            this.putQueryParameter("DurationSeconds", durationSeconds);
            this.durationSeconds = durationSeconds;
            return this;
        }

        /**
         * The name of the role session.
         * <p>
         * 
         * This parameter is a custom parameter. The user who calls this API, such as the username. In Operation audit logs, even operations performed by the same RAM role can be distinguished by different RoleSessionName to implement user-level access audit.
         * 
         * The name must contain letters, digits, periods (.), at(@), hyphens (-), and underscores (_).
         * 
         * The description must be 2 to 64 characters in length.
         */
        public Builder roleSessionName(String roleSessionName) {
            this.putQueryParameter("RoleSessionName", roleSessionName);
            this.roleSessionName = roleSessionName;
            return this;
        }

        /**
         * An additional policy added for STS Token to further restrict STS Token permissions. The details are as follows:
         * <p>
         * 
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

        @Override
        public AssumeRoleWithOIDCRequest build() {
            return new AssumeRoleWithOIDCRequest(this);
        } 

    } 

}
