// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

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
 * {@link EditQualityRuleRequest} extends {@link RequestModel}
 *
 * <p>EditQualityRuleRequest</p>
 */
public class EditQualityRuleRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("KeyWords")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> keyWords;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MatchType")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 1000, minimum = 1)
    private Integer matchType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("QualityRuleId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long qualityRuleId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RuleTag")
    @com.aliyun.core.annotation.Validation(required = true)
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
    public java.util.List<String> getKeyWords() {
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
        private java.util.List<String> keyWords; 
        private Integer matchType; 
        private String name; 
        private Long qualityRuleId; 
        private Integer ruleTag; 

        private Builder() {
            super();
        } 

        private Builder(EditQualityRuleRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.keyWords = request.keyWords;
            this.matchType = request.matchType;
            this.name = request.name;
            this.qualityRuleId = request.qualityRuleId;
            this.ruleTag = request.ruleTag;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder keyWords(java.util.List<String> keyWords) {
            this.putBodyParameter("KeyWords", keyWords);
            this.keyWords = keyWords;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder matchType(Integer matchType) {
            this.putBodyParameter("MatchType", matchType);
            this.matchType = matchType;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder qualityRuleId(Long qualityRuleId) {
            this.putBodyParameter("QualityRuleId", qualityRuleId);
            this.qualityRuleId = qualityRuleId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
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
