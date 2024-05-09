// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc20230330.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeliveryOption} extends {@link TeaModel}
 *
 * <p>DeliveryOption</p>
 */
public class DeliveryOption extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("concurrency")
    private Long concurrency;

    @com.aliyun.core.annotation.NameInMap("eventSchema")
    private String eventSchema;

    private DeliveryOption(Builder builder) {
        this.concurrency = builder.concurrency;
        this.eventSchema = builder.eventSchema;
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

    public static final class Builder {
        private Long concurrency; 
        private String eventSchema; 

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

        public DeliveryOption build() {
            return new DeliveryOption(this);
        } 

    } 

}
