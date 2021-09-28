// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link WebsiteConfiguration} extends {@link TeaModel}
 *
 * <p>WebsiteConfiguration</p>
 */
public class WebsiteConfiguration extends TeaModel {
    @NameInMap("IndexDocument")
    private IndexDocument indexDocument;

    @NameInMap("ErrorDocument")
    private ErrorDocument errorDocument;


    private WebsiteConfiguration(Builder builder) {
        this.indexDocument = builder.indexDocument;
        this.errorDocument = builder.errorDocument;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static WebsiteConfiguration create() {
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
         * <p>description</p>
         */
        public Builder indexDocument(IndexDocument indexDocument) {
            this.indexDocument = indexDocument;
            return this;
        }

        /**
         * <p>description</p>
         */
        public Builder errorDocument(ErrorDocument errorDocument) {
            this.errorDocument = errorDocument;
            return this;
        }

        public WebsiteConfiguration build() {
            return new WebsiteConfiguration(this);
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
             * <p>description</p>
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
             * <p>description</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>description</p>
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
