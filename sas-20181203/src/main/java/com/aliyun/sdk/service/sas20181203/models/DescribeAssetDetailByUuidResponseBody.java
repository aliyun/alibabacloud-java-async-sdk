// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeAssetDetailByUuidResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAssetDetailByUuidResponseBody</p>
 */
public class DescribeAssetDetailByUuidResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AssetDetail")
    private AssetDetail assetDetail;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * <p>The asset details.</p>
         */
        public Builder assetDetail(AssetDetail assetDetail) {
            this.assetDetail = assetDetail;
            return this;
        }

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>39031E31-6BBA-5C99-A870-D807E78918CD</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeAssetDetailByUuidResponseBody build() {
            return new DescribeAssetDetailByUuidResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeAssetDetailByUuidResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAssetDetailByUuidResponseBody</p>
     */
    public static class AssetDetail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AssetType")
        private String assetType;

        @com.aliyun.core.annotation.NameInMap("AuthModifyTime")
        private Long authModifyTime;

        @com.aliyun.core.annotation.NameInMap("AuthVersion")
        private Integer authVersion;

        @com.aliyun.core.annotation.NameInMap("Bind")
        private Boolean bind;

        @com.aliyun.core.annotation.NameInMap("ClientStatus")
        private String clientStatus;

        @com.aliyun.core.annotation.NameInMap("ClientVersion")
        private String clientVersion;

        @com.aliyun.core.annotation.NameInMap("Cpu")
        private Integer cpu;

        @com.aliyun.core.annotation.NameInMap("CpuInfo")
        private String cpuInfo;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("DiskInfoList")
        private java.util.List < String > diskInfoList;

        @com.aliyun.core.annotation.NameInMap("Flag")
        private Integer flag;

        @com.aliyun.core.annotation.NameInMap("GroupTrace")
        private String groupTrace;

        @com.aliyun.core.annotation.NameInMap("HostName")
        private String hostName;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("InstanceName")
        private String instanceName;

        @com.aliyun.core.annotation.NameInMap("InternetIp")
        private String internetIp;

        @com.aliyun.core.annotation.NameInMap("IntranetIp")
        private String intranetIp;

        @com.aliyun.core.annotation.NameInMap("Ip")
        private String ip;

        @com.aliyun.core.annotation.NameInMap("IpList")
        private java.util.List < String > ipList;

        @com.aliyun.core.annotation.NameInMap("Kernel")
        private String kernel;

        @com.aliyun.core.annotation.NameInMap("MacList")
        private java.util.List < String > macList;

        @com.aliyun.core.annotation.NameInMap("Mem")
        private Integer mem;

        @com.aliyun.core.annotation.NameInMap("Memory")
        private Long memory;

        @com.aliyun.core.annotation.NameInMap("Os")
        private String os;

        @com.aliyun.core.annotation.NameInMap("OsDetail")
        private String osDetail;

        @com.aliyun.core.annotation.NameInMap("OsName")
        private String osName;

        @com.aliyun.core.annotation.NameInMap("Region")
        private String region;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("RegionName")
        private String regionName;

        @com.aliyun.core.annotation.NameInMap("SysInfo")
        private String sysInfo;

        @com.aliyun.core.annotation.NameInMap("Tag")
        private String tag;

        @com.aliyun.core.annotation.NameInMap("Uuid")
        private String uuid;

        @com.aliyun.core.annotation.NameInMap("VpcInstanceId")
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
             * <p>The type of the asset. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: ECS instance</li>
             * <li><strong>1</strong>: Server Load Balancer (SLB) instance</li>
             * <li><strong>2</strong>: NAT gateway</li>
             * <li><strong>3</strong>: ApsaraDB RDS database</li>
             * <li><strong>4</strong>: ApsaraDB for MongoDB database</li>
             * <li><strong>5</strong>: ApsaraDB for Redis database</li>
             * <li><strong>6</strong>: image</li>
             * <li><strong>7</strong>: container</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder assetType(String assetType) {
                this.assetType = assetType;
                return this;
            }

            /**
             * <p>The timestamp when Security Center is authorized to protect the asset. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1627974044000</p>
             */
            public Builder authModifyTime(Long authModifyTime) {
                this.authModifyTime = authModifyTime;
                return this;
            }

            /**
             * <p>The edition of Security Center that is authorized to protect the asset. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: Basic edition (Unauthorized)</li>
             * <li><strong>6</strong>: Anti-virus edition</li>
             * <li><strong>5</strong>: Advanced edition</li>
             * <li><strong>3</strong>: Enterprise edition</li>
             * <li><strong>7</strong>: Ultimate edition</li>
             * <li><strong>10</strong>: Value-added Plan edition</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>7</p>
             */
            public Builder authVersion(Integer authVersion) {
                this.authVersion = authVersion;
                return this;
            }

            /**
             * <p>Indicates whether Security Center is authorized to protect the asset. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: yes</li>
             * <li><strong>false</strong>: no</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder bind(Boolean bind) {
                this.bind = bind;
                return this;
            }

            /**
             * <p>The status of the Security Center agent. Valid values:</p>
             * <ul>
             * <li><strong>pause</strong>: The Security Center agent suspends protection for your server.</li>
             * <li><strong>online</strong>: The Security Center agent is protecting your server.</li>
             * <li><strong>offline</strong>: The Security Center agent does not protect your server.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>online</p>
             */
            public Builder clientStatus(String clientStatus) {
                this.clientStatus = clientStatus;
                return this;
            }

            /**
             * <p>The version of the Security Center agent.</p>
             * 
             * <strong>example:</strong>
             * <p>2.0.0</p>
             */
            public Builder clientVersion(String clientVersion) {
                this.clientVersion = clientVersion;
                return this;
            }

            /**
             * <p>The number of CPU cores.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder cpu(Integer cpu) {
                this.cpu = cpu;
                return this;
            }

            /**
             * <p>The details of the CPU.</p>
             * 
             * <strong>example:</strong>
             * <p>Intel(R) Xeon(R) Platinum 8163 CPU @ 2.50GHz</p>
             */
            public Builder cpuInfo(String cpuInfo) {
                this.cpuInfo = cpuInfo;
                return this;
            }

            /**
             * <p>The timestamp when Security Center records the details of the server. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1603863599000</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>An array that consists of the information about the disk.</p>
             */
            public Builder diskInfoList(java.util.List < String > diskInfoList) {
                this.diskInfoList = diskInfoList;
                return this;
            }

            /**
             * <p>Indicates whether the asset is provided by Alibaba Cloud. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: yes</li>
             * <li><strong>1</strong>: no</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder flag(Integer flag) {
                this.flag = flag;
                return this;
            }

            /**
             * <p>The group to which the server belongs. By default, the servers that are not grouped belong to the <strong>Default</strong> group.</p>
             * 
             * <strong>example:</strong>
             * <p>default</p>
             */
            public Builder groupTrace(String groupTrace) {
                this.groupTrace = groupTrace;
                return this;
            }

            /**
             * <p>The name of the host.</p>
             * 
             * <strong>example:</strong>
             * <p>qewrqwerqs****</p>
             */
            public Builder hostName(String hostName) {
                this.hostName = hostName;
                return this;
            }

            /**
             * <p>The ID of the server.</p>
             * 
             * <strong>example:</strong>
             * <p>i-uf6h7p2fgk6rkk0g****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The name of the server.</p>
             * 
             * <strong>example:</strong>
             * <p>i-fasdfasdfadfafa****</p>
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * <p>The public IP address of the server.</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.XX.XX</p>
             */
            public Builder internetIp(String internetIp) {
                this.internetIp = internetIp;
                return this;
            }

            /**
             * <p>The private IP address of the server.</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.XX.XX</p>
             */
            public Builder intranetIp(String intranetIp) {
                this.intranetIp = intranetIp;
                return this;
            }

            /**
             * <p>The IP address that is assigned to the Elastic Compute Service (ECS) instance.</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.XX.XX</p>
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * <p>The IP addresses of the server.</p>
             */
            public Builder ipList(java.util.List < String > ipList) {
                this.ipList = ipList;
                return this;
            }

            /**
             * <p>The kernel version of the operating system.</p>
             * 
             * <strong>example:</strong>
             * <p>4.18.0-80.11.2.el8_0.x86_64</p>
             */
            public Builder kernel(String kernel) {
                this.kernel = kernel;
                return this;
            }

            /**
             * <p>The Media Access Control (MAC) addresses.</p>
             */
            public Builder macList(java.util.List < String > macList) {
                this.macList = macList;
                return this;
            }

            /**
             * <p>The memory size of the server. Unit: GB.</p>
             * 
             * <strong>example:</strong>
             * <p>32</p>
             */
            public Builder mem(Integer mem) {
                this.mem = mem;
                return this;
            }

            /**
             * <p>The memory size of the server. Unit: MB.</p>
             * 
             * <strong>example:</strong>
             * <p>512</p>
             */
            public Builder memory(Long memory) {
                this.memory = memory;
                return this;
            }

            /**
             * <p>The operating system type of the server.</p>
             * 
             * <strong>example:</strong>
             * <p>linux</p>
             */
            public Builder os(String os) {
                this.os = os;
                return this;
            }

            /**
             * <p>The operating system version of the server.</p>
             * 
             * <strong>example:</strong>
             * <p>Linux 64bit</p>
             */
            public Builder osDetail(String osDetail) {
                this.osDetail = osDetail;
                return this;
            }

            /**
             * <p>The name of the operating system.</p>
             * 
             * <strong>example:</strong>
             * <ul>
             * <li></li>
             * </ul>
             */
            public Builder osName(String osName) {
                this.osName = osName;
                return this;
            }

            /**
             * <p>The region in which the server resides.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou-dg-a01</p>
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * <p>The ID of the region in which the asset resides.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hanghzou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The name of the region in which the server resides.</p>
             * 
             * <strong>example:</strong>
             * <p>China (Hohhot)</p>
             */
            public Builder regionName(String regionName) {
                this.regionName = regionName;
                return this;
            }

            /**
             * <p>The operating system information about the server.</p>
             * 
             * <strong>example:</strong>
             * <p>CentOS Linux 8.0.1905</p>
             */
            public Builder sysInfo(String sysInfo) {
                this.sysInfo = sysInfo;
                return this;
            }

            /**
             * <p>The tag that is added to the server.</p>
             * 
             * <strong>example:</strong>
             * <p>InternetIp</p>
             */
            public Builder tag(String tag) {
                this.tag = tag;
                return this;
            }

            /**
             * <p>The UUID of the server.</p>
             * 
             * <strong>example:</strong>
             * <p>9e6cad93-a379-46fd-a701-9bbf02f4****</p>
             */
            public Builder uuid(String uuid) {
                this.uuid = uuid;
                return this;
            }

            /**
             * <p>The ID of the virtual private cloud (VPC) in which the server resides.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-bp1fs3bwonlfq503w****</p>
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
