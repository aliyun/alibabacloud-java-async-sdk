// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

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
 * {@link DescribeCdnTaskListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCdnTaskListResponseBody</p>
 */
public class DescribeCdnTaskListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Content")
    private Content content;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeCdnTaskListResponseBody(Builder builder) {
        this.content = builder.content;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCdnTaskListResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return content
     */
    public Content getContent() {
        return this.content;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Content content; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeCdnTaskListResponseBody model) {
            this.content = model.content;
            this.requestId = model.requestId;
        } 

        /**
         * Content.
         */
        public Builder content(Content content) {
            this.content = content;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeCdnTaskListResponseBody build() {
            return new DescribeCdnTaskListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeCdnTaskListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCdnTaskListResponseBody</p>
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
             * Aliuid.
             */
            public Builder aliuid(String aliuid) {
                this.aliuid = aliuid;
                return this;
            }

            /**
             * ClientAddr.
             */
            public Builder clientAddr(String clientAddr) {
                this.clientAddr = clientAddr;
                return this;
            }

            /**
             * ClientIp.
             */
            public Builder clientIp(String clientIp) {
                this.clientIp = clientIp;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * DiagnoseId.
             */
            public Builder diagnoseId(String diagnoseId) {
                this.diagnoseId = diagnoseId;
                return this;
            }

            /**
             * DiagnoseUrl.
             */
            public Builder diagnoseUrl(String diagnoseUrl) {
                this.diagnoseUrl = diagnoseUrl;
                return this;
            }

            /**
             * Domain.
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * ExpireTime.
             */
            public Builder expireTime(Long expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * RemainDiagnoseTimes.
             */
            public Builder remainDiagnoseTimes(Long remainDiagnoseTimes) {
                this.remainDiagnoseTimes = remainDiagnoseTimes;
                return this;
            }

            /**
             * State.
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(Long status) {
                this.status = status;
                return this;
            }

            /**
             * TaskId.
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * TimeConsuming.
             */
            public Builder timeConsuming(Long timeConsuming) {
                this.timeConsuming = timeConsuming;
                return this;
            }

            /**
             * TraceId.
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
    /**
     * 
     * {@link DescribeCdnTaskListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCdnTaskListResponseBody</p>
     */
    public static class Content extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Count")
        private Long count;

        @com.aliyun.core.annotation.NameInMap("List")
        private java.util.List<List> list;

        @com.aliyun.core.annotation.NameInMap("PageNumber")
        private Long pageNumber;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Long pageSize;

        private Content(Builder builder) {
            this.count = builder.count;
            this.list = builder.list;
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Content create() {
            return builder().build();
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

        public static final class Builder {
            private Long count; 
            private java.util.List<List> list; 
            private Long pageNumber; 
            private Long pageSize; 

            private Builder() {
            } 

            private Builder(Content model) {
                this.count = model.count;
                this.list = model.list;
                this.pageNumber = model.pageNumber;
                this.pageSize = model.pageSize;
            } 

            /**
             * Count.
             */
            public Builder count(Long count) {
                this.count = count;
                return this;
            }

            /**
             * List.
             */
            public Builder list(java.util.List<List> list) {
                this.list = list;
                return this;
            }

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

            public Content build() {
                return new Content(this);
            } 

        } 

    }
}
