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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DeliveryOption model) {
            this.concurrency = model.concurrency;
            this.eventSchema = model.eventSchema;
        } 

        /**
         * <p>The maximum number of concurrent events that can be delivered by the upstream event source to Function Compute. This parameter is valid only when ApsaraMQ for Kafka is used as the event source.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder concurrency(Long concurrency) {
            this.concurrency = concurrency;
            return this;
        }

        /**
         * <p>The format of each data element in the event parameter of the function. CloudEvents: describes event data in a common format, including event description and event payload data. CloudEvents is designed to simplify event declaration and transmission between different services and platforms. This is the default value. RawData: delivers only the event payload data and does not include other metadata information in the CloudEvents format.</p>
         * 
         * <strong>example:</strong>
         * <p>RawData</p>
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
