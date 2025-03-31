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
 * {@link TimerTriggerConfig} extends {@link TeaModel}
 *
 * <p>TimerTriggerConfig</p>
 */
public class TimerTriggerConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("cronExpression")
    private String cronExpression;

    @com.aliyun.core.annotation.NameInMap("enable")
    private Boolean enable;

    @com.aliyun.core.annotation.NameInMap("payload")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(TimerTriggerConfig model) {
            this.cronExpression = model.cronExpression;
            this.enable = model.enable;
            this.payload = model.payload;
        } 

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
