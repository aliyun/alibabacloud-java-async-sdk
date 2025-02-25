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
 * {@link CreateCustomizedStoryRequest} extends {@link RequestModel}
 *
 * <p>CreateCustomizedStoryRequest</p>
 */
public class CreateCustomizedStoryRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("domain_id")
    private String domainId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("custom_labels")
    @Deprecated
    private java.util.Map<String, String> customLabels;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("drive_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String driveId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("story_cover")
    @com.aliyun.core.annotation.Validation(required = true)
    private StoryCover storyCover;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("story_files")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<StoryFiles> storyFiles;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("story_name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String storyName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("story_sub_type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String storySubType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("story_type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String storyType;

    private CreateCustomizedStoryRequest(Builder builder) {
        super(builder);
        this.domainId = builder.domainId;
        this.customLabels = builder.customLabels;
        this.driveId = builder.driveId;
        this.storyCover = builder.storyCover;
        this.storyFiles = builder.storyFiles;
        this.storyName = builder.storyName;
        this.storySubType = builder.storySubType;
        this.storyType = builder.storyType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCustomizedStoryRequest create() {
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
     * @return storyCover
     */
    public StoryCover getStoryCover() {
        return this.storyCover;
    }

    /**
     * @return storyFiles
     */
    public java.util.List<StoryFiles> getStoryFiles() {
        return this.storyFiles;
    }

    /**
     * @return storyName
     */
    public String getStoryName() {
        return this.storyName;
    }

    /**
     * @return storySubType
     */
    public String getStorySubType() {
        return this.storySubType;
    }

    /**
     * @return storyType
     */
    public String getStoryType() {
        return this.storyType;
    }

    public static final class Builder extends Request.Builder<CreateCustomizedStoryRequest, Builder> {
        private String domainId; 
        private java.util.Map<String, String> customLabels; 
        private String driveId; 
        private StoryCover storyCover; 
        private java.util.List<StoryFiles> storyFiles; 
        private String storyName; 
        private String storySubType; 
        private String storyType; 

        private Builder() {
            super();
        } 

        private Builder(CreateCustomizedStoryRequest request) {
            super(request);
            this.domainId = request.domainId;
            this.customLabels = request.customLabels;
            this.driveId = request.driveId;
            this.storyCover = request.storyCover;
            this.storyFiles = request.storyFiles;
            this.storyName = request.storyName;
            this.storySubType = request.storySubType;
            this.storyType = request.storyType;
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
         */
        public Builder storyCover(StoryCover storyCover) {
            this.putBodyParameter("story_cover", storyCover);
            this.storyCover = storyCover;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder storyFiles(java.util.List<StoryFiles> storyFiles) {
            this.putBodyParameter("story_files", storyFiles);
            this.storyFiles = storyFiles;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test_name</p>
         */
        public Builder storyName(String storyName) {
            this.putBodyParameter("story_name", storyName);
            this.storyName = storyName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>user_created</p>
         */
        public Builder storySubType(String storySubType) {
            this.putBodyParameter("story_sub_type", storySubType);
            this.storySubType = storySubType;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>user_created</p>
         */
        public Builder storyType(String storyType) {
            this.putBodyParameter("story_type", storyType);
            this.storyType = storyType;
            return this;
        }

        @Override
        public CreateCustomizedStoryRequest build() {
            return new CreateCustomizedStoryRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateCustomizedStoryRequest} extends {@link TeaModel}
     *
     * <p>CreateCustomizedStoryRequest</p>
     */
    public static class StoryCover extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("file_id")
        @com.aliyun.core.annotation.Validation(required = true)
        private String fileId;

        @com.aliyun.core.annotation.NameInMap("revision_id")
        private String revisionId;

        private StoryCover(Builder builder) {
            this.fileId = builder.fileId;
            this.revisionId = builder.revisionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StoryCover create() {
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

            public StoryCover build() {
                return new StoryCover(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateCustomizedStoryRequest} extends {@link TeaModel}
     *
     * <p>CreateCustomizedStoryRequest</p>
     */
    public static class StoryFiles extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("file_id")
        @com.aliyun.core.annotation.Validation(required = true)
        private String fileId;

        @com.aliyun.core.annotation.NameInMap("revision_id")
        private String revisionId;

        private StoryFiles(Builder builder) {
            this.fileId = builder.fileId;
            this.revisionId = builder.revisionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StoryFiles create() {
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

            public StoryFiles build() {
                return new StoryFiles(this);
            } 

        } 

    }
}
