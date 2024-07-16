// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dm20170622.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryTaskByParamResponseBody} extends {@link TeaModel}
 *
 * <p>QueryTaskByParamResponseBody</p>
 */
public class QueryTaskByParamResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    private QueryTaskByParamResponseBody(Builder builder) {
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
        this.data = builder.data;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryTaskByParamResponseBody create() {
        return builder().build();
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    public static final class Builder {
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 
        private Data data; 

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        public QueryTaskByParamResponseBody build() {
            return new QueryTaskByParamResponseBody(this);
        } 

    } 

    public static class Task extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AddressType")
        private String addressType;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("ReceiversName")
        private String receiversName;

        @com.aliyun.core.annotation.NameInMap("RequestCount")
        private String requestCount;

        @com.aliyun.core.annotation.NameInMap("TagName")
        private String tagName;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private String taskId;

        @com.aliyun.core.annotation.NameInMap("TaskStatus")
        private String taskStatus;

        @com.aliyun.core.annotation.NameInMap("TemplateName")
        private String templateName;

        @com.aliyun.core.annotation.NameInMap("UtcCreateTime")
        private Long utcCreateTime;

        private Task(Builder builder) {
            this.addressType = builder.addressType;
            this.createTime = builder.createTime;
            this.receiversName = builder.receiversName;
            this.requestCount = builder.requestCount;
            this.tagName = builder.tagName;
            this.taskId = builder.taskId;
            this.taskStatus = builder.taskStatus;
            this.templateName = builder.templateName;
            this.utcCreateTime = builder.utcCreateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Task create() {
            return builder().build();
        }

        /**
         * @return addressType
         */
        public String getAddressType() {
            return this.addressType;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return receiversName
         */
        public String getReceiversName() {
            return this.receiversName;
        }

        /**
         * @return requestCount
         */
        public String getRequestCount() {
            return this.requestCount;
        }

        /**
         * @return tagName
         */
        public String getTagName() {
            return this.tagName;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        /**
         * @return taskStatus
         */
        public String getTaskStatus() {
            return this.taskStatus;
        }

        /**
         * @return templateName
         */
        public String getTemplateName() {
            return this.templateName;
        }

        /**
         * @return utcCreateTime
         */
        public Long getUtcCreateTime() {
            return this.utcCreateTime;
        }

        public static final class Builder {
            private String addressType; 
            private String createTime; 
            private String receiversName; 
            private String requestCount; 
            private String tagName; 
            private String taskId; 
            private String taskStatus; 
            private String templateName; 
            private Long utcCreateTime; 

            /**
             * AddressType.
             */
            public Builder addressType(String addressType) {
                this.addressType = addressType;
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
             * ReceiversName.
             */
            public Builder receiversName(String receiversName) {
                this.receiversName = receiversName;
                return this;
            }

            /**
             * RequestCount.
             */
            public Builder requestCount(String requestCount) {
                this.requestCount = requestCount;
                return this;
            }

            /**
             * TagName.
             */
            public Builder tagName(String tagName) {
                this.tagName = tagName;
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
             * TaskStatus.
             */
            public Builder taskStatus(String taskStatus) {
                this.taskStatus = taskStatus;
                return this;
            }

            /**
             * TemplateName.
             */
            public Builder templateName(String templateName) {
                this.templateName = templateName;
                return this;
            }

            /**
             * UtcCreateTime.
             */
            public Builder utcCreateTime(Long utcCreateTime) {
                this.utcCreateTime = utcCreateTime;
                return this;
            }

            public Task build() {
                return new Task(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("task")
        private java.util.List < Task> task;

        private Data(Builder builder) {
            this.task = builder.task;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return task
         */
        public java.util.List < Task> getTask() {
            return this.task;
        }

        public static final class Builder {
            private java.util.List < Task> task; 

            /**
             * task.
             */
            public Builder task(java.util.List < Task> task) {
                this.task = task;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
