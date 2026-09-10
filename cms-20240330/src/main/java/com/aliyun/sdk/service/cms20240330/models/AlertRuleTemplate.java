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
 * {@link AlertRuleTemplate} extends {@link TeaModel}
 *
 * <p>AlertRuleTemplate</p>
 */
public class AlertRuleTemplate extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("alertType")
    private String alertType;

    @com.aliyun.core.annotation.NameInMap("applyCount")
    private Long applyCount;

    @com.aliyun.core.annotation.NameInMap("bizType")
    private String bizType;

    @com.aliyun.core.annotation.NameInMap("datasource")
    private String datasource;

    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("gmtCreate")
    private Long gmtCreate;

    @com.aliyun.core.annotation.NameInMap("gmtModified")
    private Long gmtModified;

    @com.aliyun.core.annotation.NameInMap("id")
    private Long id;

    @com.aliyun.core.annotation.NameInMap("isSystem")
    private Integer isSystem;

    @com.aliyun.core.annotation.NameInMap("labels")
    private String labels;

    @com.aliyun.core.annotation.NameInMap("namespace")
    private String namespace;

    @com.aliyun.core.annotation.NameInMap("productCategory")
    private String productCategory;

    @com.aliyun.core.annotation.NameInMap("ruleConfigs")
    private String ruleConfigs;

    @com.aliyun.core.annotation.NameInMap("scenes")
    private String scenes;

    @com.aliyun.core.annotation.NameInMap("schemaVersion")
    private String schemaVersion;

    @com.aliyun.core.annotation.NameInMap("sourceType")
    private String sourceType;

    @com.aliyun.core.annotation.NameInMap("status")
    private Integer status;

    @com.aliyun.core.annotation.NameInMap("subType")
    private String subType;

    @com.aliyun.core.annotation.NameInMap("templateName")
    private String templateName;

    @com.aliyun.core.annotation.NameInMap("userId")
    private String userId;

    @com.aliyun.core.annotation.NameInMap("uuid")
    private String uuid;

    private AlertRuleTemplate(Builder builder) {
        this.alertType = builder.alertType;
        this.applyCount = builder.applyCount;
        this.bizType = builder.bizType;
        this.datasource = builder.datasource;
        this.description = builder.description;
        this.gmtCreate = builder.gmtCreate;
        this.gmtModified = builder.gmtModified;
        this.id = builder.id;
        this.isSystem = builder.isSystem;
        this.labels = builder.labels;
        this.namespace = builder.namespace;
        this.productCategory = builder.productCategory;
        this.ruleConfigs = builder.ruleConfigs;
        this.scenes = builder.scenes;
        this.schemaVersion = builder.schemaVersion;
        this.sourceType = builder.sourceType;
        this.status = builder.status;
        this.subType = builder.subType;
        this.templateName = builder.templateName;
        this.userId = builder.userId;
        this.uuid = builder.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AlertRuleTemplate create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return alertType
     */
    public String getAlertType() {
        return this.alertType;
    }

    /**
     * @return applyCount
     */
    public Long getApplyCount() {
        return this.applyCount;
    }

    /**
     * @return bizType
     */
    public String getBizType() {
        return this.bizType;
    }

    /**
     * @return datasource
     */
    public String getDatasource() {
        return this.datasource;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return gmtCreate
     */
    public Long getGmtCreate() {
        return this.gmtCreate;
    }

    /**
     * @return gmtModified
     */
    public Long getGmtModified() {
        return this.gmtModified;
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return isSystem
     */
    public Integer getIsSystem() {
        return this.isSystem;
    }

    /**
     * @return labels
     */
    public String getLabels() {
        return this.labels;
    }

    /**
     * @return namespace
     */
    public String getNamespace() {
        return this.namespace;
    }

    /**
     * @return productCategory
     */
    public String getProductCategory() {
        return this.productCategory;
    }

    /**
     * @return ruleConfigs
     */
    public String getRuleConfigs() {
        return this.ruleConfigs;
    }

    /**
     * @return scenes
     */
    public String getScenes() {
        return this.scenes;
    }

    /**
     * @return schemaVersion
     */
    public String getSchemaVersion() {
        return this.schemaVersion;
    }

    /**
     * @return sourceType
     */
    public String getSourceType() {
        return this.sourceType;
    }

    /**
     * @return status
     */
    public Integer getStatus() {
        return this.status;
    }

    /**
     * @return subType
     */
    public String getSubType() {
        return this.subType;
    }

    /**
     * @return templateName
     */
    public String getTemplateName() {
        return this.templateName;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    /**
     * @return uuid
     */
    public String getUuid() {
        return this.uuid;
    }

    public static final class Builder {
        private String alertType; 
        private Long applyCount; 
        private String bizType; 
        private String datasource; 
        private String description; 
        private Long gmtCreate; 
        private Long gmtModified; 
        private Long id; 
        private Integer isSystem; 
        private String labels; 
        private String namespace; 
        private String productCategory; 
        private String ruleConfigs; 
        private String scenes; 
        private String schemaVersion; 
        private String sourceType; 
        private Integer status; 
        private String subType; 
        private String templateName; 
        private String userId; 
        private String uuid; 

        private Builder() {
        } 

        private Builder(AlertRuleTemplate model) {
            this.alertType = model.alertType;
            this.applyCount = model.applyCount;
            this.bizType = model.bizType;
            this.datasource = model.datasource;
            this.description = model.description;
            this.gmtCreate = model.gmtCreate;
            this.gmtModified = model.gmtModified;
            this.id = model.id;
            this.isSystem = model.isSystem;
            this.labels = model.labels;
            this.namespace = model.namespace;
            this.productCategory = model.productCategory;
            this.ruleConfigs = model.ruleConfigs;
            this.scenes = model.scenes;
            this.schemaVersion = model.schemaVersion;
            this.sourceType = model.sourceType;
            this.status = model.status;
            this.subType = model.subType;
            this.templateName = model.templateName;
            this.userId = model.userId;
            this.uuid = model.uuid;
        } 

        /**
         * <p>The alert type.</p>
         * 
         * <strong>example:</strong>
         * <p>METRIC_SET</p>
         */
        public Builder alertType(String alertType) {
            this.alertType = alertType;
            return this;
        }

        /**
         * <p>The number of rules that have been applied from this template.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder applyCount(Long applyCount) {
            this.applyCount = applyCount;
            return this;
        }

        /**
         * <p>The business type.</p>
         * 
         * <strong>example:</strong>
         * <p>ALERT</p>
         */
        public Builder bizType(String bizType) {
            this.bizType = bizType;
            return this;
        }

        /**
         * <p>The data source, in JSON string format.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;type&quot;:&quot;SLS&quot;,&quot;project&quot;:&quot;my-project&quot;}</p>
         */
        public Builder datasource(String datasource) {
            this.datasource = datasource;
            return this;
        }

        /**
         * <p>The template description.</p>
         * 
         * <strong>example:</strong>
         * <p>Triggers an alert when the CPU usage of an ECS instance exceeds the threshold</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>The creation time, in UNIX millisecond timestamp format.</p>
         * 
         * <strong>example:</strong>
         * <p>1700000000000</p>
         */
        public Builder gmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }

        /**
         * <p>The last modified time, in UNIX millisecond timestamp format.</p>
         * 
         * <strong>example:</strong>
         * <p>1700000000000</p>
         */
        public Builder gmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }

        /**
         * <p>The template ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1001</p>
         */
        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        /**
         * <p>Indicates whether the template is a system template. Valid values: 1: yes. 0: no.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder isSystem(Integer isSystem) {
            this.isSystem = isSystem;
            return this;
        }

        /**
         * <p>The labels, in JSON string format.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;env&quot;:&quot;prod&quot;,&quot;team&quot;:&quot;ops&quot;}</p>
         */
        public Builder labels(String labels) {
            this.labels = labels;
            return this;
        }

        /**
         * <p>The namespace.</p>
         * 
         * <strong>example:</strong>
         * <p>acs_ecs_dashboard</p>
         */
        public Builder namespace(String namespace) {
            this.namespace = namespace;
            return this;
        }

        /**
         * <p>The cloud service category.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs</p>
         */
        public Builder productCategory(String productCategory) {
            this.productCategory = productCategory;
            return this;
        }

        /**
         * <p>The rule configurations, in JSON string format.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;threshold&quot;:80,&quot;duration&quot;:60}</p>
         */
        public Builder ruleConfigs(String ruleConfigs) {
            this.ruleConfigs = ruleConfigs;
            return this;
        }

        /**
         * <p>The applicable scenarios.</p>
         * 
         * <strong>example:</strong>
         * <p>ECS</p>
         */
        public Builder scenes(String scenes) {
            this.scenes = scenes;
            return this;
        }

        /**
         * <p>The schema version.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0</p>
         */
        public Builder schemaVersion(String schemaVersion) {
            this.schemaVersion = schemaVersion;
            return this;
        }

        /**
         * <p>The source type.</p>
         * 
         * <strong>example:</strong>
         * <p>SYSTEM</p>
         */
        public Builder sourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }

        /**
         * <p>The template status. Valid values: 1: enabled. 0: disabled.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder status(Integer status) {
            this.status = status;
            return this;
        }

        /**
         * <p>The subtype.</p>
         * 
         * <strong>example:</strong>
         * <p>THRESHOLD</p>
         */
        public Builder subType(String subType) {
            this.subType = subType;
            return this;
        }

        /**
         * <p>The template name.</p>
         * 
         * <strong>example:</strong>
         * <p>ECS CPU Usage Alert Template</p>
         */
        public Builder templateName(String templateName) {
            this.templateName = templateName;
            return this;
        }

        /**
         * <p>The ID of the user to whom the template belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>1234567890</p>
         */
        public Builder userId(String userId) {
            this.userId = userId;
            return this;
        }

        /**
         * <p>The template UUID.</p>
         * 
         * <strong>example:</strong>
         * <p>a1b2c3d4-e5f6-7890-abcd-ef1234567890</p>
         */
        public Builder uuid(String uuid) {
            this.uuid = uuid;
            return this;
        }

        public AlertRuleTemplate build() {
            return new AlertRuleTemplate(this);
        } 

    } 

}
