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
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>15</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * <p>The list of workstation information.</p>
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

        @com.aliyun.core.annotation.NameInMap("DataDiskId")
        private String dataDiskId;

        @com.aliyun.core.annotation.NameInMap("DataDiskNo")
        private String dataDiskNo;

        @com.aliyun.core.annotation.NameInMap("DataDiskPerformanceLevel")
        private String dataDiskPerformanceLevel;

        @com.aliyun.core.annotation.NameInMap("DataDiskSize")
        private Integer dataDiskSize;

        private DataDisk(Builder builder) {
            this.dataDiskCategory = builder.dataDiskCategory;
            this.dataDiskId = builder.dataDiskId;
            this.dataDiskNo = builder.dataDiskNo;
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
         * @return dataDiskId
         */
        public String getDataDiskId() {
            return this.dataDiskId;
        }

        /**
         * @return dataDiskNo
         */
        public String getDataDiskNo() {
            return this.dataDiskNo;
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
            private String dataDiskId; 
            private String dataDiskNo; 
            private String dataDiskPerformanceLevel; 
            private Integer dataDiskSize; 

            private Builder() {
            } 

            private Builder(DataDisk model) {
                this.dataDiskCategory = model.dataDiskCategory;
                this.dataDiskId = model.dataDiskId;
                this.dataDiskNo = model.dataDiskNo;
                this.dataDiskPerformanceLevel = model.dataDiskPerformanceLevel;
                this.dataDiskSize = model.dataDiskSize;
            } 

            /**
             * <p>The category of data disk.</p>
             * 
             * <strong>example:</strong>
             * <p>cloud_auto</p>
             */
            public Builder dataDiskCategory(String dataDiskCategory) {
                this.dataDiskCategory = dataDiskCategory;
                return this;
            }

            /**
             * DataDiskId.
             */
            public Builder dataDiskId(String dataDiskId) {
                this.dataDiskId = dataDiskId;
                return this;
            }

            /**
             * DataDiskNo.
             */
            public Builder dataDiskNo(String dataDiskNo) {
                this.dataDiskNo = dataDiskNo;
                return this;
            }

            /**
             * <p>The PL of the data disk.</p>
             * 
             * <strong>example:</strong>
             * <p>PL0</p>
             */
            public Builder dataDiskPerformanceLevel(String dataDiskPerformanceLevel) {
                this.dataDiskPerformanceLevel = dataDiskPerformanceLevel;
                return this;
            }

            /**
             * <p>The size of the data disk. Unit: GB.</p>
             * 
             * <strong>example:</strong>
             * <p>200</p>
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
             * <p>The ID of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>p-0ceitx****c5</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The ID of the ENI.</p>
             * 
             * <strong>example:</strong>
             * <p>eni-uf65b****dfnt3wb</p>
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

        @com.aliyun.core.annotation.NameInMap("GpuSpec")
        private String gpuSpec;

        @com.aliyun.core.annotation.NameInMap("Memory")
        private Integer memory;

        @com.aliyun.core.annotation.NameInMap("ServerInstanceType")
        private String serverInstanceType;

        private ServerInstanceTypeInfo(Builder builder) {
            this.cpu = builder.cpu;
            this.gpu = builder.gpu;
            this.gpuMemory = builder.gpuMemory;
            this.gpuSpec = builder.gpuSpec;
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
         * @return gpuSpec
         */
        public String getGpuSpec() {
            return this.gpuSpec;
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
            private String gpuSpec; 
            private Integer memory; 
            private String serverInstanceType; 

            private Builder() {
            } 

            private Builder(ServerInstanceTypeInfo model) {
                this.cpu = model.cpu;
                this.gpu = model.gpu;
                this.gpuMemory = model.gpuMemory;
                this.gpuSpec = model.gpuSpec;
                this.memory = model.memory;
                this.serverInstanceType = model.serverInstanceType;
            } 

            /**
             * <p>The number of vCPUs.</p>
             * 
             * <strong>example:</strong>
             * <p>96</p>
             */
            public Builder cpu(String cpu) {
                this.cpu = cpu;
                return this;
            }

            /**
             * <p>The number of GPUs.</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder gpu(String gpu) {
                this.gpu = gpu;
                return this;
            }

            /**
             * <p>The memory size. Unit: MB.</p>
             * 
             * <strong>example:</strong>
             * <p>196,608</p>
             */
            public Builder gpuMemory(Integer gpuMemory) {
                this.gpuMemory = gpuMemory;
                return this;
            }

            /**
             * GpuSpec.
             */
            public Builder gpuSpec(String gpuSpec) {
                this.gpuSpec = gpuSpec;
                return this;
            }

            /**
             * <p>The memory size. Unit: MB.</p>
             * 
             * <strong>example:</strong>
             * <p>393,216</p>
             */
            public Builder memory(Integer memory) {
                this.memory = memory;
                return this;
            }

            /**
             * <p>Workstation specifications.</p>
             * 
             * <strong>example:</strong>
             * <p>eds.proworkstation_flagship_elite_ne.96c384g.192g4x</p>
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
    public static class Sessions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ResourceSessionStartTime")
        private String resourceSessionStartTime;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        private Sessions(Builder builder) {
            this.resourceSessionStartTime = builder.resourceSessionStartTime;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Sessions create() {
            return builder().build();
        }

        /**
         * @return resourceSessionStartTime
         */
        public String getResourceSessionStartTime() {
            return this.resourceSessionStartTime;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private String resourceSessionStartTime; 
            private String userId; 

            private Builder() {
            } 

            private Builder(Sessions model) {
                this.resourceSessionStartTime = model.resourceSessionStartTime;
                this.userId = model.userId;
            } 

            /**
             * ResourceSessionStartTime.
             */
            public Builder resourceSessionStartTime(String resourceSessionStartTime) {
                this.resourceSessionStartTime = resourceSessionStartTime;
                return this;
            }

            /**
             * UserId.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public Sessions build() {
                return new Sessions(this);
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

        @com.aliyun.core.annotation.NameInMap("AliUid")
        private Long aliUid;

        @com.aliyun.core.annotation.NameInMap("Bandwidth")
        private Integer bandwidth;

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

        @com.aliyun.core.annotation.NameInMap("FotaVersion")
        private String fotaVersion;

        @com.aliyun.core.annotation.NameInMap("ImageId")
        private String imageId;

        @com.aliyun.core.annotation.NameInMap("ImageName")
        private String imageName;

        @com.aliyun.core.annotation.NameInMap("InstanceInfoList")
        private java.util.List<InstanceInfoList> instanceInfoList;

        @com.aliyun.core.annotation.NameInMap("MaxPrice")
        private Float maxPrice;

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

        @com.aliyun.core.annotation.NameInMap("PolicyGroupIdList")
        private java.util.List<String> policyGroupIdList;

        @com.aliyun.core.annotation.NameInMap("ResourceSessionStatus")
        private String resourceSessionStatus;

        @com.aliyun.core.annotation.NameInMap("SecurityGroupIds")
        private java.util.List<String> securityGroupIds;

        @com.aliyun.core.annotation.NameInMap("ServerInstanceTypeInfo")
        private ServerInstanceTypeInfo serverInstanceTypeInfo;

        @com.aliyun.core.annotation.NameInMap("Sessions")
        private java.util.List<Sessions> sessions;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("SubPayType")
        private String subPayType;

        @com.aliyun.core.annotation.NameInMap("SystemDiskCategory")
        private String systemDiskCategory;

        @com.aliyun.core.annotation.NameInMap("SystemDiskId")
        private String systemDiskId;

        @com.aliyun.core.annotation.NameInMap("SystemDiskPerformanceLevel")
        private String systemDiskPerformanceLevel;

        @com.aliyun.core.annotation.NameInMap("SystemDiskSize")
        private Integer systemDiskSize;

        @com.aliyun.core.annotation.NameInMap("TimerGroupId")
        private String timerGroupId;

        @com.aliyun.core.annotation.NameInMap("Users")
        private java.util.List<String> users;

        @com.aliyun.core.annotation.NameInMap("VirtualKubeletIp")
        private String virtualKubeletIp;

        @com.aliyun.core.annotation.NameInMap("VirtualNodePoolId")
        private String virtualNodePoolId;

        @com.aliyun.core.annotation.NameInMap("WuyingServerId")
        private String wuyingServerId;

        @com.aliyun.core.annotation.NameInMap("WuyingServerName")
        private String wuyingServerName;

        private WuyingServerList(Builder builder) {
            this.addVirtualNodePoolStatus = builder.addVirtualNodePoolStatus;
            this.aliUid = builder.aliUid;
            this.bandwidth = builder.bandwidth;
            this.bizRegionId = builder.bizRegionId;
            this.chargeType = builder.chargeType;
            this.createTime = builder.createTime;
            this.dataDisk = builder.dataDisk;
            this.expiredTime = builder.expiredTime;
            this.fotaVersion = builder.fotaVersion;
            this.imageId = builder.imageId;
            this.imageName = builder.imageName;
            this.instanceInfoList = builder.instanceInfoList;
            this.maxPrice = builder.maxPrice;
            this.networkInterfaceIp = builder.networkInterfaceIp;
            this.officeSiteId = builder.officeSiteId;
            this.officeSiteName = builder.officeSiteName;
            this.officeSiteType = builder.officeSiteType;
            this.osType = builder.osType;
            this.policyGroupIdList = builder.policyGroupIdList;
            this.resourceSessionStatus = builder.resourceSessionStatus;
            this.securityGroupIds = builder.securityGroupIds;
            this.serverInstanceTypeInfo = builder.serverInstanceTypeInfo;
            this.sessions = builder.sessions;
            this.status = builder.status;
            this.subPayType = builder.subPayType;
            this.systemDiskCategory = builder.systemDiskCategory;
            this.systemDiskId = builder.systemDiskId;
            this.systemDiskPerformanceLevel = builder.systemDiskPerformanceLevel;
            this.systemDiskSize = builder.systemDiskSize;
            this.timerGroupId = builder.timerGroupId;
            this.users = builder.users;
            this.virtualKubeletIp = builder.virtualKubeletIp;
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
         * @return aliUid
         */
        public Long getAliUid() {
            return this.aliUid;
        }

        /**
         * @return bandwidth
         */
        public Integer getBandwidth() {
            return this.bandwidth;
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
         * @return fotaVersion
         */
        public String getFotaVersion() {
            return this.fotaVersion;
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
         * @return maxPrice
         */
        public Float getMaxPrice() {
            return this.maxPrice;
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
         * @return policyGroupIdList
         */
        public java.util.List<String> getPolicyGroupIdList() {
            return this.policyGroupIdList;
        }

        /**
         * @return resourceSessionStatus
         */
        public String getResourceSessionStatus() {
            return this.resourceSessionStatus;
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
         * @return sessions
         */
        public java.util.List<Sessions> getSessions() {
            return this.sessions;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return subPayType
         */
        public String getSubPayType() {
            return this.subPayType;
        }

        /**
         * @return systemDiskCategory
         */
        public String getSystemDiskCategory() {
            return this.systemDiskCategory;
        }

        /**
         * @return systemDiskId
         */
        public String getSystemDiskId() {
            return this.systemDiskId;
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
         * @return timerGroupId
         */
        public String getTimerGroupId() {
            return this.timerGroupId;
        }

        /**
         * @return users
         */
        public java.util.List<String> getUsers() {
            return this.users;
        }

        /**
         * @return virtualKubeletIp
         */
        public String getVirtualKubeletIp() {
            return this.virtualKubeletIp;
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
            private Long aliUid; 
            private Integer bandwidth; 
            private String bizRegionId; 
            private String chargeType; 
            private String createTime; 
            private java.util.List<DataDisk> dataDisk; 
            private String expiredTime; 
            private String fotaVersion; 
            private String imageId; 
            private String imageName; 
            private java.util.List<InstanceInfoList> instanceInfoList; 
            private Float maxPrice; 
            private String networkInterfaceIp; 
            private String officeSiteId; 
            private String officeSiteName; 
            private String officeSiteType; 
            private String osType; 
            private java.util.List<String> policyGroupIdList; 
            private String resourceSessionStatus; 
            private java.util.List<String> securityGroupIds; 
            private ServerInstanceTypeInfo serverInstanceTypeInfo; 
            private java.util.List<Sessions> sessions; 
            private String status; 
            private String subPayType; 
            private String systemDiskCategory; 
            private String systemDiskId; 
            private String systemDiskPerformanceLevel; 
            private Integer systemDiskSize; 
            private String timerGroupId; 
            private java.util.List<String> users; 
            private String virtualKubeletIp; 
            private String virtualNodePoolId; 
            private String wuyingServerId; 
            private String wuyingServerName; 

            private Builder() {
            } 

            private Builder(WuyingServerList model) {
                this.addVirtualNodePoolStatus = model.addVirtualNodePoolStatus;
                this.aliUid = model.aliUid;
                this.bandwidth = model.bandwidth;
                this.bizRegionId = model.bizRegionId;
                this.chargeType = model.chargeType;
                this.createTime = model.createTime;
                this.dataDisk = model.dataDisk;
                this.expiredTime = model.expiredTime;
                this.fotaVersion = model.fotaVersion;
                this.imageId = model.imageId;
                this.imageName = model.imageName;
                this.instanceInfoList = model.instanceInfoList;
                this.maxPrice = model.maxPrice;
                this.networkInterfaceIp = model.networkInterfaceIp;
                this.officeSiteId = model.officeSiteId;
                this.officeSiteName = model.officeSiteName;
                this.officeSiteType = model.officeSiteType;
                this.osType = model.osType;
                this.policyGroupIdList = model.policyGroupIdList;
                this.resourceSessionStatus = model.resourceSessionStatus;
                this.securityGroupIds = model.securityGroupIds;
                this.serverInstanceTypeInfo = model.serverInstanceTypeInfo;
                this.sessions = model.sessions;
                this.status = model.status;
                this.subPayType = model.subPayType;
                this.systemDiskCategory = model.systemDiskCategory;
                this.systemDiskId = model.systemDiskId;
                this.systemDiskPerformanceLevel = model.systemDiskPerformanceLevel;
                this.systemDiskSize = model.systemDiskSize;
                this.timerGroupId = model.timerGroupId;
                this.users = model.users;
                this.virtualKubeletIp = model.virtualKubeletIp;
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
             * AliUid.
             */
            public Builder aliUid(Long aliUid) {
                this.aliUid = aliUid;
                return this;
            }

            /**
             * Bandwidth.
             */
            public Builder bandwidth(Integer bandwidth) {
                this.bandwidth = bandwidth;
                return this;
            }

            /**
             * <p>Region.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder bizRegionId(String bizRegionId) {
                this.bizRegionId = bizRegionId;
                return this;
            }

            /**
             * <p>The billing method.</p>
             * 
             * <strong>example:</strong>
             * <p>PrePaid</p>
             */
            public Builder chargeType(String chargeType) {
                this.chargeType = chargeType;
                return this;
            }

            /**
             * <p>The time when the storage resource was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-08-02T16:52:11.000+00:00</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The data disks.</p>
             */
            public Builder dataDisk(java.util.List<DataDisk> dataDisk) {
                this.dataDisk = dataDisk;
                return this;
            }

            /**
             * <p>The time when the subscription instance expires.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-09-03T16:00:00.000+00:00</p>
             */
            public Builder expiredTime(String expiredTime) {
                this.expiredTime = expiredTime;
                return this;
            }

            /**
             * FotaVersion.
             */
            public Builder fotaVersion(String fotaVersion) {
                this.fotaVersion = fotaVersion;
                return this;
            }

            /**
             * <p>The ID of the custom image.</p>
             * 
             * <strong>example:</strong>
             * <p>imgc-06****oagaev</p>
             */
            public Builder imageId(String imageId) {
                this.imageId = imageId;
                return this;
            }

            /**
             * <p>The image name.</p>
             */
            public Builder imageName(String imageName) {
                this.imageName = imageName;
                return this;
            }

            /**
             * <p>The list of information about the workstation instance.</p>
             */
            public Builder instanceInfoList(java.util.List<InstanceInfoList> instanceInfoList) {
                this.instanceInfoList = instanceInfoList;
                return this;
            }

            /**
             * MaxPrice.
             */
            public Builder maxPrice(Float maxPrice) {
                this.maxPrice = maxPrice;
                return this;
            }

            /**
             * <p>The private IP address.</p>
             * 
             * <strong>example:</strong>
             * <p>10.80.21.149</p>
             */
            public Builder networkInterfaceIp(String networkInterfaceIp) {
                this.networkInterfaceIp = networkInterfaceIp;
                return this;
            }

            /**
             * <p>The ID of the office network.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou+dir-1b****ayv2</p>
             */
            public Builder officeSiteId(String officeSiteId) {
                this.officeSiteId = officeSiteId;
                return this;
            }

            /**
             * <p>The office network name.</p>
             * 
             * <strong>example:</strong>
             * <p>exampleOfficeSite</p>
             */
            public Builder officeSiteName(String officeSiteName) {
                this.officeSiteName = officeSiteName;
                return this;
            }

            /**
             * <p>The type of the office network.</p>
             * 
             * <strong>example:</strong>
             * <p>SIMPLE</p>
             */
            public Builder officeSiteType(String officeSiteType) {
                this.officeSiteType = officeSiteType;
                return this;
            }

            /**
             * <p>The OS type.</p>
             * 
             * <strong>example:</strong>
             * <p>Linux</p>
             */
            public Builder osType(String osType) {
                this.osType = osType;
                return this;
            }

            /**
             * PolicyGroupIdList.
             */
            public Builder policyGroupIdList(java.util.List<String> policyGroupIdList) {
                this.policyGroupIdList = policyGroupIdList;
                return this;
            }

            /**
             * ResourceSessionStatus.
             */
            public Builder resourceSessionStatus(String resourceSessionStatus) {
                this.resourceSessionStatus = resourceSessionStatus;
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
             * <p>The specifications.</p>
             */
            public Builder serverInstanceTypeInfo(ServerInstanceTypeInfo serverInstanceTypeInfo) {
                this.serverInstanceTypeInfo = serverInstanceTypeInfo;
                return this;
            }

            /**
             * Sessions.
             */
            public Builder sessions(java.util.List<Sessions> sessions) {
                this.sessions = sessions;
                return this;
            }

            /**
             * <p>The status of the workstation.</p>
             * 
             * <strong>example:</strong>
             * <p>RUNNING</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * SubPayType.
             */
            public Builder subPayType(String subPayType) {
                this.subPayType = subPayType;
                return this;
            }

            /**
             * <p>The type of the system disk.</p>
             * 
             * <strong>example:</strong>
             * <p>cloud_auto</p>
             */
            public Builder systemDiskCategory(String systemDiskCategory) {
                this.systemDiskCategory = systemDiskCategory;
                return this;
            }

            /**
             * SystemDiskId.
             */
            public Builder systemDiskId(String systemDiskId) {
                this.systemDiskId = systemDiskId;
                return this;
            }

            /**
             * <p>The performance level (PL) of the system disk.</p>
             * 
             * <strong>example:</strong>
             * <p>PL0</p>
             */
            public Builder systemDiskPerformanceLevel(String systemDiskPerformanceLevel) {
                this.systemDiskPerformanceLevel = systemDiskPerformanceLevel;
                return this;
            }

            /**
             * <p>The size of the system disk. Unit: GiB.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder systemDiskSize(Integer systemDiskSize) {
                this.systemDiskSize = systemDiskSize;
                return this;
            }

            /**
             * TimerGroupId.
             */
            public Builder timerGroupId(String timerGroupId) {
                this.timerGroupId = timerGroupId;
                return this;
            }

            /**
             * Users.
             */
            public Builder users(java.util.List<String> users) {
                this.users = users;
                return this;
            }

            /**
             * VirtualKubeletIp.
             */
            public Builder virtualKubeletIp(String virtualKubeletIp) {
                this.virtualKubeletIp = virtualKubeletIp;
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
             * <p>The ID of the workstation.</p>
             * 
             * <strong>example:</strong>
             * <p>ws-0byd****8wn2lwi</p>
             */
            public Builder wuyingServerId(String wuyingServerId) {
                this.wuyingServerId = wuyingServerId;
                return this;
            }

            /**
             * <p>The name of the workstation.</p>
             * 
             * <strong>example:</strong>
             * <p>exampleServerName</p>
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
