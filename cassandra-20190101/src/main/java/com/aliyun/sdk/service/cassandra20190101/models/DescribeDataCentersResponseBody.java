// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cassandra20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDataCentersResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDataCentersResponseBody</p>
 */
public class DescribeDataCentersResponseBody extends TeaModel {
    @NameInMap("DataCenters")
    private DataCenters dataCenters;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeDataCentersResponseBody(Builder builder) {
        this.dataCenters = builder.dataCenters;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDataCentersResponseBody create() {
        return builder().build();
    }

    /**
     * @return dataCenters
     */
    public DataCenters getDataCenters() {
        return this.dataCenters;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private DataCenters dataCenters; 
        private String requestId; 

        /**
         * DataCenters.
         */
        public Builder dataCenters(DataCenters dataCenters) {
            this.dataCenters = dataCenters;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDataCentersResponseBody build() {
            return new DescribeDataCentersResponseBody(this);
        } 

    } 

    public static class DataCenter extends TeaModel {
        @NameInMap("AutoRenewPeriod")
        private Integer autoRenewPeriod;

        @NameInMap("AutoRenewal")
        private Boolean autoRenewal;

        @NameInMap("ClusterId")
        private String clusterId;

        @NameInMap("CommodityInstance")
        private String commodityInstance;

        @NameInMap("CreatedTime")
        private String createdTime;

        @NameInMap("DataCenterId")
        private String dataCenterId;

        @NameInMap("DataCenterName")
        private String dataCenterName;

        @NameInMap("DiskSize")
        private Integer diskSize;

        @NameInMap("DiskType")
        private String diskType;

        @NameInMap("ExpireTime")
        private String expireTime;

        @NameInMap("InstanceType")
        private String instanceType;

        @NameInMap("LockMode")
        private String lockMode;

        @NameInMap("NodeCount")
        private Integer nodeCount;

        @NameInMap("PayType")
        private String payType;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("Status")
        private String status;

        @NameInMap("VpcId")
        private String vpcId;

        @NameInMap("VswitchId")
        private String vswitchId;

        @NameInMap("ZoneId")
        private String zoneId;

        private DataCenter(Builder builder) {
            this.autoRenewPeriod = builder.autoRenewPeriod;
            this.autoRenewal = builder.autoRenewal;
            this.clusterId = builder.clusterId;
            this.commodityInstance = builder.commodityInstance;
            this.createdTime = builder.createdTime;
            this.dataCenterId = builder.dataCenterId;
            this.dataCenterName = builder.dataCenterName;
            this.diskSize = builder.diskSize;
            this.diskType = builder.diskType;
            this.expireTime = builder.expireTime;
            this.instanceType = builder.instanceType;
            this.lockMode = builder.lockMode;
            this.nodeCount = builder.nodeCount;
            this.payType = builder.payType;
            this.regionId = builder.regionId;
            this.status = builder.status;
            this.vpcId = builder.vpcId;
            this.vswitchId = builder.vswitchId;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataCenter create() {
            return builder().build();
        }

        /**
         * @return autoRenewPeriod
         */
        public Integer getAutoRenewPeriod() {
            return this.autoRenewPeriod;
        }

        /**
         * @return autoRenewal
         */
        public Boolean getAutoRenewal() {
            return this.autoRenewal;
        }

        /**
         * @return clusterId
         */
        public String getClusterId() {
            return this.clusterId;
        }

        /**
         * @return commodityInstance
         */
        public String getCommodityInstance() {
            return this.commodityInstance;
        }

        /**
         * @return createdTime
         */
        public String getCreatedTime() {
            return this.createdTime;
        }

        /**
         * @return dataCenterId
         */
        public String getDataCenterId() {
            return this.dataCenterId;
        }

        /**
         * @return dataCenterName
         */
        public String getDataCenterName() {
            return this.dataCenterName;
        }

        /**
         * @return diskSize
         */
        public Integer getDiskSize() {
            return this.diskSize;
        }

        /**
         * @return diskType
         */
        public String getDiskType() {
            return this.diskType;
        }

        /**
         * @return expireTime
         */
        public String getExpireTime() {
            return this.expireTime;
        }

        /**
         * @return instanceType
         */
        public String getInstanceType() {
            return this.instanceType;
        }

        /**
         * @return lockMode
         */
        public String getLockMode() {
            return this.lockMode;
        }

        /**
         * @return nodeCount
         */
        public Integer getNodeCount() {
            return this.nodeCount;
        }

        /**
         * @return payType
         */
        public String getPayType() {
            return this.payType;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        /**
         * @return vswitchId
         */
        public String getVswitchId() {
            return this.vswitchId;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private Integer autoRenewPeriod; 
            private Boolean autoRenewal; 
            private String clusterId; 
            private String commodityInstance; 
            private String createdTime; 
            private String dataCenterId; 
            private String dataCenterName; 
            private Integer diskSize; 
            private String diskType; 
            private String expireTime; 
            private String instanceType; 
            private String lockMode; 
            private Integer nodeCount; 
            private String payType; 
            private String regionId; 
            private String status; 
            private String vpcId; 
            private String vswitchId; 
            private String zoneId; 

            /**
             * AutoRenewPeriod.
             */
            public Builder autoRenewPeriod(Integer autoRenewPeriod) {
                this.autoRenewPeriod = autoRenewPeriod;
                return this;
            }

            /**
             * AutoRenewal.
             */
            public Builder autoRenewal(Boolean autoRenewal) {
                this.autoRenewal = autoRenewal;
                return this;
            }

            /**
             * ClusterId.
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * CommodityInstance.
             */
            public Builder commodityInstance(String commodityInstance) {
                this.commodityInstance = commodityInstance;
                return this;
            }

            /**
             * CreatedTime.
             */
            public Builder createdTime(String createdTime) {
                this.createdTime = createdTime;
                return this;
            }

            /**
             * DataCenterId.
             */
            public Builder dataCenterId(String dataCenterId) {
                this.dataCenterId = dataCenterId;
                return this;
            }

            /**
             * DataCenterName.
             */
            public Builder dataCenterName(String dataCenterName) {
                this.dataCenterName = dataCenterName;
                return this;
            }

            /**
             * DiskSize.
             */
            public Builder diskSize(Integer diskSize) {
                this.diskSize = diskSize;
                return this;
            }

            /**
             * DiskType.
             */
            public Builder diskType(String diskType) {
                this.diskType = diskType;
                return this;
            }

            /**
             * ExpireTime.
             */
            public Builder expireTime(String expireTime) {
                this.expireTime = expireTime;
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
             * LockMode.
             */
            public Builder lockMode(String lockMode) {
                this.lockMode = lockMode;
                return this;
            }

            /**
             * NodeCount.
             */
            public Builder nodeCount(Integer nodeCount) {
                this.nodeCount = nodeCount;
                return this;
            }

            /**
             * PayType.
             */
            public Builder payType(String payType) {
                this.payType = payType;
                return this;
            }

            /**
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
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
             * VpcId.
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * VswitchId.
             */
            public Builder vswitchId(String vswitchId) {
                this.vswitchId = vswitchId;
                return this;
            }

            /**
             * ZoneId.
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public DataCenter build() {
                return new DataCenter(this);
            } 

        } 

    }
    public static class DataCenters extends TeaModel {
        @NameInMap("DataCenter")
        private java.util.List < DataCenter> dataCenter;

        private DataCenters(Builder builder) {
            this.dataCenter = builder.dataCenter;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataCenters create() {
            return builder().build();
        }

        /**
         * @return dataCenter
         */
        public java.util.List < DataCenter> getDataCenter() {
            return this.dataCenter;
        }

        public static final class Builder {
            private java.util.List < DataCenter> dataCenter; 

            /**
             * DataCenter.
             */
            public Builder dataCenter(java.util.List < DataCenter> dataCenter) {
                this.dataCenter = dataCenter;
                return this;
            }

            public DataCenters build() {
                return new DataCenters(this);
            } 

        } 

    }
}
