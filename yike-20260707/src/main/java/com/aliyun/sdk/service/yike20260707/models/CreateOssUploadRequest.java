// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yike20260707.models;

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
 * {@link CreateOssUploadRequest} extends {@link RequestModel}
 *
 * <p>CreateOssUploadRequest</p>
 */
public class CreateOssUploadRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizConfig")
    private String bizConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CredentialType")
    private String credentialType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileExt")
    @com.aliyun.core.annotation.Validation(required = true)
    private String fileExt;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileType")
    private String fileType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetBucket")
    private String targetBucket;

    private CreateOssUploadRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.bizConfig = builder.bizConfig;
        this.credentialType = builder.credentialType;
        this.fileExt = builder.fileExt;
        this.fileType = builder.fileType;
        this.targetBucket = builder.targetBucket;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateOssUploadRequest create() {
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
     * @return bizConfig
     */
    public String getBizConfig() {
        return this.bizConfig;
    }

    /**
     * @return credentialType
     */
    public String getCredentialType() {
        return this.credentialType;
    }

    /**
     * @return fileExt
     */
    public String getFileExt() {
        return this.fileExt;
    }

    /**
     * @return fileType
     */
    public String getFileType() {
        return this.fileType;
    }

    /**
     * @return targetBucket
     */
    public String getTargetBucket() {
        return this.targetBucket;
    }

    public static final class Builder extends Request.Builder<CreateOssUploadRequest, Builder> {
        private String regionId; 
        private String bizConfig; 
        private String credentialType; 
        private String fileExt; 
        private String fileType; 
        private String targetBucket; 

        private Builder() {
            super();
        } 

        private Builder(CreateOssUploadRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.bizConfig = request.bizConfig;
            this.credentialType = request.credentialType;
            this.fileExt = request.fileExt;
            this.fileType = request.fileType;
            this.targetBucket = request.targetBucket;
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
         * <p>The <strong>business configuration JSON</strong>, which includes ProductionId and FolderId.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;ProductionId&quot;: &quot;pd_***&quot;, &quot;FolderId&quot;: &quot;fd_***&quot;}</p>
         */
        public Builder bizConfig(String bizConfig) {
            this.putQueryParameter("BizConfig", bizConfig);
            this.bizConfig = bizConfig;
            return this;
        }

        /**
         * <p>The credential type. This is a reserved parameter. The current version always returns STS temporary credentials, and this parameter does not take effect.</p>
         * 
         * <strong>example:</strong>
         * <p>STS</p>
         */
        public Builder credentialType(String credentialType) {
            this.putQueryParameter("CredentialType", credentialType);
            this.credentialType = credentialType;
            return this;
        }

        /**
         * <p>The file name extension, such as mp4, wav, or png. Do not include the dot. If this parameter is missing, <code>MissingParameter</code> is returned.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>mp4</p>
         */
        public Builder fileExt(String fileExt) {
            this.putQueryParameter("FileExt", fileExt);
            this.fileExt = fileExt;
            return this;
        }

        /**
         * <p>The file type. Valid values: <code>Media</code> (default), <code>StoryboardInput</code>, <code>ImageFusion</code>, <code>AIAppParams</code>, <code>Workflow</code>, and <code>CommonFile</code>. If an invalid value is specified, <code>InvalidParameter</code> is returned. This value is used as a path segment in the <code>ObjectKey</code> and is converted to lowercase.</p>
         * 
         * <strong>example:</strong>
         * <p>Media</p>
         */
        public Builder fileType(String fileType) {
            this.putQueryParameter("FileType", fileType);
            this.fileType = fileType;
            return this;
        }

        /**
         * <p>The explicitly specified target bucket.</p>
         * 
         * <strong>example:</strong>
         * <p>test-bucket</p>
         */
        public Builder targetBucket(String targetBucket) {
            this.putQueryParameter("TargetBucket", targetBucket);
            this.targetBucket = targetBucket;
            return this;
        }

        @Override
        public CreateOssUploadRequest build() {
            return new CreateOssUploadRequest(this);
        } 

    } 

}
