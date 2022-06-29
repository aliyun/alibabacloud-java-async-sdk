// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc_open20210406.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EventSourceParameters} extends {@link TeaModel}
 *
 * <p>EventSourceParameters</p>
 */
public class EventSourceParameters extends TeaModel {
    @NameInMap("sourceMNSParameters")
    private SourceMNSParameters sourceMNSParameters;

    @NameInMap("sourceRabbitMQParameters")
    private SourceRabbitMQParameters sourceRabbitMQParameters;

    @NameInMap("sourceRocketMQParameters")
    private SourceRocketMQParameters sourceRocketMQParameters;

    private EventSourceParameters(Builder builder) {
        this.sourceMNSParameters = builder.sourceMNSParameters;
        this.sourceRabbitMQParameters = builder.sourceRabbitMQParameters;
        this.sourceRocketMQParameters = builder.sourceRocketMQParameters;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EventSourceParameters create() {
        return builder().build();
    }

    /**
     * @return sourceMNSParameters
     */
    public SourceMNSParameters getSourceMNSParameters() {
        return this.sourceMNSParameters;
    }

    /**
     * @return sourceRabbitMQParameters
     */
    public SourceRabbitMQParameters getSourceRabbitMQParameters() {
        return this.sourceRabbitMQParameters;
    }

    /**
     * @return sourceRocketMQParameters
     */
    public SourceRocketMQParameters getSourceRocketMQParameters() {
        return this.sourceRocketMQParameters;
    }

    public static final class Builder {
        private SourceMNSParameters sourceMNSParameters; 
        private SourceRabbitMQParameters sourceRabbitMQParameters; 
        private SourceRocketMQParameters sourceRocketMQParameters; 

        /**
         * sourceMNSParameters.
         */
        public Builder sourceMNSParameters(SourceMNSParameters sourceMNSParameters) {
            this.sourceMNSParameters = sourceMNSParameters;
            return this;
        }

        /**
         * sourceRabbitMQParameters.
         */
        public Builder sourceRabbitMQParameters(SourceRabbitMQParameters sourceRabbitMQParameters) {
            this.sourceRabbitMQParameters = sourceRabbitMQParameters;
            return this;
        }

        /**
         * sourceRocketMQParameters.
         */
        public Builder sourceRocketMQParameters(SourceRocketMQParameters sourceRocketMQParameters) {
            this.sourceRocketMQParameters = sourceRocketMQParameters;
            return this;
        }

        public EventSourceParameters build() {
            return new EventSourceParameters(this);
        } 

    } 

}
