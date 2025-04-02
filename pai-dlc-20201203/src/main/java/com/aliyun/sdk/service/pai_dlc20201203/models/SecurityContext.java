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
 * {@link SecurityContext} extends {@link TeaModel}
 *
 * <p>SecurityContext</p>
 */
public class SecurityContext extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RunAsGroup")
    private Long runAsGroup;

    @com.aliyun.core.annotation.NameInMap("RunAsUser")
    private Long runAsUser;

    @com.aliyun.core.annotation.NameInMap("SeccompProfile")
    private SeccompProfile seccompProfile;

    private SecurityContext(Builder builder) {
        this.runAsGroup = builder.runAsGroup;
        this.runAsUser = builder.runAsUser;
        this.seccompProfile = builder.seccompProfile;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SecurityContext create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return runAsGroup
     */
    public Long getRunAsGroup() {
        return this.runAsGroup;
    }

    /**
     * @return runAsUser
     */
    public Long getRunAsUser() {
        return this.runAsUser;
    }

    /**
     * @return seccompProfile
     */
    public SeccompProfile getSeccompProfile() {
        return this.seccompProfile;
    }

    public static final class Builder {
        private Long runAsGroup; 
        private Long runAsUser; 
        private SeccompProfile seccompProfile; 

        private Builder() {
        } 

        private Builder(SecurityContext model) {
            this.runAsGroup = model.runAsGroup;
            this.runAsUser = model.runAsUser;
            this.seccompProfile = model.seccompProfile;
        } 

        /**
         * RunAsGroup.
         */
        public Builder runAsGroup(Long runAsGroup) {
            this.runAsGroup = runAsGroup;
            return this;
        }

        /**
         * RunAsUser.
         */
        public Builder runAsUser(Long runAsUser) {
            this.runAsUser = runAsUser;
            return this;
        }

        /**
         * SeccompProfile.
         */
        public Builder seccompProfile(SeccompProfile seccompProfile) {
            this.seccompProfile = seccompProfile;
            return this;
        }

        public SecurityContext build() {
            return new SecurityContext(this);
        } 

    } 

}
