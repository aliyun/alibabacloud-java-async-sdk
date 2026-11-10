// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

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
 * {@link CreateTransitRouterPolicyBasedRouteRequest} extends {@link RequestModel}
 *
 * <p>CreateTransitRouterPolicyBasedRouteRequest</p>
 */
public class CreateTransitRouterPolicyBasedRouteRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AddressFamily")
    private String addressFamily;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DestPortRange")
    private String destPortRange;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DestinationCidr")
    private String destinationCidr;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private Boolean dryRun;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Dscp")
    private String dscp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PolicyTableId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String policyTableId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Priority")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer priority;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Protocol")
    private String protocol;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceCidr")
    private String sourceCidr;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourcePortRange")
    private String sourcePortRange;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetRouteTableId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String targetRouteTableId;

    private CreateTransitRouterPolicyBasedRouteRequest(Builder builder) {
        super(builder);
        this.addressFamily = builder.addressFamily;
        this.clientToken = builder.clientToken;
        this.description = builder.description;
        this.destPortRange = builder.destPortRange;
        this.destinationCidr = builder.destinationCidr;
        this.dryRun = builder.dryRun;
        this.dscp = builder.dscp;
        this.name = builder.name;
        this.policyTableId = builder.policyTableId;
        this.priority = builder.priority;
        this.protocol = builder.protocol;
        this.sourceCidr = builder.sourceCidr;
        this.sourcePortRange = builder.sourcePortRange;
        this.targetRouteTableId = builder.targetRouteTableId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateTransitRouterPolicyBasedRouteRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return addressFamily
     */
    public String getAddressFamily() {
        return this.addressFamily;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return destPortRange
     */
    public String getDestPortRange() {
        return this.destPortRange;
    }

    /**
     * @return destinationCidr
     */
    public String getDestinationCidr() {
        return this.destinationCidr;
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * @return dscp
     */
    public String getDscp() {
        return this.dscp;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return policyTableId
     */
    public String getPolicyTableId() {
        return this.policyTableId;
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
     * @return sourceCidr
     */
    public String getSourceCidr() {
        return this.sourceCidr;
    }

    /**
     * @return sourcePortRange
     */
    public String getSourcePortRange() {
        return this.sourcePortRange;
    }

    /**
     * @return targetRouteTableId
     */
    public String getTargetRouteTableId() {
        return this.targetRouteTableId;
    }

    public static final class Builder extends Request.Builder<CreateTransitRouterPolicyBasedRouteRequest, Builder> {
        private String addressFamily; 
        private String clientToken; 
        private String description; 
        private String destPortRange; 
        private String destinationCidr; 
        private Boolean dryRun; 
        private String dscp; 
        private String name; 
        private String policyTableId; 
        private Integer priority; 
        private String protocol; 
        private String sourceCidr; 
        private String sourcePortRange; 
        private String targetRouteTableId; 

        private Builder() {
            super();
        } 

        private Builder(CreateTransitRouterPolicyBasedRouteRequest request) {
            super(request);
            this.addressFamily = request.addressFamily;
            this.clientToken = request.clientToken;
            this.description = request.description;
            this.destPortRange = request.destPortRange;
            this.destinationCidr = request.destinationCidr;
            this.dryRun = request.dryRun;
            this.dscp = request.dscp;
            this.name = request.name;
            this.policyTableId = request.policyTableId;
            this.priority = request.priority;
            this.protocol = request.protocol;
            this.sourceCidr = request.sourceCidr;
            this.sourcePortRange = request.sourcePortRange;
            this.targetRouteTableId = request.targetRouteTableId;
        } 

        /**
         * <p>The address family. Valid values:</p>
         * <ul>
         * <li>IPv4</li>
         * <li>IPv6</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>IPv4</p>
         */
        public Builder addressFamily(String addressFamily) {
            this.putQueryParameter("AddressFamily", addressFamily);
            this.addressFamily = addressFamily;
            return this;
        }

        /**
         * <p>The client token that is used to ensure the idempotence of the request.</p>
         * <p>You can use the client to generate the value, but you must ensure that it is unique among different requests. The client token can contain only ASCII characters.</p>
         * <blockquote>
         * <p>If you do not specify this parameter, the system automatically uses the <strong>RequestId</strong> of the API request as the <strong>ClientToken</strong>. The <strong>RequestId</strong> of each API request may be different.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>123e4567-e89b-12d3-a456-42665544****</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The description of the policy-based route.</p>
         * 
         * <strong>example:</strong>
         * <p>desctest</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The destination port. Valid values: <strong>-1</strong> or <strong>1</strong> to <strong>65535</strong>.</p>
         * <p>This parameter matches traffic whose port numbers fall within the destination port range. If you do not specify this parameter, traffic to any destination port is matched.</p>
         * <p>The port range is specified in the following formats:</p>
         * <ul>
         * <li>80: port 80.</li>
         * <li>80/80: port 80.</li>
         * <li>1/200: ports 1 to 200.</li>
         * <li>-1/-1: all ports.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>80/80</p>
         */
        public Builder destPortRange(String destPortRange) {
            this.putQueryParameter("DestPortRange", destPortRange);
            this.destPortRange = destPortRange;
            return this;
        }

        /**
         * <p>The destination CIDR block of the route entry. Both IPv4 and IPv6 addresses are supported.</p>
         * 
         * <strong>example:</strong>
         * <p>172.19.2.0/24</p>
         */
        public Builder destinationCidr(String destinationCidr) {
            this.putQueryParameter("DestinationCidr", destinationCidr);
            this.destinationCidr = destinationCidr;
            return this;
        }

        /**
         * <p>Specifies whether to only precheck the request. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: prechecks the request without creating the routing rule entry in the policy route table. The system checks whether required parameters are specified, the request format, and service limits. If the request fails the precheck, the corresponding error is returned. If the request passes the precheck, the <code>DryRunOperation</code> error code is returned.</li>
         * <li><strong>false</strong> (default): sends the request. After the request passes the precheck, the routing rule entry is created in the policy route table.</li>
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
         * <p>The Differentiated Services Code Point (DSCP) value of the traffic packet to be matched. Valid values: <strong>0</strong> to <strong>63</strong>.</p>
         * <p>The DSCP range is specified in the following formats:</p>
         * <ul>
         * <li>1: traffic with a DSCP value of 1.</li>
         * <li>1/10: traffic with a DSCP value from 1 to 10.</li>
         * <li>-1/-1: traffic with any DSCP value.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder dscp(String dscp) {
            this.putQueryParameter("Dscp", dscp);
            this.dscp = dscp;
            return this;
        }

        /**
         * <p>The name of the policy-based route.</p>
         * 
         * <strong>example:</strong>
         * <p>nametest</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The instance ID of the policy routing table.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ptbl-abc123xyz</p>
         */
        public Builder policyTableId(String policyTableId) {
            this.putQueryParameter("PolicyTableId", policyTableId);
            this.policyTableId = policyTableId;
            return this;
        }

        /**
         * <p>The priority of the policy-based route. Valid values: <strong>1</strong> to <strong>100</strong>.</p>
         * <p>The priority of each policy-based route in a policy route table of a transit router must be unique. A smaller value indicates a higher priority.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder priority(Integer priority) {
            this.putQueryParameter("Priority", priority);
            this.priority = priority;
            return this;
        }

        /**
         * <p>The protocol type of the traffic packet.</p>
         * <p>Traffic classification rules support matching traffic of various protocol types, such as <strong>HTTP</strong>, <strong>HTTPS</strong>, <strong>TCP</strong>, <strong>UDP</strong>, <strong>SSH</strong>, and <strong>Telnet</strong>. For more protocol types, log on to the <a href="https://cen.console.aliyun.com/cen/list">Cloud Enterprise Network (CEN) console</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>ICMP</p>
         */
        public Builder protocol(String protocol) {
            this.putQueryParameter("Protocol", protocol);
            this.protocol = protocol;
            return this;
        }

        /**
         * <p>The source CIDR block. The source CIDR block must be in CIDR format. Example: 192.168.1.0/24.</p>
         * 
         * <strong>example:</strong>
         * <p>10.0.0.0/8</p>
         */
        public Builder sourceCidr(String sourceCidr) {
            this.putQueryParameter("SourceCidr", sourceCidr);
            this.sourceCidr = sourceCidr;
            return this;
        }

        /**
         * <p>The source port. Valid values: <strong>-1</strong> or <strong>1</strong> to <strong>65535</strong>.</p>
         * <p>This parameter matches traffic whose port numbers fall within the source port range. If you do not specify this parameter, traffic from any source port is matched.</p>
         * <p>The port range is specified in the following formats:</p>
         * <ul>
         * <li>80: port 80.</li>
         * <li>80/80: port 80.</li>
         * <li>1/200: ports 1 to 200.</li>
         * <li>-1/-1: all ports.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>80/80</p>
         */
        public Builder sourcePortRange(String sourcePortRange) {
            this.putQueryParameter("SourcePortRange", sourcePortRange);
            this.sourcePortRange = sourcePortRange;
            return this;
        }

        /**
         * <p>The destination route table.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vtb-123abcxyz</p>
         */
        public Builder targetRouteTableId(String targetRouteTableId) {
            this.putQueryParameter("TargetRouteTableId", targetRouteTableId);
            this.targetRouteTableId = targetRouteTableId;
            return this;
        }

        @Override
        public CreateTransitRouterPolicyBasedRouteRequest build() {
            return new CreateTransitRouterPolicyBasedRouteRequest(this);
        } 

    } 

}
