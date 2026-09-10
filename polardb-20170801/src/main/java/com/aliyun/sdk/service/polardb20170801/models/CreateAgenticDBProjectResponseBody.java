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
 * {@link CreateAgenticDBProjectResponseBody} extends {@link TeaModel}
 *
 * <p>CreateAgenticDBProjectResponseBody</p>
 */
public class CreateAgenticDBProjectResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BranchComputeClusterId")
    private String branchComputeClusterId;

    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private String createTime;

    @com.aliyun.core.annotation.NameInMap("DefaultBranchId")
    private String defaultBranchId;

    @com.aliyun.core.annotation.NameInMap("DefaultBranchName")
    private String defaultBranchName;

    @com.aliyun.core.annotation.NameInMap("ProjectId")
    private String projectId;

    @com.aliyun.core.annotation.NameInMap("ProjectName")
    private String projectName;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TenantId")
    private String tenantId;

    private CreateAgenticDBProjectResponseBody(Builder builder) {
        this.branchComputeClusterId = builder.branchComputeClusterId;
        this.createTime = builder.createTime;
        this.defaultBranchId = builder.defaultBranchId;
        this.defaultBranchName = builder.defaultBranchName;
        this.projectId = builder.projectId;
        this.projectName = builder.projectName;
        this.requestId = builder.requestId;
        this.tenantId = builder.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAgenticDBProjectResponseBody create() {
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
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * @return defaultBranchId
     */
    public String getDefaultBranchId() {
        return this.defaultBranchId;
    }

    /**
     * @return defaultBranchName
     */
    public String getDefaultBranchName() {
        return this.defaultBranchName;
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
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    public static final class Builder {
        private String branchComputeClusterId; 
        private String createTime; 
        private String defaultBranchId; 
        private String defaultBranchName; 
        private String projectId; 
        private String projectName; 
        private String requestId; 
        private String tenantId; 

        private Builder() {
        } 

        private Builder(CreateAgenticDBProjectResponseBody model) {
            this.branchComputeClusterId = model.branchComputeClusterId;
            this.createTime = model.createTime;
            this.defaultBranchId = model.defaultBranchId;
            this.defaultBranchName = model.defaultBranchName;
            this.projectId = model.projectId;
            this.projectName = model.projectName;
            this.requestId = model.requestId;
            this.tenantId = model.tenantId;
        } 

        /**
         * <p>The ID of the compute instance associated with the default branch.</p>
         * 
         * <strong>example:</strong>
         * <p>pc-g0lsayq8c5qe</p>
         */
        public Builder branchComputeClusterId(String branchComputeClusterId) {
            this.branchComputeClusterId = branchComputeClusterId;
            return this;
        }

        /**
         * <p>The time when the project was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-06-10T11:00:00Z</p>
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * <p>The default branch ID.</p>
         * 
         * <strong>example:</strong>
         * <p>br-1a2b3c4d5e6f</p>
         */
        public Builder defaultBranchId(String defaultBranchId) {
            this.defaultBranchId = defaultBranchId;
            return this;
        }

        /**
         * <p>The default branch name.</p>
         * 
         * <strong>example:</strong>
         * <p>main</p>
         */
        public Builder defaultBranchName(String defaultBranchName) {
            this.defaultBranchName = defaultBranchName;
            return this;
        }

        /**
         * <p>The ID of the new project.</p>
         * 
         * <strong>example:</strong>
         * <p>proj-a1b2c3d4e5f6</p>
         */
        public Builder projectId(String projectId) {
            this.projectId = projectId;
            return this;
        }

        /**
         * <p>The project name.</p>
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
         * <p>E5F6A7B8-C9D0-1234-EFAB-345678901234</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
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

        public CreateAgenticDBProjectResponseBody build() {
            return new CreateAgenticDBProjectResponseBody(this);
        } 

    } 

}
