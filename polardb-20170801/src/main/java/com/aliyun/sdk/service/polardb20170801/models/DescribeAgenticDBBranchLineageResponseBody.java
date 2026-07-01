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
 * {@link DescribeAgenticDBBranchLineageResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAgenticDBBranchLineageResponseBody</p>
 */
public class DescribeAgenticDBBranchLineageResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AnchorBranchId")
    private String anchorBranchId;

    @com.aliyun.core.annotation.NameInMap("Items")
    private java.util.List<Items> items;

    @com.aliyun.core.annotation.NameInMap("NodeCount")
    private Integer nodeCount;

    @com.aliyun.core.annotation.NameInMap("ProjectId")
    private String projectId;

    @com.aliyun.core.annotation.NameInMap("ProjectName")
    private String projectName;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RootBranchId")
    private String rootBranchId;

    @com.aliyun.core.annotation.NameInMap("TenantId")
    private String tenantId;

    private DescribeAgenticDBBranchLineageResponseBody(Builder builder) {
        this.anchorBranchId = builder.anchorBranchId;
        this.items = builder.items;
        this.nodeCount = builder.nodeCount;
        this.projectId = builder.projectId;
        this.projectName = builder.projectName;
        this.requestId = builder.requestId;
        this.rootBranchId = builder.rootBranchId;
        this.tenantId = builder.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAgenticDBBranchLineageResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return anchorBranchId
     */
    public String getAnchorBranchId() {
        return this.anchorBranchId;
    }

    /**
     * @return items
     */
    public java.util.List<Items> getItems() {
        return this.items;
    }

    /**
     * @return nodeCount
     */
    public Integer getNodeCount() {
        return this.nodeCount;
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return rootBranchId
     */
    public String getRootBranchId() {
        return this.rootBranchId;
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    public static final class Builder {
        private String anchorBranchId; 
        private java.util.List<Items> items; 
        private Integer nodeCount; 
        private String projectId; 
        private String projectName; 
        private String requestId; 
        private String rootBranchId; 
        private String tenantId; 

        private Builder() {
        } 

        private Builder(DescribeAgenticDBBranchLineageResponseBody model) {
            this.anchorBranchId = model.anchorBranchId;
            this.items = model.items;
            this.nodeCount = model.nodeCount;
            this.projectId = model.projectId;
            this.projectName = model.projectName;
            this.requestId = model.requestId;
            this.rootBranchId = model.rootBranchId;
            this.tenantId = model.tenantId;
        } 

        /**
         * AnchorBranchId.
         */
        public Builder anchorBranchId(String anchorBranchId) {
            this.anchorBranchId = anchorBranchId;
            return this;
        }

        /**
         * Items.
         */
        public Builder items(java.util.List<Items> items) {
            this.items = items;
            return this;
        }

        /**
         * NodeCount.
         */
        public Builder nodeCount(Integer nodeCount) {
            this.nodeCount = nodeCount;
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * RootBranchId.
         */
        public Builder rootBranchId(String rootBranchId) {
            this.rootBranchId = rootBranchId;
            return this;
        }

        /**
         * TenantId.
         */
        public Builder tenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }

        public DescribeAgenticDBBranchLineageResponseBody build() {
            return new DescribeAgenticDBBranchLineageResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeAgenticDBBranchLineageResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAgenticDBBranchLineageResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BranchComputeClusterId")
        private String branchComputeClusterId;

        @com.aliyun.core.annotation.NameInMap("BranchDescription")
        private String branchDescription;

        @com.aliyun.core.annotation.NameInMap("BranchId")
        private String branchId;

        @com.aliyun.core.annotation.NameInMap("BranchName")
        private String branchName;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Depth")
        private Integer depth;

        @com.aliyun.core.annotation.NameInMap("DirectChildCount")
        private Integer directChildCount;

        @com.aliyun.core.annotation.NameInMap("HasMoreAncestors")
        private Boolean hasMoreAncestors;

        @com.aliyun.core.annotation.NameInMap("HasMoreChildren")
        private Boolean hasMoreChildren;

        @com.aliyun.core.annotation.NameInMap("IsAnchor")
        private Boolean isAnchor;

        @com.aliyun.core.annotation.NameInMap("IsDefaultBranch")
        private Boolean isDefaultBranch;

        @com.aliyun.core.annotation.NameInMap("IsRoot")
        private Boolean isRoot;

        @com.aliyun.core.annotation.NameInMap("ParentBranchId")
        private String parentBranchId;

        @com.aliyun.core.annotation.NameInMap("ParentBranchName")
        private String parentBranchName;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private Items(Builder builder) {
            this.branchComputeClusterId = builder.branchComputeClusterId;
            this.branchDescription = builder.branchDescription;
            this.branchId = builder.branchId;
            this.branchName = builder.branchName;
            this.createTime = builder.createTime;
            this.depth = builder.depth;
            this.directChildCount = builder.directChildCount;
            this.hasMoreAncestors = builder.hasMoreAncestors;
            this.hasMoreChildren = builder.hasMoreChildren;
            this.isAnchor = builder.isAnchor;
            this.isDefaultBranch = builder.isDefaultBranch;
            this.isRoot = builder.isRoot;
            this.parentBranchId = builder.parentBranchId;
            this.parentBranchName = builder.parentBranchName;
            this.status = builder.status;
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
         * @return branchDescription
         */
        public String getBranchDescription() {
            return this.branchDescription;
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
         * @return depth
         */
        public Integer getDepth() {
            return this.depth;
        }

        /**
         * @return directChildCount
         */
        public Integer getDirectChildCount() {
            return this.directChildCount;
        }

        /**
         * @return hasMoreAncestors
         */
        public Boolean getHasMoreAncestors() {
            return this.hasMoreAncestors;
        }

        /**
         * @return hasMoreChildren
         */
        public Boolean getHasMoreChildren() {
            return this.hasMoreChildren;
        }

        /**
         * @return isAnchor
         */
        public Boolean getIsAnchor() {
            return this.isAnchor;
        }

        /**
         * @return isDefaultBranch
         */
        public Boolean getIsDefaultBranch() {
            return this.isDefaultBranch;
        }

        /**
         * @return isRoot
         */
        public Boolean getIsRoot() {
            return this.isRoot;
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
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String branchComputeClusterId; 
            private String branchDescription; 
            private String branchId; 
            private String branchName; 
            private String createTime; 
            private Integer depth; 
            private Integer directChildCount; 
            private Boolean hasMoreAncestors; 
            private Boolean hasMoreChildren; 
            private Boolean isAnchor; 
            private Boolean isDefaultBranch; 
            private Boolean isRoot; 
            private String parentBranchId; 
            private String parentBranchName; 
            private String status; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.branchComputeClusterId = model.branchComputeClusterId;
                this.branchDescription = model.branchDescription;
                this.branchId = model.branchId;
                this.branchName = model.branchName;
                this.createTime = model.createTime;
                this.depth = model.depth;
                this.directChildCount = model.directChildCount;
                this.hasMoreAncestors = model.hasMoreAncestors;
                this.hasMoreChildren = model.hasMoreChildren;
                this.isAnchor = model.isAnchor;
                this.isDefaultBranch = model.isDefaultBranch;
                this.isRoot = model.isRoot;
                this.parentBranchId = model.parentBranchId;
                this.parentBranchName = model.parentBranchName;
                this.status = model.status;
            } 

            /**
             * BranchComputeClusterId.
             */
            public Builder branchComputeClusterId(String branchComputeClusterId) {
                this.branchComputeClusterId = branchComputeClusterId;
                return this;
            }

            /**
             * BranchDescription.
             */
            public Builder branchDescription(String branchDescription) {
                this.branchDescription = branchDescription;
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
             * Depth.
             */
            public Builder depth(Integer depth) {
                this.depth = depth;
                return this;
            }

            /**
             * DirectChildCount.
             */
            public Builder directChildCount(Integer directChildCount) {
                this.directChildCount = directChildCount;
                return this;
            }

            /**
             * HasMoreAncestors.
             */
            public Builder hasMoreAncestors(Boolean hasMoreAncestors) {
                this.hasMoreAncestors = hasMoreAncestors;
                return this;
            }

            /**
             * HasMoreChildren.
             */
            public Builder hasMoreChildren(Boolean hasMoreChildren) {
                this.hasMoreChildren = hasMoreChildren;
                return this;
            }

            /**
             * IsAnchor.
             */
            public Builder isAnchor(Boolean isAnchor) {
                this.isAnchor = isAnchor;
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
             * IsRoot.
             */
            public Builder isRoot(Boolean isRoot) {
                this.isRoot = isRoot;
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
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
