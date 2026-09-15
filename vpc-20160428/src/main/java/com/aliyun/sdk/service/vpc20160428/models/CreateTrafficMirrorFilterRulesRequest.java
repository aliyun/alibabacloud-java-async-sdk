// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

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
 * {@link CreateTrafficMirrorFilterRulesRequest} extends {@link RequestModel}
 *
 * <p>CreateTrafficMirrorFilterRulesRequest</p>
 */
public class CreateTrafficMirrorFilterRulesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private Boolean dryRun;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EgressRules")
    private java.util.List<EgressRules> egressRules;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IngressRules")
    private java.util.List<IngressRules> ingressRules;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TrafficMirrorFilterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String trafficMirrorFilterId;

    private CreateTrafficMirrorFilterRulesRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.dryRun = builder.dryRun;
        this.egressRules = builder.egressRules;
        this.ingressRules = builder.ingressRules;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.trafficMirrorFilterId = builder.trafficMirrorFilterId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateTrafficMirrorFilterRulesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * @return egressRules
     */
    public java.util.List<EgressRules> getEgressRules() {
        return this.egressRules;
    }

    /**
     * @return ingressRules
     */
    public java.util.List<IngressRules> getIngressRules() {
        return this.ingressRules;
    }

    /**
     * @return ownerAccount
     */
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return trafficMirrorFilterId
     */
    public String getTrafficMirrorFilterId() {
        return this.trafficMirrorFilterId;
    }

    public static final class Builder extends Request.Builder<CreateTrafficMirrorFilterRulesRequest, Builder> {
        private String clientToken; 
        private Boolean dryRun; 
        private java.util.List<EgressRules> egressRules; 
        private java.util.List<IngressRules> ingressRules; 
        private String ownerAccount; 
        private Long ownerId; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String trafficMirrorFilterId; 

        private Builder() {
            super();
        } 

        private Builder(CreateTrafficMirrorFilterRulesRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.dryRun = request.dryRun;
            this.egressRules = request.egressRules;
            this.ingressRules = request.ingressRules;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.trafficMirrorFilterId = request.trafficMirrorFilterId;
        } 

        /**
         * <p>The client token that is used to ensure the idempotence of the request.</p>
         * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The client token can contain only ASCII characters.</p>
         * <blockquote>
         * <p>If you do not specify this parameter, the system automatically uses the <strong>RequestId</strong> of the API request as the <strong>ClientToken</strong>. The <strong>RequestId</strong> may be different for each API request.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>123e4567-e89b-12d3-a456-426655440000</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>Specifies whether to perform only a dry run, without performing the actual request. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: performs only a dry run. The system checks the request for potential issues, including missing parameter values, incorrect request syntax, and service limits. If the request fails the dry run, an error code is returned. If the request passes the dry run, the <code>DryRunOperation</code> error code is returned.</p>
         * </li>
         * <li><p><strong>false</strong> (default): performs a dry run and performs the actual request. If the request passes the dry run, inbound or outbound rules are created.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * <p>The details of the outbound rules.</p>
         */
        public Builder egressRules(java.util.List<EgressRules> egressRules) {
            this.putQueryParameter("EgressRules", egressRules);
            this.egressRules = egressRules;
            return this;
        }

        /**
         * <p>The details of the inbound rules.</p>
         */
        public Builder ingressRules(java.util.List<IngressRules> ingressRules) {
            this.putQueryParameter("IngressRules", ingressRules);
            this.ingressRules = ingressRules;
            return this;
        }

        /**
         * OwnerAccount.
         */
        public Builder ownerAccount(String ownerAccount) {
            this.putQueryParameter("OwnerAccount", ownerAccount);
            this.ownerAccount = ownerAccount;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * <p>The region ID of the traffic mirror.</p>
         * <p>You can call <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> to query the most recent region list. For more information about regions that support traffic mirroring, see <a href="https://help.aliyun.com/document_detail/207513.html">Traffic mirroring overview</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hongkong</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ResourceOwnerAccount.
         */
        public Builder resourceOwnerAccount(String resourceOwnerAccount) {
            this.putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
            this.resourceOwnerAccount = resourceOwnerAccount;
            return this;
        }

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * <p>The instance ID of the traffic mirror filter.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>tmf-j6cmls82xnc86vtpe****</p>
         */
        public Builder trafficMirrorFilterId(String trafficMirrorFilterId) {
            this.putQueryParameter("TrafficMirrorFilterId", trafficMirrorFilterId);
            this.trafficMirrorFilterId = trafficMirrorFilterId;
            return this;
        }

        @Override
        public CreateTrafficMirrorFilterRulesRequest build() {
            return new CreateTrafficMirrorFilterRulesRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateTrafficMirrorFilterRulesRequest} extends {@link TeaModel}
     *
     * <p>CreateTrafficMirrorFilterRulesRequest</p>
     */
    public static class EgressRules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Action")
        private String action;

        @com.aliyun.core.annotation.NameInMap("DestinationCidrBlock")
        private String destinationCidrBlock;

        @com.aliyun.core.annotation.NameInMap("DestinationPortRange")
        private String destinationPortRange;

        @com.aliyun.core.annotation.NameInMap("IpVersion")
        private String ipVersion;

        @com.aliyun.core.annotation.NameInMap("Priority")
        private Integer priority;

        @com.aliyun.core.annotation.NameInMap("Protocol")
        private String protocol;

        @com.aliyun.core.annotation.NameInMap("SourceCidrBlock")
        private String sourceCidrBlock;

        @com.aliyun.core.annotation.NameInMap("SourcePortRange")
        private String sourcePortRange;

        private EgressRules(Builder builder) {
            this.action = builder.action;
            this.destinationCidrBlock = builder.destinationCidrBlock;
            this.destinationPortRange = builder.destinationPortRange;
            this.ipVersion = builder.ipVersion;
            this.priority = builder.priority;
            this.protocol = builder.protocol;
            this.sourceCidrBlock = builder.sourceCidrBlock;
            this.sourcePortRange = builder.sourcePortRange;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EgressRules create() {
            return builder().build();
        }

        /**
         * @return action
         */
        public String getAction() {
            return this.action;
        }

        /**
         * @return destinationCidrBlock
         */
        public String getDestinationCidrBlock() {
            return this.destinationCidrBlock;
        }

        /**
         * @return destinationPortRange
         */
        public String getDestinationPortRange() {
            return this.destinationPortRange;
        }

        /**
         * @return ipVersion
         */
        public String getIpVersion() {
            return this.ipVersion;
        }

        /**
         * @return priority
         */
        public Integer getPriority() {
            return this.priority;
        }

        /**
         * @return protocol
         */
        public String getProtocol() {
            return this.protocol;
        }

        /**
         * @return sourceCidrBlock
         */
        public String getSourceCidrBlock() {
            return this.sourceCidrBlock;
        }

        /**
         * @return sourcePortRange
         */
        public String getSourcePortRange() {
            return this.sourcePortRange;
        }

        public static final class Builder {
            private String action; 
            private String destinationCidrBlock; 
            private String destinationPortRange; 
            private String ipVersion; 
            private Integer priority; 
            private String protocol; 
            private String sourceCidrBlock; 
            private String sourcePortRange; 

            private Builder() {
            } 

            private Builder(EgressRules model) {
                this.action = model.action;
                this.destinationCidrBlock = model.destinationCidrBlock;
                this.destinationPortRange = model.destinationPortRange;
                this.ipVersion = model.ipVersion;
                this.priority = model.priority;
                this.protocol = model.protocol;
                this.sourceCidrBlock = model.sourceCidrBlock;
                this.sourcePortRange = model.sourcePortRange;
            } 

            /**
             * <p>The collection policy of the outbound rule. Valid values:</p>
             * <ul>
             * <li><strong>accept</strong>: collects network traffic.</li>
             * <li><strong>drop</strong>: does not collect network traffic.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>accept</p>
             */
            public Builder action(String action) {
                this.action = action;
                return this;
            }

            /**
             * <p>The destination CIDR block of network traffic for the outbound rule.</p>
             * 
             * <strong>example:</strong>
             * <p>10.0.0.0/24</p>
             */
            public Builder destinationCidrBlock(String destinationCidrBlock) {
                this.destinationCidrBlock = destinationCidrBlock;
                return this;
            }

            /**
             * <p>The destination port range of network traffic for the outbound rule. Valid values for a port: <strong>1</strong> to <strong>65535</strong>. Separate the start port and stop port with a forward slash (/). Format: <strong>1/200</strong> or <strong>80/80</strong>. A value of <strong>-1/-1</strong> cannot be configured independently and indicates that all ports are available.</p>
             * <blockquote>
             * <p>If EgressRules.N.Protocol is set to <strong>ALL</strong> or <strong>ICMP</strong>, you do not need to configure this parameter. Settings are not required because all ports are available.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>22/40</p>
             */
            public Builder destinationPortRange(String destinationPortRange) {
                this.destinationPortRange = destinationPortRange;
                return this;
            }

            /**
             * <p>The IP version of the instance. Valid values:</p>
             * <ul>
             * <li><strong>IPv4</strong>: IPv4.</li>
             * <li><strong>IPv6</strong>: IPv6.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>IPv4</p>
             */
            public Builder ipVersion(String ipVersion) {
                this.ipVersion = ipVersion;
                return this;
            }

            /**
             * <p>The priority of the outbound rule. A smaller value indicates a higher priority. The maximum value of <strong>N</strong> is <strong>10</strong>, which means that you can configure up to 10 outbound rules for a traffic mirror filter.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder priority(Integer priority) {
                this.priority = priority;
                return this;
            }

            /**
             * <p>The protocol type of network traffic to be mirrored for the outbound rule. Valid values:</p>
             * <ul>
             * <li><strong>ALL</strong>: all protocols.</li>
             * <li><strong>ICMP</strong>: Internet Control Message Protocol.</li>
             * <li><strong>TCP</strong>: Transmission Control Protocol.</li>
             * <li><strong>UDP</strong>: User Datagram Protocol.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>TCP</p>
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            /**
             * <p>The source CIDR block of network traffic for the outbound rule.</p>
             * 
             * <strong>example:</strong>
             * <p>10.0.0.0/24</p>
             */
            public Builder sourceCidrBlock(String sourceCidrBlock) {
                this.sourceCidrBlock = sourceCidrBlock;
                return this;
            }

            /**
             * <p>The source port range of network traffic for the outbound rule. Valid values for a port: <strong>1</strong> to <strong>65535</strong>. Separate the start port and stop port with a forward slash (/). Format: <strong>1/200</strong> or <strong>80/80</strong>. A value of <strong>-1/-1</strong> cannot be configured independently and indicates that all ports are available.</p>
             * <blockquote>
             * <p>If EgressRules.N.Protocol is set to <strong>ALL</strong> or <strong>ICMP</strong>, you do not need to configure this parameter. Settings are not required because all ports are available.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>22/40</p>
             */
            public Builder sourcePortRange(String sourcePortRange) {
                this.sourcePortRange = sourcePortRange;
                return this;
            }

            public EgressRules build() {
                return new EgressRules(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateTrafficMirrorFilterRulesRequest} extends {@link TeaModel}
     *
     * <p>CreateTrafficMirrorFilterRulesRequest</p>
     */
    public static class IngressRules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Action")
        private String action;

        @com.aliyun.core.annotation.NameInMap("DestinationCidrBlock")
        private String destinationCidrBlock;

        @com.aliyun.core.annotation.NameInMap("DestinationPortRange")
        private String destinationPortRange;

        @com.aliyun.core.annotation.NameInMap("IpVersion")
        private String ipVersion;

        @com.aliyun.core.annotation.NameInMap("Priority")
        private Integer priority;

        @com.aliyun.core.annotation.NameInMap("Protocol")
        private String protocol;

        @com.aliyun.core.annotation.NameInMap("SourceCidrBlock")
        private String sourceCidrBlock;

        @com.aliyun.core.annotation.NameInMap("SourcePortRange")
        private String sourcePortRange;

        private IngressRules(Builder builder) {
            this.action = builder.action;
            this.destinationCidrBlock = builder.destinationCidrBlock;
            this.destinationPortRange = builder.destinationPortRange;
            this.ipVersion = builder.ipVersion;
            this.priority = builder.priority;
            this.protocol = builder.protocol;
            this.sourceCidrBlock = builder.sourceCidrBlock;
            this.sourcePortRange = builder.sourcePortRange;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IngressRules create() {
            return builder().build();
        }

        /**
         * @return action
         */
        public String getAction() {
            return this.action;
        }

        /**
         * @return destinationCidrBlock
         */
        public String getDestinationCidrBlock() {
            return this.destinationCidrBlock;
        }

        /**
         * @return destinationPortRange
         */
        public String getDestinationPortRange() {
            return this.destinationPortRange;
        }

        /**
         * @return ipVersion
         */
        public String getIpVersion() {
            return this.ipVersion;
        }

        /**
         * @return priority
         */
        public Integer getPriority() {
            return this.priority;
        }

        /**
         * @return protocol
         */
        public String getProtocol() {
            return this.protocol;
        }

        /**
         * @return sourceCidrBlock
         */
        public String getSourceCidrBlock() {
            return this.sourceCidrBlock;
        }

        /**
         * @return sourcePortRange
         */
        public String getSourcePortRange() {
            return this.sourcePortRange;
        }

        public static final class Builder {
            private String action; 
            private String destinationCidrBlock; 
            private String destinationPortRange; 
            private String ipVersion; 
            private Integer priority; 
            private String protocol; 
            private String sourceCidrBlock; 
            private String sourcePortRange; 

            private Builder() {
            } 

            private Builder(IngressRules model) {
                this.action = model.action;
                this.destinationCidrBlock = model.destinationCidrBlock;
                this.destinationPortRange = model.destinationPortRange;
                this.ipVersion = model.ipVersion;
                this.priority = model.priority;
                this.protocol = model.protocol;
                this.sourceCidrBlock = model.sourceCidrBlock;
                this.sourcePortRange = model.sourcePortRange;
            } 

            /**
             * <p>The collection policy of the inbound rule. Valid values:</p>
             * <ul>
             * <li><strong>accept</strong>: collects network traffic.</li>
             * <li><strong>drop</strong>: does not collect network traffic.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>accept</p>
             */
            public Builder action(String action) {
                this.action = action;
                return this;
            }

            /**
             * <p>The destination CIDR block of network traffic for the inbound rule.</p>
             * 
             * <strong>example:</strong>
             * <p>10.0.0.0/24</p>
             */
            public Builder destinationCidrBlock(String destinationCidrBlock) {
                this.destinationCidrBlock = destinationCidrBlock;
                return this;
            }

            /**
             * <p>The destination port range of network traffic for the inbound rule. Valid values for a port: <strong>1</strong> to <strong>65535</strong>. Separate the start port and stop port with a forward slash (/). Format: <strong>1/200</strong> or <strong>80/80</strong>.</p>
             * <blockquote>
             * <p>If IngressRules.N.Protocol is set to <strong>ALL</strong> or <strong>ICMP</strong>, you do not need to configure this parameter. Settings are not required because all ports are available.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>80/120</p>
             */
            public Builder destinationPortRange(String destinationPortRange) {
                this.destinationPortRange = destinationPortRange;
                return this;
            }

            /**
             * <p>The IP version of the instance. Valid values:</p>
             * <ul>
             * <li><strong>IPv4</strong>: IPv4.</li>
             * <li><strong>IPv6</strong>: IPv6.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>IPv4</p>
             */
            public Builder ipVersion(String ipVersion) {
                this.ipVersion = ipVersion;
                return this;
            }

            /**
             * <p>The priority of the inbound rule. A smaller value indicates a higher priority. The maximum value of <strong>N</strong> is <strong>10</strong>, which means that you can configure up to 10 inbound rules for a traffic mirror filter.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder priority(Integer priority) {
                this.priority = priority;
                return this;
            }

            /**
             * <p>The protocol type of network traffic to be mirrored for the inbound rule. Valid values:</p>
             * <ul>
             * <li><strong>ALL</strong>: all protocols.</li>
             * <li><strong>ICMP</strong>: Internet Control Message Protocol.</li>
             * <li><strong>TCP</strong>: Transmission Control Protocol.</li>
             * <li><strong>UDP</strong>: User Datagram Protocol.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>TCP</p>
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            /**
             * <p>The source CIDR block of network traffic for the inbound rule.</p>
             * 
             * <strong>example:</strong>
             * <p>10.0.0.0/24</p>
             */
            public Builder sourceCidrBlock(String sourceCidrBlock) {
                this.sourceCidrBlock = sourceCidrBlock;
                return this;
            }

            /**
             * <p>The source port range of network traffic for the inbound rule. Valid values for a port: <strong>1</strong> to <strong>65535</strong>. Separate the start port and stop port with a forward slash (/). Format: <strong>1/200</strong> or <strong>80/80</strong>. A value of <strong>-1/-1</strong> cannot be configured independently and indicates that all ports are available.</p>
             * <blockquote>
             * <p>If IngressRules.N.Protocol is set to <strong>ALL</strong> or <strong>ICMP</strong>, you do not need to configure this parameter. Settings are not required because all ports are available.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>80/120</p>
             */
            public Builder sourcePortRange(String sourcePortRange) {
                this.sourcePortRange = sourcePortRange;
                return this;
            }

            public IngressRules build() {
                return new IngressRules(this);
            } 

        } 

    }
}
