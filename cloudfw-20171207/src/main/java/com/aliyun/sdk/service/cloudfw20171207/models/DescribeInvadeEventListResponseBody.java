// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeInvadeEventListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInvadeEventListResponseBody</p>
 */
public class DescribeInvadeEventListResponseBody extends TeaModel {
    @NameInMap("EventList")
    private java.util.List < EventList> eventList;

    @NameInMap("HighLevelPercent")
    private Integer highLevelPercent;

    @NameInMap("LowLevelPercent")
    private Integer lowLevelPercent;

    @NameInMap("MiddleLevelPercent")
    private Integer middleLevelPercent;

    @NameInMap("PageInfo")
    private PageInfo pageInfo;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeInvadeEventListResponseBody(Builder builder) {
        this.eventList = builder.eventList;
        this.highLevelPercent = builder.highLevelPercent;
        this.lowLevelPercent = builder.lowLevelPercent;
        this.middleLevelPercent = builder.middleLevelPercent;
        this.pageInfo = builder.pageInfo;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInvadeEventListResponseBody create() {
        return builder().build();
    }

    /**
     * @return eventList
     */
    public java.util.List < EventList> getEventList() {
        return this.eventList;
    }

    /**
     * @return highLevelPercent
     */
    public Integer getHighLevelPercent() {
        return this.highLevelPercent;
    }

    /**
     * @return lowLevelPercent
     */
    public Integer getLowLevelPercent() {
        return this.lowLevelPercent;
    }

    /**
     * @return middleLevelPercent
     */
    public Integer getMiddleLevelPercent() {
        return this.middleLevelPercent;
    }

    /**
     * @return pageInfo
     */
    public PageInfo getPageInfo() {
        return this.pageInfo;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < EventList> eventList; 
        private Integer highLevelPercent; 
        private Integer lowLevelPercent; 
        private Integer middleLevelPercent; 
        private PageInfo pageInfo; 
        private String requestId; 

        /**
         * An array that consists of breach awareness events.
         */
        public Builder eventList(java.util.List < EventList> eventList) {
            this.eventList = eventList;
            return this;
        }

        /**
         * The percentage of high-risk events.
         */
        public Builder highLevelPercent(Integer highLevelPercent) {
            this.highLevelPercent = highLevelPercent;
            return this;
        }

        /**
         * The percentage of low-risk events.
         */
        public Builder lowLevelPercent(Integer lowLevelPercent) {
            this.lowLevelPercent = lowLevelPercent;
            return this;
        }

        /**
         * The percentage of medium-risk events.
         */
        public Builder middleLevelPercent(Integer middleLevelPercent) {
            this.middleLevelPercent = middleLevelPercent;
            return this;
        }

        /**
         * The pagination information.
         */
        public Builder pageInfo(PageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeInvadeEventListResponseBody build() {
            return new DescribeInvadeEventListResponseBody(this);
        } 

    } 

    public static class EventList extends TeaModel {
        @NameInMap("AssetsInstanceId")
        private String assetsInstanceId;

        @NameInMap("AssetsInstanceName")
        private String assetsInstanceName;

        @NameInMap("AssetsType")
        private String assetsType;

        @NameInMap("EventKey")
        private String eventKey;

        @NameInMap("EventName")
        private String eventName;

        @NameInMap("EventSrc")
        private String eventSrc;

        @NameInMap("EventUuid")
        private String eventUuid;

        @NameInMap("FirstTime")
        private Integer firstTime;

        @NameInMap("IsIgnore")
        private Boolean isIgnore;

        @NameInMap("LastTime")
        private Integer lastTime;

        @NameInMap("MemberUid")
        private String memberUid;

        @NameInMap("PrivateIP")
        private String privateIP;

        @NameInMap("ProcessStatus")
        private Integer processStatus;

        @NameInMap("PublicIP")
        private String publicIP;

        @NameInMap("PublicIpType")
        private String publicIpType;

        @NameInMap("RiskLevel")
        private Integer riskLevel;

        private EventList(Builder builder) {
            this.assetsInstanceId = builder.assetsInstanceId;
            this.assetsInstanceName = builder.assetsInstanceName;
            this.assetsType = builder.assetsType;
            this.eventKey = builder.eventKey;
            this.eventName = builder.eventName;
            this.eventSrc = builder.eventSrc;
            this.eventUuid = builder.eventUuid;
            this.firstTime = builder.firstTime;
            this.isIgnore = builder.isIgnore;
            this.lastTime = builder.lastTime;
            this.memberUid = builder.memberUid;
            this.privateIP = builder.privateIP;
            this.processStatus = builder.processStatus;
            this.publicIP = builder.publicIP;
            this.publicIpType = builder.publicIpType;
            this.riskLevel = builder.riskLevel;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EventList create() {
            return builder().build();
        }

        /**
         * @return assetsInstanceId
         */
        public String getAssetsInstanceId() {
            return this.assetsInstanceId;
        }

        /**
         * @return assetsInstanceName
         */
        public String getAssetsInstanceName() {
            return this.assetsInstanceName;
        }

        /**
         * @return assetsType
         */
        public String getAssetsType() {
            return this.assetsType;
        }

        /**
         * @return eventKey
         */
        public String getEventKey() {
            return this.eventKey;
        }

        /**
         * @return eventName
         */
        public String getEventName() {
            return this.eventName;
        }

        /**
         * @return eventSrc
         */
        public String getEventSrc() {
            return this.eventSrc;
        }

        /**
         * @return eventUuid
         */
        public String getEventUuid() {
            return this.eventUuid;
        }

        /**
         * @return firstTime
         */
        public Integer getFirstTime() {
            return this.firstTime;
        }

        /**
         * @return isIgnore
         */
        public Boolean getIsIgnore() {
            return this.isIgnore;
        }

        /**
         * @return lastTime
         */
        public Integer getLastTime() {
            return this.lastTime;
        }

        /**
         * @return memberUid
         */
        public String getMemberUid() {
            return this.memberUid;
        }

        /**
         * @return privateIP
         */
        public String getPrivateIP() {
            return this.privateIP;
        }

        /**
         * @return processStatus
         */
        public Integer getProcessStatus() {
            return this.processStatus;
        }

        /**
         * @return publicIP
         */
        public String getPublicIP() {
            return this.publicIP;
        }

        /**
         * @return publicIpType
         */
        public String getPublicIpType() {
            return this.publicIpType;
        }

        /**
         * @return riskLevel
         */
        public Integer getRiskLevel() {
            return this.riskLevel;
        }

        public static final class Builder {
            private String assetsInstanceId; 
            private String assetsInstanceName; 
            private String assetsType; 
            private String eventKey; 
            private String eventName; 
            private String eventSrc; 
            private String eventUuid; 
            private Integer firstTime; 
            private Boolean isIgnore; 
            private Integer lastTime; 
            private String memberUid; 
            private String privateIP; 
            private Integer processStatus; 
            private String publicIP; 
            private String publicIpType; 
            private Integer riskLevel; 

            /**
             * The ID of the affected asset.
             */
            public Builder assetsInstanceId(String assetsInstanceId) {
                this.assetsInstanceId = assetsInstanceId;
                return this;
            }

            /**
             * The name of the affected asset.
             */
            public Builder assetsInstanceName(String assetsInstanceName) {
                this.assetsInstanceName = assetsInstanceName;
                return this;
            }

            /**
             * The type of the affected asset. Valid values:
             * <p>
             * 
             * *   **BastionHostIP**: the egress IP address of a bastion host
             * *   **BastionHostIngressIP**: the ingress IP address of a bastion host
             * *   **EcsEIP**: the elastic IP address (EIP) of an Elastic Compute Service (ECS) instance
             * *   **EcsPublicIP**: the public IP address of an ECS instance
             * *   **EIP**: the EIP
             * *   **EniEIP**: the EIP of an elastic network interface (ENI)
             * *   **NatEIP**: the EIP of a NAT gateway
             * *   **SlbEIP**: the EIP of a Server Load Balancer (SLB) instance
             * *   **SlbPublicIP**: the public IP address of an SLB instance
             * *   **NatPublicIP**: the public IP address of a NAT gateway
             * *   **HAVIP**: the high-availability virtual IP address (HAVIP)
             */
            public Builder assetsType(String assetsType) {
                this.assetsType = assetsType;
                return this;
            }

            /**
             * The ID of the breach awareness event.
             */
            public Builder eventKey(String eventKey) {
                this.eventKey = eventKey;
                return this;
            }

            /**
             * The name of the breach awareness event.
             */
            public Builder eventName(String eventName) {
                this.eventName = eventName;
                return this;
            }

            /**
             * The type of the breach awareness event. Valid values:
             * <p>
             * 
             * *   **IPS**: intrusion prevention event
             * *   **offline**: disconnection event
             */
            public Builder eventSrc(String eventSrc) {
                this.eventSrc = eventSrc;
                return this;
            }

            /**
             * The UUID of the breach awareness event.
             */
            public Builder eventUuid(String eventUuid) {
                this.eventUuid = eventUuid;
                return this;
            }

            /**
             * The time when the breach awareness event first occurred. The value is a UNIX timestamp. Unit: seconds.
             */
            public Builder firstTime(Integer firstTime) {
                this.firstTime = firstTime;
                return this;
            }

            /**
             * Indicates whether the breach awareness event is ignored. Valid values:
             * <p>
             * 
             * *   **true**: The breach awareness event is ignored.
             * *   **false**: The breach awareness event is not ignored.
             */
            public Builder isIgnore(Boolean isIgnore) {
                this.isIgnore = isIgnore;
                return this;
            }

            /**
             * The time when the breach awareness event last occurred. The value is a UNIX timestamp. Unit: seconds.
             */
            public Builder lastTime(Integer lastTime) {
                this.lastTime = lastTime;
                return this;
            }

            /**
             * The ID of the member.
             */
            public Builder memberUid(String memberUid) {
                this.memberUid = memberUid;
                return this;
            }

            /**
             * The private IP address of the affected asset.
             */
            public Builder privateIP(String privateIP) {
                this.privateIP = privateIP;
                return this;
            }

            /**
             * The handling status of the breach awareness event. Valid values:
             * <p>
             * 
             * *   **0**: unhandled
             * *   **20**: handled
             */
            public Builder processStatus(Integer processStatus) {
                this.processStatus = processStatus;
                return this;
            }

            /**
             * The public IP address of the affected asset.
             */
            public Builder publicIP(String publicIP) {
                this.publicIP = publicIP;
                return this;
            }

            /**
             * The type of the affected asset. Valid values:
             * <p>
             * 
             * *   **BastionHostIP**: the egress IP address of a bastion host
             * *   **BastionHostIngressIP**: the ingress IP address of a bastion host
             * *   **EcsEIP**: the EIP of an ECS instance
             * *   **EcsPublicIP**: the public IP address of an ECS instance
             * *   **EIP**: the EIP
             * *   **EniEIP**: the EIP of an ENI
             * *   **NatEIP**: the EIP of a NAT gateway
             * *   **SlbEIP**: the EIP of an SLB instance
             * *   **SlbPublicIP**: the public IP address of an SLB instance
             * *   **NatPublicIP**: the public IP address of a NAT gateway
             * *   **HAVIP**: the HAVIP
             */
            public Builder publicIpType(String publicIpType) {
                this.publicIpType = publicIpType;
                return this;
            }

            /**
             * The risk level. Valid values:
             * <p>
             * 
             * *   **1**: low
             * *   **2**: medium
             * *   **3**: high
             */
            public Builder riskLevel(Integer riskLevel) {
                this.riskLevel = riskLevel;
                return this;
            }

            public EventList build() {
                return new EventList(this);
            } 

        } 

    }
    public static class PageInfo extends TeaModel {
        @NameInMap("CurrentPage")
        private Integer currentPage;

        @NameInMap("PageSize")
        private Integer pageSize;

        @NameInMap("TotalCount")
        private Integer totalCount;

        private PageInfo(Builder builder) {
            this.currentPage = builder.currentPage;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PageInfo create() {
            return builder().build();
        }

        /**
         * @return currentPage
         */
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private Integer currentPage; 
            private Integer pageSize; 
            private Integer totalCount; 

            /**
             * The page number of the returned page.
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * The number of entries returned per page.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * The total number of breach awareness events.
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public PageInfo build() {
                return new PageInfo(this);
            } 

        } 

    }
}
