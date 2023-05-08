// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAssetDetailByUuidResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAssetDetailByUuidResponseBody</p>
 */
public class DescribeAssetDetailByUuidResponseBody extends TeaModel {
    @NameInMap("AssetDetail")
    private AssetDetail assetDetail;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeAssetDetailByUuidResponseBody(Builder builder) {
        this.assetDetail = builder.assetDetail;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAssetDetailByUuidResponseBody create() {
        return builder().build();
    }

    /**
     * @return assetDetail
     */
    public AssetDetail getAssetDetail() {
        return this.assetDetail;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private AssetDetail assetDetail; 
        private String requestId; 

        /**
         * The kernel version of the operating system.
         */
        public Builder assetDetail(AssetDetail assetDetail) {
            this.assetDetail = assetDetail;
            return this;
        }

        /**
         * The timestamp when Security Center records the details of the server. Unit: milliseconds.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeAssetDetailByUuidResponseBody build() {
            return new DescribeAssetDetailByUuidResponseBody(this);
        } 

    } 

    public static class AssetDetail extends TeaModel {
        @NameInMap("AssetType")
        private String assetType;

        @NameInMap("AuthModifyTime")
        private Long authModifyTime;

        @NameInMap("AuthVersion")
        private Integer authVersion;

        @NameInMap("Bind")
        private Boolean bind;

        @NameInMap("ClientStatus")
        private String clientStatus;

        @NameInMap("ClientVersion")
        private String clientVersion;

        @NameInMap("Cpu")
        private Integer cpu;

        @NameInMap("CpuInfo")
        private String cpuInfo;

        @NameInMap("CreateTime")
        private Long createTime;

        @NameInMap("DiskInfoList")
        private java.util.List < String > diskInfoList;

        @NameInMap("Flag")
        private Integer flag;

        @NameInMap("GroupTrace")
        private String groupTrace;

        @NameInMap("HostName")
        private String hostName;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("InstanceName")
        private String instanceName;

        @NameInMap("InternetIp")
        private String internetIp;

        @NameInMap("IntranetIp")
        private String intranetIp;

        @NameInMap("Ip")
        private String ip;

        @NameInMap("IpList")
        private java.util.List < String > ipList;

        @NameInMap("Kernel")
        private String kernel;

        @NameInMap("MacList")
        private java.util.List < String > macList;

        @NameInMap("Mem")
        private Integer mem;

        @NameInMap("Memory")
        private Long memory;

        @NameInMap("Os")
        private String os;

        @NameInMap("OsDetail")
        private String osDetail;

        @NameInMap("OsName")
        private String osName;

        @NameInMap("Region")
        private String region;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("RegionName")
        private String regionName;

        @NameInMap("SysInfo")
        private String sysInfo;

        @NameInMap("Tag")
        private String tag;

        @NameInMap("Uuid")
        private String uuid;

        @NameInMap("VpcInstanceId")
        private String vpcInstanceId;

        private AssetDetail(Builder builder) {
            this.assetType = builder.assetType;
            this.authModifyTime = builder.authModifyTime;
            this.authVersion = builder.authVersion;
            this.bind = builder.bind;
            this.clientStatus = builder.clientStatus;
            this.clientVersion = builder.clientVersion;
            this.cpu = builder.cpu;
            this.cpuInfo = builder.cpuInfo;
            this.createTime = builder.createTime;
            this.diskInfoList = builder.diskInfoList;
            this.flag = builder.flag;
            this.groupTrace = builder.groupTrace;
            this.hostName = builder.hostName;
            this.instanceId = builder.instanceId;
            this.instanceName = builder.instanceName;
            this.internetIp = builder.internetIp;
            this.intranetIp = builder.intranetIp;
            this.ip = builder.ip;
            this.ipList = builder.ipList;
            this.kernel = builder.kernel;
            this.macList = builder.macList;
            this.mem = builder.mem;
            this.memory = builder.memory;
            this.os = builder.os;
            this.osDetail = builder.osDetail;
            this.osName = builder.osName;
            this.region = builder.region;
            this.regionId = builder.regionId;
            this.regionName = builder.regionName;
            this.sysInfo = builder.sysInfo;
            this.tag = builder.tag;
            this.uuid = builder.uuid;
            this.vpcInstanceId = builder.vpcInstanceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AssetDetail create() {
            return builder().build();
        }

        /**
         * @return assetType
         */
        public String getAssetType() {
            return this.assetType;
        }

        /**
         * @return authModifyTime
         */
        public Long getAuthModifyTime() {
            return this.authModifyTime;
        }

        /**
         * @return authVersion
         */
        public Integer getAuthVersion() {
            return this.authVersion;
        }

        /**
         * @return bind
         */
        public Boolean getBind() {
            return this.bind;
        }

        /**
         * @return clientStatus
         */
        public String getClientStatus() {
            return this.clientStatus;
        }

        /**
         * @return clientVersion
         */
        public String getClientVersion() {
            return this.clientVersion;
        }

        /**
         * @return cpu
         */
        public Integer getCpu() {
            return this.cpu;
        }

        /**
         * @return cpuInfo
         */
        public String getCpuInfo() {
            return this.cpuInfo;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return diskInfoList
         */
        public java.util.List < String > getDiskInfoList() {
            return this.diskInfoList;
        }

        /**
         * @return flag
         */
        public Integer getFlag() {
            return this.flag;
        }

        /**
         * @return groupTrace
         */
        public String getGroupTrace() {
            return this.groupTrace;
        }

        /**
         * @return hostName
         */
        public String getHostName() {
            return this.hostName;
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

        /**
         * @return internetIp
         */
        public String getInternetIp() {
            return this.internetIp;
        }

        /**
         * @return intranetIp
         */
        public String getIntranetIp() {
            return this.intranetIp;
        }

        /**
         * @return ip
         */
        public String getIp() {
            return this.ip;
        }

        /**
         * @return ipList
         */
        public java.util.List < String > getIpList() {
            return this.ipList;
        }

        /**
         * @return kernel
         */
        public String getKernel() {
            return this.kernel;
        }

        /**
         * @return macList
         */
        public java.util.List < String > getMacList() {
            return this.macList;
        }

        /**
         * @return mem
         */
        public Integer getMem() {
            return this.mem;
        }

        /**
         * @return memory
         */
        public Long getMemory() {
            return this.memory;
        }

        /**
         * @return os
         */
        public String getOs() {
            return this.os;
        }

        /**
         * @return osDetail
         */
        public String getOsDetail() {
            return this.osDetail;
        }

        /**
         * @return osName
         */
        public String getOsName() {
            return this.osName;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return regionName
         */
        public String getRegionName() {
            return this.regionName;
        }

        /**
         * @return sysInfo
         */
        public String getSysInfo() {
            return this.sysInfo;
        }

        /**
         * @return tag
         */
        public String getTag() {
            return this.tag;
        }

        /**
         * @return uuid
         */
        public String getUuid() {
            return this.uuid;
        }

        /**
         * @return vpcInstanceId
         */
        public String getVpcInstanceId() {
            return this.vpcInstanceId;
        }

        public static final class Builder {
            private String assetType; 
            private Long authModifyTime; 
            private Integer authVersion; 
            private Boolean bind; 
            private String clientStatus; 
            private String clientVersion; 
            private Integer cpu; 
            private String cpuInfo; 
            private Long createTime; 
            private java.util.List < String > diskInfoList; 
            private Integer flag; 
            private String groupTrace; 
            private String hostName; 
            private String instanceId; 
            private String instanceName; 
            private String internetIp; 
            private String intranetIp; 
            private String ip; 
            private java.util.List < String > ipList; 
            private String kernel; 
            private java.util.List < String > macList; 
            private Integer mem; 
            private Long memory; 
            private String os; 
            private String osDetail; 
            private String osName; 
            private String region; 
            private String regionId; 
            private String regionName; 
            private String sysInfo; 
            private String tag; 
            private String uuid; 
            private String vpcInstanceId; 

            /**
             * The name of the region in which the server resides.
             */
            public Builder assetType(String assetType) {
                this.assetType = assetType;
                return this;
            }

            /**
             * The operating system information about the server.
             */
            public Builder authModifyTime(Long authModifyTime) {
                this.authModifyTime = authModifyTime;
                return this;
            }

            /**
             * The name of the host.
             */
            public Builder authVersion(Integer authVersion) {
                this.authVersion = authVersion;
                return this;
            }

            /**
             * The memory size of the server. Unit: MB.
             */
            public Builder bind(Boolean bind) {
                this.bind = bind;
                return this;
            }

            /**
             * The name of the server.
             */
            public Builder clientStatus(String clientStatus) {
                this.clientStatus = clientStatus;
                return this;
            }

            /**
             * An array that consists of the information about the disk.
             */
            public Builder clientVersion(String clientVersion) {
                this.clientVersion = clientVersion;
                return this;
            }

            /**
             * The IP addresses of the server.
             */
            public Builder cpu(Integer cpu) {
                this.cpu = cpu;
                return this;
            }

            /**
             * Indicates whether Security Center is authorized to protect the asset. Valid values:
             * <p>
             * 
             * *   **true**: yes
             * *   **false**: no
             */
            public Builder cpuInfo(String cpuInfo) {
                this.cpuInfo = cpuInfo;
                return this;
            }

            /**
             * The status of the Security Center agent. Valid values:
             * <p>
             * 
             * *   **pause**: The Security Center agent suspends protection for your server.
             * *   **online**: The Security Center agent is protecting your server.
             * *   **offline**: The Security Center agent does not protect your server.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * DiskInfoList.
             */
            public Builder diskInfoList(java.util.List < String > diskInfoList) {
                this.diskInfoList = diskInfoList;
                return this;
            }

            /**
             * The MAC addresses of the server.
             */
            public Builder flag(Integer flag) {
                this.flag = flag;
                return this;
            }

            /**
             * The ID of the server.
             */
            public Builder groupTrace(String groupTrace) {
                this.groupTrace = groupTrace;
                return this;
            }

            /**
             * The type of the asset. Valid values:
             * <p>
             * 
             * *   **0**: ECS instance
             * *   **1**: Server Load Balancer (SLB) instance
             * *   **2**: NAT gateway
             * *   **3**: ApsaraDB RDS database
             * *   **4**: ApsaraDB for MongoDB database
             * *   **5**: ApsaraDB for Redis database
             * *   **6**: image
             * *   **7**: container
             */
            public Builder hostName(String hostName) {
                this.hostName = hostName;
                return this;
            }

            /**
             * The UUID of the server.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The operating system type of the server.
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * The name of the operating system.
             */
            public Builder internetIp(String internetIp) {
                this.internetIp = internetIp;
                return this;
            }

            /**
             * The number of CPU cores.
             */
            public Builder intranetIp(String intranetIp) {
                this.intranetIp = intranetIp;
                return this;
            }

            /**
             * The private IP address of the server.
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * The information about the disk. This parameter contains the following fields:
             * <p>
             * 
             * *   **diskName**: the name of the disk.
             * *   **totalSize**: the total amount of the disk space. Unit: GB.
             * *   **useSize**: the amount of the used disk space. Unit: GB.
             * *   **useSizeByte**: the amount of the used disk space. Unit: bytes.
             * *   **totalSizeByte**: the total amount of the disk space. Unit: bytes.
             */
            public Builder ipList(java.util.List < String > ipList) {
                this.ipList = ipList;
                return this;
            }

            /**
             * The memory size of the server. Unit: GB.
             */
            public Builder kernel(String kernel) {
                this.kernel = kernel;
                return this;
            }

            /**
             * MacList.
             */
            public Builder macList(java.util.List < String > macList) {
                this.macList = macList;
                return this;
            }

            /**
             * The region in which the server resides.
             */
            public Builder mem(Integer mem) {
                this.mem = mem;
                return this;
            }

            /**
             * The group to which the server belongs. By default, the servers that are not grouped belong to the **Default** group.
             */
            public Builder memory(Long memory) {
                this.memory = memory;
                return this;
            }

            /**
             * The ID of the region in which the asset resides.
             */
            public Builder os(String os) {
                this.os = os;
                return this;
            }

            /**
             * The tag that is added to the server.
             */
            public Builder osDetail(String osDetail) {
                this.osDetail = osDetail;
                return this;
            }

            /**
             * The ID of the virtual private cloud (VPC) in which the server resides.
             */
            public Builder osName(String osName) {
                this.osName = osName;
                return this;
            }

            /**
             * The timestamp when Security Center is authorized to protect the asset. Unit: milliseconds.
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * Indicates whether the asset is provided by Alibaba Cloud. Valid values:
             * <p>
             * 
             * *   **0**: yes
             * *   **1**: no
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The media access control (MAC) addresses of the server.
             */
            public Builder regionName(String regionName) {
                this.regionName = regionName;
                return this;
            }

            /**
             * The version of the Security Center agent.
             */
            public Builder sysInfo(String sysInfo) {
                this.sysInfo = sysInfo;
                return this;
            }

            /**
             * The edition of Security Center that is authorized to protect the asset. Valid values:
             * <p>
             * 
             * *   **1**: Basic edition (Unauthorized)
             * *   **6**: Anti-virus edition
             * *   **5**: Advanced edition
             * *   **3**: Enterprise edition
             * *   **7**: Ultimate edition
             * *   **10**: Value-added Plan edition
             */
            public Builder tag(String tag) {
                this.tag = tag;
                return this;
            }

            /**
             * The IP addresses of the server.
             */
            public Builder uuid(String uuid) {
                this.uuid = uuid;
                return this;
            }

            /**
             * The IP address that is assigned to the Elastic Compute Service (ECS) instance.
             */
            public Builder vpcInstanceId(String vpcInstanceId) {
                this.vpcInstanceId = vpcInstanceId;
                return this;
            }

            public AssetDetail build() {
                return new AssetDetail(this);
            } 

        } 

    }
}
