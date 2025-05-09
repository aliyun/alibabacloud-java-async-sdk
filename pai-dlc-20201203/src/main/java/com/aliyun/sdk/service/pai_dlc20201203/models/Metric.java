// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dlc20201203.models;

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
 * {@link Metric} extends {@link TeaModel}
 *
 * <p>Metric</p>
 */
public class Metric extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Time")
    private Long time;

    @com.aliyun.core.annotation.NameInMap("Value")
    private Float value;

    private Metric(Builder builder) {
        this.time = builder.time;
        this.value = builder.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Metric create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return time
     */
    public Long getTime() {
        return this.time;
    }

    /**
     * @return value
     */
    public Float getValue() {
        return this.value;
    }

    public static final class Builder {
        private Long time; 
        private Float value; 

        private Builder() {
        } 

        private Builder(Metric model) {
            this.time = model.time;
            this.value = model.value;
        } 

        /**
         * Time.
         */
        public Builder time(Long time) {
            this.time = time;
            return this;
        }

        /**
         * Value.
         */
        public Builder value(Float value) {
            this.value = value;
            return this;
        }

        public Metric build() {
            return new Metric(this);
        } 

    } 

}
