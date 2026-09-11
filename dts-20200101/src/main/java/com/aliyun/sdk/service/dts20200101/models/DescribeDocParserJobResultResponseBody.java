// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20200101.models;

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
 * {@link DescribeDocParserJobResultResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDocParserJobResultResponseBody</p>
 */
public class DescribeDocParserJobResultResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ContentList")
    private java.util.List<ContentList> contentList;

    @com.aliyun.core.annotation.NameInMap("DynamicCode")
    private String dynamicCode;

    @com.aliyun.core.annotation.NameInMap("DynamicMessage")
    private String dynamicMessage;

    @com.aliyun.core.annotation.NameInMap("ErrCode")
    private String errCode;

    @com.aliyun.core.annotation.NameInMap("ErrMessage")
    private String errMessage;

    @com.aliyun.core.annotation.NameInMap("FileUrl")
    private String fileUrl;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("OuterFileUrl")
    private String outerFileUrl;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private DescribeDocParserJobResultResponseBody(Builder builder) {
        this.contentList = builder.contentList;
        this.dynamicCode = builder.dynamicCode;
        this.dynamicMessage = builder.dynamicMessage;
        this.errCode = builder.errCode;
        this.errMessage = builder.errMessage;
        this.fileUrl = builder.fileUrl;
        this.httpStatusCode = builder.httpStatusCode;
        this.outerFileUrl = builder.outerFileUrl;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDocParserJobResultResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return contentList
     */
    public java.util.List<ContentList> getContentList() {
        return this.contentList;
    }

    /**
     * @return dynamicCode
     */
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    /**
     * @return dynamicMessage
     */
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    /**
     * @return errCode
     */
    public String getErrCode() {
        return this.errCode;
    }

    /**
     * @return errMessage
     */
    public String getErrMessage() {
        return this.errMessage;
    }

    /**
     * @return fileUrl
     */
    public String getFileUrl() {
        return this.fileUrl;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return outerFileUrl
     */
    public String getOuterFileUrl() {
        return this.outerFileUrl;
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
        private java.util.List<ContentList> contentList; 
        private String dynamicCode; 
        private String dynamicMessage; 
        private String errCode; 
        private String errMessage; 
        private String fileUrl; 
        private Integer httpStatusCode; 
        private String outerFileUrl; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(DescribeDocParserJobResultResponseBody model) {
            this.contentList = model.contentList;
            this.dynamicCode = model.dynamicCode;
            this.dynamicMessage = model.dynamicMessage;
            this.errCode = model.errCode;
            this.errMessage = model.errMessage;
            this.fileUrl = model.fileUrl;
            this.httpStatusCode = model.httpStatusCode;
            this.outerFileUrl = model.outerFileUrl;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The complete text parsing content.</p>
         * <blockquote>
         * <p>If the task type is content, ContentList splits the original document by page. Each page has a separate Markdown text entry.</p>
         * </blockquote>
         */
        public Builder contentList(java.util.List<ContentList> contentList) {
            this.contentList = contentList;
            return this;
        }

        /**
         * <p>The dynamic error code. This parameter will be deprecated.</p>
         * 
         * <strong>example:</strong>
         * <p>403</p>
         */
        public Builder dynamicCode(String dynamicCode) {
            this.dynamicCode = dynamicCode;
            return this;
        }

        /**
         * <p>The dynamic error message used to replace the <strong>%s</strong> variable in the <strong>ErrMessage</strong> response parameter.</p>
         * <blockquote>
         * <p>If <strong>ErrMessage</strong> returns <strong>The Value of Input Parameter %s is not valid</strong> and <strong>DynamicMessage</strong> returns <strong>DtsJobId</strong>, the request parameter <strong>DtsJobId</strong> is invalid.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>DtsJobId</p>
         */
        public Builder dynamicMessage(String dynamicMessage) {
            this.dynamicMessage = dynamicMessage;
            return this;
        }

        /**
         * <p>The error code returned when the call fails.</p>
         * 
         * <strong>example:</strong>
         * <p>InternalError</p>
         */
        public Builder errCode(String errCode) {
            this.errCode = errCode;
            return this;
        }

        /**
         * <p>The error message returned when the call fails.</p>
         * 
         * <strong>example:</strong>
         * <p>The request processing has failed due to some unknown error.</p>
         */
        public Builder errMessage(String errMessage) {
            this.errMessage = errMessage;
            return this;
        }

        /**
         * <p>The OSS download URL of the file.</p>
         * <blockquote>
         * <p>If the task type is zip, this field returns the download URL of the zip package. The URL is valid for 30 minutes.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p><a href="https://oss-cn-hangzhou.aliyuncs.com/806a_209584525031252870_078f1180f27b4c069c0f271758aa">https://oss-cn-hangzhou.aliyuncs.com/806a_209584525031252870_078f1180f27b4c069c0f271758aa</a>****</p>
         */
        public Builder fileUrl(String fileUrl) {
            this.fileUrl = fileUrl;
            return this;
        }

        /**
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The public OSS download URL of the file.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://oss-cn-hangzhou.aliyuncs.com/806a_209584525031252870_078f1180f27b4c069c0f271758aa">https://oss-cn-hangzhou.aliyuncs.com/806a_209584525031252870_078f1180f27b4c069c0f271758aa</a>****</p>
         */
        public Builder outerFileUrl(String outerFileUrl) {
            this.outerFileUrl = outerFileUrl;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>C166D79D-436B-45F0-B5A5-25E1959F****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeDocParserJobResultResponseBody build() {
            return new DescribeDocParserJobResultResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDocParserJobResultResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDocParserJobResultResponseBody</p>
     */
    public static class ContentList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("PageNumber")
        private Integer pageNumber;

        private ContentList(Builder builder) {
            this.content = builder.content;
            this.pageNumber = builder.pageNumber;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ContentList create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return pageNumber
         */
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public static final class Builder {
            private String content; 
            private Integer pageNumber; 

            private Builder() {
            } 

            private Builder(ContentList model) {
                this.content = model.content;
                this.pageNumber = model.pageNumber;
            } 

            /**
             * <p>The text content of the corresponding page, which is the complete Markdown text after parsing.</p>
             * 
             * <strong>example:</strong>
             * <ul>
             * <li>Demo * ** Demo title **</li>
             * </ul>
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * <p>The page number.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder pageNumber(Integer pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            public ContentList build() {
                return new ContentList(this);
            } 

        } 

    }
}
