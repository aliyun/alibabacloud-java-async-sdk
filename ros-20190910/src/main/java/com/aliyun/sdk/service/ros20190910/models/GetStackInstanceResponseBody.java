// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ros20190910.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetStackInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>GetStackInstanceResponseBody</p>
 */
public class GetStackInstanceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("StackInstance")
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
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Details of the stack.
         */
        public Builder stackInstance(StackInstance stackInstance) {
            this.stackInstance = stackInstance;
            return this;
        }

        public GetStackInstanceResponseBody build() {
            return new GetStackInstanceResponseBody(this);
        } 

    } 

    public static class ParameterOverrides extends TeaModel {
        @NameInMap("ParameterKey")
        private String parameterKey;

        @NameInMap("ParameterValue")
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
             * The name of the parameter that is used to override a specific parameter.
             */
            public Builder parameterKey(String parameterKey) {
                this.parameterKey = parameterKey;
                return this;
            }

            /**
             * The value of the parameter that is used to override a specific parameter.
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
    public static class StackInstance extends TeaModel {
        @NameInMap("AccountId")
        private String accountId;

        @NameInMap("DriftDetectionTime")
        private String driftDetectionTime;

        @NameInMap("ParameterOverrides")
        private java.util.List < ParameterOverrides> parameterOverrides;

        @NameInMap("RdFolderId")
        private String rdFolderId;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("StackDriftStatus")
        private String stackDriftStatus;

        @NameInMap("StackGroupId")
        private String stackGroupId;

        @NameInMap("StackGroupName")
        private String stackGroupName;

        @NameInMap("StackId")
        private String stackId;

        @NameInMap("Status")
        private String status;

        @NameInMap("StatusReason")
        private String statusReason;

        private StackInstance(Builder builder) {
            this.accountId = builder.accountId;
            this.driftDetectionTime = builder.driftDetectionTime;
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
             * The ID of the account to which the stack belongs.
             */
            public Builder accountId(String accountId) {
                this.accountId = accountId;
                return this;
            }

            /**
             * The time when the last drift detection was performed on the stack group.
             * <p>
             * 
             * >  This parameter is returned only if drift detection is performed on the stack group.
             */
            public Builder driftDetectionTime(String driftDetectionTime) {
                this.driftDetectionTime = driftDetectionTime;
                return this;
            }

            /**
             * The parameters that are used to override specific parameters.
             */
            public Builder parameterOverrides(java.util.List < ParameterOverrides> parameterOverrides) {
                this.parameterOverrides = parameterOverrides;
                return this;
            }

            /**
             * The ID of the folder in the resource directory.
             * <p>
             * 
             * >  This parameter is returned only if the stack group is granted service-managed permissions.
             */
            public Builder rdFolderId(String rdFolderId) {
                this.rdFolderId = rdFolderId;
                return this;
            }

            /**
             * The ID of the region to which the stack belongs.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The state of the stack when the last successful drift detection was performed on the stack group.
             * <p>
             * 
             * Valid values:
             * 
             * *   DRIFTED: The stack has drifted.
             * *   NOT_CHECKED: No successful drift detection is performed on the stack.
             * *   IN_SYNC: The stack is being synchronized.
             * 
             * >  This parameter is returned only if drift detection is performed on the stack group.
             */
            public Builder stackDriftStatus(String stackDriftStatus) {
                this.stackDriftStatus = stackDriftStatus;
                return this;
            }

            /**
             * The ID of the stack group.
             */
            public Builder stackGroupId(String stackGroupId) {
                this.stackGroupId = stackGroupId;
                return this;
            }

            /**
             * The name of the stack group.
             */
            public Builder stackGroupName(String stackGroupName) {
                this.stackGroupName = stackGroupName;
                return this;
            }

            /**
             * The ID of the stack.
             * <p>
             * 
             * >  This parameter is returned only if the stack is in the CURRENT state.
             */
            public Builder stackId(String stackId) {
                this.stackId = stackId;
                return this;
            }

            /**
             * The state of the stack.
             * <p>
             * 
             * Valid values:
             * 
             * *   CURRENT: The stack is up to date with the stack group.
             * 
             * *   OUTDATED: The stack is not up to date with the stack group. Stacks may be in the OUTDATED state due to the following reasons:
             * 
             *     *   When you call the CreateStackInstances operation to create stacks, the stacks fail to be created.
             *     *   When you call the UpdateStackInstances or UpdateStackGroup operation to update stacks, the stacks fail to be updated or only specific stacks are updated.
             *     *   The creation or update operation is not complete.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The reason why the stack is in the OUTDATED state.
             * <p>
             * 
             * >  This parameter is returned only if the stack is in the OUTDATED state.
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
