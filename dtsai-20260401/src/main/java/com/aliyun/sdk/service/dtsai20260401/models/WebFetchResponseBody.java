// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dtsai20260401.models;

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
 * {@link WebFetchResponseBody} extends {@link TeaModel}
 *
 * <p>WebFetchResponseBody</p>
 */
public class WebFetchResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Content")
    private String content;

    @com.aliyun.core.annotation.NameInMap("ContentFormat")
    private String contentFormat;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("Title")
    private String title;

    @com.aliyun.core.annotation.NameInMap("Url")
    private String url;

    @com.aliyun.core.annotation.NameInMap("UrlType")
    private String urlType;

    private WebFetchResponseBody(Builder builder) {
        this.content = builder.content;
        this.contentFormat = builder.contentFormat;
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.httpStatusCode = builder.httpStatusCode;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.title = builder.title;
        this.url = builder.url;
        this.urlType = builder.urlType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static WebFetchResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return content
     */
    public String getContent() {
        return this.content;
    }

    /**
     * @return contentFormat
     */
    public String getContentFormat() {
        return this.contentFormat;
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
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
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

    /**
     * @return title
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * @return url
     */
    public String getUrl() {
        return this.url;
    }

    /**
     * @return urlType
     */
    public String getUrlType() {
        return this.urlType;
    }

    public static final class Builder {
        private String content; 
        private String contentFormat; 
        private String errorCode; 
        private String errorMessage; 
        private Integer httpStatusCode; 
        private String requestId; 
        private Boolean success; 
        private String title; 
        private String url; 
        private String urlType; 

        private Builder() {
        } 

        private Builder(WebFetchResponseBody model) {
            this.content = model.content;
            this.contentFormat = model.contentFormat;
            this.errorCode = model.errorCode;
            this.errorMessage = model.errorMessage;
            this.httpStatusCode = model.httpStatusCode;
            this.requestId = model.requestId;
            this.success = model.success;
            this.title = model.title;
            this.url = model.url;
            this.urlType = model.urlType;
        } 

        /**
         * <p>The web page content.</p>
         * 
         * <strong>example:</strong>
         * <p>Spring Boot makes it easy to create stand-alone, production-grade Spring based Applications.</p>
         */
        public Builder content(String content) {
            this.content = content;
            return this;
        }

        /**
         * <p>The actual output format. Valid values:</p>
         * <ul>
         * <li><p><strong>markdown</strong>: Markdown format.</p>
         * </li>
         * <li><p><strong>html</strong>: HTML format.</p>
         * </li>
         * <li><p><strong>text</strong>: plain text format.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>markdown</p>
         */
        public Builder contentFormat(String contentFormat) {
            this.contentFormat = contentFormat;
            return this;
        }

        /**
         * <p>The error code.</p>
         * 
         * <strong>example:</strong>
         * <p>ErrorMessage Code</p>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>ErrorMessage Example</p>
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
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
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>A30D0930-xxxx-xxxx-xxxx-C2C661CC8B58</p>
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

        /**
         * <p>The web page title.</p>
         * 
         * <strong>example:</strong>
         * <p>Spring Boot</p>
         */
        public Builder title(String title) {
            this.title = title;
            return this;
        }

        /**
         * <p>The URL of the web page.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://xxxx/projects/spring-boot">https://xxxx/projects/spring-boot</a></p>
         */
        public Builder url(String url) {
            this.url = url;
            return this;
        }

        /**
         * <p>The URL classification result. Valid values:</p>
         * <ul>
         * <li><strong>static_html</strong>: Static HTML page.</li>
         * <li><strong>dynamic_js</strong>: Single-page application (SPA) page that requires JavaScript rendering.</li>
         * <li><strong>audio</strong>: Audio file.</li>
         * <li><strong>video</strong>: Video file.</li>
         * <li><strong>document</strong>: Document file (PDF, Word, PPT, or Excel).</li>
         * <li><strong>unknown</strong>: Unrecognizable.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>static_html</p>
         */
        public Builder urlType(String urlType) {
            this.urlType = urlType;
            return this;
        }

        public WebFetchResponseBody build() {
            return new WebFetchResponseBody(this);
        } 

    } 

}
