// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hitsdb20170601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeHiTSDBInstanceListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeHiTSDBInstanceListResponseBody</p>
 */
public class DescribeHiTSDBInstanceListResponseBody extends TeaModel {
    @NameInMap("InstanceList")
    private java.util.List < InstanceList> instanceList;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Total")
    private Integer total;

    private DescribeHiTSDBInstanceListResponseBody(Builder builder) {
        this.instanceList = builder.instanceList;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeHiTSDBInstanceListResponseBody create() {
        return builder().build();
    }

    /**
     * @return instanceList
     */
    public java.util.List < InstanceList> getInstanceList() {
        return this.instanceList;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
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
        private java.util.List < InstanceList> instanceList; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer total; 

        /**
         * InstanceList.
         */
        public Builder instanceList(java.util.List < InstanceList> instanceList) {
            this.instanceList = instanceList;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
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
         * Total.
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        public DescribeHiTSDBInstanceListResponseBody build() {
            return new DescribeHiTSDBInstanceListResponseBody(this);
        } 

    } 

    public static class InstanceList extends TeaModel {
        @NameInMap("ChargeType")
        private String chargeType;

        @NameInMap("CreateTime")
        private Long createTime;

        @NameInMap("EngineType")
        private String engineType;

        @NameInMap("ExpiredTime")
        private Long expiredTime;

        @NameInMap("GmtCreated")
        private String gmtCreated;

        @NameInMap("GmtExpire")
        private String gmtExpire;

        @NameInMap("InstanceAlias")
        private String instanceAlias;

        @NameInMap("InstanceClass")
        private String instanceClass;

        @NameInMap("InstanceDescription")
        private String instanceDescription;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("InstanceStatus")
        private String instanceStatus;

        @NameInMap("InstanceStorage")
        private String instanceStorage;

        @NameInMap("InstanceTps")
        private String instanceTps;

        @NameInMap("LockMode")
        private String lockMode;

        @NameInMap("MaxSeriesPerDatabase")
        private String maxSeriesPerDatabase;

        @NameInMap("NetworkType")
        private String networkType;

        @NameInMap("PaymentType")
        private String paymentType;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("Status")
        private String status;

        @NameInMap("UserId")
        private String userId;

        @NameInMap("VpcId")
        private String vpcId;

        @NameInMap("VswitchId")
        private String vswitchId;

        @NameInMap("ZoneId")
        private String zoneId;

        private InstanceList(Builder builder) {
            this.chargeType = builder.chargeType;
            this.createTime = builder.createTime;
            this.engineType = builder.engineType;
            this.expiredTime = builder.expiredTime;
            this.gmtCreated = builder.gmtCreated;
            this.gmtExpire = builder.gmtExpire;
            this.instanceAlias = builder.instanceAlias;
            this.instanceClass = builder.instanceClass;
            this.instanceDescription = builder.instanceDescription;
            this.instanceId = builder.instanceId;
            this.instanceStatus = builder.instanceStatus;
            this.instanceStorage = builder.instanceStorage;
            this.instanceTps = builder.instanceTps;
            this.lockMode = builder.lockMode;
            this.maxSeriesPerDatabase = builder.maxSeriesPerDatabase;
            this.networkType = builder.networkType;
            this.paymentType = builder.paymentType;
            this.regionId = builder.regionId;
            this.status = builder.status;
            this.userId = builder.userId;
            this.vpcId = builder.vpcId;
            this.vswitchId = builder.vswitchId;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceList create() {
            return builder().build();
        }

        /**
         * @return chargeType
         */
        public String getChargeType() {
            return this.chargeType;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return engineType
         */
        public String getEngineType() {
            return this.engineType;
        }

        /**
         * @return expiredTime
         */
        public Long getExpiredTime() {
            return this.expiredTime;
        }

        /**
         * @return gmtCreated
         */
        public String getGmtCreated() {
            return this.gmtCreated;
        }

        /**
         * @return gmtExpire
         */
        public String getGmtExpire() {
            return this.gmtExpire;
        }

        /**
         * @return instanceAlias
         */
        public String getInstanceAlias() {
            return this.instanceAlias;
        }

        /**
         * @return instanceClass
         */
        public String getInstanceClass() {
            return this.instanceClass;
        }

        /**
         * @return instanceDescription
         */
        public String getInstanceDescription() {
            return this.instanceDescription;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return instanceStatus
         */
        public String getInstanceStatus() {
            return this.instanceStatus;
        }

        /**
         * @return instanceStorage
         */
        public String getInstanceStorage() {
            return this.instanceStorage;
        }

        /**
         * @return instanceTps
         */
        public String getInstanceTps() {
            return this.instanceTps;
        }

        /**
         * @return lockMode
         */
        public String getLockMode() {
            return this.lockMode;
        }

        /**
         * @return maxSeriesPerDatabase
         */
        public String getMaxSeriesPerDatabase() {
            return this.maxSeriesPerDatabase;
        }

        /**
         * @return networkType
         */
        public String getNetworkType() {
            return this.networkType;
        }

        /**
         * @return paymentType
         */
        public String getPaymentType() {
            return this.paymentType;
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
         * @return userId
         */
        public String getUserId() {
            return this.userId;
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
            private String chargeType; 
            private Long createTime; 
            private String engineType; 
            private Long expiredTime; 
            private String gmtCreated; 
            private String gmtExpire; 
            private String instanceAlias; 
            private String instanceClass; 
            private String instanceDescription; 
            private String instanceId; 
            private String instanceStatus; 
            private String instanceStorage; 
            private String instanceTps; 
            private String lockMode; 
            private String maxSeriesPerDatabase; 
            private String networkType; 
            private String paymentType; 
            private String regionId; 
            private String status; 
            private String userId; 
            private String vpcId; 
            private String vswitchId; 
            private String zoneId; 

            /**
             * ChargeType.
             */
            public Builder chargeType(String chargeType) {
                this.chargeType = chargeType;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * EngineType.
             */
            public Builder engineType(String engineType) {
                this.engineType = engineType;
                return this;
            }

            /**
             * ExpiredTime.
             */
            public Builder expiredTime(Long expiredTime) {
                this.expiredTime = expiredTime;
                return this;
            }

            /**
             * GmtCreated.
             */
            public Builder gmtCreated(String gmtCreated) {
                this.gmtCreated = gmtCreated;
                return this;
            }

            /**
             * GmtExpire.
             */
            public Builder gmtExpire(String gmtExpire) {
                this.gmtExpire = gmtExpire;
                return this;
            }

            /**
             * InstanceAlias.
             */
            public Builder instanceAlias(String instanceAlias) {
                this.instanceAlias = instanceAlias;
                return this;
            }

            /**
             * InstanceClass.
             */
            public Builder instanceClass(String instanceClass) {
                this.instanceClass = instanceClass;
                return this;
            }

            /**
             * InstanceDescription.
             */
            public Builder instanceDescription(String instanceDescription) {
                this.instanceDescription = instanceDescription;
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
             * InstanceStatus.
             */
            public Builder instanceStatus(String instanceStatus) {
                this.instanceStatus = instanceStatus;
                return this;
            }

            /**
             * InstanceStorage.
             */
            public Builder instanceStorage(String instanceStorage) {
                this.instanceStorage = instanceStorage;
                return this;
            }

            /**
             * InstanceTps.
             */
            public Builder instanceTps(String instanceTps) {
                this.instanceTps = instanceTps;
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
             * MaxSeriesPerDatabase.
             */
            public Builder maxSeriesPerDatabase(String maxSeriesPerDatabase) {
                this.maxSeriesPerDatabase = maxSeriesPerDatabase;
                return this;
            }

            /**
             * NetworkType.
             */
            public Builder networkType(String networkType) {
                this.networkType = networkType;
                return this;
            }

            /**
             * PaymentType.
             */
            public Builder paymentType(String paymentType) {
                this.paymentType = paymentType;
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
             * UserId.
             */
            public Builder userId(String userId) {
                this.userId = userId;
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

            public InstanceList build() {
                return new InstanceList(this);
            } 

        } 

    }
}
