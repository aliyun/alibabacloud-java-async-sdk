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

    @com.aliyun.core.annotation.NameInMap("ruleConfigs")
    private String ruleConfigs;

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
        this.description = builder.description;
        this.gmtCreate = builder.gmtCreate;
        this.gmtModified = builder.gmtModified;
        this.id = builder.id;
        this.isSystem = builder.isSystem;
        this.labels = builder.labels;
        this.ruleConfigs = builder.ruleConfigs;
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
     * @return ruleConfigs
     */
    public String getRuleConfigs() {
        return this.ruleConfigs;
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
        private String description; 
        private Long gmtCreate; 
        private Long gmtModified; 
        private Long id; 
        private Integer isSystem; 
        private String labels; 
        private String ruleConfigs; 
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
            this.description = model.description;
            this.gmtCreate = model.gmtCreate;
            this.gmtModified = model.gmtModified;
            this.id = model.id;
            this.isSystem = model.isSystem;
            this.labels = model.labels;
            this.ruleConfigs = model.ruleConfigs;
            this.status = model.status;
            this.subType = model.subType;
            this.templateName = model.templateName;
            this.userId = model.userId;
            this.uuid = model.uuid;
        } 

        /**
         * alertType.
         */
        public Builder alertType(String alertType) {
            this.alertType = alertType;
            return this;
        }

        /**
         * applyCount.
         */
        public Builder applyCount(Long applyCount) {
            this.applyCount = applyCount;
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
         * gmtCreate.
         */
        public Builder gmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }

        /**
         * gmtModified.
         */
        public Builder gmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }

        /**
         * id.
         */
        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        /**
         * isSystem.
         */
        public Builder isSystem(Integer isSystem) {
            this.isSystem = isSystem;
            return this;
        }

        /**
         * labels.
         */
        public Builder labels(String labels) {
            this.labels = labels;
            return this;
        }

        /**
         * ruleConfigs.
         */
        public Builder ruleConfigs(String ruleConfigs) {
            this.ruleConfigs = ruleConfigs;
            return this;
        }

        /**
         * status.
         */
        public Builder status(Integer status) {
            this.status = status;
            return this;
        }

        /**
         * subType.
         */
        public Builder subType(String subType) {
            this.subType = subType;
            return this;
        }

        /**
         * templateName.
         */
        public Builder templateName(String templateName) {
            this.templateName = templateName;
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
         * uuid.
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
