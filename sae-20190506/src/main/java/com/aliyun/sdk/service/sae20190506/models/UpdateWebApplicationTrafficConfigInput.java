// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateWebApplicationTrafficConfigInput} extends {@link TeaModel}
 *
 * <p>UpdateWebApplicationTrafficConfigInput</p>
 */
public class UpdateWebApplicationTrafficConfigInput extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AuthType")
    private String authType;

    @com.aliyun.core.annotation.NameInMap("DisableURLInternet")
    private Boolean disableURLInternet;

    @com.aliyun.core.annotation.NameInMap("RevisionsTrafficWeight")
    private java.util.Map < String, Float > revisionsTrafficWeight;

    @com.aliyun.core.annotation.NameInMap("WebAclConfig")
    private WebAclConfig webAclConfig;

    private UpdateWebApplicationTrafficConfigInput(Builder builder) {
        this.authType = builder.authType;
        this.disableURLInternet = builder.disableURLInternet;
        this.revisionsTrafficWeight = builder.revisionsTrafficWeight;
        this.webAclConfig = builder.webAclConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateWebApplicationTrafficConfigInput create() {
        return builder().build();
    }

    /**
     * @return authType
     */
    public String getAuthType() {
        return this.authType;
    }

    /**
     * @return disableURLInternet
     */
    public Boolean getDisableURLInternet() {
        return this.disableURLInternet;
    }

    /**
     * @return revisionsTrafficWeight
     */
    public java.util.Map < String, Float > getRevisionsTrafficWeight() {
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
        private Boolean disableURLInternet; 
        private java.util.Map < String, Float > revisionsTrafficWeight; 
        private WebAclConfig webAclConfig; 

        /**
         * AuthType.
         */
        public Builder authType(String authType) {
            this.authType = authType;
            return this;
        }

        /**
         * DisableURLInternet.
         */
        public Builder disableURLInternet(Boolean disableURLInternet) {
            this.disableURLInternet = disableURLInternet;
            return this;
        }

        /**
         * RevisionsTrafficWeight.
         */
        public Builder revisionsTrafficWeight(java.util.Map < String, Float > revisionsTrafficWeight) {
            this.revisionsTrafficWeight = revisionsTrafficWeight;
            return this;
        }

        /**
         * WebAclConfig.
         */
        public Builder webAclConfig(WebAclConfig webAclConfig) {
            this.webAclConfig = webAclConfig;
            return this;
        }

        public UpdateWebApplicationTrafficConfigInput build() {
            return new UpdateWebApplicationTrafficConfigInput(this);
        } 

    } 

}
