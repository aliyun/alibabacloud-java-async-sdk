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
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * ErrorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * ErrorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
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
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * DocsCount.
             */
            public Builder docsCount(Long docsCount) {
                this.docsCount = docsCount;
                return this;
            }

            /**
             * DocumentLoaderName.
             */
            public Builder documentLoaderName(String documentLoaderName) {
                this.documentLoaderName = documentLoaderName;
                return this;
            }

            /**
             * FileExt.
             */
            public Builder fileExt(String fileExt) {
                this.fileExt = fileExt;
                return this;
            }

            /**
             * FileSize.
             */
            public Builder fileSize(Long fileSize) {
                this.fileSize = fileSize;
                return this;
            }

            /**
             * GmtCreate.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * GmtModified.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * KbUuid.
             */
            public Builder kbUuid(String kbUuid) {
                this.kbUuid = kbUuid;
                return this;
            }

            /**
             * Keywords.
             */
            public Builder keywords(String keywords) {
                this.keywords = keywords;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * State.
             */
            public Builder state(Long state) {
                this.state = state;
                return this;
            }

            /**
             * Summary.
             */
            public Builder summary(String summary) {
                this.summary = summary;
                return this;
            }

            /**
             * TextSplitterName.
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
