// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pds20220301.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AIAssistantChatReference} extends {@link TeaModel}
 *
 * <p>AIAssistantChatReference</p>
 */
public class AIAssistantChatReference extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("category")
    private String category;

    @com.aliyun.core.annotation.NameInMap("drive_id")
    private String driveId;

    @com.aliyun.core.annotation.NameInMap("file_id")
    private String fileId;

    @com.aliyun.core.annotation.NameInMap("revision_id")
    private String revisionId;

    @com.aliyun.core.annotation.NameInMap("semantic_result")
    private SemanticResult semanticResult;

    @com.aliyun.core.annotation.NameInMap("url")
    private String url;

    private AIAssistantChatReference(Builder builder) {
        this.category = builder.category;
        this.driveId = builder.driveId;
        this.fileId = builder.fileId;
        this.revisionId = builder.revisionId;
        this.semanticResult = builder.semanticResult;
        this.url = builder.url;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AIAssistantChatReference create() {
        return builder().build();
    }

    /**
     * @return category
     */
    public String getCategory() {
        return this.category;
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

    /**
     * @return url
     */
    public String getUrl() {
        return this.url;
    }

    public static final class Builder {
        private String category; 
        private String driveId; 
        private String fileId; 
        private String revisionId; 
        private SemanticResult semanticResult; 
        private String url; 

        /**
         * category.
         */
        public Builder category(String category) {
            this.category = category;
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

        /**
         * url.
         */
        public Builder url(String url) {
            this.url = url;
            return this;
        }

        public AIAssistantChatReference build() {
            return new AIAssistantChatReference(this);
        } 

    } 

}
