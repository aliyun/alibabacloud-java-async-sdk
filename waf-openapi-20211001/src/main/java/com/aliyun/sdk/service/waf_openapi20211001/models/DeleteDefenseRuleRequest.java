// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteDefenseRuleRequest} extends {@link RequestModel}
 *
 * <p>DeleteDefenseRuleRequest</p>
 */
public class DeleteDefenseRuleRequest extends Request {
    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("RuleIds")
    @Validation(required = true)
    private String ruleIds;

    @Query
    @NameInMap("TemplateId")
    @Validation(required = true)
    private Long templateId;

    private DeleteDefenseRuleRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.ruleIds = builder.ruleIds;
        this.templateId = builder.templateId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteDefenseRuleRequest create() {
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
     * @return ruleIds
     */
    public String getRuleIds() {
        return this.ruleIds;
    }

    /**
     * @return templateId
     */
    public Long getTemplateId() {
        return this.templateId;
    }

    public static final class Builder extends Request.Builder<DeleteDefenseRuleRequest, Builder> {
        private String instanceId; 
        private String ruleIds; 
        private Long templateId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteDefenseRuleRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.ruleIds = request.ruleIds;
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
         * RuleIds.
         */
        public Builder ruleIds(String ruleIds) {
            this.putQueryParameter("RuleIds", ruleIds);
            this.ruleIds = ruleIds;
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
        public DeleteDefenseRuleRequest build() {
            return new DeleteDefenseRuleRequest(this);
        } 

    } 

}
