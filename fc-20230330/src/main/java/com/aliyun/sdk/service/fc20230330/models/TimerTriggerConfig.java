// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc20230330.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TimerTriggerConfig} extends {@link TeaModel}
 *
 * <p>TimerTriggerConfig</p>
 */
public class TimerTriggerConfig extends TeaModel {
    @NameInMap("cronExpression")
    private String cronExpression;

    @NameInMap("enable")
    private Boolean enable;

    @NameInMap("payload")
    private String payload;

    private TimerTriggerConfig(Builder builder) {
        this.cronExpression = builder.cronExpression;
        this.enable = builder.enable;
        this.payload = builder.payload;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TimerTriggerConfig create() {
        return builder().build();
    }

    /**
     * @return cronExpression
     */
    public String getCronExpression() {
        return this.cronExpression;
    }

    /**
     * @return enable
     */
    public Boolean getEnable() {
        return this.enable;
    }

    /**
     * @return payload
     */
    public String getPayload() {
        return this.payload;
    }

    public static final class Builder {
        private String cronExpression; 
        private Boolean enable; 
        private String payload; 

        /**
         * cronExpression.
         */
        public Builder cronExpression(String cronExpression) {
            this.cronExpression = cronExpression;
            return this;
        }

        /**
         * enable.
         */
        public Builder enable(Boolean enable) {
            this.enable = enable;
            return this;
        }

        /**
         * payload.
         */
        public Builder payload(String payload) {
            this.payload = payload;
            return this;
        }

        public TimerTriggerConfig build() {
            return new TimerTriggerConfig(this);
        } 

    } 

}
