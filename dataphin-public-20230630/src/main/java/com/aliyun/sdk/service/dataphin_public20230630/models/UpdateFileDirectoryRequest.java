// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataphin_public20230630.models;

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
 * {@link UpdateFileDirectoryRequest} extends {@link RequestModel}
 *
 * <p>UpdateFileDirectoryRequest</p>
 */
public class UpdateFileDirectoryRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Directory")
    @com.aliyun.core.annotation.Validation(required = true)
    private String directory;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long fileId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OpTenantId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long opTenantId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProjectId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long projectId;

    private UpdateFileDirectoryRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.directory = builder.directory;
        this.fileId = builder.fileId;
        this.opTenantId = builder.opTenantId;
        this.projectId = builder.projectId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateFileDirectoryRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return directory
     */
    public String getDirectory() {
        return this.directory;
    }

    /**
     * @return fileId
     */
    public Long getFileId() {
        return this.fileId;
    }

    /**
     * @return opTenantId
     */
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    /**
     * @return projectId
     */
    public Long getProjectId() {
        return this.projectId;
    }

    public static final class Builder extends Request.Builder<UpdateFileDirectoryRequest, Builder> {
        private String regionId; 
        private String directory; 
        private Long fileId; 
        private Long opTenantId; 
        private Long projectId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateFileDirectoryRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.directory = request.directory;
            this.fileId = request.fileId;
            this.opTenantId = request.opTenantId;
            this.projectId = request.projectId;
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
         * <p>/xx测试/目录new</p>
         */
        public Builder directory(String directory) {
            this.putQueryParameter("Directory", directory);
            this.directory = directory;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>12121111</p>
         */
        public Builder fileId(Long fileId) {
            this.putQueryParameter("FileId", fileId);
            this.fileId = fileId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>30001011</p>
         */
        public Builder opTenantId(Long opTenantId) {
            this.putQueryParameter("OpTenantId", opTenantId);
            this.opTenantId = opTenantId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>12132323</p>
         */
        public Builder projectId(Long projectId) {
            this.putQueryParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        @Override
        public UpdateFileDirectoryRequest build() {
            return new UpdateFileDirectoryRequest(this);
        } 

    } 

}
