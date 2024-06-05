// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pds20220301.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AuthenticationInfo} extends {@link TeaModel}
 *
 * <p>AuthenticationInfo</p>
 */
public class AuthenticationInfo extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("authentication_display_name")
    private String authenticationDisplayName;

    @com.aliyun.core.annotation.NameInMap("authentication_type")
    private String authenticationType;

    @com.aliyun.core.annotation.NameInMap("extra")
    private String extra;

    @com.aliyun.core.annotation.NameInMap("identity")
    private String identity;

    private AuthenticationInfo(Builder builder) {
        this.authenticationDisplayName = builder.authenticationDisplayName;
        this.authenticationType = builder.authenticationType;
        this.extra = builder.extra;
        this.identity = builder.identity;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AuthenticationInfo create() {
        return builder().build();
    }

    /**
     * @return authenticationDisplayName
     */
    public String getAuthenticationDisplayName() {
        return this.authenticationDisplayName;
    }

    /**
     * @return authenticationType
     */
    public String getAuthenticationType() {
        return this.authenticationType;
    }

    /**
     * @return extra
     */
    public String getExtra() {
        return this.extra;
    }

    /**
     * @return identity
     */
    public String getIdentity() {
        return this.identity;
    }

    public static final class Builder {
        private String authenticationDisplayName; 
        private String authenticationType; 
        private String extra; 
        private String identity; 

        /**
         * authentication_display_name.
         */
        public Builder authenticationDisplayName(String authenticationDisplayName) {
            this.authenticationDisplayName = authenticationDisplayName;
            return this;
        }

        /**
         * authentication_type.
         */
        public Builder authenticationType(String authenticationType) {
            this.authenticationType = authenticationType;
            return this;
        }

        /**
         * extra.
         */
        public Builder extra(String extra) {
            this.extra = extra;
            return this;
        }

        /**
         * identity.
         */
        public Builder identity(String identity) {
            this.identity = identity;
            return this;
        }

        public AuthenticationInfo build() {
            return new AuthenticationInfo(this);
        } 

    } 

}
