// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc20230330.models;

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
 * {@link SessionNetworkRule} extends {@link TeaModel}
 *
 * <p>SessionNetworkRule</p>
 */
public class SessionNetworkRule extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("transform")
    private SessionNetworkRuleTransform transform;

    private SessionNetworkRule(Builder builder) {
        this.transform = builder.transform;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SessionNetworkRule create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return transform
     */
    public SessionNetworkRuleTransform getTransform() {
        return this.transform;
    }

    public static final class Builder {
        private SessionNetworkRuleTransform transform; 

        private Builder() {
        } 

        private Builder(SessionNetworkRule model) {
            this.transform = model.transform;
        } 

        /**
         * transform.
         */
        public Builder transform(SessionNetworkRuleTransform transform) {
            this.transform = transform;
            return this;
        }

        public SessionNetworkRule build() {
            return new SessionNetworkRule(this);
        } 

    } 

}
