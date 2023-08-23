// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeNatFirewallControlPolicyResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeNatFirewallControlPolicyResponseBody</p>
 */
public class DescribeNatFirewallControlPolicyResponseBody extends TeaModel {
    @NameInMap("Policys")
    private java.util.List < Policys> policys;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private String totalCount;

    private DescribeNatFirewallControlPolicyResponseBody(Builder builder) {
        this.policys = builder.policys;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeNatFirewallControlPolicyResponseBody create() {
        return builder().build();
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
        private java.util.List < Policys> policys; 
        private String requestId; 
        private String totalCount; 

        /**
         * Policys.
         */
        public Builder policys(java.util.List < Policys> policys) {
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

        public DescribeNatFirewallControlPolicyResponseBody build() {
            return new DescribeNatFirewallControlPolicyResponseBody(this);
        } 

    } 

    public static class Policys extends TeaModel {
        @NameInMap("AclAction")
        private String aclAction;

        @NameInMap("AclUuid")
        private String aclUuid;

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

        @NameInMap("DnsResult")
        private String dnsResult;

        @NameInMap("DnsResultTime")
        private Long dnsResultTime;

        @NameInMap("DomainResolveType")
        private Integer domainResolveType;

        @NameInMap("HitLastTime")
        private Long hitLastTime;

        @NameInMap("HitTimes")
        private Integer hitTimes;

        @NameInMap("ModifyTime")
        private Long modifyTime;

        @NameInMap("NatGatewayId")
        private String natGatewayId;

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
        private String spreadCnt;

        private Policys(Builder builder) {
            this.aclAction = builder.aclAction;
            this.aclUuid = builder.aclUuid;
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
            this.dnsResult = builder.dnsResult;
            this.dnsResultTime = builder.dnsResultTime;
            this.domainResolveType = builder.domainResolveType;
            this.hitLastTime = builder.hitLastTime;
            this.hitTimes = builder.hitTimes;
            this.modifyTime = builder.modifyTime;
            this.natGatewayId = builder.natGatewayId;
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
         * @return domainResolveType
         */
        public Integer getDomainResolveType() {
            return this.domainResolveType;
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
        public Integer getHitTimes() {
            return this.hitTimes;
        }

        /**
         * @return modifyTime
         */
        public Long getModifyTime() {
            return this.modifyTime;
        }

        /**
         * @return natGatewayId
         */
        public String getNatGatewayId() {
            return this.natGatewayId;
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
        public String getSpreadCnt() {
            return this.spreadCnt;
        }

        public static final class Builder {
            private String aclAction; 
            private String aclUuid; 
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
            private String dnsResult; 
            private Long dnsResultTime; 
            private Integer domainResolveType; 
            private Long hitLastTime; 
            private Integer hitTimes; 
            private Long modifyTime; 
            private String natGatewayId; 
            private Integer order; 
            private String proto; 
            private String release; 
            private String source; 
            private java.util.List < String > sourceGroupCidrs; 
            private String sourceGroupType; 
            private String sourceType; 
            private String spreadCnt; 

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
             * ApplicationNameList.
             */
            public Builder applicationNameList(java.util.List < String > applicationNameList) {
                this.applicationNameList = applicationNameList;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
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
             * DestPort.
             */
            public Builder destPort(String destPort) {
                this.destPort = destPort;
                return this;
            }

            /**
             * DestPortGroup.
             */
            public Builder destPortGroup(String destPortGroup) {
                this.destPortGroup = destPortGroup;
                return this;
            }

            /**
             * DestPortGroupPorts.
             */
            public Builder destPortGroupPorts(java.util.List < String > destPortGroupPorts) {
                this.destPortGroupPorts = destPortGroupPorts;
                return this;
            }

            /**
             * DestPortType.
             */
            public Builder destPortType(String destPortType) {
                this.destPortType = destPortType;
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
             * DestinationGroupCidrs.
             */
            public Builder destinationGroupCidrs(java.util.List < String > destinationGroupCidrs) {
                this.destinationGroupCidrs = destinationGroupCidrs;
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
             * DnsResult.
             */
            public Builder dnsResult(String dnsResult) {
                this.dnsResult = dnsResult;
                return this;
            }

            /**
             * DnsResultTime.
             */
            public Builder dnsResultTime(Long dnsResultTime) {
                this.dnsResultTime = dnsResultTime;
                return this;
            }

            /**
             * DomainResolveType.
             */
            public Builder domainResolveType(Integer domainResolveType) {
                this.domainResolveType = domainResolveType;
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
            public Builder hitTimes(Integer hitTimes) {
                this.hitTimes = hitTimes;
                return this;
            }

            /**
             * ModifyTime.
             */
            public Builder modifyTime(Long modifyTime) {
                this.modifyTime = modifyTime;
                return this;
            }

            /**
             * NatGatewayId.
             */
            public Builder natGatewayId(String natGatewayId) {
                this.natGatewayId = natGatewayId;
                return this;
            }

            /**
             * Order.
             */
            public Builder order(Integer order) {
                this.order = order;
                return this;
            }

            /**
             * Proto.
             */
            public Builder proto(String proto) {
                this.proto = proto;
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
             * SourceGroupCidrs.
             */
            public Builder sourceGroupCidrs(java.util.List < String > sourceGroupCidrs) {
                this.sourceGroupCidrs = sourceGroupCidrs;
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

            /**
             * SpreadCnt.
             */
            public Builder spreadCnt(String spreadCnt) {
                this.spreadCnt = spreadCnt;
                return this;
            }

            public Policys build() {
                return new Policys(this);
            } 

        } 

    }
}
