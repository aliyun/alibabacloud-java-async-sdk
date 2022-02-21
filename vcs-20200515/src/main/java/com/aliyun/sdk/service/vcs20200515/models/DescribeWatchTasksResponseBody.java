// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeWatchTasksResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeWatchTasksResponseBody</p>
 */
public class DescribeWatchTasksResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private DescribeWatchTasksResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeWatchTasksResponseBody create() {
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
     * @return message
     */
    public String getMessage() {
        return this.message;
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
        private String message; 
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
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * Id of the request
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

        public DescribeWatchTasksResponseBody build() {
            return new DescribeWatchTasksResponseBody(this);
        } 

    } 

    public static class Records extends TeaModel {
        @NameInMap("CorpId")
        private String corpId;

        @NameInMap("Description")
        private String description;

        @NameInMap("DeviceList")
        private String deviceList;

        @NameInMap("MessageReceiver")
        private String messageReceiver;

        @NameInMap("ScheduleCycleDates")
        private String scheduleCycleDates;

        @NameInMap("ScheduleTimes")
        private String scheduleTimes;

        @NameInMap("ScheduleType")
        private String scheduleType;

        @NameInMap("TaskName")
        private String taskName;

        @NameInMap("WatchPolicyIds")
        private String watchPolicyIds;

        @NameInMap("WatchTaskId")
        private String watchTaskId;

        private Records(Builder builder) {
            this.corpId = builder.corpId;
            this.description = builder.description;
            this.deviceList = builder.deviceList;
            this.messageReceiver = builder.messageReceiver;
            this.scheduleCycleDates = builder.scheduleCycleDates;
            this.scheduleTimes = builder.scheduleTimes;
            this.scheduleType = builder.scheduleType;
            this.taskName = builder.taskName;
            this.watchPolicyIds = builder.watchPolicyIds;
            this.watchTaskId = builder.watchTaskId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Records create() {
            return builder().build();
        }

        /**
         * @return corpId
         */
        public String getCorpId() {
            return this.corpId;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return deviceList
         */
        public String getDeviceList() {
            return this.deviceList;
        }

        /**
         * @return messageReceiver
         */
        public String getMessageReceiver() {
            return this.messageReceiver;
        }

        /**
         * @return scheduleCycleDates
         */
        public String getScheduleCycleDates() {
            return this.scheduleCycleDates;
        }

        /**
         * @return scheduleTimes
         */
        public String getScheduleTimes() {
            return this.scheduleTimes;
        }

        /**
         * @return scheduleType
         */
        public String getScheduleType() {
            return this.scheduleType;
        }

        /**
         * @return taskName
         */
        public String getTaskName() {
            return this.taskName;
        }

        /**
         * @return watchPolicyIds
         */
        public String getWatchPolicyIds() {
            return this.watchPolicyIds;
        }

        /**
         * @return watchTaskId
         */
        public String getWatchTaskId() {
            return this.watchTaskId;
        }

        public static final class Builder {
            private String corpId; 
            private String description; 
            private String deviceList; 
            private String messageReceiver; 
            private String scheduleCycleDates; 
            private String scheduleTimes; 
            private String scheduleType; 
            private String taskName; 
            private String watchPolicyIds; 
            private String watchTaskId; 

            /**
             * CorpId.
             */
            public Builder corpId(String corpId) {
                this.corpId = corpId;
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
             * DeviceList.
             */
            public Builder deviceList(String deviceList) {
                this.deviceList = deviceList;
                return this;
            }

            /**
             * MessageReceiver.
             */
            public Builder messageReceiver(String messageReceiver) {
                this.messageReceiver = messageReceiver;
                return this;
            }

            /**
             * ScheduleCycleDates.
             */
            public Builder scheduleCycleDates(String scheduleCycleDates) {
                this.scheduleCycleDates = scheduleCycleDates;
                return this;
            }

            /**
             * ScheduleTimes.
             */
            public Builder scheduleTimes(String scheduleTimes) {
                this.scheduleTimes = scheduleTimes;
                return this;
            }

            /**
             * ScheduleType.
             */
            public Builder scheduleType(String scheduleType) {
                this.scheduleType = scheduleType;
                return this;
            }

            /**
             * TaskName.
             */
            public Builder taskName(String taskName) {
                this.taskName = taskName;
                return this;
            }

            /**
             * WatchPolicyIds.
             */
            public Builder watchPolicyIds(String watchPolicyIds) {
                this.watchPolicyIds = watchPolicyIds;
                return this;
            }

            /**
             * WatchTaskId.
             */
            public Builder watchTaskId(String watchTaskId) {
                this.watchTaskId = watchTaskId;
                return this;
            }

            public Records build() {
                return new Records(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("PageNumber")
        private Long pageNumber;

        @NameInMap("PageSize")
        private Long pageSize;

        @NameInMap("Records")
        private java.util.List < Records> records;

        @NameInMap("TotalCount")
        private Long totalCount;

        private Data(Builder builder) {
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.records = builder.records;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return pageNumber
         */
        public Long getPageNumber() {
            return this.pageNumber;
        }

        /**
         * @return pageSize
         */
        public Long getPageSize() {
            return this.pageSize;
        }

        /**
         * @return records
         */
        public java.util.List < Records> getRecords() {
            return this.records;
        }

        /**
         * @return totalCount
         */
        public Long getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private Long pageNumber; 
            private Long pageSize; 
            private java.util.List < Records> records; 
            private Long totalCount; 

            /**
             * PageNumber.
             */
            public Builder pageNumber(Long pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * PageSize.
             */
            public Builder pageSize(Long pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * Records.
             */
            public Builder records(java.util.List < Records> records) {
                this.records = records;
                return this;
            }

            /**
             * TotalCount.
             */
            public Builder totalCount(Long totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
