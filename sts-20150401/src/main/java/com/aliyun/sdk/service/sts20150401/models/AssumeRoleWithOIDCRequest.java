// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sts20150401.models;

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
    @NameInMap("DurationSeconds")
    private Long durationSeconds;

    @Query
    @NameInMap("OIDCProviderArn")
    private String OIDCProviderArn;

    @Query
    @NameInMap("OIDCToken")
    private String OIDCToken;

    @Query
    @NameInMap("Policy")
    private String policy;

    @Query
    @NameInMap("RoleArn")
    private String roleArn;

    @Query
    @NameInMap("RoleSessionName")
    private String roleSessionName;

    private AssumeRoleWithOIDCRequest(Builder builder) {
        super(builder);
        this.durationSeconds = builder.durationSeconds;
        this.OIDCProviderArn = builder.OIDCProviderArn;
        this.OIDCToken = builder.OIDCToken;
        this.policy = builder.policy;
        this.roleArn = builder.roleArn;
        this.roleSessionName = builder.roleSessionName;
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
     * @return durationSeconds
     */
    public Long getDurationSeconds() {
        return this.durationSeconds;
    }

    /**
     * @return OIDCProviderArn
     */
    public String getOIDCProviderArn() {
        return this.OIDCProviderArn;
    }

    /**
     * @return OIDCToken
     */
    public String getOIDCToken() {
        return this.OIDCToken;
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
     * @return roleSessionName
     */
    public String getRoleSessionName() {
        return this.roleSessionName;
    }

    public static final class Builder extends Request.Builder<AssumeRoleWithOIDCRequest, Builder> {
        private Long durationSeconds; 
        private String OIDCProviderArn; 
        private String OIDCToken; 
        private String policy; 
        private String roleArn; 
        private String roleSessionName; 

        private Builder() {
            super();
        } 

        private Builder(AssumeRoleWithOIDCRequest request) {
            super(request);
            this.durationSeconds = request.durationSeconds;
            this.OIDCProviderArn = request.OIDCProviderArn;
            this.OIDCToken = request.OIDCToken;
            this.policy = request.policy;
            this.roleArn = request.roleArn;
            this.roleSessionName = request.roleSessionName;
        } 

        /**
         * The validity period of the STS token. Unit: seconds.
         * <p>
         * 
         * Default value: 3600. Minimum value: 900. Maximum value: the value of the `MaxSessionDuration` parameter.
         * 
         * For more information about how to specify `MaxSessionDuration`, see [CreateRole](~~28710~~) or [UpdateRole](~~28712~~).
         */
        public Builder durationSeconds(Long durationSeconds) {
            this.putQueryParameter("DurationSeconds", durationSeconds);
            this.durationSeconds = durationSeconds;
            return this;
        }

        /**
         * The Alibaba Cloud Resource Name (ARN) of the OIDC IdP.
         * <p>
         * 
         * You can view the ARN in the RAM console or by calling operations.
         * 
         * *   For more information about how to view the ARN in the RAM console, see [View the information about an OIDC IdP](~~327123~~).
         * *   For more information about how to view the ARN by calling operations, see [GetOIDCProvider](~~327126~~) or [ListOIDCProviders](~~327127~~).
         */
        public Builder OIDCProviderArn(String OIDCProviderArn) {
            this.putQueryParameter("OIDCProviderArn", OIDCProviderArn);
            this.OIDCProviderArn = OIDCProviderArn;
            return this;
        }

        /**
         * The OIDC token that is issued by the external IdP.
         * <p>
         * 
         * The OIDC token must be 4 to 20,000 characters in length.
         * 
         * > You must enter the original OIDC token. You do not need to enter the Base64-encoded OIDC token.
         */
        public Builder OIDCToken(String OIDCToken) {
            this.putQueryParameter("OIDCToken", OIDCToken);
            this.OIDCToken = OIDCToken;
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
         * You can view the ARN in the RAM console or by calling operations.
         * 
         * *   For more information about how to view the ARN in the RAM console, see [How do I view the ARN of the RAM role?](~~39744~~)
         * *   For more information about how to view the ARN by calling operations, see [ListRoles](~~28713~~) or [GetRole](~~28711~~).
         */
        public Builder roleArn(String roleArn) {
            this.putQueryParameter("RoleArn", roleArn);
            this.roleArn = roleArn;
            return this;
        }

        /**
         * The custom name of the role session.
         * <p>
         * 
         * Set this parameter based on your business requirements. In most cases, this parameter is set to the identity of the user who calls the operation, for example, the username. In ActionTrail logs, you can distinguish the users who assume the same RAM role to perform operations based on the value of the RoleSessionName parameter. This way, you can perform user-specific auditing.
         * 
         * The value can contain letters, digits, periods (.), at signs (@), hyphens (-), and underscores (\_).
         * 
         * The value must be 2 to 64 characters in length.
         */
        public Builder roleSessionName(String roleSessionName) {
            this.putQueryParameter("RoleSessionName", roleSessionName);
            this.roleSessionName = roleSessionName;
            return this;
        }

        @Override
        public AssumeRoleWithOIDCRequest build() {
            return new AssumeRoleWithOIDCRequest(this);
        } 

    } 

}
