// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ros20190910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListStackGroupOperationResultsResponseBody} extends {@link TeaModel}
 *
 * <p>ListStackGroupOperationResultsResponseBody</p>
 */
public class ListStackGroupOperationResultsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("StackGroupOperationResults")
    private java.util.List < StackGroupOperationResults> stackGroupOperationResults;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListStackGroupOperationResultsResponseBody(Builder builder) {
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.stackGroupOperationResults = builder.stackGroupOperationResults;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListStackGroupOperationResultsResponseBody create() {
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
     * @return stackGroupOperationResults
     */
    public java.util.List < StackGroupOperationResults> getStackGroupOperationResults() {
        return this.stackGroupOperationResults;
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
        private java.util.List < StackGroupOperationResults> stackGroupOperationResults; 
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
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The details of the results of the operation.
         */
        public Builder stackGroupOperationResults(java.util.List < StackGroupOperationResults> stackGroupOperationResults) {
            this.stackGroupOperationResults = stackGroupOperationResults;
            return this;
        }

        /**
         * The total number of results.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListStackGroupOperationResultsResponseBody build() {
            return new ListStackGroupOperationResultsResponseBody(this);
        } 

    } 

    public static class StackGroupOperationResults extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccountId")
        private String accountId;

        @com.aliyun.core.annotation.NameInMap("RdFolderId")
        private String rdFolderId;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("StatusReason")
        private String statusReason;

        private StackGroupOperationResults(Builder builder) {
            this.accountId = builder.accountId;
            this.rdFolderId = builder.rdFolderId;
            this.regionId = builder.regionId;
            this.status = builder.status;
            this.statusReason = builder.statusReason;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StackGroupOperationResults create() {
            return builder().build();
        }

        /**
         * @return accountId
         */
        public String getAccountId() {
            return this.accountId;
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
            private String rdFolderId; 
            private String regionId; 
            private String status; 
            private String statusReason; 

            /**
             * The ID of the account to which the stack instance belongs.
             * <p>
             * 
             * *   If the stack group has self-managed permissions, the stack instance belongs to an Alibaba Cloud account.
             * *   If the stack group has service-managed permissions, the stack instance belongs to a member account in the resource directory.
             * 
             * >  For more information about the account, see [Overview](~~154578~~).
             */
            public Builder accountId(String accountId) {
                this.accountId = accountId;
                return this;
            }

            /**
             * The folder ID of the resource directory.
             * <p>
             * 
             * >  This parameter is returned only when the stack group is granted service-managed permissions.
             */
            public Builder rdFolderId(String rdFolderId) {
                this.rdFolderId = rdFolderId;
                return this;
            }

            /**
             * The region ID of the stack instance.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The status of the operation.
             * <p>
             * 
             * Valid values:
             * 
             * *   RUNNING: The operation is being performed.
             * *   SUCCEEDED: The operation succeeded.
             * *   FAILED: The operation failed.
             * *   STOPPING: The operation is being stopped.
             * *   STOPPED: The operation is stopped.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The reason why the operation is in a specific state.
             * <p>
             * 
             * >  This parameter is returned only when stack instances are in the OUTDATED state.
             */
            public Builder statusReason(String statusReason) {
                this.statusReason = statusReason;
                return this;
            }

            public StackGroupOperationResults build() {
                return new StackGroupOperationResults(this);
            } 

        } 

    }
}
