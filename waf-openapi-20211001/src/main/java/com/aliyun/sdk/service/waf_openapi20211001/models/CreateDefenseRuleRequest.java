// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDefenseRuleRequest} extends {@link RequestModel}
 *
 * <p>CreateDefenseRuleRequest</p>
 */
public class CreateDefenseRuleRequest extends Request {
    @Query
    @NameInMap("DefenseScene")
    @Validation(required = true)
    private String defenseScene;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("Rules")
    @Validation(required = true)
    private String rules;

    @Query
    @NameInMap("TemplateId")
    @Validation(required = true)
    private Long templateId;

    private CreateDefenseRuleRequest(Builder builder) {
        super(builder);
        this.defenseScene = builder.defenseScene;
        this.instanceId = builder.instanceId;
        this.rules = builder.rules;
        this.templateId = builder.templateId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDefenseRuleRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return defenseScene
     */
    public String getDefenseScene() {
        return this.defenseScene;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return rules
     */
    public String getRules() {
        return this.rules;
    }

    /**
     * @return templateId
     */
    public Long getTemplateId() {
        return this.templateId;
    }

    public static final class Builder extends Request.Builder<CreateDefenseRuleRequest, Builder> {
        private String defenseScene; 
        private String instanceId; 
        private String rules; 
        private Long templateId; 

        private Builder() {
            super();
        } 

        private Builder(CreateDefenseRuleRequest request) {
            super(request);
            this.defenseScene = request.defenseScene;
            this.instanceId = request.instanceId;
            this.rules = request.rules;
            this.templateId = request.templateId;
        } 

        /**
         * DefenseScene.
         */
        public Builder defenseScene(String defenseScene) {
            this.putQueryParameter("DefenseScene", defenseScene);
            this.defenseScene = defenseScene;
            return this;
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
         * Rules.
         */
        public Builder rules(String rules) {
            this.putQueryParameter("Rules", rules);
            this.rules = rules;
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
        public CreateDefenseRuleRequest build() {
            return new CreateDefenseRuleRequest(this);
        } 

    } 

}
