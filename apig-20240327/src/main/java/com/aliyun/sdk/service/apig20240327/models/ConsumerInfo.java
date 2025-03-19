// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

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
 * {@link ConsumerInfo} extends {@link TeaModel}
 *
 * <p>ConsumerInfo</p>
 */
public class ConsumerInfo extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("consumerId")
    private String consumerId;

    @com.aliyun.core.annotation.NameInMap("enable")
    private Boolean enable;

    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    private ConsumerInfo(Builder builder) {
        this.consumerId = builder.consumerId;
        this.enable = builder.enable;
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ConsumerInfo create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return consumerId
     */
    public String getConsumerId() {
        return this.consumerId;
    }

    /**
     * @return enable
     */
    public Boolean getEnable() {
        return this.enable;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    public static final class Builder {
        private String consumerId; 
        private Boolean enable; 
        private String name; 

        private Builder() {
        } 

        private Builder(ConsumerInfo model) {
            this.consumerId = model.consumerId;
            this.enable = model.enable;
            this.name = model.name;
        } 

        /**
         * consumerId.
         */
        public Builder consumerId(String consumerId) {
            this.consumerId = consumerId;
            return this;
        }

        /**
         * enable.
         */
        public Builder enable(Boolean enable) {
            this.enable = enable;
            return this;
        }

        /**
         * name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public ConsumerInfo build() {
            return new ConsumerInfo(this);
        } 

    } 

}
