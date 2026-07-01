// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link DescribeAgenticDBBranchesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAgenticDBBranchesResponseBody</p>
 */
public class DescribeAgenticDBBranchesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Items")
    private java.util.List<Items> items;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeAgenticDBBranchesResponseBody(Builder builder) {
        this.items = builder.items;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAgenticDBBranchesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return items
     */
    public java.util.List<Items> getItems() {
        return this.items;
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
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<Items> items; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(DescribeAgenticDBBranchesResponseBody model) {
            this.items = model.items;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * Items.
         */
        public Builder items(java.util.List<Items> items) {
            this.items = items;
            return this;
        }

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
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeAgenticDBBranchesResponseBody build() {
            return new DescribeAgenticDBBranchesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeAgenticDBBranchesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAgenticDBBranchesResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BranchComputeClusterId")
        private String branchComputeClusterId;

        @com.aliyun.core.annotation.NameInMap("BranchComputeNodeCount")
        private Integer branchComputeNodeCount;

        @com.aliyun.core.annotation.NameInMap("BranchId")
        private String branchId;

        @com.aliyun.core.annotation.NameInMap("BranchName")
        private String branchName;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("IsDefaultBranch")
        private Boolean isDefaultBranch;

        @com.aliyun.core.annotation.NameInMap("LastActivatedAt")
        private String lastActivatedAt;

        @com.aliyun.core.annotation.NameInMap("MaxCU")
        private String maxCU;

        @com.aliyun.core.annotation.NameInMap("MinCU")
        private String minCU;

        @com.aliyun.core.annotation.NameInMap("ParentBranchId")
        private String parentBranchId;

        @com.aliyun.core.annotation.NameInMap("ParentBranchName")
        private String parentBranchName;

        @com.aliyun.core.annotation.NameInMap("ProjectId")
        private String projectId;

        @com.aliyun.core.annotation.NameInMap("ProjectName")
        private String projectName;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TenantId")
        private String tenantId;

        private Items(Builder builder) {
            this.branchComputeClusterId = builder.branchComputeClusterId;
            this.branchComputeNodeCount = builder.branchComputeNodeCount;
            this.branchId = builder.branchId;
            this.branchName = builder.branchName;
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.isDefaultBranch = builder.isDefaultBranch;
            this.lastActivatedAt = builder.lastActivatedAt;
            this.maxCU = builder.maxCU;
            this.minCU = builder.minCU;
            this.parentBranchId = builder.parentBranchId;
            this.parentBranchName = builder.parentBranchName;
            this.projectId = builder.projectId;
            this.projectName = builder.projectName;
            this.status = builder.status;
            this.tenantId = builder.tenantId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return branchComputeClusterId
         */
        public String getBranchComputeClusterId() {
            return this.branchComputeClusterId;
        }

        /**
         * @return branchComputeNodeCount
         */
        public Integer getBranchComputeNodeCount() {
            return this.branchComputeNodeCount;
        }

        /**
         * @return branchId
         */
        public String getBranchId() {
            return this.branchId;
        }

        /**
         * @return branchName
         */
        public String getBranchName() {
            return this.branchName;
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
         * @return isDefaultBranch
         */
        public Boolean getIsDefaultBranch() {
            return this.isDefaultBranch;
        }

        /**
         * @return lastActivatedAt
         */
        public String getLastActivatedAt() {
            return this.lastActivatedAt;
        }

        /**
         * @return maxCU
         */
        public String getMaxCU() {
            return this.maxCU;
        }

        /**
         * @return minCU
         */
        public String getMinCU() {
            return this.minCU;
        }

        /**
         * @return parentBranchId
         */
        public String getParentBranchId() {
            return this.parentBranchId;
        }

        /**
         * @return parentBranchName
         */
        public String getParentBranchName() {
            return this.parentBranchName;
        }

        /**
         * @return projectId
         */
        public String getProjectId() {
            return this.projectId;
        }

        /**
         * @return projectName
         */
        public String getProjectName() {
            return this.projectName;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return tenantId
         */
        public String getTenantId() {
            return this.tenantId;
        }

        public static final class Builder {
            private String branchComputeClusterId; 
            private Integer branchComputeNodeCount; 
            private String branchId; 
            private String branchName; 
            private String createTime; 
            private String description; 
            private Boolean isDefaultBranch; 
            private String lastActivatedAt; 
            private String maxCU; 
            private String minCU; 
            private String parentBranchId; 
            private String parentBranchName; 
            private String projectId; 
            private String projectName; 
            private String status; 
            private String tenantId; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.branchComputeClusterId = model.branchComputeClusterId;
                this.branchComputeNodeCount = model.branchComputeNodeCount;
                this.branchId = model.branchId;
                this.branchName = model.branchName;
                this.createTime = model.createTime;
                this.description = model.description;
                this.isDefaultBranch = model.isDefaultBranch;
                this.lastActivatedAt = model.lastActivatedAt;
                this.maxCU = model.maxCU;
                this.minCU = model.minCU;
                this.parentBranchId = model.parentBranchId;
                this.parentBranchName = model.parentBranchName;
                this.projectId = model.projectId;
                this.projectName = model.projectName;
                this.status = model.status;
                this.tenantId = model.tenantId;
            } 

            /**
             * BranchComputeClusterId.
             */
            public Builder branchComputeClusterId(String branchComputeClusterId) {
                this.branchComputeClusterId = branchComputeClusterId;
                return this;
            }

            /**
             * BranchComputeNodeCount.
             */
            public Builder branchComputeNodeCount(Integer branchComputeNodeCount) {
                this.branchComputeNodeCount = branchComputeNodeCount;
                return this;
            }

            /**
             * BranchId.
             */
            public Builder branchId(String branchId) {
                this.branchId = branchId;
                return this;
            }

            /**
             * BranchName.
             */
            public Builder branchName(String branchName) {
                this.branchName = branchName;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * IsDefaultBranch.
             */
            public Builder isDefaultBranch(Boolean isDefaultBranch) {
                this.isDefaultBranch = isDefaultBranch;
                return this;
            }

            /**
             * LastActivatedAt.
             */
            public Builder lastActivatedAt(String lastActivatedAt) {
                this.lastActivatedAt = lastActivatedAt;
                return this;
            }

            /**
             * MaxCU.
             */
            public Builder maxCU(String maxCU) {
                this.maxCU = maxCU;
                return this;
            }

            /**
             * MinCU.
             */
            public Builder minCU(String minCU) {
                this.minCU = minCU;
                return this;
            }

            /**
             * ParentBranchId.
             */
            public Builder parentBranchId(String parentBranchId) {
                this.parentBranchId = parentBranchId;
                return this;
            }

            /**
             * ParentBranchName.
             */
            public Builder parentBranchName(String parentBranchName) {
                this.parentBranchName = parentBranchName;
                return this;
            }

            /**
             * ProjectId.
             */
            public Builder projectId(String projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * ProjectName.
             */
            public Builder projectName(String projectName) {
                this.projectName = projectName;
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
             * TenantId.
             */
            public Builder tenantId(String tenantId) {
                this.tenantId = tenantId;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
