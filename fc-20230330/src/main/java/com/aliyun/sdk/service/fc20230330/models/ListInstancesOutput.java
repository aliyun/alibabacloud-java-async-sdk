// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc20230330.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListInstancesOutput} extends {@link TeaModel}
 *
 * <p>ListInstancesOutput</p>
 */
public class ListInstancesOutput extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("instances")
    private java.util.List < InstanceInfo > instances;

    private ListInstancesOutput(Builder builder) {
        this.instances = builder.instances;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListInstancesOutput create() {
        return builder().build();
    }

    /**
     * @return instances
     */
    public java.util.List < InstanceInfo > getInstances() {
        return this.instances;
    }

    public static final class Builder {
        private java.util.List < InstanceInfo > instances; 

        /**
         * instances.
         */
        public Builder instances(java.util.List < InstanceInfo > instances) {
            this.instances = instances;
            return this;
        }

        public ListInstancesOutput build() {
            return new ListInstancesOutput(this);
        } 

    } 

}
