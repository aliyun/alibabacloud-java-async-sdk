// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pds20220301.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AIAssistantMessageFileMeta} extends {@link TeaModel}
 *
 * <p>AIAssistantMessageFileMeta</p>
 */
public class AIAssistantMessageFileMeta extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("category")
    private String category;

    @com.aliyun.core.annotation.NameInMap("domain_id")
    private String domainId;

    @com.aliyun.core.annotation.NameInMap("drive_id")
    private String driveId;

    @com.aliyun.core.annotation.NameInMap("file_id")
    private String fileId;

    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("revision_id")
    private String revisionId;

    @com.aliyun.core.annotation.NameInMap("semantic_result")
    private SemanticResult semanticResult;

    private AIAssistantMessageFileMeta(Builder builder) {
        this.category = builder.category;
        this.domainId = builder.domainId;
        this.driveId = builder.driveId;
        this.fileId = builder.fileId;
        this.name = builder.name;
        this.revisionId = builder.revisionId;
        this.semanticResult = builder.semanticResult;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AIAssistantMessageFileMeta create() {
        return builder().build();
    }

    /**
     * @return category
     */
    public String getCategory() {
        return this.category;
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
     * @return fileId
     */
    public String getFileId() {
        return this.fileId;
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

    /**
     * @return semanticResult
     */
    public SemanticResult getSemanticResult() {
        return this.semanticResult;
    }

    public static final class Builder {
        private String category; 
        private String domainId; 
        private String driveId; 
        private String fileId; 
        private String name; 
        private String revisionId; 
        private SemanticResult semanticResult; 

        /**
         * category.
         */
        public Builder category(String category) {
            this.category = category;
            return this;
        }

        /**
         * domain_id.
         */
        public Builder domainId(String domainId) {
            this.domainId = domainId;
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

        /**
         * semantic_result.
         */
        public Builder semanticResult(SemanticResult semanticResult) {
            this.semanticResult = semanticResult;
            return this;
        }

        public AIAssistantMessageFileMeta build() {
            return new AIAssistantMessageFileMeta(this);
        } 

    } 

}
