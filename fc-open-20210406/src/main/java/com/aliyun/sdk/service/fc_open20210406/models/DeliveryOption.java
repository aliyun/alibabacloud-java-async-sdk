// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc_open20210406.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeliveryOption} extends {@link TeaModel}
 *
 * <p>DeliveryOption</p>
 */
public class DeliveryOption extends TeaModel {
    @NameInMap("concurrency")
    private Long concurrency;

    @NameInMap("eventSchema")
    private String eventSchema;

    @NameInMap("mode")
    private String mode;

    private DeliveryOption(Builder builder) {
        this.concurrency = builder.concurrency;
        this.eventSchema = builder.eventSchema;
        this.mode = builder.mode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeliveryOption create() {
        return builder().build();
    }

    /**
     * @return concurrency
     */
    public Long getConcurrency() {
        return this.concurrency;
    }

    /**
     * @return eventSchema
     */
    public String getEventSchema() {
        return this.eventSchema;
    }

    /**
     * @return mode
     */
    public String getMode() {
        return this.mode;
    }

    public static final class Builder {
        private Long concurrency; 
        private String eventSchema; 
        private String mode; 

        /**
         * concurrency.
         */
        public Builder concurrency(Long concurrency) {
            this.concurrency = concurrency;
            return this;
        }

        /**
         * eventSchema.
         */
        public Builder eventSchema(String eventSchema) {
            this.eventSchema = eventSchema;
            return this;
        }

        /**
         * mode.
         */
        public Builder mode(String mode) {
            this.mode = mode;
            return this;
        }

        public DeliveryOption build() {
            return new DeliveryOption(this);
        } 

    } 

}
