// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oos20190601.models;

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
 * {@link UpdateApplicationRequest} extends {@link RequestModel}
 *
 * <p>UpdateApplicationRequest</p>
 */
public class UpdateApplicationRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AlarmConfig")
    private AlarmConfig alarmConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeleteAlarmRulesBeforeUpdate")
    private Boolean deleteAlarmRulesBeforeUpdate;

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
    @com.aliyun.core.annotation.NameInMap("Tags")
    private java.util.Map<String, ?> tags;

    private UpdateApplicationRequest(Builder builder) {
        super(builder);
        this.alarmConfig = builder.alarmConfig;
        this.deleteAlarmRulesBeforeUpdate = builder.deleteAlarmRulesBeforeUpdate;
        this.description = builder.description;
        this.name = builder.name;
        this.regionId = builder.regionId;
        this.tags = builder.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateApplicationRequest create() {
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
     * @return deleteAlarmRulesBeforeUpdate
     */
    public Boolean getDeleteAlarmRulesBeforeUpdate() {
        return this.deleteAlarmRulesBeforeUpdate;
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
     * @return tags
     */
    public java.util.Map<String, ?> getTags() {
        return this.tags;
    }

    public static final class Builder extends Request.Builder<UpdateApplicationRequest, Builder> {
        private AlarmConfig alarmConfig; 
        private Boolean deleteAlarmRulesBeforeUpdate; 
        private String description; 
        private String name; 
        private String regionId; 
        private java.util.Map<String, ?> tags; 

        private Builder() {
            super();
        } 

        private Builder(UpdateApplicationRequest request) {
            super(request);
            this.alarmConfig = request.alarmConfig;
            this.deleteAlarmRulesBeforeUpdate = request.deleteAlarmRulesBeforeUpdate;
            this.description = request.description;
            this.name = request.name;
            this.regionId = request.regionId;
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
         * <p>Specifies whether to delete existing alert rules before applying the alert template. Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder deleteAlarmRulesBeforeUpdate(Boolean deleteAlarmRulesBeforeUpdate) {
            this.putQueryParameter("DeleteAlarmRulesBeforeUpdate", deleteAlarmRulesBeforeUpdate);
            this.deleteAlarmRulesBeforeUpdate = deleteAlarmRulesBeforeUpdate;
            return this;
        }

        /**
         * <p>The description to be updated for the application.</p>
         * 
         * <strong>example:</strong>
         * <p>test application</p>
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
         * <p>My-Application</p>
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
         * <p>The tags.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;k1&quot;:&quot;v1&quot;,&quot;k2&quot;:&quot;v2&quot;}</p>
         */
        public Builder tags(java.util.Map<String, ?> tags) {
            String tagsShrink = shrink(tags, "Tags", "json");
            this.putQueryParameter("Tags", tagsShrink);
            this.tags = tags;
            return this;
        }

        @Override
        public UpdateApplicationRequest build() {
            return new UpdateApplicationRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateApplicationRequest} extends {@link TeaModel}
     *
     * <p>UpdateApplicationRequest</p>
     */
    public static class AlarmConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ContactGroups")
        private java.util.List<String> contactGroups;

        @com.aliyun.core.annotation.NameInMap("HealthCheckUrl")
        private String healthCheckUrl;

        @com.aliyun.core.annotation.NameInMap("TemplateIds")
        private java.util.List<String> templateIds;

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
        public java.util.List<String> getContactGroups() {
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
        public java.util.List<String> getTemplateIds() {
            return this.templateIds;
        }

        public static final class Builder {
            private java.util.List<String> contactGroups; 
            private String healthCheckUrl; 
            private java.util.List<String> templateIds; 

            private Builder() {
            } 

            private Builder(AlarmConfig model) {
                this.contactGroups = model.contactGroups;
                this.healthCheckUrl = model.healthCheckUrl;
                this.templateIds = model.templateIds;
            } 

            /**
             * <p>The alert contact groups.</p>
             */
            public Builder contactGroups(java.util.List<String> contactGroups) {
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
            public Builder templateIds(java.util.List<String> templateIds) {
                this.templateIds = templateIds;
                return this;
            }

            public AlarmConfig build() {
                return new AlarmConfig(this);
            } 

        } 

    }
}
