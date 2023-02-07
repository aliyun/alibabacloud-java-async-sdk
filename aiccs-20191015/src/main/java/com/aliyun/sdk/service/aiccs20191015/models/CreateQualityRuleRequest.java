// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateQualityRuleRequest} extends {@link RequestModel}
 *
 * <p>CreateQualityRuleRequest</p>
 */
public class CreateQualityRuleRequest extends Request {
    @Body
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Body
    @NameInMap("KeyWords")
    @Validation(required = true)
    private java.util.List < String > keyWords;

    @Body
    @NameInMap("MatchType")
    @Validation(required = true)
    private Integer matchType;

    @Body
    @NameInMap("Name")
    @Validation(required = true)
    private String name;

    @Body
    @NameInMap("RuleTag")
    @Validation(required = true)
    private Integer ruleTag;

    private CreateQualityRuleRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.keyWords = builder.keyWords;
        this.matchType = builder.matchType;
        this.name = builder.name;
        this.ruleTag = builder.ruleTag;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateQualityRuleRequest create() {
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
     * @return keyWords
     */
    public java.util.List < String > getKeyWords() {
        return this.keyWords;
    }

    /**
     * @return matchType
     */
    public Integer getMatchType() {
        return this.matchType;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return ruleTag
     */
    public Integer getRuleTag() {
        return this.ruleTag;
    }

    public static final class Builder extends Request.Builder<CreateQualityRuleRequest, Builder> {
        private String instanceId; 
        private java.util.List < String > keyWords; 
        private Integer matchType; 
        private String name; 
        private Integer ruleTag; 

        private Builder() {
            super();
        } 

        private Builder(CreateQualityRuleRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.keyWords = request.keyWords;
            this.matchType = request.matchType;
            this.name = request.name;
            this.ruleTag = request.ruleTag;
        } 

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * KeyWords.
         */
        public Builder keyWords(java.util.List < String > keyWords) {
            this.putBodyParameter("KeyWords", keyWords);
            this.keyWords = keyWords;
            return this;
        }

        /**
         * MatchType.
         */
        public Builder matchType(Integer matchType) {
            this.putBodyParameter("MatchType", matchType);
            this.matchType = matchType;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * RuleTag.
         */
        public Builder ruleTag(Integer ruleTag) {
            this.putBodyParameter("RuleTag", ruleTag);
            this.ruleTag = ruleTag;
            return this;
        }

        @Override
        public CreateQualityRuleRequest build() {
            return new CreateQualityRuleRequest(this);
        } 

    } 

}
