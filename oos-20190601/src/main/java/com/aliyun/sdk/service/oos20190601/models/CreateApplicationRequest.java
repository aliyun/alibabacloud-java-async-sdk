// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oos20190601.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateApplicationRequest} extends {@link RequestModel}
 *
 * <p>CreateApplicationRequest</p>
 */
public class CreateApplicationRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AlarmConfig")
    private AlarmConfig alarmConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApplicationSource")
    private String applicationSource;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceId")
    private String serviceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tags")
    private java.util.Map < String, ? > tags;

    private CreateApplicationRequest(Builder builder) {
        super(builder);
        this.alarmConfig = builder.alarmConfig;
        this.applicationSource = builder.applicationSource;
        this.clientToken = builder.clientToken;
        this.description = builder.description;
        this.name = builder.name;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.serviceId = builder.serviceId;
        this.tags = builder.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateApplicationRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return alarmConfig
     */
    public AlarmConfig getAlarmConfig() {
        return this.alarmConfig;
    }

    /**
     * @return applicationSource
     */
    public String getApplicationSource() {
        return this.applicationSource;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return serviceId
     */
    public String getServiceId() {
        return this.serviceId;
    }

    /**
     * @return tags
     */
    public java.util.Map < String, ? > getTags() {
        return this.tags;
    }

    public static final class Builder extends Request.Builder<CreateApplicationRequest, Builder> {
        private AlarmConfig alarmConfig; 
        private String applicationSource; 
        private String clientToken; 
        private String description; 
        private String name; 
        private String regionId; 
        private String resourceGroupId; 
        private String serviceId; 
        private java.util.Map < String, ? > tags; 

        private Builder() {
            super();
        } 

        private Builder(CreateApplicationRequest request) {
            super(request);
            this.alarmConfig = request.alarmConfig;
            this.applicationSource = request.applicationSource;
            this.clientToken = request.clientToken;
            this.description = request.description;
            this.name = request.name;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.serviceId = request.serviceId;
            this.tags = request.tags;
        } 

        /**
         * <p>The configurations of application alerts.</p>
         */
        public Builder alarmConfig(AlarmConfig alarmConfig) {
            String alarmConfigShrink = shrink(alarmConfig, "AlarmConfig", "json");
            this.putQueryParameter("AlarmConfig", alarmConfigShrink);
            this.alarmConfig = alarmConfig;
            return this;
        }

        /**
         * ApplicationSource.
         */
        public Builder applicationSource(String applicationSource) {
            this.putQueryParameter("ApplicationSource", applicationSource);
            this.applicationSource = applicationSource;
            return this;
        }

        /**
         * <p>The client token that is used to ensure the idempotence of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>TF-CreateApplication-1647587475-84104b89-eba5-47a8-b2fd-807b8b7d</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The description of the application.</p>
         * 
         * <strong>example:</strong>
         * <p>application</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The application name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>MyApplication</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The region ID. Set the value to cn-hangzhou.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The ID of the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmxsn4m******</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The ID of the service.</p>
         * 
         * <strong>example:</strong>
         * <p>service-79538e30e44541b699d8</p>
         */
        public Builder serviceId(String serviceId) {
            this.putQueryParameter("ServiceId", serviceId);
            this.serviceId = serviceId;
            return this;
        }

        /**
         * <p>The tags.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;k1&quot;:&quot;v1&quot;,&quot;k2&quot;:&quot;v2&quot;}</p>
         */
        public Builder tags(java.util.Map < String, ? > tags) {
            String tagsShrink = shrink(tags, "Tags", "json");
            this.putQueryParameter("Tags", tagsShrink);
            this.tags = tags;
            return this;
        }

        @Override
        public CreateApplicationRequest build() {
            return new CreateApplicationRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateApplicationRequest} extends {@link TeaModel}
     *
     * <p>CreateApplicationRequest</p>
     */
    public static class AlarmConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ContactGroups")
        private java.util.List < String > contactGroups;

        @com.aliyun.core.annotation.NameInMap("HealthCheckUrl")
        private String healthCheckUrl;

        @com.aliyun.core.annotation.NameInMap("TemplateIds")
        private java.util.List < String > templateIds;

        private AlarmConfig(Builder builder) {
            this.contactGroups = builder.contactGroups;
            this.healthCheckUrl = builder.healthCheckUrl;
            this.templateIds = builder.templateIds;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AlarmConfig create() {
            return builder().build();
        }

        /**
         * @return contactGroups
         */
        public java.util.List < String > getContactGroups() {
            return this.contactGroups;
        }

        /**
         * @return healthCheckUrl
         */
        public String getHealthCheckUrl() {
            return this.healthCheckUrl;
        }

        /**
         * @return templateIds
         */
        public java.util.List < String > getTemplateIds() {
            return this.templateIds;
        }

        public static final class Builder {
            private java.util.List < String > contactGroups; 
            private String healthCheckUrl; 
            private java.util.List < String > templateIds; 

            /**
             * <p>The alert contact groups.</p>
             */
            public Builder contactGroups(java.util.List < String > contactGroups) {
                this.contactGroups = contactGroups;
                return this;
            }

            /**
             * <p>The health check URL of the application.</p>
             * 
             * <strong>example:</strong>
             * <p>/healthcheck/tcp50122</p>
             */
            public Builder healthCheckUrl(String healthCheckUrl) {
                this.healthCheckUrl = healthCheckUrl;
                return this;
            }

            /**
             * <p>The alert templates.</p>
             */
            public Builder templateIds(java.util.List < String > templateIds) {
                this.templateIds = templateIds;
                return this;
            }

            public AlarmConfig build() {
                return new AlarmConfig(this);
            } 

        } 

    }
}
