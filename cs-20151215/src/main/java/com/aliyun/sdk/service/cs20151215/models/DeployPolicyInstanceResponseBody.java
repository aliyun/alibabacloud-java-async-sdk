// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

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
 * {@link DeployPolicyInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>DeployPolicyInstanceResponseBody</p>
 */
public class DeployPolicyInstanceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("instances")
    private java.util.List<String> instances;

    private DeployPolicyInstanceResponseBody(Builder builder) {
        this.instances = builder.instances;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeployPolicyInstanceResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instances
     */
    public java.util.List<String> getInstances() {
        return this.instances;
    }

    public static final class Builder {
        private java.util.List<String> instances; 

        private Builder() {
        } 

        private Builder(DeployPolicyInstanceResponseBody model) {
            this.instances = model.instances;
        } 

        /**
         * <p>A list of policy instances.</p>
         */
        public Builder instances(java.util.List<String> instances) {
            this.instances = instances;
            return this;
        }

        public DeployPolicyInstanceResponseBody build() {
            return new DeployPolicyInstanceResponseBody(this);
        } 

    } 

}
