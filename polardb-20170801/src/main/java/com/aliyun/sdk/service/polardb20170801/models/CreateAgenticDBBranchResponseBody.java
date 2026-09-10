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
 * {@link CreateAgenticDBBranchResponseBody} extends {@link TeaModel}
 *
 * <p>CreateAgenticDBBranchResponseBody</p>
 */
public class CreateAgenticDBBranchResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BranchComputeClusterId")
    private String branchComputeClusterId;

    @com.aliyun.core.annotation.NameInMap("BranchId")
    private String branchId;

    @com.aliyun.core.annotation.NameInMap("BranchName")
    private String branchName;

    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    private String DBClusterId;

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

    private CreateAgenticDBBranchResponseBody(Builder builder) {
        this.branchComputeClusterId = builder.branchComputeClusterId;
        this.branchId = builder.branchId;
        this.branchName = builder.branchName;
        this.DBClusterId = builder.DBClusterId;
        this.parentBranchId = builder.parentBranchId;
        this.parentBranchName = builder.parentBranchName;
        this.projectId = builder.projectId;
        this.projectName = builder.projectName;
        this.requestId = builder.requestId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAgenticDBBranchResponseBody create() {
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
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
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

    public static final class Builder {
        private String branchComputeClusterId; 
        private String branchId; 
        private String branchName; 
        private String DBClusterId; 
        private String parentBranchId; 
        private String parentBranchName; 
        private String projectId; 
        private String projectName; 
        private String requestId; 
        private String status; 

        private Builder() {
        } 

        private Builder(CreateAgenticDBBranchResponseBody model) {
            this.branchComputeClusterId = model.branchComputeClusterId;
            this.branchId = model.branchId;
            this.branchName = model.branchName;
            this.DBClusterId = model.DBClusterId;
            this.parentBranchId = model.parentBranchId;
            this.parentBranchName = model.parentBranchName;
            this.projectId = model.projectId;
            this.projectName = model.projectName;
            this.requestId = model.requestId;
            this.status = model.status;
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
         * <p>The AgenticDB cluster ID.</p>
         * 
         * <strong>example:</strong>
         * <p>pagc-bp1abcdef1234567</p>
         */
        public Builder DBClusterId(String DBClusterId) {
            this.DBClusterId = DBClusterId;
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
         * <p>A1B2C3D4-E5F6-7890-ABCD-1234567890AB</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The status of the branch.</p>
         * 
         * <strong>example:</strong>
         * <p>Active</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public CreateAgenticDBBranchResponseBody build() {
            return new CreateAgenticDBBranchResponseBody(this);
        } 

    } 

}
