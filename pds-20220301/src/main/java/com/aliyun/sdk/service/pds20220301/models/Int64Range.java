// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pds20220301.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link Int64Range} extends {@link TeaModel}
 *
 * <p>Int64Range</p>
 */
public class Int64Range extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("from")
    private Long from;

    @com.aliyun.core.annotation.NameInMap("to")
    private Long to;

    private Int64Range(Builder builder) {
        this.from = builder.from;
        this.to = builder.to;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Int64Range create() {
        return builder().build();
    }

    /**
     * @return from
     */
    public Long getFrom() {
        return this.from;
    }

    /**
     * @return to
     */
    public Long getTo() {
        return this.to;
    }

    public static final class Builder {
        private Long from; 
        private Long to; 

        /**
         * from.
         */
        public Builder from(Long from) {
            this.from = from;
            return this;
        }

        /**
         * to.
         */
        public Builder to(Long to) {
            this.to = to;
            return this;
        }

        public Int64Range build() {
            return new Int64Range(this);
        } 

    } 

}
