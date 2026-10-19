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
 * {@link DescribeAgenticDBProjectResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAgenticDBProjectResponseBody</p>
 */
public class DescribeAgenticDBProjectResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private String createTime;

    @com.aliyun.core.annotation.NameInMap("DefaultBranchId")
    private String defaultBranchId;

    @com.aliyun.core.annotation.NameInMap("DefaultBranchName")
    private String defaultBranchName;

    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

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

    private DescribeAgenticDBProjectResponseBody(Builder builder) {
        this.createTime = builder.createTime;
        this.defaultBranchId = builder.defaultBranchId;
        this.defaultBranchName = builder.defaultBranchName;
        this.description = builder.description;
        this.projectId = builder.projectId;
        this.projectName = builder.projectName;
        this.requestId = builder.requestId;
        this.status = builder.status;
        this.tenantId = builder.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAgenticDBProjectResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
     * @return description
     */
    public String getDescription() {
        return this.description;
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
        private String createTime; 
        private String defaultBranchId; 
        private String defaultBranchName; 
        private String description; 
        private String projectId; 
        private String projectName; 
        private String requestId; 
        private String status; 
        private String tenantId; 

        private Builder() {
        } 

        private Builder(DescribeAgenticDBProjectResponseBody model) {
            this.createTime = model.createTime;
            this.defaultBranchId = model.defaultBranchId;
            this.defaultBranchName = model.defaultBranchName;
            this.description = model.description;
            this.projectId = model.projectId;
            this.projectName = model.projectName;
            this.requestId = model.requestId;
            this.status = model.status;
            this.tenantId = model.tenantId;
        } 

        /**
         * <p>The time when the project was created.</p>
         * <p>The time is in ISO 8601 format in UTC (format: YYYY-MM-DDTHH:mm:ssZ).</p>
         * 
         * <strong>example:</strong>
         * <p>2026-06-10T11:00:00Z</p>
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * <p>The ID of the default branch.</p>
         * 
         * <strong>example:</strong>
         * <p>br-1a2b3c4d5e6f</p>
         */
        public Builder defaultBranchId(String defaultBranchId) {
            this.defaultBranchId = defaultBranchId;
            return this;
        }

        /**
         * <p>The name of the default branch.</p>
         * 
         * <strong>example:</strong>
         * <p>main</p>
         */
        public Builder defaultBranchName(String defaultBranchName) {
            this.defaultBranchName = defaultBranchName;
            return this;
        }

        /**
         * <p>The description of the project.</p>
         * 
         * <strong>example:</strong>
         * <p>Production analytics database</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>Project ID</p>
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
         * <p>I9J0K1L2-M3N4-5678-IJKL-789012345678</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The project status. Valid values:</p>
         * <ul>
         * <li>Active: Normal.</li>
         * <li>Destroying: Being destroyed.</li>
         * <li>Destroyed: Destroyed.</li>
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
         * <p>The ID of the tenant to which the project belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>t-4b83e0da66674951</p>
         */
        public Builder tenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }

        public DescribeAgenticDBProjectResponseBody build() {
            return new DescribeAgenticDBProjectResponseBody(this);
        } 

    } 

}
