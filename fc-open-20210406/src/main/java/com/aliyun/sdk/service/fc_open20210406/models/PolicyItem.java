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
         * key指定控制流量灰度的字段名。 例如key为"x-test-uid"，则请求中"x-test-uid" 字段的值将决定请求是否被路由到灰度版本上
         */
        public Builder key(byte[] key) {
            this.key = key;
            return this;
        }

        /**
         * operator指定运算符。  将请求中由参数key指定的字段的实际值和参数 value 指定的值，按指定的运算符进行比较。  取值：    ● >, <, >=, <=, = 和 != ，大小比较规则遵循字典序；  ● in ：字符串包含关系；  ●  percent: 百分比值（取值范围 (0,100] 的整数)  表示根据请求中指定字段key对应的实际值分布，按百分比灰度。其中字段由参数key指定，百分比值由参数 value 指定 。 例如一条 { type=Header, key=uid, value=20, operator=percent } 的规则，表示根据请求 header 中字段 uid 的值的分布，其中 20% 的请求路由到灰度版本上。
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
         * value指定控制流量灰度的字段值。 请求中由参数key指定的字段实际值会和参数value字段值，按指定的运算符进行比较，决定请求是否被路由到灰度版本上
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
