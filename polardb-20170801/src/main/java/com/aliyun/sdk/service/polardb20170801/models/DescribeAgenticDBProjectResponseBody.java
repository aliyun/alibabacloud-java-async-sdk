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
         * CreateTime.
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * DefaultBranchId.
         */
        public Builder defaultBranchId(String defaultBranchId) {
            this.defaultBranchId = defaultBranchId;
            return this;
        }

        /**
         * DefaultBranchName.
         */
        public Builder defaultBranchName(String defaultBranchName) {
            this.defaultBranchName = defaultBranchName;
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

        public DescribeAgenticDBProjectResponseBody build() {
            return new DescribeAgenticDBProjectResponseBody(this);
        } 

    } 

}
