// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc20230330.models;

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
    private String eventRuleFilterPattern;

    @NameInMap("eventSinkConfig")
    private EventSinkConfig eventSinkConfig;

    @NameInMap("eventSourceConfig")
    private EventSourceConfig eventSourceConfig;

    @NameInMap("runOptions")
    private RunOptions runOptions;

    @NameInMap("triggerEnable")
    private Boolean triggerEnable;

    private EventBridgeTriggerConfig(Builder builder) {
        this.asyncInvocationType = builder.asyncInvocationType;
        this.eventRuleFilterPattern = builder.eventRuleFilterPattern;
        this.eventSinkConfig = builder.eventSinkConfig;
        this.eventSourceConfig = builder.eventSourceConfig;
        this.runOptions = builder.runOptions;
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
     * @return eventSinkConfig
     */
    public EventSinkConfig getEventSinkConfig() {
        return this.eventSinkConfig;
    }

    /**
     * @return eventSourceConfig
     */
    public EventSourceConfig getEventSourceConfig() {
        return this.eventSourceConfig;
    }

    /**
     * @return runOptions
     */
    public RunOptions getRunOptions() {
        return this.runOptions;
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
        private EventSinkConfig eventSinkConfig; 
        private EventSourceConfig eventSourceConfig; 
        private RunOptions runOptions; 
        private Boolean triggerEnable; 

        /**
         * asyncInvocationType.
         */
        public Builder asyncInvocationType(Boolean asyncInvocationType) {
            this.asyncInvocationType = asyncInvocationType;
            return this;
        }

        /**
         * eventRuleFilterPattern.
         */
        public Builder eventRuleFilterPattern(String eventRuleFilterPattern) {
            this.eventRuleFilterPattern = eventRuleFilterPattern;
            return this;
        }

        /**
         * eventSinkConfig.
         */
        public Builder eventSinkConfig(EventSinkConfig eventSinkConfig) {
            this.eventSinkConfig = eventSinkConfig;
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
         * runOptions.
         */
        public Builder runOptions(RunOptions runOptions) {
            this.runOptions = runOptions;
            return this;
        }

        /**
         * triggerEnable.
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
