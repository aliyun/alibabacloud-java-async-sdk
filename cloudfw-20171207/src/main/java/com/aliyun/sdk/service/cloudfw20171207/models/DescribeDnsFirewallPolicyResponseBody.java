// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

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
 * {@link DescribeDnsFirewallPolicyResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDnsFirewallPolicyResponseBody</p>
 */
public class DescribeDnsFirewallPolicyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageNo")
    private String pageNo;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private String pageSize;

    @com.aliyun.core.annotation.NameInMap("Policys")
    private java.util.List<Policys> policys;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private String totalCount;

    private DescribeDnsFirewallPolicyResponseBody(Builder builder) {
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.policys = builder.policys;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDnsFirewallPolicyResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List<Policys> getPolicys() {
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
        private java.util.List<Policys> policys; 
        private String requestId; 
        private String totalCount; 

        private Builder() {
        } 

        private Builder(DescribeDnsFirewallPolicyResponseBody model) {
            this.pageNo = model.pageNo;
            this.pageSize = model.pageSize;
            this.policys = model.policys;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNo(String pageNo) {
            this.pageNo = pageNo;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(String pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The DNS firewall access control policies.</p>
         */
        public Builder policys(java.util.List<Policys> policys) {
            this.policys = policys;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>0A4ACDE9-9F9F-56C1-B3B7-60971BA1****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder totalCount(String totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeDnsFirewallPolicyResponseBody build() {
            return new DescribeDnsFirewallPolicyResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDnsFirewallPolicyResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDnsFirewallPolicyResponseBody</p>
     */
    public static class Policys extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AclAction")
        private String aclAction;

        @com.aliyun.core.annotation.NameInMap("AclUuid")
        private String aclUuid;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Destination")
        private String destination;

        @com.aliyun.core.annotation.NameInMap("DestinationAddrs")
        private java.util.List<String> destinationAddrs;

        @com.aliyun.core.annotation.NameInMap("DestinationGroupType")
        private String destinationGroupType;

        @com.aliyun.core.annotation.NameInMap("DestinationType")
        private String destinationType;

        @com.aliyun.core.annotation.NameInMap("Direction")
        private String direction;

        @com.aliyun.core.annotation.NameInMap("HitLastTime")
        private Long hitLastTime;

        @com.aliyun.core.annotation.NameInMap("HitTimes")
        private Long hitTimes;

        @com.aliyun.core.annotation.NameInMap("IpVersion")
        private Integer ipVersion;

        @com.aliyun.core.annotation.NameInMap("Priority")
        private Integer priority;

        @com.aliyun.core.annotation.NameInMap("Release")
        private String release;

        @com.aliyun.core.annotation.NameInMap("Source")
        private String source;

        @com.aliyun.core.annotation.NameInMap("SourceAddrs")
        private java.util.List<String> sourceAddrs;

        @com.aliyun.core.annotation.NameInMap("SourceGroupType")
        private String sourceGroupType;

        @com.aliyun.core.annotation.NameInMap("SourceType")
        private String sourceType;

        private Policys(Builder builder) {
            this.aclAction = builder.aclAction;
            this.aclUuid = builder.aclUuid;
            this.description = builder.description;
            this.destination = builder.destination;
            this.destinationAddrs = builder.destinationAddrs;
            this.destinationGroupType = builder.destinationGroupType;
            this.destinationType = builder.destinationType;
            this.direction = builder.direction;
            this.hitLastTime = builder.hitLastTime;
            this.hitTimes = builder.hitTimes;
            this.ipVersion = builder.ipVersion;
            this.priority = builder.priority;
            this.release = builder.release;
            this.source = builder.source;
            this.sourceAddrs = builder.sourceAddrs;
            this.sourceGroupType = builder.sourceGroupType;
            this.sourceType = builder.sourceType;
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
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return destination
         */
        public String getDestination() {
            return this.destination;
        }

        /**
         * @return destinationAddrs
         */
        public java.util.List<String> getDestinationAddrs() {
            return this.destinationAddrs;
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
         * @return priority
         */
        public Integer getPriority() {
            return this.priority;
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
         * @return sourceAddrs
         */
        public java.util.List<String> getSourceAddrs() {
            return this.sourceAddrs;
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

        public static final class Builder {
            private String aclAction; 
            private String aclUuid; 
            private String description; 
            private String destination; 
            private java.util.List<String> destinationAddrs; 
            private String destinationGroupType; 
            private String destinationType; 
            private String direction; 
            private Long hitLastTime; 
            private Long hitTimes; 
            private Integer ipVersion; 
            private Integer priority; 
            private String release; 
            private String source; 
            private java.util.List<String> sourceAddrs; 
            private String sourceGroupType; 
            private String sourceType; 

            private Builder() {
            } 

            private Builder(Policys model) {
                this.aclAction = model.aclAction;
                this.aclUuid = model.aclUuid;
                this.description = model.description;
                this.destination = model.destination;
                this.destinationAddrs = model.destinationAddrs;
                this.destinationGroupType = model.destinationGroupType;
                this.destinationType = model.destinationType;
                this.direction = model.direction;
                this.hitLastTime = model.hitLastTime;
                this.hitTimes = model.hitTimes;
                this.ipVersion = model.ipVersion;
                this.priority = model.priority;
                this.release = model.release;
                this.source = model.source;
                this.sourceAddrs = model.sourceAddrs;
                this.sourceGroupType = model.sourceGroupType;
                this.sourceType = model.sourceType;
            } 

            /**
             * <p>The action that is performed on traffic that matches the access control policy. Valid values:</p>
             * <ul>
             * <li><p><strong>accept</strong>: allows the traffic.</p>
             * </li>
             * <li><p><strong>drop</strong>: denies the traffic.</p>
             * </li>
             * <li><p><strong>log</strong>: monitors the traffic.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>accept</p>
             */
            public Builder aclAction(String aclAction) {
                this.aclAction = aclAction;
                return this;
            }

            /**
             * <p>The unique ID of the access control policy.</p>
             * 
             * <strong>example:</strong>
             * <p>01281255-d220-4db1-8f4f-c4df221a****</p>
             */
            public Builder aclUuid(String aclUuid) {
                this.aclUuid = aclUuid;
                return this;
            }

            /**
             * <p>The description of the access control policy.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The destination address in the access control policy. Valid values:</p>
             * <ul>
             * <li><p>If <strong>DestinationType</strong> is <code>net</code>, the value of this parameter is a destination CIDR block.</p>
             * </li>
             * <li><p>If <strong>DestinationType</strong> is <code>domain</code>, the value of this parameter is a destination domain.</p>
             * </li>
             * <li><p>If <strong>DestinationType</strong> is <code>group</code>, the value of this parameter is the name of a destination address book.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>x.x.x.x/32</p>
             */
            public Builder destination(String destination) {
                this.destination = destination;
                return this;
            }

            /**
             * <p>The destination addresses in the address book.</p>
             */
            public Builder destinationAddrs(java.util.List<String> destinationAddrs) {
                this.destinationAddrs = destinationAddrs;
                return this;
            }

            /**
             * <p>The type of the destination address book in the access control policy. Valid values:</p>
             * <ul>
             * <li><p><strong>ip</strong>: an IP address book</p>
             * </li>
             * <li><p><strong>domain</strong>: a domain address book</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ip</p>
             */
            public Builder destinationGroupType(String destinationGroupType) {
                this.destinationGroupType = destinationGroupType;
                return this;
            }

            /**
             * <p>The type of the destination address in the access control policy. Valid values:</p>
             * <ul>
             * <li><p><strong>net</strong>: destination CIDR block</p>
             * </li>
             * <li><p><strong>group</strong>: destination address book</p>
             * </li>
             * <li><p><strong>domain</strong>: destination domain</p>
             * </li>
             * <li><p><strong>location</strong>: destination location</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>net</p>
             */
            public Builder destinationType(String destinationType) {
                this.destinationType = destinationType;
                return this;
            }

            /**
             * <p>The direction of the traffic to which the access control policy applies. Valid values:</p>
             * <ul>
             * <li><p><strong>in</strong>: inbound traffic</p>
             * </li>
             * <li><p><strong>out</strong>: outbound traffic</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>in</p>
             */
            public Builder direction(String direction) {
                this.direction = direction;
                return this;
            }

            /**
             * <p>The last time the policy was hit. The value is a UNIX timestamp. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1579261141</p>
             */
            public Builder hitLastTime(Long hitLastTime) {
                this.hitLastTime = hitLastTime;
                return this;
            }

            /**
             * <p>The number of hits for the access control policy.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder hitTimes(Long hitTimes) {
                this.hitTimes = hitTimes;
                return this;
            }

            /**
             * <p>The IP version supported by the access control policy. Valid values:</p>
             * <ul>
             * <li><p><strong>4</strong>: IPv4</p>
             * </li>
             * <li><p><strong>6</strong>: IPv6</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>6</p>
             */
            public Builder ipVersion(Integer ipVersion) {
                this.ipVersion = ipVersion;
                return this;
            }

            /**
             * <p>The priority of the access control policy. A smaller value indicates a higher priority.</p>
             * 
             * <strong>example:</strong>
             * <p>110</p>
             */
            public Builder priority(Integer priority) {
                this.priority = priority;
                return this;
            }

            /**
             * <p>Indicates whether the access control policy is enabled. After a policy is created, it is enabled by default. Valid values:</p>
             * <ul>
             * <li><p><strong>true</strong>: enabled</p>
             * </li>
             * <li><p><strong>false</strong>: disabled</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder release(String release) {
                this.release = release;
                return this;
            }

            /**
             * <p>The source address in the access control policy. Valid values:</p>
             * <ul>
             * <li><p>If <strong>SourceType</strong> is <code>net</code>, the value of this parameter is a source CIDR block. Example: 192.0.XX.XX/24.</p>
             * </li>
             * <li><p>If <strong>SourceType</strong> is <code>group</code>, the value of this parameter is the name of a source address book. Example: db_group.</p>
             * </li>
             * <li><p>If <strong>SourceType</strong> is <code>location</code>, the value of this parameter is a location. For more information about the valid values of this parameter, see <a href="https://help.aliyun.com/document_detail/138867.html">AddControlPolicy</a>. Example: [&quot;BJ11&quot;, &quot;ZB&quot;].</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>192.0.XX.XX/24</p>
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            /**
             * <p>The source addresses.</p>
             */
            public Builder sourceAddrs(java.util.List<String> sourceAddrs) {
                this.sourceAddrs = sourceAddrs;
                return this;
            }

            /**
             * <p>The type of the source address book in the access control policy. Valid values:</p>
             * <ul>
             * <li><p><strong>ip</strong>: an IP address book</p>
             * </li>
             * <li><p><strong>tag</strong>: a tag address book</p>
             * </li>
             * <li><p><strong>domain</strong>: a domain address book</p>
             * </li>
             * <li><p><strong>threat</strong>: a threat intelligence address book</p>
             * </li>
             * <li><p><strong>backsrc</strong>: a back-to-origin address book</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ip</p>
             */
            public Builder sourceGroupType(String sourceGroupType) {
                this.sourceGroupType = sourceGroupType;
                return this;
            }

            /**
             * <p>The type of the source address in the access control policy. Valid values:</p>
             * <ul>
             * <li><p><strong>net</strong>: a source CIDR block</p>
             * </li>
             * <li><p><strong>group</strong>: a source address book</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>net</p>
             */
            public Builder sourceType(String sourceType) {
                this.sourceType = sourceType;
                return this;
            }

            public Policys build() {
                return new Policys(this);
            } 

        } 

    }
}
