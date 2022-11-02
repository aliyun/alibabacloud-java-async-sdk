// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyDefenseRuleStatusRequest} extends {@link RequestModel}
 *
 * <p>ModifyDefenseRuleStatusRequest</p>
 */
public class ModifyDefenseRuleStatusRequest extends Request {
    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("RuleId")
    @Validation(required = true)
    private Long ruleId;

    @Query
    @NameInMap("RuleStatus")
    @Validation(required = true)
    private Integer ruleStatus;

    @Query
    @NameInMap("TemplateId")
    @Validation(required = true)
    private Long templateId;

    private ModifyDefenseRuleStatusRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.ruleId = builder.ruleId;
        this.ruleStatus = builder.ruleStatus;
        this.templateId = builder.templateId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDefenseRuleStatusRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return ruleId
     */
    public Long getRuleId() {
        return this.ruleId;
    }

    /**
     * @return ruleStatus
     */
    public Integer getRuleStatus() {
        return this.ruleStatus;
    }

    /**
     * @return templateId
     */
    public Long getTemplateId() {
        return this.templateId;
    }

    public static final class Builder extends Request.Builder<ModifyDefenseRuleStatusRequest, Builder> {
        private String instanceId; 
        private Long ruleId; 
        private Integer ruleStatus; 
        private Long templateId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyDefenseRuleStatusRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.ruleId = request.ruleId;
            this.ruleStatus = request.ruleStatus;
            this.templateId = request.templateId;
        } 

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * RuleId.
         */
        public Builder ruleId(Long ruleId) {
            this.putQueryParameter("RuleId", ruleId);
            this.ruleId = ruleId;
            return this;
        }

        /**
         * RuleStatus.
         */
        public Builder ruleStatus(Integer ruleStatus) {
            this.putQueryParameter("RuleStatus", ruleStatus);
            this.ruleStatus = ruleStatus;
            return this;
        }

        /**
         * TemplateId.
         */
        public Builder templateId(Long templateId) {
            this.putQueryParameter("TemplateId", templateId);
            this.templateId = templateId;
            return this;
        }

        @Override
        public ModifyDefenseRuleStatusRequest build() {
            return new ModifyDefenseRuleStatusRequest(this);
        } 

    } 

}
