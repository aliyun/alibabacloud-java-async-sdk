// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emrstudio20240430.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListWorkflowInstancesResponseBody} extends {@link TeaModel}
 *
 * <p>ListWorkflowInstancesResponseBody</p>
 */
public class ListWorkflowInstancesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    private java.util.List < Data> data;

    @com.aliyun.core.annotation.NameInMap("nextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("totalSize")
    private Integer totalSize;

    private ListWorkflowInstancesResponseBody(Builder builder) {
        this.data = builder.data;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalSize = builder.totalSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListWorkflowInstancesResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
        return this.data;
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
     * @return totalSize
     */
    public Integer getTotalSize() {
        return this.totalSize;
    }

    public static final class Builder {
        private java.util.List < Data> data; 
        private String nextToken; 
        private String requestId; 
        private Integer totalSize; 

        /**
         * data.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * nextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * totalSize.
         */
        public Builder totalSize(Integer totalSize) {
            this.totalSize = totalSize;
            return this;
        }

        public ListWorkflowInstancesResponseBody build() {
            return new ListWorkflowInstancesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListWorkflowInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>ListWorkflowInstancesResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("endTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("scheduleTime")
        private String scheduleTime;

        @com.aliyun.core.annotation.NameInMap("startTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("workflowId")
        private String workflowId;

        @com.aliyun.core.annotation.NameInMap("workflowInstanceId")
        private String workflowInstanceId;

        @com.aliyun.core.annotation.NameInMap("workflowVersion")
        private Integer workflowVersion;

        private Data(Builder builder) {
            this.endTime = builder.endTime;
            this.name = builder.name;
            this.scheduleTime = builder.scheduleTime;
            this.startTime = builder.startTime;
            this.status = builder.status;
            this.workflowId = builder.workflowId;
            this.workflowInstanceId = builder.workflowInstanceId;
            this.workflowVersion = builder.workflowVersion;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return scheduleTime
         */
        public String getScheduleTime() {
            return this.scheduleTime;
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
         * @return workflowId
         */
        public String getWorkflowId() {
            return this.workflowId;
        }

        /**
         * @return workflowInstanceId
         */
        public String getWorkflowInstanceId() {
            return this.workflowInstanceId;
        }

        /**
         * @return workflowVersion
         */
        public Integer getWorkflowVersion() {
            return this.workflowVersion;
        }

        public static final class Builder {
            private String endTime; 
            private String name; 
            private String scheduleTime; 
            private String startTime; 
            private String status; 
            private String workflowId; 
            private String workflowInstanceId; 
            private Integer workflowVersion; 

            /**
             * endTime.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * scheduleTime.
             */
            public Builder scheduleTime(String scheduleTime) {
                this.scheduleTime = scheduleTime;
                return this;
            }

            /**
             * startTime.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * workflowId.
             */
            public Builder workflowId(String workflowId) {
                this.workflowId = workflowId;
                return this;
            }

            /**
             * workflowInstanceId.
             */
            public Builder workflowInstanceId(String workflowInstanceId) {
                this.workflowInstanceId = workflowInstanceId;
                return this;
            }

            /**
             * workflowVersion.
             */
            public Builder workflowVersion(Integer workflowVersion) {
                this.workflowVersion = workflowVersion;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
