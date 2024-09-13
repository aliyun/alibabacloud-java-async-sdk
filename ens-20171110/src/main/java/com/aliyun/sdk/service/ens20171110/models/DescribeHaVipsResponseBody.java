// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeHaVipsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeHaVipsResponseBody</p>
 */
public class DescribeHaVipsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("HaVips")
    private java.util.List < HaVips> haVips;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private String pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private String pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private String totalCount;

    private DescribeHaVipsResponseBody(Builder builder) {
        this.haVips = builder.haVips;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeHaVipsResponseBody create() {
        return builder().build();
    }

    /**
     * @return haVips
     */
    public java.util.List < HaVips> getHaVips() {
        return this.haVips;
    }

    /**
     * @return pageNumber
     */
    public String getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public String getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public String getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List < HaVips> haVips; 
        private String pageNumber; 
        private String pageSize; 
        private String requestId; 
        private String totalCount; 

        /**
         * HaVips.
         */
        public Builder haVips(java.util.List < HaVips> haVips) {
            this.haVips = haVips;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(String pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(String pageSize) {
            this.pageSize = pageSize;
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
         * TotalCount.
         */
        public Builder totalCount(String totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeHaVipsResponseBody build() {
            return new DescribeHaVipsResponseBody(this);
        } 

    } 

    public static class AssociatedEipAddresses extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Eip")
        private String eip;

        @com.aliyun.core.annotation.NameInMap("EipId")
        private String eipId;

        private AssociatedEipAddresses(Builder builder) {
            this.eip = builder.eip;
            this.eipId = builder.eipId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AssociatedEipAddresses create() {
            return builder().build();
        }

        /**
         * @return eip
         */
        public String getEip() {
            return this.eip;
        }

        /**
         * @return eipId
         */
        public String getEipId() {
            return this.eipId;
        }

        public static final class Builder {
            private String eip; 
            private String eipId; 

            /**
             * Eip.
             */
            public Builder eip(String eip) {
                this.eip = eip;
                return this;
            }

            /**
             * EipId.
             */
            public Builder eipId(String eipId) {
                this.eipId = eipId;
                return this;
            }

            public AssociatedEipAddresses build() {
                return new AssociatedEipAddresses(this);
            } 

        } 

    }
    public static class AssociatedInstances extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("InstanceType")
        private String instanceType;

        @com.aliyun.core.annotation.NameInMap("IpAddress")
        private String ipAddress;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private AssociatedInstances(Builder builder) {
            this.creationTime = builder.creationTime;
            this.instanceId = builder.instanceId;
            this.instanceType = builder.instanceType;
            this.ipAddress = builder.ipAddress;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AssociatedInstances create() {
            return builder().build();
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return instanceType
         */
        public String getInstanceType() {
            return this.instanceType;
        }

        /**
         * @return ipAddress
         */
        public String getIpAddress() {
            return this.ipAddress;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String creationTime; 
            private String instanceId; 
            private String instanceType; 
            private String ipAddress; 
            private String status; 

            /**
             * CreationTime.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
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
             * InstanceType.
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * IpAddress.
             */
            public Builder ipAddress(String ipAddress) {
                this.ipAddress = ipAddress;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public AssociatedInstances build() {
                return new AssociatedInstances(this);
            } 

        } 

    }
    public static class HaVips extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AssociatedEipAddresses")
        private java.util.List < AssociatedEipAddresses> associatedEipAddresses;

        @com.aliyun.core.annotation.NameInMap("AssociatedInstances")
        private java.util.List < AssociatedInstances> associatedInstances;

        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("EnsRegionId")
        private String ensRegionId;

        @com.aliyun.core.annotation.NameInMap("HaVipId")
        private String haVipId;

        @com.aliyun.core.annotation.NameInMap("IpAddress")
        private String ipAddress;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("NetworkId")
        private String networkId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("VSwitchId")
        private String vSwitchId;

        private HaVips(Builder builder) {
            this.associatedEipAddresses = builder.associatedEipAddresses;
            this.associatedInstances = builder.associatedInstances;
            this.creationTime = builder.creationTime;
            this.description = builder.description;
            this.ensRegionId = builder.ensRegionId;
            this.haVipId = builder.haVipId;
            this.ipAddress = builder.ipAddress;
            this.name = builder.name;
            this.networkId = builder.networkId;
            this.status = builder.status;
            this.vSwitchId = builder.vSwitchId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HaVips create() {
            return builder().build();
        }

        /**
         * @return associatedEipAddresses
         */
        public java.util.List < AssociatedEipAddresses> getAssociatedEipAddresses() {
            return this.associatedEipAddresses;
        }

        /**
         * @return associatedInstances
         */
        public java.util.List < AssociatedInstances> getAssociatedInstances() {
            return this.associatedInstances;
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return ensRegionId
         */
        public String getEnsRegionId() {
            return this.ensRegionId;
        }

        /**
         * @return haVipId
         */
        public String getHaVipId() {
            return this.haVipId;
        }

        /**
         * @return ipAddress
         */
        public String getIpAddress() {
            return this.ipAddress;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return networkId
         */
        public String getNetworkId() {
            return this.networkId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return vSwitchId
         */
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public static final class Builder {
            private java.util.List < AssociatedEipAddresses> associatedEipAddresses; 
            private java.util.List < AssociatedInstances> associatedInstances; 
            private String creationTime; 
            private String description; 
            private String ensRegionId; 
            private String haVipId; 
            private String ipAddress; 
            private String name; 
            private String networkId; 
            private String status; 
            private String vSwitchId; 

            /**
             * AssociatedEipAddresses.
             */
            public Builder associatedEipAddresses(java.util.List < AssociatedEipAddresses> associatedEipAddresses) {
                this.associatedEipAddresses = associatedEipAddresses;
                return this;
            }

            /**
             * AssociatedInstances.
             */
            public Builder associatedInstances(java.util.List < AssociatedInstances> associatedInstances) {
                this.associatedInstances = associatedInstances;
                return this;
            }

            /**
             * CreationTime.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * EnsRegionId.
             */
            public Builder ensRegionId(String ensRegionId) {
                this.ensRegionId = ensRegionId;
                return this;
            }

            /**
             * HaVipId.
             */
            public Builder haVipId(String haVipId) {
                this.haVipId = haVipId;
                return this;
            }

            /**
             * IpAddress.
             */
            public Builder ipAddress(String ipAddress) {
                this.ipAddress = ipAddress;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * NetworkId.
             */
            public Builder networkId(String networkId) {
                this.networkId = networkId;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * VSwitchId.
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            public HaVips build() {
                return new HaVips(this);
            } 

        } 

    }
}
