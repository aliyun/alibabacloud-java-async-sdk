// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
 * {@link ListTraceTasksResponseBody} extends {@link TeaModel}
 *
 * <p>ListTraceTasksResponseBody</p>
 */
public class ListTraceTasksResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Count")
    private Long count;

    @com.aliyun.core.annotation.NameInMap("List")
    private java.util.List<List> list;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Long pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListTraceTasksResponseBody(Builder builder) {
        this.count = builder.count;
        this.list = builder.list;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTraceTasksResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return count
     */
    public Long getCount() {
        return this.count;
    }

    /**
     * @return list
     */
    public java.util.List<List> getList() {
        return this.list;
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Long count; 
        private java.util.List<List> list; 
        private Long pageNumber; 
        private Long pageSize; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListTraceTasksResponseBody model) {
            this.count = model.count;
            this.list = model.list;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The number of pages.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder count(Long count) {
            this.count = count;
            return this;
        }

        /**
         * <p>The returned list information.</p>
         */
        public Builder list(java.util.List<List> list) {
            this.list = list;
            return this;
        }

        /**
         * <p>The page number, starting from 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page. Valid values: any integer from 1 to 1000.</p>
         * 
         * <strong>example:</strong>
         * <p>6</p>
         */
        public Builder pageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>4E09C5D7-E1CF-4CAA-A45E-8727F4C8FD70</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListTraceTasksResponseBody build() {
            return new ListTraceTasksResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListTraceTasksResponseBody} extends {@link TeaModel}
     *
     * <p>ListTraceTasksResponseBody</p>
     */
    public static class List extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Aliuid")
        private String aliuid;

        @com.aliyun.core.annotation.NameInMap("ClientAddr")
        private String clientAddr;

        @com.aliyun.core.annotation.NameInMap("ClientIp")
        private String clientIp;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("DiagnoseId")
        private String diagnoseId;

        @com.aliyun.core.annotation.NameInMap("DiagnoseUrl")
        private String diagnoseUrl;

        @com.aliyun.core.annotation.NameInMap("Domain")
        private String domain;

        @com.aliyun.core.annotation.NameInMap("ExpireTime")
        private Long expireTime;

        @com.aliyun.core.annotation.NameInMap("RemainDiagnoseTimes")
        private Long remainDiagnoseTimes;

        @com.aliyun.core.annotation.NameInMap("State")
        private String state;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Long status;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private String taskId;

        @com.aliyun.core.annotation.NameInMap("TimeConsuming")
        private Long timeConsuming;

        @com.aliyun.core.annotation.NameInMap("TraceId")
        private String traceId;

        private List(Builder builder) {
            this.aliuid = builder.aliuid;
            this.clientAddr = builder.clientAddr;
            this.clientIp = builder.clientIp;
            this.createTime = builder.createTime;
            this.diagnoseId = builder.diagnoseId;
            this.diagnoseUrl = builder.diagnoseUrl;
            this.domain = builder.domain;
            this.expireTime = builder.expireTime;
            this.remainDiagnoseTimes = builder.remainDiagnoseTimes;
            this.state = builder.state;
            this.status = builder.status;
            this.taskId = builder.taskId;
            this.timeConsuming = builder.timeConsuming;
            this.traceId = builder.traceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static List create() {
            return builder().build();
        }

        /**
         * @return aliuid
         */
        public String getAliuid() {
            return this.aliuid;
        }

        /**
         * @return clientAddr
         */
        public String getClientAddr() {
            return this.clientAddr;
        }

        /**
         * @return clientIp
         */
        public String getClientIp() {
            return this.clientIp;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return diagnoseId
         */
        public String getDiagnoseId() {
            return this.diagnoseId;
        }

        /**
         * @return diagnoseUrl
         */
        public String getDiagnoseUrl() {
            return this.diagnoseUrl;
        }

        /**
         * @return domain
         */
        public String getDomain() {
            return this.domain;
        }

        /**
         * @return expireTime
         */
        public Long getExpireTime() {
            return this.expireTime;
        }

        /**
         * @return remainDiagnoseTimes
         */
        public Long getRemainDiagnoseTimes() {
            return this.remainDiagnoseTimes;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        /**
         * @return status
         */
        public Long getStatus() {
            return this.status;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        /**
         * @return timeConsuming
         */
        public Long getTimeConsuming() {
            return this.timeConsuming;
        }

        /**
         * @return traceId
         */
        public String getTraceId() {
            return this.traceId;
        }

        public static final class Builder {
            private String aliuid; 
            private String clientAddr; 
            private String clientIp; 
            private String createTime; 
            private String diagnoseId; 
            private String diagnoseUrl; 
            private String domain; 
            private Long expireTime; 
            private Long remainDiagnoseTimes; 
            private String state; 
            private Long status; 
            private String taskId; 
            private Long timeConsuming; 
            private String traceId; 

            private Builder() {
            } 

            private Builder(List model) {
                this.aliuid = model.aliuid;
                this.clientAddr = model.clientAddr;
                this.clientIp = model.clientIp;
                this.createTime = model.createTime;
                this.diagnoseId = model.diagnoseId;
                this.diagnoseUrl = model.diagnoseUrl;
                this.domain = model.domain;
                this.expireTime = model.expireTime;
                this.remainDiagnoseTimes = model.remainDiagnoseTimes;
                this.state = model.state;
                this.status = model.status;
                this.taskId = model.taskId;
                this.timeConsuming = model.timeConsuming;
                this.traceId = model.traceId;
            } 

            /**
             * <p>The Alibaba Cloud account ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1077********7468</p>
             */
            public Builder aliuid(String aliuid) {
                this.aliuid = aliuid;
                return this;
            }

            /**
             * <p>The IP address of the local DNS server.</p>
             * 
             * <strong>example:</strong>
             * <p>xx.xx.xx.xx</p>
             */
            public Builder clientAddr(String clientAddr) {
                this.clientAddr = clientAddr;
                return this;
            }

            /**
             * <p>The client IP address.</p>
             * 
             * <strong>example:</strong>
             * <p>xx.xx.xx.xx</p>
             */
            public Builder clientIp(String clientIp) {
                this.clientIp = clientIp;
                return this;
            }

            /**
             * <p>The time when the report was created. Format: yyyy-MM-dd HH:mm:ss. Time zone: UTC+8.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-12-10 15:11:47</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The diagnose ID.</p>
             * 
             * <strong>example:</strong>
             * <p>f2a18ad5</p>
             */
            public Builder diagnoseId(String diagnoseId) {
                this.diagnoseId = diagnoseId;
                return this;
            }

            /**
             * <p>The diagnose URL.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://cdn.dns-detect.alicdn.com/diagnose/xxxxxx">http://cdn.dns-detect.alicdn.com/diagnose/xxxxxx</a></p>
             */
            public Builder diagnoseUrl(String diagnoseUrl) {
                this.diagnoseUrl = diagnoseUrl;
                return this;
            }

            /**
             * <p>The domain name to be diagnosed.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://www.example.com">http://www.example.com</a></p>
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * <p>The expiration time. The value is a UNIX timestamp. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1669285111</p>
             */
            public Builder expireTime(Long expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * <p>The remaining number of available diagnostic attempts.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder remainDiagnoseTimes(Long remainDiagnoseTimes) {
                this.remainDiagnoseTimes = remainDiagnoseTimes;
                return this;
            }

            /**
             * <p>The report generation status. Valid values:</p>
             * <ul>
             * <li>0: Succeeded.</li>
             * <li>1: Failed.</li>
             * <li>2: Timed out.</li>
             * <li>3: Running.</li>
             * <li>4: Waiting.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * <p>The status of the diagnose URL. Valid values:</p>
             * <ul>
             * <li>1: Active.</li>
             * <li>0: Expired.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder status(Long status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The task ID.</p>
             * 
             * <strong>example:</strong>
             * <p>000000xxxxxxxxxxxxxxxxxxxxxxxxxxxx475e</p>
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * <p>The time consumed to generate the report.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder timeConsuming(Long timeConsuming) {
                this.timeConsuming = timeConsuming;
                return this;
            }

            /**
             * <p>The trace ID of the diagnostic task.</p>
             * 
             * <strong>example:</strong>
             * <p>000000xxxxxxxxxxxxxxxxxxxxxx25941e</p>
             */
            public Builder traceId(String traceId) {
                this.traceId = traceId;
                return this;
            }

            public List build() {
                return new List(this);
            } 

        } 

    }
}
