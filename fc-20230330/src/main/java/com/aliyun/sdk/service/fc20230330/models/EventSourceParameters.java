// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc20230330.models;

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
 * {@link EventSourceParameters} extends {@link TeaModel}
 *
 * <p>EventSourceParameters</p>
 */
public class EventSourceParameters extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("sourceDTSParameters")
    private SourceDTSParameters sourceDTSParameters;

    @com.aliyun.core.annotation.NameInMap("sourceKafkaParameters")
    private SourceKafkaParameters sourceKafkaParameters;

    @com.aliyun.core.annotation.NameInMap("sourceMNSParameters")
    private SourceMNSParameters sourceMNSParameters;

    @com.aliyun.core.annotation.NameInMap("sourceMQTTParameters")
    private SourceMQTTParameters sourceMQTTParameters;

    @com.aliyun.core.annotation.NameInMap("sourceRabbitMQParameters")
    private SourceRabbitMQParameters sourceRabbitMQParameters;

    @com.aliyun.core.annotation.NameInMap("sourceRocketMQParameters")
    private SourceRocketMQParameters sourceRocketMQParameters;

    private EventSourceParameters(Builder builder) {
        this.sourceDTSParameters = builder.sourceDTSParameters;
        this.sourceKafkaParameters = builder.sourceKafkaParameters;
        this.sourceMNSParameters = builder.sourceMNSParameters;
        this.sourceMQTTParameters = builder.sourceMQTTParameters;
        this.sourceRabbitMQParameters = builder.sourceRabbitMQParameters;
        this.sourceRocketMQParameters = builder.sourceRocketMQParameters;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EventSourceParameters create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return sourceDTSParameters
     */
    public SourceDTSParameters getSourceDTSParameters() {
        return this.sourceDTSParameters;
    }

    /**
     * @return sourceKafkaParameters
     */
    public SourceKafkaParameters getSourceKafkaParameters() {
        return this.sourceKafkaParameters;
    }

    /**
     * @return sourceMNSParameters
     */
    public SourceMNSParameters getSourceMNSParameters() {
        return this.sourceMNSParameters;
    }

    /**
     * @return sourceMQTTParameters
     */
    public SourceMQTTParameters getSourceMQTTParameters() {
        return this.sourceMQTTParameters;
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
        private SourceDTSParameters sourceDTSParameters; 
        private SourceKafkaParameters sourceKafkaParameters; 
        private SourceMNSParameters sourceMNSParameters; 
        private SourceMQTTParameters sourceMQTTParameters; 
        private SourceRabbitMQParameters sourceRabbitMQParameters; 
        private SourceRocketMQParameters sourceRocketMQParameters; 

        private Builder() {
        } 

        private Builder(EventSourceParameters model) {
            this.sourceDTSParameters = model.sourceDTSParameters;
            this.sourceKafkaParameters = model.sourceKafkaParameters;
            this.sourceMNSParameters = model.sourceMNSParameters;
            this.sourceMQTTParameters = model.sourceMQTTParameters;
            this.sourceRabbitMQParameters = model.sourceRabbitMQParameters;
            this.sourceRocketMQParameters = model.sourceRocketMQParameters;
        } 

        /**
         * sourceDTSParameters.
         */
        public Builder sourceDTSParameters(SourceDTSParameters sourceDTSParameters) {
            this.sourceDTSParameters = sourceDTSParameters;
            return this;
        }

        /**
         * sourceKafkaParameters.
         */
        public Builder sourceKafkaParameters(SourceKafkaParameters sourceKafkaParameters) {
            this.sourceKafkaParameters = sourceKafkaParameters;
            return this;
        }

        /**
         * sourceMNSParameters.
         */
        public Builder sourceMNSParameters(SourceMNSParameters sourceMNSParameters) {
            this.sourceMNSParameters = sourceMNSParameters;
            return this;
        }

        /**
         * sourceMQTTParameters.
         */
        public Builder sourceMQTTParameters(SourceMQTTParameters sourceMQTTParameters) {
            this.sourceMQTTParameters = sourceMQTTParameters;
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
