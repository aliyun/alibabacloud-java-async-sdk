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
 * {@link ListIndexTemplatesResponseBody} extends {@link TeaModel}
 *
 * <p>ListIndexTemplatesResponseBody</p>
 */
public class ListIndexTemplatesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private java.util.List<Result> result;

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
    public java.util.List<Result> getResult() {
        return this.result;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<Result> result; 

        private Builder() {
        } 

        private Builder(ListIndexTemplatesResponseBody model) {
            this.requestId = model.requestId;
            this.result = model.result;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>F99407AB-2FA9-489E-A259-40CF6DCC****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The index template list information.</p>
         */
        public Builder result(java.util.List<Result> result) {
            this.result = result;
            return this;
        }

        public ListIndexTemplatesResponseBody build() {
            return new ListIndexTemplatesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListIndexTemplatesResponseBody} extends {@link TeaModel}
     *
     * <p>ListIndexTemplatesResponseBody</p>
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
             * <p>The aliases configuration.</p>
             * 
             * <strong>example:</strong>
             * <p>{\&quot;index.number_of_shards\&quot;:\&quot;1\&quot;}</p>
             */
            public Builder aliases(String aliases) {
                this.aliases = aliases;
                return this;
            }

            /**
             * <p>The mappings configuration.</p>
             * 
             * <strong>example:</strong>
             * <p>{\&quot;properties\&quot;:{\&quot;created_at\&quot;:{\&quot;format\&quot;:\&quot;EEE MMM dd HH:mm:ss Z yyyy\&quot;,\&quot;type\&quot;:\&quot;date\&quot;},\&quot;host_name\&quot;:{\&quot;type\&quot;:\&quot;keyword\&quot;}}}</p>
             */
            public Builder mappings(String mappings) {
                this.mappings = mappings;
                return this;
            }

            /**
             * <p>The settings configuration.</p>
             * 
             * <strong>example:</strong>
             * <p>{\&quot;mydata\&quot;:{}}</p>
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
     * {@link ListIndexTemplatesResponseBody} extends {@link TeaModel}
     *
     * <p>ListIndexTemplatesResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("dataStream")
        private Boolean dataStream;

        @com.aliyun.core.annotation.NameInMap("ilmPolicy")
        private String ilmPolicy;

        @com.aliyun.core.annotation.NameInMap("indexPatterns")
        private java.util.List<String> indexPatterns;

        @com.aliyun.core.annotation.NameInMap("indexTemplate")
        private String indexTemplate;

        @com.aliyun.core.annotation.NameInMap("priority")
        private Integer priority;

        @com.aliyun.core.annotation.NameInMap("template")
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
            private java.util.List<String> indexPatterns; 
            private String indexTemplate; 
            private Integer priority; 
            private Template template; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.dataStream = model.dataStream;
                this.ilmPolicy = model.ilmPolicy;
                this.indexPatterns = model.indexPatterns;
                this.indexTemplate = model.indexTemplate;
                this.priority = model.priority;
                this.template = model.template;
            } 

            /**
             * <p>Indicates whether the data stream is enabled. Valid values:</p>
             * <ul>
             * <li><p>true: Enabled.</p>
             * </li>
             * <li><p>false (default): Not enabled.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder dataStream(Boolean dataStream) {
                this.dataStream = dataStream;
                return this;
            }

            /**
             * <p>The index lifecycle policy name.</p>
             * 
             * <strong>example:</strong>
             * <p>my_ilm_policy</p>
             */
            public Builder ilmPolicy(String ilmPolicy) {
                this.ilmPolicy = ilmPolicy;
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
             * <p>my-template</p>
             */
            public Builder indexTemplate(String indexTemplate) {
                this.indexTemplate = indexTemplate;
                return this;
            }

            /**
             * <p>The index template priority.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder priority(Integer priority) {
                this.priority = priority;
                return this;
            }

            /**
             * <p>The component template.</p>
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
