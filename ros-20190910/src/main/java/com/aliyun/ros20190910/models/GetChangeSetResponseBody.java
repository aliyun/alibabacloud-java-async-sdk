// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link GetChangeSetResponseBody} extends {@link TeaModel}
 *
 * <p>GetChangeSetResponseBody</p>
 */
public class GetChangeSetResponseBody extends TeaModel {
    @NameInMap("ChangeSetId")
    private String changeSetId;

    @NameInMap("ChangeSetName")
    private String changeSetName;

    @NameInMap("ChangeSetType")
    private String changeSetType;

    @NameInMap("Changes")
    private java.util.List < java.util.Map<String, ?>> changes;

    @NameInMap("CreateTime")
    private String createTime;

    @NameInMap("Description")
    private String description;

    @NameInMap("DisableRollback")
    private Boolean disableRollback;

    @NameInMap("ExecutionStatus")
    private String executionStatus;

    @NameInMap("Parameters")
    private java.util.List < Parameters> parameters;

    @NameInMap("RegionId")
    private String regionId;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("StackId")
    private String stackId;

    @NameInMap("StackName")
    private String stackName;

    @NameInMap("Status")
    private String status;

    @NameInMap("StatusReason")
    private String statusReason;

    @NameInMap("TemplateBody")
    private String templateBody;

    @NameInMap("TimeoutInMinutes")
    private Integer timeoutInMinutes;


    private GetChangeSetResponseBody(Builder builder) {
        this.changeSetId = builder.changeSetId;
        this.changeSetName = builder.changeSetName;
        this.changeSetType = builder.changeSetType;
        this.changes = builder.changes;
        this.createTime = builder.createTime;
        this.description = builder.description;
        this.disableRollback = builder.disableRollback;
        this.executionStatus = builder.executionStatus;
        this.parameters = builder.parameters;
        this.regionId = builder.regionId;
        this.requestId = builder.requestId;
        this.stackId = builder.stackId;
        this.stackName = builder.stackName;
        this.status = builder.status;
        this.statusReason = builder.statusReason;
        this.templateBody = builder.templateBody;
        this.timeoutInMinutes = builder.timeoutInMinutes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetChangeSetResponseBody create() {
        return builder().build();
    }

    /**
     * @return changeSetId
     */
    public String getChangeSetId() {
        return this.changeSetId;
    }

    /**
     * @return changeSetName
     */
    public String getChangeSetName() {
        return this.changeSetName;
    }

    /**
     * @return changeSetType
     */
    public String getChangeSetType() {
        return this.changeSetType;
    }

    /**
     * @return changes
     */
    public java.util.List < java.util.Map<String, ?>> getChanges() {
        return this.changes;
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return disableRollback
     */
    public Boolean getDisableRollback() {
        return this.disableRollback;
    }

    /**
     * @return executionStatus
     */
    public String getExecutionStatus() {
        return this.executionStatus;
    }

    /**
     * @return parameters
     */
    public java.util.List < Parameters> getParameters() {
        return this.parameters;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return stackId
     */
    public String getStackId() {
        return this.stackId;
    }

    /**
     * @return stackName
     */
    public String getStackName() {
        return this.stackName;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return statusReason
     */
    public String getStatusReason() {
        return this.statusReason;
    }

    /**
     * @return templateBody
     */
    public String getTemplateBody() {
        return this.templateBody;
    }

    /**
     * @return timeoutInMinutes
     */
    public Integer getTimeoutInMinutes() {
        return this.timeoutInMinutes;
    }

    public static final class Builder {
        private String changeSetId; 
        private String changeSetName; 
        private String changeSetType; 
        private java.util.List < java.util.Map<String, ?>> changes; 
        private String createTime; 
        private String description; 
        private Boolean disableRollback; 
        private String executionStatus; 
        private java.util.List < Parameters> parameters; 
        private String regionId; 
        private String requestId; 
        private String stackId; 
        private String stackName; 
        private String status; 
        private String statusReason; 
        private String templateBody; 
        private Integer timeoutInMinutes; 

        /**
         * <p>ChangeSetId.</p>
         */
        public Builder changeSetId(String changeSetId) {
            this.changeSetId = changeSetId;
            return this;
        }

        /**
         * <p>ChangeSetName.</p>
         */
        public Builder changeSetName(String changeSetName) {
            this.changeSetName = changeSetName;
            return this;
        }

        /**
         * <p>ChangeSetType.</p>
         */
        public Builder changeSetType(String changeSetType) {
            this.changeSetType = changeSetType;
            return this;
        }

        /**
         * <p>Changes.</p>
         */
        public Builder changes(java.util.List < java.util.Map<String, ?>> changes) {
            this.changes = changes;
            return this;
        }

        /**
         * <p>CreateTime.</p>
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * <p>Description.</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>DisableRollback.</p>
         */
        public Builder disableRollback(Boolean disableRollback) {
            this.disableRollback = disableRollback;
            return this;
        }

        /**
         * <p>ExecutionStatus.</p>
         */
        public Builder executionStatus(String executionStatus) {
            this.executionStatus = executionStatus;
            return this;
        }

        /**
         * <p>Parameters.</p>
         */
        public Builder parameters(java.util.List < Parameters> parameters) {
            this.parameters = parameters;
            return this;
        }

        /**
         * <p>RegionId.</p>
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>RequestId.</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>StackId.</p>
         */
        public Builder stackId(String stackId) {
            this.stackId = stackId;
            return this;
        }

        /**
         * <p>StackName.</p>
         */
        public Builder stackName(String stackName) {
            this.stackName = stackName;
            return this;
        }

        /**
         * <p>Status.</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>StatusReason.</p>
         */
        public Builder statusReason(String statusReason) {
            this.statusReason = statusReason;
            return this;
        }

        /**
         * <p>TemplateBody.</p>
         */
        public Builder templateBody(String templateBody) {
            this.templateBody = templateBody;
            return this;
        }

        /**
         * <p>TimeoutInMinutes.</p>
         */
        public Builder timeoutInMinutes(Integer timeoutInMinutes) {
            this.timeoutInMinutes = timeoutInMinutes;
            return this;
        }

        public GetChangeSetResponseBody build() {
            return new GetChangeSetResponseBody(this);
        } 

    } 

    public static class Parameters extends TeaModel {
        @NameInMap("ParameterKey")
        private String parameterKey;

        @NameInMap("ParameterValue")
        private String parameterValue;


        private Parameters(Builder builder) {
            this.parameterKey = builder.parameterKey;
            this.parameterValue = builder.parameterValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Parameters create() {
            return builder().build();
        }

        /**
         * @return parameterKey
         */
        public String getParameterKey() {
            return this.parameterKey;
        }

        /**
         * @return parameterValue
         */
        public String getParameterValue() {
            return this.parameterValue;
        }

        public static final class Builder {
            private String parameterKey; 
            private String parameterValue; 

            /**
             * <p>ParameterKey.</p>
             */
            public Builder parameterKey(String parameterKey) {
                this.parameterKey = parameterKey;
                return this;
            }

            /**
             * <p>ParameterValue.</p>
             */
            public Builder parameterValue(String parameterValue) {
                this.parameterValue = parameterValue;
                return this;
            }

            public Parameters build() {
                return new Parameters(this);
            } 

        } 

    }
}
