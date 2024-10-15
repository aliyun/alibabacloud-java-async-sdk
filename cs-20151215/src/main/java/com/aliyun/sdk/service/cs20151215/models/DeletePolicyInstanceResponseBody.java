// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DeletePolicyInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>DeletePolicyInstanceResponseBody</p>
 */
public class DeletePolicyInstanceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("instances")
    private java.util.List < String > instances;

    private DeletePolicyInstanceResponseBody(Builder builder) {
        this.instances = builder.instances;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeletePolicyInstanceResponseBody create() {
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
         * <p>A list of policy instances.</p>
         */
        public Builder instances(java.util.List < String > instances) {
            this.instances = instances;
            return this;
        }

        public DeletePolicyInstanceResponseBody build() {
            return new DeletePolicyInstanceResponseBody(this);
        } 

    } 

}
