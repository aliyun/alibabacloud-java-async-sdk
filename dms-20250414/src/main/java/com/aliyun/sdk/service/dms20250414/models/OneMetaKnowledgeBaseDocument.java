// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms20250414.models;

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
 * {@link OneMetaKnowledgeBaseDocument} extends {@link TeaModel}
 *
 * <p>OneMetaKnowledgeBaseDocument</p>
 */
public class OneMetaKnowledgeBaseDocument extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("DocsCount")
    private Integer docsCount;

    @com.aliyun.core.annotation.NameInMap("DocumentLoaderName")
    private String documentLoaderName;

    @com.aliyun.core.annotation.NameInMap("FileExt")
    private String fileExt;

    @com.aliyun.core.annotation.NameInMap("FileSize")
    private Long fileSize;

    @com.aliyun.core.annotation.NameInMap("GmtCreate")
    private String gmtCreate;

    @com.aliyun.core.annotation.NameInMap("GmtModified")
    private String gmtModified;

    @com.aliyun.core.annotation.NameInMap("KbUuid")
    private String kbUuid;

    @com.aliyun.core.annotation.NameInMap("Keywords")
    private String keywords;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("State")
    private Integer state;

    @com.aliyun.core.annotation.NameInMap("Summary")
    private String summary;

    @com.aliyun.core.annotation.NameInMap("TextSplitterName")
    private String textSplitterName;

    private OneMetaKnowledgeBaseDocument(Builder builder) {
        this.description = builder.description;
        this.docsCount = builder.docsCount;
        this.documentLoaderName = builder.documentLoaderName;
        this.fileExt = builder.fileExt;
        this.fileSize = builder.fileSize;
        this.gmtCreate = builder.gmtCreate;
        this.gmtModified = builder.gmtModified;
        this.kbUuid = builder.kbUuid;
        this.keywords = builder.keywords;
        this.name = builder.name;
        this.state = builder.state;
        this.summary = builder.summary;
        this.textSplitterName = builder.textSplitterName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OneMetaKnowledgeBaseDocument create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return docsCount
     */
    public Integer getDocsCount() {
        return this.docsCount;
    }

    /**
     * @return documentLoaderName
     */
    public String getDocumentLoaderName() {
        return this.documentLoaderName;
    }

    /**
     * @return fileExt
     */
    public String getFileExt() {
        return this.fileExt;
    }

    /**
     * @return fileSize
     */
    public Long getFileSize() {
        return this.fileSize;
    }

    /**
     * @return gmtCreate
     */
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    /**
     * @return gmtModified
     */
    public String getGmtModified() {
        return this.gmtModified;
    }

    /**
     * @return kbUuid
     */
    public String getKbUuid() {
        return this.kbUuid;
    }

    /**
     * @return keywords
     */
    public String getKeywords() {
        return this.keywords;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return state
     */
    public Integer getState() {
        return this.state;
    }

    /**
     * @return summary
     */
    public String getSummary() {
        return this.summary;
    }

    /**
     * @return textSplitterName
     */
    public String getTextSplitterName() {
        return this.textSplitterName;
    }

    public static final class Builder {
        private String description; 
        private Integer docsCount; 
        private String documentLoaderName; 
        private String fileExt; 
        private Long fileSize; 
        private String gmtCreate; 
        private String gmtModified; 
        private String kbUuid; 
        private String keywords; 
        private String name; 
        private Integer state; 
        private String summary; 
        private String textSplitterName; 

        private Builder() {
        } 

        private Builder(OneMetaKnowledgeBaseDocument model) {
            this.description = model.description;
            this.docsCount = model.docsCount;
            this.documentLoaderName = model.documentLoaderName;
            this.fileExt = model.fileExt;
            this.fileSize = model.fileSize;
            this.gmtCreate = model.gmtCreate;
            this.gmtModified = model.gmtModified;
            this.kbUuid = model.kbUuid;
            this.keywords = model.keywords;
            this.name = model.name;
            this.state = model.state;
            this.summary = model.summary;
            this.textSplitterName = model.textSplitterName;
        } 

        /**
         * <p>The document description.</p>
         * 
         * <strong>example:</strong>
         * <p>abc</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>The number of chunks.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        public Builder docsCount(Integer docsCount) {
            this.docsCount = docsCount;
            return this;
        }

        /**
         * <p>The name of the document loader.</p>
         * 
         * <strong>example:</strong>
         * <p>ADBPGLoader</p>
         */
        public Builder documentLoaderName(String documentLoaderName) {
            this.documentLoaderName = documentLoaderName;
            return this;
        }

        /**
         * <p>The file extension.</p>
         * 
         * <strong>example:</strong>
         * <p>md</p>
         */
        public Builder fileExt(String fileExt) {
            this.fileExt = fileExt;
            return this;
        }

        /**
         * <p>The file size, in bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>20307</p>
         */
        public Builder fileSize(Long fileSize) {
            this.fileSize = fileSize;
            return this;
        }

        /**
         * <p>When the document was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-04-22 22:59:35</p>
         */
        public Builder gmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }

        /**
         * <p>When the document was last modified.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-04-24 21:22:53</p>
         */
        public Builder gmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }

        /**
         * <p>The knowledge base ID.</p>
         * 
         * <strong>example:</strong>
         * <p>kb-***</p>
         */
        public Builder kbUuid(String kbUuid) {
            this.kbUuid = kbUuid;
            return this;
        }

        /**
         * <p>Keywords extracted from the document.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;test&quot;,&quot;abc&quot;]</p>
         */
        public Builder keywords(String keywords) {
            this.keywords = keywords;
            return this;
        }

        /**
         * <p>The document name.</p>
         * 
         * <strong>example:</strong>
         * <p>test.md</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>The document status. Valid values are:</p>
         * <ul>
         * <li><p><strong>0</strong>: Complete.</p>
         * </li>
         * <li><p><strong>-1</strong>: Unprocessed.</p>
         * </li>
         * <li><p><strong>-2</strong>: Parsing.</p>
         * </li>
         * <li><p><strong>-3</strong>: Failed.</p>
         * </li>
         * <li><p><strong>-4</strong>: Canceled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder state(Integer state) {
            this.state = state;
            return this;
        }

        /**
         * <p>The summary of the document.</p>
         * 
         * <strong>example:</strong>
         * <p>This is a test document.</p>
         */
        public Builder summary(String summary) {
            this.summary = summary;
            return this;
        }

        /**
         * <p>The name of the text splitter.</p>
         * 
         * <strong>example:</strong>
         * <p>ChineseRecursiveTextSplitter</p>
         */
        public Builder textSplitterName(String textSplitterName) {
            this.textSplitterName = textSplitterName;
            return this;
        }

        public OneMetaKnowledgeBaseDocument build() {
            return new OneMetaKnowledgeBaseDocument(this);
        } 

    } 

}
