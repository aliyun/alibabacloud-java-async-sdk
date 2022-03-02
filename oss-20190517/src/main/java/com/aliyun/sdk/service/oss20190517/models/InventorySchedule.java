// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.oss.models.*;

/**
 * {@link InventorySchedule} extends {@link TeaModel}
 *
 * <p>InventorySchedule</p>
 */
public class InventorySchedule extends TeaModel {
    @NameInMap("Frequency")
    private String frequency;

    private InventorySchedule(Builder builder) {
        this.frequency = builder.frequency;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InventorySchedule create() {
        return builder().build();
    }

    /**
     * @return frequency
     */
    public String getFrequency() {
        return this.frequency;
    }

    public static final class Builder {
        private String frequency; 

        /**
         * Frequency.
         */
        public Builder frequency(String frequency) {
            this.frequency = frequency;
            return this;
        }

        /**
         * Frequency.
         */
        public Builder frequency(InventoryFrequency frequency) {
            this.frequency = frequency.getValue();
            return this;
        }

        public InventorySchedule build() {
            return new InventorySchedule(this);
        } 

    } 

}
