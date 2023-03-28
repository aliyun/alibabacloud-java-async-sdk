// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc_open20210406.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RoutePolicy} extends {@link TeaModel}
 *
 * <p>RoutePolicy</p>
 */
public class RoutePolicy extends TeaModel {
    @NameInMap("condition")
    @Validation(required = true)
    private byte[] condition;

    @NameInMap("policyItems")
    @Validation(required = true)
    private java.util.List < PolicyItem > policyItems;

    private RoutePolicy(Builder builder) {
        this.condition = builder.condition;
        this.policyItems = builder.policyItems;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RoutePolicy create() {
        return builder().build();
    }

    /**
     * @return condition
     */
    public byte[] getCondition() {
        return this.condition;
    }

    /**
     * @return policyItems
     */
    public java.util.List < PolicyItem > getPolicyItems() {
        return this.policyItems;
    }

    public static final class Builder {
        private byte[] condition; 
        private java.util.List < PolicyItem > policyItems; 

        /**
         * 条件模式：灰度规则项的逻辑运算。 枚举值： AND:  全部灰度规则项满足则命中。 OR: 任意一个灰度规则项满足则命中。
         */
        public Builder condition(byte[] condition) {
            this.condition = condition;
            return this;
        }

        /**
         * 灰度规则项数组
         */
        public Builder policyItems(java.util.List < PolicyItem > policyItems) {
            this.policyItems = policyItems;
            return this;
        }

        public RoutePolicy build() {
            return new RoutePolicy(this);
        } 

    } 

}
