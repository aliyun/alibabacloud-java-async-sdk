// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pds20220301.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link KnowledgeFile} extends {@link TeaModel}
 *
 * <p>KnowledgeFile</p>
 */
public class KnowledgeFile extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("creator_id")
    private String creatorId;

    @com.aliyun.core.annotation.NameInMap("drive_id")
    private String driveId;

    @com.aliyun.core.annotation.NameInMap("drive_name")
    private String driveName;

    @com.aliyun.core.annotation.NameInMap("file_category")
    private String fileCategory;

    @com.aliyun.core.annotation.NameInMap("file_created_at")
    private Long fileCreatedAt;

    @com.aliyun.core.annotation.NameInMap("file_creator_id")
    private String fileCreatorId;

    @com.aliyun.core.annotation.NameInMap("file_id")
    private String fileId;

    @com.aliyun.core.annotation.NameInMap("file_image_time")
    private Long fileImageTime;

    @com.aliyun.core.annotation.NameInMap("file_last_modifier_id")
    private String fileLastModifierId;

    @com.aliyun.core.annotation.NameInMap("file_last_modifier_type")
    private String fileLastModifierType;

    @com.aliyun.core.annotation.NameInMap("file_name")
    private String fileName;

    @com.aliyun.core.annotation.NameInMap("file_name_path")
    private String fileNamePath;

    @com.aliyun.core.annotation.NameInMap("file_size")
    private Long fileSize;

    @com.aliyun.core.annotation.NameInMap("file_updated_at")
    private Long fileUpdatedAt;

    @com.aliyun.core.annotation.NameInMap("joined_at")
    private Long joinedAt;

    @com.aliyun.core.annotation.NameInMap("knowledge_base_id")
    private String knowledgeBaseId;

    @com.aliyun.core.annotation.NameInMap("knowledge_category_id")
    private String knowledgeCategoryId;

    @com.aliyun.core.annotation.NameInMap("revision_id")
    private String revisionId;

    private KnowledgeFile(Builder builder) {
        this.creatorId = builder.creatorId;
        this.driveId = builder.driveId;
        this.driveName = builder.driveName;
        this.fileCategory = builder.fileCategory;
        this.fileCreatedAt = builder.fileCreatedAt;
        this.fileCreatorId = builder.fileCreatorId;
        this.fileId = builder.fileId;
        this.fileImageTime = builder.fileImageTime;
        this.fileLastModifierId = builder.fileLastModifierId;
        this.fileLastModifierType = builder.fileLastModifierType;
        this.fileName = builder.fileName;
        this.fileNamePath = builder.fileNamePath;
        this.fileSize = builder.fileSize;
        this.fileUpdatedAt = builder.fileUpdatedAt;
        this.joinedAt = builder.joinedAt;
        this.knowledgeBaseId = builder.knowledgeBaseId;
        this.knowledgeCategoryId = builder.knowledgeCategoryId;
        this.revisionId = builder.revisionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static KnowledgeFile create() {
        return builder().build();
    }

    /**
     * @return creatorId
     */
    public String getCreatorId() {
        return this.creatorId;
    }

    /**
     * @return driveId
     */
    public String getDriveId() {
        return this.driveId;
    }

    /**
     * @return driveName
     */
    public String getDriveName() {
        return this.driveName;
    }

    /**
     * @return fileCategory
     */
    public String getFileCategory() {
        return this.fileCategory;
    }

    /**
     * @return fileCreatedAt
     */
    public Long getFileCreatedAt() {
        return this.fileCreatedAt;
    }

    /**
     * @return fileCreatorId
     */
    public String getFileCreatorId() {
        return this.fileCreatorId;
    }

    /**
     * @return fileId
     */
    public String getFileId() {
        return this.fileId;
    }

    /**
     * @return fileImageTime
     */
    public Long getFileImageTime() {
        return this.fileImageTime;
    }

    /**
     * @return fileLastModifierId
     */
    public String getFileLastModifierId() {
        return this.fileLastModifierId;
    }

    /**
     * @return fileLastModifierType
     */
    public String getFileLastModifierType() {
        return this.fileLastModifierType;
    }

    /**
     * @return fileName
     */
    public String getFileName() {
        return this.fileName;
    }

    /**
     * @return fileNamePath
     */
    public String getFileNamePath() {
        return this.fileNamePath;
    }

    /**
     * @return fileSize
     */
    public Long getFileSize() {
        return this.fileSize;
    }

    /**
     * @return fileUpdatedAt
     */
    public Long getFileUpdatedAt() {
        return this.fileUpdatedAt;
    }

    /**
     * @return joinedAt
     */
    public Long getJoinedAt() {
        return this.joinedAt;
    }

    /**
     * @return knowledgeBaseId
     */
    public String getKnowledgeBaseId() {
        return this.knowledgeBaseId;
    }

    /**
     * @return knowledgeCategoryId
     */
    public String getKnowledgeCategoryId() {
        return this.knowledgeCategoryId;
    }

    /**
     * @return revisionId
     */
    public String getRevisionId() {
        return this.revisionId;
    }

    public static final class Builder {
        private String creatorId; 
        private String driveId; 
        private String driveName; 
        private String fileCategory; 
        private Long fileCreatedAt; 
        private String fileCreatorId; 
        private String fileId; 
        private Long fileImageTime; 
        private String fileLastModifierId; 
        private String fileLastModifierType; 
        private String fileName; 
        private String fileNamePath; 
        private Long fileSize; 
        private Long fileUpdatedAt; 
        private Long joinedAt; 
        private String knowledgeBaseId; 
        private String knowledgeCategoryId; 
        private String revisionId; 

        /**
         * creator_id.
         */
        public Builder creatorId(String creatorId) {
            this.creatorId = creatorId;
            return this;
        }

        /**
         * drive_id.
         */
        public Builder driveId(String driveId) {
            this.driveId = driveId;
            return this;
        }

        /**
         * drive_name.
         */
        public Builder driveName(String driveName) {
            this.driveName = driveName;
            return this;
        }

        /**
         * file_category.
         */
        public Builder fileCategory(String fileCategory) {
            this.fileCategory = fileCategory;
            return this;
        }

        /**
         * file_created_at.
         */
        public Builder fileCreatedAt(Long fileCreatedAt) {
            this.fileCreatedAt = fileCreatedAt;
            return this;
        }

        /**
         * file_creator_id.
         */
        public Builder fileCreatorId(String fileCreatorId) {
            this.fileCreatorId = fileCreatorId;
            return this;
        }

        /**
         * file_id.
         */
        public Builder fileId(String fileId) {
            this.fileId = fileId;
            return this;
        }

        /**
         * file_image_time.
         */
        public Builder fileImageTime(Long fileImageTime) {
            this.fileImageTime = fileImageTime;
            return this;
        }

        /**
         * file_last_modifier_id.
         */
        public Builder fileLastModifierId(String fileLastModifierId) {
            this.fileLastModifierId = fileLastModifierId;
            return this;
        }

        /**
         * file_last_modifier_type.
         */
        public Builder fileLastModifierType(String fileLastModifierType) {
            this.fileLastModifierType = fileLastModifierType;
            return this;
        }

        /**
         * file_name.
         */
        public Builder fileName(String fileName) {
            this.fileName = fileName;
            return this;
        }

        /**
         * file_name_path.
         */
        public Builder fileNamePath(String fileNamePath) {
            this.fileNamePath = fileNamePath;
            return this;
        }

        /**
         * file_size.
         */
        public Builder fileSize(Long fileSize) {
            this.fileSize = fileSize;
            return this;
        }

        /**
         * file_updated_at.
         */
        public Builder fileUpdatedAt(Long fileUpdatedAt) {
            this.fileUpdatedAt = fileUpdatedAt;
            return this;
        }

        /**
         * joined_at.
         */
        public Builder joinedAt(Long joinedAt) {
            this.joinedAt = joinedAt;
            return this;
        }

        /**
         * knowledge_base_id.
         */
        public Builder knowledgeBaseId(String knowledgeBaseId) {
            this.knowledgeBaseId = knowledgeBaseId;
            return this;
        }

        /**
         * knowledge_category_id.
         */
        public Builder knowledgeCategoryId(String knowledgeCategoryId) {
            this.knowledgeCategoryId = knowledgeCategoryId;
            return this;
        }

        /**
         * revision_id.
         */
        public Builder revisionId(String revisionId) {
            this.revisionId = revisionId;
            return this;
        }

        public KnowledgeFile build() {
            return new KnowledgeFile(this);
        } 

    } 

}
