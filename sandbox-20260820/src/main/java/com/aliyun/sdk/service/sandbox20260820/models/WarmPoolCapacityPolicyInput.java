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
 * {@link WarmPoolCapacityPolicyInput} extends {@link TeaModel}
 *
 * <p>WarmPoolCapacityPolicyInput</p>
 */
public class WarmPoolCapacityPolicyInput extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("minReadySandboxes")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long minReadySandboxes;

    @com.aliyun.core.annotation.NameInMap("scheduledPolicies")
    private java.util.List<WarmPoolScheduledPolicyInput> scheduledPolicies;

    private WarmPoolCapacityPolicyInput(Builder builder) {
        this.minReadySandboxes = builder.minReadySandboxes;
        this.scheduledPolicies = builder.scheduledPolicies;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static WarmPoolCapacityPolicyInput create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return minReadySandboxes
     */
    public Long getMinReadySandboxes() {
        return this.minReadySandboxes;
    }

    /**
     * @return scheduledPolicies
     */
    public java.util.List<WarmPoolScheduledPolicyInput> getScheduledPolicies() {
        return this.scheduledPolicies;
    }

    public static final class Builder {
        private Long minReadySandboxes; 
        private java.util.List<WarmPoolScheduledPolicyInput> scheduledPolicies; 

        private Builder() {
        } 

        private Builder(WarmPoolCapacityPolicyInput model) {
            this.minReadySandboxes = model.minReadySandboxes;
            this.scheduledPolicies = model.scheduledPolicies;
        } 

        /**
         * <p>The base target number of ready sandboxes, which is required and can be set to 0.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder minReadySandboxes(Long minReadySandboxes) {
            this.minReadySandboxes = minReadySandboxes;
            return this;
        }

        /**
         * <p>The list of scheduled capacity rules, which is optional.</p>
         */
        public Builder scheduledPolicies(java.util.List<WarmPoolScheduledPolicyInput> scheduledPolicies) {
            this.scheduledPolicies = scheduledPolicies;
            return this;
        }

        public WarmPoolCapacityPolicyInput build() {
            return new WarmPoolCapacityPolicyInput(this);
        } 

    } 

}
