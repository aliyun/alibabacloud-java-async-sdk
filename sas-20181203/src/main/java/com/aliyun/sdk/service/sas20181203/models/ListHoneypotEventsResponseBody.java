// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListHoneypotEventsResponseBody} extends {@link TeaModel}
 *
 * <p>ListHoneypotEventsResponseBody</p>
 */
public class ListHoneypotEventsResponseBody extends TeaModel {
    @NameInMap("HoneypotEvents")
    private java.util.List < HoneypotEvents> honeypotEvents;

    @NameInMap("PageInfo")
    private PageInfo pageInfo;

    @NameInMap("RequestId")
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
    public java.util.List < HoneypotEvents> getHoneypotEvents() {
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
        private java.util.List < HoneypotEvents> honeypotEvents; 
        private PageInfo pageInfo; 
        private String requestId; 

        /**
         * The intrusion events.
         */
        public Builder honeypotEvents(java.util.List < HoneypotEvents> honeypotEvents) {
            this.honeypotEvents = honeypotEvents;
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
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListHoneypotEventsResponseBody build() {
            return new ListHoneypotEventsResponseBody(this);
        } 

    } 

    public static class MergeFieldList extends TeaModel {
        @NameInMap("FieldExtInfo")
        private String fieldExtInfo;

        @NameInMap("FieldKey")
        private String fieldKey;

        @NameInMap("FieldType")
        private String fieldType;

        @NameInMap("FieldValue")
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
             * The supplementary information about the field.
             */
            public Builder fieldExtInfo(String fieldExtInfo) {
                this.fieldExtInfo = fieldExtInfo;
                return this;
            }

            /**
             * The key of the field.
             */
            public Builder fieldKey(String fieldKey) {
                this.fieldKey = fieldKey;
                return this;
            }

            /**
             * The type of the field.
             */
            public Builder fieldType(String fieldType) {
                this.fieldType = fieldType;
                return this;
            }

            /**
             * The value of the field key.
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
    public static class HoneypotEvents extends TeaModel {
        @NameInMap("AgentId")
        private String agentId;

        @NameInMap("AgentName")
        private String agentName;

        @NameInMap("AlarmEventId")
        private Long alarmEventId;

        @NameInMap("DstIp")
        private String dstIp;

        @NameInMap("FirstTime")
        private Long firstTime;

        @NameInMap("HoneypotName")
        private String honeypotName;

        @NameInMap("LastTime")
        private Long lastTime;

        @NameInMap("Location")
        private String location;

        @NameInMap("MergeFieldList")
        private java.util.List < MergeFieldList> mergeFieldList;

        @NameInMap("Protocol")
        private String protocol;

        @NameInMap("RiskLevel")
        private String riskLevel;

        @NameInMap("SecurityEventId")
        private Long securityEventId;

        @NameInMap("SrcIp")
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
        public java.util.List < MergeFieldList> getMergeFieldList() {
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
            private java.util.List < MergeFieldList> mergeFieldList; 
            private String protocol; 
            private String riskLevel; 
            private Long securityEventId; 
            private String srcIp; 

            /**
             * The probe ID.
             */
            public Builder agentId(String agentId) {
                this.agentId = agentId;
                return this;
            }

            /**
             * The name of the probe.
             */
            public Builder agentName(String agentName) {
                this.agentName = agentName;
                return this;
            }

            /**
             * The ID of the alert event.
             */
            public Builder alarmEventId(Long alarmEventId) {
                this.alarmEventId = alarmEventId;
                return this;
            }

            /**
             * The destination IP address of the attack.
             */
            public Builder dstIp(String dstIp) {
                this.dstIp = dstIp;
                return this;
            }

            /**
             * The timestamp at which the event was first detected.
             */
            public Builder firstTime(Long firstTime) {
                this.firstTime = firstTime;
                return this;
            }

            /**
             * The name of the honeypot.
             */
            public Builder honeypotName(String honeypotName) {
                this.honeypotName = honeypotName;
                return this;
            }

            /**
             * The timestamp at which the event was last detected.
             */
            public Builder lastTime(Long lastTime) {
                this.lastTime = lastTime;
                return this;
            }

            /**
             * The region.
             */
            public Builder location(String location) {
                this.location = location;
                return this;
            }

            /**
             * The extended values that correspond to the field key.
             */
            public Builder mergeFieldList(java.util.List < MergeFieldList> mergeFieldList) {
                this.mergeFieldList = mergeFieldList;
                return this;
            }

            /**
             * The protocol. Valid values:
             * <p>
             * 
             * *   **tcp**
             * *   **udp**
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            /**
             * The risk level. Valid values:
             * <p>
             * 
             * *   **2**: low
             * *   **3**: medium
             * *   **4**: high
             */
            public Builder riskLevel(String riskLevel) {
                this.riskLevel = riskLevel;
                return this;
            }

            /**
             * The ID of the intrusion event.
             */
            public Builder securityEventId(Long securityEventId) {
                this.securityEventId = securityEventId;
                return this;
            }

            /**
             * The source IP address of the attack.
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
    public static class PageInfo extends TeaModel {
        @NameInMap("Count")
        private Integer count;

        @NameInMap("CurrentPage")
        private Integer currentPage;

        @NameInMap("LastRowKey")
        private String lastRowKey;

        @NameInMap("NextToken")
        private String nextToken;

        @NameInMap("PageSize")
        private Integer pageSize;

        @NameInMap("TotalCount")
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
             * The number of entries returned on the current page.
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * The page number.
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * The key of the last data entry.
             */
            public Builder lastRowKey(String lastRowKey) {
                this.lastRowKey = lastRowKey;
                return this;
            }

            /**
             * The value of the NextToken parameter that is returned by using the NextToken method.
             */
            public Builder nextToken(String nextToken) {
                this.nextToken = nextToken;
                return this;
            }

            /**
             * The number of entries per page.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * The total number of entries returned.
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
