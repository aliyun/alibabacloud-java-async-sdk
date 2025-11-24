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
         * errorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * html.
         */
        public Builder html(String html) {
            this.html = html;
            return this;
        }

        /**
         * markdown.
         */
        public Builder markdown(String markdown) {
            this.markdown = markdown;
            return this;
        }

        /**
         * rawHtml.
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
         * statusCode.
         */
        public Builder statusCode(Integer statusCode) {
            this.statusCode = statusCode;
            return this;
        }

        /**
         * text.
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
