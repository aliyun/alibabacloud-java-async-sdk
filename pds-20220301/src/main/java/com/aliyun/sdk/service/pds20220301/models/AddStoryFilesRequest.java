// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pds20220301.models;

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
 * {@link AddStoryFilesRequest} extends {@link RequestModel}
 *
 * <p>AddStoryFilesRequest</p>
 */
public class AddStoryFilesRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("domain_id")
    private String domainId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("drive_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String driveId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("files")
    private java.util.List<Files> files;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("story_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String storyId;

    private AddStoryFilesRequest(Builder builder) {
        super(builder);
        this.domainId = builder.domainId;
        this.driveId = builder.driveId;
        this.files = builder.files;
        this.storyId = builder.storyId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddStoryFilesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return domainId
     */
    public String getDomainId() {
        return this.domainId;
    }

    /**
     * @return driveId
     */
    public String getDriveId() {
        return this.driveId;
    }

    /**
     * @return files
     */
    public java.util.List<Files> getFiles() {
        return this.files;
    }

    /**
     * @return storyId
     */
    public String getStoryId() {
        return this.storyId;
    }

    public static final class Builder extends Request.Builder<AddStoryFilesRequest, Builder> {
        private String domainId; 
        private String driveId; 
        private java.util.List<Files> files; 
        private String storyId; 

        private Builder() {
            super();
        } 

        private Builder(AddStoryFilesRequest request) {
            super(request);
            this.domainId = request.domainId;
            this.driveId = request.driveId;
            this.files = request.files;
            this.storyId = request.storyId;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder domainId(String domainId) {
            this.putHostParameter("domain_id", domainId);
            this.domainId = domainId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder driveId(String driveId) {
            this.putBodyParameter("drive_id", driveId);
            this.driveId = driveId;
            return this;
        }

        /**
         * files.
         */
        public Builder files(java.util.List<Files> files) {
            this.putBodyParameter("files", files);
            this.files = files;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>9132e0d8-fe92-4e56-86c3-f5f112308003</p>
         */
        public Builder storyId(String storyId) {
            this.putBodyParameter("story_id", storyId);
            this.storyId = storyId;
            return this;
        }

        @Override
        public AddStoryFilesRequest build() {
            return new AddStoryFilesRequest(this);
        } 

    } 

    /**
     * 
     * {@link AddStoryFilesRequest} extends {@link TeaModel}
     *
     * <p>AddStoryFilesRequest</p>
     */
    public static class Files extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("file_id")
        @com.aliyun.core.annotation.Validation(required = true)
        private String fileId;

        @com.aliyun.core.annotation.NameInMap("revision_id")
        private String revisionId;

        private Files(Builder builder) {
            this.fileId = builder.fileId;
            this.revisionId = builder.revisionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Files create() {
            return builder().build();
        }

        /**
         * @return fileId
         */
        public String getFileId() {
            return this.fileId;
        }

        /**
         * @return revisionId
         */
        public String getRevisionId() {
            return this.revisionId;
        }

        public static final class Builder {
            private String fileId; 
            private String revisionId; 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>63e5e4340f76cb3ead5f40f68163f0f967c1a7bf</p>
             */
            public Builder fileId(String fileId) {
                this.fileId = fileId;
                return this;
            }

            /**
             * revision_id.
             */
            public Builder revisionId(String revisionId) {
                this.revisionId = revisionId;
                return this;
            }

            public Files build() {
                return new Files(this);
            } 

        } 

    }
}
