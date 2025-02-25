// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devs20230714.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PipelineTriggerEventSpec} extends {@link TeaModel}
 *
 * <p>PipelineTriggerEventSpec</p>
 */
public class PipelineTriggerEventSpec extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("payload")
    private EventPayload payload;

    @com.aliyun.core.annotation.NameInMap("triggerName")
    private String triggerName;

    private PipelineTriggerEventSpec(Builder builder) {
        this.payload = builder.payload;
        this.triggerName = builder.triggerName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PipelineTriggerEventSpec create() {
        return builder().build();
    }

    /**
     * @return payload
     */
    public EventPayload getPayload() {
        return this.payload;
    }

    /**
     * @return triggerName
     */
    public String getTriggerName() {
        return this.triggerName;
    }

    public static final class Builder {
        private EventPayload payload; 
        private String triggerName; 

        /**
         * payload.
         */
        public Builder payload(EventPayload payload) {
            this.payload = payload;
            return this;
        }

        /**
         * triggerName.
         */
        public Builder triggerName(String triggerName) {
            this.triggerName = triggerName;
            return this;
        }

        public PipelineTriggerEventSpec build() {
            return new PipelineTriggerEventSpec(this);
        } 

    } 

}
