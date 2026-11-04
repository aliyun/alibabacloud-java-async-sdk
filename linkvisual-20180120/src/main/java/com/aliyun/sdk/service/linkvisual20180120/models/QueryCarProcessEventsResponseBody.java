// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

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
 * {@link QueryCarProcessEventsResponseBody} extends {@link TeaModel}
 *
 * <p>QueryCarProcessEventsResponseBody</p>
 */
public class QueryCarProcessEventsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(QueryCarProcessEventsResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.errorMessage = model.errorMessage;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The response code. Valid values:</p>
         * <ul>
         * <li><strong>200</strong>: The call was successful.</li>
         * <li>Other values: An error occurred. For more information, see <a href="https://help.aliyun.com/document_detail/288314.html">Error codes</a>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The data returned if the call is successful.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error message returned if the call fails.</p>
         * 
         * <strong>example:</strong>
         * <p>Specified access key is not found.</p>
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>8B8E77F0-7713-0139-A3D6-93482A025D45</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the call was successful. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The call was successful.</li>
         * <li><strong>false</strong>: The call failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public QueryCarProcessEventsResponseBody build() {
            return new QueryCarProcessEventsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryCarProcessEventsResponseBody} extends {@link TeaModel}
     *
     * <p>QueryCarProcessEventsResponseBody</p>
     */
    public static class PageData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ActionType")
        private Integer actionType;

        @com.aliyun.core.annotation.NameInMap("AreaIndex")
        private Integer areaIndex;

        @com.aliyun.core.annotation.NameInMap("Confidence")
        private Integer confidence;

        @com.aliyun.core.annotation.NameInMap("EventId")
        private String eventId;

        @com.aliyun.core.annotation.NameInMap("EventPicId")
        private String eventPicId;

        @com.aliyun.core.annotation.NameInMap("EventPicUrl")
        private String eventPicUrl;

        @com.aliyun.core.annotation.NameInMap("EventTime")
        private Long eventTime;

        @com.aliyun.core.annotation.NameInMap("EventType")
        private Integer eventType;

        @com.aliyun.core.annotation.NameInMap("IotId")
        private String iotId;

        @com.aliyun.core.annotation.NameInMap("PlateNo")
        private String plateNo;

        @com.aliyun.core.annotation.NameInMap("SubDeviceName")
        private String subDeviceName;

        @com.aliyun.core.annotation.NameInMap("SubDeviceNickName")
        private String subDeviceNickName;

        @com.aliyun.core.annotation.NameInMap("SubIotId")
        private String subIotId;

        @com.aliyun.core.annotation.NameInMap("SubProductKey")
        private String subProductKey;

        @com.aliyun.core.annotation.NameInMap("TaskId")
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

            private Builder() {
            } 

            private Builder(PageData model) {
                this.actionType = model.actionType;
                this.areaIndex = model.areaIndex;
                this.confidence = model.confidence;
                this.eventId = model.eventId;
                this.eventPicId = model.eventPicId;
                this.eventPicUrl = model.eventPicUrl;
                this.eventTime = model.eventTime;
                this.eventType = model.eventType;
                this.iotId = model.iotId;
                this.plateNo = model.plateNo;
                this.subDeviceName = model.subDeviceName;
                this.subDeviceNickName = model.subDeviceNickName;
                this.subIotId = model.subIotId;
                this.subProductKey = model.subProductKey;
                this.taskId = model.taskId;
            } 

            /**
             * <p>The action type of the vehicle.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder actionType(Integer actionType) {
                this.actionType = actionType;
                return this;
            }

            /**
             * <p>The number of detection boxes recognized by the IPC device.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder areaIndex(Integer areaIndex) {
                this.areaIndex = areaIndex;
                return this;
            }

            /**
             * <p>The confidence level of the vehicle recognition.</p>
             * 
             * <strong>example:</strong>
             * <p>63</p>
             */
            public Builder confidence(Integer confidence) {
                this.confidence = confidence;
                return this;
            }

            /**
             * <p>The ID of the intelligent alert event.</p>
             * 
             * <strong>example:</strong>
             * <p>dailyb3d6658d9****</p>
             */
            public Builder eventId(String eventId) {
                this.eventId = eventId;
                return this;
            }

            /**
             * <p>The ID of the intelligent alert event picture.</p>
             * 
             * <strong>example:</strong>
             * <p>SU5LT2pXaUM4MV****Nzg</p>
             */
            public Builder eventPicId(String eventPicId) {
                this.eventPicId = eventPicId;
                return this;
            }

            /**
             * <p>The URL of the intelligent alert event picture.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://example.com/test.jpg">https://example.com/test.jpg</a></p>
             */
            public Builder eventPicUrl(String eventPicUrl) {
                this.eventPicUrl = eventPicUrl;
                return this;
            }

            /**
             * <p>The timestamp when the event occurred, in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1646288428361</p>
             */
            public Builder eventTime(Long eventTime) {
                this.eventTime = eventTime;
                return this;
            }

            /**
             * <p>The type of the intelligent alert event. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: All intelligent alert events.</li>
             * <li>Multiple intelligent alert events: Enter the sequence numbers of the intelligent alert events and separate them with commas (,), such as <code>10001,10002</code>.<blockquote>
             * <p>You can specify up to 10 intelligent alert events at a time.</p>
             * </blockquote>
             * </li>
             * </ul>
             * <p>To view all intelligent alert event types, go to the <strong>Define Feature</strong> tab of the <strong>Product Details</strong> page in the IoT Platform console. For more information, see <a href="https://help.aliyun.com/document_detail/207701.html">View intelligent alert event types</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>10005</p>
             */
            public Builder eventType(Integer eventType) {
                this.eventType = eventType;
                return this;
            }

            /**
             * <p>The IotId of the V-series edge appliance.</p>
             * 
             * <strong>example:</strong>
             * <p>gl9kLgp0UsPSCcIM8EAY00****</p>
             */
            public Builder iotId(String iotId) {
                this.iotId = iotId;
                return this;
            }

            /**
             * <p>The license plate number.</p>
             * 
             * <strong>example:</strong>
             * <p>ZheA6****</p>
             */
            public Builder plateNo(String plateNo) {
                this.plateNo = plateNo;
                return this;
            }

            /**
             * <p>The DeviceName of the IPC device.</p>
             * 
             * <strong>example:</strong>
             * <p>car_test</p>
             */
            public Builder subDeviceName(String subDeviceName) {
                this.subDeviceName = subDeviceName;
                return this;
            }

            /**
             * <p>The DeviceNickName of the IPC device.</p>
             * 
             * <strong>example:</strong>
             * <p>TestVehicle</p>
             */
            public Builder subDeviceNickName(String subDeviceNickName) {
                this.subDeviceNickName = subDeviceNickName;
                return this;
            }

            /**
             * <p>The ID of the IPC device.</p>
             * 
             * <strong>example:</strong>
             * <p>ImP6ECd1aQxio9CAfWTO****</p>
             */
            public Builder subIotId(String subIotId) {
                this.subIotId = subIotId;
                return this;
            }

            /**
             * <p>The ProductKey of the IPC device.</p>
             * 
             * <strong>example:</strong>
             * <p>a1Duh0F****</p>
             */
            public Builder subProductKey(String subProductKey) {
                this.subProductKey = subProductKey;
                return this;
            }

            /**
             * <p>The task ID of the vehicle detection event.</p>
             * 
             * <strong>example:</strong>
             * <p>daily55617e7653354490938d****</p>
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
    /**
     * 
     * {@link QueryCarProcessEventsResponseBody} extends {@link TeaModel}
     *
     * <p>QueryCarProcessEventsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CurrentPage")
        private Integer currentPage;

        @com.aliyun.core.annotation.NameInMap("PageCount")
        private Integer pageCount;

        @com.aliyun.core.annotation.NameInMap("PageData")
        private java.util.List<PageData> pageData;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("Total")
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
        public java.util.List<PageData> getPageData() {
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
            private java.util.List<PageData> pageData; 
            private Integer pageSize; 
            private Integer total; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.currentPage = model.currentPage;
                this.pageCount = model.pageCount;
                this.pageData = model.pageData;
                this.pageSize = model.pageSize;
                this.total = model.total;
            } 

            /**
             * <p>The current page number.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * <p>The total number of pages.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder pageCount(Integer pageCount) {
                this.pageCount = pageCount;
                return this;
            }

            /**
             * <p>The list of returned intelligent alert events.</p>
             */
            public Builder pageData(java.util.List<PageData> pageData) {
                this.pageData = pageData;
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
             * <p>The total number of vehicle recognition events.</p>
             * 
             * <strong>example:</strong>
             * <p>50</p>
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
