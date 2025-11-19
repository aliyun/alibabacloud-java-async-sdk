// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentrun20250910.models;

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
 * {@link ModelFeatures} extends {@link TeaModel}
 *
 * <p>ModelFeatures</p>
 */
public class ModelFeatures extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("agentThought")
    private Boolean agentThought;

    @com.aliyun.core.annotation.NameInMap("multiToolCall")
    private Boolean multiToolCall;

    @com.aliyun.core.annotation.NameInMap("streamToolCall")
    private Boolean streamToolCall;

    @com.aliyun.core.annotation.NameInMap("toolCall")
    private Boolean toolCall;

    @com.aliyun.core.annotation.NameInMap("vision")
    private Boolean vision;

    private ModelFeatures(Builder builder) {
        this.agentThought = builder.agentThought;
        this.multiToolCall = builder.multiToolCall;
        this.streamToolCall = builder.streamToolCall;
        this.toolCall = builder.toolCall;
        this.vision = builder.vision;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModelFeatures create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agentThought
     */
    public Boolean getAgentThought() {
        return this.agentThought;
    }

    /**
     * @return multiToolCall
     */
    public Boolean getMultiToolCall() {
        return this.multiToolCall;
    }

    /**
     * @return streamToolCall
     */
    public Boolean getStreamToolCall() {
        return this.streamToolCall;
    }

    /**
     * @return toolCall
     */
    public Boolean getToolCall() {
        return this.toolCall;
    }

    /**
     * @return vision
     */
    public Boolean getVision() {
        return this.vision;
    }

    public static final class Builder {
        private Boolean agentThought; 
        private Boolean multiToolCall; 
        private Boolean streamToolCall; 
        private Boolean toolCall; 
        private Boolean vision; 

        private Builder() {
        } 

        private Builder(ModelFeatures model) {
            this.agentThought = model.agentThought;
            this.multiToolCall = model.multiToolCall;
            this.streamToolCall = model.streamToolCall;
            this.toolCall = model.toolCall;
            this.vision = model.vision;
        } 

        /**
         * agentThought.
         */
        public Builder agentThought(Boolean agentThought) {
            this.agentThought = agentThought;
            return this;
        }

        /**
         * multiToolCall.
         */
        public Builder multiToolCall(Boolean multiToolCall) {
            this.multiToolCall = multiToolCall;
            return this;
        }

        /**
         * streamToolCall.
         */
        public Builder streamToolCall(Boolean streamToolCall) {
            this.streamToolCall = streamToolCall;
            return this;
        }

        /**
         * toolCall.
         */
        public Builder toolCall(Boolean toolCall) {
            this.toolCall = toolCall;
            return this;
        }

        /**
         * vision.
         */
        public Builder vision(Boolean vision) {
            this.vision = vision;
            return this;
        }

        public ModelFeatures build() {
            return new ModelFeatures(this);
        } 

    } 

}
