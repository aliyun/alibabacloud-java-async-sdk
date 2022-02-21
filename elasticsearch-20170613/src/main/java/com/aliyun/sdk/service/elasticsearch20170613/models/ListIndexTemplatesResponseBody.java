// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListIndexTemplatesResponseBody} extends {@link TeaModel}
 *
 * <p>ListIndexTemplatesResponseBody</p>
 */
public class ListIndexTemplatesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private java.util.List < Result> result;

    private ListIndexTemplatesResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListIndexTemplatesResponseBody create() {
        return builder().build();
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
        private String requestId; 
        private java.util.List < Result> result; 

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

        public ListIndexTemplatesResponseBody build() {
            return new ListIndexTemplatesResponseBody(this);
        } 

    } 

    public static class Template extends TeaModel {
        @NameInMap("aliases")
        private String aliases;

        @NameInMap("mappings")
        private String mappings;

        @NameInMap("settings")
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
        @NameInMap("dataStream")
        private Boolean dataStream;

        @NameInMap("ilmPolicy")
        private String ilmPolicy;

        @NameInMap("indexPatterns")
        private java.util.List < String > indexPatterns;

        @NameInMap("indexTemplate")
        private String indexTemplate;

        @NameInMap("priority")
        private Integer priority;

        @NameInMap("template")
        private Template template;

        private Result(Builder builder) {
            this.dataStream = builder.dataStream;
            this.ilmPolicy = builder.ilmPolicy;
            this.indexPatterns = builder.indexPatterns;
            this.indexTemplate = builder.indexTemplate;
            this.priority = builder.priority;
            this.template = builder.template;
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
         * @return ilmPolicy
         */
        public String getIlmPolicy() {
            return this.ilmPolicy;
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
         * @return priority
         */
        public Integer getPriority() {
            return this.priority;
        }

        /**
         * @return template
         */
        public Template getTemplate() {
            return this.template;
        }

        public static final class Builder {
            private Boolean dataStream; 
            private String ilmPolicy; 
            private java.util.List < String > indexPatterns; 
            private String indexTemplate; 
            private Integer priority; 
            private Template template; 

            /**
             * dataStream.
             */
            public Builder dataStream(Boolean dataStream) {
                this.dataStream = dataStream;
                return this;
            }

            /**
             * ilmPolicy.
             */
            public Builder ilmPolicy(String ilmPolicy) {
                this.ilmPolicy = ilmPolicy;
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
             * priority.
             */
            public Builder priority(Integer priority) {
                this.priority = priority;
                return this;
            }

            /**
             * template.
             */
            public Builder template(Template template) {
                this.template = template;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
