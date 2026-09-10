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
         * <p>The universally unique identifier (UUID).</p>
         * 
         * <strong>example:</strong>
         * <p>123123123</p>
         */
        public Builder alertEventIntegrationPolicyId(String alertEventIntegrationPolicyId) {
            this.alertEventIntegrationPolicyId = alertEventIntegrationPolicyId;
            return this;
        }

        /**
         * <p>The name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>集成名</p>
         */
        public Builder alertEventIntegrationPolicyName(String alertEventIntegrationPolicyName) {
            this.alertEventIntegrationPolicyName = alertEventIntegrationPolicyName;
            return this;
        }

        /**
         * <p>The time when the policy was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-03-11T08:21:58Z</p>
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * <p>The description.</p>
         * 
         * <strong>example:</strong>
         * <p>workspace test</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>Indicates whether the policy is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enable(Boolean enable) {
            this.enable = enable;
            return this;
        }

        /**
         * <p>The filter configuration.</p>
         */
        public Builder filterSetting(FilterSetting filterSetting) {
            this.filterSetting = filterSetting;
            return this;
        }

        /**
         * <p>The subscription settings.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;region&quot;:&quot;cn-hangzhou&quot;}</p>
         */
        public Builder integrationSetting(String integrationSetting) {
            this.integrationSetting = integrationSetting;
            return this;
        }

        /**
         * <p>The key for the integration\&quot;s reporting endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p>10-16818f1445e10a1d012922b285bfb334</p>
         */
        public Builder token(String token) {
            this.token = token;
            return this;
        }

        /**
         * <p>The transformation settings.</p>
         */
        public Builder transformerSetting(java.util.List<TransformAction> transformerSetting) {
            this.transformerSetting = transformerSetting;
            return this;
        }

        /**
         * <p>The type.</p>
         * 
         * <strong>example:</strong>
         * <p>ALERT_CUSTOM</p>
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        /**
         * <p>The time when the policy was last updated.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-12-16T02:00:23Z</p>
         */
        public Builder updateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        /**
         * <p>The user ID.</p>
         * 
         * <strong>example:</strong>
         * <p>123123</p>
         */
        public Builder userId(String userId) {
            this.userId = userId;
            return this;
        }

        /**
         * <p>The workspace.</p>
         * 
         * <strong>example:</strong>
         * <p>workspace-test</p>
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
