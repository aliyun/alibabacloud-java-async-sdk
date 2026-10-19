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
 * {@link DescribeAgenticDBBranchResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAgenticDBBranchResponseBody</p>
 */
public class DescribeAgenticDBBranchResponseBody extends TeaModel {
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

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("TenantId")
    private String tenantId;

    private DescribeAgenticDBBranchResponseBody(Builder builder) {
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
        this.requestId = builder.requestId;
        this.status = builder.status;
        this.tenantId = builder.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAgenticDBBranchResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
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
        private String requestId; 
        private String status; 
        private String tenantId; 

        private Builder() {
        } 

        private Builder(DescribeAgenticDBBranchResponseBody model) {
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
            this.requestId = model.requestId;
            this.status = model.status;
            this.tenantId = model.tenantId;
        } 

        /**
         * <p>The ID of the compute cluster associated with the branch.</p>
         * 
         * <strong>example:</strong>
         * <p>pc-g0lsayq8c5qe</p>
         */
        public Builder branchComputeClusterId(String branchComputeClusterId) {
            this.branchComputeClusterId = branchComputeClusterId;
            return this;
        }

        /**
         * <p>The number of compute nodes. The value is fixed to 1 in the initial phase.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder branchComputeNodeCount(Integer branchComputeNodeCount) {
            this.branchComputeNodeCount = branchComputeNodeCount;
            return this;
        }

        /**
         * <p>The branch ID.</p>
         * 
         * <strong>example:</strong>
         * <p>br-7g8h9i0j1k2l</p>
         */
        public Builder branchId(String branchId) {
            this.branchId = branchId;
            return this;
        }

        /**
         * <p>The branch name.</p>
         * 
         * <strong>example:</strong>
         * <p>feature-analytics</p>
         */
        public Builder branchName(String branchName) {
            this.branchName = branchName;
            return this;
        }

        /**
         * <p>The time when the branch was created.</p>
         * <p>The time is in the ISO 8601 standard in UTC (format: YYYY-MM-DDTHH:mm:ssZ).</p>
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
         * <p>The ID of the project to which the branch belongs.</p>
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
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>C3D4E5F6-A7B8-9012-CDEF-345678901CDE</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The status of the branch. Valid values:</p>
         * <ul>
         * <li>Running</li>
         * <li>Pending</li>
         * <li>Paused</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Active</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>The ID of the tenant to which the branch belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>t-4b83e0da66674951</p>
         */
        public Builder tenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }

        public DescribeAgenticDBBranchResponseBody build() {
            return new DescribeAgenticDBBranchResponseBody(this);
        } 

    } 

}
