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
         * BranchComputeClusterId.
         */
        public Builder branchComputeClusterId(String branchComputeClusterId) {
            this.branchComputeClusterId = branchComputeClusterId;
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
         * TenantId.
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
