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
 * {@link UpdateStoryRequest} extends {@link RequestModel}
 *
 * <p>UpdateStoryRequest</p>
 */
public class UpdateStoryRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("domain_id")
    private String domainId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("cover")
    private Cover cover;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("custom_labels")
    @Deprecated
    private java.util.Map<String, String> customLabels;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("drive_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String driveId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("story_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String storyId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("story_name")
    private String storyName;

    private UpdateStoryRequest(Builder builder) {
        super(builder);
        this.domainId = builder.domainId;
        this.cover = builder.cover;
        this.customLabels = builder.customLabels;
        this.driveId = builder.driveId;
        this.storyId = builder.storyId;
        this.storyName = builder.storyName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateStoryRequest create() {
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
     * @return cover
     */
    public Cover getCover() {
        return this.cover;
    }

    /**
     * @return customLabels
     */
    public java.util.Map<String, String> getCustomLabels() {
        return this.customLabels;
    }

    /**
     * @return driveId
     */
    public String getDriveId() {
        return this.driveId;
    }

    /**
     * @return storyId
     */
    public String getStoryId() {
        return this.storyId;
    }

    /**
     * @return storyName
     */
    public String getStoryName() {
        return this.storyName;
    }

    public static final class Builder extends Request.Builder<UpdateStoryRequest, Builder> {
        private String domainId; 
        private Cover cover; 
        private java.util.Map<String, String> customLabels; 
        private String driveId; 
        private String storyId; 
        private String storyName; 

        private Builder() {
            super();
        } 

        private Builder(UpdateStoryRequest request) {
            super(request);
            this.domainId = request.domainId;
            this.cover = request.cover;
            this.customLabels = request.customLabels;
            this.driveId = request.driveId;
            this.storyId = request.storyId;
            this.storyName = request.storyName;
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
         * cover.
         */
        public Builder cover(Cover cover) {
            this.putBodyParameter("cover", cover);
            this.cover = cover;
            return this;
        }

        /**
         * custom_labels.
         */
        public Builder customLabels(java.util.Map<String, String> customLabels) {
            this.putBodyParameter("custom_labels", customLabels);
            this.customLabels = customLabels;
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

        /**
         * story_name.
         */
        public Builder storyName(String storyName) {
            this.putBodyParameter("story_name", storyName);
            this.storyName = storyName;
            return this;
        }

        @Override
        public UpdateStoryRequest build() {
            return new UpdateStoryRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateStoryRequest} extends {@link TeaModel}
     *
     * <p>UpdateStoryRequest</p>
     */
    public static class Cover extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("file_id")
        private String fileId;

        @com.aliyun.core.annotation.NameInMap("revision_id")
        private String revisionId;

        private Cover(Builder builder) {
            this.fileId = builder.fileId;
            this.revisionId = builder.revisionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Cover create() {
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

            private Builder() {
            } 

            private Builder(Cover model) {
                this.fileId = model.fileId;
                this.revisionId = model.revisionId;
            } 

            /**
             * file_id.
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

            public Cover build() {
                return new Cover(this);
            } 

        } 

    }
}
