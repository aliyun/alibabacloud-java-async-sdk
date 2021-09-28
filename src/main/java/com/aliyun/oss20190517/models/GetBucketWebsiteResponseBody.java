// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link GetBucketWebsiteResponseBody} extends {@link TeaModel}
 *
 * <p>GetBucketWebsiteResponseBody</p>
 */
public class GetBucketWebsiteResponseBody extends TeaModel {
    @ParentIgnore("WebsiteConfiguration")
    @NameInMap("IndexDocument")
    private IndexDocument indexDocument;

    @ParentIgnore("WebsiteConfiguration")
    @NameInMap("ErrorDocument")
    private ErrorDocument errorDocument;


    private GetBucketWebsiteResponseBody(Builder builder) {
        this.indexDocument = builder.indexDocument;
        this.errorDocument = builder.errorDocument;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetBucketWebsiteResponseBody create() {
        return builder().build();
    }

    /**
     * @return indexDocument
     */
    public IndexDocument indexDocument() {
        return this.indexDocument;
    }

    /**
     * @return errorDocument
     */
    public ErrorDocument errorDocument() {
        return this.errorDocument;
    }

    public static final class Builder {
        private IndexDocument indexDocument; 
        private ErrorDocument errorDocument; 

        /**
         * <p>IndexDocument.</p>
         */
        public Builder indexDocument(IndexDocument indexDocument) {
            this.indexDocument = indexDocument;
            return this;
        }

        /**
         * <p>ErrorDocument.</p>
         */
        public Builder errorDocument(ErrorDocument errorDocument) {
            this.errorDocument = errorDocument;
            return this;
        }

        public GetBucketWebsiteResponseBody build() {
            return new GetBucketWebsiteResponseBody(this);
        } 

    } 

    public static class IndexDocument extends TeaModel {
        @NameInMap("Suffix")
        private String suffix;


        private IndexDocument(Builder builder) {
            this.suffix = builder.suffix;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IndexDocument create() {
            return builder().build();
        }

        /**
         * @return suffix
         */
        public String suffix() {
            return this.suffix;
        }

        public static final class Builder {
            private String suffix; 

            /**
             * <p>Suffix.</p>
             */
            public Builder suffix(String suffix) {
                this.suffix = suffix;
                return this;
            }

            public IndexDocument build() {
                return new IndexDocument(this);
            } 

        } 

    }
    public static class ErrorDocument extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("HttpStatus")
        private String httpStatus;


        private ErrorDocument(Builder builder) {
            this.key = builder.key;
            this.httpStatus = builder.httpStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ErrorDocument create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String key() {
            return this.key;
        }

        /**
         * @return httpStatus
         */
        public String httpStatus() {
            return this.httpStatus;
        }

        public static final class Builder {
            private String key; 
            private String httpStatus; 

            /**
             * <p>Key.</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>HttpStatus.</p>
             */
            public Builder httpStatus(String httpStatus) {
                this.httpStatus = httpStatus;
                return this;
            }

            public ErrorDocument build() {
                return new ErrorDocument(this);
            } 

        } 

    }
}
