// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeControlPolicyResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeControlPolicyResponseBody</p>
 */
public class DescribeControlPolicyResponseBody extends TeaModel {
    @NameInMap("PageNo")
    private String pageNo;

    @NameInMap("PageSize")
    private String pageSize;

    @NameInMap("Policys")
    private java.util.List < Policys> policys;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private String totalCount;

    private DescribeControlPolicyResponseBody(Builder builder) {
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.policys = builder.policys;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeControlPolicyResponseBody create() {
        return builder().build();
    }

    /**
     * @return pageNo
     */
    public String getPageNo() {
        return this.pageNo;
    }

    /**
     * @return pageSize
     */
    public String getPageSize() {
        return this.pageSize;
    }

    /**
     * @return policys
     */
    public java.util.List < Policys> getPolicys() {
        return this.policys;
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
    public String getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String pageNo; 
        private String pageSize; 
        private java.util.List < Policys> policys; 
        private String requestId; 
        private String totalCount; 

        /**
         * The page number of the returned page.
         */
        public Builder pageNo(String pageNo) {
            this.pageNo = pageNo;
            return this;
        }

        /**
         * The number of entries returned per page.
         */
        public Builder pageSize(String pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The details about the access control policy.
         */
        public Builder policys(java.util.List < Policys> policys) {
            this.policys = policys;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The total number of the returned access control policies.
         */
        public Builder totalCount(String totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeControlPolicyResponseBody build() {
            return new DescribeControlPolicyResponseBody(this);
        } 

    } 

    public static class Policys extends TeaModel {
        @NameInMap("AclAction")
        private String aclAction;

        @NameInMap("AclUuid")
        private String aclUuid;

        @NameInMap("ApplicationId")
        private String applicationId;

        @NameInMap("ApplicationName")
        private String applicationName;

        @NameInMap("ApplicationNameList")
        private java.util.List < String > applicationNameList;

        @NameInMap("CreateTime")
        private Long createTime;

        @NameInMap("Description")
        private String description;

        @NameInMap("DestPort")
        private String destPort;

        @NameInMap("DestPortGroup")
        private String destPortGroup;

        @NameInMap("DestPortGroupPorts")
        private java.util.List < String > destPortGroupPorts;

        @NameInMap("DestPortType")
        private String destPortType;

        @NameInMap("Destination")
        private String destination;

        @NameInMap("DestinationGroupCidrs")
        private java.util.List < String > destinationGroupCidrs;

        @NameInMap("DestinationGroupType")
        private String destinationGroupType;

        @NameInMap("DestinationType")
        private String destinationType;

        @NameInMap("Direction")
        private String direction;

        @NameInMap("DnsResult")
        private String dnsResult;

        @NameInMap("DnsResultTime")
        private Long dnsResultTime;

        @NameInMap("HitLastTime")
        private Long hitLastTime;

        @NameInMap("HitTimes")
        private Long hitTimes;

        @NameInMap("IpVersion")
        private Integer ipVersion;

        @NameInMap("ModifyTime")
        private Long modifyTime;

        @NameInMap("Order")
        private Integer order;

        @NameInMap("Proto")
        private String proto;

        @NameInMap("Release")
        private String release;

        @NameInMap("Source")
        private String source;

        @NameInMap("SourceGroupCidrs")
        private java.util.List < String > sourceGroupCidrs;

        @NameInMap("SourceGroupType")
        private String sourceGroupType;

        @NameInMap("SourceType")
        private String sourceType;

        @NameInMap("SpreadCnt")
        private Integer spreadCnt;

        private Policys(Builder builder) {
            this.aclAction = builder.aclAction;
            this.aclUuid = builder.aclUuid;
            this.applicationId = builder.applicationId;
            this.applicationName = builder.applicationName;
            this.applicationNameList = builder.applicationNameList;
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.destPort = builder.destPort;
            this.destPortGroup = builder.destPortGroup;
            this.destPortGroupPorts = builder.destPortGroupPorts;
            this.destPortType = builder.destPortType;
            this.destination = builder.destination;
            this.destinationGroupCidrs = builder.destinationGroupCidrs;
            this.destinationGroupType = builder.destinationGroupType;
            this.destinationType = builder.destinationType;
            this.direction = builder.direction;
            this.dnsResult = builder.dnsResult;
            this.dnsResultTime = builder.dnsResultTime;
            this.hitLastTime = builder.hitLastTime;
            this.hitTimes = builder.hitTimes;
            this.ipVersion = builder.ipVersion;
            this.modifyTime = builder.modifyTime;
            this.order = builder.order;
            this.proto = builder.proto;
            this.release = builder.release;
            this.source = builder.source;
            this.sourceGroupCidrs = builder.sourceGroupCidrs;
            this.sourceGroupType = builder.sourceGroupType;
            this.sourceType = builder.sourceType;
            this.spreadCnt = builder.spreadCnt;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Policys create() {
            return builder().build();
        }

        /**
         * @return aclAction
         */
        public String getAclAction() {
            return this.aclAction;
        }

        /**
         * @return aclUuid
         */
        public String getAclUuid() {
            return this.aclUuid;
        }

        /**
         * @return applicationId
         */
        public String getApplicationId() {
            return this.applicationId;
        }

        /**
         * @return applicationName
         */
        public String getApplicationName() {
            return this.applicationName;
        }

        /**
         * @return applicationNameList
         */
        public java.util.List < String > getApplicationNameList() {
            return this.applicationNameList;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return destPort
         */
        public String getDestPort() {
            return this.destPort;
        }

        /**
         * @return destPortGroup
         */
        public String getDestPortGroup() {
            return this.destPortGroup;
        }

        /**
         * @return destPortGroupPorts
         */
        public java.util.List < String > getDestPortGroupPorts() {
            return this.destPortGroupPorts;
        }

        /**
         * @return destPortType
         */
        public String getDestPortType() {
            return this.destPortType;
        }

        /**
         * @return destination
         */
        public String getDestination() {
            return this.destination;
        }

        /**
         * @return destinationGroupCidrs
         */
        public java.util.List < String > getDestinationGroupCidrs() {
            return this.destinationGroupCidrs;
        }

        /**
         * @return destinationGroupType
         */
        public String getDestinationGroupType() {
            return this.destinationGroupType;
        }

        /**
         * @return destinationType
         */
        public String getDestinationType() {
            return this.destinationType;
        }

        /**
         * @return direction
         */
        public String getDirection() {
            return this.direction;
        }

        /**
         * @return dnsResult
         */
        public String getDnsResult() {
            return this.dnsResult;
        }

        /**
         * @return dnsResultTime
         */
        public Long getDnsResultTime() {
            return this.dnsResultTime;
        }

        /**
         * @return hitLastTime
         */
        public Long getHitLastTime() {
            return this.hitLastTime;
        }

        /**
         * @return hitTimes
         */
        public Long getHitTimes() {
            return this.hitTimes;
        }

        /**
         * @return ipVersion
         */
        public Integer getIpVersion() {
            return this.ipVersion;
        }

        /**
         * @return modifyTime
         */
        public Long getModifyTime() {
            return this.modifyTime;
        }

        /**
         * @return order
         */
        public Integer getOrder() {
            return this.order;
        }

        /**
         * @return proto
         */
        public String getProto() {
            return this.proto;
        }

        /**
         * @return release
         */
        public String getRelease() {
            return this.release;
        }

        /**
         * @return source
         */
        public String getSource() {
            return this.source;
        }

        /**
         * @return sourceGroupCidrs
         */
        public java.util.List < String > getSourceGroupCidrs() {
            return this.sourceGroupCidrs;
        }

        /**
         * @return sourceGroupType
         */
        public String getSourceGroupType() {
            return this.sourceGroupType;
        }

        /**
         * @return sourceType
         */
        public String getSourceType() {
            return this.sourceType;
        }

        /**
         * @return spreadCnt
         */
        public Integer getSpreadCnt() {
            return this.spreadCnt;
        }

        public static final class Builder {
            private String aclAction; 
            private String aclUuid; 
            private String applicationId; 
            private String applicationName; 
            private java.util.List < String > applicationNameList; 
            private Long createTime; 
            private String description; 
            private String destPort; 
            private String destPortGroup; 
            private java.util.List < String > destPortGroupPorts; 
            private String destPortType; 
            private String destination; 
            private java.util.List < String > destinationGroupCidrs; 
            private String destinationGroupType; 
            private String destinationType; 
            private String direction; 
            private String dnsResult; 
            private Long dnsResultTime; 
            private Long hitLastTime; 
            private Long hitTimes; 
            private Integer ipVersion; 
            private Long modifyTime; 
            private Integer order; 
            private String proto; 
            private String release; 
            private String source; 
            private java.util.List < String > sourceGroupCidrs; 
            private String sourceGroupType; 
            private String sourceType; 
            private Integer spreadCnt; 

            /**
             * The action that Cloud Firewall performs on the traffic. Valid values:
             * <p>
             * 
             * *   **accept**: allows the traffic.
             * *   **drop**: denies the traffic.
             * *   **log**: monitors the traffic.
             */
            public Builder aclAction(String aclAction) {
                this.aclAction = aclAction;
                return this;
            }

            /**
             * The unique ID of the access control policy.
             */
            public Builder aclUuid(String aclUuid) {
                this.aclUuid = aclUuid;
                return this;
            }

            /**
             * The application ID in the access control policy.
             */
            public Builder applicationId(String applicationId) {
                this.applicationId = applicationId;
                return this;
            }

            /**
             * The type of the application that the access control policy supports. Valid values:
             * <p>
             * 
             * *   **FTP**
             * *   **HTTP**
             * *   **HTTPS**
             * *   **Memcache**
             * *   **MongoDB**
             * *   **MQTT**
             * *   **MySQL**
             * *   **RDP**
             * *   **Redis**
             * *   **SMTP**
             * *   **SMTPS**
             * *   **SSH**
             * *   **SSL**
             * *   **VNC**
             * *   **ANY**: all types of applications
             */
            public Builder applicationName(String applicationName) {
                this.applicationName = applicationName;
                return this;
            }

            /**
             * The names of applications.
             */
            public Builder applicationNameList(java.util.List < String > applicationNameList) {
                this.applicationNameList = applicationNameList;
                return this;
            }

            /**
             * The time at which the access control policy was created.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The description of the access control policy.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The destination port in the access control policy.
             */
            public Builder destPort(String destPort) {
                this.destPort = destPort;
                return this;
            }

            /**
             * The name of the destination port address book in the access control policy.
             */
            public Builder destPortGroup(String destPortGroup) {
                this.destPortGroup = destPortGroup;
                return this;
            }

            /**
             * The ports in the destination port address book.
             */
            public Builder destPortGroupPorts(java.util.List < String > destPortGroupPorts) {
                this.destPortGroupPorts = destPortGroupPorts;
                return this;
            }

            /**
             * The type of the destination port in the access control policy. Valid values:
             * <p>
             * 
             * *   **port**: port
             * *   **group**: port address book
             */
            public Builder destPortType(String destPortType) {
                this.destPortType = destPortType;
                return this;
            }

            /**
             * The destination address in the access control policy. The value of this parameter depends on the value of the DestinationType parameter. Valid values:
             * <p>
             * 
             * *   If **DestinationType** is set to **net**, the value of Destination is a CIDR block. Example: 192.0.XX.XX/24.
             * *   If **DestinationType** is set to **domain**, the value of Destination is a domain name. Example: aliyuncs.com.
             * *   If **DestinationType** is set to **group**, the value of Destination is the name of an address book. Example: db_group.
             * *   If **DestinationType** is set to **location**, the value of Destination is a location. For more information about location codes, see [AddControlPolicy](~~138867~~). Example: \["BJ11", "ZB"].
             */
            public Builder destination(String destination) {
                this.destination = destination;
                return this;
            }

            /**
             * The CIDR blocks in the destination address book.
             */
            public Builder destinationGroupCidrs(java.util.List < String > destinationGroupCidrs) {
                this.destinationGroupCidrs = destinationGroupCidrs;
                return this;
            }

            /**
             * The type of the destination address book in the access control policy. Valid values:
             * <p>
             * 
             * *   **ip**: an address book that includes one or more IP addresses
             * *   **tag**: an ECS tag-based address book that includes the IP addresses of the ECS instances with one or more specific tags
             * *   **domain**: an address book that includes one or more domain names
             * *   **threat**: an address book that includes one or more malicious IP addresses or domain names
             * *   **backsrc**: an address book that includes one or more back-to-origin addresses of Anti-DDoS Pro or Anti-DDoS Premium instances or WAF instances
             */
            public Builder destinationGroupType(String destinationGroupType) {
                this.destinationGroupType = destinationGroupType;
                return this;
            }

            /**
             * The type of the destination address in the access control policy. Valid values:
             * <p>
             * 
             * *   **net**: destination CIDR block
             * *   **group**: destination address book
             * *   **domain**: destination domain name
             * *   **location**: destination location
             */
            public Builder destinationType(String destinationType) {
                this.destinationType = destinationType;
                return this;
            }

            /**
             * The direction of the traffic to which the access control policy applies. Valid values:
             * <p>
             * 
             * *   **in**: inbound traffic
             * *   **out**: outbound traffic
             */
            public Builder direction(String direction) {
                this.direction = direction;
                return this;
            }

            /**
             * The DNS resolution result.
             */
            public Builder dnsResult(String dnsResult) {
                this.dnsResult = dnsResult;
                return this;
            }

            /**
             * The timestamp of the DNS resolution result. The value is a UNIX timestamp. Unit: seconds.
             */
            public Builder dnsResultTime(Long dnsResultTime) {
                this.dnsResultTime = dnsResultTime;
                return this;
            }

            /**
             * The timestamp when the access control policy was last hit. The value is a UNIX timestamp. Unit: seconds.
             */
            public Builder hitLastTime(Long hitLastTime) {
                this.hitLastTime = hitLastTime;
                return this;
            }

            /**
             * The number of hits for the access control policy.
             */
            public Builder hitTimes(Long hitTimes) {
                this.hitTimes = hitTimes;
                return this;
            }

            /**
             * The IP version of the address in the access control policy. Valid values:
             * <p>
             * 
             * *   **4**: IPv4
             * *   **6**: IPv6
             */
            public Builder ipVersion(Integer ipVersion) {
                this.ipVersion = ipVersion;
                return this;
            }

            /**
             * The time at which the access control policy was modified.
             */
            public Builder modifyTime(Long modifyTime) {
                this.modifyTime = modifyTime;
                return this;
            }

            /**
             * The priority of the access control policy.
             * <p>
             * 
             * The priority value starts from 1. A small priority value indicates a high priority.
             */
            public Builder order(Integer order) {
                this.order = order;
                return this;
            }

            /**
             * The type of the protocol in the access control policy. Valid values:
             * <p>
             * 
             * *   **ANY**
             * *   **TCP**
             * *   **UDP**
             * *   **ICMP**
             */
            public Builder proto(String proto) {
                this.proto = proto;
                return this;
            }

            /**
             * Indicates whether the access control policy is enabled. By default, an access control policy is enabled after it is created. Valid values:
             * <p>
             * 
             * *   **true**: The access control policy is enabled.
             * *   **false**: The access control policy is disabled.
             */
            public Builder release(String release) {
                this.release = release;
                return this;
            }

            /**
             * The source address in the access control policy. Valid values:
             * <p>
             * 
             * *   If **SourceType** is set to `net`, the value of Source is a CIDR block. Example: 192.0.XX.XX/24.
             * *   If **SourceType** is set to `group`, the value of Source is the name of an address book. Example: db_group.
             * *   If **SourceType** is set to `location`, the value of Source is a location. For more information about location codes, see [AddControlPolicy](~~138867~~). Example: \["BJ11", "ZB"].
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            /**
             * The CIDR blocks in the source address book.
             */
            public Builder sourceGroupCidrs(java.util.List < String > sourceGroupCidrs) {
                this.sourceGroupCidrs = sourceGroupCidrs;
                return this;
            }

            /**
             * The type of the source address book in the access control policy. Valid values:
             * <p>
             * 
             * *   **ip**: an address book that includes one or more IP addresses
             * *   **tag**: an Elastic Compute Service (ECS) tag-based address book that includes the IP addresses of the ECS instances with one or more specific tags
             * *   **domain**: an address book that includes one or more domain names
             * *   **threat**: an address book that includes one or more malicious IP addresses or domain names
             * *   **backsrc**: an address book that includes one or more back-to-origin addresses of Anti-DDoS Pro or Anti-DDoS Premium instances or Web Application Firewall (WAF) instances
             */
            public Builder sourceGroupType(String sourceGroupType) {
                this.sourceGroupType = sourceGroupType;
                return this;
            }

            /**
             * The type of the source address in the access control policy. Valid values:
             * <p>
             * 
             * *   **net**: source CIDR block
             * *   **group**: source address book
             * *   **location**: source location
             */
            public Builder sourceType(String sourceType) {
                this.sourceType = sourceType;
                return this;
            }

            /**
             * The total quota consumed by the returned access control policies, which is the sum of the quota consumed by each policy.
             * <p>
             * 
             * Quota that is consumed by an access control policy = Number of source CIDR blocks × Number of destination CIDR blocks, destination locations, or IP addresses that are resolved from destination domain names × Number of applications × Number of ports.
             */
            public Builder spreadCnt(Integer spreadCnt) {
                this.spreadCnt = spreadCnt;
                return this;
            }

            public Policys build() {
                return new Policys(this);
            } 

        } 

    }
}
