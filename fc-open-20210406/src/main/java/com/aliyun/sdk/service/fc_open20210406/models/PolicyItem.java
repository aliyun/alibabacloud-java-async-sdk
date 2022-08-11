// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc_open20210406.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PolicyItem} extends {@link TeaModel}
 *
 * <p>PolicyItem</p>
 */
public class PolicyItem extends TeaModel {
    @NameInMap("key")
    @Validation(required = true)
    private byte[] key;

    @NameInMap("operator")
    @Validation(required = true)
    private byte[] operator;

    @NameInMap("type")
    @Validation(required = true)
    private byte[] type;

    @NameInMap("value")
    @Validation(required = true)
    private byte[] value;

    private PolicyItem(Builder builder) {
        this.key = builder.key;
        this.operator = builder.operator;
        this.type = builder.type;
        this.value = builder.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PolicyItem create() {
        return builder().build();
    }

    /**
     * @return key
     */
    public byte[] getKey() {
        return this.key;
    }

    /**
     * @return operator
     */
    public byte[] getOperator() {
        return this.operator;
    }

    /**
     * @return type
     */
    public byte[] getType() {
        return this.type;
    }

    /**
     * @return value
     */
    public byte[] getValue() {
        return this.value;
    }

    public static final class Builder {
        private byte[] key; 
        private byte[] operator; 
        private byte[] type; 
        private byte[] value; 

        /**
         * key指定控制流量灰度的参数名。例如key为"x-test-uid"，则请求"x-test-uid" 的值将决定请求是否被路由到灰度版本上。
         */
        public Builder key(byte[] key) {
            this.key = key;
            return this;
        }

        /**
         * 运算符。 参数名key对应请求中的实际值，与设定的value值做运算符比较。取值：   ● >, <, >=, <=, = 和 != ，大小比较规则遵循字典序； ● in ：字符串包含关系； ●  percent: 百分比值（取值范围 (0,100] 的整数) 表示指定 key 的 value 值分布的特定百分比路由至灰度实例 。比如一条 { type=Header, key=uid, value=20, operator=percent } 的规则，表示取 http header 中 uid 的值分布的 20% 打到灰度实例。
         */
        public Builder operator(byte[] operator) {
            this.operator = operator;
            return this;
        }

        /**
         * 参数类型。可以取HTTP请求中的有关值。
         */
        public Builder type(byte[] type) {
            this.type = type;
            return this;
        }

        /**
         * value指定控制流量灰度的参数值。参数名key对应请求中的实际值，与该值做运算符比较，决定请求是否被路由到灰度版本上。
         */
        public Builder value(byte[] value) {
            this.value = value;
            return this;
        }

        public PolicyItem build() {
            return new PolicyItem(this);
        } 

    } 

}
