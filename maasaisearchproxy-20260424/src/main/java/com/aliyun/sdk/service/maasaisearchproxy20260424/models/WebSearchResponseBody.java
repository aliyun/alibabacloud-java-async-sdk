// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.maasaisearchproxy20260424.models;

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
 * {@link WebSearchResponseBody} extends {@link TeaModel}
 *
 * <p>WebSearchResponseBody</p>
 */
public class WebSearchResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    private WebSearchResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static WebSearchResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public Integer getCode() {
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

    public static final class Builder {
        private Integer code; 
        private Data data; 
        private String message; 

        private Builder() {
        } 

        private Builder(WebSearchResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
        } 

        /**
         * code.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        public WebSearchResponseBody build() {
            return new WebSearchResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link WebSearchResponseBody} extends {@link TeaModel}
     *
     * <p>WebSearchResponseBody</p>
     */
    public static class Source extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("domain")
        private String domain;

        @com.aliyun.core.annotation.NameInMap("favicon")
        private String favicon;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        private Source(Builder builder) {
            this.domain = builder.domain;
            this.favicon = builder.favicon;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Source create() {
            return builder().build();
        }

        /**
         * @return domain
         */
        public String getDomain() {
            return this.domain;
        }

        /**
         * @return favicon
         */
        public String getFavicon() {
            return this.favicon;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String domain; 
            private String favicon; 
            private String name; 

            private Builder() {
            } 

            private Builder(Source model) {
                this.domain = model.domain;
                this.favicon = model.favicon;
                this.name = model.name;
            } 

            /**
             * domain.
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * favicon.
             */
            public Builder favicon(String favicon) {
                this.favicon = favicon;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public Source build() {
                return new Source(this);
            } 

        } 

    }
    /**
     * 
     * {@link WebSearchResponseBody} extends {@link TeaModel}
     *
     * <p>WebSearchResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("date")
        private String date;

        @com.aliyun.core.annotation.NameInMap("snippet")
        private String snippet;

        @com.aliyun.core.annotation.NameInMap("source")
        private Source source;

        @com.aliyun.core.annotation.NameInMap("title")
        private String title;

        @com.aliyun.core.annotation.NameInMap("url")
        private String url;

        private Result(Builder builder) {
            this.date = builder.date;
            this.snippet = builder.snippet;
            this.source = builder.source;
            this.title = builder.title;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return date
         */
        public String getDate() {
            return this.date;
        }

        /**
         * @return snippet
         */
        public String getSnippet() {
            return this.snippet;
        }

        /**
         * @return source
         */
        public Source getSource() {
            return this.source;
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
            private String date; 
            private String snippet; 
            private Source source; 
            private String title; 
            private String url; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.date = model.date;
                this.snippet = model.snippet;
                this.source = model.source;
                this.title = model.title;
                this.url = model.url;
            } 

            /**
             * date.
             */
            public Builder date(String date) {
                this.date = date;
                return this;
            }

            /**
             * snippet.
             */
            public Builder snippet(String snippet) {
                this.snippet = snippet;
                return this;
            }

            /**
             * source.
             */
            public Builder source(Source source) {
                this.source = source;
                return this;
            }

            /**
             * title.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            /**
             * url.
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
    /**
     * 
     * {@link WebSearchResponseBody} extends {@link TeaModel}
     *
     * <p>WebSearchResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("result")
        private java.util.List<Result> result;

        @com.aliyun.core.annotation.NameInMap("total")
        private Integer total;

        private Data(Builder builder) {
            this.result = builder.result;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return result
         */
        public java.util.List<Result> getResult() {
            return this.result;
        }

        /**
         * @return total
         */
        public Integer getTotal() {
            return this.total;
        }

        public static final class Builder {
            private java.util.List<Result> result; 
            private Integer total; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.result = model.result;
                this.total = model.total;
            } 

            /**
             * result.
             */
            public Builder result(java.util.List<Result> result) {
                this.result = result;
                return this;
            }

            /**
             * total.
             */
            public Builder total(Integer total) {
                this.total = total;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
