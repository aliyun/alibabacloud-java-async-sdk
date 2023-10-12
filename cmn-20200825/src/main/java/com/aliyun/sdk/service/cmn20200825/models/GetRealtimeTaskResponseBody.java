// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cmn20200825.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetRealtimeTaskResponseBody} extends {@link TeaModel}
 *
 * <p>GetRealtimeTaskResponseBody</p>
 */
public class GetRealtimeTaskResponseBody extends TeaModel {
    @NameInMap("InspectionTask")
    private InspectionTask inspectionTask;

    @NameInMap("RequestId")
    private String requestId;

    private GetRealtimeTaskResponseBody(Builder builder) {
        this.inspectionTask = builder.inspectionTask;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRealtimeTaskResponseBody create() {
        return builder().build();
    }

    /**
     * @return inspectionTask
     */
    public InspectionTask getInspectionTask() {
        return this.inspectionTask;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private InspectionTask inspectionTask; 
        private String requestId; 

        /**
         * InspectionTask.
         */
        public Builder inspectionTask(InspectionTask inspectionTask) {
            this.inspectionTask = inspectionTask;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetRealtimeTaskResponseBody build() {
            return new GetRealtimeTaskResponseBody(this);
        } 

    } 

    public static class InspectionTask extends TeaModel {
        @NameInMap("ErrorCode")
        private String errorCode;

        @NameInMap("InspectionMessage")
        private String inspectionMessage;

        @NameInMap("InspectionResult")
        private String inspectionResult;

        @NameInMap("TaskStatus")
        private String taskStatus;

        private InspectionTask(Builder builder) {
            this.errorCode = builder.errorCode;
            this.inspectionMessage = builder.inspectionMessage;
            this.inspectionResult = builder.inspectionResult;
            this.taskStatus = builder.taskStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InspectionTask create() {
            return builder().build();
        }

        /**
         * @return errorCode
         */
        public String getErrorCode() {
            return this.errorCode;
        }

        /**
         * @return inspectionMessage
         */
        public String getInspectionMessage() {
            return this.inspectionMessage;
        }

        /**
         * @return inspectionResult
         */
        public String getInspectionResult() {
            return this.inspectionResult;
        }

        /**
         * @return taskStatus
         */
        public String getTaskStatus() {
            return this.taskStatus;
        }

        public static final class Builder {
            private String errorCode; 
            private String inspectionMessage; 
            private String inspectionResult; 
            private String taskStatus; 

            /**
             * ErrorCode.
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * InspectionMessage.
             */
            public Builder inspectionMessage(String inspectionMessage) {
                this.inspectionMessage = inspectionMessage;
                return this;
            }

            /**
             * InspectionResult.
             */
            public Builder inspectionResult(String inspectionResult) {
                this.inspectionResult = inspectionResult;
                return this;
            }

            /**
             * TaskStatus.
             */
            public Builder taskStatus(String taskStatus) {
                this.taskStatus = taskStatus;
                return this;
            }

            public InspectionTask build() {
                return new InspectionTask(this);
            } 

        } 

    }
}
