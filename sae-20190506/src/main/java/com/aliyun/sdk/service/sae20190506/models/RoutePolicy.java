// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

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
 * {@link RoutePolicy} extends {@link TeaModel}
 *
 * <p>RoutePolicy</p>
 */
public class RoutePolicy extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("condition")
    private String condition;

    @com.aliyun.core.annotation.NameInMap("policyItems")
    private java.util.List<PolicyItem> policyItems;

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
    public String getCondition() {
        return this.condition;
    }

    /**
     * @return policyItems
     */
    public java.util.List<PolicyItem> getPolicyItems() {
        return this.policyItems;
    }

    public static final class Builder {
        private String condition; 
        private java.util.List<PolicyItem> policyItems; 

        /**
         * condition.
         */
        public Builder condition(String condition) {
            this.condition = condition;
            return this;
        }

        /**
         * policyItems.
         */
        public Builder policyItems(java.util.List<PolicyItem> policyItems) {
            this.policyItems = policyItems;
            return this;
        }

        public RoutePolicy build() {
            return new RoutePolicy(this);
        } 

    } 

}
