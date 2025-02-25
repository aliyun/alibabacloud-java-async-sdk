// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbase20190101.models;

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
 * {@link ListHBaseInstancesResponseBody} extends {@link TeaModel}
 *
 * <p>ListHBaseInstancesResponseBody</p>
 */
public class ListHBaseInstancesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Instances")
    private Instances instances;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListHBaseInstancesResponseBody(Builder builder) {
        this.instances = builder.instances;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListHBaseInstancesResponseBody create() {
        return builder().build();
    }

    /**
     * @return instances
     */
    public Instances getInstances() {
        return this.instances;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Instances instances; 
        private String requestId; 

        /**
         * Instances.
         */
        public Builder instances(Instances instances) {
            this.instances = instances;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListHBaseInstancesResponseBody build() {
            return new ListHBaseInstancesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListHBaseInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>ListHBaseInstancesResponseBody</p>
     */
    public static class Instance extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("InstanceName")
        private String instanceName;

        @com.aliyun.core.annotation.NameInMap("IsDefault")
        private Boolean isDefault;

        private Instance(Builder builder) {
            this.instanceId = builder.instanceId;
            this.instanceName = builder.instanceName;
            this.isDefault = builder.isDefault;
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

        /**
         * @return isDefault
         */
        public Boolean getIsDefault() {
            return this.isDefault;
        }

        public static final class Builder {
            private String instanceId; 
            private String instanceName; 
            private Boolean isDefault; 

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * InstanceName.
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * IsDefault.
             */
            public Builder isDefault(Boolean isDefault) {
                this.isDefault = isDefault;
                return this;
            }

            public Instance build() {
                return new Instance(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListHBaseInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>ListHBaseInstancesResponseBody</p>
     */
    public static class Instances extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Instance")
        private java.util.List<Instance> instance;

        private Instances(Builder builder) {
            this.instance = builder.instance;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Instances create() {
            return builder().build();
        }

        /**
         * @return instance
         */
        public java.util.List<Instance> getInstance() {
            return this.instance;
        }

        public static final class Builder {
            private java.util.List<Instance> instance; 

            /**
             * Instance.
             */
            public Builder instance(java.util.List<Instance> instance) {
                this.instance = instance;
                return this;
            }

            public Instances build() {
                return new Instances(this);
            } 

        } 

    }
}
