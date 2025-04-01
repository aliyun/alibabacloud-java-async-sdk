// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.computenestsupplier20210521.models;

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
 * {@link ListServiceTestTasksResponseBody} extends {@link TeaModel}
 *
 * <p>ListServiceTestTasksResponseBody</p>
 */
public class ListServiceTestTasksResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Count")
    private Integer count;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ServiceTestTasks")
    private java.util.List<ServiceTestTasks> serviceTestTasks;

    private ListServiceTestTasksResponseBody(Builder builder) {
        this.count = builder.count;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.serviceTestTasks = builder.serviceTestTasks;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListServiceTestTasksResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return count
     */
    public Integer getCount() {
        return this.count;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return serviceTestTasks
     */
    public java.util.List<ServiceTestTasks> getServiceTestTasks() {
        return this.serviceTestTasks;
    }

    public static final class Builder {
        private Integer count; 
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private java.util.List<ServiceTestTasks> serviceTestTasks; 

        private Builder() {
        } 

        private Builder(ListServiceTestTasksResponseBody model) {
            this.count = model.count;
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.serviceTestTasks = model.serviceTestTasks;
        } 

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>9</p>
         */
        public Builder count(Integer count) {
            this.count = count;
            return this;
        }

        /**
         * <p>The number of items to return per page when paginating results. The maximum is 100, and the default is 20.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The pagination token that is used in the next request to retrieve a new page of results. You do not need to specify this parameter for the first request. You must specify the token that is obtained from the previous query as the value of NextToken.</p>
         * 
         * <strong>example:</strong>
         * <p>AAAAAfu+XtuBE55iRLHEYYuojI4=</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>51945B04-6AA6-410D-93BA-236E0248B104</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The service test tasks.</p>
         */
        public Builder serviceTestTasks(java.util.List<ServiceTestTasks> serviceTestTasks) {
            this.serviceTestTasks = serviceTestTasks;
            return this;
        }

        public ListServiceTestTasksResponseBody build() {
            return new ListServiceTestTasksResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListServiceTestTasksResponseBody} extends {@link TeaModel}
     *
     * <p>ListServiceTestTasksResponseBody</p>
     */
    public static class ServiceTestTasks extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private String taskId;

        @com.aliyun.core.annotation.NameInMap("TaskName")
        private String taskName;

        @com.aliyun.core.annotation.NameInMap("TaskRegionId")
        private String taskRegionId;

        private ServiceTestTasks(Builder builder) {
            this.createTime = builder.createTime;
            this.status = builder.status;
            this.taskId = builder.taskId;
            this.taskName = builder.taskName;
            this.taskRegionId = builder.taskRegionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ServiceTestTasks create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
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

        /**
         * @return taskName
         */
        public String getTaskName() {
            return this.taskName;
        }

        /**
         * @return taskRegionId
         */
        public String getTaskRegionId() {
            return this.taskRegionId;
        }

        public static final class Builder {
            private String createTime; 
            private String status; 
            private String taskId; 
            private String taskName; 
            private String taskRegionId; 

            private Builder() {
            } 

            private Builder(ServiceTestTasks model) {
                this.createTime = model.createTime;
                this.status = model.status;
                this.taskId = model.taskId;
                this.taskName = model.taskName;
                this.taskRegionId = model.taskRegionId;
            } 

            /**
             * <p>The time when the task was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-02-26T02:16:35Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>the status of service task.</p>
             * 
             * <strong>example:</strong>
             * <p>Success</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The task ID.</p>
             * 
             * <strong>example:</strong>
             * <p>sttt-000h5nd4yrg59ucurzy1</p>
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * <p>The name of the task.</p>
             * 
             * <strong>example:</strong>
             * <p>dadadad</p>
             */
            public Builder taskName(String taskName) {
                this.taskName = taskName;
                return this;
            }

            /**
             * <p>The task region id.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-beijing</p>
             */
            public Builder taskRegionId(String taskRegionId) {
                this.taskRegionId = taskRegionId;
                return this;
            }

            public ServiceTestTasks build() {
                return new ServiceTestTasks(this);
            } 

        } 

    }
}
