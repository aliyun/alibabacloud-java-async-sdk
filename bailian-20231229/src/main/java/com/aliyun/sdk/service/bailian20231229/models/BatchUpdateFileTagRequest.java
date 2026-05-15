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
 * {@link BatchUpdateFileTagRequest} extends {@link RequestModel}
 *
 * <p>BatchUpdateFileTagRequest</p>
 */
public class BatchUpdateFileTagRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FileInfos")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<FileInfos> fileInfos;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UpdateMode")
    private String updateMode;

    private BatchUpdateFileTagRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.regionId = builder.regionId;
        this.fileInfos = builder.fileInfos;
        this.updateMode = builder.updateMode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchUpdateFileTagRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return fileInfos
     */
    public java.util.List<FileInfos> getFileInfos() {
        return this.fileInfos;
    }

    /**
     * @return updateMode
     */
    public String getUpdateMode() {
        return this.updateMode;
    }

    public static final class Builder extends Request.Builder<BatchUpdateFileTagRequest, Builder> {
        private String workspaceId; 
        private String regionId; 
        private java.util.List<FileInfos> fileInfos; 
        private String updateMode; 

        private Builder() {
            super();
        } 

        private Builder(BatchUpdateFileTagRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.regionId = request.regionId;
            this.fileInfos = request.fileInfos;
            this.updateMode = request.updateMode;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>llm-3shx2gu255oqxxxx</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putPathParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
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
         */
        public Builder fileInfos(java.util.List<FileInfos> fileInfos) {
            String fileInfosShrink = shrink(fileInfos, "FileInfos", "json");
            this.putBodyParameter("FileInfos", fileInfosShrink);
            this.fileInfos = fileInfos;
            return this;
        }

        /**
         * UpdateMode.
         */
        public Builder updateMode(String updateMode) {
            this.putBodyParameter("UpdateMode", updateMode);
            this.updateMode = updateMode;
            return this;
        }

        @Override
        public BatchUpdateFileTagRequest build() {
            return new BatchUpdateFileTagRequest(this);
        } 

    } 

    /**
     * 
     * {@link BatchUpdateFileTagRequest} extends {@link TeaModel}
     *
     * <p>BatchUpdateFileTagRequest</p>
     */
    public static class FileInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FileId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String fileId;

        @com.aliyun.core.annotation.NameInMap("tags")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List<String> tags;

        private FileInfos(Builder builder) {
            this.fileId = builder.fileId;
            this.tags = builder.tags;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FileInfos create() {
            return builder().build();
        }

        /**
         * @return fileId
         */
        public String getFileId() {
            return this.fileId;
        }

        /**
         * @return tags
         */
        public java.util.List<String> getTags() {
            return this.tags;
        }

        public static final class Builder {
            private String fileId; 
            private java.util.List<String> tags; 

            private Builder() {
            } 

            private Builder(FileInfos model) {
                this.fileId = model.fileId;
                this.tags = model.tags;
            } 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>file_3d5319366e2c46309f4c11cfbeacd5fd_10045951</p>
             */
            public Builder fileId(String fileId) {
                this.fileId = fileId;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             */
            public Builder tags(java.util.List<String> tags) {
                this.tags = tags;
                return this;
            }

            public FileInfos build() {
                return new FileInfos(this);
            } 

        } 

    }
}
