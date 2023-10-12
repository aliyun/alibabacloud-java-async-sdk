// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cmn20200825.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListInstancesResponseBody} extends {@link TeaModel}
 *
 * <p>ListInstancesResponseBody</p>
 */
public class ListInstancesResponseBody extends TeaModel {
    @NameInMap("Instances")
    private java.util.List < Instances> instances;

    @NameInMap("RequestId")
    private String requestId;

    private ListInstancesResponseBody(Builder builder) {
        this.instances = builder.instances;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListInstancesResponseBody create() {
        return builder().build();
    }

    /**
     * @return instances
     */
    public java.util.List < Instances> getInstances() {
        return this.instances;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < Instances> instances; 
        private String requestId; 

        /**
         * Instances.
         */
        public Builder instances(java.util.List < Instances> instances) {
            this.instances = instances;
            return this;
        }

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListInstancesResponseBody build() {
            return new ListInstancesResponseBody(this);
        } 

    } 

    public static class Instances extends TeaModel {
        @NameInMap("InstanceDeviceMaxCount")
        private String instanceDeviceMaxCount;

        @NameInMap("InstanceEndDate")
        private String instanceEndDate;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("InstanceName")
        private String instanceName;

        @NameInMap("InstanceOpenDate")
        private String instanceOpenDate;

        @NameInMap("InstanceSpec")
        private String instanceSpec;

        @NameInMap("InstanceStatus")
        private String instanceStatus;

        private Instances(Builder builder) {
            this.instanceDeviceMaxCount = builder.instanceDeviceMaxCount;
            this.instanceEndDate = builder.instanceEndDate;
            this.instanceId = builder.instanceId;
            this.instanceName = builder.instanceName;
            this.instanceOpenDate = builder.instanceOpenDate;
            this.instanceSpec = builder.instanceSpec;
            this.instanceStatus = builder.instanceStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Instances create() {
            return builder().build();
        }

        /**
         * @return instanceDeviceMaxCount
         */
        public String getInstanceDeviceMaxCount() {
            return this.instanceDeviceMaxCount;
        }

        /**
         * @return instanceEndDate
         */
        public String getInstanceEndDate() {
            return this.instanceEndDate;
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
         * @return instanceOpenDate
         */
        public String getInstanceOpenDate() {
            return this.instanceOpenDate;
        }

        /**
         * @return instanceSpec
         */
        public String getInstanceSpec() {
            return this.instanceSpec;
        }

        /**
         * @return instanceStatus
         */
        public String getInstanceStatus() {
            return this.instanceStatus;
        }

        public static final class Builder {
            private String instanceDeviceMaxCount; 
            private String instanceEndDate; 
            private String instanceId; 
            private String instanceName; 
            private String instanceOpenDate; 
            private String instanceSpec; 
            private String instanceStatus; 

            /**
             * InstanceDeviceMaxCount.
             */
            public Builder instanceDeviceMaxCount(String instanceDeviceMaxCount) {
                this.instanceDeviceMaxCount = instanceDeviceMaxCount;
                return this;
            }

            /**
             * InstanceEndDate.
             */
            public Builder instanceEndDate(String instanceEndDate) {
                this.instanceEndDate = instanceEndDate;
                return this;
            }

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
             * InstanceOpenDate.
             */
            public Builder instanceOpenDate(String instanceOpenDate) {
                this.instanceOpenDate = instanceOpenDate;
                return this;
            }

            /**
             * InstanceSpec.
             */
            public Builder instanceSpec(String instanceSpec) {
                this.instanceSpec = instanceSpec;
                return this;
            }

            /**
             * InstanceStatus.
             */
            public Builder instanceStatus(String instanceStatus) {
                this.instanceStatus = instanceStatus;
                return this;
            }

            public Instances build() {
                return new Instances(this);
            } 

        } 

    }
}
