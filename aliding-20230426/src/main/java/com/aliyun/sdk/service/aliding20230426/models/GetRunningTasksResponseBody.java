// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aliding20230426.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetRunningTasksResponseBody} extends {@link TeaModel}
 *
 * <p>GetRunningTasksResponseBody</p>
 */
public class GetRunningTasksResponseBody extends TeaModel {
    @NameInMap("requestId")
    private String requestId;

    @NameInMap("result")
    private java.util.List < Result> result;

    @NameInMap("vendorRequestId")
    private String vendorRequestId;

    @NameInMap("vendorType")
    private String vendorType;

    private GetRunningTasksResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.vendorRequestId = builder.vendorRequestId;
        this.vendorType = builder.vendorType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRunningTasksResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return result
     */
    public java.util.List < Result> getResult() {
        return this.result;
    }

    /**
     * @return vendorRequestId
     */
    public String getVendorRequestId() {
        return this.vendorRequestId;
    }

    /**
     * @return vendorType
     */
    public String getVendorType() {
        return this.vendorType;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < Result> result; 
        private String vendorRequestId; 
        private String vendorType; 

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * result.
         */
        public Builder result(java.util.List < Result> result) {
            this.result = result;
            return this;
        }

        /**
         * vendorRequestId.
         */
        public Builder vendorRequestId(String vendorRequestId) {
            this.vendorRequestId = vendorRequestId;
            return this;
        }

        /**
         * vendorType.
         */
        public Builder vendorType(String vendorType) {
            this.vendorType = vendorType;
            return this;
        }

        public GetRunningTasksResponseBody build() {
            return new GetRunningTasksResponseBody(this);
        } 

    } 

    public static class Result extends TeaModel {
        @NameInMap("ActiveTimeGMT")
        private String activeTimeGMT;

        @NameInMap("ActivityId")
        private String activityId;

        @NameInMap("ActualActionerId")
        private String actualActionerId;

        @NameInMap("CreateTimeGMT")
        private String createTimeGMT;

        @NameInMap("FinishTimeGMT")
        private String finishTimeGMT;

        @NameInMap("OriginatorId")
        private String originatorId;

        @NameInMap("ProcessInstanceId")
        private String processInstanceId;

        @NameInMap("Status")
        private String status;

        @NameInMap("TaskId")
        private String taskId;

        @NameInMap("TaskType")
        private String taskType;

        @NameInMap("Title")
        private String title;

        @NameInMap("TitleInEnglish")
        private String titleInEnglish;

        private Result(Builder builder) {
            this.activeTimeGMT = builder.activeTimeGMT;
            this.activityId = builder.activityId;
            this.actualActionerId = builder.actualActionerId;
            this.createTimeGMT = builder.createTimeGMT;
            this.finishTimeGMT = builder.finishTimeGMT;
            this.originatorId = builder.originatorId;
            this.processInstanceId = builder.processInstanceId;
            this.status = builder.status;
            this.taskId = builder.taskId;
            this.taskType = builder.taskType;
            this.title = builder.title;
            this.titleInEnglish = builder.titleInEnglish;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return activeTimeGMT
         */
        public String getActiveTimeGMT() {
            return this.activeTimeGMT;
        }

        /**
         * @return activityId
         */
        public String getActivityId() {
            return this.activityId;
        }

        /**
         * @return actualActionerId
         */
        public String getActualActionerId() {
            return this.actualActionerId;
        }

        /**
         * @return createTimeGMT
         */
        public String getCreateTimeGMT() {
            return this.createTimeGMT;
        }

        /**
         * @return finishTimeGMT
         */
        public String getFinishTimeGMT() {
            return this.finishTimeGMT;
        }

        /**
         * @return originatorId
         */
        public String getOriginatorId() {
            return this.originatorId;
        }

        /**
         * @return processInstanceId
         */
        public String getProcessInstanceId() {
            return this.processInstanceId;
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
         * @return taskType
         */
        public String getTaskType() {
            return this.taskType;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        /**
         * @return titleInEnglish
         */
        public String getTitleInEnglish() {
            return this.titleInEnglish;
        }

        public static final class Builder {
            private String activeTimeGMT; 
            private String activityId; 
            private String actualActionerId; 
            private String createTimeGMT; 
            private String finishTimeGMT; 
            private String originatorId; 
            private String processInstanceId; 
            private String status; 
            private String taskId; 
            private String taskType; 
            private String title; 
            private String titleInEnglish; 

            /**
             * ActiveTimeGMT.
             */
            public Builder activeTimeGMT(String activeTimeGMT) {
                this.activeTimeGMT = activeTimeGMT;
                return this;
            }

            /**
             * ActivityId.
             */
            public Builder activityId(String activityId) {
                this.activityId = activityId;
                return this;
            }

            /**
             * ActualActionerId.
             */
            public Builder actualActionerId(String actualActionerId) {
                this.actualActionerId = actualActionerId;
                return this;
            }

            /**
             * CreateTimeGMT.
             */
            public Builder createTimeGMT(String createTimeGMT) {
                this.createTimeGMT = createTimeGMT;
                return this;
            }

            /**
             * FinishTimeGMT.
             */
            public Builder finishTimeGMT(String finishTimeGMT) {
                this.finishTimeGMT = finishTimeGMT;
                return this;
            }

            /**
             * OriginatorId.
             */
            public Builder originatorId(String originatorId) {
                this.originatorId = originatorId;
                return this;
            }

            /**
             * ProcessInstanceId.
             */
            public Builder processInstanceId(String processInstanceId) {
                this.processInstanceId = processInstanceId;
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
             * TaskId.
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * TaskType.
             */
            public Builder taskType(String taskType) {
                this.taskType = taskType;
                return this;
            }

            /**
             * Title.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            /**
             * TitleInEnglish.
             */
            public Builder titleInEnglish(String titleInEnglish) {
                this.titleInEnglish = titleInEnglish;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
