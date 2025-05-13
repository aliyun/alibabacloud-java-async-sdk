// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20240330.models;

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
 * {@link AlertEventIntegrationPolicyForView} extends {@link TeaModel}
 *
 * <p>AlertEventIntegrationPolicyForView</p>
 */
public class AlertEventIntegrationPolicyForView extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("alertEventIntegrationPolicyId")
    private String alertEventIntegrationPolicyId;

    @com.aliyun.core.annotation.NameInMap("alertEventIntegrationPolicyName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String alertEventIntegrationPolicyName;

    @com.aliyun.core.annotation.NameInMap("createTime")
    private String createTime;

    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("enable")
    private Boolean enable;

    @com.aliyun.core.annotation.NameInMap("filterSetting")
    private FilterSetting filterSetting;

    @com.aliyun.core.annotation.NameInMap("integrationSetting")
    private String integrationSetting;

    @com.aliyun.core.annotation.NameInMap("token")
    private String token;

    @com.aliyun.core.annotation.NameInMap("transformerSetting")
    private java.util.List<TransformAction> transformerSetting;

    @com.aliyun.core.annotation.NameInMap("type")
    private String type;

    @com.aliyun.core.annotation.NameInMap("updateTime")
    private String updateTime;

    @com.aliyun.core.annotation.NameInMap("userId")
    private String userId;

    @com.aliyun.core.annotation.NameInMap("workspace")
    private String workspace;

    private AlertEventIntegrationPolicyForView(Builder builder) {
        this.alertEventIntegrationPolicyId = builder.alertEventIntegrationPolicyId;
        this.alertEventIntegrationPolicyName = builder.alertEventIntegrationPolicyName;
        this.createTime = builder.createTime;
        this.description = builder.description;
        this.enable = builder.enable;
        this.filterSetting = builder.filterSetting;
        this.integrationSetting = builder.integrationSetting;
        this.token = builder.token;
        this.transformerSetting = builder.transformerSetting;
        this.type = builder.type;
        this.updateTime = builder.updateTime;
        this.userId = builder.userId;
        this.workspace = builder.workspace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AlertEventIntegrationPolicyForView create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return alertEventIntegrationPolicyId
     */
    public String getAlertEventIntegrationPolicyId() {
        return this.alertEventIntegrationPolicyId;
    }

    /**
     * @return alertEventIntegrationPolicyName
     */
    public String getAlertEventIntegrationPolicyName() {
        return this.alertEventIntegrationPolicyName;
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return enable
     */
    public Boolean getEnable() {
        return this.enable;
    }

    /**
     * @return filterSetting
     */
    public FilterSetting getFilterSetting() {
        return this.filterSetting;
    }

    /**
     * @return integrationSetting
     */
    public String getIntegrationSetting() {
        return this.integrationSetting;
    }

    /**
     * @return token
     */
    public String getToken() {
        return this.token;
    }

    /**
     * @return transformerSetting
     */
    public java.util.List<TransformAction> getTransformerSetting() {
        return this.transformerSetting;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * @return updateTime
     */
    public String getUpdateTime() {
        return this.updateTime;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    /**
     * @return workspace
     */
    public String getWorkspace() {
        return this.workspace;
    }

    public static final class Builder {
        private String alertEventIntegrationPolicyId; 
        private String alertEventIntegrationPolicyName; 
        private String createTime; 
        private String description; 
        private Boolean enable; 
        private FilterSetting filterSetting; 
        private String integrationSetting; 
        private String token; 
        private java.util.List<TransformAction> transformerSetting; 
        private String type; 
        private String updateTime; 
        private String userId; 
        private String workspace; 

        private Builder() {
        } 

        private Builder(AlertEventIntegrationPolicyForView model) {
            this.alertEventIntegrationPolicyId = model.alertEventIntegrationPolicyId;
            this.alertEventIntegrationPolicyName = model.alertEventIntegrationPolicyName;
            this.createTime = model.createTime;
            this.description = model.description;
            this.enable = model.enable;
            this.filterSetting = model.filterSetting;
            this.integrationSetting = model.integrationSetting;
            this.token = model.token;
            this.transformerSetting = model.transformerSetting;
            this.type = model.type;
            this.updateTime = model.updateTime;
            this.userId = model.userId;
            this.workspace = model.workspace;
        } 

        /**
         * alertEventIntegrationPolicyId.
         */
        public Builder alertEventIntegrationPolicyId(String alertEventIntegrationPolicyId) {
            this.alertEventIntegrationPolicyId = alertEventIntegrationPolicyId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder alertEventIntegrationPolicyName(String alertEventIntegrationPolicyName) {
            this.alertEventIntegrationPolicyName = alertEventIntegrationPolicyName;
            return this;
        }

        /**
         * createTime.
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * description.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * enable.
         */
        public Builder enable(Boolean enable) {
            this.enable = enable;
            return this;
        }

        /**
         * filterSetting.
         */
        public Builder filterSetting(FilterSetting filterSetting) {
            this.filterSetting = filterSetting;
            return this;
        }

        /**
         * integrationSetting.
         */
        public Builder integrationSetting(String integrationSetting) {
            this.integrationSetting = integrationSetting;
            return this;
        }

        /**
         * token.
         */
        public Builder token(String token) {
            this.token = token;
            return this;
        }

        /**
         * transformerSetting.
         */
        public Builder transformerSetting(java.util.List<TransformAction> transformerSetting) {
            this.transformerSetting = transformerSetting;
            return this;
        }

        /**
         * type.
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        /**
         * updateTime.
         */
        public Builder updateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        /**
         * userId.
         */
        public Builder userId(String userId) {
            this.userId = userId;
            return this;
        }

        /**
         * workspace.
         */
        public Builder workspace(String workspace) {
            this.workspace = workspace;
            return this;
        }

        public AlertEventIntegrationPolicyForView build() {
            return new AlertEventIntegrationPolicyForView(this);
        } 

    } 

}
