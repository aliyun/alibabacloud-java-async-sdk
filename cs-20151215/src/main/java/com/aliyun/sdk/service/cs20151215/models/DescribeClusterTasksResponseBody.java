// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeClusterTasksResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeClusterTasksResponseBody</p>
 */
public class DescribeClusterTasksResponseBody extends TeaModel {
    @NameInMap("page_info")
    private PageInfo pageInfo;

    @NameInMap("requestId")
    private String requestId;

    @NameInMap("tasks")
    private java.util.List < Tasks> tasks;

    private DescribeClusterTasksResponseBody(Builder builder) {
        this.pageInfo = builder.pageInfo;
        this.requestId = builder.requestId;
        this.tasks = builder.tasks;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeClusterTasksResponseBody create() {
        return builder().build();
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

    /**
     * @return tasks
     */
    public java.util.List < Tasks> getTasks() {
        return this.tasks;
    }

    public static final class Builder {
        private PageInfo pageInfo; 
        private String requestId; 
        private java.util.List < Tasks> tasks; 

        /**
         * 分页信息。
         */
        public Builder pageInfo(PageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }

        /**
         * 请求ID。
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * 任务数组。
         */
        public Builder tasks(java.util.List < Tasks> tasks) {
            this.tasks = tasks;
            return this;
        }

        public DescribeClusterTasksResponseBody build() {
            return new DescribeClusterTasksResponseBody(this);
        } 

    } 

    public static class PageInfo extends TeaModel {
        @NameInMap("page_number")
        private Long pageNumber;

        @NameInMap("page_size")
        private Long pageSize;

        @NameInMap("total_count")
        private Long totalCount;

        private PageInfo(Builder builder) {
            this.pageNumber = builder.pageNumber;
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
         * @return totalCount
         */
        public Long getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private Long pageNumber; 
            private Long pageSize; 
            private Long totalCount; 

            /**
             * 页数。
             */
            public Builder pageNumber(Long pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * 每页数量。
             */
            public Builder pageSize(Long pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * 结果总数。
             */
            public Builder totalCount(Long totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public PageInfo build() {
                return new PageInfo(this);
            } 

        } 

    }
    public static class Error extends TeaModel {
        @NameInMap("code")
        private String code;

        @NameInMap("message")
        private String message;

        private Error(Builder builder) {
            this.code = builder.code;
            this.message = builder.message;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Error create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        public static final class Builder {
            private String code; 
            private String message; 

            /**
             * 错误码。
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * 错误信息。
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            public Error build() {
                return new Error(this);
            } 

        } 

    }
    public static class Tasks extends TeaModel {
        @NameInMap("created")
        private String created;

        @NameInMap("error")
        private Error error;

        @NameInMap("state")
        private String state;

        @NameInMap("task_id")
        private String taskId;

        @NameInMap("task_type")
        private String taskType;

        @NameInMap("updated")
        private String updated;

        private Tasks(Builder builder) {
            this.created = builder.created;
            this.error = builder.error;
            this.state = builder.state;
            this.taskId = builder.taskId;
            this.taskType = builder.taskType;
            this.updated = builder.updated;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tasks create() {
            return builder().build();
        }

        /**
         * @return created
         */
        public String getCreated() {
            return this.created;
        }

        /**
         * @return error
         */
        public Error getError() {
            return this.error;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        /**
         * @return taskType
         */
        public String getTaskType() {
            return this.taskType;
        }

        /**
         * @return updated
         */
        public String getUpdated() {
            return this.updated;
        }

        public static final class Builder {
            private String created; 
            private Error error; 
            private String state; 
            private String taskId; 
            private String taskType; 
            private String updated; 

            /**
             * 创建时间。
             */
            public Builder created(String created) {
                this.created = created;
                return this;
            }

            /**
             * error.
             */
            public Builder error(Error error) {
                this.error = error;
                return this;
            }

            /**
             * 任务状态。
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * 任务ID。
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * 任务类型。
             */
            public Builder taskType(String taskType) {
                this.taskType = taskType;
                return this;
            }

            /**
             * 更新时间。
             */
            public Builder updated(String updated) {
                this.updated = updated;
                return this;
            }

            public Tasks build() {
                return new Tasks(this);
            } 

        } 

    }
}
