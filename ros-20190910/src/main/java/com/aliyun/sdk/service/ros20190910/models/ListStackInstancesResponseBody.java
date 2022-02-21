// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ros20190910.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListStackInstancesResponseBody} extends {@link TeaModel}
 *
 * <p>ListStackInstancesResponseBody</p>
 */
public class ListStackInstancesResponseBody extends TeaModel {
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("StackInstances")
    private java.util.List < StackInstances> stackInstances;

    @NameInMap("TotalCount")
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
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * StackInstances.
         */
        public Builder stackInstances(java.util.List < StackInstances> stackInstances) {
            this.stackInstances = stackInstances;
            return this;
        }

        /**
         * TotalCount.
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
        @NameInMap("AccountId")
        private String accountId;

        @NameInMap("DriftDetectionTime")
        private String driftDetectionTime;

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

            public StackInstances build() {
                return new StackInstances(this);
            } 

        } 

    }
}
