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
 * {@link CreateQualityRuleRequest} extends {@link RequestModel}
 *
 * <p>CreateQualityRuleRequest</p>
 */
public class CreateQualityRuleRequest extends Request {
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
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer matchType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RuleTag")
    @com.aliyun.core.annotation.Validation(required = true)
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
     * @return ruleTag
     */
    public Integer getRuleTag() {
        return this.ruleTag;
    }

    public static final class Builder extends Request.Builder<CreateQualityRuleRequest, Builder> {
        private String instanceId; 
        private java.util.List<String> keyWords; 
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
         * <p>Instance ID of the AICCS instance. You can obtain instance ID from the Artificial Intelligence Cloud Call Service console.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ccc_xp_pre***</p>
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The keywords.</p>
         * <p>This parameter is required.</p>
         */
        public Builder keyWords(java.util.List<String> keyWords) {
            this.putBodyParameter("KeyWords", keyWords);
            this.keyWords = keyWords;
            return this;
        }

        /**
         * <p>The keyword match type. Valid values:	</p>
         * <ul>
         * <li><strong>1</strong>: Any keyword appears.</li>
         * <li><strong>2</strong>: All keywords appear.</li>
         * <li><strong>3</strong>: No keyword appears.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder matchType(Integer matchType) {
            this.putBodyParameter("MatchType", matchType);
            this.matchType = matchType;
            return this;
        }

        /**
         * <p>The name of the quality check.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Automated quality check rule</p>
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The tag of the quality check rule.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>638</p>
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
