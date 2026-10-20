// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bailian20231229.models;

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
 * {@link DescribeFileResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeFileResponseBody</p>
 */
public class DescribeFileResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private DescribeFileResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.status = builder.status;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeFileResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private String status; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(DescribeFileResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.status = model.status;
            this.success = model.success;
        } 

        /**
         * <p>The error code.</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The business data field.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>Requests throttling triggered.</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>17204B98-xxxx-4F9A-8464-2446A84821CA</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The status code returned.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>Indicates whether the operation was successful. Valid values:</p>
         * <ul>
         * <li>true: The operation was successful.</li>
         * <li>false: The operation failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeFileResponseBody build() {
            return new DescribeFileResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeFileResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeFileResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CategoryId")
        private String categoryId;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("FileId")
        private String fileId;

        @com.aliyun.core.annotation.NameInMap("FileName")
        private String fileName;

        @com.aliyun.core.annotation.NameInMap("FileType")
        private String fileType;

        @com.aliyun.core.annotation.NameInMap("OriginFileDownloadUrl")
        private String originFileDownloadUrl;

        @com.aliyun.core.annotation.NameInMap("ParseErrorMessage")
        private String parseErrorMessage;

        @com.aliyun.core.annotation.NameInMap("ParseResultDownloadUrl")
        private String parseResultDownloadUrl;

        @com.aliyun.core.annotation.NameInMap("Parser")
        private String parser;

        @com.aliyun.core.annotation.NameInMap("SizeInBytes")
        private Long sizeInBytes;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.List<String> tags;

        private Data(Builder builder) {
            this.categoryId = builder.categoryId;
            this.createTime = builder.createTime;
            this.fileId = builder.fileId;
            this.fileName = builder.fileName;
            this.fileType = builder.fileType;
            this.originFileDownloadUrl = builder.originFileDownloadUrl;
            this.parseErrorMessage = builder.parseErrorMessage;
            this.parseResultDownloadUrl = builder.parseResultDownloadUrl;
            this.parser = builder.parser;
            this.sizeInBytes = builder.sizeInBytes;
            this.status = builder.status;
            this.tags = builder.tags;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return categoryId
         */
        public String getCategoryId() {
            return this.categoryId;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return fileId
         */
        public String getFileId() {
            return this.fileId;
        }

        /**
         * @return fileName
         */
        public String getFileName() {
            return this.fileName;
        }

        /**
         * @return fileType
         */
        public String getFileType() {
            return this.fileType;
        }

        /**
         * @return originFileDownloadUrl
         */
        public String getOriginFileDownloadUrl() {
            return this.originFileDownloadUrl;
        }

        /**
         * @return parseErrorMessage
         */
        public String getParseErrorMessage() {
            return this.parseErrorMessage;
        }

        /**
         * @return parseResultDownloadUrl
         */
        public String getParseResultDownloadUrl() {
            return this.parseResultDownloadUrl;
        }

        /**
         * @return parser
         */
        public String getParser() {
            return this.parser;
        }

        /**
         * @return sizeInBytes
         */
        public Long getSizeInBytes() {
            return this.sizeInBytes;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return tags
         */
        public java.util.List<String> getTags() {
            return this.tags;
        }

        public static final class Builder {
            private String categoryId; 
            private String createTime; 
            private String fileId; 
            private String fileName; 
            private String fileType; 
            private String originFileDownloadUrl; 
            private String parseErrorMessage; 
            private String parseResultDownloadUrl; 
            private String parser; 
            private Long sizeInBytes; 
            private String status; 
            private java.util.List<String> tags; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.categoryId = model.categoryId;
                this.createTime = model.createTime;
                this.fileId = model.fileId;
                this.fileName = model.fileName;
                this.fileType = model.fileType;
                this.originFileDownloadUrl = model.originFileDownloadUrl;
                this.parseErrorMessage = model.parseErrorMessage;
                this.parseResultDownloadUrl = model.parseResultDownloadUrl;
                this.parser = model.parser;
                this.sizeInBytes = model.sizeInBytes;
                this.status = model.status;
                this.tags = model.tags;
            } 

            /**
             * <p>The ID of the category to which the file belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>cate_cdd11b1b79a74e8bbd675c356a91ee3xxxxxxxx</p>
             */
            public Builder categoryId(String categoryId) {
                this.categoryId = categoryId;
                return this;
            }

            /**
             * <p>The timestamp when the file was added to Model Studio. Format: yyyy-MM-dd HH:mm:ss. Time zone: UTC+8.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-09-09 12:45:43</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The ID of the file.</p>
             * 
             * <strong>example:</strong>
             * <p>file_9a65732555b54d5ea10796ca5742ba22_xxxxxxxx</p>
             */
            public Builder fileId(String fileId) {
                this.fileId = fileId;
                return this;
            }

            /**
             * <p>The name of the file.</p>
             * 
             * <strong>example:</strong>
             * <p>XXX Product Introduction.pdf</p>
             */
            public Builder fileName(String fileName) {
                this.fileName = fileName;
                return this;
            }

            /**
             * <p>The file type, which is the file extension. Valid values: pdf, docx, doc, txt, md, pptx, ppt, xlsx, xls, html, png, jpg, jpeg, bmp, and gif.</p>
             * 
             * <strong>example:</strong>
             * <p>pdf</p>
             */
            public Builder fileType(String fileType) {
                this.fileType = fileType;
                return this;
            }

            /**
             * <p>The download URL of the source file.</p>
             * 
             * <strong>example:</strong>
             * <p>https:xxxx.com/xxx.pdf?sign=xxxx&amp;expiredAt=xxxx</p>
             */
            public Builder originFileDownloadUrl(String originFileDownloadUrl) {
                this.originFileDownloadUrl = originFileDownloadUrl;
                return this;
            }

            /**
             * <p>The cause of the parsing failure.</p>
             * 
             * <strong>example:</strong>
             * <p>Error Message</p>
             */
            public Builder parseErrorMessage(String parseErrorMessage) {
                this.parseErrorMessage = parseErrorMessage;
                return this;
            }

            /**
             * <p>The download URL of the file parsing result.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://example.com/parse-result">https://example.com/parse-result</a></p>
             */
            public Builder parseResultDownloadUrl(String parseResultDownloadUrl) {
                this.parseResultDownloadUrl = parseResultDownloadUrl;
                return this;
            }

            /**
             * <p>The type of the parser used to parse the file. Valid values:</p>
             * <ul>
             * <li>DASHSCOPE_DOCMIND: the default document parser.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>DASHSCOPE_DOCMIND</p>
             */
            public Builder parser(String parser) {
                this.parser = parser;
                return this;
            }

            /**
             * <p>The size of the file, in bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>1234</p>
             */
            public Builder sizeInBytes(Long sizeInBytes) {
                this.sizeInBytes = sizeInBytes;
                return this;
            }

            /**
             * <p>&lt;props=&quot;china&quot;&gt;</p>
             * <p>The status of a file used for a document knowledge base (type: UNSTRUCTURED). Valid values:</p>
             * <p>&lt;props=&quot;intl&quot;&gt;</p>
             * <p>The status of a file used for an unstructured knowledge base (type: UNSTRUCTURED). Valid values:</p>
             * <ul>
             * <li>INIT: to be parsed.</li>
             * <li>IN_PARSE_QUEUE: queuing for parsing.</li>
             * <li>PARSING: parsing.</li>
             * <li>PARSE_SUCCESS: parsed.
             * <note>You can import a document into a knowledge base only after its status changes to PARSE_SUCCESS.</note></li>
             * <li>PARSE_FAILED: parsing failed.</li>
             * </ul>
             * <p>&lt;props=&quot;china&quot;&gt;
             * The status of a file used for <a href="https://www.alibabacloud.com/help/en/model-studio/user-guide/file-interaction">session interaction</a> in an agent application (type: SESSION_FILE). Valid values:</p>
             * <ul>
             * <li>INIT: to be parsed.</li>
             * <li>IN_PARSE_QUEUE: queuing for parsing.</li>
             * <li>PARSING: parsing.</li>
             * <li>PARSE_SUCCESS: parsed.</li>
             * <li>PARSE_FAILED: parsing failed.</li>
             * <li>SAFE_CHECKING: undergoing security check.</li>
             * <li>SAFE_CHECK_FAILED: security check failed.</li>
             * <li>INDEX_BUILDING: building index.</li>
             * <li>INDEX_BUILD_SUCCESS: index built.</li>
             * <li>INDEX_BUILDING_FAILED: index building failed.</li>
             * <li>INDEX_DELETED: file index deleted.</li>
             * <li>FILE_IS_READY: file ready.
             * <note>You can perform Q&amp;A only after the status changes to FILE_IS_READY.</note></li>
             * <li>FILE_EXPIRED: file expired.
             * <note>The file is valid only for the current session of the user. After the user closes the session, the file expires. The maximum validity period is 7 days. Long-term storage is not supported.</note></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>PARSE_SUCCESS</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The list of tags associated with the file. A file can be associated with multiple tags.</p>
             */
            public Builder tags(java.util.List<String> tags) {
                this.tags = tags;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
