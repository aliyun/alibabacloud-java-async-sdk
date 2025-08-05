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
         * PageNo.
         */
        public Builder pageNo(String pageNo) {
            this.pageNo = pageNo;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(String pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * Policys.
         */
        public Builder policys(java.util.List<Policys> policys) {
            this.policys = policys;
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
         * TotalCount.
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
             * AclAction.
             */
            public Builder aclAction(String aclAction) {
                this.aclAction = aclAction;
                return this;
            }

            /**
             * AclUuid.
             */
            public Builder aclUuid(String aclUuid) {
                this.aclUuid = aclUuid;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * Destination.
             */
            public Builder destination(String destination) {
                this.destination = destination;
                return this;
            }

            /**
             * DestinationAddrs.
             */
            public Builder destinationAddrs(java.util.List<String> destinationAddrs) {
                this.destinationAddrs = destinationAddrs;
                return this;
            }

            /**
             * DestinationGroupType.
             */
            public Builder destinationGroupType(String destinationGroupType) {
                this.destinationGroupType = destinationGroupType;
                return this;
            }

            /**
             * DestinationType.
             */
            public Builder destinationType(String destinationType) {
                this.destinationType = destinationType;
                return this;
            }

            /**
             * Direction.
             */
            public Builder direction(String direction) {
                this.direction = direction;
                return this;
            }

            /**
             * HitLastTime.
             */
            public Builder hitLastTime(Long hitLastTime) {
                this.hitLastTime = hitLastTime;
                return this;
            }

            /**
             * HitTimes.
             */
            public Builder hitTimes(Long hitTimes) {
                this.hitTimes = hitTimes;
                return this;
            }

            /**
             * IpVersion.
             */
            public Builder ipVersion(Integer ipVersion) {
                this.ipVersion = ipVersion;
                return this;
            }

            /**
             * Priority.
             */
            public Builder priority(Integer priority) {
                this.priority = priority;
                return this;
            }

            /**
             * Release.
             */
            public Builder release(String release) {
                this.release = release;
                return this;
            }

            /**
             * Source.
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            /**
             * SourceAddrs.
             */
            public Builder sourceAddrs(java.util.List<String> sourceAddrs) {
                this.sourceAddrs = sourceAddrs;
                return this;
            }

            /**
             * SourceGroupType.
             */
            public Builder sourceGroupType(String sourceGroupType) {
                this.sourceGroupType = sourceGroupType;
                return this;
            }

            /**
             * SourceType.
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
