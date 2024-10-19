// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribePluginSchemasResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePluginSchemasResponseBody</p>
 */
public class DescribePluginSchemasResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PluginSchemas")
    private PluginSchemas pluginSchemas;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribePluginSchemasResponseBody(Builder builder) {
        this.pluginSchemas = builder.pluginSchemas;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePluginSchemasResponseBody create() {
        return builder().build();
    }

    /**
     * @return pluginSchemas
     */
    public PluginSchemas getPluginSchemas() {
        return this.pluginSchemas;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private PluginSchemas pluginSchemas; 
        private String requestId; 

        /**
         * PluginSchemas.
         */
        public Builder pluginSchemas(PluginSchemas pluginSchemas) {
            this.pluginSchemas = pluginSchemas;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribePluginSchemasResponseBody build() {
            return new DescribePluginSchemasResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribePluginSchemasResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePluginSchemasResponseBody</p>
     */
    public static class PluginSchema extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("DocumentId")
        private String documentId;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("SupportClassic")
        private Boolean supportClassic;

        @com.aliyun.core.annotation.NameInMap("Title")
        private String title;

        private PluginSchema(Builder builder) {
            this.description = builder.description;
            this.documentId = builder.documentId;
            this.name = builder.name;
            this.supportClassic = builder.supportClassic;
            this.title = builder.title;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PluginSchema create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return documentId
         */
        public String getDocumentId() {
            return this.documentId;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return supportClassic
         */
        public Boolean getSupportClassic() {
            return this.supportClassic;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        public static final class Builder {
            private String description; 
            private String documentId; 
            private String name; 
            private Boolean supportClassic; 
            private String title; 

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * DocumentId.
             */
            public Builder documentId(String documentId) {
                this.documentId = documentId;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * SupportClassic.
             */
            public Builder supportClassic(Boolean supportClassic) {
                this.supportClassic = supportClassic;
                return this;
            }

            /**
             * Title.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            public PluginSchema build() {
                return new PluginSchema(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribePluginSchemasResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePluginSchemasResponseBody</p>
     */
    public static class PluginSchemas extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PluginSchema")
        private java.util.List < PluginSchema> pluginSchema;

        private PluginSchemas(Builder builder) {
            this.pluginSchema = builder.pluginSchema;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PluginSchemas create() {
            return builder().build();
        }

        /**
         * @return pluginSchema
         */
        public java.util.List < PluginSchema> getPluginSchema() {
            return this.pluginSchema;
        }

        public static final class Builder {
            private java.util.List < PluginSchema> pluginSchema; 

            /**
             * PluginSchema.
             */
            public Builder pluginSchema(java.util.List < PluginSchema> pluginSchema) {
                this.pluginSchema = pluginSchema;
                return this;
            }

            public PluginSchemas build() {
                return new PluginSchemas(this);
            } 

        } 

    }
}
