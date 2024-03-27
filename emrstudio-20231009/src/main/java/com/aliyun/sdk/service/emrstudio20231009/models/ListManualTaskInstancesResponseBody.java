// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emrstudio20231009.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListManualTaskInstancesResponseBody} extends {@link TeaModel}
 *
 * <p>ListManualTaskInstancesResponseBody</p>
 */
public class ListManualTaskInstancesResponseBody extends TeaModel {
    @NameInMap("data")
    private java.util.List < Data> data;

    @NameInMap("nextToken")
    private String nextToken;

    @NameInMap("requestId")
    private String requestId;

    @NameInMap("totalSize")
    private Integer totalSize;

    private ListManualTaskInstancesResponseBody(Builder builder) {
        this.data = builder.data;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalSize = builder.totalSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListManualTaskInstancesResponseBody create() {
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
         * Id of the request
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

        public ListManualTaskInstancesResponseBody build() {
            return new ListManualTaskInstancesResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("EmrClusterId")
        private String emrClusterId;

        @NameInMap("EndTime")
        private String endTime;

        @NameInMap("ExternalAppId")
        private String externalAppId;

        @NameInMap("ManualTaskInstanceId")
        private String manualTaskInstanceId;

        @NameInMap("ManualTaskInstanceName")
        private String manualTaskInstanceName;

        @NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @NameInMap("StartTime")
        private String startTime;

        @NameInMap("Status")
        private String status;

        @NameInMap("SubmitTime")
        private String submitTime;

        @NameInMap("TaskParams")
        private String taskParams;

        @NameInMap("TaskType")
        private String taskType;

        private Data(Builder builder) {
            this.emrClusterId = builder.emrClusterId;
            this.endTime = builder.endTime;
            this.externalAppId = builder.externalAppId;
            this.manualTaskInstanceId = builder.manualTaskInstanceId;
            this.manualTaskInstanceName = builder.manualTaskInstanceName;
            this.resourceGroupId = builder.resourceGroupId;
            this.startTime = builder.startTime;
            this.status = builder.status;
            this.submitTime = builder.submitTime;
            this.taskParams = builder.taskParams;
            this.taskType = builder.taskType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return emrClusterId
         */
        public String getEmrClusterId() {
            return this.emrClusterId;
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return externalAppId
         */
        public String getExternalAppId() {
            return this.externalAppId;
        }

        /**
         * @return manualTaskInstanceId
         */
        public String getManualTaskInstanceId() {
            return this.manualTaskInstanceId;
        }

        /**
         * @return manualTaskInstanceName
         */
        public String getManualTaskInstanceName() {
            return this.manualTaskInstanceName;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
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
         * @return submitTime
         */
        public String getSubmitTime() {
            return this.submitTime;
        }

        /**
         * @return taskParams
         */
        public String getTaskParams() {
            return this.taskParams;
        }

        /**
         * @return taskType
         */
        public String getTaskType() {
            return this.taskType;
        }

        public static final class Builder {
            private String emrClusterId; 
            private String endTime; 
            private String externalAppId; 
            private String manualTaskInstanceId; 
            private String manualTaskInstanceName; 
            private String resourceGroupId; 
            private String startTime; 
            private String status; 
            private String submitTime; 
            private String taskParams; 
            private String taskType; 

            /**
             * EMR集群ID
             */
            public Builder emrClusterId(String emrClusterId) {
                this.emrClusterId = emrClusterId;
                return this;
            }

            /**
             * 结束时间
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * 外部应用ID
             */
            public Builder externalAppId(String externalAppId) {
                this.externalAppId = externalAppId;
                return this;
            }

            /**
             * 代表资源一级ID的资源属性字段
             */
            public Builder manualTaskInstanceId(String manualTaskInstanceId) {
                this.manualTaskInstanceId = manualTaskInstanceId;
                return this;
            }

            /**
             * 代表资源名称的资源属性字段
             */
            public Builder manualTaskInstanceName(String manualTaskInstanceName) {
                this.manualTaskInstanceName = manualTaskInstanceName;
                return this;
            }

            /**
             * 资源组ID
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * 开始时间
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * 状态
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * 提交时间
             */
            public Builder submitTime(String submitTime) {
                this.submitTime = submitTime;
                return this;
            }

            /**
             * 任务参数
             */
            public Builder taskParams(String taskParams) {
                this.taskParams = taskParams;
                return this;
            }

            /**
             * 任务类型
             */
            public Builder taskType(String taskType) {
                this.taskType = taskType;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
