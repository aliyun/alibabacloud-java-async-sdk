// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210901.models;

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
 * {@link ListWuyingServerResponseBody} extends {@link TeaModel}
 *
 * <p>ListWuyingServerResponseBody</p>
 */
public class ListWuyingServerResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    @com.aliyun.core.annotation.NameInMap("WuyingServerList")
    private java.util.List<WuyingServerList> wuyingServerList;

    private ListWuyingServerResponseBody(Builder builder) {
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
        this.wuyingServerList = builder.wuyingServerList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListWuyingServerResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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

    /**
     * @return wuyingServerList
     */
    public java.util.List<WuyingServerList> getWuyingServerList() {
        return this.wuyingServerList;
    }

    public static final class Builder {
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 
        private java.util.List<WuyingServerList> wuyingServerList; 

        private Builder() {
        } 

        private Builder(ListWuyingServerResponseBody model) {
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
            this.wuyingServerList = model.wuyingServerList;
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

        /**
         * WuyingServerList.
         */
        public Builder wuyingServerList(java.util.List<WuyingServerList> wuyingServerList) {
            this.wuyingServerList = wuyingServerList;
            return this;
        }

        public ListWuyingServerResponseBody build() {
            return new ListWuyingServerResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListWuyingServerResponseBody} extends {@link TeaModel}
     *
     * <p>ListWuyingServerResponseBody</p>
     */
    public static class DataDisk extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DataDiskCategory")
        private String dataDiskCategory;

        @com.aliyun.core.annotation.NameInMap("DataDiskPerformanceLevel")
        private String dataDiskPerformanceLevel;

        @com.aliyun.core.annotation.NameInMap("DataDiskSize")
        private Integer dataDiskSize;

        private DataDisk(Builder builder) {
            this.dataDiskCategory = builder.dataDiskCategory;
            this.dataDiskPerformanceLevel = builder.dataDiskPerformanceLevel;
            this.dataDiskSize = builder.dataDiskSize;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataDisk create() {
            return builder().build();
        }

        /**
         * @return dataDiskCategory
         */
        public String getDataDiskCategory() {
            return this.dataDiskCategory;
        }

        /**
         * @return dataDiskPerformanceLevel
         */
        public String getDataDiskPerformanceLevel() {
            return this.dataDiskPerformanceLevel;
        }

        /**
         * @return dataDiskSize
         */
        public Integer getDataDiskSize() {
            return this.dataDiskSize;
        }

        public static final class Builder {
            private String dataDiskCategory; 
            private String dataDiskPerformanceLevel; 
            private Integer dataDiskSize; 

            private Builder() {
            } 

            private Builder(DataDisk model) {
                this.dataDiskCategory = model.dataDiskCategory;
                this.dataDiskPerformanceLevel = model.dataDiskPerformanceLevel;
                this.dataDiskSize = model.dataDiskSize;
            } 

            /**
             * DataDiskCategory.
             */
            public Builder dataDiskCategory(String dataDiskCategory) {
                this.dataDiskCategory = dataDiskCategory;
                return this;
            }

            /**
             * DataDiskPerformanceLevel.
             */
            public Builder dataDiskPerformanceLevel(String dataDiskPerformanceLevel) {
                this.dataDiskPerformanceLevel = dataDiskPerformanceLevel;
                return this;
            }

            /**
             * DataDiskSize.
             */
            public Builder dataDiskSize(Integer dataDiskSize) {
                this.dataDiskSize = dataDiskSize;
                return this;
            }

            public DataDisk build() {
                return new DataDisk(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListWuyingServerResponseBody} extends {@link TeaModel}
     *
     * <p>ListWuyingServerResponseBody</p>
     */
    public static class InstanceInfoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("NetworkInterfaceId")
        private String networkInterfaceId;

        private InstanceInfoList(Builder builder) {
            this.instanceId = builder.instanceId;
            this.networkInterfaceId = builder.networkInterfaceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceInfoList create() {
            return builder().build();
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return networkInterfaceId
         */
        public String getNetworkInterfaceId() {
            return this.networkInterfaceId;
        }

        public static final class Builder {
            private String instanceId; 
            private String networkInterfaceId; 

            private Builder() {
            } 

            private Builder(InstanceInfoList model) {
                this.instanceId = model.instanceId;
                this.networkInterfaceId = model.networkInterfaceId;
            } 

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * NetworkInterfaceId.
             */
            public Builder networkInterfaceId(String networkInterfaceId) {
                this.networkInterfaceId = networkInterfaceId;
                return this;
            }

            public InstanceInfoList build() {
                return new InstanceInfoList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListWuyingServerResponseBody} extends {@link TeaModel}
     *
     * <p>ListWuyingServerResponseBody</p>
     */
    public static class ServerInstanceTypeInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Cpu")
        private String cpu;

        @com.aliyun.core.annotation.NameInMap("Gpu")
        private String gpu;

        @com.aliyun.core.annotation.NameInMap("GpuMemory")
        private Integer gpuMemory;

        @com.aliyun.core.annotation.NameInMap("Memory")
        private Integer memory;

        @com.aliyun.core.annotation.NameInMap("ServerInstanceType")
        private String serverInstanceType;

        private ServerInstanceTypeInfo(Builder builder) {
            this.cpu = builder.cpu;
            this.gpu = builder.gpu;
            this.gpuMemory = builder.gpuMemory;
            this.memory = builder.memory;
            this.serverInstanceType = builder.serverInstanceType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ServerInstanceTypeInfo create() {
            return builder().build();
        }

        /**
         * @return cpu
         */
        public String getCpu() {
            return this.cpu;
        }

        /**
         * @return gpu
         */
        public String getGpu() {
            return this.gpu;
        }

        /**
         * @return gpuMemory
         */
        public Integer getGpuMemory() {
            return this.gpuMemory;
        }

        /**
         * @return memory
         */
        public Integer getMemory() {
            return this.memory;
        }

        /**
         * @return serverInstanceType
         */
        public String getServerInstanceType() {
            return this.serverInstanceType;
        }

        public static final class Builder {
            private String cpu; 
            private String gpu; 
            private Integer gpuMemory; 
            private Integer memory; 
            private String serverInstanceType; 

            private Builder() {
            } 

            private Builder(ServerInstanceTypeInfo model) {
                this.cpu = model.cpu;
                this.gpu = model.gpu;
                this.gpuMemory = model.gpuMemory;
                this.memory = model.memory;
                this.serverInstanceType = model.serverInstanceType;
            } 

            /**
             * Cpu.
             */
            public Builder cpu(String cpu) {
                this.cpu = cpu;
                return this;
            }

            /**
             * Gpu.
             */
            public Builder gpu(String gpu) {
                this.gpu = gpu;
                return this;
            }

            /**
             * GpuMemory.
             */
            public Builder gpuMemory(Integer gpuMemory) {
                this.gpuMemory = gpuMemory;
                return this;
            }

            /**
             * Memory.
             */
            public Builder memory(Integer memory) {
                this.memory = memory;
                return this;
            }

            /**
             * ServerInstanceType.
             */
            public Builder serverInstanceType(String serverInstanceType) {
                this.serverInstanceType = serverInstanceType;
                return this;
            }

            public ServerInstanceTypeInfo build() {
                return new ServerInstanceTypeInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListWuyingServerResponseBody} extends {@link TeaModel}
     *
     * <p>ListWuyingServerResponseBody</p>
     */
    public static class WuyingServerList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AddVirtualNodePoolStatus")
        private String addVirtualNodePoolStatus;

        @com.aliyun.core.annotation.NameInMap("BizRegionId")
        private String bizRegionId;

        @com.aliyun.core.annotation.NameInMap("ChargeType")
        private String chargeType;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("DataDisk")
        private java.util.List<DataDisk> dataDisk;

        @com.aliyun.core.annotation.NameInMap("ExpiredTime")
        private String expiredTime;

        @com.aliyun.core.annotation.NameInMap("ImageId")
        private String imageId;

        @com.aliyun.core.annotation.NameInMap("ImageName")
        private String imageName;

        @com.aliyun.core.annotation.NameInMap("InstanceInfoList")
        private java.util.List<InstanceInfoList> instanceInfoList;

        @com.aliyun.core.annotation.NameInMap("NetworkInterfaceIp")
        private String networkInterfaceIp;

        @com.aliyun.core.annotation.NameInMap("OfficeSiteId")
        private String officeSiteId;

        @com.aliyun.core.annotation.NameInMap("OfficeSiteName")
        private String officeSiteName;

        @com.aliyun.core.annotation.NameInMap("OfficeSiteType")
        private String officeSiteType;

        @com.aliyun.core.annotation.NameInMap("OsType")
        private String osType;

        @com.aliyun.core.annotation.NameInMap("SecurityGroupIds")
        private java.util.List<String> securityGroupIds;

        @com.aliyun.core.annotation.NameInMap("ServerInstanceTypeInfo")
        private ServerInstanceTypeInfo serverInstanceTypeInfo;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("SystemDiskCategory")
        private String systemDiskCategory;

        @com.aliyun.core.annotation.NameInMap("SystemDiskPerformanceLevel")
        private String systemDiskPerformanceLevel;

        @com.aliyun.core.annotation.NameInMap("SystemDiskSize")
        private Integer systemDiskSize;

        @com.aliyun.core.annotation.NameInMap("VirtualNodePoolId")
        private String virtualNodePoolId;

        @com.aliyun.core.annotation.NameInMap("WuyingServerId")
        private String wuyingServerId;

        @com.aliyun.core.annotation.NameInMap("WuyingServerName")
        private String wuyingServerName;

        private WuyingServerList(Builder builder) {
            this.addVirtualNodePoolStatus = builder.addVirtualNodePoolStatus;
            this.bizRegionId = builder.bizRegionId;
            this.chargeType = builder.chargeType;
            this.createTime = builder.createTime;
            this.dataDisk = builder.dataDisk;
            this.expiredTime = builder.expiredTime;
            this.imageId = builder.imageId;
            this.imageName = builder.imageName;
            this.instanceInfoList = builder.instanceInfoList;
            this.networkInterfaceIp = builder.networkInterfaceIp;
            this.officeSiteId = builder.officeSiteId;
            this.officeSiteName = builder.officeSiteName;
            this.officeSiteType = builder.officeSiteType;
            this.osType = builder.osType;
            this.securityGroupIds = builder.securityGroupIds;
            this.serverInstanceTypeInfo = builder.serverInstanceTypeInfo;
            this.status = builder.status;
            this.systemDiskCategory = builder.systemDiskCategory;
            this.systemDiskPerformanceLevel = builder.systemDiskPerformanceLevel;
            this.systemDiskSize = builder.systemDiskSize;
            this.virtualNodePoolId = builder.virtualNodePoolId;
            this.wuyingServerId = builder.wuyingServerId;
            this.wuyingServerName = builder.wuyingServerName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WuyingServerList create() {
            return builder().build();
        }

        /**
         * @return addVirtualNodePoolStatus
         */
        public String getAddVirtualNodePoolStatus() {
            return this.addVirtualNodePoolStatus;
        }

        /**
         * @return bizRegionId
         */
        public String getBizRegionId() {
            return this.bizRegionId;
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
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return dataDisk
         */
        public java.util.List<DataDisk> getDataDisk() {
            return this.dataDisk;
        }

        /**
         * @return expiredTime
         */
        public String getExpiredTime() {
            return this.expiredTime;
        }

        /**
         * @return imageId
         */
        public String getImageId() {
            return this.imageId;
        }

        /**
         * @return imageName
         */
        public String getImageName() {
            return this.imageName;
        }

        /**
         * @return instanceInfoList
         */
        public java.util.List<InstanceInfoList> getInstanceInfoList() {
            return this.instanceInfoList;
        }

        /**
         * @return networkInterfaceIp
         */
        public String getNetworkInterfaceIp() {
            return this.networkInterfaceIp;
        }

        /**
         * @return officeSiteId
         */
        public String getOfficeSiteId() {
            return this.officeSiteId;
        }

        /**
         * @return officeSiteName
         */
        public String getOfficeSiteName() {
            return this.officeSiteName;
        }

        /**
         * @return officeSiteType
         */
        public String getOfficeSiteType() {
            return this.officeSiteType;
        }

        /**
         * @return osType
         */
        public String getOsType() {
            return this.osType;
        }

        /**
         * @return securityGroupIds
         */
        public java.util.List<String> getSecurityGroupIds() {
            return this.securityGroupIds;
        }

        /**
         * @return serverInstanceTypeInfo
         */
        public ServerInstanceTypeInfo getServerInstanceTypeInfo() {
            return this.serverInstanceTypeInfo;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return systemDiskCategory
         */
        public String getSystemDiskCategory() {
            return this.systemDiskCategory;
        }

        /**
         * @return systemDiskPerformanceLevel
         */
        public String getSystemDiskPerformanceLevel() {
            return this.systemDiskPerformanceLevel;
        }

        /**
         * @return systemDiskSize
         */
        public Integer getSystemDiskSize() {
            return this.systemDiskSize;
        }

        /**
         * @return virtualNodePoolId
         */
        public String getVirtualNodePoolId() {
            return this.virtualNodePoolId;
        }

        /**
         * @return wuyingServerId
         */
        public String getWuyingServerId() {
            return this.wuyingServerId;
        }

        /**
         * @return wuyingServerName
         */
        public String getWuyingServerName() {
            return this.wuyingServerName;
        }

        public static final class Builder {
            private String addVirtualNodePoolStatus; 
            private String bizRegionId; 
            private String chargeType; 
            private String createTime; 
            private java.util.List<DataDisk> dataDisk; 
            private String expiredTime; 
            private String imageId; 
            private String imageName; 
            private java.util.List<InstanceInfoList> instanceInfoList; 
            private String networkInterfaceIp; 
            private String officeSiteId; 
            private String officeSiteName; 
            private String officeSiteType; 
            private String osType; 
            private java.util.List<String> securityGroupIds; 
            private ServerInstanceTypeInfo serverInstanceTypeInfo; 
            private String status; 
            private String systemDiskCategory; 
            private String systemDiskPerformanceLevel; 
            private Integer systemDiskSize; 
            private String virtualNodePoolId; 
            private String wuyingServerId; 
            private String wuyingServerName; 

            private Builder() {
            } 

            private Builder(WuyingServerList model) {
                this.addVirtualNodePoolStatus = model.addVirtualNodePoolStatus;
                this.bizRegionId = model.bizRegionId;
                this.chargeType = model.chargeType;
                this.createTime = model.createTime;
                this.dataDisk = model.dataDisk;
                this.expiredTime = model.expiredTime;
                this.imageId = model.imageId;
                this.imageName = model.imageName;
                this.instanceInfoList = model.instanceInfoList;
                this.networkInterfaceIp = model.networkInterfaceIp;
                this.officeSiteId = model.officeSiteId;
                this.officeSiteName = model.officeSiteName;
                this.officeSiteType = model.officeSiteType;
                this.osType = model.osType;
                this.securityGroupIds = model.securityGroupIds;
                this.serverInstanceTypeInfo = model.serverInstanceTypeInfo;
                this.status = model.status;
                this.systemDiskCategory = model.systemDiskCategory;
                this.systemDiskPerformanceLevel = model.systemDiskPerformanceLevel;
                this.systemDiskSize = model.systemDiskSize;
                this.virtualNodePoolId = model.virtualNodePoolId;
                this.wuyingServerId = model.wuyingServerId;
                this.wuyingServerName = model.wuyingServerName;
            } 

            /**
             * AddVirtualNodePoolStatus.
             */
            public Builder addVirtualNodePoolStatus(String addVirtualNodePoolStatus) {
                this.addVirtualNodePoolStatus = addVirtualNodePoolStatus;
                return this;
            }

            /**
             * BizRegionId.
             */
            public Builder bizRegionId(String bizRegionId) {
                this.bizRegionId = bizRegionId;
                return this;
            }

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
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * DataDisk.
             */
            public Builder dataDisk(java.util.List<DataDisk> dataDisk) {
                this.dataDisk = dataDisk;
                return this;
            }

            /**
             * ExpiredTime.
             */
            public Builder expiredTime(String expiredTime) {
                this.expiredTime = expiredTime;
                return this;
            }

            /**
             * ImageId.
             */
            public Builder imageId(String imageId) {
                this.imageId = imageId;
                return this;
            }

            /**
             * ImageName.
             */
            public Builder imageName(String imageName) {
                this.imageName = imageName;
                return this;
            }

            /**
             * InstanceInfoList.
             */
            public Builder instanceInfoList(java.util.List<InstanceInfoList> instanceInfoList) {
                this.instanceInfoList = instanceInfoList;
                return this;
            }

            /**
             * NetworkInterfaceIp.
             */
            public Builder networkInterfaceIp(String networkInterfaceIp) {
                this.networkInterfaceIp = networkInterfaceIp;
                return this;
            }

            /**
             * OfficeSiteId.
             */
            public Builder officeSiteId(String officeSiteId) {
                this.officeSiteId = officeSiteId;
                return this;
            }

            /**
             * OfficeSiteName.
             */
            public Builder officeSiteName(String officeSiteName) {
                this.officeSiteName = officeSiteName;
                return this;
            }

            /**
             * OfficeSiteType.
             */
            public Builder officeSiteType(String officeSiteType) {
                this.officeSiteType = officeSiteType;
                return this;
            }

            /**
             * OsType.
             */
            public Builder osType(String osType) {
                this.osType = osType;
                return this;
            }

            /**
             * SecurityGroupIds.
             */
            public Builder securityGroupIds(java.util.List<String> securityGroupIds) {
                this.securityGroupIds = securityGroupIds;
                return this;
            }

            /**
             * ServerInstanceTypeInfo.
             */
            public Builder serverInstanceTypeInfo(ServerInstanceTypeInfo serverInstanceTypeInfo) {
                this.serverInstanceTypeInfo = serverInstanceTypeInfo;
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
             * SystemDiskCategory.
             */
            public Builder systemDiskCategory(String systemDiskCategory) {
                this.systemDiskCategory = systemDiskCategory;
                return this;
            }

            /**
             * SystemDiskPerformanceLevel.
             */
            public Builder systemDiskPerformanceLevel(String systemDiskPerformanceLevel) {
                this.systemDiskPerformanceLevel = systemDiskPerformanceLevel;
                return this;
            }

            /**
             * SystemDiskSize.
             */
            public Builder systemDiskSize(Integer systemDiskSize) {
                this.systemDiskSize = systemDiskSize;
                return this;
            }

            /**
             * VirtualNodePoolId.
             */
            public Builder virtualNodePoolId(String virtualNodePoolId) {
                this.virtualNodePoolId = virtualNodePoolId;
                return this;
            }

            /**
             * WuyingServerId.
             */
            public Builder wuyingServerId(String wuyingServerId) {
                this.wuyingServerId = wuyingServerId;
                return this;
            }

            /**
             * WuyingServerName.
             */
            public Builder wuyingServerName(String wuyingServerName) {
                this.wuyingServerName = wuyingServerName;
                return this;
            }

            public WuyingServerList build() {
                return new WuyingServerList(this);
            } 

        } 

    }
}
