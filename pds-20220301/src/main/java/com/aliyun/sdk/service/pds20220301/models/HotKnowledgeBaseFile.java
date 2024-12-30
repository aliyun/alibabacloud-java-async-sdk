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
 * {@link HotKnowledgeBaseFile} extends {@link TeaModel}
 *
 * <p>HotKnowledgeBaseFile</p>
 */
public class HotKnowledgeBaseFile extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("action_count")
    private Long actionCount;

    @com.aliyun.core.annotation.NameInMap("action_list")
    private java.util.List<String> actionList;

    @com.aliyun.core.annotation.NameInMap("category")
    private String category;

    @com.aliyun.core.annotation.NameInMap("count_at")
    private Long countAt;

    @com.aliyun.core.annotation.NameInMap("drive_id")
    private String driveId;

    @com.aliyun.core.annotation.NameInMap("file_id")
    private String fileId;

    @com.aliyun.core.annotation.NameInMap("knowledge_base_id")
    private String knowledgeBaseId;

    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("revision_id")
    private String revisionId;

    private HotKnowledgeBaseFile(Builder builder) {
        this.actionCount = builder.actionCount;
        this.actionList = builder.actionList;
        this.category = builder.category;
        this.countAt = builder.countAt;
        this.driveId = builder.driveId;
        this.fileId = builder.fileId;
        this.knowledgeBaseId = builder.knowledgeBaseId;
        this.name = builder.name;
        this.revisionId = builder.revisionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static HotKnowledgeBaseFile create() {
        return builder().build();
    }

    /**
     * @return actionCount
     */
    public Long getActionCount() {
        return this.actionCount;
    }

    /**
     * @return actionList
     */
    public java.util.List<String> getActionList() {
        return this.actionList;
    }

    /**
     * @return category
     */
    public String getCategory() {
        return this.category;
    }

    /**
     * @return countAt
     */
    public Long getCountAt() {
        return this.countAt;
    }

    /**
     * @return driveId
     */
    public String getDriveId() {
        return this.driveId;
    }

    /**
     * @return fileId
     */
    public String getFileId() {
        return this.fileId;
    }

    /**
     * @return knowledgeBaseId
     */
    public String getKnowledgeBaseId() {
        return this.knowledgeBaseId;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return revisionId
     */
    public String getRevisionId() {
        return this.revisionId;
    }

    public static final class Builder {
        private Long actionCount; 
        private java.util.List<String> actionList; 
        private String category; 
        private Long countAt; 
        private String driveId; 
        private String fileId; 
        private String knowledgeBaseId; 
        private String name; 
        private String revisionId; 

        /**
         * action_count.
         */
        public Builder actionCount(Long actionCount) {
            this.actionCount = actionCount;
            return this;
        }

        /**
         * action_list.
         */
        public Builder actionList(java.util.List<String> actionList) {
            this.actionList = actionList;
            return this;
        }

        /**
         * category.
         */
        public Builder category(String category) {
            this.category = category;
            return this;
        }

        /**
         * count_at.
         */
        public Builder countAt(Long countAt) {
            this.countAt = countAt;
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
         * file_id.
         */
        public Builder fileId(String fileId) {
            this.fileId = fileId;
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
         * name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * revision_id.
         */
        public Builder revisionId(String revisionId) {
            this.revisionId = revisionId;
            return this;
        }

        public HotKnowledgeBaseFile build() {
            return new HotKnowledgeBaseFile(this);
        } 

    } 

}
