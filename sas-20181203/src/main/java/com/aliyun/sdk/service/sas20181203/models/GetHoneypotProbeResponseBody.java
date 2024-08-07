// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetHoneypotProbeResponseBody} extends {@link TeaModel}
 *
 * <p>GetHoneypotProbeResponseBody</p>
 */
public class GetHoneypotProbeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetHoneypotProbeResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetHoneypotProbeResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
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

    public static final class Builder {
        private String code; 
        private Data data; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * The status code returned. The status code **200** indicates that the request was successful. Other status codes indicate that the request failed. You can identify the cause of the failure based on the status code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The information about the probe.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The HTTP status code returned.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * The message returned.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The ID of the request, which is used to locate and troubleshoot issues.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the request was successful. Valid values:
         * <p>
         * 
         * *   **true**: The request was successful.
         * *   **false**: The request failed.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetHoneypotProbeResponseBody build() {
            return new GetHoneypotProbeResponseBody(this);
        } 

    } 

    public static class ControlNode extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EcsInstanceId")
        private String ecsInstanceId;

        @com.aliyun.core.annotation.NameInMap("NodeId")
        private String nodeId;

        @com.aliyun.core.annotation.NameInMap("NodeName")
        private String nodeName;

        private ControlNode(Builder builder) {
            this.ecsInstanceId = builder.ecsInstanceId;
            this.nodeId = builder.nodeId;
            this.nodeName = builder.nodeName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ControlNode create() {
            return builder().build();
        }

        /**
         * @return ecsInstanceId
         */
        public String getEcsInstanceId() {
            return this.ecsInstanceId;
        }

        /**
         * @return nodeId
         */
        public String getNodeId() {
            return this.nodeId;
        }

        /**
         * @return nodeName
         */
        public String getNodeName() {
            return this.nodeName;
        }

        public static final class Builder {
            private String ecsInstanceId; 
            private String nodeId; 
            private String nodeName; 

            /**
             * The instance ID of the management node.
             */
            public Builder ecsInstanceId(String ecsInstanceId) {
                this.ecsInstanceId = ecsInstanceId;
                return this;
            }

            /**
             * The ID of the management node.
             */
            public Builder nodeId(String nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * The name of the management node.
             */
            public Builder nodeName(String nodeName) {
                this.nodeName = nodeName;
                return this;
            }

            public ControlNode build() {
                return new ControlNode(this);
            } 

        } 

    }
    public static class HoneyPotProbeScanPort extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("Ports")
        private String ports;

        @com.aliyun.core.annotation.NameInMap("ProbeId")
        private String probeId;

        @com.aliyun.core.annotation.NameInMap("ServiceIpList")
        private java.util.List < String > serviceIpList;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        private HoneyPotProbeScanPort(Builder builder) {
            this.id = builder.id;
            this.ports = builder.ports;
            this.probeId = builder.probeId;
            this.serviceIpList = builder.serviceIpList;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HoneyPotProbeScanPort create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return ports
         */
        public String getPorts() {
            return this.ports;
        }

        /**
         * @return probeId
         */
        public String getProbeId() {
            return this.probeId;
        }

        /**
         * @return serviceIpList
         */
        public java.util.List < String > getServiceIpList() {
            return this.serviceIpList;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        public static final class Builder {
            private Long id; 
            private String ports; 
            private String probeId; 
            private java.util.List < String > serviceIpList; 
            private Integer status; 

            /**
             * The unique ID of the service that is monitored.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * The ports that are monitored.
             */
            public Builder ports(String ports) {
                this.ports = ports;
                return this;
            }

            /**
             * The ID of the probe.
             */
            public Builder probeId(String probeId) {
                this.probeId = probeId;
                return this;
            }

            /**
             * The IP addresses that are monitored.
             */
            public Builder serviceIpList(java.util.List < String > serviceIpList) {
                this.serviceIpList = serviceIpList;
                return this;
            }

            /**
             * The monitoring status. Valid values:
             * <p>
             * 
             * *   **1**: abnormal
             * *   **3**: normal
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            public HoneyPotProbeScanPort build() {
                return new HoneyPotProbeScanPort(this);
            } 

        } 

    }
    public static class BindPortList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BindPort")
        private Boolean bindPort;

        @com.aliyun.core.annotation.NameInMap("EndPort")
        private Integer endPort;

        @com.aliyun.core.annotation.NameInMap("Err")
        private String err;

        @com.aliyun.core.annotation.NameInMap("Fixed")
        private Boolean fixed;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("Msg")
        private String msg;

        @com.aliyun.core.annotation.NameInMap("Proto")
        private String proto;

        @com.aliyun.core.annotation.NameInMap("StartPort")
        private Integer startPort;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("TargetPort")
        private Integer targetPort;

        private BindPortList(Builder builder) {
            this.bindPort = builder.bindPort;
            this.endPort = builder.endPort;
            this.err = builder.err;
            this.fixed = builder.fixed;
            this.id = builder.id;
            this.msg = builder.msg;
            this.proto = builder.proto;
            this.startPort = builder.startPort;
            this.status = builder.status;
            this.targetPort = builder.targetPort;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BindPortList create() {
            return builder().build();
        }

        /**
         * @return bindPort
         */
        public Boolean getBindPort() {
            return this.bindPort;
        }

        /**
         * @return endPort
         */
        public Integer getEndPort() {
            return this.endPort;
        }

        /**
         * @return err
         */
        public String getErr() {
            return this.err;
        }

        /**
         * @return fixed
         */
        public Boolean getFixed() {
            return this.fixed;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return msg
         */
        public String getMsg() {
            return this.msg;
        }

        /**
         * @return proto
         */
        public String getProto() {
            return this.proto;
        }

        /**
         * @return startPort
         */
        public Integer getStartPort() {
            return this.startPort;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return targetPort
         */
        public Integer getTargetPort() {
            return this.targetPort;
        }

        public static final class Builder {
            private Boolean bindPort; 
            private Integer endPort; 
            private String err; 
            private Boolean fixed; 
            private Long id; 
            private String msg; 
            private String proto; 
            private Integer startPort; 
            private Integer status; 
            private Integer targetPort; 

            /**
             * Indicates whether the port is bound.
             */
            public Builder bindPort(Boolean bindPort) {
                this.bindPort = bindPort;
                return this;
            }

            /**
             * The end port on which the probe monitors.
             */
            public Builder endPort(Integer endPort) {
                this.endPort = endPort;
                return this;
            }

            /**
             * The error that is returned if an error occurred in the port of the honeypot that is bound to the probe.
             */
            public Builder err(String err) {
                this.err = err;
                return this;
            }

            /**
             * Indicates whether the port is a fixed port.
             */
            public Builder fixed(Boolean fixed) {
                this.fixed = fixed;
                return this;
            }

            /**
             * The unique ID of the port binding record.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * The error message that is returned if an error occurred in the port of the honeypot that is bound to the probe.
             */
            public Builder msg(String msg) {
                this.msg = msg;
                return this;
            }

            /**
             * The type of the protocol.
             */
            public Builder proto(String proto) {
                this.proto = proto;
                return this;
            }

            /**
             * The start port on which the probe monitors.
             */
            public Builder startPort(Integer startPort) {
                this.startPort = startPort;
                return this;
            }

            /**
             * The status of the port of the honeypot that is bound to the probe. Valid values:
             * <p>
             * 
             * *   **1**: abnormal
             * *   **3**: normal
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * The destination port.
             */
            public Builder targetPort(Integer targetPort) {
                this.targetPort = targetPort;
                return this;
            }

            public BindPortList build() {
                return new BindPortList(this);
            } 

        } 

    }
    public static class HoneypotProbeBindList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BindId")
        private String bindId;

        @com.aliyun.core.annotation.NameInMap("BindPortList")
        private java.util.List < BindPortList> bindPortList;

        @com.aliyun.core.annotation.NameInMap("HoneypotId")
        private String honeypotId;

        @com.aliyun.core.annotation.NameInMap("ServiceIpList")
        private java.util.List < String > serviceIpList;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        private HoneypotProbeBindList(Builder builder) {
            this.bindId = builder.bindId;
            this.bindPortList = builder.bindPortList;
            this.honeypotId = builder.honeypotId;
            this.serviceIpList = builder.serviceIpList;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HoneypotProbeBindList create() {
            return builder().build();
        }

        /**
         * @return bindId
         */
        public String getBindId() {
            return this.bindId;
        }

        /**
         * @return bindPortList
         */
        public java.util.List < BindPortList> getBindPortList() {
            return this.bindPortList;
        }

        /**
         * @return honeypotId
         */
        public String getHoneypotId() {
            return this.honeypotId;
        }

        /**
         * @return serviceIpList
         */
        public java.util.List < String > getServiceIpList() {
            return this.serviceIpList;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String bindId; 
            private java.util.List < BindPortList> bindPortList; 
            private String honeypotId; 
            private java.util.List < String > serviceIpList; 
            private Integer status; 

            /**
             * The unique ID of the honeypot that is bound to the probe.
             */
            public Builder bindId(String bindId) {
                this.bindId = bindId;
                return this;
            }

            /**
             * The ports that are bound to the probe.
             */
            public Builder bindPortList(java.util.List < BindPortList> bindPortList) {
                this.bindPortList = bindPortList;
                return this;
            }

            /**
             * The honeypot ID.
             */
            public Builder honeypotId(String honeypotId) {
                this.honeypotId = honeypotId;
                return this;
            }

            /**
             * The IP addresses that are monitored.
             */
            public Builder serviceIpList(java.util.List < String > serviceIpList) {
                this.serviceIpList = serviceIpList;
                return this;
            }

            /**
             * The status of the honeypot that is bound to the probe. Valid values:
             * <p>
             * 
             * *   **1**: abnormal
             * *   **3**: normal
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            public HoneypotProbeBindList build() {
                return new HoneypotProbeBindList(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Arp")
        private Boolean arp;

        @com.aliyun.core.annotation.NameInMap("CanListenIpList")
        private java.util.List < String > canListenIpList;

        @com.aliyun.core.annotation.NameInMap("CidrList")
        private java.util.List < String > cidrList;

        @com.aliyun.core.annotation.NameInMap("ControlNode")
        private ControlNode controlNode;

        @com.aliyun.core.annotation.NameInMap("CpuLoad")
        private Double cpuLoad;

        @com.aliyun.core.annotation.NameInMap("DeployTime")
        private Long deployTime;

        @com.aliyun.core.annotation.NameInMap("DisplayName")
        private String displayName;

        @com.aliyun.core.annotation.NameInMap("HoneyPotProbeScanPort")
        private HoneyPotProbeScanPort honeyPotProbeScanPort;

        @com.aliyun.core.annotation.NameInMap("HoneypotProbeBindList")
        private java.util.List < HoneypotProbeBindList> honeypotProbeBindList;

        @com.aliyun.core.annotation.NameInMap("HostIp")
        private String hostIp;

        @com.aliyun.core.annotation.NameInMap("ListenIpList")
        private java.util.List < String > listenIpList;

        @com.aliyun.core.annotation.NameInMap("MemoryLoad")
        private Double memoryLoad;

        @com.aliyun.core.annotation.NameInMap("OsType")
        private String osType;

        @com.aliyun.core.annotation.NameInMap("Ping")
        private Boolean ping;

        @com.aliyun.core.annotation.NameInMap("ProbeId")
        private String probeId;

        @com.aliyun.core.annotation.NameInMap("ProbeType")
        private String probeType;

        @com.aliyun.core.annotation.NameInMap("ProbeVersion")
        private String probeVersion;

        @com.aliyun.core.annotation.NameInMap("ProxyIp")
        private String proxyIp;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("Uuid")
        private String uuid;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        private Data(Builder builder) {
            this.arp = builder.arp;
            this.canListenIpList = builder.canListenIpList;
            this.cidrList = builder.cidrList;
            this.controlNode = builder.controlNode;
            this.cpuLoad = builder.cpuLoad;
            this.deployTime = builder.deployTime;
            this.displayName = builder.displayName;
            this.honeyPotProbeScanPort = builder.honeyPotProbeScanPort;
            this.honeypotProbeBindList = builder.honeypotProbeBindList;
            this.hostIp = builder.hostIp;
            this.listenIpList = builder.listenIpList;
            this.memoryLoad = builder.memoryLoad;
            this.osType = builder.osType;
            this.ping = builder.ping;
            this.probeId = builder.probeId;
            this.probeType = builder.probeType;
            this.probeVersion = builder.probeVersion;
            this.proxyIp = builder.proxyIp;
            this.status = builder.status;
            this.uuid = builder.uuid;
            this.vpcId = builder.vpcId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return arp
         */
        public Boolean getArp() {
            return this.arp;
        }

        /**
         * @return canListenIpList
         */
        public java.util.List < String > getCanListenIpList() {
            return this.canListenIpList;
        }

        /**
         * @return cidrList
         */
        public java.util.List < String > getCidrList() {
            return this.cidrList;
        }

        /**
         * @return controlNode
         */
        public ControlNode getControlNode() {
            return this.controlNode;
        }

        /**
         * @return cpuLoad
         */
        public Double getCpuLoad() {
            return this.cpuLoad;
        }

        /**
         * @return deployTime
         */
        public Long getDeployTime() {
            return this.deployTime;
        }

        /**
         * @return displayName
         */
        public String getDisplayName() {
            return this.displayName;
        }

        /**
         * @return honeyPotProbeScanPort
         */
        public HoneyPotProbeScanPort getHoneyPotProbeScanPort() {
            return this.honeyPotProbeScanPort;
        }

        /**
         * @return honeypotProbeBindList
         */
        public java.util.List < HoneypotProbeBindList> getHoneypotProbeBindList() {
            return this.honeypotProbeBindList;
        }

        /**
         * @return hostIp
         */
        public String getHostIp() {
            return this.hostIp;
        }

        /**
         * @return listenIpList
         */
        public java.util.List < String > getListenIpList() {
            return this.listenIpList;
        }

        /**
         * @return memoryLoad
         */
        public Double getMemoryLoad() {
            return this.memoryLoad;
        }

        /**
         * @return osType
         */
        public String getOsType() {
            return this.osType;
        }

        /**
         * @return ping
         */
        public Boolean getPing() {
            return this.ping;
        }

        /**
         * @return probeId
         */
        public String getProbeId() {
            return this.probeId;
        }

        /**
         * @return probeType
         */
        public String getProbeType() {
            return this.probeType;
        }

        /**
         * @return probeVersion
         */
        public String getProbeVersion() {
            return this.probeVersion;
        }

        /**
         * @return proxyIp
         */
        public String getProxyIp() {
            return this.proxyIp;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return uuid
         */
        public String getUuid() {
            return this.uuid;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        public static final class Builder {
            private Boolean arp; 
            private java.util.List < String > canListenIpList; 
            private java.util.List < String > cidrList; 
            private ControlNode controlNode; 
            private Double cpuLoad; 
            private Long deployTime; 
            private String displayName; 
            private HoneyPotProbeScanPort honeyPotProbeScanPort; 
            private java.util.List < HoneypotProbeBindList> honeypotProbeBindList; 
            private String hostIp; 
            private java.util.List < String > listenIpList; 
            private Double memoryLoad; 
            private String osType; 
            private Boolean ping; 
            private String probeId; 
            private String probeType; 
            private String probeVersion; 
            private String proxyIp; 
            private Integer status; 
            private String uuid; 
            private String vpcId; 

            /**
             * Indicates whether address resolution protocol (ARP) is enabled for the check type.
             */
            public Builder arp(Boolean arp) {
                this.arp = arp;
                return this;
            }

            /**
             * An array consisting of the IP addresses that can be monitored.
             */
            public Builder canListenIpList(java.util.List < String > canListenIpList) {
                this.canListenIpList = canListenIpList;
                return this;
            }

            /**
             * The CIDR blocks of the probe deployed in a virtual private cloud (VPC).
             */
            public Builder cidrList(java.util.List < String > cidrList) {
                this.cidrList = cidrList;
                return this;
            }

            /**
             * The information about the management node.
             */
            public Builder controlNode(ControlNode controlNode) {
                this.controlNode = controlNode;
                return this;
            }

            /**
             * The CPU utilization.
             */
            public Builder cpuLoad(Double cpuLoad) {
                this.cpuLoad = cpuLoad;
                return this;
            }

            /**
             * The time when the probe was deployed.
             */
            public Builder deployTime(Long deployTime) {
                this.deployTime = deployTime;
                return this;
            }

            /**
             * The name of the probe.
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * The ports that the honeypot monitors.
             */
            public Builder honeyPotProbeScanPort(HoneyPotProbeScanPort honeyPotProbeScanPort) {
                this.honeyPotProbeScanPort = honeyPotProbeScanPort;
                return this;
            }

            /**
             * The honeypots that are bound to the probe.
             */
            public Builder honeypotProbeBindList(java.util.List < HoneypotProbeBindList> honeypotProbeBindList) {
                this.honeypotProbeBindList = honeypotProbeBindList;
                return this;
            }

            /**
             * The IP address of the server on which the probe is deployed.
             */
            public Builder hostIp(String hostIp) {
                this.hostIp = hostIp;
                return this;
            }

            /**
             * An array consisting of the IP addresses that can be monitored.
             */
            public Builder listenIpList(java.util.List < String > listenIpList) {
                this.listenIpList = listenIpList;
                return this;
            }

            /**
             * The memory usage.
             */
            public Builder memoryLoad(Double memoryLoad) {
                this.memoryLoad = memoryLoad;
                return this;
            }

            /**
             * The operating system of the server on which the probe is deployed. Valid values:
             * <p>
             * 
             * *   windows
             * *   linux
             */
            public Builder osType(String osType) {
                this.osType = osType;
                return this;
            }

            /**
             * Indicates whether ping is enabled for the check type.
             */
            public Builder ping(Boolean ping) {
                this.ping = ping;
                return this;
            }

            /**
             * The ID of the probe.
             */
            public Builder probeId(String probeId) {
                this.probeId = probeId;
                return this;
            }

            /**
             * The type of the probe. Valid values:
             * <p>
             * 
             * *   **host_probe**: host probe
             * *   **vpc_black_hole_probe**: virtual private cloud (VPC) probe
             */
            public Builder probeType(String probeType) {
                this.probeType = probeType;
                return this;
            }

            /**
             * The version of the probe.
             */
            public Builder probeVersion(String probeVersion) {
                this.probeVersion = probeVersion;
                return this;
            }

            /**
             * The IP address of the proxy server.
             */
            public Builder proxyIp(String proxyIp) {
                this.proxyIp = proxyIp;
                return this;
            }

            /**
             * The status of the probe. Valid values:
             * <p>
             * 
             * *   **installed**: installed
             * *   **install_failed**: installation failed
             * *   **online**: online
             * *   **offline**: offline
             * *   **unnormal**: abnormal
             * *   **unprobe**: unauthorized
             * *   **uninstalling**: being uninstalled
             * *   **uninstalled**: uninstalled
             * *   **uninstall_failed**: uninstallation failed
             * *   **not_exist**: not installed
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * The UUID of the asset on which the host probe is deployed.
             */
            public Builder uuid(String uuid) {
                this.uuid = uuid;
                return this;
            }

            /**
             * The ID of the VPC in which the probe is deployed.
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
