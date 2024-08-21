// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bailian20231229.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ApplyFileUploadLeaseRequest} extends {@link RequestModel}
 *
 * <p>ApplyFileUploadLeaseRequest</p>
 */
public class ApplyFileUploadLeaseRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("CategoryId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String categoryId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FileName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String fileName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Md5")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64, minLength = 1)
    private String md5;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SizeInBytes")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sizeInBytes;

    private ApplyFileUploadLeaseRequest(Builder builder) {
        super(builder);
        this.categoryId = builder.categoryId;
        this.workspaceId = builder.workspaceId;
        this.regionId = builder.regionId;
        this.fileName = builder.fileName;
        this.md5 = builder.md5;
        this.sizeInBytes = builder.sizeInBytes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ApplyFileUploadLeaseRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return categoryId
     */
    public String getCategoryId() {
        return this.categoryId;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return fileName
     */
    public String getFileName() {
        return this.fileName;
    }

    /**
     * @return md5
     */
    public String getMd5() {
        return this.md5;
    }

    /**
     * @return sizeInBytes
     */
    public String getSizeInBytes() {
        return this.sizeInBytes;
    }

    public static final class Builder extends Request.Builder<ApplyFileUploadLeaseRequest, Builder> {
        private String categoryId; 
        private String workspaceId; 
        private String regionId; 
        private String fileName; 
        private String md5; 
        private String sizeInBytes; 

        private Builder() {
            super();
        } 

        private Builder(ApplyFileUploadLeaseRequest request) {
            super(request);
            this.categoryId = request.categoryId;
            this.workspaceId = request.workspaceId;
            this.regionId = request.regionId;
            this.fileName = request.fileName;
            this.md5 = request.md5;
            this.sizeInBytes = request.sizeInBytes;
        } 

        /**
         * CategoryId.
         */
        public Builder categoryId(String categoryId) {
            this.putPathParameter("CategoryId", categoryId);
            this.categoryId = categoryId;
            return this;
        }

        /**
         * WorkspaceId.
         */
        public Builder workspaceId(String workspaceId) {
            this.putPathParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
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
         * FileName.
         */
        public Builder fileName(String fileName) {
            this.putBodyParameter("FileName", fileName);
            this.fileName = fileName;
            return this;
        }

        /**
         * Md5.
         */
        public Builder md5(String md5) {
            this.putBodyParameter("Md5", md5);
            this.md5 = md5;
            return this;
        }

        /**
         * SizeInBytes.
         */
        public Builder sizeInBytes(String sizeInBytes) {
            this.putBodyParameter("SizeInBytes", sizeInBytes);
            this.sizeInBytes = sizeInBytes;
            return this;
        }

        @Override
        public ApplyFileUploadLeaseRequest build() {
            return new ApplyFileUploadLeaseRequest(this);
        } 

    } 

}
