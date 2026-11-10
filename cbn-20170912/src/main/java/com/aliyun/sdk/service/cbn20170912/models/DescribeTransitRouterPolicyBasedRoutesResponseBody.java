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
 * {@link DescribeTransitRouterPolicyBasedRoutesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeTransitRouterPolicyBasedRoutesResponseBody</p>
 */
public class DescribeTransitRouterPolicyBasedRoutesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("PolicyBasedRoutes")
    private java.util.List<PolicyBasedRoutes> policyBasedRoutes;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeTransitRouterPolicyBasedRoutesResponseBody(Builder builder) {
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.policyBasedRoutes = builder.policyBasedRoutes;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeTransitRouterPolicyBasedRoutesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return policyBasedRoutes
     */
    public java.util.List<PolicyBasedRoutes> getPolicyBasedRoutes() {
        return this.policyBasedRoutes;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Integer maxResults; 
        private String nextToken; 
        private java.util.List<PolicyBasedRoutes> policyBasedRoutes; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(DescribeTransitRouterPolicyBasedRoutesResponseBody model) {
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.policyBasedRoutes = model.policyBasedRoutes;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The number of entries returned per page. Default value: <strong>20</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The token for the next query. Valid values:</p>
         * <ul>
         * <li>If <strong>NextToken</strong> is empty, no next query is available.</li>
         * <li>If <strong>NextToken</strong> returns a value, the value is the token used to start the next query.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>FFmyTO70tTpLG6I3FmYAXGKPd****</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The list of policy-based route rules.</p>
         */
        public Builder policyBasedRoutes(java.util.List<PolicyBasedRoutes> policyBasedRoutes) {
            this.policyBasedRoutes = policyBasedRoutes;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>F7DDDC17-FA06-4AC2-8F35-59D2470FCFC1</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeTransitRouterPolicyBasedRoutesResponseBody build() {
            return new DescribeTransitRouterPolicyBasedRoutesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeTransitRouterPolicyBasedRoutesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeTransitRouterPolicyBasedRoutesResponseBody</p>
     */
    public static class PolicyBasedRoutes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AddressFamily")
        private String addressFamily;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("DestPortRange")
        private String destPortRange;

        @com.aliyun.core.annotation.NameInMap("DestinationCidr")
        private String destinationCidr;

        @com.aliyun.core.annotation.NameInMap("Dscp")
        private String dscp;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("PolicyBasedRouteId")
        private String policyBasedRouteId;

        @com.aliyun.core.annotation.NameInMap("PolicyTableId")
        private String policyTableId;

        @com.aliyun.core.annotation.NameInMap("Priority")
        private Integer priority;

        @com.aliyun.core.annotation.NameInMap("Protocol")
        private String protocol;

        @com.aliyun.core.annotation.NameInMap("SourceCidr")
        private String sourceCidr;

        @com.aliyun.core.annotation.NameInMap("SourcePortRange")
        private String sourcePortRange;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TargetRouteTableId")
        private String targetRouteTableId;

        private PolicyBasedRoutes(Builder builder) {
            this.addressFamily = builder.addressFamily;
            this.description = builder.description;
            this.destPortRange = builder.destPortRange;
            this.destinationCidr = builder.destinationCidr;
            this.dscp = builder.dscp;
            this.name = builder.name;
            this.policyBasedRouteId = builder.policyBasedRouteId;
            this.policyTableId = builder.policyTableId;
            this.priority = builder.priority;
            this.protocol = builder.protocol;
            this.sourceCidr = builder.sourceCidr;
            this.sourcePortRange = builder.sourcePortRange;
            this.status = builder.status;
            this.targetRouteTableId = builder.targetRouteTableId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PolicyBasedRoutes create() {
            return builder().build();
        }

        /**
         * @return addressFamily
         */
        public String getAddressFamily() {
            return this.addressFamily;
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
         * @return policyBasedRouteId
         */
        public String getPolicyBasedRouteId() {
            return this.policyBasedRouteId;
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
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return targetRouteTableId
         */
        public String getTargetRouteTableId() {
            return this.targetRouteTableId;
        }

        public static final class Builder {
            private String addressFamily; 
            private String description; 
            private String destPortRange; 
            private String destinationCidr; 
            private String dscp; 
            private String name; 
            private String policyBasedRouteId; 
            private String policyTableId; 
            private Integer priority; 
            private String protocol; 
            private String sourceCidr; 
            private String sourcePortRange; 
            private String status; 
            private String targetRouteTableId; 

            private Builder() {
            } 

            private Builder(PolicyBasedRoutes model) {
                this.addressFamily = model.addressFamily;
                this.description = model.description;
                this.destPortRange = model.destPortRange;
                this.destinationCidr = model.destinationCidr;
                this.dscp = model.dscp;
                this.name = model.name;
                this.policyBasedRouteId = model.policyBasedRouteId;
                this.policyTableId = model.policyTableId;
                this.priority = model.priority;
                this.protocol = model.protocol;
                this.sourceCidr = model.sourceCidr;
                this.sourcePortRange = model.sourcePortRange;
                this.status = model.status;
                this.targetRouteTableId = model.targetRouteTableId;
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
                this.addressFamily = addressFamily;
                return this;
            }

            /**
             * <p>The description of the policy-based route table.</p>
             * 
             * <strong>example:</strong>
             * <p>OK</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The destination port. Valid values: <strong>-1</strong> or <strong>1</strong> to <strong>65535</strong>.</p>
             * <p>Matches traffic whose port numbers fall within the destination port range. If this parameter is not specified, traffic to any destination port is matched.</p>
             * <p>The port range format is described as follows:</p>
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
                this.destPortRange = destPortRange;
                return this;
            }

            /**
             * <p>The destination CIDR block.</p>
             * 
             * <strong>example:</strong>
             * <p>10.185.33.0/24</p>
             */
            public Builder destinationCidr(String destinationCidr) {
                this.destinationCidr = destinationCidr;
                return this;
            }

            /**
             * <p>The Differentiated Services Code Point (DSCP) value of the traffic packets to match. Valid values: <strong>0</strong> to <strong>63</strong>.</p>
             * <p>The DSCP value format is described as follows:</p>
             * <ul>
             * <li>1: matches traffic with a DSCP value of 1.</li>
             * <li>1/10: matches traffic with DSCP values from 1 to 10.</li>
             * <li>-1/-1: matches traffic with any DSCP value.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1/10</p>
             */
            public Builder dscp(String dscp) {
                this.dscp = dscp;
                return this;
            }

            /**
             * <p>The name of the policy-based route rule.</p>
             * <p>The name can be empty or 1 to 128 characters in length. It cannot start with http:// or https://.</p>
             * 
             * <strong>example:</strong>
             * <p>None</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The instance ID of the policy-based routing rule.</p>
             * 
             * <strong>example:</strong>
             * <p>pbr-123qwead</p>
             */
            public Builder policyBasedRouteId(String policyBasedRouteId) {
                this.policyBasedRouteId = policyBasedRouteId;
                return this;
            }

            /**
             * <p>The instance ID of the policy-based routing table.</p>
             * 
             * <strong>example:</strong>
             * <p>ptbl-123adsfzc</p>
             */
            public Builder policyTableId(String policyTableId) {
                this.policyTableId = policyTableId;
                return this;
            }

            /**
             * <p>The priority of the policy-based route. Valid values: <strong>1</strong> to <strong>100</strong>.</p>
             * <p>The priority of each policy-based route in a policy-based route table of a transit router must be unique. A smaller value indicates a higher priority.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder priority(Integer priority) {
                this.priority = priority;
                return this;
            }

            /**
             * <p>The protocol type of the traffic packets.</p>
             * <p>Traffic classification rules support matching traffic of various protocol types, such as <strong>HTTP</strong>, <strong>HTTPS</strong>, <strong>TCP</strong>, <strong>UDP</strong>, <strong>SSH</strong>, and <strong>Telnet</strong>. For more protocol types, log on to the <a href="https://cen.console.aliyun.com/cen/list">Cloud Enterprise Network (CEN) console</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>TCP</p>
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            /**
             * <p>The source CIDR block.</p>
             * 
             * <strong>example:</strong>
             * <p>10.0.0.0/8</p>
             */
            public Builder sourceCidr(String sourceCidr) {
                this.sourceCidr = sourceCidr;
                return this;
            }

            /**
             * <p>The source port. Valid values: <strong>-1</strong> or <strong>1</strong> to <strong>65535</strong>.</p>
             * <p>Matches traffic whose port numbers fall within the source port range. If this parameter is not specified, traffic from any source port is matched.</p>
             * <p>The port range format is described as follows:</p>
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
                this.sourcePortRange = sourcePortRange;
                return this;
            }

            /**
             * <p>The status of the policy-based route. Valid values:</p>
             * <ul>
             * <li><strong>Creating</strong>: The policy-based route is being created.</li>
             * <li><strong>Active</strong>: The policy-based route is available.</li>
             * <li><strong>Deleting</strong>: The policy-based route is being deleted.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Active</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The destination route table.</p>
             * 
             * <strong>example:</strong>
             * <p>vtb-123adf</p>
             */
            public Builder targetRouteTableId(String targetRouteTableId) {
                this.targetRouteTableId = targetRouteTableId;
                return this;
            }

            public PolicyBasedRoutes build() {
                return new PolicyBasedRoutes(this);
            } 

        } 

    }
}
