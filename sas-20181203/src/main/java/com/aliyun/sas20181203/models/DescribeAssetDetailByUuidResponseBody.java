// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

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
         * <p>AssetDetail.</p>
         */
        public Builder assetDetail(AssetDetail assetDetail) {
            this.assetDetail = assetDetail;
            return this;
        }

        /**
         * <p>RequestId.</p>
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
             * <p>AssetType.</p>
             */
            public Builder assetType(String assetType) {
                this.assetType = assetType;
                return this;
            }

            /**
             * <p>AuthModifyTime.</p>
             */
            public Builder authModifyTime(Long authModifyTime) {
                this.authModifyTime = authModifyTime;
                return this;
            }

            /**
             * <p>AuthVersion.</p>
             */
            public Builder authVersion(Integer authVersion) {
                this.authVersion = authVersion;
                return this;
            }

            /**
             * <p>Bind.</p>
             */
            public Builder bind(Boolean bind) {
                this.bind = bind;
                return this;
            }

            /**
             * <p>ClientStatus.</p>
             */
            public Builder clientStatus(String clientStatus) {
                this.clientStatus = clientStatus;
                return this;
            }

            /**
             * <p>ClientVersion.</p>
             */
            public Builder clientVersion(String clientVersion) {
                this.clientVersion = clientVersion;
                return this;
            }

            /**
             * <p>Cpu.</p>
             */
            public Builder cpu(Integer cpu) {
                this.cpu = cpu;
                return this;
            }

            /**
             * <p>CpuInfo.</p>
             */
            public Builder cpuInfo(String cpuInfo) {
                this.cpuInfo = cpuInfo;
                return this;
            }

            /**
             * <p>CreateTime.</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>DiskInfoList.</p>
             */
            public Builder diskInfoList(java.util.List < String > diskInfoList) {
                this.diskInfoList = diskInfoList;
                return this;
            }

            /**
             * <p>Flag.</p>
             */
            public Builder flag(Integer flag) {
                this.flag = flag;
                return this;
            }

            /**
             * <p>GroupTrace.</p>
             */
            public Builder groupTrace(String groupTrace) {
                this.groupTrace = groupTrace;
                return this;
            }

            /**
             * <p>HostName.</p>
             */
            public Builder hostName(String hostName) {
                this.hostName = hostName;
                return this;
            }

            /**
             * <p>InstanceId.</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>InstanceName.</p>
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * <p>InternetIp.</p>
             */
            public Builder internetIp(String internetIp) {
                this.internetIp = internetIp;
                return this;
            }

            /**
             * <p>IntranetIp.</p>
             */
            public Builder intranetIp(String intranetIp) {
                this.intranetIp = intranetIp;
                return this;
            }

            /**
             * <p>Ip.</p>
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * <p>IpList.</p>
             */
            public Builder ipList(java.util.List < String > ipList) {
                this.ipList = ipList;
                return this;
            }

            /**
             * <p>Kernel.</p>
             */
            public Builder kernel(String kernel) {
                this.kernel = kernel;
                return this;
            }

            /**
             * <p>MacList.</p>
             */
            public Builder macList(java.util.List < String > macList) {
                this.macList = macList;
                return this;
            }

            /**
             * <p>Mem.</p>
             */
            public Builder mem(Integer mem) {
                this.mem = mem;
                return this;
            }

            /**
             * <p>Memory.</p>
             */
            public Builder memory(Long memory) {
                this.memory = memory;
                return this;
            }

            /**
             * <p>Os.</p>
             */
            public Builder os(String os) {
                this.os = os;
                return this;
            }

            /**
             * <p>OsDetail.</p>
             */
            public Builder osDetail(String osDetail) {
                this.osDetail = osDetail;
                return this;
            }

            /**
             * <p>OsName.</p>
             */
            public Builder osName(String osName) {
                this.osName = osName;
                return this;
            }

            /**
             * <p>Region.</p>
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * <p>RegionId.</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>RegionName.</p>
             */
            public Builder regionName(String regionName) {
                this.regionName = regionName;
                return this;
            }

            /**
             * <p>SysInfo.</p>
             */
            public Builder sysInfo(String sysInfo) {
                this.sysInfo = sysInfo;
                return this;
            }

            /**
             * <p>Tag.</p>
             */
            public Builder tag(String tag) {
                this.tag = tag;
                return this;
            }

            /**
             * <p>Uuid.</p>
             */
            public Builder uuid(String uuid) {
                this.uuid = uuid;
                return this;
            }

            /**
             * <p>VpcInstanceId.</p>
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
