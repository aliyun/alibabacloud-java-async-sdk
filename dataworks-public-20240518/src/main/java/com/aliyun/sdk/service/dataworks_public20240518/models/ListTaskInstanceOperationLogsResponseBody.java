// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListTaskInstanceOperationLogsResponseBody} extends {@link TeaModel}
 *
 * <p>ListTaskInstanceOperationLogsResponseBody</p>
 */
public class ListTaskInstanceOperationLogsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PagingInfo")
    private PagingInfo pagingInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListTaskInstanceOperationLogsResponseBody(Builder builder) {
        this.pagingInfo = builder.pagingInfo;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTaskInstanceOperationLogsResponseBody create() {
        return builder().build();
    }

    /**
     * @return pagingInfo
     */
    public PagingInfo getPagingInfo() {
        return this.pagingInfo;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private PagingInfo pagingInfo; 
        private String requestId; 

        /**
         * <p>The pagination information.</p>
         */
        public Builder pagingInfo(PagingInfo pagingInfo) {
            this.pagingInfo = pagingInfo;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>22C97E95-F023-56B5-8852-B1A77A17XXXX</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListTaskInstanceOperationLogsResponseBody build() {
            return new ListTaskInstanceOperationLogsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListTaskInstanceOperationLogsResponseBody} extends {@link TeaModel}
     *
     * <p>ListTaskInstanceOperationLogsResponseBody</p>
     */
    public static class OperationLogs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("OperationContent")
        private String operationContent;

        @com.aliyun.core.annotation.NameInMap("OperationSeq")
        private Long operationSeq;

        @com.aliyun.core.annotation.NameInMap("TaskInstanceId")
        private Long taskInstanceId;

        @com.aliyun.core.annotation.NameInMap("User")
        private String user;

        private OperationLogs(Builder builder) {
            this.createTime = builder.createTime;
            this.operationContent = builder.operationContent;
            this.operationSeq = builder.operationSeq;
            this.taskInstanceId = builder.taskInstanceId;
            this.user = builder.user;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OperationLogs create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return operationContent
         */
        public String getOperationContent() {
            return this.operationContent;
        }

        /**
         * @return operationSeq
         */
        public Long getOperationSeq() {
            return this.operationSeq;
        }

        /**
         * @return taskInstanceId
         */
        public Long getTaskInstanceId() {
            return this.taskInstanceId;
        }

        /**
         * @return user
         */
        public String getUser() {
            return this.user;
        }

        public static final class Builder {
            private Long createTime; 
            private String operationContent; 
            private Long operationSeq; 
            private Long taskInstanceId; 
            private String user; 

            /**
             * <p>The time when the operation log was generated.</p>
             * 
             * <strong>example:</strong>
             * <p>1710239005403</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The operation content.</p>
             */
            public Builder operationContent(String operationContent) {
                this.operationContent = operationContent;
                return this;
            }

            /**
             * <p>The serial number of the operation.</p>
             * 
             * <strong>example:</strong>
             * <p>1111</p>
             */
            public Builder operationSeq(Long operationSeq) {
                this.operationSeq = operationSeq;
                return this;
            }

            /**
             * <p>The ID of the instance on which the operation was performed.</p>
             * 
             * <strong>example:</strong>
             * <p>1234</p>
             */
            public Builder taskInstanceId(Long taskInstanceId) {
                this.taskInstanceId = taskInstanceId;
                return this;
            }

            /**
             * <p>The account ID of the operator.</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder user(String user) {
                this.user = user;
                return this;
            }

            public OperationLogs build() {
                return new OperationLogs(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListTaskInstanceOperationLogsResponseBody} extends {@link TeaModel}
     *
     * <p>ListTaskInstanceOperationLogsResponseBody</p>
     */
    public static class PagingInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("OperationLogs")
        private java.util.List < OperationLogs> operationLogs;

        @com.aliyun.core.annotation.NameInMap("PageNumber")
        private Integer pageNumber;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        private PagingInfo(Builder builder) {
            this.operationLogs = builder.operationLogs;
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PagingInfo create() {
            return builder().build();
        }

        /**
         * @return operationLogs
         */
        public java.util.List < OperationLogs> getOperationLogs() {
            return this.operationLogs;
        }

        /**
         * @return pageNumber
         */
        public Integer getPageNumber() {
            return this.pageNumber;
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
            private java.util.List < OperationLogs> operationLogs; 
            private Integer pageNumber; 
            private Integer pageSize; 
            private Integer totalCount; 

            /**
             * <p>The operation logs.</p>
             */
            public Builder operationLogs(java.util.List < OperationLogs> operationLogs) {
                this.operationLogs = operationLogs;
                return this;
            }

            /**
             * <p>The page number.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder pageNumber(Integer pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * <p>The number of entries per page.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The total number of entries returned.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public PagingInfo build() {
                return new PagingInfo(this);
            } 

        } 

    }
}
