// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc20230330.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EventSinkConfig} extends {@link TeaModel}
 *
 * <p>EventSinkConfig</p>
 */
public class EventSinkConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("deliveryOption")
    private DeliveryOption deliveryOption;

    private EventSinkConfig(Builder builder) {
        this.deliveryOption = builder.deliveryOption;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EventSinkConfig create() {
        return builder().build();
    }

    /**
     * @return deliveryOption
     */
    public DeliveryOption getDeliveryOption() {
        return this.deliveryOption;
    }

    public static final class Builder {
        private DeliveryOption deliveryOption; 

        /**
         * deliveryOption.
         */
        public Builder deliveryOption(DeliveryOption deliveryOption) {
            this.deliveryOption = deliveryOption;
            return this;
        }

        public EventSinkConfig build() {
            return new EventSinkConfig(this);
        } 

    } 

}
