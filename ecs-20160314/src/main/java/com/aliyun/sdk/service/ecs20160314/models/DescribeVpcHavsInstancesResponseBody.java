// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20160314.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeVpcHavsInstancesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeVpcHavsInstancesResponseBody</p>
 */
public class DescribeVpcHavsInstancesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("VpcHavsInstances")
    private VpcHavsInstances vpcHavsInstances;

    private DescribeVpcHavsInstancesResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.vpcHavsInstances = builder.vpcHavsInstances;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVpcHavsInstancesResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return vpcHavsInstances
     */
    public VpcHavsInstances getVpcHavsInstances() {
        return this.vpcHavsInstances;
    }

    public static final class Builder {
        private String requestId; 
        private VpcHavsInstances vpcHavsInstances; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * VpcHavsInstances.
         */
        public Builder vpcHavsInstances(VpcHavsInstances vpcHavsInstances) {
            this.vpcHavsInstances = vpcHavsInstances;
            return this;
        }

        public DescribeVpcHavsInstancesResponseBody build() {
            return new DescribeVpcHavsInstancesResponseBody(this);
        } 

    } 

    public static class HavsInstance extends TeaModel {
        @NameInMap("EcsInstanceId")
        private String ecsInstanceId;

        @NameInMap("Reason")
        private String reason;

        private HavsInstance(Builder builder) {
            this.ecsInstanceId = builder.ecsInstanceId;
            this.reason = builder.reason;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HavsInstance create() {
            return builder().build();
        }

        /**
         * @return ecsInstanceId
         */
        public String getEcsInstanceId() {
            return this.ecsInstanceId;
        }

        /**
         * @return reason
         */
        public String getReason() {
            return this.reason;
        }

        public static final class Builder {
            private String ecsInstanceId; 
            private String reason; 

            /**
             * EcsInstanceId.
             */
            public Builder ecsInstanceId(String ecsInstanceId) {
                this.ecsInstanceId = ecsInstanceId;
                return this;
            }

            /**
             * Reason.
             */
            public Builder reason(String reason) {
                this.reason = reason;
                return this;
            }

            public HavsInstance build() {
                return new HavsInstance(this);
            } 

        } 

    }
    public static class HavsInstances extends TeaModel {
        @NameInMap("HavsInstance")
        private java.util.List < HavsInstance> havsInstance;

        private HavsInstances(Builder builder) {
            this.havsInstance = builder.havsInstance;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HavsInstances create() {
            return builder().build();
        }

        /**
         * @return havsInstance
         */
        public java.util.List < HavsInstance> getHavsInstance() {
            return this.havsInstance;
        }

        public static final class Builder {
            private java.util.List < HavsInstance> havsInstance; 

            /**
             * HavsInstance.
             */
            public Builder havsInstance(java.util.List < HavsInstance> havsInstance) {
                this.havsInstance = havsInstance;
                return this;
            }

            public HavsInstances build() {
                return new HavsInstances(this);
            } 

        } 

    }
    public static class VpcHavsInstance extends TeaModel {
        @NameInMap("HavsInstances")
        private HavsInstances havsInstances;

        @NameInMap("VpcId")
        private String vpcId;

        private VpcHavsInstance(Builder builder) {
            this.havsInstances = builder.havsInstances;
            this.vpcId = builder.vpcId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VpcHavsInstance create() {
            return builder().build();
        }

        /**
         * @return havsInstances
         */
        public HavsInstances getHavsInstances() {
            return this.havsInstances;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        public static final class Builder {
            private HavsInstances havsInstances; 
            private String vpcId; 

            /**
             * HavsInstances.
             */
            public Builder havsInstances(HavsInstances havsInstances) {
                this.havsInstances = havsInstances;
                return this;
            }

            /**
             * VpcId.
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            public VpcHavsInstance build() {
                return new VpcHavsInstance(this);
            } 

        } 

    }
    public static class VpcHavsInstances extends TeaModel {
        @NameInMap("VpcHavsInstance")
        private java.util.List < VpcHavsInstance> vpcHavsInstance;

        private VpcHavsInstances(Builder builder) {
            this.vpcHavsInstance = builder.vpcHavsInstance;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VpcHavsInstances create() {
            return builder().build();
        }

        /**
         * @return vpcHavsInstance
         */
        public java.util.List < VpcHavsInstance> getVpcHavsInstance() {
            return this.vpcHavsInstance;
        }

        public static final class Builder {
            private java.util.List < VpcHavsInstance> vpcHavsInstance; 

            /**
             * VpcHavsInstance.
             */
            public Builder vpcHavsInstance(java.util.List < VpcHavsInstance> vpcHavsInstance) {
                this.vpcHavsInstance = vpcHavsInstance;
                return this;
            }

            public VpcHavsInstances build() {
                return new VpcHavsInstances(this);
            } 

        } 

    }
}
