// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

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
 * {@link DescribeHaVipsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeHaVipsResponseBody</p>
 */
public class DescribeHaVipsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("HaVips")
    private java.util.List<HaVips> haVips;

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
    public java.util.List<HaVips> getHaVips() {
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
        private java.util.List<HaVips> haVips; 
        private String pageNumber; 
        private String pageSize; 
        private String requestId; 
        private String totalCount; 

        /**
         * <p>Details of the HAVIPs.</p>
         */
        public Builder haVips(java.util.List<HaVips> haVips) {
            this.haVips = haVips;
            return this;
        }

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(String pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(String pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>AAE90880-4970-4D81-A534-A6C0F3631F74</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>49</p>
         */
        public Builder totalCount(String totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeHaVipsResponseBody build() {
            return new DescribeHaVipsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeHaVipsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeHaVipsResponseBody</p>
     */
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
             * <p>The EIP.</p>
             * 
             * <strong>example:</strong>
             * <p>47.XX.XX.40</p>
             */
            public Builder eip(String eip) {
                this.eip = eip;
                return this;
            }

            /**
             * <p>The ID of the EIP.</p>
             * 
             * <strong>example:</strong>
             * <p>eip-5p1wz****</p>
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
    /**
     * 
     * {@link DescribeHaVipsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeHaVipsResponseBody</p>
     */
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
             * <p>The time when the instance was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-01-05T07:09:28Z</p>
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * <p>The ID of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>i-51p****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The type of the instance that is associated with the HAVIP. Valid values:</p>
             * <ul>
             * <li>EnsInstance: ENS instance</li>
             * <li>NetworkInterface: elastic network interface (ENI)</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>EnsInstance</p>
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * <p>The private IP address of the instance that is associated with the HAVIP. Valid values:</p>
             * 
             * <strong>example:</strong>
             * <p>192.XX.XX.9</p>
             */
            public Builder ipAddress(String ipAddress) {
                this.ipAddress = ipAddress;
                return this;
            }

            /**
             * <p>The association status of the HAVIP. Valid values:</p>
             * <ul>
             * <li>Associating</li>
             * <li>InUse</li>
             * <li>Unassociating</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>InUse</p>
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
    /**
     * 
     * {@link DescribeHaVipsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeHaVipsResponseBody</p>
     */
    public static class HaVips extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AssociatedEipAddresses")
        private java.util.List<AssociatedEipAddresses> associatedEipAddresses;

        @com.aliyun.core.annotation.NameInMap("AssociatedInstances")
        private java.util.List<AssociatedInstances> associatedInstances;

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
        public java.util.List<AssociatedEipAddresses> getAssociatedEipAddresses() {
            return this.associatedEipAddresses;
        }

        /**
         * @return associatedInstances
         */
        public java.util.List<AssociatedInstances> getAssociatedInstances() {
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
            private java.util.List<AssociatedEipAddresses> associatedEipAddresses; 
            private java.util.List<AssociatedInstances> associatedInstances; 
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
             * <p>The elastic IP addresses (EIPs) that are associated with the HAVIP.</p>
             */
            public Builder associatedEipAddresses(java.util.List<AssociatedEipAddresses> associatedEipAddresses) {
                this.associatedEipAddresses = associatedEipAddresses;
                return this;
            }

            /**
             * <p>The information about instances that are associated with the HAVIP.</p>
             */
            public Builder associatedInstances(java.util.List<AssociatedInstances> associatedInstances) {
                this.associatedInstances = associatedInstances;
                return this;
            }

            /**
             * <p>The time when the HAVIP was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-03-29T11:17:38Z</p>
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * <p>The description of the HAVIP.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The ID of the region.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-guiyang-14</p>
             */
            public Builder ensRegionId(String ensRegionId) {
                this.ensRegionId = ensRegionId;
                return this;
            }

            /**
             * <p>The ID of the HAVIP.</p>
             * 
             * <strong>example:</strong>
             * <p>havip-52y28****</p>
             */
            public Builder haVipId(String haVipId) {
                this.haVipId = haVipId;
                return this;
            }

            /**
             * <p>The IP address of the HAVIP.</p>
             * 
             * <strong>example:</strong>
             * <p>192.XX.XX.5</p>
             */
            public Builder ipAddress(String ipAddress) {
                this.ipAddress = ipAddress;
                return this;
            }

            /**
             * <p>The name of the HAVIP.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The ID of the network.</p>
             * 
             * <strong>example:</strong>
             * <p>n-5wtkyrk****</p>
             */
            public Builder networkId(String networkId) {
                this.networkId = networkId;
                return this;
            }

            /**
             * <p>The status of the HAVIP. Valid values:</p>
             * <ul>
             * <li>Creating</li>
             * <li>Available</li>
             * <li>InUse</li>
             * <li>Deleting</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Available</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The ID of the vSwitch.</p>
             * 
             * <strong>example:</strong>
             * <p>vsw-5yc8d****</p>
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
