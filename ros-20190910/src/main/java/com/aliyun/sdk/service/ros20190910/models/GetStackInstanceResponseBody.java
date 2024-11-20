// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ros20190910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetStackInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>GetStackInstanceResponseBody</p>
 */
public class GetStackInstanceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("StackInstance")
    private StackInstance stackInstance;

    private GetStackInstanceResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.stackInstance = builder.stackInstance;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetStackInstanceResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return stackInstance
     */
    public StackInstance getStackInstance() {
        return this.stackInstance;
    }

    public static final class Builder {
        private String requestId; 
        private StackInstance stackInstance; 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>B8A6B693-82C8-419D-8796-DE99EC33CFF9</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The information about the stack.</p>
         */
        public Builder stackInstance(StackInstance stackInstance) {
            this.stackInstance = stackInstance;
            return this;
        }

        public GetStackInstanceResponseBody build() {
            return new GetStackInstanceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetStackInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>GetStackInstanceResponseBody</p>
     */
    public static class ParameterOverrides extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ParameterKey")
        private String parameterKey;

        @com.aliyun.core.annotation.NameInMap("ParameterValue")
        private String parameterValue;

        private ParameterOverrides(Builder builder) {
            this.parameterKey = builder.parameterKey;
            this.parameterValue = builder.parameterValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ParameterOverrides create() {
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
             * <p>The name of the parameter that is used to override a specific parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>Amount</p>
             */
            public Builder parameterKey(String parameterKey) {
                this.parameterKey = parameterKey;
                return this;
            }

            /**
             * <p>The value of the parameter that is used to override a specific parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder parameterValue(String parameterValue) {
                this.parameterValue = parameterValue;
                return this;
            }

            public ParameterOverrides build() {
                return new ParameterOverrides(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetStackInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>GetStackInstanceResponseBody</p>
     */
    public static class StackInstance extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccountId")
        private String accountId;

        @com.aliyun.core.annotation.NameInMap("DriftDetectionTime")
        private String driftDetectionTime;

        @com.aliyun.core.annotation.NameInMap("Outputs")
        private java.util.List < java.util.Map<String, ?>> outputs;

        @com.aliyun.core.annotation.NameInMap("ParameterOverrides")
        private java.util.List < ParameterOverrides> parameterOverrides;

        @com.aliyun.core.annotation.NameInMap("RdFolderId")
        private String rdFolderId;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("StackDriftStatus")
        private String stackDriftStatus;

        @com.aliyun.core.annotation.NameInMap("StackGroupId")
        private String stackGroupId;

        @com.aliyun.core.annotation.NameInMap("StackGroupName")
        private String stackGroupName;

        @com.aliyun.core.annotation.NameInMap("StackId")
        private String stackId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("StatusReason")
        private String statusReason;

        private StackInstance(Builder builder) {
            this.accountId = builder.accountId;
            this.driftDetectionTime = builder.driftDetectionTime;
            this.outputs = builder.outputs;
            this.parameterOverrides = builder.parameterOverrides;
            this.rdFolderId = builder.rdFolderId;
            this.regionId = builder.regionId;
            this.stackDriftStatus = builder.stackDriftStatus;
            this.stackGroupId = builder.stackGroupId;
            this.stackGroupName = builder.stackGroupName;
            this.stackId = builder.stackId;
            this.status = builder.status;
            this.statusReason = builder.statusReason;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StackInstance create() {
            return builder().build();
        }

        /**
         * @return accountId
         */
        public String getAccountId() {
            return this.accountId;
        }

        /**
         * @return driftDetectionTime
         */
        public String getDriftDetectionTime() {
            return this.driftDetectionTime;
        }

        /**
         * @return outputs
         */
        public java.util.List < java.util.Map<String, ?>> getOutputs() {
            return this.outputs;
        }

        /**
         * @return parameterOverrides
         */
        public java.util.List < ParameterOverrides> getParameterOverrides() {
            return this.parameterOverrides;
        }

        /**
         * @return rdFolderId
         */
        public String getRdFolderId() {
            return this.rdFolderId;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return stackDriftStatus
         */
        public String getStackDriftStatus() {
            return this.stackDriftStatus;
        }

        /**
         * @return stackGroupId
         */
        public String getStackGroupId() {
            return this.stackGroupId;
        }

        /**
         * @return stackGroupName
         */
        public String getStackGroupName() {
            return this.stackGroupName;
        }

        /**
         * @return stackId
         */
        public String getStackId() {
            return this.stackId;
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

        public static final class Builder {
            private String accountId; 
            private String driftDetectionTime; 
            private java.util.List < java.util.Map<String, ?>> outputs; 
            private java.util.List < ParameterOverrides> parameterOverrides; 
            private String rdFolderId; 
            private String regionId; 
            private String stackDriftStatus; 
            private String stackGroupId; 
            private String stackGroupName; 
            private String stackId; 
            private String status; 
            private String statusReason; 

            /**
             * <p>The ID of the destination account to which the stack belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>151266687691****</p>
             */
            public Builder accountId(String accountId) {
                this.accountId = accountId;
                return this;
            }

            /**
             * <p>The time when the most recent successful drift detection was performed on the stack group.</p>
             * <blockquote>
             * <p>This parameter is returned only if drift detection is performed on the stack group.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>2020-02-27T07:47:47</p>
             */
            public Builder driftDetectionTime(String driftDetectionTime) {
                this.driftDetectionTime = driftDetectionTime;
                return this;
            }

            /**
             * <p>The outputs of the stack.</p>
             * <blockquote>
             * <p> This parameter is returned if OutputOption is set to Enabled.</p>
             * </blockquote>
             */
            public Builder outputs(java.util.List < java.util.Map<String, ?>> outputs) {
                this.outputs = outputs;
                return this;
            }

            /**
             * <p>The parameters that are used to override specific parameters.</p>
             */
            public Builder parameterOverrides(java.util.List < ParameterOverrides> parameterOverrides) {
                this.parameterOverrides = parameterOverrides;
                return this;
            }

            /**
             * <p>The ID of the folder in the resource directory.</p>
             * <blockquote>
             * <p>This parameter is returned only if the stack group is granted service-managed permissions.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>fd-4PvlVLOL8v</p>
             */
            public Builder rdFolderId(String rdFolderId) {
                this.rdFolderId = rdFolderId;
                return this;
            }

            /**
             * <p>The region ID of the stack.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-beijing</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The state of the stack when the most recent successful drift detection was performed on the stack group.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>DRIFTED: The stack has drifted.</li>
             * <li>NOT_CHECKED: No successful drift detection is performed on the stack.</li>
             * <li>IN_SYNC: The stack is being synchronized.</li>
             * </ul>
             * <blockquote>
             * <p>This parameter is returned only if drift detection is performed on the stack group.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>IN_SYNC</p>
             */
            public Builder stackDriftStatus(String stackDriftStatus) {
                this.stackDriftStatus = stackDriftStatus;
                return this;
            }

            /**
             * <p>The ID of the stack group.</p>
             * 
             * <strong>example:</strong>
             * <p>fd0ddef9-9540-4b42-a464-94f77835****</p>
             */
            public Builder stackGroupId(String stackGroupId) {
                this.stackGroupId = stackGroupId;
                return this;
            }

            /**
             * <p>The name of the stack group.</p>
             * 
             * <strong>example:</strong>
             * <p>MyStackGroup</p>
             */
            public Builder stackGroupName(String stackGroupName) {
                this.stackGroupName = stackGroupName;
                return this;
            }

            /**
             * <p>The stack ID.</p>
             * <blockquote>
             * <p>This parameter is returned only if the stack is in the CURRENT state.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>35ad60e3-6a92-42d8-8812-f0700d45****</p>
             */
            public Builder stackId(String stackId) {
                this.stackId = stackId;
                return this;
            }

            /**
             * <p>The state of the stack.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li><p>CURRENT: The stack is up-to-date with the stack group.</p>
             * </li>
             * <li><p>OUTDATED: The stack is not up-to-date with the stack group. Stacks are in the OUTDATED state due to the following possible reasons:</p>
             * <ul>
             * <li>When the CreateStackInstances operation is called to create stacks, the stacks fail to be created.</li>
             * <li>When the UpdateStackInstances or UpdateStackGroup operation is called to update stacks, the stacks fail to be updated, or only specific stacks are updated.</li>
             * <li>The creation or update operation is not complete.</li>
             * </ul>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>CURRENT</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The reason why the stack instance is in the OUTDATED state.</p>
             * <blockquote>
             * <p>This parameter is returned only if the stack instance is in the OUTDATED state.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>User initiated stop</p>
             */
            public Builder statusReason(String statusReason) {
                this.statusReason = statusReason;
                return this;
            }

            public StackInstance build() {
                return new StackInstance(this);
            } 

        } 

    }
}
