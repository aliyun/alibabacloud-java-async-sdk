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
 * {@link WarmPoolCapacityPolicy} extends {@link TeaModel}
 *
 * <p>WarmPoolCapacityPolicy</p>
 */
public class WarmPoolCapacityPolicy extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("minReadySandboxes")
    private Long minReadySandboxes;

    @com.aliyun.core.annotation.NameInMap("scheduledPolicies")
    private java.util.List<WarmPoolScheduledPolicy> scheduledPolicies;

    private WarmPoolCapacityPolicy(Builder builder) {
        this.minReadySandboxes = builder.minReadySandboxes;
        this.scheduledPolicies = builder.scheduledPolicies;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static WarmPoolCapacityPolicy create() {
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
    public java.util.List<WarmPoolScheduledPolicy> getScheduledPolicies() {
        return this.scheduledPolicies;
    }

    public static final class Builder {
        private Long minReadySandboxes; 
        private java.util.List<WarmPoolScheduledPolicy> scheduledPolicies; 

        private Builder() {
        } 

        private Builder(WarmPoolCapacityPolicy model) {
            this.minReadySandboxes = model.minReadySandboxes;
            this.scheduledPolicies = model.scheduledPolicies;
        } 

        /**
         * <p>The base target number of ready sandboxes. This parameter is required and can be set to 0.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder minReadySandboxes(Long minReadySandboxes) {
            this.minReadySandboxes = minReadySandboxes;
            return this;
        }

        /**
         * <p>The list of scheduled capacity rules. This parameter is optional.</p>
         */
        public Builder scheduledPolicies(java.util.List<WarmPoolScheduledPolicy> scheduledPolicies) {
            this.scheduledPolicies = scheduledPolicies;
            return this;
        }

        public WarmPoolCapacityPolicy build() {
            return new WarmPoolCapacityPolicy(this);
        } 

    } 

}
