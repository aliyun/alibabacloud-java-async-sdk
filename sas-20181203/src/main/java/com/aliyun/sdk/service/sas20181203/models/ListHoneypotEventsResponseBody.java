// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link ListHoneypotEventsResponseBody} extends {@link TeaModel}
 *
 * <p>ListHoneypotEventsResponseBody</p>
 */
public class ListHoneypotEventsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("HoneypotEvents")
    private java.util.List<HoneypotEvents> honeypotEvents;

    @com.aliyun.core.annotation.NameInMap("PageInfo")
    private PageInfo pageInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListHoneypotEventsResponseBody(Builder builder) {
        this.honeypotEvents = builder.honeypotEvents;
        this.pageInfo = builder.pageInfo;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListHoneypotEventsResponseBody create() {
        return builder().build();
    }

    /**
     * @return honeypotEvents
     */
    public java.util.List<HoneypotEvents> getHoneypotEvents() {
        return this.honeypotEvents;
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
        private java.util.List<HoneypotEvents> honeypotEvents; 
        private PageInfo pageInfo; 
        private String requestId; 

        /**
         * <p>The intrusion events.</p>
         */
        public Builder honeypotEvents(java.util.List<HoneypotEvents> honeypotEvents) {
            this.honeypotEvents = honeypotEvents;
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
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>FBD28009-6096-5E90-BFE6-62CCD67*****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListHoneypotEventsResponseBody build() {
            return new ListHoneypotEventsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListHoneypotEventsResponseBody} extends {@link TeaModel}
     *
     * <p>ListHoneypotEventsResponseBody</p>
     */
    public static class MergeFieldList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FieldExtInfo")
        private String fieldExtInfo;

        @com.aliyun.core.annotation.NameInMap("FieldKey")
        private String fieldKey;

        @com.aliyun.core.annotation.NameInMap("FieldType")
        private String fieldType;

        @com.aliyun.core.annotation.NameInMap("FieldValue")
        private String fieldValue;

        private MergeFieldList(Builder builder) {
            this.fieldExtInfo = builder.fieldExtInfo;
            this.fieldKey = builder.fieldKey;
            this.fieldType = builder.fieldType;
            this.fieldValue = builder.fieldValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MergeFieldList create() {
            return builder().build();
        }

        /**
         * @return fieldExtInfo
         */
        public String getFieldExtInfo() {
            return this.fieldExtInfo;
        }

        /**
         * @return fieldKey
         */
        public String getFieldKey() {
            return this.fieldKey;
        }

        /**
         * @return fieldType
         */
        public String getFieldType() {
            return this.fieldType;
        }

        /**
         * @return fieldValue
         */
        public String getFieldValue() {
            return this.fieldValue;
        }

        public static final class Builder {
            private String fieldExtInfo; 
            private String fieldKey; 
            private String fieldType; 
            private String fieldValue; 

            /**
             * <p>The supplementary information about the field.</p>
             * 
             * <strong>example:</strong>
             * <p>data</p>
             */
            public Builder fieldExtInfo(String fieldExtInfo) {
                this.fieldExtInfo = fieldExtInfo;
                return this;
            }

            /**
             * <p>The key of the field.</p>
             * 
             * <strong>example:</strong>
             * <p>type</p>
             */
            public Builder fieldKey(String fieldKey) {
                this.fieldKey = fieldKey;
                return this;
            }

            /**
             * <p>The type of the field.</p>
             * 
             * <strong>example:</strong>
             * <p>level2_item1</p>
             */
            public Builder fieldType(String fieldType) {
                this.fieldType = fieldType;
                return this;
            }

            /**
             * <p>The value of the field key.</p>
             * 
             * <strong>example:</strong>
             * <p>web_access</p>
             */
            public Builder fieldValue(String fieldValue) {
                this.fieldValue = fieldValue;
                return this;
            }

            public MergeFieldList build() {
                return new MergeFieldList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListHoneypotEventsResponseBody} extends {@link TeaModel}
     *
     * <p>ListHoneypotEventsResponseBody</p>
     */
    public static class HoneypotEvents extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AgentId")
        private String agentId;

        @com.aliyun.core.annotation.NameInMap("AgentName")
        private String agentName;

        @com.aliyun.core.annotation.NameInMap("AlarmEventId")
        private Long alarmEventId;

        @com.aliyun.core.annotation.NameInMap("DstIp")
        private String dstIp;

        @com.aliyun.core.annotation.NameInMap("FirstTime")
        private Long firstTime;

        @com.aliyun.core.annotation.NameInMap("HoneypotName")
        private String honeypotName;

        @com.aliyun.core.annotation.NameInMap("LastTime")
        private Long lastTime;

        @com.aliyun.core.annotation.NameInMap("Location")
        private String location;

        @com.aliyun.core.annotation.NameInMap("MergeFieldList")
        private java.util.List<MergeFieldList> mergeFieldList;

        @com.aliyun.core.annotation.NameInMap("Protocol")
        private String protocol;

        @com.aliyun.core.annotation.NameInMap("RiskLevel")
        private String riskLevel;

        @com.aliyun.core.annotation.NameInMap("SecurityEventId")
        private Long securityEventId;

        @com.aliyun.core.annotation.NameInMap("SrcIp")
        private String srcIp;

        private HoneypotEvents(Builder builder) {
            this.agentId = builder.agentId;
            this.agentName = builder.agentName;
            this.alarmEventId = builder.alarmEventId;
            this.dstIp = builder.dstIp;
            this.firstTime = builder.firstTime;
            this.honeypotName = builder.honeypotName;
            this.lastTime = builder.lastTime;
            this.location = builder.location;
            this.mergeFieldList = builder.mergeFieldList;
            this.protocol = builder.protocol;
            this.riskLevel = builder.riskLevel;
            this.securityEventId = builder.securityEventId;
            this.srcIp = builder.srcIp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HoneypotEvents create() {
            return builder().build();
        }

        /**
         * @return agentId
         */
        public String getAgentId() {
            return this.agentId;
        }

        /**
         * @return agentName
         */
        public String getAgentName() {
            return this.agentName;
        }

        /**
         * @return alarmEventId
         */
        public Long getAlarmEventId() {
            return this.alarmEventId;
        }

        /**
         * @return dstIp
         */
        public String getDstIp() {
            return this.dstIp;
        }

        /**
         * @return firstTime
         */
        public Long getFirstTime() {
            return this.firstTime;
        }

        /**
         * @return honeypotName
         */
        public String getHoneypotName() {
            return this.honeypotName;
        }

        /**
         * @return lastTime
         */
        public Long getLastTime() {
            return this.lastTime;
        }

        /**
         * @return location
         */
        public String getLocation() {
            return this.location;
        }

        /**
         * @return mergeFieldList
         */
        public java.util.List<MergeFieldList> getMergeFieldList() {
            return this.mergeFieldList;
        }

        /**
         * @return protocol
         */
        public String getProtocol() {
            return this.protocol;
        }

        /**
         * @return riskLevel
         */
        public String getRiskLevel() {
            return this.riskLevel;
        }

        /**
         * @return securityEventId
         */
        public Long getSecurityEventId() {
            return this.securityEventId;
        }

        /**
         * @return srcIp
         */
        public String getSrcIp() {
            return this.srcIp;
        }

        public static final class Builder {
            private String agentId; 
            private String agentName; 
            private Long alarmEventId; 
            private String dstIp; 
            private Long firstTime; 
            private String honeypotName; 
            private Long lastTime; 
            private String location; 
            private java.util.List<MergeFieldList> mergeFieldList; 
            private String protocol; 
            private String riskLevel; 
            private Long securityEventId; 
            private String srcIp; 

            /**
             * <p>The probe ID.</p>
             * 
             * <strong>example:</strong>
             * <p>27d44bd5815d401992ea672874d9****</p>
             */
            public Builder agentId(String agentId) {
                this.agentId = agentId;
                return this;
            }

            /**
             * <p>The name of the probe.</p>
             * 
             * <strong>example:</strong>
             * <p>1193474_test_****</p>
             */
            public Builder agentName(String agentName) {
                this.agentName = agentName;
                return this;
            }

            /**
             * <p>The ID of the alert event.</p>
             * 
             * <strong>example:</strong>
             * <p>1900752</p>
             */
            public Builder alarmEventId(Long alarmEventId) {
                this.alarmEventId = alarmEventId;
                return this;
            }

            /**
             * <p>The destination IP address of the attack.</p>
             * 
             * <strong>example:</strong>
             * <p>112.126.205.***</p>
             */
            public Builder dstIp(String dstIp) {
                this.dstIp = dstIp;
                return this;
            }

            /**
             * <p>The timestamp at which the event was first detected.</p>
             * 
             * <strong>example:</strong>
             * <p>1692670297</p>
             */
            public Builder firstTime(Long firstTime) {
                this.firstTime = firstTime;
                return this;
            }

            /**
             * <p>The name of the honeypot.</p>
             * 
             * <strong>example:</strong>
             * <p>honeypot-2</p>
             */
            public Builder honeypotName(String honeypotName) {
                this.honeypotName = honeypotName;
                return this;
            }

            /**
             * <p>The timestamp at which the event was last detected.</p>
             * 
             * <strong>example:</strong>
             * <p>1676558664</p>
             */
            public Builder lastTime(Long lastTime) {
                this.lastTime = lastTime;
                return this;
            }

            /**
             * <p>The region.</p>
             * 
             * <strong>example:</strong>
             * <p>China Beijing</p>
             */
            public Builder location(String location) {
                this.location = location;
                return this;
            }

            /**
             * <p>The extended values that correspond to the field key.</p>
             */
            public Builder mergeFieldList(java.util.List<MergeFieldList> mergeFieldList) {
                this.mergeFieldList = mergeFieldList;
                return this;
            }

            /**
             * <p>The protocol. Valid values:</p>
             * <ul>
             * <li><strong>tcp</strong></li>
             * <li><strong>udp</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>tcp</p>
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            /**
             * <p>The risk level. Valid values:</p>
             * <ul>
             * <li><strong>2</strong>: low</li>
             * <li><strong>3</strong>: medium</li>
             * <li><strong>4</strong>: high</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder riskLevel(String riskLevel) {
                this.riskLevel = riskLevel;
                return this;
            }

            /**
             * <p>The ID of the intrusion event.</p>
             * 
             * <strong>example:</strong>
             * <p>70427821</p>
             */
            public Builder securityEventId(Long securityEventId) {
                this.securityEventId = securityEventId;
                return this;
            }

            /**
             * <p>The source IP address of the attack.</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.62.***</p>
             */
            public Builder srcIp(String srcIp) {
                this.srcIp = srcIp;
                return this;
            }

            public HoneypotEvents build() {
                return new HoneypotEvents(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListHoneypotEventsResponseBody} extends {@link TeaModel}
     *
     * <p>ListHoneypotEventsResponseBody</p>
     */
    public static class PageInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Count")
        private Integer count;

        @com.aliyun.core.annotation.NameInMap("CurrentPage")
        private Integer currentPage;

        @com.aliyun.core.annotation.NameInMap("LastRowKey")
        private String lastRowKey;

        @com.aliyun.core.annotation.NameInMap("NextToken")
        private String nextToken;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        private PageInfo(Builder builder) {
            this.count = builder.count;
            this.currentPage = builder.currentPage;
            this.lastRowKey = builder.lastRowKey;
            this.nextToken = builder.nextToken;
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
         * @return count
         */
        public Integer getCount() {
            return this.count;
        }

        /**
         * @return currentPage
         */
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        /**
         * @return lastRowKey
         */
        public String getLastRowKey() {
            return this.lastRowKey;
        }

        /**
         * @return nextToken
         */
        public String getNextToken() {
            return this.nextToken;
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
            private Integer count; 
            private Integer currentPage; 
            private String lastRowKey; 
            private String nextToken; 
            private Integer pageSize; 
            private Integer totalCount; 

            /**
             * <p>The number of entries returned on the current page.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * <p>The page number.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * <p>The key of the last data entry.</p>
             * 
             * <strong>example:</strong>
             * <p>CAESGgoSChAKDGNvbXBsZXRlVGltZRABCgQiAggAGAAiQAoJAGYXFWIAAAAACjMDLgAAADFTNzMyZDMwMzAzMDM1Mzc3Njc4MzA2ODY5NmI2YTY*********</p>
             */
            public Builder lastRowKey(String lastRowKey) {
                this.lastRowKey = lastRowKey;
                return this;
            }

            /**
             * <p>The value of the NextToken parameter that is returned by using the NextToken method.</p>
             * 
             * <strong>example:</strong>
             * <p>B604532DEF982B875E8360A6EFA3B***</p>
             */
            public Builder nextToken(String nextToken) {
                this.nextToken = nextToken;
                return this;
            }

            /**
             * <p>The number of entries per page.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The total number of entries returned.</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
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
