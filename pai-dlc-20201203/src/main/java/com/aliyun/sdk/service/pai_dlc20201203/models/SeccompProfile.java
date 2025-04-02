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
         * LocalhostProfile.
         */
        public Builder localhostProfile(String localhostProfile) {
            this.localhostProfile = localhostProfile;
            return this;
        }

        /**
         * Type.
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
