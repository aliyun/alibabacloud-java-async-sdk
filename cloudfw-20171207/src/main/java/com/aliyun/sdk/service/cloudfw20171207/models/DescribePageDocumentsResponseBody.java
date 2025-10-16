// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

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
 * {@link DescribePageDocumentsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePageDocumentsResponseBody</p>
 */
public class DescribePageDocumentsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Docs")
    private java.util.List<Docs> docs;

    @com.aliyun.core.annotation.NameInMap("ImageUrl")
    private String imageUrl;

    @com.aliyun.core.annotation.NameInMap("Module")
    private String module;

    @com.aliyun.core.annotation.NameInMap("More")
    private More more;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribePageDocumentsResponseBody(Builder builder) {
        this.docs = builder.docs;
        this.imageUrl = builder.imageUrl;
        this.module = builder.module;
        this.more = builder.more;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePageDocumentsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return docs
     */
    public java.util.List<Docs> getDocs() {
        return this.docs;
    }

    /**
     * @return imageUrl
     */
    public String getImageUrl() {
        return this.imageUrl;
    }

    /**
     * @return module
     */
    public String getModule() {
        return this.module;
    }

    /**
     * @return more
     */
    public More getMore() {
        return this.more;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<Docs> docs; 
        private String imageUrl; 
        private String module; 
        private More more; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribePageDocumentsResponseBody model) {
            this.docs = model.docs;
            this.imageUrl = model.imageUrl;
            this.module = model.module;
            this.more = model.more;
            this.requestId = model.requestId;
        } 

        /**
         * Docs.
         */
        public Builder docs(java.util.List<Docs> docs) {
            this.docs = docs;
            return this;
        }

        /**
         * ImageUrl.
         */
        public Builder imageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
            return this;
        }

        /**
         * Module.
         */
        public Builder module(String module) {
            this.module = module;
            return this;
        }

        /**
         * More.
         */
        public Builder more(More more) {
            this.more = more;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribePageDocumentsResponseBody build() {
            return new DescribePageDocumentsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribePageDocumentsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePageDocumentsResponseBody</p>
     */
    public static class Docs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Title")
        private String title;

        @com.aliyun.core.annotation.NameInMap("Url")
        private String url;

        private Docs(Builder builder) {
            this.title = builder.title;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Docs create() {
            return builder().build();
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
            private String title; 
            private String url; 

            private Builder() {
            } 

            private Builder(Docs model) {
                this.title = model.title;
                this.url = model.url;
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

            public Docs build() {
                return new Docs(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribePageDocumentsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePageDocumentsResponseBody</p>
     */
    public static class More extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Title")
        private String title;

        @com.aliyun.core.annotation.NameInMap("Url")
        private String url;

        private More(Builder builder) {
            this.title = builder.title;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static More create() {
            return builder().build();
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
            private String title; 
            private String url; 

            private Builder() {
            } 

            private Builder(More model) {
                this.title = model.title;
                this.url = model.url;
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

            public More build() {
                return new More(this);
            } 

        } 

    }
}
