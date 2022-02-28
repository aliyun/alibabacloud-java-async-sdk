// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * StackInstance.
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
             * ParameterKey.
             */
            public Builder parameterKey(String parameterKey) {
                this.parameterKey = parameterKey;
                return this;
            }

            /**
             * ParameterValue.
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
             * AccountId.
             */
            public Builder accountId(String accountId) {
                this.accountId = accountId;
                return this;
            }

            /**
             * DriftDetectionTime.
             */
            public Builder driftDetectionTime(String driftDetectionTime) {
                this.driftDetectionTime = driftDetectionTime;
                return this;
            }

            /**
             * ParameterOverrides.
             */
            public Builder parameterOverrides(java.util.List < ParameterOverrides> parameterOverrides) {
                this.parameterOverrides = parameterOverrides;
                return this;
            }

            /**
             * RdFolderId.
             */
            public Builder rdFolderId(String rdFolderId) {
                this.rdFolderId = rdFolderId;
                return this;
            }

            /**
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * StackDriftStatus.
             */
            public Builder stackDriftStatus(String stackDriftStatus) {
                this.stackDriftStatus = stackDriftStatus;
                return this;
            }

            /**
             * StackGroupId.
             */
            public Builder stackGroupId(String stackGroupId) {
                this.stackGroupId = stackGroupId;
                return this;
            }

            /**
             * StackGroupName.
             */
            public Builder stackGroupName(String stackGroupName) {
                this.stackGroupName = stackGroupName;
                return this;
            }

            /**
             * StackId.
             */
            public Builder stackId(String stackId) {
                this.stackId = stackId;
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
             * StatusReason.
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
