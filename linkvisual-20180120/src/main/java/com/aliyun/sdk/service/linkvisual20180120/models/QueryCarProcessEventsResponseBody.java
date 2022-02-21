// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryCarProcessEventsResponseBody} extends {@link TeaModel}
 *
 * <p>QueryCarProcessEventsResponseBody</p>
 */
public class QueryCarProcessEventsResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private QueryCarProcessEventsResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryCarProcessEventsResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String errorMessage; 
        private String requestId; 
        private Boolean success; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * ErrorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
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
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public QueryCarProcessEventsResponseBody build() {
            return new QueryCarProcessEventsResponseBody(this);
        } 

    } 

    public static class PageData extends TeaModel {
        @NameInMap("ActionType")
        private Integer actionType;

        @NameInMap("AreaIndex")
        private Integer areaIndex;

        @NameInMap("Confidence")
        private Integer confidence;

        @NameInMap("EventId")
        private String eventId;

        @NameInMap("EventPicId")
        private String eventPicId;

        @NameInMap("EventPicUrl")
        private String eventPicUrl;

        @NameInMap("EventTime")
        private Long eventTime;

        @NameInMap("EventType")
        private Integer eventType;

        @NameInMap("IotId")
        private String iotId;

        @NameInMap("PlateNo")
        private String plateNo;

        @NameInMap("SubDeviceName")
        private String subDeviceName;

        @NameInMap("SubDeviceNickName")
        private String subDeviceNickName;

        @NameInMap("SubIotId")
        private String subIotId;

        @NameInMap("SubProductKey")
        private String subProductKey;

        @NameInMap("TaskId")
        private String taskId;

        private PageData(Builder builder) {
            this.actionType = builder.actionType;
            this.areaIndex = builder.areaIndex;
            this.confidence = builder.confidence;
            this.eventId = builder.eventId;
            this.eventPicId = builder.eventPicId;
            this.eventPicUrl = builder.eventPicUrl;
            this.eventTime = builder.eventTime;
            this.eventType = builder.eventType;
            this.iotId = builder.iotId;
            this.plateNo = builder.plateNo;
            this.subDeviceName = builder.subDeviceName;
            this.subDeviceNickName = builder.subDeviceNickName;
            this.subIotId = builder.subIotId;
            this.subProductKey = builder.subProductKey;
            this.taskId = builder.taskId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PageData create() {
            return builder().build();
        }

        /**
         * @return actionType
         */
        public Integer getActionType() {
            return this.actionType;
        }

        /**
         * @return areaIndex
         */
        public Integer getAreaIndex() {
            return this.areaIndex;
        }

        /**
         * @return confidence
         */
        public Integer getConfidence() {
            return this.confidence;
        }

        /**
         * @return eventId
         */
        public String getEventId() {
            return this.eventId;
        }

        /**
         * @return eventPicId
         */
        public String getEventPicId() {
            return this.eventPicId;
        }

        /**
         * @return eventPicUrl
         */
        public String getEventPicUrl() {
            return this.eventPicUrl;
        }

        /**
         * @return eventTime
         */
        public Long getEventTime() {
            return this.eventTime;
        }

        /**
         * @return eventType
         */
        public Integer getEventType() {
            return this.eventType;
        }

        /**
         * @return iotId
         */
        public String getIotId() {
            return this.iotId;
        }

        /**
         * @return plateNo
         */
        public String getPlateNo() {
            return this.plateNo;
        }

        /**
         * @return subDeviceName
         */
        public String getSubDeviceName() {
            return this.subDeviceName;
        }

        /**
         * @return subDeviceNickName
         */
        public String getSubDeviceNickName() {
            return this.subDeviceNickName;
        }

        /**
         * @return subIotId
         */
        public String getSubIotId() {
            return this.subIotId;
        }

        /**
         * @return subProductKey
         */
        public String getSubProductKey() {
            return this.subProductKey;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        public static final class Builder {
            private Integer actionType; 
            private Integer areaIndex; 
            private Integer confidence; 
            private String eventId; 
            private String eventPicId; 
            private String eventPicUrl; 
            private Long eventTime; 
            private Integer eventType; 
            private String iotId; 
            private String plateNo; 
            private String subDeviceName; 
            private String subDeviceNickName; 
            private String subIotId; 
            private String subProductKey; 
            private String taskId; 

            /**
             * ActionType.
             */
            public Builder actionType(Integer actionType) {
                this.actionType = actionType;
                return this;
            }

            /**
             * AreaIndex.
             */
            public Builder areaIndex(Integer areaIndex) {
                this.areaIndex = areaIndex;
                return this;
            }

            /**
             * Confidence.
             */
            public Builder confidence(Integer confidence) {
                this.confidence = confidence;
                return this;
            }

            /**
             * EventId.
             */
            public Builder eventId(String eventId) {
                this.eventId = eventId;
                return this;
            }

            /**
             * EventPicId.
             */
            public Builder eventPicId(String eventPicId) {
                this.eventPicId = eventPicId;
                return this;
            }

            /**
             * EventPicUrl.
             */
            public Builder eventPicUrl(String eventPicUrl) {
                this.eventPicUrl = eventPicUrl;
                return this;
            }

            /**
             * EventTime.
             */
            public Builder eventTime(Long eventTime) {
                this.eventTime = eventTime;
                return this;
            }

            /**
             * EventType.
             */
            public Builder eventType(Integer eventType) {
                this.eventType = eventType;
                return this;
            }

            /**
             * IotId.
             */
            public Builder iotId(String iotId) {
                this.iotId = iotId;
                return this;
            }

            /**
             * PlateNo.
             */
            public Builder plateNo(String plateNo) {
                this.plateNo = plateNo;
                return this;
            }

            /**
             * SubDeviceName.
             */
            public Builder subDeviceName(String subDeviceName) {
                this.subDeviceName = subDeviceName;
                return this;
            }

            /**
             * SubDeviceNickName.
             */
            public Builder subDeviceNickName(String subDeviceNickName) {
                this.subDeviceNickName = subDeviceNickName;
                return this;
            }

            /**
             * SubIotId.
             */
            public Builder subIotId(String subIotId) {
                this.subIotId = subIotId;
                return this;
            }

            /**
             * SubProductKey.
             */
            public Builder subProductKey(String subProductKey) {
                this.subProductKey = subProductKey;
                return this;
            }

            /**
             * TaskId.
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            public PageData build() {
                return new PageData(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("CurrentPage")
        private Integer currentPage;

        @NameInMap("PageCount")
        private Integer pageCount;

        @NameInMap("PageData")
        private java.util.List < PageData> pageData;

        @NameInMap("PageSize")
        private Integer pageSize;

        @NameInMap("Total")
        private Integer total;

        private Data(Builder builder) {
            this.currentPage = builder.currentPage;
            this.pageCount = builder.pageCount;
            this.pageData = builder.pageData;
            this.pageSize = builder.pageSize;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return currentPage
         */
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        /**
         * @return pageCount
         */
        public Integer getPageCount() {
            return this.pageCount;
        }

        /**
         * @return pageData
         */
        public java.util.List < PageData> getPageData() {
            return this.pageData;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return total
         */
        public Integer getTotal() {
            return this.total;
        }

        public static final class Builder {
            private Integer currentPage; 
            private Integer pageCount; 
            private java.util.List < PageData> pageData; 
            private Integer pageSize; 
            private Integer total; 

            /**
             * CurrentPage.
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * PageCount.
             */
            public Builder pageCount(Integer pageCount) {
                this.pageCount = pageCount;
                return this;
            }

            /**
             * PageData.
             */
            public Builder pageData(java.util.List < PageData> pageData) {
                this.pageData = pageData;
                return this;
            }

            /**
             * PageSize.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * Total.
             */
            public Builder total(Integer total) {
                this.total = total;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
