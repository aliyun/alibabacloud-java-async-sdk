// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emrstudio20240430.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListManualTaskInstancesResponseBody} extends {@link TeaModel}
 *
 * <p>ListManualTaskInstancesResponseBody</p>
 */
public class ListManualTaskInstancesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    private java.util.List < Data> data;

    @com.aliyun.core.annotation.NameInMap("nextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("totalSize")
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
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>DD6B1B2A-5837-5237-ABE4-FF0C8944****</p>
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

    /**
     * 
     * {@link ListManualTaskInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>ListManualTaskInstancesResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EmrClusterId")
        private String emrClusterId;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("ExternalAppId")
        private String externalAppId;

        @com.aliyun.core.annotation.NameInMap("ManualTaskInstanceId")
        private String manualTaskInstanceId;

        @com.aliyun.core.annotation.NameInMap("ManualTaskInstanceName")
        private String manualTaskInstanceName;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("SubmitTime")
        private String submitTime;

        @com.aliyun.core.annotation.NameInMap("TaskParams")
        private String taskParams;

        @com.aliyun.core.annotation.NameInMap("TaskType")
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
             * EmrClusterId.
             */
            public Builder emrClusterId(String emrClusterId) {
                this.emrClusterId = emrClusterId;
                return this;
            }

            /**
             * EndTime.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * ExternalAppId.
             */
            public Builder externalAppId(String externalAppId) {
                this.externalAppId = externalAppId;
                return this;
            }

            /**
             * ManualTaskInstanceId.
             */
            public Builder manualTaskInstanceId(String manualTaskInstanceId) {
                this.manualTaskInstanceId = manualTaskInstanceId;
                return this;
            }

            /**
             * ManualTaskInstanceName.
             */
            public Builder manualTaskInstanceName(String manualTaskInstanceName) {
                this.manualTaskInstanceName = manualTaskInstanceName;
                return this;
            }

            /**
             * ResourceGroupId.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * SubmitTime.
             */
            public Builder submitTime(String submitTime) {
                this.submitTime = submitTime;
                return this;
            }

            /**
             * TaskParams.
             */
            public Builder taskParams(String taskParams) {
                this.taskParams = taskParams;
                return this;
            }

            /**
             * TaskType.
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
