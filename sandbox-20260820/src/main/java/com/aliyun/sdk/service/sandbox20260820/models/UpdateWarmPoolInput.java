// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sandbox20260820.models;

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
 * {@link UpdateWarmPoolInput} extends {@link TeaModel}
 *
 * <p>UpdateWarmPoolInput</p>
 */
public class UpdateWarmPoolInput extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("capacityPolicy")
    @com.aliyun.core.annotation.Validation(required = true)
    private WarmPoolCapacityPolicyInput capacityPolicy;

    private UpdateWarmPoolInput(Builder builder) {
        this.capacityPolicy = builder.capacityPolicy;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateWarmPoolInput create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return capacityPolicy
     */
    public WarmPoolCapacityPolicyInput getCapacityPolicy() {
        return this.capacityPolicy;
    }

    public static final class Builder {
        private WarmPoolCapacityPolicyInput capacityPolicy; 

        private Builder() {
        } 

        private Builder(UpdateWarmPoolInput model) {
            this.capacityPolicy = model.capacityPolicy;
        } 

        /**
         * <p>The warm pool capacity policy, which includes the base target capacity and optional scheduled rules.</p>
         * <p>This parameter is required.</p>
         */
        public Builder capacityPolicy(WarmPoolCapacityPolicyInput capacityPolicy) {
            this.capacityPolicy = capacityPolicy;
            return this;
        }

        public UpdateWarmPoolInput build() {
            return new UpdateWarmPoolInput(this);
        } 

    } 

}
