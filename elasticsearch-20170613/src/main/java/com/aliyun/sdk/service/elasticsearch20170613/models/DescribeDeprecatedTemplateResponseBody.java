// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

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
 * {@link DescribeDeprecatedTemplateResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDeprecatedTemplateResponseBody</p>
 */
public class DescribeDeprecatedTemplateResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private Result result;

    private DescribeDeprecatedTemplateResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDeprecatedTemplateResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
    public Result getResult() {
        return this.result;
    }

    public static final class Builder {
        private String requestId; 
        private Result result; 

        private Builder() {
        } 

        private Builder(DescribeDeprecatedTemplateResponseBody model) {
            this.requestId = model.requestId;
            this.result = model.result;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>F99407AB-2FA9-489E-A259-40CF6DCC47D9</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The result information.</p>
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        public DescribeDeprecatedTemplateResponseBody build() {
            return new DescribeDeprecatedTemplateResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDeprecatedTemplateResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDeprecatedTemplateResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(Template model) {
                this.aliases = model.aliases;
                this.mappings = model.mappings;
                this.settings = model.settings;
            } 

            /**
             * <p>The alias configuration.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;{}&quot;</p>
             */
            public Builder aliases(String aliases) {
                this.aliases = aliases;
                return this;
            }

            /**
             * <p>The mappings configuration of the index template.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;{\&quot;properties\&quot;:{\&quot;created_at\&quot;:{\&quot;format\&quot;:\&quot;EEE MMM dd HH:mm:ss Z yyyy\&quot;,\&quot;type\&quot;:\&quot;date\&quot;},\&quot;host_name\&quot;:{\&quot;type\&quot;:\&quot;keyword\&quot;}}}&quot;</p>
             */
            public Builder mappings(String mappings) {
                this.mappings = mappings;
                return this;
            }

            /**
             * <p>The settings configuration of the index template.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;{\&quot;index.number_of_shards\&quot;:\&quot;1\&quot;}&quot;</p>
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
    /**
     * 
     * {@link DescribeDeprecatedTemplateResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDeprecatedTemplateResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("dataStream")
        private Boolean dataStream;

        @com.aliyun.core.annotation.NameInMap("indexPatterns")
        private java.util.List<String> indexPatterns;

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
        public java.util.List<String> getIndexPatterns() {
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
            private java.util.List<String> indexPatterns; 
            private String indexTemplate; 
            private Long order; 
            private Template template; 
            private String version; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.dataStream = model.dataStream;
                this.indexPatterns = model.indexPatterns;
                this.indexTemplate = model.indexTemplate;
                this.order = model.order;
                this.template = model.template;
                this.version = model.version;
            } 

            /**
             * <p>Indicates whether automatic creation of a data stream is enabled at the same time. Valid values:</p>
             * <ul>
             * <li>true: Yes.</li>
             * <li>false: No.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder dataStream(Boolean dataStream) {
                this.dataStream = dataStream;
                return this;
            }

            /**
             * <p>The index pattern information.</p>
             */
            public Builder indexPatterns(java.util.List<String> indexPatterns) {
                this.indexPatterns = indexPatterns;
                return this;
            }

            /**
             * <p>The index template name.</p>
             * 
             * <strong>example:</strong>
             * <p>openstore-index-template</p>
             */
            public Builder indexTemplate(String indexTemplate) {
                this.indexTemplate = indexTemplate;
                return this;
            }

            /**
             * <p>The priority.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder order(Long order) {
                this.order = order;
                return this;
            }

            /**
             * <p>The index template configuration information.</p>
             */
            public Builder template(Template template) {
                this.template = template;
                return this;
            }

            /**
             * <p>The version of the index template.</p>
             * 
             * <strong>example:</strong>
             * <p>70000</p>
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
