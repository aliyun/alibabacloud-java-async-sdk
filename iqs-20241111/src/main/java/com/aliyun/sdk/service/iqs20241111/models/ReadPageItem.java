// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iqs20241111.models;

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
 * {@link ReadPageItem} extends {@link TeaModel}
 *
 * <p>ReadPageItem</p>
 */
public class ReadPageItem extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("errorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("html")
    private String html;

    @com.aliyun.core.annotation.NameInMap("markdown")
    private String markdown;

    @com.aliyun.core.annotation.NameInMap("rawHtml")
    private String rawHtml;

    @com.aliyun.core.annotation.NameInMap("screenshot")
    private String screenshot;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("text")
    private String text;

    private ReadPageItem(Builder builder) {
        this.errorMessage = builder.errorMessage;
        this.html = builder.html;
        this.markdown = builder.markdown;
        this.rawHtml = builder.rawHtml;
        this.screenshot = builder.screenshot;
        this.statusCode = builder.statusCode;
        this.text = builder.text;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ReadPageItem create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return html
     */
    public String getHtml() {
        return this.html;
    }

    /**
     * @return markdown
     */
    public String getMarkdown() {
        return this.markdown;
    }

    /**
     * @return rawHtml
     */
    public String getRawHtml() {
        return this.rawHtml;
    }

    /**
     * @return screenshot
     */
    public String getScreenshot() {
        return this.screenshot;
    }

    /**
     * @return statusCode
     */
    public Integer getStatusCode() {
        return this.statusCode;
    }

    /**
     * @return text
     */
    public String getText() {
        return this.text;
    }

    public static final class Builder {
        private String errorMessage; 
        private String html; 
        private String markdown; 
        private String rawHtml; 
        private String screenshot; 
        private Integer statusCode; 
        private String text; 

        private Builder() {
        } 

        private Builder(ReadPageItem model) {
            this.errorMessage = model.errorMessage;
            this.html = model.html;
            this.markdown = model.markdown;
            this.rawHtml = model.rawHtml;
            this.screenshot = model.screenshot;
            this.statusCode = model.statusCode;
            this.text = model.text;
        } 

        /**
         * <p>The error related to the target URL.</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * <p>The readable HTML of the target URL.</p>
         * 
         * <strong>example:</strong>
         * <html>\\n<head><title>Example Domain</title></head>\\n<body><div>\\n<h1>Example Domain</h1>\\n<p>This domain is for use in documentation examples without needing permission. Avoid use in operations.</p>\\n<p><a href=\\"https://iana.org/domains/example\\">Learn more</a></p>\\n</div></body>\\n</html>
         */
        public Builder html(String html) {
            this.html = html;
            return this;
        }

        /**
         * <p>The Markdown content of the target URL.</p>
         * 
         * <strong>example:</strong>
         * <h1>Example Domain\nThis domain is for use in documentation examples without needing permission. Avoid use in operations.\n<a href="https://iana.org/domains/example">Learn more</a>\n</h1>
         */
        public Builder markdown(String markdown) {
            this.markdown = markdown;
            return this;
        }

        /**
         * <p>The raw HTML of the target URL.</p>
         * 
         * <strong>example:</strong>
         * <!doctype html><html lang=\\"en\\"><head><title>Example Domain</title><meta name=\\"viewport\\" content=\\"width=device-width, initial-scale=1\\"><style>body{background:#eee;width:60vw;margin:15vh auto;font-family:system-ui,sans-serif}h1{font-size:1.5em}div{opacity:0.8}a:link,a:visited{color:#348}</style><body><div><h1>Example Domain</h1><p>This domain is for use in documentation examples without needing permission. Avoid use in operations.<p><a href=\\"https://iana.org/domains/example\\">Learn more</a></div></body></html>\\n
         */
        public Builder rawHtml(String rawHtml) {
            this.rawHtml = rawHtml;
            return this;
        }

        /**
         * screenshot.
         */
        public Builder screenshot(String screenshot) {
            this.screenshot = screenshot;
            return this;
        }

        /**
         * <ol>
         * <li><p>If the request to the target site succeeds, the HTTP status code of the target URL is returned.</p>
         * </li>
         * <li><p>If the request to the target site fails, a custom error code is returned:</p>
         * <p> 2.1 4030: The target site has security restrictions, such as robots.txt or security policies.</p>
         * <p> 2.2 4080: The request timed out.</p>
         * <p> 2.3 4290: The rate limiting policy of the site was triggered.</p>
         * <p> 2.4 5010: An unknown exception occurred.</p>
         * </li>
         * </ol>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder statusCode(Integer statusCode) {
            this.statusCode = statusCode;
            return this;
        }

        /**
         * <p>The text content of the target URL.</p>
         * 
         * <strong>example:</strong>
         * <h1>Example Domain\nThis domain is for use in documentation examples without needing permission. Avoid use in operations.\nLearn more\n</h1>
         */
        public Builder text(String text) {
            this.text = text;
            return this;
        }

        public ReadPageItem build() {
            return new ReadPageItem(this);
        } 

    } 

}
