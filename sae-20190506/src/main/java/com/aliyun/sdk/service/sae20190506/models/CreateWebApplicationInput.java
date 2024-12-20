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
 * {@link CreateWebApplicationInput} extends {@link TeaModel}
 *
 * <p>CreateWebApplicationInput</p>
 */
public class CreateWebApplicationInput extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ApplicationName")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 128, minLength = 1)
    private String applicationName;

    @com.aliyun.core.annotation.NameInMap("Description")
    @com.aliyun.core.annotation.Validation(maxLength = 256)
    private String description;

    @com.aliyun.core.annotation.NameInMap("RevisionConfig")
    @com.aliyun.core.annotation.Validation(required = true)
    private RevisionConfig revisionConfig;

    @com.aliyun.core.annotation.NameInMap("WebNetworkConfig")
    private WebNetworkConfig webNetworkConfig;

    @com.aliyun.core.annotation.NameInMap("WebScalingConfig")
    private WebScalingConfig webScalingConfig;

    @com.aliyun.core.annotation.NameInMap("WebTrafficConfig")
    private WebTrafficConfig webTrafficConfig;

    private CreateWebApplicationInput(Builder builder) {
        this.applicationName = builder.applicationName;
        this.description = builder.description;
        this.revisionConfig = builder.revisionConfig;
        this.webNetworkConfig = builder.webNetworkConfig;
        this.webScalingConfig = builder.webScalingConfig;
        this.webTrafficConfig = builder.webTrafficConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateWebApplicationInput create() {
        return builder().build();
    }

    /**
     * @return applicationName
     */
    public String getApplicationName() {
        return this.applicationName;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return revisionConfig
     */
    public RevisionConfig getRevisionConfig() {
        return this.revisionConfig;
    }

    /**
     * @return webNetworkConfig
     */
    public WebNetworkConfig getWebNetworkConfig() {
        return this.webNetworkConfig;
    }

    /**
     * @return webScalingConfig
     */
    public WebScalingConfig getWebScalingConfig() {
        return this.webScalingConfig;
    }

    /**
     * @return webTrafficConfig
     */
    public WebTrafficConfig getWebTrafficConfig() {
        return this.webTrafficConfig;
    }

    public static final class Builder {
        private String applicationName; 
        private String description; 
        private RevisionConfig revisionConfig; 
        private WebNetworkConfig webNetworkConfig; 
        private WebScalingConfig webScalingConfig; 
        private WebTrafficConfig webTrafficConfig; 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>sae-app</p>
         */
        public Builder applicationName(String applicationName) {
            this.applicationName = applicationName;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder revisionConfig(RevisionConfig revisionConfig) {
            this.revisionConfig = revisionConfig;
            return this;
        }

        /**
         * WebNetworkConfig.
         */
        public Builder webNetworkConfig(WebNetworkConfig webNetworkConfig) {
            this.webNetworkConfig = webNetworkConfig;
            return this;
        }

        /**
         * WebScalingConfig.
         */
        public Builder webScalingConfig(WebScalingConfig webScalingConfig) {
            this.webScalingConfig = webScalingConfig;
            return this;
        }

        /**
         * WebTrafficConfig.
         */
        public Builder webTrafficConfig(WebTrafficConfig webTrafficConfig) {
            this.webTrafficConfig = webTrafficConfig;
            return this;
        }

        public CreateWebApplicationInput build() {
            return new CreateWebApplicationInput(this);
        } 

    } 

}
