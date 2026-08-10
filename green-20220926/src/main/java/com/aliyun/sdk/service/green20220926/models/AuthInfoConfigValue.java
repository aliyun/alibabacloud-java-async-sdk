// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20220926.models;

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
 * {@link AuthInfoConfigValue} extends {@link TeaModel}
 *
 * <p>AuthInfoConfigValue</p>
 */
public class AuthInfoConfigValue extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AuthToken")
    private String authToken;

    @com.aliyun.core.annotation.NameInMap("PrivateDomain")
    private String privateDomain;

    @com.aliyun.core.annotation.NameInMap("Project")
    private String project;

    @com.aliyun.core.annotation.NameInMap("PublicDomain")
    private String publicDomain;

    private AuthInfoConfigValue(Builder builder) {
        this.authToken = builder.authToken;
        this.privateDomain = builder.privateDomain;
        this.project = builder.project;
        this.publicDomain = builder.publicDomain;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AuthInfoConfigValue create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return authToken
     */
    public String getAuthToken() {
        return this.authToken;
    }

    /**
     * @return privateDomain
     */
    public String getPrivateDomain() {
        return this.privateDomain;
    }

    /**
     * @return project
     */
    public String getProject() {
        return this.project;
    }

    /**
     * @return publicDomain
     */
    public String getPublicDomain() {
        return this.publicDomain;
    }

    public static final class Builder {
        private String authToken; 
        private String privateDomain; 
        private String project; 
        private String publicDomain; 

        private Builder() {
        } 

        private Builder(AuthInfoConfigValue model) {
            this.authToken = model.authToken;
            this.privateDomain = model.privateDomain;
            this.project = model.project;
            this.publicDomain = model.publicDomain;
        } 

        /**
         * AuthToken.
         */
        public Builder authToken(String authToken) {
            this.authToken = authToken;
            return this;
        }

        /**
         * PrivateDomain.
         */
        public Builder privateDomain(String privateDomain) {
            this.privateDomain = privateDomain;
            return this;
        }

        /**
         * Project.
         */
        public Builder project(String project) {
            this.project = project;
            return this;
        }

        /**
         * PublicDomain.
         */
        public Builder publicDomain(String publicDomain) {
            this.publicDomain = publicDomain;
            return this;
        }

        public AuthInfoConfigValue build() {
            return new AuthInfoConfigValue(this);
        } 

    } 

}
