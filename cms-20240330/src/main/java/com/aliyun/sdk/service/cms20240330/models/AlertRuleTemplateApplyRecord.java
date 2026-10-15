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
 * {@link AlertRuleTemplateApplyRecord} extends {@link TeaModel}
 *
 * <p>AlertRuleTemplateApplyRecord</p>
 */
public class AlertRuleTemplateApplyRecord extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("applyConfig")
    private String applyConfig;

    @com.aliyun.core.annotation.NameInMap("gmtCreate")
    private Long gmtCreate;

    @com.aliyun.core.annotation.NameInMap("gmtModified")
    private Long gmtModified;

    @com.aliyun.core.annotation.NameInMap("id")
    private Long id;

    @com.aliyun.core.annotation.NameInMap("regionId")
    private String regionId;

    @com.aliyun.core.annotation.NameInMap("ruleId")
    private String ruleId;

    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("templateUuid")
    private String templateUuid;

    @com.aliyun.core.annotation.NameInMap("userId")
    private String userId;

    private AlertRuleTemplateApplyRecord(Builder builder) {
        this.applyConfig = builder.applyConfig;
        this.gmtCreate = builder.gmtCreate;
        this.gmtModified = builder.gmtModified;
        this.id = builder.id;
        this.regionId = builder.regionId;
        this.ruleId = builder.ruleId;
        this.status = builder.status;
        this.templateUuid = builder.templateUuid;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AlertRuleTemplateApplyRecord create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applyConfig
     */
    public String getApplyConfig() {
        return this.applyConfig;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return ruleId
     */
    public String getRuleId() {
        return this.ruleId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return templateUuid
     */
    public String getTemplateUuid() {
        return this.templateUuid;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    public static final class Builder {
        private String applyConfig; 
        private Long gmtCreate; 
        private Long gmtModified; 
        private Long id; 
        private String regionId; 
        private String ruleId; 
        private String status; 
        private String templateUuid; 
        private String userId; 

        private Builder() {
        } 

        private Builder(AlertRuleTemplateApplyRecord model) {
            this.applyConfig = model.applyConfig;
            this.gmtCreate = model.gmtCreate;
            this.gmtModified = model.gmtModified;
            this.id = model.id;
            this.regionId = model.regionId;
            this.ruleId = model.ruleId;
            this.status = model.status;
            this.templateUuid = model.templateUuid;
            this.userId = model.userId;
        } 

        /**
         * <p>The effective configuration for the rule application.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;workspace&quot;:&quot;ws-1&quot;,&quot;displayName&quot;:&quot;CPU alert&quot;}</p>
         */
        public Builder applyConfig(String applyConfig) {
            this.applyConfig = applyConfig;
            return this;
        }

        /**
         * <p>The time when the record was created.</p>
         * 
         * <strong>example:</strong>
         * <p>1680861352600</p>
         */
        public Builder gmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }

        /**
         * <p>The time when the record was updated.</p>
         * 
         * <strong>example:</strong>
         * <p>1680861352600</p>
         */
        public Builder gmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }

        /**
         * <p>The record ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The rule ID.</p>
         * 
         * <strong>example:</strong>
         * <p>12345</p>
         */
        public Builder ruleId(String ruleId) {
            this.ruleId = ruleId;
            return this;
        }

        /**
         * <p>The status.</p>
         * 
         * <strong>example:</strong>
         * <p>SUCCESS</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>The UUID of the alert rule template.</p>
         * 
         * <strong>example:</strong>
         * <p>template-prometheus-ack-node-cpu-usage-exceeds-85</p>
         */
        public Builder templateUuid(String templateUuid) {
            this.templateUuid = templateUuid;
            return this;
        }

        /**
         * <p>The user ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1654218965343050</p>
         */
        public Builder userId(String userId) {
            this.userId = userId;
            return this;
        }

        public AlertRuleTemplateApplyRecord build() {
            return new AlertRuleTemplateApplyRecord(this);
        } 

    } 

}
