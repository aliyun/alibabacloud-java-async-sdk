// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyManagedInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyManagedInstanceResponseBody</p>
 */
public class ModifyManagedInstanceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Instance")
    private Instance instance;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ModifyManagedInstanceResponseBody(Builder builder) {
        this.instance = builder.instance;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyManagedInstanceResponseBody create() {
        return builder().build();
    }

    /**
     * @return instance
     */
    public Instance getInstance() {
        return this.instance;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Instance instance; 
        private String requestId; 

        /**
         * The name of the managed instance.
         */
        public Builder instance(Instance instance) {
            this.instance = instance;
            return this;
        }

        /**
         * Details of the managed instance.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ModifyManagedInstanceResponseBody build() {
            return new ModifyManagedInstanceResponseBody(this);
        } 

    } 

    public static class Instance extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("InstanceName")
        private String instanceName;

        private Instance(Builder builder) {
            this.instanceId = builder.instanceId;
            this.instanceName = builder.instanceName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Instance create() {
            return builder().build();
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return instanceName
         */
        public String getInstanceName() {
            return this.instanceName;
        }

        public static final class Builder {
            private String instanceId; 
            private String instanceName; 

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The ID of the managed instance.
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            public Instance build() {
                return new Instance(this);
            } 

        } 

    }
}
