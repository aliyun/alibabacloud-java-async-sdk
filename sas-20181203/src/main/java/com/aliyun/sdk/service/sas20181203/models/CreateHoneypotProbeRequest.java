// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateHoneypotProbeRequest} extends {@link RequestModel}
 *
 * <p>CreateHoneypotProbeRequest</p>
 */
public class CreateHoneypotProbeRequest extends Request {
    @Query
    @NameInMap("Arp")
    private Boolean arp;

    @Query
    @NameInMap("BusinessGroupId")
    private String businessGroupId;

    @Query
    @NameInMap("ControlNodeId")
    @Validation(required = true)
    private String controlNodeId;

    @Query
    @NameInMap("DisplayName")
    @Validation(required = true)
    private String displayName;

    @Query
    @NameInMap("HoneypotBindList")
    private java.util.List < HoneypotBindList> honeypotBindList;

    @Query
    @NameInMap("Ping")
    private Boolean ping;

    @Query
    @NameInMap("ProbeType")
    @Validation(required = true)
    private String probeType;

    @Query
    @NameInMap("ProbeVersion")
    private String probeVersion;

    @Query
    @NameInMap("ProxyIp")
    private String proxyIp;

    @Query
    @NameInMap("Uuid")
    private String uuid;

    @Query
    @NameInMap("VpcId")
    private String vpcId;

    private CreateHoneypotProbeRequest(Builder builder) {
        super(builder);
        this.arp = builder.arp;
        this.businessGroupId = builder.businessGroupId;
        this.controlNodeId = builder.controlNodeId;
        this.displayName = builder.displayName;
        this.honeypotBindList = builder.honeypotBindList;
        this.ping = builder.ping;
        this.probeType = builder.probeType;
        this.probeVersion = builder.probeVersion;
        this.proxyIp = builder.proxyIp;
        this.uuid = builder.uuid;
        this.vpcId = builder.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateHoneypotProbeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return arp
     */
    public Boolean getArp() {
        return this.arp;
    }

    /**
     * @return businessGroupId
     */
    public String getBusinessGroupId() {
        return this.businessGroupId;
    }

    /**
     * @return controlNodeId
     */
    public String getControlNodeId() {
        return this.controlNodeId;
    }

    /**
     * @return displayName
     */
    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * @return honeypotBindList
     */
    public java.util.List < HoneypotBindList> getHoneypotBindList() {
        return this.honeypotBindList;
    }

    /**
     * @return ping
     */
    public Boolean getPing() {
        return this.ping;
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

    public static final class Builder extends Request.Builder<CreateHoneypotProbeRequest, Builder> {
        private Boolean arp; 
        private String businessGroupId; 
        private String controlNodeId; 
        private String displayName; 
        private java.util.List < HoneypotBindList> honeypotBindList; 
        private Boolean ping; 
        private String probeType; 
        private String probeVersion; 
        private String proxyIp; 
        private String uuid; 
        private String vpcId; 

        private Builder() {
            super();
        } 

        private Builder(CreateHoneypotProbeRequest request) {
            super(request);
            this.arp = request.arp;
            this.businessGroupId = request.businessGroupId;
            this.controlNodeId = request.controlNodeId;
            this.displayName = request.displayName;
            this.honeypotBindList = request.honeypotBindList;
            this.ping = request.ping;
            this.probeType = request.probeType;
            this.probeVersion = request.probeVersion;
            this.proxyIp = request.proxyIp;
            this.uuid = request.uuid;
            this.vpcId = request.vpcId;
        } 

        /**
         * Specifies whether to enable Address Resolution Protocol (ARP) spoofing. Valid values:
         * <p>
         * 
         * *   **true**: yes
         * *   **false**: no
         */
        public Builder arp(Boolean arp) {
            this.putQueryParameter("Arp", arp);
            this.arp = arp;
            return this;
        }

        /**
         * The ID of the business group.
         */
        public Builder businessGroupId(String businessGroupId) {
            this.putQueryParameter("BusinessGroupId", businessGroupId);
            this.businessGroupId = businessGroupId;
            return this;
        }

        /**
         * The ID of the management node.
         * <p>
         * 
         * > You can call the [ListHoneypotNode](~~ListHoneypotNode~~) operation to query the IDs of management nodes.
         */
        public Builder controlNodeId(String controlNodeId) {
            this.putQueryParameter("ControlNodeId", controlNodeId);
            this.controlNodeId = controlNodeId;
            return this;
        }

        /**
         * The name of the probe.
         */
        public Builder displayName(String displayName) {
            this.putQueryParameter("DisplayName", displayName);
            this.displayName = displayName;
            return this;
        }

        /**
         * The configuration of the probe.
         */
        public Builder honeypotBindList(java.util.List < HoneypotBindList> honeypotBindList) {
            this.putQueryParameter("HoneypotBindList", honeypotBindList);
            this.honeypotBindList = honeypotBindList;
            return this;
        }

        /**
         * Specifies whether to enable ping scan. Valid values:
         * <p>
         * 
         * *   **true**: yes
         * *   **false**: no
         */
        public Builder ping(Boolean ping) {
            this.putQueryParameter("Ping", ping);
            this.ping = ping;
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
            this.putQueryParameter("ProbeType", probeType);
            this.probeType = probeType;
            return this;
        }

        /**
         * The version of the probe.
         */
        public Builder probeVersion(String probeVersion) {
            this.putQueryParameter("ProbeVersion", probeVersion);
            this.probeVersion = probeVersion;
            return this;
        }

        /**
         * The IP address of the proxy.
         */
        public Builder proxyIp(String proxyIp) {
            this.putQueryParameter("ProxyIp", proxyIp);
            this.proxyIp = proxyIp;
            return this;
        }

        /**
         * The UUID of the instance.
         * <p>
         * 
         * > If **ProbeType** is set to **host_probe**, this parameter is required.
         */
        public Builder uuid(String uuid) {
            this.putQueryParameter("Uuid", uuid);
            this.uuid = uuid;
            return this;
        }

        /**
         * The ID of the VPC.
         * <p>
         * 
         * > If **ProbeType** is set to **vpc_black_hole_probe**, this parameter is required. You can call the [DescribeVpcHoneyPotList](~~DescribeVpcHoneyPotList~~) operation to query the IDs of VPCs.
         */
        public Builder vpcId(String vpcId) {
            this.putQueryParameter("VpcId", vpcId);
            this.vpcId = vpcId;
            return this;
        }

        @Override
        public CreateHoneypotProbeRequest build() {
            return new CreateHoneypotProbeRequest(this);
        } 

    } 

    public static class BindPortList extends TeaModel {
        @NameInMap("BindPort")
        private Boolean bindPort;

        @NameInMap("EndPort")
        private Integer endPort;

        @NameInMap("Fixed")
        private Boolean fixed;

        @NameInMap("StartPort")
        private Integer startPort;

        @NameInMap("TargetPort")
        private Integer targetPort;

        private BindPortList(Builder builder) {
            this.bindPort = builder.bindPort;
            this.endPort = builder.endPort;
            this.fixed = builder.fixed;
            this.startPort = builder.startPort;
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
         * @return fixed
         */
        public Boolean getFixed() {
            return this.fixed;
        }

        /**
         * @return startPort
         */
        public Integer getStartPort() {
            return this.startPort;
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
            private Boolean fixed; 
            private Integer startPort; 
            private Integer targetPort; 

            /**
             * Specifies whether to bind a port. Valid values:
             * <p>
             * 
             * *   **true**: yes
             * *   **false**: no
             */
            public Builder bindPort(Boolean bindPort) {
                this.bindPort = bindPort;
                return this;
            }

            /**
             * The end of the port range.
             */
            public Builder endPort(Integer endPort) {
                this.endPort = endPort;
                return this;
            }

            /**
             * Specifies whether the port is a fixed port. Valid values:
             * <p>
             * 
             * *   **0**: no
             * *   **1**: yes
             */
            public Builder fixed(Boolean fixed) {
                this.fixed = fixed;
                return this;
            }

            /**
             * The start of the port range.
             */
            public Builder startPort(Integer startPort) {
                this.startPort = startPort;
                return this;
            }

            /**
             * The destination port.
             * <p>
             * 
             * > If **HoneypotId** is specified, this parameter is required.
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
    public static class HoneypotBindList extends TeaModel {
        @NameInMap("BindPortList")
        private java.util.List < BindPortList> bindPortList;

        @NameInMap("HoneypotId")
        private String honeypotId;

        private HoneypotBindList(Builder builder) {
            this.bindPortList = builder.bindPortList;
            this.honeypotId = builder.honeypotId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HoneypotBindList create() {
            return builder().build();
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

        public static final class Builder {
            private java.util.List < BindPortList> bindPortList; 
            private String honeypotId; 

            /**
             * The listener ports.
             */
            public Builder bindPortList(java.util.List < BindPortList> bindPortList) {
                this.bindPortList = bindPortList;
                return this;
            }

            /**
             * The ID of the honeypot.
             * <p>
             * 
             * > You can call the [ListHoneypot](~~ListHoneypot~~) operation to query the IDs of honeypots.
             */
            public Builder honeypotId(String honeypotId) {
                this.honeypotId = honeypotId;
                return this;
            }

            public HoneypotBindList build() {
                return new HoneypotBindList(this);
            } 

        } 

    }
}
