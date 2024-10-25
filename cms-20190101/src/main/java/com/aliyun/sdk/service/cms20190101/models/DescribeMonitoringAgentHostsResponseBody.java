// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeMonitoringAgentHostsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeMonitoringAgentHostsResponseBody</p>
 */
public class DescribeMonitoringAgentHostsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Hosts")
    private Hosts hosts;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("PageTotal")
    private Integer pageTotal;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("Total")
    private Integer total;

    private DescribeMonitoringAgentHostsResponseBody(Builder builder) {
        this.code = builder.code;
        this.hosts = builder.hosts;
        this.message = builder.message;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.pageTotal = builder.pageTotal;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeMonitoringAgentHostsResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return hosts
     */
    public Hosts getHosts() {
        return this.hosts;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
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
     * @return pageTotal
     */
    public Integer getPageTotal() {
        return this.pageTotal;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return total
     */
    public Integer getTotal() {
        return this.total;
    }

    public static final class Builder {
        private String code; 
        private Hosts hosts; 
        private String message; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private Integer pageTotal; 
        private String requestId; 
        private Boolean success; 
        private Integer total; 

        /**
         * <p>The HTTP status code.</p>
         * <blockquote>
         * <p>The status code 200 indicates that the call is successful.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The information about the hosts.</p>
         */
        public Builder hosts(Hosts hosts) {
            this.hosts = hosts;
            return this;
        }

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>The Request is not authorization.</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The page number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The total number of returned pages.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        public Builder pageTotal(Integer pageTotal) {
            this.pageTotal = pageTotal;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>63EEBB2A-9E51-41E4-9E83-5DE7F3B292E0</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the call is successful. Valid values:</p>
         * <ul>
         * <li>true: The call is successful.</li>
         * <li>false: The call fails.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>The total number of returned entries.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        public DescribeMonitoringAgentHostsResponseBody build() {
            return new DescribeMonitoringAgentHostsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeMonitoringAgentHostsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeMonitoringAgentHostsResponseBody</p>
     */
    public static class HostsHost extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AgentVersion")
        private String agentVersion;

        @com.aliyun.core.annotation.NameInMap("AliUid")
        private Long aliUid;

        @com.aliyun.core.annotation.NameInMap("EipAddress")
        private String eipAddress;

        @com.aliyun.core.annotation.NameInMap("EipId")
        private String eipId;

        @com.aliyun.core.annotation.NameInMap("HostName")
        private String hostName;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("InstanceTypeFamily")
        private String instanceTypeFamily;

        @com.aliyun.core.annotation.NameInMap("IpGroup")
        private String ipGroup;

        @com.aliyun.core.annotation.NameInMap("NatIp")
        private String natIp;

        @com.aliyun.core.annotation.NameInMap("NetworkType")
        private String networkType;

        @com.aliyun.core.annotation.NameInMap("OperatingSystem")
        private String operatingSystem;

        @com.aliyun.core.annotation.NameInMap("Region")
        private String region;

        @com.aliyun.core.annotation.NameInMap("SerialNumber")
        private String serialNumber;

        @com.aliyun.core.annotation.NameInMap("isAliyunHost")
        private Boolean isAliyunHost;

        private HostsHost(Builder builder) {
            this.agentVersion = builder.agentVersion;
            this.aliUid = builder.aliUid;
            this.eipAddress = builder.eipAddress;
            this.eipId = builder.eipId;
            this.hostName = builder.hostName;
            this.instanceId = builder.instanceId;
            this.instanceTypeFamily = builder.instanceTypeFamily;
            this.ipGroup = builder.ipGroup;
            this.natIp = builder.natIp;
            this.networkType = builder.networkType;
            this.operatingSystem = builder.operatingSystem;
            this.region = builder.region;
            this.serialNumber = builder.serialNumber;
            this.isAliyunHost = builder.isAliyunHost;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HostsHost create() {
            return builder().build();
        }

        /**
         * @return agentVersion
         */
        public String getAgentVersion() {
            return this.agentVersion;
        }

        /**
         * @return aliUid
         */
        public Long getAliUid() {
            return this.aliUid;
        }

        /**
         * @return eipAddress
         */
        public String getEipAddress() {
            return this.eipAddress;
        }

        /**
         * @return eipId
         */
        public String getEipId() {
            return this.eipId;
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
         * @return instanceTypeFamily
         */
        public String getInstanceTypeFamily() {
            return this.instanceTypeFamily;
        }

        /**
         * @return ipGroup
         */
        public String getIpGroup() {
            return this.ipGroup;
        }

        /**
         * @return natIp
         */
        public String getNatIp() {
            return this.natIp;
        }

        /**
         * @return networkType
         */
        public String getNetworkType() {
            return this.networkType;
        }

        /**
         * @return operatingSystem
         */
        public String getOperatingSystem() {
            return this.operatingSystem;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        /**
         * @return serialNumber
         */
        public String getSerialNumber() {
            return this.serialNumber;
        }

        /**
         * @return isAliyunHost
         */
        public Boolean getIsAliyunHost() {
            return this.isAliyunHost;
        }

        public static final class Builder {
            private String agentVersion; 
            private Long aliUid; 
            private String eipAddress; 
            private String eipId; 
            private String hostName; 
            private String instanceId; 
            private String instanceTypeFamily; 
            private String ipGroup; 
            private String natIp; 
            private String networkType; 
            private String operatingSystem; 
            private String region; 
            private String serialNumber; 
            private Boolean isAliyunHost; 

            /**
             * <p>The version of the CloudMonitor agent.</p>
             * 
             * <strong>example:</strong>
             * <p>3.4.6</p>
             */
            public Builder agentVersion(String agentVersion) {
                this.agentVersion = agentVersion;
                return this;
            }

            /**
             * <p>The ID of the Alibaba Cloud account.</p>
             * 
             * <strong>example:</strong>
             * <p>103201326074****</p>
             */
            public Builder aliUid(Long aliUid) {
                this.aliUid = aliUid;
                return this;
            }

            /**
             * <p>The elastic IP address (EIP) of the host.</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.XX.XX</p>
             */
            public Builder eipAddress(String eipAddress) {
                this.eipAddress = eipAddress;
                return this;
            }

            /**
             * <p>The ID of the EIP.</p>
             * 
             * <strong>example:</strong>
             * <p>eip-bp16i16k9gcezyfrp****</p>
             */
            public Builder eipId(String eipId) {
                this.eipId = eipId;
                return this;
            }

            /**
             * <p>The name of the host.</p>
             * 
             * <strong>example:</strong>
             * <p>hostIP</p>
             */
            public Builder hostName(String hostName) {
                this.hostName = hostName;
                return this;
            }

            /**
             * <p>The ID of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>i-a2d5q7pm3f9yr212****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The type of the ECS instance.</p>
             * 
             * <strong>example:</strong>
             * <p>ecs.n4</p>
             */
            public Builder instanceTypeFamily(String instanceTypeFamily) {
                this.instanceTypeFamily = instanceTypeFamily;
                return this;
            }

            /**
             * <p>The IP address of the host.</p>
             * <blockquote>
             * <p>Multiple IP addresses are separated with commas (,).</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>192.168.XX.XX</p>
             */
            public Builder ipGroup(String ipGroup) {
                this.ipGroup = ipGroup;
                return this;
            }

            /**
             * <p>The IP address of the Network Address Translation (NAT) gateway.</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.XX.XX</p>
             */
            public Builder natIp(String natIp) {
                this.natIp = natIp;
                return this;
            }

            /**
             * <p>The network type.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc</p>
             */
            public Builder networkType(String networkType) {
                this.networkType = networkType;
                return this;
            }

            /**
             * <p>The operating system.</p>
             * 
             * <strong>example:</strong>
             * <p>Linux</p>
             */
            public Builder operatingSystem(String operatingSystem) {
                this.operatingSystem = operatingSystem;
                return this;
            }

            /**
             * <p>The ID of the region.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * <p>The serial number of the host. A host that is not provided by Alibaba Cloud has a serial number instead of an instance ID.</p>
             * <blockquote>
             * <p>This parameter can be used to accurately search for a monitored host.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>x12335-6cc8-4a22-9f21-1a00a719****</p>
             */
            public Builder serialNumber(String serialNumber) {
                this.serialNumber = serialNumber;
                return this;
            }

            /**
             * <p>Indicates whether the host is provided by Alibaba Cloud. Valid values:</p>
             * <ul>
             * <li>true: The host is provided by Alibaba Cloud.</li>
             * <li>false: The host is not provided by Alibaba Cloud.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder isAliyunHost(Boolean isAliyunHost) {
                this.isAliyunHost = isAliyunHost;
                return this;
            }

            public HostsHost build() {
                return new HostsHost(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeMonitoringAgentHostsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeMonitoringAgentHostsResponseBody</p>
     */
    public static class Hosts extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Host")
        private java.util.List < HostsHost> host;

        private Hosts(Builder builder) {
            this.host = builder.host;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Hosts create() {
            return builder().build();
        }

        /**
         * @return host
         */
        public java.util.List < HostsHost> getHost() {
            return this.host;
        }

        public static final class Builder {
            private java.util.List < HostsHost> host; 

            /**
             * Host.
             */
            public Builder host(java.util.List < HostsHost> host) {
                this.host = host;
                return this;
            }

            public Hosts build() {
                return new Hosts(this);
            } 

        } 

    }
}
