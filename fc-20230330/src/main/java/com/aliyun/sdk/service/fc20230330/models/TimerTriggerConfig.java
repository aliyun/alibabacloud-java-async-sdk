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
         * <p>The trigger period expression. You can specify to trigger based on a time interval. For example, the expression @every 4m indicates that the triggering is performed every four minutes. You can also specify to trigger based on a cron expression, for example, 0 0 4 \* \* \*.</p>
         * 
         * <strong>example:</strong>
         * <p>0 0 4 * * *</p>
         */
        public Builder cronExpression(String cronExpression) {
            this.cronExpression = cronExpression;
            return this;
        }

        /**
         * <p>Specify whether to enable the trigger.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enable(Boolean enable) {
            this.enable = enable;
            return this;
        }

        /**
         * <p>Enter custom parameters. The trigger message is used as the value of the payload in the event.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;workflowInstanceId&quot;:&quot;39639&quot;}</p>
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
