// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paielasticdatasetaccelerator20220801.models;

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
 * {@link SlotLifeCycle} extends {@link TeaModel}
 *
 * <p>SlotLifeCycle</p>
 */
public class SlotLifeCycle extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Config")
    private String config;

    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    private SlotLifeCycle(Builder builder) {
        this.config = builder.config;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SlotLifeCycle create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(SlotLifeCycle model) {
            this.config = model.config;
            this.type = model.type;
        } 

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

        public SlotLifeCycle build() {
            return new SlotLifeCycle(this);
        } 

    } 

}
