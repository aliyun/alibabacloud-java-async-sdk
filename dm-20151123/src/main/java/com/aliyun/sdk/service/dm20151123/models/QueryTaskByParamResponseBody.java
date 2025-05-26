// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dm20151123.models;

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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(QueryTaskByParamResponseBody model) {
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
            this.data = model.data;
        } 

        /**
         * <p>Current page number.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>Page size.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>10A1AD70-E48E-476D-98D9-39BD92193837</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Total count.</p>
         * 
         * <strong>example:</strong>
         * <p>15</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * <p>Returned results.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        public QueryTaskByParamResponseBody build() {
            return new QueryTaskByParamResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryTaskByParamResponseBody} extends {@link TeaModel}
     *
     * <p>QueryTaskByParamResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(Task model) {
                this.addressType = model.addressType;
                this.createTime = model.createTime;
                this.receiversName = model.receiversName;
                this.requestCount = model.requestCount;
                this.tagName = model.tagName;
                this.taskId = model.taskId;
                this.taskStatus = model.taskStatus;
                this.templateName = model.templateName;
                this.utcCreateTime = model.utcCreateTime;
            } 

            /**
             * <p>Address type, sending address: 1; random address: 0;</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder addressType(String addressType) {
                this.addressType = addressType;
                return this;
            }

            /**
             * <p>Creation time.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-04-18T10:36Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>Receiver&quot;s name.</p>
             * 
             * <strong>example:</strong>
             * <p>TKP000442-333</p>
             */
            public Builder receiversName(String receiversName) {
                this.receiversName = receiversName;
                return this;
            }

            /**
             * <p>Request count.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder requestCount(String requestCount) {
                this.requestCount = requestCount;
                return this;
            }

            /**
             * <p>Tag.</p>
             * 
             * <strong>example:</strong>
             * <p>202201</p>
             */
            public Builder tagName(String tagName) {
                this.tagName = tagName;
                return this;
            }

            /**
             * <p>Task ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1054296</p>
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * <p>Task status, sent successfully: 1.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder taskStatus(String taskStatus) {
                this.taskStatus = taskStatus;
                return this;
            }

            /**
             * <p>Template name.</p>
             * 
             * <strong>example:</strong>
             * <p>Short Simple</p>
             */
            public Builder templateName(String templateName) {
                this.templateName = templateName;
                return this;
            }

            /**
             * <p>Creation time in UTC format.</p>
             * 
             * <strong>example:</strong>
             * <p>1569734892</p>
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
    /**
     * 
     * {@link QueryTaskByParamResponseBody} extends {@link TeaModel}
     *
     * <p>QueryTaskByParamResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("task")
        private java.util.List<Task> task;

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
        public java.util.List<Task> getTask() {
            return this.task;
        }

        public static final class Builder {
            private java.util.List<Task> task; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.task = model.task;
            } 

            /**
             * task.
             */
            public Builder task(java.util.List<Task> task) {
                this.task = task;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
