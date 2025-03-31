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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return deliveryOption
     */
    public DeliveryOption getDeliveryOption() {
        return this.deliveryOption;
    }

    public static final class Builder {
        private DeliveryOption deliveryOption; 

        private Builder() {
        } 

        private Builder(EventSinkConfig model) {
            this.deliveryOption = model.deliveryOption;
        } 

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
