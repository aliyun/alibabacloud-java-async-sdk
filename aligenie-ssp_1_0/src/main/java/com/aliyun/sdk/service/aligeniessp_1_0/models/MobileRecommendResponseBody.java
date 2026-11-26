// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligeniessp_1_0.models;

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
 * {@link MobileRecommendResponseBody} extends {@link TeaModel}
 *
 * <p>MobileRecommendResponseBody</p>
 */
public class MobileRecommendResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private java.util.List<Result> result;

    private MobileRecommendResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MobileRecommendResponseBody create() {
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
     * @return result
     */
    public java.util.List<Result> getResult() {
        return this.result;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private String requestId; 
        private java.util.List<Result> result; 

        private Builder() {
        } 

        private Builder(MobileRecommendResponseBody model) {
            this.code = model.code;
            this.message = model.message;
            this.requestId = model.requestId;
            this.result = model.result;
        } 

        /**
         * <p>Return code of the invocation</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>If an error occurs, the error message will be output.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>5C5809B4-F465-52E0-9A8B-61396F9E593B</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Request result.</p>
         */
        public Builder result(java.util.List<Result> result) {
            this.result = result;
            return this;
        }

        public MobileRecommendResponseBody build() {
            return new MobileRecommendResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link MobileRecommendResponseBody} extends {@link TeaModel}
     *
     * <p>MobileRecommendResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Authors")
        private java.util.List<String> authors;

        @com.aliyun.core.annotation.NameInMap("Cover")
        private String cover;

        @com.aliyun.core.annotation.NameInMap("RawId")
        private String rawId;

        @com.aliyun.core.annotation.NameInMap("Source")
        private String source;

        @com.aliyun.core.annotation.NameInMap("Title")
        private String title;

        private Result(Builder builder) {
            this.authors = builder.authors;
            this.cover = builder.cover;
            this.rawId = builder.rawId;
            this.source = builder.source;
            this.title = builder.title;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return authors
         */
        public java.util.List<String> getAuthors() {
            return this.authors;
        }

        /**
         * @return cover
         */
        public String getCover() {
            return this.cover;
        }

        /**
         * @return rawId
         */
        public String getRawId() {
            return this.rawId;
        }

        /**
         * @return source
         */
        public String getSource() {
            return this.source;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        public static final class Builder {
            private java.util.List<String> authors; 
            private String cover; 
            private String rawId; 
            private String source; 
            private String title; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.authors = model.authors;
                this.cover = model.cover;
                this.rawId = model.rawId;
                this.source = model.source;
                this.title = model.title;
            } 

            /**
             * <p>Author information</p>
             */
            public Builder authors(java.util.List<String> authors) {
                this.authors = authors;
                return this;
            }

            /**
             * <p>Album thumbnail image</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://img4.kuwo.cn/star/albumcover/120/78/77/1688821132.jpg">http://img4.kuwo.cn/star/albumcover/120/78/77/1688821132.jpg</a></p>
             */
            public Builder cover(String cover) {
                this.cover = cover;
                return this;
            }

            /**
             * <p>Third-party ID of the content</p>
             * 
             * <strong>example:</strong>
             * <p>550144364</p>
             */
            public Builder rawId(String rawId) {
                this.rawId = rawId;
                return this;
            }

            /**
             * <p>Source of the content</p>
             * 
             * <strong>example:</strong>
             * <p>KG</p>
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            /**
             * <p>Content title</p>
             * 
             * <strong>example:</strong>
             * <p>稻香</p>
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
