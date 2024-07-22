// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.voicenavigator20180612.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyGreetingConfigRequest} extends {@link RequestModel}
 *
 * <p>ModifyGreetingConfigRequest</p>
 */
public class ModifyGreetingConfigRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GreetingWords")
    @com.aliyun.core.annotation.Validation(required = true)
    private String greetingWords;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IntentTrigger")
    private String intentTrigger;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sourceType;

    private ModifyGreetingConfigRequest(Builder builder) {
        super(builder);
        this.greetingWords = builder.greetingWords;
        this.instanceId = builder.instanceId;
        this.intentTrigger = builder.intentTrigger;
        this.sourceType = builder.sourceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyGreetingConfigRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return greetingWords
     */
    public String getGreetingWords() {
        return this.greetingWords;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return intentTrigger
     */
    public String getIntentTrigger() {
        return this.intentTrigger;
    }

    /**
     * @return sourceType
     */
    public String getSourceType() {
        return this.sourceType;
    }

    public static final class Builder extends Request.Builder<ModifyGreetingConfigRequest, Builder> {
        private String greetingWords; 
        private String instanceId; 
        private String intentTrigger; 
        private String sourceType; 

        private Builder() {
            super();
        } 

        private Builder(ModifyGreetingConfigRequest request) {
            super(request);
            this.greetingWords = request.greetingWords;
            this.instanceId = request.instanceId;
            this.intentTrigger = request.intentTrigger;
            this.sourceType = request.sourceType;
        } 

        /**
         * GreetingWords.
         */
        public Builder greetingWords(String greetingWords) {
            this.putQueryParameter("GreetingWords", greetingWords);
            this.greetingWords = greetingWords;
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
         * IntentTrigger.
         */
        public Builder intentTrigger(String intentTrigger) {
            this.putQueryParameter("IntentTrigger", intentTrigger);
            this.intentTrigger = intentTrigger;
            return this;
        }

        /**
         * SourceType.
         */
        public Builder sourceType(String sourceType) {
            this.putQueryParameter("SourceType", sourceType);
            this.sourceType = sourceType;
            return this;
        }

        @Override
        public ModifyGreetingConfigRequest build() {
            return new ModifyGreetingConfigRequest(this);
        } 

    } 

}
