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
    private java.util.Map<String, Float> revisionsTrafficWeight;

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
     * @return disableURLInternet
     */
    public Boolean getDisableURLInternet() {
        return this.disableURLInternet;
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
        private Boolean disableURLInternet; 
        private java.util.Map<String, Float> revisionsTrafficWeight; 
        private WebAclConfig webAclConfig; 

        private Builder() {
        } 

        private Builder(UpdateWebApplicationTrafficConfigInput model) {
            this.authType = model.authType;
            this.disableURLInternet = model.disableURLInternet;
            this.revisionsTrafficWeight = model.revisionsTrafficWeight;
            this.webAclConfig = model.webAclConfig;
        } 

        /**
         * <p>The authentication type. Valid values: Anonymous (default): does not require authentication. Application: requires authentication.</p>
         * 
         * <strong>example:</strong>
         * <p>Anonymous</p>
         */
        public Builder authType(String authType) {
            this.authType = authType;
            return this;
        }

        /**
         * <p>Specifies whether to disable access to the default Internet domain. If you set this parameter to true, a 403 error is returned if you access the default public URL provided by the application. A value of false does not have affect the running of the function.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder disableURLInternet(Boolean disableURLInternet) {
            this.disableURLInternet = disableURLInternet;
            return this;
        }

        /**
         * <p>The traffic distribution for the application versions. The sum of traffic percentages for all versions must be equal to 1.</p>
         */
        public Builder revisionsTrafficWeight(java.util.Map<String, Float> revisionsTrafficWeight) {
            this.revisionsTrafficWeight = revisionsTrafficWeight;
            return this;
        }

        /**
         * <p>The configurations of the access control list (ACL) that consists of IP addresses.</p>
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
