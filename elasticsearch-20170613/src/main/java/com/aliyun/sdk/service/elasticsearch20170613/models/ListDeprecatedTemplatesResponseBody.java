// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDeprecatedTemplatesResponseBody} extends {@link TeaModel}
 *
 * <p>ListDeprecatedTemplatesResponseBody</p>
 */
public class ListDeprecatedTemplatesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Headers")
    private Headers headers;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private java.util.List < Result> result;

    private ListDeprecatedTemplatesResponseBody(Builder builder) {
        this.headers = builder.headers;
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDeprecatedTemplatesResponseBody create() {
        return builder().build();
    }

    /**
     * @return headers
     */
    public Headers getHeaders() {
        return this.headers;
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
    public java.util.List < Result> getResult() {
        return this.result;
    }

    public static final class Builder {
        private Headers headers; 
        private String requestId; 
        private java.util.List < Result> result; 

        /**
         * Headers.
         */
        public Builder headers(Headers headers) {
            this.headers = headers;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Result.
         */
        public Builder result(java.util.List < Result> result) {
            this.result = result;
            return this;
        }

        public ListDeprecatedTemplatesResponseBody build() {
            return new ListDeprecatedTemplatesResponseBody(this);
        } 

    } 

    public static class Headers extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("X-Total-Count")
        private Long xTotalCount;

        private Headers(Builder builder) {
            this.xTotalCount = builder.xTotalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Headers create() {
            return builder().build();
        }

        /**
         * @return xTotalCount
         */
        public Long getXTotalCount() {
            return this.xTotalCount;
        }

        public static final class Builder {
            private Long xTotalCount; 

            /**
             * X-Total-Count.
             */
            public Builder xTotalCount(Long xTotalCount) {
                this.xTotalCount = xTotalCount;
                return this;
            }

            public Headers build() {
                return new Headers(this);
            } 

        } 

    }
    public static class Template extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("aliases")
        private String aliases;

        @com.aliyun.core.annotation.NameInMap("mappings")
        private String mappings;

        @com.aliyun.core.annotation.NameInMap("settings")
        private String settings;

        private Template(Builder builder) {
            this.aliases = builder.aliases;
            this.mappings = builder.mappings;
            this.settings = builder.settings;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Template create() {
            return builder().build();
        }

        /**
         * @return aliases
         */
        public String getAliases() {
            return this.aliases;
        }

        /**
         * @return mappings
         */
        public String getMappings() {
            return this.mappings;
        }

        /**
         * @return settings
         */
        public String getSettings() {
            return this.settings;
        }

        public static final class Builder {
            private String aliases; 
            private String mappings; 
            private String settings; 

            /**
             * aliases.
             */
            public Builder aliases(String aliases) {
                this.aliases = aliases;
                return this;
            }

            /**
             * mappings.
             */
            public Builder mappings(String mappings) {
                this.mappings = mappings;
                return this;
            }

            /**
             * settings.
             */
            public Builder settings(String settings) {
                this.settings = settings;
                return this;
            }

            public Template build() {
                return new Template(this);
            } 

        } 

    }
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("dataStream")
        private Boolean dataStream;

        @com.aliyun.core.annotation.NameInMap("indexPatterns")
        private java.util.List < String > indexPatterns;

        @com.aliyun.core.annotation.NameInMap("indexTemplate")
        private String indexTemplate;

        @com.aliyun.core.annotation.NameInMap("order")
        private Long order;

        @com.aliyun.core.annotation.NameInMap("template")
        private Template template;

        @com.aliyun.core.annotation.NameInMap("version")
        private String version;

        private Result(Builder builder) {
            this.dataStream = builder.dataStream;
            this.indexPatterns = builder.indexPatterns;
            this.indexTemplate = builder.indexTemplate;
            this.order = builder.order;
            this.template = builder.template;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return dataStream
         */
        public Boolean getDataStream() {
            return this.dataStream;
        }

        /**
         * @return indexPatterns
         */
        public java.util.List < String > getIndexPatterns() {
            return this.indexPatterns;
        }

        /**
         * @return indexTemplate
         */
        public String getIndexTemplate() {
            return this.indexTemplate;
        }

        /**
         * @return order
         */
        public Long getOrder() {
            return this.order;
        }

        /**
         * @return template
         */
        public Template getTemplate() {
            return this.template;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private Boolean dataStream; 
            private java.util.List < String > indexPatterns; 
            private String indexTemplate; 
            private Long order; 
            private Template template; 
            private String version; 

            /**
             * dataStream.
             */
            public Builder dataStream(Boolean dataStream) {
                this.dataStream = dataStream;
                return this;
            }

            /**
             * indexPatterns.
             */
            public Builder indexPatterns(java.util.List < String > indexPatterns) {
                this.indexPatterns = indexPatterns;
                return this;
            }

            /**
             * indexTemplate.
             */
            public Builder indexTemplate(String indexTemplate) {
                this.indexTemplate = indexTemplate;
                return this;
            }

            /**
             * order.
             */
            public Builder order(Long order) {
                this.order = order;
                return this;
            }

            /**
             * template.
             */
            public Builder template(Template template) {
                this.template = template;
                return this;
            }

            /**
             * version.
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
