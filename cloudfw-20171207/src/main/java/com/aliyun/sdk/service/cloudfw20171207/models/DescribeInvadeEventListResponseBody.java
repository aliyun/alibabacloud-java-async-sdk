// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeInvadeEventListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInvadeEventListResponseBody</p>
 */
public class DescribeInvadeEventListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("EventList")
    private java.util.List < EventList> eventList;

    @com.aliyun.core.annotation.NameInMap("HighLevelPercent")
    private Integer highLevelPercent;

    @com.aliyun.core.annotation.NameInMap("LowLevelPercent")
    private Integer lowLevelPercent;

    @com.aliyun.core.annotation.NameInMap("MiddleLevelPercent")
    private Integer middleLevelPercent;

    @com.aliyun.core.annotation.NameInMap("PageInfo")
    private PageInfo pageInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * <p>An array that consists of breach awareness events.</p>
         */
        public Builder eventList(java.util.List < EventList> eventList) {
            this.eventList = eventList;
            return this;
        }

        /**
         * <p>The percentage of high-risk events.</p>
         * 
         * <strong>example:</strong>
         * <p>40</p>
         */
        public Builder highLevelPercent(Integer highLevelPercent) {
            this.highLevelPercent = highLevelPercent;
            return this;
        }

        /**
         * <p>The percentage of low-risk events.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder lowLevelPercent(Integer lowLevelPercent) {
            this.lowLevelPercent = lowLevelPercent;
            return this;
        }

        /**
         * <p>The percentage of medium-risk events.</p>
         * 
         * <strong>example:</strong>
         * <p>40</p>
         */
        public Builder middleLevelPercent(Integer middleLevelPercent) {
            this.middleLevelPercent = middleLevelPercent;
            return this;
        }

        /**
         * <p>The pagination information.</p>
         */
        public Builder pageInfo(PageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>F0F82705-CFC7-5F83-86C8-A063892F****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeInvadeEventListResponseBody build() {
            return new DescribeInvadeEventListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeInvadeEventListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInvadeEventListResponseBody</p>
     */
    public static class EventList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AssetsInstanceId")
        private String assetsInstanceId;

        @com.aliyun.core.annotation.NameInMap("AssetsInstanceName")
        private String assetsInstanceName;

        @com.aliyun.core.annotation.NameInMap("AssetsType")
        private String assetsType;

        @com.aliyun.core.annotation.NameInMap("EventKey")
        private String eventKey;

        @com.aliyun.core.annotation.NameInMap("EventName")
        private String eventName;

        @com.aliyun.core.annotation.NameInMap("EventSrc")
        private String eventSrc;

        @com.aliyun.core.annotation.NameInMap("EventUuid")
        private String eventUuid;

        @com.aliyun.core.annotation.NameInMap("FirstTime")
        private Integer firstTime;

        @com.aliyun.core.annotation.NameInMap("IsIgnore")
        private Boolean isIgnore;

        @com.aliyun.core.annotation.NameInMap("LastTime")
        private Integer lastTime;

        @com.aliyun.core.annotation.NameInMap("MemberUid")
        private String memberUid;

        @com.aliyun.core.annotation.NameInMap("PrivateIP")
        private String privateIP;

        @com.aliyun.core.annotation.NameInMap("ProcessStatus")
        private Integer processStatus;

        @com.aliyun.core.annotation.NameInMap("PublicIP")
        private String publicIP;

        @com.aliyun.core.annotation.NameInMap("PublicIpType")
        private String publicIpType;

        @com.aliyun.core.annotation.NameInMap("RiskLevel")
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
             * <p>The ID of the affected asset.</p>
             * 
             * <strong>example:</strong>
             * <p>i-ECS****</p>
             */
            public Builder assetsInstanceId(String assetsInstanceId) {
                this.assetsInstanceId = assetsInstanceId;
                return this;
            }

            /**
             * <p>The name of the affected asset.</p>
             * 
             * <strong>example:</strong>
             * <p>ECS_test</p>
             */
            public Builder assetsInstanceName(String assetsInstanceName) {
                this.assetsInstanceName = assetsInstanceName;
                return this;
            }

            /**
             * <p>The type of the affected asset. Valid values:</p>
             * <ul>
             * <li><strong>BastionHostIP</strong>: the egress IP address of a bastion host</li>
             * <li><strong>BastionHostIngressIP</strong>: the ingress IP address of a bastion host</li>
             * <li><strong>EcsEIP</strong>: the elastic IP address (EIP) of an Elastic Compute Service (ECS) instance</li>
             * <li><strong>EcsPublicIP</strong>: the public IP address of an ECS instance</li>
             * <li><strong>EIP</strong>: the EIP</li>
             * <li><strong>EniEIP</strong>: the EIP of an elastic network interface (ENI)</li>
             * <li><strong>NatEIP</strong>: the EIP of a NAT gateway</li>
             * <li><strong>SlbEIP</strong>: the EIP of a Server Load Balancer (SLB) instance</li>
             * <li><strong>SlbPublicIP</strong>: the public IP address of an SLB instance</li>
             * <li><strong>NatPublicIP</strong>: the public IP address of a NAT gateway</li>
             * <li><strong>HAVIP</strong>: the high-availability virtual IP address (HAVIP)</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>EcsPublicIp</p>
             */
            public Builder assetsType(String assetsType) {
                this.assetsType = assetsType;
                return this;
            }

            /**
             * <p>The ID of the breach awareness event.</p>
             * 
             * <strong>example:</strong>
             * <p>69d189e2-ec17-4676-a2fe-02969234****</p>
             */
            public Builder eventKey(String eventKey) {
                this.eventKey = eventKey;
                return this;
            }

            /**
             * <p>The name of the breach awareness event.</p>
             * 
             * <strong>example:</strong>
             * <p>event_test</p>
             */
            public Builder eventName(String eventName) {
                this.eventName = eventName;
                return this;
            }

            /**
             * <p>The type of the breach awareness event. Valid values:</p>
             * <ul>
             * <li><strong>IPS</strong>: intrusion prevention event</li>
             * <li><strong>offline</strong>: disconnection event</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>IPS</p>
             */
            public Builder eventSrc(String eventSrc) {
                this.eventSrc = eventSrc;
                return this;
            }

            /**
             * <p>The UUID of the breach awareness event.</p>
             * 
             * <strong>example:</strong>
             * <p>fadd-dfdd-****</p>
             */
            public Builder eventUuid(String eventUuid) {
                this.eventUuid = eventUuid;
                return this;
            }

            /**
             * <p>The time when the breach awareness event first occurred. The value is a UNIX timestamp. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1656750960</p>
             */
            public Builder firstTime(Integer firstTime) {
                this.firstTime = firstTime;
                return this;
            }

            /**
             * <p>Indicates whether the breach awareness event is ignored. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: The breach awareness event is ignored.</li>
             * <li><strong>false</strong>: The breach awareness event is not ignored.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder isIgnore(Boolean isIgnore) {
                this.isIgnore = isIgnore;
                return this;
            }

            /**
             * <p>The time when the breach awareness event last occurred. The value is a UNIX timestamp. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1656837360</p>
             */
            public Builder lastTime(Integer lastTime) {
                this.lastTime = lastTime;
                return this;
            }

            /**
             * <p>The ID of the member.</p>
             * 
             * <strong>example:</strong>
             * <p>135809047715****</p>
             */
            public Builder memberUid(String memberUid) {
                this.memberUid = memberUid;
                return this;
            }

            /**
             * <p>The private IP address of the affected asset.</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.XX.XX</p>
             */
            public Builder privateIP(String privateIP) {
                this.privateIP = privateIP;
                return this;
            }

            /**
             * <p>The handling status of the breach awareness event. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: unhandled</li>
             * <li><strong>20</strong>: handled</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder processStatus(Integer processStatus) {
                this.processStatus = processStatus;
                return this;
            }

            /**
             * <p>The public IP address of the affected asset.</p>
             * 
             * <strong>example:</strong>
             * <p>198.51.XX.XX</p>
             */
            public Builder publicIP(String publicIP) {
                this.publicIP = publicIP;
                return this;
            }

            /**
             * <p>The type of the affected asset. Valid values:</p>
             * <ul>
             * <li><strong>BastionHostIP</strong>: the egress IP address of a bastion host</li>
             * <li><strong>BastionHostIngressIP</strong>: the ingress IP address of a bastion host</li>
             * <li><strong>EcsEIP</strong>: the EIP of an ECS instance</li>
             * <li><strong>EcsPublicIP</strong>: the public IP address of an ECS instance</li>
             * <li><strong>EIP</strong>: the EIP</li>
             * <li><strong>EniEIP</strong>: the EIP of an ENI</li>
             * <li><strong>NatEIP</strong>: the EIP of a NAT gateway</li>
             * <li><strong>SlbEIP</strong>: the EIP of an SLB instance</li>
             * <li><strong>SlbPublicIP</strong>: the public IP address of an SLB instance</li>
             * <li><strong>NatPublicIP</strong>: the public IP address of a NAT gateway</li>
             * <li><strong>HAVIP</strong>: the HAVIP</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>EcsPublicIp</p>
             */
            public Builder publicIpType(String publicIpType) {
                this.publicIpType = publicIpType;
                return this;
            }

            /**
             * <p>The risk level. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: low</li>
             * <li><strong>2</strong>: medium</li>
             * <li><strong>3</strong>: high</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
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
    /**
     * 
     * {@link DescribeInvadeEventListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInvadeEventListResponseBody</p>
     */
    public static class PageInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CurrentPage")
        private Integer currentPage;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
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
             * <p>The page number of the returned page.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * <p>The number of entries returned per page.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The total number of breach awareness events.</p>
             * 
             * <strong>example:</strong>
             * <p>40</p>
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
