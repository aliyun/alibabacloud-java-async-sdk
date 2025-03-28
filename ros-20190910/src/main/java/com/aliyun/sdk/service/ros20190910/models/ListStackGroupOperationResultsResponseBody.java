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
    private java.util.List<StackGroupOperationResults> stackGroupOperationResults;

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
     * @return stackGroupOperationResults
     */
    public java.util.List<StackGroupOperationResults> getStackGroupOperationResults() {
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
        private java.util.List<StackGroupOperationResults> stackGroupOperationResults; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListStackGroupOperationResultsResponseBody model) {
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.stackGroupOperationResults = model.stackGroupOperationResults;
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
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>14A07460-EBE7-47CA-9757-12CC4761D47A</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The details of the results of the operation.</p>
         */
        public Builder stackGroupOperationResults(java.util.List<StackGroupOperationResults> stackGroupOperationResults) {
            this.stackGroupOperationResults = stackGroupOperationResults;
            return this;
        }

        /**
         * <p>The total number of results.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListStackGroupOperationResultsResponseBody build() {
            return new ListStackGroupOperationResultsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListStackGroupOperationResultsResponseBody} extends {@link TeaModel}
     *
     * <p>ListStackGroupOperationResultsResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(StackGroupOperationResults model) {
                this.accountId = model.accountId;
                this.rdFolderId = model.rdFolderId;
                this.regionId = model.regionId;
                this.status = model.status;
                this.statusReason = model.statusReason;
            } 

            /**
             * <p>The ID of the account to which the stack instance belongs.</p>
             * <ul>
             * <li>If the stack group has self-managed permissions, the stack instance belongs to an Alibaba Cloud account.</li>
             * <li>If the stack group has service-managed permissions, the stack instance belongs to a member account in the resource directory.</li>
             * </ul>
             * <blockquote>
             * <p> For more information about the account, see <a href="https://help.aliyun.com/document_detail/154578.html">Overview</a>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>175458090349****</p>
             */
            public Builder accountId(String accountId) {
                this.accountId = accountId;
                return this;
            }

            /**
             * <p>The folder ID of the resource directory.</p>
             * <blockquote>
             * <p> This parameter is returned only when the stack group is granted service-managed permissions.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>&quot;fd-4PvlVLOL8v&quot;</p>
             */
            public Builder rdFolderId(String rdFolderId) {
                this.rdFolderId = rdFolderId;
                return this;
            }

            /**
             * <p>The region ID of the stack instance.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-beijing</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The status of the operation.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>RUNNING: The operation is being performed.</li>
             * <li>SUCCEEDED: The operation succeeded.</li>
             * <li>FAILED: The operation failed.</li>
             * <li>STOPPING: The operation is being stopped.</li>
             * <li>STOPPED: The operation is stopped.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>SUCCEEDED</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The reason why the operation is in a specific state.</p>
             * <blockquote>
             * <p> This parameter is returned only when stack instances are in the OUTDATED state.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>User initiated operation</p>
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
