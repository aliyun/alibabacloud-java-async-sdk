// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link InventorySchedule} extends {@link TeaModel}
 *
 * <p>InventorySchedule</p>
 */
public class InventorySchedule extends TeaModel {
    @NameInMap("Frequency")
    private InventoryFrequency frequency;


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
    public InventoryFrequency getFrequency() {
        return this.frequency;
    }

    public static final class Builder {
        private InventoryFrequency frequency; 

        /**
         * <p>Frequency.</p>
         */
        public Builder frequency(InventoryFrequency frequency) {
            this.frequency = frequency;
            return this;
        }

        public InventorySchedule build() {
            return new InventorySchedule(this);
        } 

    } 

}
