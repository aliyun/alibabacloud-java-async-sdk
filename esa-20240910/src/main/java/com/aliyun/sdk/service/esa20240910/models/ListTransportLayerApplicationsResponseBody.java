// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
 * {@link ListTransportLayerApplicationsResponseBody} extends {@link TeaModel}
 *
 * <p>ListTransportLayerApplicationsResponseBody</p>
 */
public class ListTransportLayerApplicationsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Applications")
    private java.util.List<Applications> applications;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListTransportLayerApplicationsResponseBody(Builder builder) {
        this.applications = builder.applications;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTransportLayerApplicationsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applications
     */
    public java.util.List<Applications> getApplications() {
        return this.applications;
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
        private java.util.List<Applications> applications; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListTransportLayerApplicationsResponseBody model) {
            this.applications = model.applications;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>List of transport layer applications.</p>
         */
        public Builder applications(java.util.List<Applications> applications) {
            this.applications = applications;
            return this;
        }

        /**
         * <p>Current page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>Page size.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>CB1A380B-09F0-41BB-A198-72F8FD6DA2FE</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Total number of transport layer applications.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListTransportLayerApplicationsResponseBody build() {
            return new ListTransportLayerApplicationsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListTransportLayerApplicationsResponseBody} extends {@link TeaModel}
     *
     * <p>ListTransportLayerApplicationsResponseBody</p>
     */
    public static class Rules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClientIPPassThroughMode")
        private String clientIPPassThroughMode;

        @com.aliyun.core.annotation.NameInMap("Comment")
        private String comment;

        @com.aliyun.core.annotation.NameInMap("EdgePort")
        private String edgePort;

        @com.aliyun.core.annotation.NameInMap("Protocol")
        private String protocol;

        @com.aliyun.core.annotation.NameInMap("RuleId")
        private Long ruleId;

        @com.aliyun.core.annotation.NameInMap("Source")
        private String source;

        @com.aliyun.core.annotation.NameInMap("SourcePort")
        private String sourcePort;

        @com.aliyun.core.annotation.NameInMap("SourceType")
        private String sourceType;

        private Rules(Builder builder) {
            this.clientIPPassThroughMode = builder.clientIPPassThroughMode;
            this.comment = builder.comment;
            this.edgePort = builder.edgePort;
            this.protocol = builder.protocol;
            this.ruleId = builder.ruleId;
            this.source = builder.source;
            this.sourcePort = builder.sourcePort;
            this.sourceType = builder.sourceType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Rules create() {
            return builder().build();
        }

        /**
         * @return clientIPPassThroughMode
         */
        public String getClientIPPassThroughMode() {
            return this.clientIPPassThroughMode;
        }

        /**
         * @return comment
         */
        public String getComment() {
            return this.comment;
        }

        /**
         * @return edgePort
         */
        public String getEdgePort() {
            return this.edgePort;
        }

        /**
         * @return protocol
         */
        public String getProtocol() {
            return this.protocol;
        }

        /**
         * @return ruleId
         */
        public Long getRuleId() {
            return this.ruleId;
        }

        /**
         * @return source
         */
        public String getSource() {
            return this.source;
        }

        /**
         * @return sourcePort
         */
        public String getSourcePort() {
            return this.sourcePort;
        }

        /**
         * @return sourceType
         */
        public String getSourceType() {
            return this.sourceType;
        }

        public static final class Builder {
            private String clientIPPassThroughMode; 
            private String comment; 
            private String edgePort; 
            private String protocol; 
            private Long ruleId; 
            private String source; 
            private String sourcePort; 
            private String sourceType; 

            private Builder() {
            } 

            private Builder(Rules model) {
                this.clientIPPassThroughMode = model.clientIPPassThroughMode;
                this.comment = model.comment;
                this.edgePort = model.edgePort;
                this.protocol = model.protocol;
                this.ruleId = model.ruleId;
                this.source = model.source;
                this.sourcePort = model.sourcePort;
                this.sourceType = model.sourceType;
            } 

            /**
             * <p>Client IP pass-through protocol, supports:</p>
             * <ul>
             * <li><strong>off</strong>: No pass-through.</li>
             * <li><strong>PPv1</strong>: PROXY Protocol v1, supports client IP pass-through for TCP protocol.</li>
             * <li><strong>PPv2</strong>: PROXY Protocol v2, supports client IP pass-through for TCP and UDP protocols.</li>
             * <li><strong>SPP</strong>: Simple Proxy Protocol, supports client IP pass-through for UDP protocol.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>off</p>
             */
            public Builder clientIPPassThroughMode(String clientIPPassThroughMode) {
                this.clientIPPassThroughMode = clientIPPassThroughMode;
                return this;
            }

            /**
             * <p>Comment information for the rule.</p>
             * 
             * <strong>example:</strong>
             * <p>测试</p>
             */
            public Builder comment(String comment) {
                this.comment = comment;
                return this;
            }

            /**
             * <p>Edge port. Supports:</p>
             * <ul>
             * <li>A single port, e.g., 80.</li>
             * <li>Port range, e.g., 81-85, representing ports 81, 82, 83, 84, 85.</li>
             * <li>Combination of ports and port ranges, separated by commas, e.g., 80,81-85,90, representing ports 80, 81, 82, 83, 84, 85, 90.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>80</p>
             */
            public Builder edgePort(String edgePort) {
                this.edgePort = edgePort;
                return this;
            }

            /**
             * <p>Forwarding rule protocol, with values:</p>
             * <ul>
             * <li>TCP: TCP protocol.</li>
             * <li>UDP: UDP protocol.</li>
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
             * <p>Layer 4 acceleration rule ID.</p>
             * 
             * <strong>example:</strong>
             * <p>20258028****</p>
             */
            public Builder ruleId(Long ruleId) {
                this.ruleId = ruleId;
                return this;
            }

            /**
             * <p>Specific value of the source, which needs to match the source type.</p>
             * 
             * <strong>example:</strong>
             * <p>1.1.1.1</p>
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            /**
             * <p>Source port. Supports:</p>
             * <ul>
             * <li>A single port, when the source port is a single port, any valid combination of edge ports is supported.</li>
             * <li>Port range, only when the edge port is a port range, the source port can be set to a port range, and the range size must be consistent with the edge port. For example, if the edge port is 90-93, the source port cannot be set to 81-85 because the source port range is 5 and the edge port range is 3, which are inconsistent.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>80</p>
             */
            public Builder sourcePort(String sourcePort) {
                this.sourcePort = sourcePort;
                return this;
            }

            /**
             * <p>Source type, supports:</p>
             * <ul>
             * <li><strong>ip</strong>: IP.</li>
             * <li><strong>domain</strong>: Domain name.</li>
             * <li><strong>OP</strong>: Origin pool.</li>
             * <li><strong>LB</strong>: Load balancer.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ip</p>
             */
            public Builder sourceType(String sourceType) {
                this.sourceType = sourceType;
                return this;
            }

            public Rules build() {
                return new Rules(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListTransportLayerApplicationsResponseBody} extends {@link TeaModel}
     *
     * <p>ListTransportLayerApplicationsResponseBody</p>
     */
    public static class StaticIpV4List extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Address")
        private String address;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private StaticIpV4List(Builder builder) {
            this.address = builder.address;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StaticIpV4List create() {
            return builder().build();
        }

        /**
         * @return address
         */
        public String getAddress() {
            return this.address;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String address; 
            private String status; 

            private Builder() {
            } 

            private Builder(StaticIpV4List model) {
                this.address = model.address;
                this.status = model.status;
            } 

            /**
             * Address.
             */
            public Builder address(String address) {
                this.address = address;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public StaticIpV4List build() {
                return new StaticIpV4List(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListTransportLayerApplicationsResponseBody} extends {@link TeaModel}
     *
     * <p>ListTransportLayerApplicationsResponseBody</p>
     */
    public static class Applications extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApplicationId")
        private Long applicationId;

        @com.aliyun.core.annotation.NameInMap("Cname")
        private String cname;

        @com.aliyun.core.annotation.NameInMap("CrossBorderOptimization")
        private String crossBorderOptimization;

        @com.aliyun.core.annotation.NameInMap("IpAccessRule")
        private String ipAccessRule;

        @com.aliyun.core.annotation.NameInMap("Ipv6")
        private String ipv6;

        @com.aliyun.core.annotation.NameInMap("RecordName")
        private String recordName;

        @com.aliyun.core.annotation.NameInMap("Rules")
        private java.util.List<Rules> rules;

        @com.aliyun.core.annotation.NameInMap("RulesCount")
        private Integer rulesCount;

        @com.aliyun.core.annotation.NameInMap("SiteId")
        private Long siteId;

        @com.aliyun.core.annotation.NameInMap("StaticIp")
        private String staticIp;

        @com.aliyun.core.annotation.NameInMap("StaticIpV4List")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List<StaticIpV4List> staticIpV4List;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private Applications(Builder builder) {
            this.applicationId = builder.applicationId;
            this.cname = builder.cname;
            this.crossBorderOptimization = builder.crossBorderOptimization;
            this.ipAccessRule = builder.ipAccessRule;
            this.ipv6 = builder.ipv6;
            this.recordName = builder.recordName;
            this.rules = builder.rules;
            this.rulesCount = builder.rulesCount;
            this.siteId = builder.siteId;
            this.staticIp = builder.staticIp;
            this.staticIpV4List = builder.staticIpV4List;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Applications create() {
            return builder().build();
        }

        /**
         * @return applicationId
         */
        public Long getApplicationId() {
            return this.applicationId;
        }

        /**
         * @return cname
         */
        public String getCname() {
            return this.cname;
        }

        /**
         * @return crossBorderOptimization
         */
        public String getCrossBorderOptimization() {
            return this.crossBorderOptimization;
        }

        /**
         * @return ipAccessRule
         */
        public String getIpAccessRule() {
            return this.ipAccessRule;
        }

        /**
         * @return ipv6
         */
        public String getIpv6() {
            return this.ipv6;
        }

        /**
         * @return recordName
         */
        public String getRecordName() {
            return this.recordName;
        }

        /**
         * @return rules
         */
        public java.util.List<Rules> getRules() {
            return this.rules;
        }

        /**
         * @return rulesCount
         */
        public Integer getRulesCount() {
            return this.rulesCount;
        }

        /**
         * @return siteId
         */
        public Long getSiteId() {
            return this.siteId;
        }

        /**
         * @return staticIp
         */
        public String getStaticIp() {
            return this.staticIp;
        }

        /**
         * @return staticIpV4List
         */
        public java.util.List<StaticIpV4List> getStaticIpV4List() {
            return this.staticIpV4List;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private Long applicationId; 
            private String cname; 
            private String crossBorderOptimization; 
            private String ipAccessRule; 
            private String ipv6; 
            private String recordName; 
            private java.util.List<Rules> rules; 
            private Integer rulesCount; 
            private Long siteId; 
            private String staticIp; 
            private java.util.List<StaticIpV4List> staticIpV4List; 
            private String status; 

            private Builder() {
            } 

            private Builder(Applications model) {
                this.applicationId = model.applicationId;
                this.cname = model.cname;
                this.crossBorderOptimization = model.crossBorderOptimization;
                this.ipAccessRule = model.ipAccessRule;
                this.ipv6 = model.ipv6;
                this.recordName = model.recordName;
                this.rules = model.rules;
                this.rulesCount = model.rulesCount;
                this.siteId = model.siteId;
                this.staticIp = model.staticIp;
                this.staticIpV4List = model.staticIpV4List;
                this.status = model.status;
            } 

            /**
             * <p>Layer 4 application ID.</p>
             * 
             * <strong>example:</strong>
             * <p>170997271816****</p>
             */
            public Builder applicationId(Long applicationId) {
                this.applicationId = applicationId;
                return this;
            }

            /**
             * <p>CNAME domain name corresponding to the Layer 4 acceleration application. This field is not empty only when the site is accessed via CNAME.</p>
             * 
             * <strong>example:</strong>
             * <p>example.com.ialicdn.com</p>
             */
            public Builder cname(String cname) {
                this.cname = cname;
                return this;
            }

            /**
             * <p>Whether to enable China mainland network access optimization. It is disabled by default. The value range is:</p>
             * <ul>
             * <li>on: Enabled.</li>
             * <li>off: Disabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>on</p>
             */
            public Builder crossBorderOptimization(String crossBorderOptimization) {
                this.crossBorderOptimization = crossBorderOptimization;
                return this;
            }

            /**
             * <p>IP access rule switch. When enabled, the IP access rules in WAF take effect on the Layer 4 application.</p>
             * <ul>
             * <li>on: Enabled.</li>
             * <li>off: Disabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>on</p>
             */
            public Builder ipAccessRule(String ipAccessRule) {
                this.ipAccessRule = ipAccessRule;
                return this;
            }

            /**
             * <p>IPv6 switch.</p>
             * 
             * <strong>example:</strong>
             * <p>on</p>
             */
            public Builder ipv6(String ipv6) {
                this.ipv6 = ipv6;
                return this;
            }

            /**
             * <p>Domain name of the Layer 4 application.</p>
             * 
             * <strong>example:</strong>
             * <p>test.example.com</p>
             */
            public Builder recordName(String recordName) {
                this.recordName = recordName;
                return this;
            }

            /**
             * <p>List of forwarding rules.</p>
             */
            public Builder rules(java.util.List<Rules> rules) {
                this.rules = rules;
                return this;
            }

            /**
             * <p>Number of forwarding rules contained in the Layer 4 acceleration application.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder rulesCount(Integer rulesCount) {
                this.rulesCount = rulesCount;
                return this;
            }

            /**
             * <p>Site ID.</p>
             * 
             * <strong>example:</strong>
             * <p>36556540048****</p>
             */
            public Builder siteId(Long siteId) {
                this.siteId = siteId;
                return this;
            }

            /**
             * StaticIp.
             */
            public Builder staticIp(String staticIp) {
                this.staticIp = staticIp;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             */
            public Builder staticIpV4List(java.util.List<StaticIpV4List> staticIpV4List) {
                this.staticIpV4List = staticIpV4List;
                return this;
            }

            /**
             * <p>Status of the Layer 4 application</p>
             * <ul>
             * <li><strong>deploying</strong>: Deploying. In this state, modification and deletion are not allowed.</li>
             * <li><strong>active</strong>: Active.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>active</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Applications build() {
                return new Applications(this);
            } 

        } 

    }
}
