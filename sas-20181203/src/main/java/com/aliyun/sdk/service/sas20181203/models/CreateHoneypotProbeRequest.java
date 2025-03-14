// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link CreateHoneypotProbeRequest} extends {@link RequestModel}
 *
 * <p>CreateHoneypotProbeRequest</p>
 */
public class CreateHoneypotProbeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Arp")
    private Boolean arp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BusinessGroupId")
    private String businessGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ControlNodeId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String controlNodeId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DisplayName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String displayName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HoneypotBindList")
    private java.util.List<HoneypotBindList> honeypotBindList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Ping")
    private Boolean ping;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProbeType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String probeType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProbeVersion")
    private String probeVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProxyIp")
    private String proxyIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Uuid")
    private String uuid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VpcId")
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
    public java.util.List<HoneypotBindList> getHoneypotBindList() {
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
        private java.util.List<HoneypotBindList> honeypotBindList; 
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
         * <p>Specifies whether to enable Address Resolution Protocol (ARP) spoofing. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: yes</li>
         * <li><strong>false</strong>: no</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder arp(Boolean arp) {
            this.putQueryParameter("Arp", arp);
            this.arp = arp;
            return this;
        }

        /**
         * <p>The ID of the business group.</p>
         * 
         * <strong>example:</strong>
         * <p>2022011817324588686</p>
         */
        public Builder businessGroupId(String businessGroupId) {
            this.putQueryParameter("BusinessGroupId", businessGroupId);
            this.businessGroupId = businessGroupId;
            return this;
        }

        /**
         * <p>The ID of the management node.</p>
         * <blockquote>
         * <p>You can call the <a href="~~ListHoneypotNode~~">ListHoneypotNode</a> operation to query the IDs of management nodes.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>a882e590-b87b-45a6-87b9-d0a3e5a0****</p>
         */
        public Builder controlNodeId(String controlNodeId) {
            this.putQueryParameter("ControlNodeId", controlNodeId);
            this.controlNodeId = controlNodeId;
            return this;
        }

        /**
         * <p>The name of the probe.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>testHoneyPotProbe</p>
         */
        public Builder displayName(String displayName) {
            this.putQueryParameter("DisplayName", displayName);
            this.displayName = displayName;
            return this;
        }

        /**
         * <p>The configuration of the probe.</p>
         */
        public Builder honeypotBindList(java.util.List<HoneypotBindList> honeypotBindList) {
            this.putQueryParameter("HoneypotBindList", honeypotBindList);
            this.honeypotBindList = honeypotBindList;
            return this;
        }

        /**
         * <p>Specifies whether to enable ping scan. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: yes</li>
         * <li><strong>false</strong>: no</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder ping(Boolean ping) {
            this.putQueryParameter("Ping", ping);
            this.ping = ping;
            return this;
        }

        /**
         * <p>The type of the probe. Valid values:</p>
         * <ul>
         * <li><strong>host_probe</strong>: host probe</li>
         * <li><strong>vpc_black_hole_probe</strong>: virtual private cloud (VPC) probe</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>host_probe</p>
         */
        public Builder probeType(String probeType) {
            this.putQueryParameter("ProbeType", probeType);
            this.probeType = probeType;
            return this;
        }

        /**
         * <p>The version of the probe.</p>
         * 
         * <strong>example:</strong>
         * <p>0.0.0</p>
         */
        public Builder probeVersion(String probeVersion) {
            this.putQueryParameter("ProbeVersion", probeVersion);
            this.probeVersion = probeVersion;
            return this;
        }

        /**
         * <p>The IP address of the proxy.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.XX.XX</p>
         */
        public Builder proxyIp(String proxyIp) {
            this.putQueryParameter("ProxyIp", proxyIp);
            this.proxyIp = proxyIp;
            return this;
        }

        /**
         * <p>The UUID of the instance.</p>
         * <blockquote>
         * <p>If <strong>ProbeType</strong> is set to <strong>host_probe</strong>, this parameter is required.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>e4af3620-6895-4e2f-a641-a9d8fb53****</p>
         */
        public Builder uuid(String uuid) {
            this.putQueryParameter("Uuid", uuid);
            this.uuid = uuid;
            return this;
        }

        /**
         * <p>The ID of the VPC.</p>
         * <blockquote>
         * <p>If <strong>ProbeType</strong> is set to <strong>vpc_black_hole_probe</strong>, this parameter is required. You can call the <a href="~~DescribeVpcHoneyPotList~~">DescribeVpcHoneyPotList</a> operation to query the IDs of VPCs.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>vpc-zm0asrkpv1q8gnk7mn4dn</p>
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

    /**
     * 
     * {@link CreateHoneypotProbeRequest} extends {@link TeaModel}
     *
     * <p>CreateHoneypotProbeRequest</p>
     */
    public static class BindPortList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BindPort")
        private Boolean bindPort;

        @com.aliyun.core.annotation.NameInMap("EndPort")
        private Integer endPort;

        @com.aliyun.core.annotation.NameInMap("Fixed")
        private Boolean fixed;

        @com.aliyun.core.annotation.NameInMap("StartPort")
        private Integer startPort;

        @com.aliyun.core.annotation.NameInMap("TargetPort")
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

            private Builder() {
            } 

            private Builder(BindPortList model) {
                this.bindPort = model.bindPort;
                this.endPort = model.endPort;
                this.fixed = model.fixed;
                this.startPort = model.startPort;
                this.targetPort = model.targetPort;
            } 

            /**
             * <p>Specifies whether to bind a port. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: yes</li>
             * <li><strong>false</strong>: no</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder bindPort(Boolean bindPort) {
                this.bindPort = bindPort;
                return this;
            }

            /**
             * <p>The end of the port range.</p>
             * 
             * <strong>example:</strong>
             * <p>90</p>
             */
            public Builder endPort(Integer endPort) {
                this.endPort = endPort;
                return this;
            }

            /**
             * <p>Specifies whether the port is a fixed port. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: no</li>
             * <li><strong>1</strong>: yes</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder fixed(Boolean fixed) {
                this.fixed = fixed;
                return this;
            }

            /**
             * <p>The start of the port range.</p>
             * 
             * <strong>example:</strong>
             * <p>80</p>
             */
            public Builder startPort(Integer startPort) {
                this.startPort = startPort;
                return this;
            }

            /**
             * <p>The destination port.</p>
             * <blockquote>
             * <p>If <strong>HoneypotId</strong> is specified, this parameter is required.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>80</p>
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
    /**
     * 
     * {@link CreateHoneypotProbeRequest} extends {@link TeaModel}
     *
     * <p>CreateHoneypotProbeRequest</p>
     */
    public static class HoneypotBindList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BindPortList")
        private java.util.List<BindPortList> bindPortList;

        @com.aliyun.core.annotation.NameInMap("HoneypotId")
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
        public java.util.List<BindPortList> getBindPortList() {
            return this.bindPortList;
        }

        /**
         * @return honeypotId
         */
        public String getHoneypotId() {
            return this.honeypotId;
        }

        public static final class Builder {
            private java.util.List<BindPortList> bindPortList; 
            private String honeypotId; 

            private Builder() {
            } 

            private Builder(HoneypotBindList model) {
                this.bindPortList = model.bindPortList;
                this.honeypotId = model.honeypotId;
            } 

            /**
             * <p>The listener ports.</p>
             */
            public Builder bindPortList(java.util.List<BindPortList> bindPortList) {
                this.bindPortList = bindPortList;
                return this;
            }

            /**
             * <p>The ID of the honeypot.</p>
             * <blockquote>
             * <p>You can call the <a href="~~ListHoneypot~~">ListHoneypot</a> operation to query the IDs of honeypots.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>1a5eda2d40f92ac87d6b63e1a5ad4b76fe0d4110c4a3e2fa85438a29ae55****</p>
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
