// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ros20190910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListStackInstancesResponseBody} extends {@link TeaModel}
 *
 * <p>ListStackInstancesResponseBody</p>
 */
public class ListStackInstancesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("StackInstances")
    private java.util.List < StackInstances> stackInstances;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListStackInstancesResponseBody(Builder builder) {
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.stackInstances = builder.stackInstances;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListStackInstancesResponseBody create() {
        return builder().build();
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return stackInstances
     */
    public java.util.List < StackInstances> getStackInstances() {
        return this.stackInstances;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private java.util.List < StackInstances> stackInstances; 
        private Integer totalCount; 

        /**
         * The page number of the returned page.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries returned per page.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The stacks.
         */
        public Builder stackInstances(java.util.List < StackInstances> stackInstances) {
            this.stackInstances = stackInstances;
            return this;
        }

        /**
         * The total number of stacks.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListStackInstancesResponseBody build() {
            return new ListStackInstancesResponseBody(this);
        } 

    } 

    public static class StackInstances extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccountId")
        private String accountId;

        @com.aliyun.core.annotation.NameInMap("DriftDetectionTime")
        private String driftDetectionTime;

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

        private StackInstances(Builder builder) {
            this.accountId = builder.accountId;
            this.driftDetectionTime = builder.driftDetectionTime;
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

        public static StackInstances create() {
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
            private String rdFolderId; 
            private String regionId; 
            private String stackDriftStatus; 
            private String stackGroupId; 
            private String stackGroupName; 
            private String stackId; 
            private String status; 
            private String statusReason; 

            /**
             * The ID of the destination account to which the stack belongs.
             */
            public Builder accountId(String accountId) {
                this.accountId = accountId;
                return this;
            }

            /**
             * The time when the last successful drift detection was performed on the stack.
             * <p>
             * 
             * > This parameter is returned only if drift detection is performed on the stack group.
             */
            public Builder driftDetectionTime(String driftDetectionTime) {
                this.driftDetectionTime = driftDetectionTime;
                return this;
            }

            /**
             * The ID of the folder in the resource directory.
             * <p>
             * 
             * > This parameter is returned only if the stack group is granted service-managed permissions.
             */
            public Builder rdFolderId(String rdFolderId) {
                this.rdFolderId = rdFolderId;
                return this;
            }

            /**
             * The region ID of the stack.
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
             * > This parameter is returned only if drift detection is performed on the stack group.
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
             * The stack ID.
             * <p>
             * 
             * > This parameter is returned only if the stack is in the CURRENT state.
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
             * *   CURRENT: The stack is up-to-date with the stack group.
             * 
             * *   OUTDATED: The stack is not up-to-date with the stack group. Stacks are in the OUTDATED state due to the following possible reasons:
             * 
             *     *   When the CreateStackInstances operation is called to create stacks, the stacks fail to be created.
             *     *   When the UpdateStackInstances or UpdateStackGroup operation is called to update stacks, the stacks fail to be updated, or only specific stacks are updated.
             *     *   The creation or update operation is not complete.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The reason why the stack instance is in the OUTDATED state.
             * <p>
             * 
             * > This parameter is returned only if the stack instance is in the OUTDATED state.
             */
            public Builder statusReason(String statusReason) {
                this.statusReason = statusReason;
                return this;
            }

            public StackInstances build() {
                return new StackInstances(this);
            } 

        } 

    }
}
