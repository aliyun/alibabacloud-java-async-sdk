// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link WebApplication} extends {@link TeaModel}
 *
 * <p>WebApplication</p>
 */
public class WebApplication extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ApplicationId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 128, minLength = 1)
    private String applicationId;

    @com.aliyun.core.annotation.NameInMap("ApplicationName")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 128, minLength = 1)
    private String applicationName;

    @com.aliyun.core.annotation.NameInMap("CreatedTime")
    private String createdTime;

    @com.aliyun.core.annotation.NameInMap("Description")
    @com.aliyun.core.annotation.Validation(maxLength = 256)
    private String description;

    @com.aliyun.core.annotation.NameInMap("InternetURL")
    private String internetURL;

    @com.aliyun.core.annotation.NameInMap("IntranetURL")
    private String intranetURL;

    @com.aliyun.core.annotation.NameInMap("LastModifiedTime")
    private String lastModifiedTime;

    @com.aliyun.core.annotation.NameInMap("NamespaceId")
    private String namespaceId;

    @com.aliyun.core.annotation.NameInMap("RevisionConfig")
    private RevisionConfig revisionConfig;

    @com.aliyun.core.annotation.NameInMap("VpcId")
    private String vpcId;

    @com.aliyun.core.annotation.NameInMap("WebScalingConfig")
    private WebScalingConfig webScalingConfig;

    @com.aliyun.core.annotation.NameInMap("WebTrafficConfig")
    private WebTrafficConfig webTrafficConfig;

    private WebApplication(Builder builder) {
        this.applicationId = builder.applicationId;
        this.applicationName = builder.applicationName;
        this.createdTime = builder.createdTime;
        this.description = builder.description;
        this.internetURL = builder.internetURL;
        this.intranetURL = builder.intranetURL;
        this.lastModifiedTime = builder.lastModifiedTime;
        this.namespaceId = builder.namespaceId;
        this.revisionConfig = builder.revisionConfig;
        this.vpcId = builder.vpcId;
        this.webScalingConfig = builder.webScalingConfig;
        this.webTrafficConfig = builder.webTrafficConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static WebApplication create() {
        return builder().build();
    }

    /**
     * @return applicationId
     */
    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * @return applicationName
     */
    public String getApplicationName() {
        return this.applicationName;
    }

    /**
     * @return createdTime
     */
    public String getCreatedTime() {
        return this.createdTime;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return internetURL
     */
    public String getInternetURL() {
        return this.internetURL;
    }

    /**
     * @return intranetURL
     */
    public String getIntranetURL() {
        return this.intranetURL;
    }

    /**
     * @return lastModifiedTime
     */
    public String getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    /**
     * @return namespaceId
     */
    public String getNamespaceId() {
        return this.namespaceId;
    }

    /**
     * @return revisionConfig
     */
    public RevisionConfig getRevisionConfig() {
        return this.revisionConfig;
    }

    /**
     * @return vpcId
     */
    public String getVpcId() {
        return this.vpcId;
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
        private String applicationId; 
        private String applicationName; 
        private String createdTime; 
        private String description; 
        private String internetURL; 
        private String intranetURL; 
        private String lastModifiedTime; 
        private String namespaceId; 
        private RevisionConfig revisionConfig; 
        private String vpcId; 
        private WebScalingConfig webScalingConfig; 
        private WebTrafficConfig webTrafficConfig; 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder applicationId(String applicationId) {
            this.applicationId = applicationId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder applicationName(String applicationName) {
            this.applicationName = applicationName;
            return this;
        }

        /**
         * CreatedTime.
         */
        public Builder createdTime(String createdTime) {
            this.createdTime = createdTime;
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
         * InternetURL.
         */
        public Builder internetURL(String internetURL) {
            this.internetURL = internetURL;
            return this;
        }

        /**
         * IntranetURL.
         */
        public Builder intranetURL(String intranetURL) {
            this.intranetURL = intranetURL;
            return this;
        }

        /**
         * LastModifiedTime.
         */
        public Builder lastModifiedTime(String lastModifiedTime) {
            this.lastModifiedTime = lastModifiedTime;
            return this;
        }

        /**
         * NamespaceId.
         */
        public Builder namespaceId(String namespaceId) {
            this.namespaceId = namespaceId;
            return this;
        }

        /**
         * RevisionConfig.
         */
        public Builder revisionConfig(RevisionConfig revisionConfig) {
            this.revisionConfig = revisionConfig;
            return this;
        }

        /**
         * VpcId.
         */
        public Builder vpcId(String vpcId) {
            this.vpcId = vpcId;
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

        public WebApplication build() {
            return new WebApplication(this);
        } 

    } 

}
