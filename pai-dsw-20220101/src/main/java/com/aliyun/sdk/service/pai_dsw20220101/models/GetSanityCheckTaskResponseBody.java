// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dsw20220101.models;

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
 * {@link GetSanityCheckTaskResponseBody} extends {@link TeaModel}
 *
 * <p>GetSanityCheckTaskResponseBody</p>
 */
public class GetSanityCheckTaskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CheckDetails")
    private java.util.List<CheckDetails> checkDetails;

    @com.aliyun.core.annotation.NameInMap("CheckType")
    private String checkType;

    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.NameInMap("Issues")
    private java.util.List<String> issues;

    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("TaskId")
    private String taskId;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private GetSanityCheckTaskResponseBody(Builder builder) {
        this.checkDetails = builder.checkDetails;
        this.checkType = builder.checkType;
        this.endTime = builder.endTime;
        this.instanceId = builder.instanceId;
        this.issues = builder.issues;
        this.startTime = builder.startTime;
        this.status = builder.status;
        this.taskId = builder.taskId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSanityCheckTaskResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return checkDetails
     */
    public java.util.List<CheckDetails> getCheckDetails() {
        return this.checkDetails;
    }

    /**
     * @return checkType
     */
    public String getCheckType() {
        return this.checkType;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return issues
     */
    public java.util.List<String> getIssues() {
        return this.issues;
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
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<CheckDetails> checkDetails; 
        private String checkType; 
        private String endTime; 
        private String instanceId; 
        private java.util.List<String> issues; 
        private String startTime; 
        private String status; 
        private String taskId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetSanityCheckTaskResponseBody model) {
            this.checkDetails = model.checkDetails;
            this.checkType = model.checkType;
            this.endTime = model.endTime;
            this.instanceId = model.instanceId;
            this.issues = model.issues;
            this.startTime = model.startTime;
            this.status = model.status;
            this.taskId = model.taskId;
            this.requestId = model.requestId;
        } 

        /**
         * CheckDetails.
         */
        public Builder checkDetails(java.util.List<CheckDetails> checkDetails) {
            this.checkDetails = checkDetails;
            return this;
        }

        /**
         * CheckType.
         */
        public Builder checkType(String checkType) {
            this.checkType = checkType;
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
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * Issues.
         */
        public Builder issues(java.util.List<String> issues) {
            this.issues = issues;
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
         * TaskId.
         */
        public Builder taskId(String taskId) {
            this.taskId = taskId;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>44FB0869-AA85-599D-A09D-C42F7467618A</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetSanityCheckTaskResponseBody build() {
            return new GetSanityCheckTaskResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetSanityCheckTaskResponseBody} extends {@link TeaModel}
     *
     * <p>GetSanityCheckTaskResponseBody</p>
     */
    public static class CheckDetails extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Reason")
        private String reason;

        @com.aliyun.core.annotation.NameInMap("Result")
        private String result;

        private CheckDetails(Builder builder) {
            this.description = builder.description;
            this.name = builder.name;
            this.reason = builder.reason;
            this.result = builder.result;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CheckDetails create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return reason
         */
        public String getReason() {
            return this.reason;
        }

        /**
         * @return result
         */
        public String getResult() {
            return this.result;
        }

        public static final class Builder {
            private String description; 
            private String name; 
            private String reason; 
            private String result; 

            private Builder() {
            } 

            private Builder(CheckDetails model) {
                this.description = model.description;
                this.name = model.name;
                this.reason = model.reason;
                this.result = model.result;
            } 

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Reason.
             */
            public Builder reason(String reason) {
                this.reason = reason;
                return this;
            }

            /**
             * Result.
             */
            public Builder result(String result) {
                this.result = result;
                return this;
            }

            public CheckDetails build() {
                return new CheckDetails(this);
            } 

        } 

    }
}
