// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ros20190910.models;

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
    private java.util.List<StackInstances> stackInstances;

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

    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List<StackInstances> getStackInstances() {
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
        private java.util.List<StackInstances> stackInstances; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListStackInstancesResponseBody model) {
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.stackInstances = model.stackInstances;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The page number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>85DE34BD-7FF9-480F-8C21-556E9DA93ACD</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The stacks.</p>
         */
        public Builder stackInstances(java.util.List<StackInstances> stackInstances) {
            this.stackInstances = stackInstances;
            return this;
        }

        /**
         * <p>The total number of stacks.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListStackInstancesResponseBody build() {
            return new ListStackInstancesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListStackInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>ListStackInstancesResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(StackInstances model) {
                this.accountId = model.accountId;
                this.driftDetectionTime = model.driftDetectionTime;
                this.rdFolderId = model.rdFolderId;
                this.regionId = model.regionId;
                this.stackDriftStatus = model.stackDriftStatus;
                this.stackGroupId = model.stackGroupId;
                this.stackGroupName = model.stackGroupName;
                this.stackId = model.stackId;
                this.status = model.status;
                this.statusReason = model.statusReason;
            } 

            /**
             * <p>The ID of the destination account to which the stack belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>156552876021****</p>
             */
            public Builder accountId(String accountId) {
                this.accountId = accountId;
                return this;
            }

            /**
             * <p>The time when the last successful drift detection was performed on the stack.</p>
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
             * <p>The state of the stack when the last successful drift detection was performed on the stack group.</p>
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

            public StackInstances build() {
                return new StackInstances(this);
            } 

        } 

    }
}
