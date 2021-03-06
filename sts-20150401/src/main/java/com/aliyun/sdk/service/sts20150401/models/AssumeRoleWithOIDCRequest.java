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

        private Builder(AssumeRoleWithOIDCRequest response) {
            super(response);
            this.durationSeconds = response.durationSeconds;
            this.OIDCProviderArn = response.OIDCProviderArn;
            this.OIDCToken = response.OIDCToken;
            this.policy = response.policy;
            this.roleArn = response.roleArn;
            this.roleSessionName = response.roleSessionName;
        } 

        /**
         * Session??????????????????????????????
         */
        public Builder durationSeconds(Long durationSeconds) {
            this.putQueryParameter("DurationSeconds", durationSeconds);
            this.durationSeconds = durationSeconds;
            return this;
        }

        /**
         * OIDC Provider???ARN
         */
        public Builder OIDCProviderArn(String OIDCProviderArn) {
            this.putQueryParameter("OIDCProviderArn", OIDCProviderArn);
            this.OIDCProviderArn = OIDCProviderArn;
            return this;
        }

        /**
         * OIDC???ID Token??????????????????Token?????????Base64??????
         */
        public Builder OIDCToken(String OIDCToken) {
            this.putQueryParameter("OIDCToken", OIDCToken);
            this.OIDCToken = OIDCToken;
            return this;
        }

        /**
         * ??????????????? ??????STS Token???????????????????????????????????????????????????????????????STS Token????????????????????????????????????Token????????????????????????????????????
         */
        public Builder policy(String policy) {
            this.putQueryParameter("Policy", policy);
            this.policy = policy;
            return this;
        }

        /**
         * ????????????????????????ARN
         */
        public Builder roleArn(String roleArn) {
            this.putQueryParameter("RoleArn", roleArn);
            this.roleArn = roleArn;
            return this;
        }

        /**
         * ??????????????????????????????????????????????????????????????????????????????????????????????????????
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
