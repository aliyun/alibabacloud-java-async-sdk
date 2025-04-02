// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dlc20201203.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CredentialRole} extends {@link TeaModel}
 *
 * <p>CredentialRole</p>
 */
public class CredentialRole extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AssumeRoleFor")
    private String assumeRoleFor;

    @com.aliyun.core.annotation.NameInMap("AssumeUserInfo")
    private AssumeUserInfo assumeUserInfo;

    @com.aliyun.core.annotation.NameInMap("Policy")
    private String policy;

    @com.aliyun.core.annotation.NameInMap("RoleArn")
    private String roleArn;

    @com.aliyun.core.annotation.NameInMap("RoleType")
    private String roleType;

    private CredentialRole(Builder builder) {
        this.assumeRoleFor = builder.assumeRoleFor;
        this.assumeUserInfo = builder.assumeUserInfo;
        this.policy = builder.policy;
        this.roleArn = builder.roleArn;
        this.roleType = builder.roleType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CredentialRole create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return assumeRoleFor
     */
    public String getAssumeRoleFor() {
        return this.assumeRoleFor;
    }

    /**
     * @return assumeUserInfo
     */
    public AssumeUserInfo getAssumeUserInfo() {
        return this.assumeUserInfo;
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
     * @return roleType
     */
    public String getRoleType() {
        return this.roleType;
    }

    public static final class Builder {
        private String assumeRoleFor; 
        private AssumeUserInfo assumeUserInfo; 
        private String policy; 
        private String roleArn; 
        private String roleType; 

        private Builder() {
        } 

        private Builder(CredentialRole model) {
            this.assumeRoleFor = model.assumeRoleFor;
            this.assumeUserInfo = model.assumeUserInfo;
            this.policy = model.policy;
            this.roleArn = model.roleArn;
            this.roleType = model.roleType;
        } 

        /**
         * AssumeRoleFor.
         */
        public Builder assumeRoleFor(String assumeRoleFor) {
            this.assumeRoleFor = assumeRoleFor;
            return this;
        }

        /**
         * AssumeUserInfo.
         */
        public Builder assumeUserInfo(AssumeUserInfo assumeUserInfo) {
            this.assumeUserInfo = assumeUserInfo;
            return this;
        }

        /**
         * Policy.
         */
        public Builder policy(String policy) {
            this.policy = policy;
            return this;
        }

        /**
         * RoleArn.
         */
        public Builder roleArn(String roleArn) {
            this.roleArn = roleArn;
            return this;
        }

        /**
         * RoleType.
         */
        public Builder roleType(String roleType) {
            this.roleType = roleType;
            return this;
        }

        public CredentialRole build() {
            return new CredentialRole(this);
        } 

    } 

}
