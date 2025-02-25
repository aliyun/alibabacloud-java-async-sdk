// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paistudio20220112.models;

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
    private String value;

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

    /**
     * @return time
     */
    public Long getTime() {
        return this.time;
    }

    /**
     * @return value
     */
    public String getValue() {
        return this.value;
    }

    public static final class Builder {
        private Long time; 
        private String value; 

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
        public Builder value(String value) {
            this.value = value;
            return this;
        }

        public Metric build() {
            return new Metric(this);
        } 

    } 

}
