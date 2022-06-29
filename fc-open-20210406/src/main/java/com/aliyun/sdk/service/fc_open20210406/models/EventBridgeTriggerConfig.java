// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc_open20210406.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EventBridgeTriggerConfig} extends {@link TeaModel}
 *
 * <p>EventBridgeTriggerConfig</p>
 */
public class EventBridgeTriggerConfig extends TeaModel {
    @NameInMap("asyncInvocationType")
    private Boolean asyncInvocationType;

    @NameInMap("eventRuleFilterPattern")
    @Validation(required = true)
    private String eventRuleFilterPattern;

    @NameInMap("eventSourceConfig")
    @Validation(required = true)
    private EventSourceConfig eventSourceConfig;

    @NameInMap("triggerEnable")
    private Boolean triggerEnable;

    private EventBridgeTriggerConfig(Builder builder) {
        this.asyncInvocationType = builder.asyncInvocationType;
        this.eventRuleFilterPattern = builder.eventRuleFilterPattern;
        this.eventSourceConfig = builder.eventSourceConfig;
        this.triggerEnable = builder.triggerEnable;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EventBridgeTriggerConfig create() {
        return builder().build();
    }

    /**
     * @return asyncInvocationType
     */
    public Boolean getAsyncInvocationType() {
        return this.asyncInvocationType;
    }

    /**
     * @return eventRuleFilterPattern
     */
    public String getEventRuleFilterPattern() {
        return this.eventRuleFilterPattern;
    }

    /**
     * @return eventSourceConfig
     */
    public EventSourceConfig getEventSourceConfig() {
        return this.eventSourceConfig;
    }

    /**
     * @return triggerEnable
     */
    public Boolean getTriggerEnable() {
        return this.triggerEnable;
    }

    public static final class Builder {
        private Boolean asyncInvocationType; 
        private String eventRuleFilterPattern; 
        private EventSourceConfig eventSourceConfig; 
        private Boolean triggerEnable; 

        /**
         * asyncInvocationType
         */
        public Builder asyncInvocationType(Boolean asyncInvocationType) {
            this.asyncInvocationType = asyncInvocationType;
            return this;
        }

        /**
         * eventRuleFilterPattern
         */
        public Builder eventRuleFilterPattern(String eventRuleFilterPattern) {
            this.eventRuleFilterPattern = eventRuleFilterPattern;
            return this;
        }

        /**
         * eventSourceConfig.
         */
        public Builder eventSourceConfig(EventSourceConfig eventSourceConfig) {
            this.eventSourceConfig = eventSourceConfig;
            return this;
        }

        /**
         * triggerEnable
         */
        public Builder triggerEnable(Boolean triggerEnable) {
            this.triggerEnable = triggerEnable;
            return this;
        }

        public EventBridgeTriggerConfig build() {
            return new EventBridgeTriggerConfig(this);
        } 

    } 

}
