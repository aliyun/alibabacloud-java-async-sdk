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
 * {@link DescribeAgenticDBComputeClustersResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAgenticDBComputeClustersResponseBody</p>
 */
public class DescribeAgenticDBComputeClustersResponseBody extends TeaModel {
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

    private DescribeAgenticDBComputeClustersResponseBody(Builder builder) {
        this.items = builder.items;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAgenticDBComputeClustersResponseBody create() {
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

        private Builder(DescribeAgenticDBComputeClustersResponseBody model) {
            this.items = model.items;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The list of compute instances.</p>
         */
        public Builder items(java.util.List<Items> items) {
            this.items = items;
            return this;
        }

        /**
         * <p>The current page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>F6A7B8C9-D0E1-2345-FABC-678901234FAB</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeAgenticDBComputeClustersResponseBody build() {
            return new DescribeAgenticDBComputeClustersResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeAgenticDBComputeClustersResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAgenticDBComputeClustersResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BranchId")
        private String branchId;

        @com.aliyun.core.annotation.NameInMap("BranchName")
        private String branchName;

        @com.aliyun.core.annotation.NameInMap("ComputeClusterId")
        private String computeClusterId;

        @com.aliyun.core.annotation.NameInMap("ComputeNodeCount")
        private Integer computeNodeCount;

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

        @com.aliyun.core.annotation.NameInMap("OperatorType")
        private String operatorType;

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

        @com.aliyun.core.annotation.NameInMap("StorageSize")
        private Long storageSize;

        @com.aliyun.core.annotation.NameInMap("TenantId")
        private String tenantId;

        @com.aliyun.core.annotation.NameInMap("TenantName")
        private String tenantName;

        private Items(Builder builder) {
            this.branchId = builder.branchId;
            this.branchName = builder.branchName;
            this.computeClusterId = builder.computeClusterId;
            this.computeNodeCount = builder.computeNodeCount;
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.isDefaultBranch = builder.isDefaultBranch;
            this.lastActivatedAt = builder.lastActivatedAt;
            this.maxCU = builder.maxCU;
            this.minCU = builder.minCU;
            this.operatorType = builder.operatorType;
            this.parentBranchId = builder.parentBranchId;
            this.parentBranchName = builder.parentBranchName;
            this.projectId = builder.projectId;
            this.projectName = builder.projectName;
            this.status = builder.status;
            this.storageSize = builder.storageSize;
            this.tenantId = builder.tenantId;
            this.tenantName = builder.tenantName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
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
         * @return computeClusterId
         */
        public String getComputeClusterId() {
            return this.computeClusterId;
        }

        /**
         * @return computeNodeCount
         */
        public Integer getComputeNodeCount() {
            return this.computeNodeCount;
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
         * @return operatorType
         */
        public String getOperatorType() {
            return this.operatorType;
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
         * @return storageSize
         */
        public Long getStorageSize() {
            return this.storageSize;
        }

        /**
         * @return tenantId
         */
        public String getTenantId() {
            return this.tenantId;
        }

        /**
         * @return tenantName
         */
        public String getTenantName() {
            return this.tenantName;
        }

        public static final class Builder {
            private String branchId; 
            private String branchName; 
            private String computeClusterId; 
            private Integer computeNodeCount; 
            private String createTime; 
            private String description; 
            private Boolean isDefaultBranch; 
            private String lastActivatedAt; 
            private String maxCU; 
            private String minCU; 
            private String operatorType; 
            private String parentBranchId; 
            private String parentBranchName; 
            private String projectId; 
            private String projectName; 
            private String status; 
            private Long storageSize; 
            private String tenantId; 
            private String tenantName; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.branchId = model.branchId;
                this.branchName = model.branchName;
                this.computeClusterId = model.computeClusterId;
                this.computeNodeCount = model.computeNodeCount;
                this.createTime = model.createTime;
                this.description = model.description;
                this.isDefaultBranch = model.isDefaultBranch;
                this.lastActivatedAt = model.lastActivatedAt;
                this.maxCU = model.maxCU;
                this.minCU = model.minCU;
                this.operatorType = model.operatorType;
                this.parentBranchId = model.parentBranchId;
                this.parentBranchName = model.parentBranchName;
                this.projectId = model.projectId;
                this.projectName = model.projectName;
                this.status = model.status;
                this.storageSize = model.storageSize;
                this.tenantId = model.tenantId;
                this.tenantName = model.tenantName;
            } 

            /**
             * <p>The ID of the associated branch.</p>
             * 
             * <strong>example:</strong>
             * <p>br-7g8h9i0j1k2l</p>
             */
            public Builder branchId(String branchId) {
                this.branchId = branchId;
                return this;
            }

            /**
             * <p>The name of the associated branch.</p>
             * 
             * <strong>example:</strong>
             * <p>feature-analytics</p>
             */
            public Builder branchName(String branchName) {
                this.branchName = branchName;
                return this;
            }

            /**
             * <p>The compute instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>pc-g0lsayq8c5qe</p>
             */
            public Builder computeClusterId(String computeClusterId) {
                this.computeClusterId = computeClusterId;
                return this;
            }

            /**
             * <p>The number of compute nodes. The value is fixed to 1 in the first phase.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder computeNodeCount(Integer computeNodeCount) {
                this.computeNodeCount = computeNodeCount;
                return this;
            }

            /**
             * <p>The time when the compute instance was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-06-10T11:00:00Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The description of the compute instance.</p>
             * 
             * <strong>example:</strong>
             * <p>Compute cluster for analytics</p>
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
             * <p>The time when the compute instance was last activated.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-06-10T12:30:00Z</p>
             */
            public Builder lastActivatedAt(String lastActivatedAt) {
                this.lastActivatedAt = lastActivatedAt;
                return this;
            }

            /**
             * <p>The maximum compute unit.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder maxCU(String maxCU) {
                this.maxCU = maxCU;
                return this;
            }

            /**
             * <p>The minimum compute unit.</p>
             * 
             * <strong>example:</strong>
             * <p>0.25</p>
             */
            public Builder minCU(String minCU) {
                this.minCU = minCU;
                return this;
            }

            /**
             * <p>The operator type.</p>
             * 
             * <strong>example:</strong>
             * <p>Neon</p>
             */
            public Builder operatorType(String operatorType) {
                this.operatorType = operatorType;
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
             * <p>The ID of the associated project.</p>
             * 
             * <strong>example:</strong>
             * <p>proj-a1b2c3d4e5f6</p>
             */
            public Builder projectId(String projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * <p>The name of the associated project.</p>
             * 
             * <strong>example:</strong>
             * <p>analytics-prod</p>
             */
            public Builder projectName(String projectName) {
                this.projectName = projectName;
                return this;
            }

            /**
             * <p>The status of the compute instance.</p>
             * 
             * <strong>example:</strong>
             * <p>Running</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The amount of used data, in bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>1073741824</p>
             */
            public Builder storageSize(Long storageSize) {
                this.storageSize = storageSize;
                return this;
            }

            /**
             * <p>The ID of the associated tenant.</p>
             * 
             * <strong>example:</strong>
             * <p>t-4b83e0da66674951</p>
             */
            public Builder tenantId(String tenantId) {
                this.tenantId = tenantId;
                return this;
            }

            /**
             * <p>The name of the associated tenant.</p>
             * 
             * <strong>example:</strong>
             * <p>my-saas-app</p>
             */
            public Builder tenantName(String tenantName) {
                this.tenantName = tenantName;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
