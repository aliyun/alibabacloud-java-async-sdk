// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emrstudio20231009.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListWorkflowInstancesResponseBody} extends {@link TeaModel}
 *
 * <p>ListWorkflowInstancesResponseBody</p>
 */
public class ListWorkflowInstancesResponseBody extends TeaModel {
    @NameInMap("data")
    private java.util.List < Data> data;

    @NameInMap("nextToken")
    private String nextToken;

    @NameInMap("requestId")
    private String requestId;

    @NameInMap("totalSize")
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

    public static class Data extends TeaModel {
        @NameInMap("endDate")
        private String endDate;

        @NameInMap("name")
        private String name;

        @NameInMap("runTimes")
        private String runTimes;

        @NameInMap("scheduleTime")
        private String scheduleTime;

        @NameInMap("startDate")
        private String startDate;

        @NameInMap("state")
        private String state;

        @NameInMap("workflowId")
        private Long workflowId;

        @NameInMap("workflowInstanceId")
        private Long workflowInstanceId;

        @NameInMap("workflowVersion")
        private String workflowVersion;

        private Data(Builder builder) {
            this.endDate = builder.endDate;
            this.name = builder.name;
            this.runTimes = builder.runTimes;
            this.scheduleTime = builder.scheduleTime;
            this.startDate = builder.startDate;
            this.state = builder.state;
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
         * @return endDate
         */
        public String getEndDate() {
            return this.endDate;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return runTimes
         */
        public String getRunTimes() {
            return this.runTimes;
        }

        /**
         * @return scheduleTime
         */
        public String getScheduleTime() {
            return this.scheduleTime;
        }

        /**
         * @return startDate
         */
        public String getStartDate() {
            return this.startDate;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        /**
         * @return workflowId
         */
        public Long getWorkflowId() {
            return this.workflowId;
        }

        /**
         * @return workflowInstanceId
         */
        public Long getWorkflowInstanceId() {
            return this.workflowInstanceId;
        }

        /**
         * @return workflowVersion
         */
        public String getWorkflowVersion() {
            return this.workflowVersion;
        }

        public static final class Builder {
            private String endDate; 
            private String name; 
            private String runTimes; 
            private String scheduleTime; 
            private String startDate; 
            private String state; 
            private Long workflowId; 
            private Long workflowInstanceId; 
            private String workflowVersion; 

            /**
             * endDate.
             */
            public Builder endDate(String endDate) {
                this.endDate = endDate;
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
             * runTimes.
             */
            public Builder runTimes(String runTimes) {
                this.runTimes = runTimes;
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
             * startDate.
             */
            public Builder startDate(String startDate) {
                this.startDate = startDate;
                return this;
            }

            /**
             * state.
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * workflowId.
             */
            public Builder workflowId(Long workflowId) {
                this.workflowId = workflowId;
                return this;
            }

            /**
             * workflowInstanceId.
             */
            public Builder workflowInstanceId(Long workflowInstanceId) {
                this.workflowInstanceId = workflowInstanceId;
                return this;
            }

            /**
             * workflowVersion.
             */
            public Builder workflowVersion(String workflowVersion) {
                this.workflowVersion = workflowVersion;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
