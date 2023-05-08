// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetHoneypotProbeResponseBody} extends {@link TeaModel}
 *
 * <p>GetHoneypotProbeResponseBody</p>
 */
public class GetHoneypotProbeResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
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
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
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
         * Success.
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
        @NameInMap("EcsInstanceId")
        private String ecsInstanceId;

        @NameInMap("NodeId")
        private String nodeId;

        @NameInMap("NodeName")
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
             * 实例id
             */
            public Builder ecsInstanceId(String ecsInstanceId) {
                this.ecsInstanceId = ecsInstanceId;
                return this;
            }

            /**
             * 节点id
             */
            public Builder nodeId(String nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * 节点名称
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
        @NameInMap("Id")
        private Long id;

        @NameInMap("Ports")
        private String ports;

        @NameInMap("ProbeId")
        private String probeId;

        @NameInMap("ServiceIpList")
        private java.util.List < String > serviceIpList;

        @NameInMap("Status")
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
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * Ports.
             */
            public Builder ports(String ports) {
                this.ports = ports;
                return this;
            }

            /**
             * ProbeId.
             */
            public Builder probeId(String probeId) {
                this.probeId = probeId;
                return this;
            }

            /**
             * ServiceIpList.
             */
            public Builder serviceIpList(java.util.List < String > serviceIpList) {
                this.serviceIpList = serviceIpList;
                return this;
            }

            /**
             * Status.
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
        @NameInMap("BindPort")
        private Boolean bindPort;

        @NameInMap("EndPort")
        private Integer endPort;

        @NameInMap("Err")
        private String err;

        @NameInMap("Fixed")
        private Boolean fixed;

        @NameInMap("Id")
        private Long id;

        @NameInMap("Msg")
        private String msg;

        @NameInMap("Proto")
        private String proto;

        @NameInMap("StartPort")
        private Integer startPort;

        @NameInMap("Status")
        private Integer status;

        @NameInMap("TargetPort")
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
             * BindPort.
             */
            public Builder bindPort(Boolean bindPort) {
                this.bindPort = bindPort;
                return this;
            }

            /**
             * 探针监听结束端口
             */
            public Builder endPort(Integer endPort) {
                this.endPort = endPort;
                return this;
            }

            /**
             * Err.
             */
            public Builder err(String err) {
                this.err = err;
                return this;
            }

            /**
             * Fixed.
             */
            public Builder fixed(Boolean fixed) {
                this.fixed = fixed;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * Msg.
             */
            public Builder msg(String msg) {
                this.msg = msg;
                return this;
            }

            /**
             * 协议类型
             */
            public Builder proto(String proto) {
                this.proto = proto;
                return this;
            }

            /**
             * 探针监听起始端口
             */
            public Builder startPort(Integer startPort) {
                this.startPort = startPort;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * TargetPort.
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
        @NameInMap("BindId")
        private String bindId;

        @NameInMap("BindPortList")
        private java.util.List < BindPortList> bindPortList;

        @NameInMap("HoneypotId")
        private String honeypotId;

        @NameInMap("ServiceIpList")
        private java.util.List < String > serviceIpList;

        @NameInMap("Status")
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
             * BindId.
             */
            public Builder bindId(String bindId) {
                this.bindId = bindId;
                return this;
            }

            /**
             * BindPortList.
             */
            public Builder bindPortList(java.util.List < BindPortList> bindPortList) {
                this.bindPortList = bindPortList;
                return this;
            }

            /**
             * 蜜罐Id
             */
            public Builder honeypotId(String honeypotId) {
                this.honeypotId = honeypotId;
                return this;
            }

            /**
             * 监听 ip 列表
             */
            public Builder serviceIpList(java.util.List < String > serviceIpList) {
                this.serviceIpList = serviceIpList;
                return this;
            }

            /**
             * 服务状态
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
        @NameInMap("Arp")
        private Boolean arp;

        @NameInMap("CanListenIpList")
        private java.util.List < String > canListenIpList;

        @NameInMap("CidrList")
        private java.util.List < String > cidrList;

        @NameInMap("ControlNode")
        private ControlNode controlNode;

        @NameInMap("CpuLoad")
        private Double cpuLoad;

        @NameInMap("DeployTime")
        private Long deployTime;

        @NameInMap("DisplayName")
        private String displayName;

        @NameInMap("HoneyPotProbeScanPort")
        private HoneyPotProbeScanPort honeyPotProbeScanPort;

        @NameInMap("HoneypotProbeBindList")
        private java.util.List < HoneypotProbeBindList> honeypotProbeBindList;

        @NameInMap("HostIp")
        private String hostIp;

        @NameInMap("ListenIpList")
        private java.util.List < String > listenIpList;

        @NameInMap("MemoryLoad")
        private Double memoryLoad;

        @NameInMap("OsType")
        private String osType;

        @NameInMap("Ping")
        private Boolean ping;

        @NameInMap("ProbeId")
        private String probeId;

        @NameInMap("ProbeType")
        private String probeType;

        @NameInMap("ProbeVersion")
        private String probeVersion;

        @NameInMap("ProxyIp")
        private String proxyIp;

        @NameInMap("Status")
        private Integer status;

        @NameInMap("Uuid")
        private String uuid;

        @NameInMap("VpcId")
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
             * 检查项目 arp
             */
            public Builder arp(Boolean arp) {
                this.arp = arp;
                return this;
            }

            /**
             * CanListenIpList.
             */
            public Builder canListenIpList(java.util.List < String > canListenIpList) {
                this.canListenIpList = canListenIpList;
                return this;
            }

            /**
             * CidrList.
             */
            public Builder cidrList(java.util.List < String > cidrList) {
                this.cidrList = cidrList;
                return this;
            }

            /**
             * 管理节点
             */
            public Builder controlNode(ControlNode controlNode) {
                this.controlNode = controlNode;
                return this;
            }

            /**
             * cpu 占用
             */
            public Builder cpuLoad(Double cpuLoad) {
                this.cpuLoad = cpuLoad;
                return this;
            }

            /**
             * 部署时间
             */
            public Builder deployTime(Long deployTime) {
                this.deployTime = deployTime;
                return this;
            }

            /**
             * 探针名称
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * HoneyPotProbeScanPort.
             */
            public Builder honeyPotProbeScanPort(HoneyPotProbeScanPort honeyPotProbeScanPort) {
                this.honeyPotProbeScanPort = honeyPotProbeScanPort;
                return this;
            }

            /**
             * 服务列表
             */
            public Builder honeypotProbeBindList(java.util.List < HoneypotProbeBindList> honeypotProbeBindList) {
                this.honeypotProbeBindList = honeypotProbeBindList;
                return this;
            }

            /**
             * 探针绑定的本地地址
             */
            public Builder hostIp(String hostIp) {
                this.hostIp = hostIp;
                return this;
            }

            /**
             * 可监听IP
             */
            public Builder listenIpList(java.util.List < String > listenIpList) {
                this.listenIpList = listenIpList;
                return this;
            }

            /**
             * 内存 占用
             */
            public Builder memoryLoad(Double memoryLoad) {
                this.memoryLoad = memoryLoad;
                return this;
            }

            /**
             * 操作系统类型
             */
            public Builder osType(String osType) {
                this.osType = osType;
                return this;
            }

            /**
             * 检查项目 ping
             */
            public Builder ping(Boolean ping) {
                this.ping = ping;
                return this;
            }

            /**
             * 探针id
             */
            public Builder probeId(String probeId) {
                this.probeId = probeId;
                return this;
            }

            /**
             * 探针类型
             */
            public Builder probeType(String probeType) {
                this.probeType = probeType;
                return this;
            }

            /**
             * 探针版本
             */
            public Builder probeVersion(String probeVersion) {
                this.probeVersion = probeVersion;
                return this;
            }

            /**
             * ProxyIp.
             */
            public Builder proxyIp(String proxyIp) {
                this.proxyIp = proxyIp;
                return this;
            }

            /**
             * 探针状态
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * Uuid.
             */
            public Builder uuid(String uuid) {
                this.uuid = uuid;
                return this;
            }

            /**
             * VpcId.
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
