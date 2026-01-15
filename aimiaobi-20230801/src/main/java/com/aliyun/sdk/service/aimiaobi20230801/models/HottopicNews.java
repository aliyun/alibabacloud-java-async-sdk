// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aimiaobi20230801.models;

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
 * {@link HottopicNews} extends {@link TeaModel}
 *
 * <p>HottopicNews</p>
 */
public class HottopicNews extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Comments")
    private java.util.List<Comments> comments;

    @com.aliyun.core.annotation.NameInMap("Content")
    private String content;

    @com.aliyun.core.annotation.NameInMap("Title")
    private String title;

    @com.aliyun.core.annotation.NameInMap("Url")
    private String url;

    private HottopicNews(Builder builder) {
        this.comments = builder.comments;
        this.content = builder.content;
        this.title = builder.title;
        this.url = builder.url;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static HottopicNews create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return comments
     */
    public java.util.List<Comments> getComments() {
        return this.comments;
    }

    /**
     * @return content
     */
    public String getContent() {
        return this.content;
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

    public static final class Builder {
        private java.util.List<Comments> comments; 
        private String content; 
        private String title; 
        private String url; 

        private Builder() {
        } 

        private Builder(HottopicNews model) {
            this.comments = model.comments;
            this.content = model.content;
            this.title = model.title;
            this.url = model.url;
        } 

        /**
         * Comments.
         */
        public Builder comments(java.util.List<Comments> comments) {
            this.comments = comments;
            return this;
        }

        /**
         * Content.
         */
        public Builder content(String content) {
            this.content = content;
            return this;
        }

        /**
         * Title.
         */
        public Builder title(String title) {
            this.title = title;
            return this;
        }

        /**
         * Url.
         */
        public Builder url(String url) {
            this.url = url;
            return this;
        }

        public HottopicNews build() {
            return new HottopicNews(this);
        } 

    } 

    /**
     * 
     * {@link HottopicNews} extends {@link TeaModel}
     *
     * <p>HottopicNews</p>
     */
    public static class Comments extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Text")
        private String text;

        private Comments(Builder builder) {
            this.text = builder.text;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Comments create() {
            return builder().build();
        }

        /**
         * @return text
         */
        public String getText() {
            return this.text;
        }

        public static final class Builder {
            private String text; 

            private Builder() {
            } 

            private Builder(Comments model) {
                this.text = model.text;
            } 

            /**
             * Text.
             */
            public Builder text(String text) {
                this.text = text;
                return this;
            }

            public Comments build() {
                return new Comments(this);
            } 

        } 

    }
}
