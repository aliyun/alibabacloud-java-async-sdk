// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribePluginTemplatesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePluginTemplatesResponseBody</p>
 */
public class DescribePluginTemplatesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Templates")
    private Templates templates;

    private DescribePluginTemplatesResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.templates = builder.templates;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePluginTemplatesResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return templates
     */
    public Templates getTemplates() {
        return this.templates;
    }

    public static final class Builder {
        private String requestId; 
        private Templates templates; 

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>EF924FE4-2EDD-4CD3-89EC-34E4708574E7</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The templates.</p>
         */
        public Builder templates(Templates templates) {
            this.templates = templates;
            return this;
        }

        public DescribePluginTemplatesResponseBody build() {
            return new DescribePluginTemplatesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribePluginTemplatesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePluginTemplatesResponseBody</p>
     */
    public static class Template extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("DocumentAnchor")
        private String documentAnchor;

        @com.aliyun.core.annotation.NameInMap("DocumentId")
        private String documentId;

        @com.aliyun.core.annotation.NameInMap("Sample")
        private String sample;

        @com.aliyun.core.annotation.NameInMap("Title")
        private String title;

        private Template(Builder builder) {
            this.description = builder.description;
            this.documentAnchor = builder.documentAnchor;
            this.documentId = builder.documentId;
            this.sample = builder.sample;
            this.title = builder.title;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Template create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return documentAnchor
         */
        public String getDocumentAnchor() {
            return this.documentAnchor;
        }

        /**
         * @return documentId
         */
        public String getDocumentId() {
            return this.documentId;
        }

        /**
         * @return sample
         */
        public String getSample() {
            return this.sample;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        public static final class Builder {
            private String description; 
            private String documentAnchor; 
            private String documentId; 
            private String sample; 
            private String title; 

            /**
             * <p>The description.</p>
             * 
             * <strong>example:</strong>
             * <p>balabala</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The document anchor point.</p>
             * 
             * <strong>example:</strong>
             * <p>anchor</p>
             */
            public Builder documentAnchor(String documentAnchor) {
                this.documentAnchor = documentAnchor;
                return this;
            }

            /**
             * <p>The ID of the document.</p>
             * 
             * <strong>example:</strong>
             * <p>41079</p>
             */
            public Builder documentId(String documentId) {
                this.documentId = documentId;
                return this;
            }

            /**
             * <p>The sample.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder sample(String sample) {
                this.sample = sample;
                return this;
            }

            /**
             * <p>The title of the plug-in template title.</p>
             * 
             * <strong>example:</strong>
             * <p>template title</p>
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            public Template build() {
                return new Template(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribePluginTemplatesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePluginTemplatesResponseBody</p>
     */
    public static class Templates extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Template")
        private java.util.List < Template> template;

        private Templates(Builder builder) {
            this.template = builder.template;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Templates create() {
            return builder().build();
        }

        /**
         * @return template
         */
        public java.util.List < Template> getTemplate() {
            return this.template;
        }

        public static final class Builder {
            private java.util.List < Template> template; 

            /**
             * Template.
             */
            public Builder template(java.util.List < Template> template) {
                this.template = template;
                return this;
            }

            public Templates build() {
                return new Templates(this);
            } 

        } 

    }
}
