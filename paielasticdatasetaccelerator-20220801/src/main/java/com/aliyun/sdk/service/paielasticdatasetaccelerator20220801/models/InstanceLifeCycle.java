// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paielasticdatasetaccelerator20220801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link InstanceLifeCycle} extends {@link TeaModel}
 *
 * <p>InstanceLifeCycle</p>
 */
public class InstanceLifeCycle extends TeaModel {
    @NameInMap("Config")
    private String config;

    @NameInMap("Type")
    private String type;

    private InstanceLifeCycle(Builder builder) {
        this.config = builder.config;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InstanceLifeCycle create() {
        return builder().build();
    }

    /**
     * @return config
     */
    public String getConfig() {
        return this.config;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder {
        private String config; 
        private String type; 

        /**
         * Config.
         */
        public Builder config(String config) {
            this.config = config;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public InstanceLifeCycle build() {
            return new InstanceLifeCycle(this);
        } 

    } 

}
