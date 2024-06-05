// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pds20220301.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AggregationsGroup} extends {@link TeaModel}
 *
 * <p>AggregationsGroup</p>
 */
public class AggregationsGroup extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("count")
    private Long count;

    @com.aliyun.core.annotation.NameInMap("value")
    private byte[] value;

    private AggregationsGroup(Builder builder) {
        this.count = builder.count;
        this.value = builder.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AggregationsGroup create() {
        return builder().build();
    }

    /**
     * @return count
     */
    public Long getCount() {
        return this.count;
    }

    /**
     * @return value
     */
    public byte[] getValue() {
        return this.value;
    }

    public static final class Builder {
        private Long count; 
        private byte[] value; 

        /**
         * count.
         */
        public Builder count(Long count) {
            this.count = count;
            return this;
        }

        /**
         * value.
         */
        public Builder value(byte[] value) {
            this.value = value;
            return this;
        }

        public AggregationsGroup build() {
            return new AggregationsGroup(this);
        } 

    } 

}
