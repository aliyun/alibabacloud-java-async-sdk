// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListHoneypotAlarmEventsResponseBody} extends {@link TeaModel}
 *
 * <p>ListHoneypotAlarmEventsResponseBody</p>
 */
public class ListHoneypotAlarmEventsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("HoneypotAlarmEvents")
    private java.util.List < HoneypotAlarmEvents> honeypotAlarmEvents;

    @com.aliyun.core.annotation.NameInMap("PageInfo")
    private PageInfo pageInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListHoneypotAlarmEventsResponseBody(Builder builder) {
        this.honeypotAlarmEvents = builder.honeypotAlarmEvents;
        this.pageInfo = builder.pageInfo;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListHoneypotAlarmEventsResponseBody create() {
        return builder().build();
    }

    /**
     * @return honeypotAlarmEvents
     */
    public java.util.List < HoneypotAlarmEvents> getHoneypotAlarmEvents() {
        return this.honeypotAlarmEvents;
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
        private java.util.List < HoneypotAlarmEvents> honeypotAlarmEvents; 
        private PageInfo pageInfo; 
        private String requestId; 

        /**
         * The alert events.
         */
        public Builder honeypotAlarmEvents(java.util.List < HoneypotAlarmEvents> honeypotAlarmEvents) {
            this.honeypotAlarmEvents = honeypotAlarmEvents;
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

        public ListHoneypotAlarmEventsResponseBody build() {
            return new ListHoneypotAlarmEventsResponseBody(this);
        } 

    } 

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
             * The extended value that corresponds to the field key.
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
             * The type of the field. You can ignore this internal parameter.
             */
            public Builder fieldType(String fieldType) {
                this.fieldType = fieldType;
                return this;
            }

            /**
             * The value that corresponds to the field key.
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
    public static class HoneypotAlarmEvents extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AlarmEventId")
        private Long alarmEventId;

        @com.aliyun.core.annotation.NameInMap("AlarmEventName")
        private String alarmEventName;

        @com.aliyun.core.annotation.NameInMap("AlarmEventType")
        private String alarmEventType;

        @com.aliyun.core.annotation.NameInMap("AlarmUniqueInfo")
        private String alarmUniqueInfo;

        @com.aliyun.core.annotation.NameInMap("EventCount")
        private Integer eventCount;

        @com.aliyun.core.annotation.NameInMap("FirstTime")
        private Long firstTime;

        @com.aliyun.core.annotation.NameInMap("LastTime")
        private Long lastTime;

        @com.aliyun.core.annotation.NameInMap("MergeFieldList")
        private java.util.List < MergeFieldList> mergeFieldList;

        @com.aliyun.core.annotation.NameInMap("OperateStatus")
        private Integer operateStatus;

        @com.aliyun.core.annotation.NameInMap("RiskLevel")
        private String riskLevel;

        private HoneypotAlarmEvents(Builder builder) {
            this.alarmEventId = builder.alarmEventId;
            this.alarmEventName = builder.alarmEventName;
            this.alarmEventType = builder.alarmEventType;
            this.alarmUniqueInfo = builder.alarmUniqueInfo;
            this.eventCount = builder.eventCount;
            this.firstTime = builder.firstTime;
            this.lastTime = builder.lastTime;
            this.mergeFieldList = builder.mergeFieldList;
            this.operateStatus = builder.operateStatus;
            this.riskLevel = builder.riskLevel;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HoneypotAlarmEvents create() {
            return builder().build();
        }

        /**
         * @return alarmEventId
         */
        public Long getAlarmEventId() {
            return this.alarmEventId;
        }

        /**
         * @return alarmEventName
         */
        public String getAlarmEventName() {
            return this.alarmEventName;
        }

        /**
         * @return alarmEventType
         */
        public String getAlarmEventType() {
            return this.alarmEventType;
        }

        /**
         * @return alarmUniqueInfo
         */
        public String getAlarmUniqueInfo() {
            return this.alarmUniqueInfo;
        }

        /**
         * @return eventCount
         */
        public Integer getEventCount() {
            return this.eventCount;
        }

        /**
         * @return firstTime
         */
        public Long getFirstTime() {
            return this.firstTime;
        }

        /**
         * @return lastTime
         */
        public Long getLastTime() {
            return this.lastTime;
        }

        /**
         * @return mergeFieldList
         */
        public java.util.List < MergeFieldList> getMergeFieldList() {
            return this.mergeFieldList;
        }

        /**
         * @return operateStatus
         */
        public Integer getOperateStatus() {
            return this.operateStatus;
        }

        /**
         * @return riskLevel
         */
        public String getRiskLevel() {
            return this.riskLevel;
        }

        public static final class Builder {
            private Long alarmEventId; 
            private String alarmEventName; 
            private String alarmEventType; 
            private String alarmUniqueInfo; 
            private Integer eventCount; 
            private Long firstTime; 
            private Long lastTime; 
            private java.util.List < MergeFieldList> mergeFieldList; 
            private Integer operateStatus; 
            private String riskLevel; 

            /**
             * The event ID.
             */
            public Builder alarmEventId(Long alarmEventId) {
                this.alarmEventId = alarmEventId;
                return this;
            }

            /**
             * The name of the alert event.
             */
            public Builder alarmEventName(String alarmEventName) {
                this.alarmEventName = alarmEventName;
                return this;
            }

            /**
             * The type of the alert event.
             */
            public Builder alarmEventType(String alarmEventType) {
                this.alarmEventType = alarmEventType;
                return this;
            }

            /**
             * The unique identifier of the alert event.
             */
            public Builder alarmUniqueInfo(String alarmUniqueInfo) {
                this.alarmUniqueInfo = alarmUniqueInfo;
                return this;
            }

            /**
             * The total number of times that the alert event was generated.
             */
            public Builder eventCount(Integer eventCount) {
                this.eventCount = eventCount;
                return this;
            }

            /**
             * The timestamp that indicates the time when the alert event was first detected. Unit: milliseconds.
             */
            public Builder firstTime(Long firstTime) {
                this.firstTime = firstTime;
                return this;
            }

            /**
             * The timestamp that indicates the time when the alert event was last detected. Unit: milliseconds.
             */
            public Builder lastTime(Long lastTime) {
                this.lastTime = lastTime;
                return this;
            }

            /**
             * The risk information.
             */
            public Builder mergeFieldList(java.util.List < MergeFieldList> mergeFieldList) {
                this.mergeFieldList = mergeFieldList;
                return this;
            }

            /**
             * The handling status of the alert event. Valid values:
             * <p>
             * 
             * *   **1**: pending
             * *   **2**: ignored
             * *   **4**: confirmed
             */
            public Builder operateStatus(Integer operateStatus) {
                this.operateStatus = operateStatus;
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

            public HoneypotAlarmEvents build() {
                return new HoneypotAlarmEvents(this);
            } 

        } 

    }
    public static class PageInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Count")
        private Integer count;

        @com.aliyun.core.annotation.NameInMap("CurrentPage")
        private Integer currentPage;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        private PageInfo(Builder builder) {
            this.count = builder.count;
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
             * The page number of the returned page.
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * The number of entries returned per page. Default value: 100.
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
