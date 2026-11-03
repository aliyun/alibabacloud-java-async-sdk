// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

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
 * {@link WebTrafficConfig} extends {@link TeaModel}
 *
 * <p>WebTrafficConfig</p>
 */
public class WebTrafficConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AuthType")
    private String authType;

    @com.aliyun.core.annotation.NameInMap("DisableInternetURL")
    private Boolean disableInternetURL;

    @com.aliyun.core.annotation.NameInMap("RevisionsTrafficWeight")
    private java.util.Map<String, Float> revisionsTrafficWeight;

    @com.aliyun.core.annotation.NameInMap("WebAclConfig")
    private WebAclConfig webAclConfig;

    private WebTrafficConfig(Builder builder) {
        this.authType = builder.authType;
        this.disableInternetURL = builder.disableInternetURL;
        this.revisionsTrafficWeight = builder.revisionsTrafficWeight;
        this.webAclConfig = builder.webAclConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static WebTrafficConfig create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return authType
     */
    public String getAuthType() {
        return this.authType;
    }

    /**
     * @return disableInternetURL
     */
    public Boolean getDisableInternetURL() {
        return this.disableInternetURL;
    }

    /**
     * @return revisionsTrafficWeight
     */
    public java.util.Map<String, Float> getRevisionsTrafficWeight() {
        return this.revisionsTrafficWeight;
    }

    /**
     * @return webAclConfig
     */
    public WebAclConfig getWebAclConfig() {
        return this.webAclConfig;
    }

    public static final class Builder {
        private String authType; 
        private Boolean disableInternetURL; 
        private java.util.Map<String, Float> revisionsTrafficWeight; 
        private WebAclConfig webAclConfig; 

        private Builder() {
        } 

        private Builder(WebTrafficConfig model) {
            this.authType = model.authType;
            this.disableInternetURL = model.disableInternetURL;
            this.revisionsTrafficWeight = model.revisionsTrafficWeight;
            this.webAclConfig = model.webAclConfig;
        } 

        /**
         * <p>The authentication type. Valid values:</p>
         * <ul>
         * <li><strong>Anonymous</strong>: does not require authentication.</li>
         * <li><strong>Application</strong>: requires authentication.</li>
         * </ul>
         * <blockquote>
         * <p> The default value is <strong>Anonymous</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Anonymous</p>
         */
        public Builder authType(String authType) {
            this.authType = authType;
            return this;
        }

        /**
         * <p>Specifies whether to disable access to the default Internet domain. If you set this parameter to true, a 403 error is returned if you access the default public URL provided by the function. A value of false does not have affect the running of the function.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder disableInternetURL(Boolean disableInternetURL) {
            this.disableInternetURL = disableInternetURL;
            return this;
        }

        /**
         * <p>Specifies the traffic weight of applications in different versions. The sum of traffic weight for all versions must be 100%.</p>
         */
        public Builder revisionsTrafficWeight(java.util.Map<String, Float> revisionsTrafficWeight) {
            this.revisionsTrafficWeight = revisionsTrafficWeight;
            return this;
        }

        /**
         * <p>The configurations of IP ACL whitelist.</p>
         */
        public Builder webAclConfig(WebAclConfig webAclConfig) {
            this.webAclConfig = webAclConfig;
            return this;
        }

        public WebTrafficConfig build() {
            return new WebTrafficConfig(this);
        } 

    } 

}
