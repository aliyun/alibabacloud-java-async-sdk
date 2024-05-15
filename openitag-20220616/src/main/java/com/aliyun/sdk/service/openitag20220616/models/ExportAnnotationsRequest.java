// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.openitag20220616.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ExportAnnotationsRequest} extends {@link RequestModel}
 *
 * <p>ExportAnnotationsRequest</p>
 */
public class ExportAnnotationsRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("TenantId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String tenantId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("TaskId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String taskId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OssPath")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ossPath;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegisterDataset")
    private String registerDataset;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Target")
    private String target;

    private ExportAnnotationsRequest(Builder builder) {
        super(builder);
        this.tenantId = builder.tenantId;
        this.taskId = builder.taskId;
        this.ossPath = builder.ossPath;
        this.registerDataset = builder.registerDataset;
        this.target = builder.target;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExportAnnotationsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    /**
     * @return ossPath
     */
    public String getOssPath() {
        return this.ossPath;
    }

    /**
     * @return registerDataset
     */
    public String getRegisterDataset() {
        return this.registerDataset;
    }

    /**
     * @return target
     */
    public String getTarget() {
        return this.target;
    }

    public static final class Builder extends Request.Builder<ExportAnnotationsRequest, Builder> {
        private String tenantId; 
        private String taskId; 
        private String ossPath; 
        private String registerDataset; 
        private String target; 

        private Builder() {
            super();
        } 

        private Builder(ExportAnnotationsRequest request) {
            super(request);
            this.tenantId = request.tenantId;
            this.taskId = request.taskId;
            this.ossPath = request.ossPath;
            this.registerDataset = request.registerDataset;
            this.target = request.target;
        } 

        /**
         * TenantId.
         */
        public Builder tenantId(String tenantId) {
            this.putPathParameter("TenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        /**
         * TaskId.
         */
        public Builder taskId(String taskId) {
            this.putPathParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        /**
         * OssPath.
         */
        public Builder ossPath(String ossPath) {
            this.putQueryParameter("OssPath", ossPath);
            this.ossPath = ossPath;
            return this;
        }

        /**
         * RegisterDataset.
         */
        public Builder registerDataset(String registerDataset) {
            this.putQueryParameter("RegisterDataset", registerDataset);
            this.registerDataset = registerDataset;
            return this;
        }

        /**
         * Target.
         */
        public Builder target(String target) {
            this.putQueryParameter("Target", target);
            this.target = target;
            return this;
        }

        @Override
        public ExportAnnotationsRequest build() {
            return new ExportAnnotationsRequest(this);
        } 

    } 

}
