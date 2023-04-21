// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSuspEventsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSuspEventsResponseBody</p>
 */
public class DescribeSuspEventsResponseBody extends TeaModel {
    @NameInMap("CurrentPage")
    private Integer currentPage;

    @NameInMap("PageSize")
    private String pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SuspEvents")
    private java.util.List < SuspEvents> suspEvents;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeSuspEventsResponseBody(Builder builder) {
        this.currentPage = builder.currentPage;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.suspEvents = builder.suspEvents;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSuspEventsResponseBody create() {
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
    public String getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return suspEvents
     */
    public java.util.List < SuspEvents> getSuspEvents() {
        return this.suspEvents;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Integer currentPage; 
        private String pageSize; 
        private String requestId; 
        private java.util.List < SuspEvents> suspEvents; 
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
        public Builder pageSize(String pageSize) {
            this.pageSize = pageSize;
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
         * Details of the exceptions.
         */
        public Builder suspEvents(java.util.List < SuspEvents> suspEvents) {
            this.suspEvents = suspEvents;
            return this;
        }

        /**
         * The total number of exceptions returned.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeSuspEventsResponseBody build() {
            return new DescribeSuspEventsResponseBody(this);
        } 

    } 

    public static class Details extends TeaModel {
        @NameInMap("Name")
        private String name;

        @NameInMap("NameDisplay")
        private String nameDisplay;

        @NameInMap("Type")
        private String type;

        @NameInMap("Value")
        private String value;

        @NameInMap("ValueDisplay")
        private String valueDisplay;

        private Details(Builder builder) {
            this.name = builder.name;
            this.nameDisplay = builder.nameDisplay;
            this.type = builder.type;
            this.value = builder.value;
            this.valueDisplay = builder.valueDisplay;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Details create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return nameDisplay
         */
        public String getNameDisplay() {
            return this.nameDisplay;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        /**
         * @return valueDisplay
         */
        public String getValueDisplay() {
            return this.valueDisplay;
        }

        public static final class Builder {
            private String name; 
            private String nameDisplay; 
            private String type; 
            private String value; 
            private String valueDisplay; 

            /**
             * The original property name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The property name that is displayed after the Name parameter was translated.
             */
            public Builder nameDisplay(String nameDisplay) {
                this.nameDisplay = nameDisplay;
                return this;
            }

            /**
             * The format in which the property value is displayed. The property value can be a string or displayed in the HTML or Markdown format.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * The property value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            /**
             * The property value that is displayed after the Value parameter was translated.
             */
            public Builder valueDisplay(String valueDisplay) {
                this.valueDisplay = valueDisplay;
                return this;
            }

            public Details build() {
                return new Details(this);
            } 

        } 

    }
    public static class SuspEvents extends TeaModel {
        @NameInMap("AlarmEventName")
        private String alarmEventName;

        @NameInMap("AlarmEventNameDisplay")
        private String alarmEventNameDisplay;

        @NameInMap("AlarmEventType")
        private String alarmEventType;

        @NameInMap("AlarmEventTypeDisplay")
        private String alarmEventTypeDisplay;

        @NameInMap("AlarmUniqueInfo")
        private String alarmUniqueInfo;

        @NameInMap("CanBeDealOnLine")
        private String canBeDealOnLine;

        @NameInMap("CanCancelFault")
        private Boolean canCancelFault;

        @NameInMap("DataSource")
        private String dataSource;

        @NameInMap("Desc")
        private String desc;

        @NameInMap("DesktopId")
        private String desktopId;

        @NameInMap("DesktopName")
        private String desktopName;

        @NameInMap("Details")
        private java.util.List < Details> details;

        @NameInMap("EventStatus")
        private Integer eventStatus;

        @NameInMap("EventSubType")
        private String eventSubType;

        @NameInMap("Id")
        private Long id;

        @NameInMap("LastTime")
        private String lastTime;

        @NameInMap("Level")
        private String level;

        @NameInMap("Name")
        private String name;

        @NameInMap("OccurrenceTime")
        private String occurrenceTime;

        @NameInMap("OperateErrorCode")
        private String operateErrorCode;

        @NameInMap("OperateMsg")
        private String operateMsg;

        @NameInMap("UniqueInfo")
        private String uniqueInfo;

        private SuspEvents(Builder builder) {
            this.alarmEventName = builder.alarmEventName;
            this.alarmEventNameDisplay = builder.alarmEventNameDisplay;
            this.alarmEventType = builder.alarmEventType;
            this.alarmEventTypeDisplay = builder.alarmEventTypeDisplay;
            this.alarmUniqueInfo = builder.alarmUniqueInfo;
            this.canBeDealOnLine = builder.canBeDealOnLine;
            this.canCancelFault = builder.canCancelFault;
            this.dataSource = builder.dataSource;
            this.desc = builder.desc;
            this.desktopId = builder.desktopId;
            this.desktopName = builder.desktopName;
            this.details = builder.details;
            this.eventStatus = builder.eventStatus;
            this.eventSubType = builder.eventSubType;
            this.id = builder.id;
            this.lastTime = builder.lastTime;
            this.level = builder.level;
            this.name = builder.name;
            this.occurrenceTime = builder.occurrenceTime;
            this.operateErrorCode = builder.operateErrorCode;
            this.operateMsg = builder.operateMsg;
            this.uniqueInfo = builder.uniqueInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SuspEvents create() {
            return builder().build();
        }

        /**
         * @return alarmEventName
         */
        public String getAlarmEventName() {
            return this.alarmEventName;
        }

        /**
         * @return alarmEventNameDisplay
         */
        public String getAlarmEventNameDisplay() {
            return this.alarmEventNameDisplay;
        }

        /**
         * @return alarmEventType
         */
        public String getAlarmEventType() {
            return this.alarmEventType;
        }

        /**
         * @return alarmEventTypeDisplay
         */
        public String getAlarmEventTypeDisplay() {
            return this.alarmEventTypeDisplay;
        }

        /**
         * @return alarmUniqueInfo
         */
        public String getAlarmUniqueInfo() {
            return this.alarmUniqueInfo;
        }

        /**
         * @return canBeDealOnLine
         */
        public String getCanBeDealOnLine() {
            return this.canBeDealOnLine;
        }

        /**
         * @return canCancelFault
         */
        public Boolean getCanCancelFault() {
            return this.canCancelFault;
        }

        /**
         * @return dataSource
         */
        public String getDataSource() {
            return this.dataSource;
        }

        /**
         * @return desc
         */
        public String getDesc() {
            return this.desc;
        }

        /**
         * @return desktopId
         */
        public String getDesktopId() {
            return this.desktopId;
        }

        /**
         * @return desktopName
         */
        public String getDesktopName() {
            return this.desktopName;
        }

        /**
         * @return details
         */
        public java.util.List < Details> getDetails() {
            return this.details;
        }

        /**
         * @return eventStatus
         */
        public Integer getEventStatus() {
            return this.eventStatus;
        }

        /**
         * @return eventSubType
         */
        public String getEventSubType() {
            return this.eventSubType;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return lastTime
         */
        public String getLastTime() {
            return this.lastTime;
        }

        /**
         * @return level
         */
        public String getLevel() {
            return this.level;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return occurrenceTime
         */
        public String getOccurrenceTime() {
            return this.occurrenceTime;
        }

        /**
         * @return operateErrorCode
         */
        public String getOperateErrorCode() {
            return this.operateErrorCode;
        }

        /**
         * @return operateMsg
         */
        public String getOperateMsg() {
            return this.operateMsg;
        }

        /**
         * @return uniqueInfo
         */
        public String getUniqueInfo() {
            return this.uniqueInfo;
        }

        public static final class Builder {
            private String alarmEventName; 
            private String alarmEventNameDisplay; 
            private String alarmEventType; 
            private String alarmEventTypeDisplay; 
            private String alarmUniqueInfo; 
            private String canBeDealOnLine; 
            private Boolean canCancelFault; 
            private String dataSource; 
            private String desc; 
            private String desktopId; 
            private String desktopName; 
            private java.util.List < Details> details; 
            private Integer eventStatus; 
            private String eventSubType; 
            private Long id; 
            private String lastTime; 
            private String level; 
            private String name; 
            private String occurrenceTime; 
            private String operateErrorCode; 
            private String operateMsg; 
            private String uniqueInfo; 

            /**
             * The name of the alert event to which the exception belongs.
             */
            public Builder alarmEventName(String alarmEventName) {
                this.alarmEventName = alarmEventName;
                return this;
            }

            /**
             * The description of the alert event with which the exception is associated.
             */
            public Builder alarmEventNameDisplay(String alarmEventNameDisplay) {
                this.alarmEventNameDisplay = alarmEventNameDisplay;
                return this;
            }

            /**
             * The type of the alert event to which the exception belongs.
             */
            public Builder alarmEventType(String alarmEventType) {
                this.alarmEventType = alarmEventType;
                return this;
            }

            /**
             * The description of the alert event to which the exception belongs.
             */
            public Builder alarmEventTypeDisplay(String alarmEventTypeDisplay) {
                this.alarmEventTypeDisplay = alarmEventTypeDisplay;
                return this;
            }

            /**
             * The ID of the alert event to which the exception belongs.
             */
            public Builder alarmUniqueInfo(String alarmUniqueInfo) {
                this.alarmUniqueInfo = alarmUniqueInfo;
                return this;
            }

            /**
             * Indicates whether the exception can be processed online. Valid values:
             * <p>
             * 
             * *   true: The exception can be processed online.
             * *   false: The exception cannot be processed online.
             */
            public Builder canBeDealOnLine(String canBeDealOnLine) {
                this.canBeDealOnLine = canBeDealOnLine;
                return this;
            }

            /**
             * Indicates whether the exception can be ignored. Valid values:
             * <p>
             * 
             * *   true: The exception can be ignored.
             * *   false: The exception cannot be ignored.
             */
            public Builder canCancelFault(Boolean canCancelFault) {
                this.canCancelFault = canCancelFault;
                return this;
            }

            /**
             * The source of data. This parameter can be ignored.
             */
            public Builder dataSource(String dataSource) {
                this.dataSource = dataSource;
                return this;
            }

            /**
             * The impact of the exception.
             */
            public Builder desc(String desc) {
                this.desc = desc;
                return this;
            }

            /**
             * The ID of the affected cloud desktop.
             */
            public Builder desktopId(String desktopId) {
                this.desktopId = desktopId;
                return this;
            }

            /**
             * The name of the affected cloud desktop.
             */
            public Builder desktopName(String desktopName) {
                this.desktopName = desktopName;
                return this;
            }

            /**
             * Details of the exceptions.
             */
            public Builder details(java.util.List < Details> details) {
                this.details = details;
                return this;
            }

            /**
             * The state of the exception. Valid values:
             * <p>
             * 
             * *   1: PENDING
             * *   2: IGNORE
             * *   4: HANDLED
             * *   8: FAULT
             * *   16: DEALING
             * *   32: DONE
             * *   64: EXPIRE
             */
            public Builder eventStatus(Integer eventStatus) {
                this.eventStatus = eventStatus;
                return this;
            }

            /**
             * The name of the exception.
             */
            public Builder eventSubType(String eventSubType) {
                this.eventSubType = eventSubType;
                return this;
            }

            /**
             * The ID of the exception.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * The time when the last exception occurred.
             */
            public Builder lastTime(String lastTime) {
                this.lastTime = lastTime;
                return this;
            }

            /**
             * The severity of the exception. Valid values:
             * <p>
             * 
             * *   serious: The exception is urgent.
             * *   suspicious: The exception is a warning
             * *   remind: The exception is a suggestion.
             */
            public Builder level(String level) {
                this.level = level;
                return this;
            }

            /**
             * The full name of the exception.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The time when the exception first occurred.
             */
            public Builder occurrenceTime(String occurrenceTime) {
                this.occurrenceTime = occurrenceTime;
                return this;
            }

            /**
             * The handling result code of the exception.
             */
            public Builder operateErrorCode(String operateErrorCode) {
                this.operateErrorCode = operateErrorCode;
                return this;
            }

            /**
             * The handling remarks on the exception.
             */
            public Builder operateMsg(String operateMsg) {
                this.operateMsg = operateMsg;
                return this;
            }

            /**
             * The ID of the exception.
             */
            public Builder uniqueInfo(String uniqueInfo) {
                this.uniqueInfo = uniqueInfo;
                return this;
            }

            public SuspEvents build() {
                return new SuspEvents(this);
            } 

        } 

    }
}
