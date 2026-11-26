// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.websitebuild20250429.models;

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
 * {@link BrandKnowledgeQuestion} extends {@link TeaModel}
 *
 * <p>BrandKnowledgeQuestion</p>
 */
public class BrandKnowledgeQuestion extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Prompt")
    private String prompt;

    @com.aliyun.core.annotation.NameInMap("Purpose")
    private String purpose;

    @com.aliyun.core.annotation.NameInMap("Topic")
    private String topic;

    private BrandKnowledgeQuestion(Builder builder) {
        this.prompt = builder.prompt;
        this.purpose = builder.purpose;
        this.topic = builder.topic;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BrandKnowledgeQuestion create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return prompt
     */
    public String getPrompt() {
        return this.prompt;
    }

    /**
     * @return purpose
     */
    public String getPurpose() {
        return this.purpose;
    }

    /**
     * @return topic
     */
    public String getTopic() {
        return this.topic;
    }

    public static final class Builder {
        private String prompt; 
        private String purpose; 
        private String topic; 

        private Builder() {
        } 

        private Builder(BrandKnowledgeQuestion model) {
            this.prompt = model.prompt;
            this.purpose = model.purpose;
            this.topic = model.topic;
        } 

        /**
         * <p>The full prompt used for monitoring.</p>
         * 
         * <strong>example:</strong>
         * <p>How to select enterprise software?</p>
         */
        public Builder prompt(String prompt) {
            this.prompt = prompt;
            return this;
        }

        /**
         * <p>The purpose of the monitoring issue.</p>
         * 
         * <strong>example:</strong>
         * <p>NORMAL</p>
         */
        public Builder purpose(String purpose) {
            this.purpose = purpose;
            return this;
        }

        /**
         * <p>The topic of the monitoring issue.</p>
         * 
         * <strong>example:</strong>
         * <p>Product selection</p>
         */
        public Builder topic(String topic) {
            this.topic = topic;
            return this;
        }

        public BrandKnowledgeQuestion build() {
            return new BrandKnowledgeQuestion(this);
        } 

    } 

}
