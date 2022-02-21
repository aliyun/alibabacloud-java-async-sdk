// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * {@link ConsumerGroup} extends {@link TeaModel}
 *
 * <p>ConsumerGroup</p>
 */
public class ConsumerGroup extends TeaModel {
    @NameInMap("name")
    private String name;

    @NameInMap("order")
    private Boolean order;

    @NameInMap("timeout")
    private Integer timeout;

    private ConsumerGroup(Builder builder) {
        this.name = builder.name;
        this.order = builder.order;
        this.timeout = builder.timeout;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ConsumerGroup create() {
        return builder().build();
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return order
     */
    public Boolean getOrder() {
        return this.order;
    }

    /**
     * @return timeout
     */
    public Integer getTimeout() {
        return this.timeout;
    }

    public static final class Builder {
        private String name; 
        private Boolean order; 
        private Integer timeout; 

        /**
         * consumerGroup
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * order
         */
        public Builder order(Boolean order) {
            this.order = order;
            return this;
        }

        /**
         * timeout
         */
        public Builder timeout(Integer timeout) {
            this.timeout = timeout;
            return this;
        }

        public ConsumerGroup build() {
            return new ConsumerGroup(this);
        } 

    } 

}
