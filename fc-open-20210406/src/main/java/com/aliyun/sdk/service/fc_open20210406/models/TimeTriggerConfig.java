// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc_open20210406.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TimeTriggerConfig} extends {@link TeaModel}
 *
 * <p>TimeTriggerConfig</p>
 */
public class TimeTriggerConfig extends TeaModel {
    @NameInMap("cronExpression")
    private String cronExpression;

    @NameInMap("enable")
    private Boolean enable;

    @NameInMap("payload")
    private String payload;

    private TimeTriggerConfig(Builder builder) {
        this.cronExpression = builder.cronExpression;
        this.enable = builder.enable;
        this.payload = builder.payload;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TimeTriggerConfig create() {
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
         * cronExpression
         */
        public Builder cronExpression(String cronExpression) {
            this.cronExpression = cronExpression;
            return this;
        }

        /**
         * enable
         */
        public Builder enable(Boolean enable) {
            this.enable = enable;
            return this;
        }

        /**
         * payload
         */
        public Builder payload(String payload) {
            this.payload = payload;
            return this;
        }

        public TimeTriggerConfig build() {
            return new TimeTriggerConfig(this);
        } 

    } 

}
