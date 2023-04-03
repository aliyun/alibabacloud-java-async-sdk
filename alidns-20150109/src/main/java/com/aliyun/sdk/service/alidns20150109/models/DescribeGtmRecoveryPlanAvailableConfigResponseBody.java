// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeGtmRecoveryPlanAvailableConfigResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeGtmRecoveryPlanAvailableConfigResponseBody</p>
 */
public class DescribeGtmRecoveryPlanAvailableConfigResponseBody extends TeaModel {
    @NameInMap("Instances")
    private Instances instances;

    @NameInMap("RequestId")
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
         * The list of GTM instances involved in the disaster recovery plan.
         */
        public Builder instances(Instances instances) {
            this.instances = instances;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeGtmRecoveryPlanAvailableConfigResponseBody build() {
            return new DescribeGtmRecoveryPlanAvailableConfigResponseBody(this);
        } 

    } 

    public static class AddrPool extends TeaModel {
        @NameInMap("AddrPoolId")
        private String addrPoolId;

        @NameInMap("Name")
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

            /**
             * The ID of the address pool.
             */
            public Builder addrPoolId(String addrPoolId) {
                this.addrPoolId = addrPoolId;
                return this;
            }

            /**
             * The name of the address pool.
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
    public static class AddrPools extends TeaModel {
        @NameInMap("AddrPool")
        private java.util.List < AddrPool> addrPool;

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
        public java.util.List < AddrPool> getAddrPool() {
            return this.addrPool;
        }

        public static final class Builder {
            private java.util.List < AddrPool> addrPool; 

            /**
             * AddrPool.
             */
            public Builder addrPool(java.util.List < AddrPool> addrPool) {
                this.addrPool = addrPool;
                return this;
            }

            public AddrPools build() {
                return new AddrPools(this);
            } 

        } 

    }
    public static class Instance extends TeaModel {
        @NameInMap("AddrPools")
        private AddrPools addrPools;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("InstanceName")
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

            /**
             * The list of address pools for the GTM instance.
             */
            public Builder addrPools(AddrPools addrPools) {
                this.addrPools = addrPools;
                return this;
            }

            /**
             * The ID of the GTM instance.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The name of the GTM instance.
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
    public static class Instances extends TeaModel {
        @NameInMap("Instance")
        private java.util.List < Instance> instance;

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
        public java.util.List < Instance> getInstance() {
            return this.instance;
        }

        public static final class Builder {
            private java.util.List < Instance> instance; 

            /**
             * Instance.
             */
            public Builder instance(java.util.List < Instance> instance) {
                this.instance = instance;
                return this;
            }

            public Instances build() {
                return new Instances(this);
            } 

        } 

    }
}
