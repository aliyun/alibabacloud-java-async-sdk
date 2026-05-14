// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyvmsapi20170525.models;

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
 * {@link CloudListTaskFileResponseBody} extends {@link TeaModel}
 *
 * <p>CloudListTaskFileResponseBody</p>
 */
public class CloudListTaskFileResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private String accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CloudListTaskFileResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CloudListTaskFileResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessDeniedDetail
     */
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
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

    public static final class Builder {
        private String accessDeniedDetail; 
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CloudListTaskFileResponseBody model) {
            this.accessDeniedDetail = model.accessDeniedDetail;
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * AccessDeniedDetail.
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CloudListTaskFileResponseBody build() {
            return new CloudListTaskFileResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CloudListTaskFileResponseBody} extends {@link TeaModel}
     *
     * <p>CloudListTaskFileResponseBody</p>
     */
    public static class TaskFileList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("EnterpriseId")
        private String enterpriseId;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("ImportCount")
        private String importCount;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Priority")
        private String priority;

        @com.aliyun.core.annotation.NameInMap("RepeatCount")
        private String repeatCount;

        @com.aliyun.core.annotation.NameInMap("RestrictCount")
        private String restrictCount;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private String taskId;

        private TaskFileList(Builder builder) {
            this.createTime = builder.createTime;
            this.enterpriseId = builder.enterpriseId;
            this.id = builder.id;
            this.importCount = builder.importCount;
            this.name = builder.name;
            this.priority = builder.priority;
            this.repeatCount = builder.repeatCount;
            this.restrictCount = builder.restrictCount;
            this.status = builder.status;
            this.taskId = builder.taskId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TaskFileList create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return enterpriseId
         */
        public String getEnterpriseId() {
            return this.enterpriseId;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return importCount
         */
        public String getImportCount() {
            return this.importCount;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return priority
         */
        public String getPriority() {
            return this.priority;
        }

        /**
         * @return repeatCount
         */
        public String getRepeatCount() {
            return this.repeatCount;
        }

        /**
         * @return restrictCount
         */
        public String getRestrictCount() {
            return this.restrictCount;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        public static final class Builder {
            private String createTime; 
            private String enterpriseId; 
            private String id; 
            private String importCount; 
            private String name; 
            private String priority; 
            private String repeatCount; 
            private String restrictCount; 
            private String status; 
            private String taskId; 

            private Builder() {
            } 

            private Builder(TaskFileList model) {
                this.createTime = model.createTime;
                this.enterpriseId = model.enterpriseId;
                this.id = model.id;
                this.importCount = model.importCount;
                this.name = model.name;
                this.priority = model.priority;
                this.repeatCount = model.repeatCount;
                this.restrictCount = model.restrictCount;
                this.status = model.status;
                this.taskId = model.taskId;
            } 

            /**
             * <p>创建批次时间，格式为： yyyy-MM-dd HH:mm:ss</p>
             * 
             * <strong>example:</strong>
             * <p>2026-04-20 10:00:00</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>企业编号</p>
             * 
             * <strong>example:</strong>
             * <p>7000002</p>
             */
            public Builder enterpriseId(String enterpriseId) {
                this.enterpriseId = enterpriseId;
                return this;
            }

            /**
             * <p>批次Id</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>导入条数</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder importCount(String importCount) {
                this.importCount = importCount;
                return this;
            }

            /**
             * <p>批次名称</p>
             * 
             * <strong>example:</strong>
             * <p>name2</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>优先级，默认为0，值越大优先级越高</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder priority(String priority) {
                this.priority = priority;
                return this;
            }

            /**
             * <p>重复条数</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder repeatCount(String repeatCount) {
                this.repeatCount = repeatCount;
                return this;
            }

            /**
             * <p>黑名单条数</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder restrictCount(String restrictCount) {
                this.restrictCount = restrictCount;
                return this;
            }

            /**
             * <p>批次状态，0：未导入，1：导入完成 ，2：加载到缓存，3：呼叫完，4：已冻结</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>任务Id</p>
             * 
             * <strong>example:</strong>
             * <p>27</p>
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            public TaskFileList build() {
                return new TaskFileList(this);
            } 

        } 

    }
    /**
     * 
     * {@link CloudListTaskFileResponseBody} extends {@link TeaModel}
     *
     * <p>CloudListTaskFileResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TaskFileList")
        private java.util.List<TaskFileList> taskFileList;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private String totalCount;

        private Data(Builder builder) {
            this.taskFileList = builder.taskFileList;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return taskFileList
         */
        public java.util.List<TaskFileList> getTaskFileList() {
            return this.taskFileList;
        }

        /**
         * @return totalCount
         */
        public String getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private java.util.List<TaskFileList> taskFileList; 
            private String totalCount; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.taskFileList = model.taskFileList;
                this.totalCount = model.totalCount;
            } 

            /**
             * <p>任务批次信息</p>
             */
            public Builder taskFileList(java.util.List<TaskFileList> taskFileList) {
                this.taskFileList = taskFileList;
                return this;
            }

            /**
             * TotalCount.
             */
            public Builder totalCount(String totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
