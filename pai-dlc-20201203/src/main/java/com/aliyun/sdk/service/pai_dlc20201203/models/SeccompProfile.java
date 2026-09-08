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
 * {@link SeccompProfile} extends {@link TeaModel}
 *
 * <p>SeccompProfile</p>
 */
public class SeccompProfile extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("LocalhostProfile")
    private String localhostProfile;

    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    private SeccompProfile(Builder builder) {
        this.localhostProfile = builder.localhostProfile;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SeccompProfile create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return localhostProfile
     */
    public String getLocalhostProfile() {
        return this.localhostProfile;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder {
        private String localhostProfile; 
        private String type; 

        private Builder() {
        } 

        private Builder(SeccompProfile model) {
            this.localhostProfile = model.localhostProfile;
            this.type = model.type;
        } 

        /**
         * <p>The path of the Seccomp profile on the node. This parameter takes effect only when Type is set to Localhost.</p>
         * 
         * <strong>example:</strong>
         * <p>my-profiles/profile-allow.json</p>
         */
        public Builder localhostProfile(String localhostProfile) {
            this.localhostProfile = localhostProfile;
            return this;
        }

        /**
         * <p>The Seccomp configuration type. Valid values: Localhost, RuntimeDefault, Unconfined.</p>
         * 
         * <strong>example:</strong>
         * <p>Unconfined</p>
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public SeccompProfile build() {
            return new SeccompProfile(this);
        } 

    } 

}
