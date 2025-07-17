// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bailian20231229.models;

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
 * {@link AddFilesFromAuthorizedOssRequest} extends {@link RequestModel}
 *
 * <p>AddFilesFromAuthorizedOssRequest</p>
 */
public class AddFilesFromAuthorizedOssRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CategoryId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String categoryId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CategoryType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String categoryType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FileDetails")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<FileDetails> fileDetails;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OssBucketName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ossBucketName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OssRegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ossRegionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Tags")
    private java.util.List<String> tags;

    private AddFilesFromAuthorizedOssRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.workspaceId = builder.workspaceId;
        this.categoryId = builder.categoryId;
        this.categoryType = builder.categoryType;
        this.fileDetails = builder.fileDetails;
        this.ossBucketName = builder.ossBucketName;
        this.ossRegionId = builder.ossRegionId;
        this.tags = builder.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddFilesFromAuthorizedOssRequest create() {
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
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    /**
     * @return categoryId
     */
    public String getCategoryId() {
        return this.categoryId;
    }

    /**
     * @return categoryType
     */
    public String getCategoryType() {
        return this.categoryType;
    }

    /**
     * @return fileDetails
     */
    public java.util.List<FileDetails> getFileDetails() {
        return this.fileDetails;
    }

    /**
     * @return ossBucketName
     */
    public String getOssBucketName() {
        return this.ossBucketName;
    }

    /**
     * @return ossRegionId
     */
    public String getOssRegionId() {
        return this.ossRegionId;
    }

    /**
     * @return tags
     */
    public java.util.List<String> getTags() {
        return this.tags;
    }

    public static final class Builder extends Request.Builder<AddFilesFromAuthorizedOssRequest, Builder> {
        private String regionId; 
        private String workspaceId; 
        private String categoryId; 
        private String categoryType; 
        private java.util.List<FileDetails> fileDetails; 
        private String ossBucketName; 
        private String ossRegionId; 
        private java.util.List<String> tags; 

        private Builder() {
            super();
        } 

        private Builder(AddFilesFromAuthorizedOssRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.workspaceId = request.workspaceId;
            this.categoryId = request.categoryId;
            this.categoryType = request.categoryType;
            this.fileDetails = request.fileDetails;
            this.ossBucketName = request.ossBucketName;
            this.ossRegionId = request.ossRegionId;
            this.tags = request.tags;
        } 

        /**
         * <p>This parameter is required.</p>
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
         * <p>llm-3z7uw7fwz0vxxxx</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putPathParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cate_cdd11b1b79a74e8bbd675c356a91ee35xxxxxxxx</p>
         */
        public Builder categoryId(String categoryId) {
            this.putBodyParameter("CategoryId", categoryId);
            this.categoryId = categoryId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>UNSTRUCTURED</p>
         */
        public Builder categoryType(String categoryType) {
            this.putBodyParameter("CategoryType", categoryType);
            this.categoryType = categoryType;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder fileDetails(java.util.List<FileDetails> fileDetails) {
            String fileDetailsShrink = shrink(fileDetails, "FileDetails", "json");
            this.putBodyParameter("FileDetails", fileDetailsShrink);
            this.fileDetails = fileDetails;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>bucketNamexxxxx</p>
         */
        public Builder ossBucketName(String ossBucketName) {
            this.putBodyParameter("OssBucketName", ossBucketName);
            this.ossBucketName = ossBucketName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        public Builder ossRegionId(String ossRegionId) {
            this.putBodyParameter("OssRegionId", ossRegionId);
            this.ossRegionId = ossRegionId;
            return this;
        }

        /**
         * Tags.
         */
        public Builder tags(java.util.List<String> tags) {
            String tagsShrink = shrink(tags, "Tags", "json");
            this.putBodyParameter("Tags", tagsShrink);
            this.tags = tags;
            return this;
        }

        @Override
        public AddFilesFromAuthorizedOssRequest build() {
            return new AddFilesFromAuthorizedOssRequest(this);
        } 

    } 

    /**
     * 
     * {@link AddFilesFromAuthorizedOssRequest} extends {@link TeaModel}
     *
     * <p>AddFilesFromAuthorizedOssRequest</p>
     */
    public static class FileDetails extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FileName")
        @com.aliyun.core.annotation.Validation(required = true, maxLength = 123, minLength = 1)
        private String fileName;

        @com.aliyun.core.annotation.NameInMap("OssKey")
        @com.aliyun.core.annotation.Validation(required = true, maxLength = 256, minLength = 1)
        private String ossKey;

        private FileDetails(Builder builder) {
            this.fileName = builder.fileName;
            this.ossKey = builder.ossKey;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FileDetails create() {
            return builder().build();
        }

        /**
         * @return fileName
         */
        public String getFileName() {
            return this.fileName;
        }

        /**
         * @return ossKey
         */
        public String getOssKey() {
            return this.ossKey;
        }

        public static final class Builder {
            private String fileName; 
            private String ossKey; 

            private Builder() {
            } 

            private Builder(FileDetails model) {
                this.fileName = model.fileName;
                this.ossKey = model.ossKey;
            } 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>this_is_temp_xxxx.pdf</p>
             */
            public Builder fileName(String fileName) {
                this.fileName = fileName;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>root/path/this_is_temp_xxxx.pdf</p>
             */
            public Builder ossKey(String ossKey) {
                this.ossKey = ossKey;
                return this;
            }

            public FileDetails build() {
                return new FileDetails(this);
            } 

        } 

    }
}
