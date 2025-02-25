// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.antiddos_public20170518.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInstanceResponseBody</p>
 */
public class DescribeInstanceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("InstanceList")
    private InstanceList instanceList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Total")
    private Integer total;

    private DescribeInstanceResponseBody(Builder builder) {
        this.instanceList = builder.instanceList;
        this.requestId = builder.requestId;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInstanceResponseBody create() {
        return builder().build();
    }

    /**
     * @return instanceList
     */
    public InstanceList getInstanceList() {
        return this.instanceList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return total
     */
    public Integer getTotal() {
        return this.total;
    }

    public static final class Builder {
        private InstanceList instanceList; 
        private String requestId; 
        private Integer total; 

        /**
         * An array that consists of the details of the asset.
         */
        public Builder instanceList(InstanceList instanceList) {
            this.instanceList = instanceList;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The total number of the assets.
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        public DescribeInstanceResponseBody build() {
            return new DescribeInstanceResponseBody(this);
        } 

    } 

    public static class Instance extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BlackholeThreshold")
        private Integer blackholeThreshold;

        @com.aliyun.core.annotation.NameInMap("DefenseBpsThreshold")
        private Integer defenseBpsThreshold;

        @com.aliyun.core.annotation.NameInMap("DefensePpsThreshold")
        private Integer defensePpsThreshold;

        @com.aliyun.core.annotation.NameInMap("ElasticThreshold")
        private Integer elasticThreshold;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("InstanceIp")
        private String instanceIp;

        @com.aliyun.core.annotation.NameInMap("InstanceName")
        private String instanceName;

        @com.aliyun.core.annotation.NameInMap("InstanceStatus")
        private String instanceStatus;

        @com.aliyun.core.annotation.NameInMap("InstanceType")
        private String instanceType;

        @com.aliyun.core.annotation.NameInMap("IpVersion")
        private String ipVersion;

        @com.aliyun.core.annotation.NameInMap("IsBgppack")
        private Boolean isBgppack;

        private Instance(Builder builder) {
            this.blackholeThreshold = builder.blackholeThreshold;
            this.defenseBpsThreshold = builder.defenseBpsThreshold;
            this.defensePpsThreshold = builder.defensePpsThreshold;
            this.elasticThreshold = builder.elasticThreshold;
            this.instanceId = builder.instanceId;
            this.instanceIp = builder.instanceIp;
            this.instanceName = builder.instanceName;
            this.instanceStatus = builder.instanceStatus;
            this.instanceType = builder.instanceType;
            this.ipVersion = builder.ipVersion;
            this.isBgppack = builder.isBgppack;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Instance create() {
            return builder().build();
        }

        /**
         * @return blackholeThreshold
         */
        public Integer getBlackholeThreshold() {
            return this.blackholeThreshold;
        }

        /**
         * @return defenseBpsThreshold
         */
        public Integer getDefenseBpsThreshold() {
            return this.defenseBpsThreshold;
        }

        /**
         * @return defensePpsThreshold
         */
        public Integer getDefensePpsThreshold() {
            return this.defensePpsThreshold;
        }

        /**
         * @return elasticThreshold
         */
        public Integer getElasticThreshold() {
            return this.elasticThreshold;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return instanceIp
         */
        public String getInstanceIp() {
            return this.instanceIp;
        }

        /**
         * @return instanceName
         */
        public String getInstanceName() {
            return this.instanceName;
        }

        /**
         * @return instanceStatus
         */
        public String getInstanceStatus() {
            return this.instanceStatus;
        }

        /**
         * @return instanceType
         */
        public String getInstanceType() {
            return this.instanceType;
        }

        /**
         * @return ipVersion
         */
        public String getIpVersion() {
            return this.ipVersion;
        }

        /**
         * @return isBgppack
         */
        public Boolean getIsBgppack() {
            return this.isBgppack;
        }

        public static final class Builder {
            private Integer blackholeThreshold; 
            private Integer defenseBpsThreshold; 
            private Integer defensePpsThreshold; 
            private Integer elasticThreshold; 
            private String instanceId; 
            private String instanceIp; 
            private String instanceName; 
            private String instanceStatus; 
            private String instanceType; 
            private String ipVersion; 
            private Boolean isBgppack; 

            /**
             * The basic protection threshold for the asset. Unit: Mbit/s.
             */
            public Builder blackholeThreshold(Integer blackholeThreshold) {
                this.blackholeThreshold = blackholeThreshold;
                return this;
            }

            /**
             * The traffic scrubbing threshold for the asset. Unit: Mbit/s.
             */
            public Builder defenseBpsThreshold(Integer defenseBpsThreshold) {
                this.defenseBpsThreshold = defenseBpsThreshold;
                return this;
            }

            /**
             * The packet scrubbing threshold for the asset. Unit: packets per second (pps).
             */
            public Builder defensePpsThreshold(Integer defensePpsThreshold) {
                this.defensePpsThreshold = defensePpsThreshold;
                return this;
            }

            /**
             * The burstable protection threshold for the asset. Unit: Mbit/s.
             */
            public Builder elasticThreshold(Integer elasticThreshold) {
                this.elasticThreshold = elasticThreshold;
                return this;
            }

            /**
             * The ID of the asset.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The IP address of the asset.
             */
            public Builder instanceIp(String instanceIp) {
                this.instanceIp = instanceIp;
                return this;
            }

            /**
             * The name of the asset.
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * The DDoS mitigation status of the asset. Valid values:
             * <p>
             * 
             * *   **mitigating**: indicates that traffic scrubbing is triggered for the asset.
             * *   **blackholed**: indicates that blackhole filtering is triggered for the asset.
             * *   **normal**: indicates that the instance is normal.
             */
            public Builder instanceStatus(String instanceStatus) {
                this.instanceStatus = instanceStatus;
                return this;
            }

            /**
             * The type of the asset. Valid values:
             * <p>
             * 
             * *   **ecs**: ECS instance
             * *   **slb**: SLB instance
             * *   **eip**: EIP
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * The IP protocol that is supported by the asset. Valid values:
             * <p>
             * 
             * *   **v4**: IPv4
             * *   **v6**: IPv6
             */
            public Builder ipVersion(String ipVersion) {
                this.ipVersion = ipVersion;
                return this;
            }

            /**
             * Indicates whether the asset is associated with an Anti-DDoS Origin Basic instance. Valid values:
             * <p>
             * 
             * *   **true**: yes
             * *   **false**: no
             */
            public Builder isBgppack(Boolean isBgppack) {
                this.isBgppack = isBgppack;
                return this;
            }

            public Instance build() {
                return new Instance(this);
            } 

        } 

    }
    public static class InstanceList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Instance")
        private java.util.List < Instance> instance;

        private InstanceList(Builder builder) {
            this.instance = builder.instance;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceList create() {
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

            public InstanceList build() {
                return new InstanceList(this);
            } 

        } 

    }
}
