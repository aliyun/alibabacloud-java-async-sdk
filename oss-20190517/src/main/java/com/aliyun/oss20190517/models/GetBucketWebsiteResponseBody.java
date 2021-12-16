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
    @NameInMap("ErrorDocument")
    private ErrorDocument errorDocument;

    @ParentIgnore("WebsiteConfiguration")
    @NameInMap("IndexDocument")
    private IndexDocument indexDocument;

    @ParentIgnore("WebsiteConfiguration,RoutingRules")
    @NameInMap("RoutingRule")
    private java.util.List < RoutingRule > routingRules;


    private GetBucketWebsiteResponseBody(Builder builder) {
        this.errorDocument = builder.errorDocument;
        this.indexDocument = builder.indexDocument;
        this.routingRules = builder.routingRules;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetBucketWebsiteResponseBody create() {
        return builder().build();
    }

    /**
     * @return errorDocument
     */
    public ErrorDocument getErrorDocument() {
        return this.errorDocument;
    }

    /**
     * @return indexDocument
     */
    public IndexDocument getIndexDocument() {
        return this.indexDocument;
    }

    /**
     * @return routingRules
     */
    public java.util.List < RoutingRule > getRoutingRules() {
        return this.routingRules;
    }

    public static final class Builder {
        private ErrorDocument errorDocument; 
        private IndexDocument indexDocument; 
        private java.util.List < RoutingRule > routingRules; 

        /**
         * <p>ErrorDocument.</p>
         */
        public Builder errorDocument(ErrorDocument errorDocument) {
            this.errorDocument = errorDocument;
            return this;
        }

        /**
         * <p>IndexDocument.</p>
         */
        public Builder indexDocument(IndexDocument indexDocument) {
            this.indexDocument = indexDocument;
            return this;
        }

        /**
         * <p>RoutingRule.</p>
         */
        public Builder routingRules(java.util.List < RoutingRule > routingRules) {
            this.routingRules = routingRules;
            return this;
        }

        public GetBucketWebsiteResponseBody build() {
            return new GetBucketWebsiteResponseBody(this);
        } 

    } 

    public static class ErrorDocument extends TeaModel {
        @NameInMap("HttpStatus")
        private String httpStatus;

        @NameInMap("Key")
        private String key;


        private ErrorDocument(Builder builder) {
            this.httpStatus = builder.httpStatus;
            this.key = builder.key;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ErrorDocument create() {
            return builder().build();
        }

        /**
         * @return httpStatus
         */
        public String getHttpStatus() {
            return this.httpStatus;
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        public static final class Builder {
            private String httpStatus; 
            private String key; 

            /**
             * <p>HttpStatus.</p>
             */
            public Builder httpStatus(String httpStatus) {
                this.httpStatus = httpStatus;
                return this;
            }

            /**
             * <p>Key.</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            public ErrorDocument build() {
                return new ErrorDocument(this);
            } 

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
        public String getSuffix() {
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
}
