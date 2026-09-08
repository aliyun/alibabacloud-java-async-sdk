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
 * {@link DescribeDocumentResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDocumentResponseBody</p>
 */
public class DescribeDocumentResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private DescribeDocumentResponseBody(Builder builder) {
        this.data = builder.data;
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDocumentResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Data data; 
        private String errorCode; 
        private String errorMessage; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(DescribeDocumentResponseBody model) {
            this.data = model.data;
            this.errorCode = model.errorCode;
            this.errorMessage = model.errorMessage;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The details of the document.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error code returned when the request fails.</p>
         * 
         * <strong>example:</strong>
         * <p>KnowledgeBaseNotFound</p>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>The error message returned when the request fails.</p>
         * 
         * <strong>example:</strong>
         * <p>Resource not found kb-***</p>
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * <p>The unique request ID. Provide this ID for troubleshooting if an error occurs.</p>
         * 
         * <strong>example:</strong>
         * <p>67E910F2-4B62-5B0C-ACA3-7547695C****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request succeeded. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: The request succeeded.</p>
         * </li>
         * <li><p><strong>false</strong>: The request failed.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeDocumentResponseBody build() {
            return new DescribeDocumentResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDocumentResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDocumentResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("DocsCount")
        private Long docsCount;

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
        private Long state;

        @com.aliyun.core.annotation.NameInMap("Summary")
        private String summary;

        @com.aliyun.core.annotation.NameInMap("TextSplitterName")
        private String textSplitterName;

        private Data(Builder builder) {
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

        public static Data create() {
            return builder().build();
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
        public Long getDocsCount() {
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
        public Long getState() {
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
            private Long docsCount; 
            private String documentLoaderName; 
            private String fileExt; 
            private Long fileSize; 
            private String gmtCreate; 
            private String gmtModified; 
            private String kbUuid; 
            private String keywords; 
            private String name; 
            private Long state; 
            private String summary; 
            private String textSplitterName; 

            private Builder() {
            } 

            private Builder(Data model) {
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
             * <p>The description of the document.</p>
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
            public Builder docsCount(Long docsCount) {
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
             * <p>The file extension of the document.</p>
             * 
             * <strong>example:</strong>
             * <p>md</p>
             */
            public Builder fileExt(String fileExt) {
                this.fileExt = fileExt;
                return this;
            }

            /**
             * <p>The size of the document in bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>20307</p>
             */
            public Builder fileSize(Long fileSize) {
                this.fileSize = fileSize;
                return this;
            }

            /**
             * <p>The creation time of the document, in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-04-22 22:59:35</p>
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>The last modification time of the document, in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-04-24 21:22:53</p>
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>The ID of the knowledge base.</p>
             * 
             * <strong>example:</strong>
             * <p>kb-***</p>
             */
            public Builder kbUuid(String kbUuid) {
                this.kbUuid = kbUuid;
                return this;
            }

            /**
             * <p>The keywords of the document.</p>
             * 
             * <strong>example:</strong>
             * <p>[&quot;test&quot;,&quot;abc&quot;]</p>
             */
            public Builder keywords(String keywords) {
                this.keywords = keywords;
                return this;
            }

            /**
             * <p>The name of the document.</p>
             * 
             * <strong>example:</strong>
             * <p>test.md</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The document state. Possible values are:</p>
             * <ul>
             * <li><p><strong>0</strong>: Parsing complete.</p>
             * </li>
             * <li><p><strong>-1</strong>: Not parsed.</p>
             * </li>
             * <li><p><strong>-2</strong>: Parsing in progress.</p>
             * </li>
             * <li><p><strong>-3</strong>: Parsing failed.</p>
             * </li>
             * <li><p><strong>-4</strong>: Parsing canceled.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder state(Long state) {
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

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
