// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.antiddos_public20170518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInstanceResponseBody</p>
 */
public class DescribeInstanceResponseBody extends TeaModel {
    @NameInMap("InstanceList")
    private InstanceList instanceList;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Total")
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
         * InstanceList.
         */
        public Builder instanceList(InstanceList instanceList) {
            this.instanceList = instanceList;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Total.
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
        @NameInMap("BlackholeThreshold")
        private Integer blackholeThreshold;

        @NameInMap("DefenseBpsThreshold")
        private Integer defenseBpsThreshold;

        @NameInMap("DefensePpsThreshold")
        private Integer defensePpsThreshold;

        @NameInMap("ElasticThreshold")
        private Integer elasticThreshold;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("InstanceIp")
        private String instanceIp;

        @NameInMap("InstanceName")
        private String instanceName;

        @NameInMap("InstanceStatus")
        private String instanceStatus;

        @NameInMap("InstanceType")
        private String instanceType;

        @NameInMap("IpVersion")
        private String ipVersion;

        @NameInMap("IsBgppack")
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
             * BlackholeThreshold.
             */
            public Builder blackholeThreshold(Integer blackholeThreshold) {
                this.blackholeThreshold = blackholeThreshold;
                return this;
            }

            /**
             * DefenseBpsThreshold.
             */
            public Builder defenseBpsThreshold(Integer defenseBpsThreshold) {
                this.defenseBpsThreshold = defenseBpsThreshold;
                return this;
            }

            /**
             * DefensePpsThreshold.
             */
            public Builder defensePpsThreshold(Integer defensePpsThreshold) {
                this.defensePpsThreshold = defensePpsThreshold;
                return this;
            }

            /**
             * ElasticThreshold.
             */
            public Builder elasticThreshold(Integer elasticThreshold) {
                this.elasticThreshold = elasticThreshold;
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
             * InstanceIp.
             */
            public Builder instanceIp(String instanceIp) {
                this.instanceIp = instanceIp;
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
             * InstanceStatus.
             */
            public Builder instanceStatus(String instanceStatus) {
                this.instanceStatus = instanceStatus;
                return this;
            }

            /**
             * InstanceType.
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * IpVersion.
             */
            public Builder ipVersion(String ipVersion) {
                this.ipVersion = ipVersion;
                return this;
            }

            /**
             * IsBgppack.
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
        @NameInMap("Instance")
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
