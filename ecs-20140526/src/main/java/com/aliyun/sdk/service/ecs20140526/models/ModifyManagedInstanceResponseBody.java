// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyManagedInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyManagedInstanceResponseBody</p>
 */
public class ModifyManagedInstanceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Instance")
    private Instance instance;

    private ModifyManagedInstanceResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.instance = builder.instance;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyManagedInstanceResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return instance
     */
    public Instance getInstance() {
        return this.instance;
    }

    public static final class Builder {
        private String requestId; 
        private Instance instance; 

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * A collection of managed instance information.
         */
        public Builder instance(Instance instance) {
            this.instance = instance;
            return this;
        }

        public ModifyManagedInstanceResponseBody build() {
            return new ModifyManagedInstanceResponseBody(this);
        } 

    } 

    public static class Instance extends TeaModel {
        @NameInMap("InstanceName")
        private String instanceName;

        @NameInMap("InstanceId")
        private String instanceId;

        private Instance(Builder builder) {
            this.instanceName = builder.instanceName;
            this.instanceId = builder.instanceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Instance create() {
            return builder().build();
        }

        /**
         * @return instanceName
         */
        public String getInstanceName() {
            return this.instanceName;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        public static final class Builder {
            private String instanceName; 
            private String instanceId; 

            /**
             * The name of the managed instance.
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * The ID of the managed instance.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            public Instance build() {
                return new Instance(this);
            } 

        } 

    }
}
