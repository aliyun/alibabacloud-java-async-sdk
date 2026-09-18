// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

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
 * {@link ListTaskDetailResponseBody} extends {@link TeaModel}
 *
 * <p>ListTaskDetailResponseBody</p>
 */
public class ListTaskDetailResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListTaskDetailResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTaskDetailResponseBody create() {
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

        private Builder() {
        } 

        private Builder(ListTaskDetailResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The request status code. OK indicates that the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The task details.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The description of the status code.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>D9CB3933-9FE3-4870-BA8E-2BEE91B69D23</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the operation was successful. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The operation was successful.</li>
         * <li><strong>false</strong>: The operation failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListTaskDetailResponseBody build() {
            return new ListTaskDetailResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListTaskDetailResponseBody} extends {@link TeaModel}
     *
     * <p>ListTaskDetailResponseBody</p>
     */
    public static class Record extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Called")
        private String called;

        @com.aliyun.core.annotation.NameInMap("Caller")
        private String caller;

        @com.aliyun.core.annotation.NameInMap("Direction")
        private String direction;

        @com.aliyun.core.annotation.NameInMap("Duration")
        private Integer duration;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("RetryCurTimes")
        private Integer retryCurTimes;

        @com.aliyun.core.annotation.NameInMap("RetryTimes")
        private Integer retryTimes;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("StatusCode")
        private String statusCode;

        @com.aliyun.core.annotation.NameInMap("StatusCodeDesc")
        private String statusCodeDesc;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private String tags;

        private Record(Builder builder) {
            this.called = builder.called;
            this.caller = builder.caller;
            this.direction = builder.direction;
            this.duration = builder.duration;
            this.endTime = builder.endTime;
            this.id = builder.id;
            this.retryCurTimes = builder.retryCurTimes;
            this.retryTimes = builder.retryTimes;
            this.startTime = builder.startTime;
            this.status = builder.status;
            this.statusCode = builder.statusCode;
            this.statusCodeDesc = builder.statusCodeDesc;
            this.tags = builder.tags;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Record create() {
            return builder().build();
        }

        /**
         * @return called
         */
        public String getCalled() {
            return this.called;
        }

        /**
         * @return caller
         */
        public String getCaller() {
            return this.caller;
        }

        /**
         * @return direction
         */
        public String getDirection() {
            return this.direction;
        }

        /**
         * @return duration
         */
        public Integer getDuration() {
            return this.duration;
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return retryCurTimes
         */
        public Integer getRetryCurTimes() {
            return this.retryCurTimes;
        }

        /**
         * @return retryTimes
         */
        public Integer getRetryTimes() {
            return this.retryTimes;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return statusCode
         */
        public String getStatusCode() {
            return this.statusCode;
        }

        /**
         * @return statusCodeDesc
         */
        public String getStatusCodeDesc() {
            return this.statusCodeDesc;
        }

        /**
         * @return tags
         */
        public String getTags() {
            return this.tags;
        }

        public static final class Builder {
            private String called; 
            private String caller; 
            private String direction; 
            private Integer duration; 
            private String endTime; 
            private Long id; 
            private Integer retryCurTimes; 
            private Integer retryTimes; 
            private String startTime; 
            private String status; 
            private String statusCode; 
            private String statusCodeDesc; 
            private String tags; 

            private Builder() {
            } 

            private Builder(Record model) {
                this.called = model.called;
                this.caller = model.caller;
                this.direction = model.direction;
                this.duration = model.duration;
                this.endTime = model.endTime;
                this.id = model.id;
                this.retryCurTimes = model.retryCurTimes;
                this.retryTimes = model.retryTimes;
                this.startTime = model.startTime;
                this.status = model.status;
                this.statusCode = model.statusCode;
                this.statusCodeDesc = model.statusCodeDesc;
                this.tags = model.tags;
            } 

            /**
             * <p>The called number.</p>
             * 
             * <strong>example:</strong>
             * <p>186****0000</p>
             */
            public Builder called(String called) {
                this.called = called;
                return this;
            }

            /**
             * <p>The caller number.</p>
             * 
             * <strong>example:</strong>
             * <p>136****0000</p>
             */
            public Builder caller(String caller) {
                this.caller = caller;
                return this;
            }

            /**
             * <p>The hangup direction. Valid values:</p>
             * <ul>
             * <li><strong>User</strong>.</li>
             * <li><strong>Robot</strong>.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>User</p>
             */
            public Builder direction(String direction) {
                this.direction = direction;
                return this;
            }

            /**
             * <p>The call duration. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder duration(Integer duration) {
                this.duration = duration;
                return this;
            }

            /**
             * <p>The end time.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-05-20 00:03:00</p>
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The detail ID.</p>
             * 
             * <strong>example:</strong>
             * <p>12****</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The current retry count.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder retryCurTimes(Integer retryCurTimes) {
                this.retryCurTimes = retryCurTimes;
                return this;
            }

            /**
             * <p>The retry count.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder retryTimes(Integer retryTimes) {
                this.retryTimes = retryTimes;
                return this;
            }

            /**
             * <p>The start time.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-05-20 00:00:00</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The detail status.</p>
             * 
             * <strong>example:</strong>
             * <p>SUCCESS</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The call status code.</p>
             * 
             * <strong>example:</strong>
             * <p>200100</p>
             */
            public Builder statusCode(String statusCode) {
                this.statusCode = statusCode;
                return this;
            }

            /**
             * <p>The description of the call status code.</p>
             * 
             * <strong>example:</strong>
             * <p>Call succeeded</p>
             */
            public Builder statusCodeDesc(String statusCodeDesc) {
                this.statusCodeDesc = statusCodeDesc;
                return this;
            }

            /**
             * <p>The intent label.</p>
             * 
             * <strong>example:</strong>
             * <p>Affirmative</p>
             */
            public Builder tags(String tags) {
                this.tags = tags;
                return this;
            }

            public Record build() {
                return new Record(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListTaskDetailResponseBody} extends {@link TeaModel}
     *
     * <p>ListTaskDetailResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PageNo")
        private Long pageNo;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Long pageSize;

        @com.aliyun.core.annotation.NameInMap("Record")
        private java.util.List<Record> record;

        @com.aliyun.core.annotation.NameInMap("Total")
        private Long total;

        private Data(Builder builder) {
            this.pageNo = builder.pageNo;
            this.pageSize = builder.pageSize;
            this.record = builder.record;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return pageNo
         */
        public Long getPageNo() {
            return this.pageNo;
        }

        /**
         * @return pageSize
         */
        public Long getPageSize() {
            return this.pageSize;
        }

        /**
         * @return record
         */
        public java.util.List<Record> getRecord() {
            return this.record;
        }

        /**
         * @return total
         */
        public Long getTotal() {
            return this.total;
        }

        public static final class Builder {
            private Long pageNo; 
            private Long pageSize; 
            private java.util.List<Record> record; 
            private Long total; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.pageNo = model.pageNo;
                this.pageSize = model.pageSize;
                this.record = model.record;
                this.total = model.total;
            } 

            /**
             * <p>The number of entries per page.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder pageNo(Long pageNo) {
                this.pageNo = pageNo;
                return this;
            }

            /**
             * <p>The current page number.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder pageSize(Long pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The list of task details.</p>
             */
            public Builder record(java.util.List<Record> record) {
                this.record = record;
                return this;
            }

            /**
             * <p>The total number of tasks.</p>
             * 
             * <strong>example:</strong>
             * <p>50</p>
             */
            public Builder total(Long total) {
                this.total = total;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
