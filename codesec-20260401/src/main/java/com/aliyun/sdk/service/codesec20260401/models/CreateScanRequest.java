// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.codesec20260401.models;

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
 * {@link CreateScanRequest} extends {@link RequestModel}
 *
 * <p>CreateScanRequest</p>
 */
public class CreateScanRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("projectId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long projectId;

    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("codeBundleId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long codeBundleId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("kind")
    @com.aliyun.core.annotation.Validation(required = true)
    private String kind;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("taskName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String taskName;

    private CreateScanRequest(Builder builder) {
        super(builder);
        this.projectId = builder.projectId;
        this.regionId = builder.regionId;
        this.codeBundleId = builder.codeBundleId;
        this.kind = builder.kind;
        this.taskName = builder.taskName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateScanRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return projectId
     */
    public Long getProjectId() {
        return this.projectId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return codeBundleId
     */
    public Long getCodeBundleId() {
        return this.codeBundleId;
    }

    /**
     * @return kind
     */
    public String getKind() {
        return this.kind;
    }

    /**
     * @return taskName
     */
    public String getTaskName() {
        return this.taskName;
    }

    public static final class Builder extends Request.Builder<CreateScanRequest, Builder> {
        private Long projectId; 
        private String regionId; 
        private Long codeBundleId; 
        private String kind; 
        private String taskName; 

        private Builder() {
            super();
        } 

        private Builder(CreateScanRequest request) {
            super(request);
            this.projectId = request.projectId;
            this.regionId = request.regionId;
            this.codeBundleId = request.codeBundleId;
            this.kind = request.kind;
            this.taskName = request.taskName;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1111</p>
         */
        public Builder projectId(Long projectId) {
            this.putPathParameter("projectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>111</p>
         */
        public Builder codeBundleId(Long codeBundleId) {
            this.putQueryParameter("codeBundleId", codeBundleId);
            this.codeBundleId = codeBundleId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>full</p>
         */
        public Builder kind(String kind) {
            this.putQueryParameter("kind", kind);
            this.kind = kind;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>name</p>
         */
        public Builder taskName(String taskName) {
            this.putQueryParameter("taskName", taskName);
            this.taskName = taskName;
            return this;
        }

        @Override
        public CreateScanRequest build() {
            return new CreateScanRequest(this);
        } 

    } 

}
