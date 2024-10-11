// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.clickhouse20220101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListClustersResponseBody} extends {@link TeaModel}
 *
 * <p>ListClustersResponseBody</p>
 */
public class ListClustersResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List < Data> data;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListClustersResponseBody(Builder builder) {
        this.data = builder.data;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListClustersResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
        return this.data;
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
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List < Data> data; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * Data.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
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
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListClustersResponseBody build() {
            return new ListClustersResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListClustersResponseBody} extends {@link TeaModel}
     *
     * <p>ListClustersResponseBody</p>
     */
    public static class VirtualWareHouses extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Ports")
        private String ports;

        @com.aliyun.core.annotation.NameInMap("VirtualWareHouseCacheStorage")
        private Integer virtualWareHouseCacheStorage;

        @com.aliyun.core.annotation.NameInMap("VirtualWareHouseClass")
        private String virtualWareHouseClass;

        @com.aliyun.core.annotation.NameInMap("VirtualWareHouseDescription")
        private String virtualWareHouseDescription;

        @com.aliyun.core.annotation.NameInMap("VirtualWareHouseId")
        private String virtualWareHouseId;

        @com.aliyun.core.annotation.NameInMap("VirtualWareHouseStatus")
        private String virtualWareHouseStatus;

        @com.aliyun.core.annotation.NameInMap("VswitchId")
        private String vswitchId;

        @com.aliyun.core.annotation.NameInMap("ZoneId")
        private String zoneId;

        private VirtualWareHouses(Builder builder) {
            this.ports = builder.ports;
            this.virtualWareHouseCacheStorage = builder.virtualWareHouseCacheStorage;
            this.virtualWareHouseClass = builder.virtualWareHouseClass;
            this.virtualWareHouseDescription = builder.virtualWareHouseDescription;
            this.virtualWareHouseId = builder.virtualWareHouseId;
            this.virtualWareHouseStatus = builder.virtualWareHouseStatus;
            this.vswitchId = builder.vswitchId;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VirtualWareHouses create() {
            return builder().build();
        }

        /**
         * @return ports
         */
        public String getPorts() {
            return this.ports;
        }

        /**
         * @return virtualWareHouseCacheStorage
         */
        public Integer getVirtualWareHouseCacheStorage() {
            return this.virtualWareHouseCacheStorage;
        }

        /**
         * @return virtualWareHouseClass
         */
        public String getVirtualWareHouseClass() {
            return this.virtualWareHouseClass;
        }

        /**
         * @return virtualWareHouseDescription
         */
        public String getVirtualWareHouseDescription() {
            return this.virtualWareHouseDescription;
        }

        /**
         * @return virtualWareHouseId
         */
        public String getVirtualWareHouseId() {
            return this.virtualWareHouseId;
        }

        /**
         * @return virtualWareHouseStatus
         */
        public String getVirtualWareHouseStatus() {
            return this.virtualWareHouseStatus;
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
            private String ports; 
            private Integer virtualWareHouseCacheStorage; 
            private String virtualWareHouseClass; 
            private String virtualWareHouseDescription; 
            private String virtualWareHouseId; 
            private String virtualWareHouseStatus; 
            private String vswitchId; 
            private String zoneId; 

            /**
             * Ports.
             */
            public Builder ports(String ports) {
                this.ports = ports;
                return this;
            }

            /**
             * VirtualWareHouseCacheStorage.
             */
            public Builder virtualWareHouseCacheStorage(Integer virtualWareHouseCacheStorage) {
                this.virtualWareHouseCacheStorage = virtualWareHouseCacheStorage;
                return this;
            }

            /**
             * VirtualWareHouseClass.
             */
            public Builder virtualWareHouseClass(String virtualWareHouseClass) {
                this.virtualWareHouseClass = virtualWareHouseClass;
                return this;
            }

            /**
             * VirtualWareHouseDescription.
             */
            public Builder virtualWareHouseDescription(String virtualWareHouseDescription) {
                this.virtualWareHouseDescription = virtualWareHouseDescription;
                return this;
            }

            /**
             * VirtualWareHouseId.
             */
            public Builder virtualWareHouseId(String virtualWareHouseId) {
                this.virtualWareHouseId = virtualWareHouseId;
                return this;
            }

            /**
             * VirtualWareHouseStatus.
             */
            public Builder virtualWareHouseStatus(String virtualWareHouseStatus) {
                this.virtualWareHouseStatus = virtualWareHouseStatus;
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

            public VirtualWareHouses build() {
                return new VirtualWareHouses(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListClustersResponseBody} extends {@link TeaModel}
     *
     * <p>ListClustersResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AliUid")
        private Long aliUid;

        @com.aliyun.core.annotation.NameInMap("CacheStorageSizeGiB")
        private Integer cacheStorageSizeGiB;

        @com.aliyun.core.annotation.NameInMap("CacheStorageType")
        private String cacheStorageType;

        @com.aliyun.core.annotation.NameInMap("CommodityCode")
        private String commodityCode;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("DBClusterDescription")
        private String DBClusterDescription;

        @com.aliyun.core.annotation.NameInMap("DBClusterId")
        private String DBClusterId;

        @com.aliyun.core.annotation.NameInMap("DBClusterStatus")
        private String DBClusterStatus;

        @com.aliyun.core.annotation.NameInMap("EngineVersion")
        private String engineVersion;

        @com.aliyun.core.annotation.NameInMap("ExpireTime")
        private String expireTime;

        @com.aliyun.core.annotation.NameInMap("LockMode")
        private String lockMode;

        @com.aliyun.core.annotation.NameInMap("LockReason")
        private String lockReason;

        @com.aliyun.core.annotation.NameInMap("ObjectStoreSizeGiB")
        private Long objectStoreSizeGiB;

        @com.aliyun.core.annotation.NameInMap("PayType")
        private String payType;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("ResourceCpuCores")
        private Integer resourceCpuCores;

        @com.aliyun.core.annotation.NameInMap("ResourceMemoryGiB")
        private Integer resourceMemoryGiB;

        @com.aliyun.core.annotation.NameInMap("VirtualWareHouses")
        private java.util.List < VirtualWareHouses> virtualWareHouses;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        @com.aliyun.core.annotation.NameInMap("VswitchId")
        private String vswitchId;

        @com.aliyun.core.annotation.NameInMap("ZoneId")
        private String zoneId;

        private Data(Builder builder) {
            this.aliUid = builder.aliUid;
            this.cacheStorageSizeGiB = builder.cacheStorageSizeGiB;
            this.cacheStorageType = builder.cacheStorageType;
            this.commodityCode = builder.commodityCode;
            this.createTime = builder.createTime;
            this.DBClusterDescription = builder.DBClusterDescription;
            this.DBClusterId = builder.DBClusterId;
            this.DBClusterStatus = builder.DBClusterStatus;
            this.engineVersion = builder.engineVersion;
            this.expireTime = builder.expireTime;
            this.lockMode = builder.lockMode;
            this.lockReason = builder.lockReason;
            this.objectStoreSizeGiB = builder.objectStoreSizeGiB;
            this.payType = builder.payType;
            this.regionId = builder.regionId;
            this.resourceCpuCores = builder.resourceCpuCores;
            this.resourceMemoryGiB = builder.resourceMemoryGiB;
            this.virtualWareHouses = builder.virtualWareHouses;
            this.vpcId = builder.vpcId;
            this.vswitchId = builder.vswitchId;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return aliUid
         */
        public Long getAliUid() {
            return this.aliUid;
        }

        /**
         * @return cacheStorageSizeGiB
         */
        public Integer getCacheStorageSizeGiB() {
            return this.cacheStorageSizeGiB;
        }

        /**
         * @return cacheStorageType
         */
        public String getCacheStorageType() {
            return this.cacheStorageType;
        }

        /**
         * @return commodityCode
         */
        public String getCommodityCode() {
            return this.commodityCode;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return DBClusterDescription
         */
        public String getDBClusterDescription() {
            return this.DBClusterDescription;
        }

        /**
         * @return DBClusterId
         */
        public String getDBClusterId() {
            return this.DBClusterId;
        }

        /**
         * @return DBClusterStatus
         */
        public String getDBClusterStatus() {
            return this.DBClusterStatus;
        }

        /**
         * @return engineVersion
         */
        public String getEngineVersion() {
            return this.engineVersion;
        }

        /**
         * @return expireTime
         */
        public String getExpireTime() {
            return this.expireTime;
        }

        /**
         * @return lockMode
         */
        public String getLockMode() {
            return this.lockMode;
        }

        /**
         * @return lockReason
         */
        public String getLockReason() {
            return this.lockReason;
        }

        /**
         * @return objectStoreSizeGiB
         */
        public Long getObjectStoreSizeGiB() {
            return this.objectStoreSizeGiB;
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
         * @return resourceCpuCores
         */
        public Integer getResourceCpuCores() {
            return this.resourceCpuCores;
        }

        /**
         * @return resourceMemoryGiB
         */
        public Integer getResourceMemoryGiB() {
            return this.resourceMemoryGiB;
        }

        /**
         * @return virtualWareHouses
         */
        public java.util.List < VirtualWareHouses> getVirtualWareHouses() {
            return this.virtualWareHouses;
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
            private Long aliUid; 
            private Integer cacheStorageSizeGiB; 
            private String cacheStorageType; 
            private String commodityCode; 
            private String createTime; 
            private String DBClusterDescription; 
            private String DBClusterId; 
            private String DBClusterStatus; 
            private String engineVersion; 
            private String expireTime; 
            private String lockMode; 
            private String lockReason; 
            private Long objectStoreSizeGiB; 
            private String payType; 
            private String regionId; 
            private Integer resourceCpuCores; 
            private Integer resourceMemoryGiB; 
            private java.util.List < VirtualWareHouses> virtualWareHouses; 
            private String vpcId; 
            private String vswitchId; 
            private String zoneId; 

            /**
             * AliUid.
             */
            public Builder aliUid(Long aliUid) {
                this.aliUid = aliUid;
                return this;
            }

            /**
             * CacheStorageSizeGiB.
             */
            public Builder cacheStorageSizeGiB(Integer cacheStorageSizeGiB) {
                this.cacheStorageSizeGiB = cacheStorageSizeGiB;
                return this;
            }

            /**
             * CacheStorageType.
             */
            public Builder cacheStorageType(String cacheStorageType) {
                this.cacheStorageType = cacheStorageType;
                return this;
            }

            /**
             * CommodityCode.
             */
            public Builder commodityCode(String commodityCode) {
                this.commodityCode = commodityCode;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * DBClusterDescription.
             */
            public Builder DBClusterDescription(String DBClusterDescription) {
                this.DBClusterDescription = DBClusterDescription;
                return this;
            }

            /**
             * DBClusterId.
             */
            public Builder DBClusterId(String DBClusterId) {
                this.DBClusterId = DBClusterId;
                return this;
            }

            /**
             * DBClusterStatus.
             */
            public Builder DBClusterStatus(String DBClusterStatus) {
                this.DBClusterStatus = DBClusterStatus;
                return this;
            }

            /**
             * EngineVersion.
             */
            public Builder engineVersion(String engineVersion) {
                this.engineVersion = engineVersion;
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
             * LockMode.
             */
            public Builder lockMode(String lockMode) {
                this.lockMode = lockMode;
                return this;
            }

            /**
             * LockReason.
             */
            public Builder lockReason(String lockReason) {
                this.lockReason = lockReason;
                return this;
            }

            /**
             * ObjectStoreSizeGiB.
             */
            public Builder objectStoreSizeGiB(Long objectStoreSizeGiB) {
                this.objectStoreSizeGiB = objectStoreSizeGiB;
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
             * ResourceCpuCores.
             */
            public Builder resourceCpuCores(Integer resourceCpuCores) {
                this.resourceCpuCores = resourceCpuCores;
                return this;
            }

            /**
             * ResourceMemoryGiB.
             */
            public Builder resourceMemoryGiB(Integer resourceMemoryGiB) {
                this.resourceMemoryGiB = resourceMemoryGiB;
                return this;
            }

            /**
             * VirtualWareHouses.
             */
            public Builder virtualWareHouses(java.util.List < VirtualWareHouses> virtualWareHouses) {
                this.virtualWareHouses = virtualWareHouses;
                return this;
            }

            /**
             * <p>VPC ID。</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-2zedznmtm8j7fksbc****</p>
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

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
