// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

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
 * {@link DeviceGroupDynamicRule} extends {@link TeaModel}
 *
 * <p>DeviceGroupDynamicRule</p>
 */
public class DeviceGroupDynamicRule extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Args")
    private Object args;

    @com.aliyun.core.annotation.NameInMap("Key")
    private String key;

    @com.aliyun.core.annotation.NameInMap("Operator")
    private String operator;

    private DeviceGroupDynamicRule(Builder builder) {
        this.args = builder.args;
        this.key = builder.key;
        this.operator = builder.operator;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeviceGroupDynamicRule create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return args
     */
    public Object getArgs() {
        return this.args;
    }

    /**
     * @return key
     */
    public String getKey() {
        return this.key;
    }

    /**
     * @return operator
     */
    public String getOperator() {
        return this.operator;
    }

    public static final class Builder {
        private Object args; 
        private String key; 
        private String operator; 

        private Builder() {
        } 

        private Builder(DeviceGroupDynamicRule model) {
            this.args = model.args;
            this.key = model.key;
            this.operator = model.operator;
        } 

        /**
         * Args.
         */
        public Builder args(Object args) {
            this.args = args;
            return this;
        }

        /**
         * Key.
         */
        public Builder key(String key) {
            this.key = key;
            return this;
        }

        /**
         * Operator.
         */
        public Builder operator(String operator) {
            this.operator = operator;
            return this;
        }

        public DeviceGroupDynamicRule build() {
            return new DeviceGroupDynamicRule(this);
        } 

    } 

}
