// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EditQualityRuleRequest} extends {@link RequestModel}
 *
 * <p>EditQualityRuleRequest</p>
 */
public class EditQualityRuleRequest extends Request {
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
    @Validation(required = true, maximum = 1000, minimum = 1)
    private Integer matchType;

    @Body
    @NameInMap("Name")
    @Validation(required = true)
    private String name;

    @Body
    @NameInMap("QualityRuleId")
    @Validation(required = true)
    private Long qualityRuleId;

    @Body
    @NameInMap("RuleTag")
    @Validation(required = true)
    private Integer ruleTag;

    private EditQualityRuleRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.keyWords = builder.keyWords;
        this.matchType = builder.matchType;
        this.name = builder.name;
        this.qualityRuleId = builder.qualityRuleId;
        this.ruleTag = builder.ruleTag;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EditQualityRuleRequest create() {
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
     * @return qualityRuleId
     */
    public Long getQualityRuleId() {
        return this.qualityRuleId;
    }

    /**
     * @return ruleTag
     */
    public Integer getRuleTag() {
        return this.ruleTag;
    }

    public static final class Builder extends Request.Builder<EditQualityRuleRequest, Builder> {
        private String instanceId; 
        private java.util.List < String > keyWords; 
        private Integer matchType; 
        private String name; 
        private Long qualityRuleId; 
        private Integer ruleTag; 

        private Builder() {
            super();
        } 

        private Builder(EditQualityRuleRequest response) {
            super(response);
            this.instanceId = response.instanceId;
            this.keyWords = response.keyWords;
            this.matchType = response.matchType;
            this.name = response.name;
            this.qualityRuleId = response.qualityRuleId;
            this.ruleTag = response.ruleTag;
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
         * QualityRuleId.
         */
        public Builder qualityRuleId(Long qualityRuleId) {
            this.putBodyParameter("QualityRuleId", qualityRuleId);
            this.qualityRuleId = qualityRuleId;
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
        public EditQualityRuleRequest build() {
            return new EditQualityRuleRequest(this);
        } 

    } 

}
