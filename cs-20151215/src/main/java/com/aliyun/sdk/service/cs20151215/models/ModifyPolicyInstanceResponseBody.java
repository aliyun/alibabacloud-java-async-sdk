// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ModifyPolicyInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyPolicyInstanceResponseBody</p>
 */
public class ModifyPolicyInstanceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("instances")
    private java.util.List < String > instances;

    private ModifyPolicyInstanceResponseBody(Builder builder) {
        this.instances = builder.instances;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyPolicyInstanceResponseBody create() {
        return builder().build();
    }

    /**
     * @return instances
     */
    public java.util.List < String > getInstances() {
        return this.instances;
    }

    public static final class Builder {
        private java.util.List < String > instances; 

        /**
         * <p>The list of policy instances that are updated.</p>
         */
        public Builder instances(java.util.List < String > instances) {
            this.instances = instances;
            return this;
        }

        public ModifyPolicyInstanceResponseBody build() {
            return new ModifyPolicyInstanceResponseBody(this);
        } 

    } 

}
