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
         * <p>The list of branches.</p>
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
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>B2C3D4E5-F6A7-8901-BCDE-2345678901BC</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
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

        @com.aliyun.core.annotation.NameInMap("ParentTimestamp")
        private String parentTimestamp;

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
            this.parentTimestamp = builder.parentTimestamp;
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
         * @return parentTimestamp
         */
        public String getParentTimestamp() {
            return this.parentTimestamp;
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
            private String parentTimestamp; 
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
                this.parentTimestamp = model.parentTimestamp;
                this.projectId = model.projectId;
                this.projectName = model.projectName;
                this.status = model.status;
                this.tenantId = model.tenantId;
            } 

            /**
             * <p>The ID of the compute cluster for the branch.</p>
             * 
             * <strong>example:</strong>
             * <p>pc-g0lsayq8c5qe</p>
             */
            public Builder branchComputeClusterId(String branchComputeClusterId) {
                this.branchComputeClusterId = branchComputeClusterId;
                return this;
            }

            /**
             * <p>The number of compute nodes. The value is fixed to 1 in the first phase.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder branchComputeNodeCount(Integer branchComputeNodeCount) {
                this.branchComputeNodeCount = branchComputeNodeCount;
                return this;
            }

            /**
             * <p>The ID of the branch.</p>
             * 
             * <strong>example:</strong>
             * <p>br-7g8h9i0j1k2l</p>
             */
            public Builder branchId(String branchId) {
                this.branchId = branchId;
                return this;
            }

            /**
             * <p>The name of the branch.</p>
             * 
             * <strong>example:</strong>
             * <p>feature-analytics</p>
             */
            public Builder branchName(String branchName) {
                this.branchName = branchName;
                return this;
            }

            /**
             * <p>The time when the branch was created. The time is displayed in ISO 8601 format in UTC (YYYY-MM-DDTHH:mm:ssZ).</p>
             * 
             * <strong>example:</strong>
             * <p>2026-06-10T11:00:00Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The description of the branch.</p>
             * 
             * <strong>example:</strong>
             * <p>Feature branch for analytics</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>Indicates whether the branch is the default branch.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder isDefaultBranch(Boolean isDefaultBranch) {
                this.isDefaultBranch = isDefaultBranch;
                return this;
            }

            /**
             * <p>The time when the branch was last activated.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-06-10T12:30:00Z</p>
             */
            public Builder lastActivatedAt(String lastActivatedAt) {
                this.lastActivatedAt = lastActivatedAt;
                return this;
            }

            /**
             * <p>The maximum number of compute units (CUs).</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder maxCU(String maxCU) {
                this.maxCU = maxCU;
                return this;
            }

            /**
             * <p>The minimum number of compute units (CUs).</p>
             * 
             * <strong>example:</strong>
             * <p>0.25</p>
             */
            public Builder minCU(String minCU) {
                this.minCU = minCU;
                return this;
            }

            /**
             * <p>The ID of the parent branch.</p>
             * 
             * <strong>example:</strong>
             * <p>br-1a2b3c4d5e6f</p>
             */
            public Builder parentBranchId(String parentBranchId) {
                this.parentBranchId = parentBranchId;
                return this;
            }

            /**
             * <p>The name of the parent branch.</p>
             * 
             * <strong>example:</strong>
             * <p>main</p>
             */
            public Builder parentBranchName(String parentBranchName) {
                this.parentBranchName = parentBranchName;
                return this;
            }

            /**
             * <p>The historical time of the parent branch specified when the branch was created. The time is displayed in RFC 3339 format in UTC. This parameter may be empty if no historical time is specified or for legacy records.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-10-15T07:32:00.123456Z</p>
             */
            public Builder parentTimestamp(String parentTimestamp) {
                this.parentTimestamp = parentTimestamp;
                return this;
            }

            /**
             * <p>The project ID.</p>
             * 
             * <strong>example:</strong>
             * <p>proj-a1b2c3d4e5f6</p>
             */
            public Builder projectId(String projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * <p>The name of the project to which the branch belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>analytics-prod</p>
             */
            public Builder projectName(String projectName) {
                this.projectName = projectName;
                return this;
            }

            /**
             * <p>The status of the branch. Valid values: Running, Pending, and Paused.</p>
             * 
             * <strong>example:</strong>
             * <p>Active</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The tenant ID.</p>
             * 
             * <strong>example:</strong>
             * <p>t-4b83e0da66674951</p>
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
