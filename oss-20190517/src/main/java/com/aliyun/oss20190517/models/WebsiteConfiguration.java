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
    @NameInMap("ErrorDocument")
    private ErrorDocument errorDocument;

    @NameInMap("IndexDocument")
    private IndexDocument indexDocument;

    @ParentIgnore("RoutingRules")
    @NameInMap("RoutingRule")
    private java.util.List < RoutingRule > routingRules;


    private WebsiteConfiguration(Builder builder) {
        this.errorDocument = builder.errorDocument;
        this.indexDocument = builder.indexDocument;
        this.routingRules = builder.routingRules;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static WebsiteConfiguration create() {
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
         * <p>description</p>
         */
        public Builder errorDocument(ErrorDocument errorDocument) {
            this.errorDocument = errorDocument;
            return this;
        }

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
        public Builder routingRules(java.util.List < RoutingRule > routingRules) {
            this.routingRules = routingRules;
            return this;
        }

        public WebsiteConfiguration build() {
            return new WebsiteConfiguration(this);
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
             * <p>description</p>
             */
            public Builder httpStatus(String httpStatus) {
                this.httpStatus = httpStatus;
                return this;
            }

            /**
             * <p>description</p>
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

        @NameInMap("SupportSubDir")
        private Boolean supportSubDir;

        @NameInMap("Type")
        private String type;


        private IndexDocument(Builder builder) {
            this.suffix = builder.suffix;
            this.supportSubDir = builder.supportSubDir;
            this.type = builder.type;
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

        /**
         * @return supportSubDir
         */
        public Boolean getSupportSubDir() {
            return this.supportSubDir;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String suffix; 
            private Boolean supportSubDir; 
            private String type; 

            /**
             * <p>description</p>
             */
            public Builder suffix(String suffix) {
                this.suffix = suffix;
                return this;
            }

            /**
             * <p>description</p>
             */
            public Builder supportSubDir(Boolean supportSubDir) {
                this.supportSubDir = supportSubDir;
                return this;
            }

            /**
             * <p>description</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public IndexDocument build() {
                return new IndexDocument(this);
            } 

        } 

    }
}
