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
         * DurationSeconds.
         */
        public Builder durationSeconds(Long durationSeconds) {
            this.putQueryParameter("DurationSeconds", durationSeconds);
            this.durationSeconds = durationSeconds;
            return this;
        }

        /**
         * Policy.
         */
        public Builder policy(String policy) {
            this.putQueryParameter("Policy", policy);
            this.policy = policy;
            return this;
        }

        /**
         * RoleArn.
         */
        public Builder roleArn(String roleArn) {
            this.putQueryParameter("RoleArn", roleArn);
            this.roleArn = roleArn;
            return this;
        }

        /**
         * SAMLAssertion.
         */
        public Builder SAMLAssertion(String SAMLAssertion) {
            this.putQueryParameter("SAMLAssertion", SAMLAssertion);
            this.SAMLAssertion = SAMLAssertion;
            return this;
        }

        /**
         * SAMLProviderArn.
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
