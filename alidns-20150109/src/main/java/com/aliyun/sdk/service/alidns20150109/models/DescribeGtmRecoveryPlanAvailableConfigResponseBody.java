// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

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
 * {@link DescribeGtmRecoveryPlanAvailableConfigResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeGtmRecoveryPlanAvailableConfigResponseBody</p>
 */
public class DescribeGtmRecoveryPlanAvailableConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Instances")
    private Instances instances;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeGtmRecoveryPlanAvailableConfigResponseBody(Builder builder) {
        this.instances = builder.instances;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeGtmRecoveryPlanAvailableConfigResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeGtmRecoveryPlanAvailableConfigResponseBody model) {
            this.instances = model.instances;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The instances.</p>
         */
        public Builder instances(Instances instances) {
            this.instances = instances;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>F8F8EF50-8B7F-4702-B294-97170A423403</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeGtmRecoveryPlanAvailableConfigResponseBody build() {
            return new DescribeGtmRecoveryPlanAvailableConfigResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeGtmRecoveryPlanAvailableConfigResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeGtmRecoveryPlanAvailableConfigResponseBody</p>
     */
    public static class AddrPool extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AddrPoolId")
        private String addrPoolId;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private AddrPool(Builder builder) {
            this.addrPoolId = builder.addrPoolId;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AddrPool create() {
            return builder().build();
        }

        /**
         * @return addrPoolId
         */
        public String getAddrPoolId() {
            return this.addrPoolId;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String addrPoolId; 
            private String name; 

            private Builder() {
            } 

            private Builder(AddrPool model) {
                this.addrPoolId = model.addrPoolId;
                this.name = model.name;
            } 

            /**
             * <p>The address pool ID.</p>
             */
            public Builder addrPoolId(String addrPoolId) {
                this.addrPoolId = addrPoolId;
                return this;
            }

            /**
             * <p>The name of the address pool.</p>
             * 
             * <strong>example:</strong>
             * <p>hra0i9</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public AddrPool build() {
                return new AddrPool(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeGtmRecoveryPlanAvailableConfigResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeGtmRecoveryPlanAvailableConfigResponseBody</p>
     */
    public static class AddrPools extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AddrPool")
        private java.util.List<AddrPool> addrPool;

        private AddrPools(Builder builder) {
            this.addrPool = builder.addrPool;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AddrPools create() {
            return builder().build();
        }

        /**
         * @return addrPool
         */
        public java.util.List<AddrPool> getAddrPool() {
            return this.addrPool;
        }

        public static final class Builder {
            private java.util.List<AddrPool> addrPool; 

            private Builder() {
            } 

            private Builder(AddrPools model) {
                this.addrPool = model.addrPool;
            } 

            /**
             * AddrPool.
             */
            public Builder addrPool(java.util.List<AddrPool> addrPool) {
                this.addrPool = addrPool;
                return this;
            }

            public AddrPools build() {
                return new AddrPools(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeGtmRecoveryPlanAvailableConfigResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeGtmRecoveryPlanAvailableConfigResponseBody</p>
     */
    public static class Instance extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AddrPools")
        private AddrPools addrPools;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("InstanceName")
        private String instanceName;

        private Instance(Builder builder) {
            this.addrPools = builder.addrPools;
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
         * @return addrPools
         */
        public AddrPools getAddrPools() {
            return this.addrPools;
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
            private AddrPools addrPools; 
            private String instanceId; 
            private String instanceName; 

            private Builder() {
            } 

            private Builder(Instance model) {
                this.addrPools = model.addrPools;
                this.instanceId = model.instanceId;
                this.instanceName = model.instanceName;
            } 

            /**
             * <p>The address pools.</p>
             */
            public Builder addrPools(AddrPools addrPools) {
                this.addrPools = addrPools;
                return this;
            }

            /**
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>instance-example</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The instance name.</p>
             * 
             * <strong>example:</strong>
             * <p>instance-name-example</p>
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
    /**
     * 
     * {@link DescribeGtmRecoveryPlanAvailableConfigResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeGtmRecoveryPlanAvailableConfigResponseBody</p>
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

            private Builder() {
            } 

            private Builder(Instances model) {
                this.instance = model.instance;
            } 

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
