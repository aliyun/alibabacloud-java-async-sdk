// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeTemplateAttributeResponse} extends {@link TeaModel}
 *
 * <p>DescribeTemplateAttributeResponse</p>
 */
public class DescribeTemplateAttributeResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private java.util.List < DescribeTemplateAttributeResponseBody> body;

    private DescribeTemplateAttributeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static DescribeTemplateAttributeResponse create() {
        return new BuilderImpl().build();
    }

    @Override
    public Builder toBuilder() {
        return new BuilderImpl(this);
    }

    /**
     * @return headers
     */
    public java.util.Map < String, String > getHeaders() {
        return this.headers;
    }

    /**
     * @return statusCode
     */
    public Integer getStatusCode() {
        return this.statusCode;
    }

    /**
     * @return body
     */
    public java.util.List < DescribeTemplateAttributeResponseBody> getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeTemplateAttributeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(java.util.List < DescribeTemplateAttributeResponseBody> body);

        @Override
        DescribeTemplateAttributeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeTemplateAttributeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private java.util.List < DescribeTemplateAttributeResponseBody> body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeTemplateAttributeResponse response) {
            super(response);
            this.headers = response.headers;
            this.statusCode = response.statusCode;
            this.body = response.body;
        } 

        /**
         * headers.
         */
        @Override
        public Builder headers(java.util.Map < String, String > headers) {
            this.headers = headers;
            return this;
        }

        /**
         * statusCode.
         */
        @Override
        public Builder statusCode(Integer statusCode) {
            this.statusCode = statusCode;
            return this;
        }

        /**
         * body.
         */
        @Override
        public Builder body(java.util.List < DescribeTemplateAttributeResponseBody> body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeTemplateAttributeResponse build() {
            return new DescribeTemplateAttributeResponse(this);
        } 

    } 

    /**
     * 
     * {@link DescribeTemplateAttributeResponse} extends {@link TeaModel}
     *
     * <p>DescribeTemplateAttributeResponse</p>
     */
    public static class DescribeTemplateAttributeResponseBody extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("acl")
        private String acl;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("template")
        private String template;

        @com.aliyun.core.annotation.NameInMap("template_type")
        private String templateType;

        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("tags")
        private String tags;

        @com.aliyun.core.annotation.NameInMap("template_with_hist_id")
        private String templateWithHistId;

        @com.aliyun.core.annotation.NameInMap("created")
        private String created;

        @com.aliyun.core.annotation.NameInMap("updated")
        private String updated;

        private DescribeTemplateAttributeResponseBody(Builder builder) {
            this.id = builder.id;
            this.acl = builder.acl;
            this.name = builder.name;
            this.template = builder.template;
            this.templateType = builder.templateType;
            this.description = builder.description;
            this.tags = builder.tags;
            this.templateWithHistId = builder.templateWithHistId;
            this.created = builder.created;
            this.updated = builder.updated;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DescribeTemplateAttributeResponseBody create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return acl
         */
        public String getAcl() {
            return this.acl;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return template
         */
        public String getTemplate() {
            return this.template;
        }

        /**
         * @return templateType
         */
        public String getTemplateType() {
            return this.templateType;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return tags
         */
        public String getTags() {
            return this.tags;
        }

        /**
         * @return templateWithHistId
         */
        public String getTemplateWithHistId() {
            return this.templateWithHistId;
        }

        /**
         * @return created
         */
        public String getCreated() {
            return this.created;
        }

        /**
         * @return updated
         */
        public String getUpdated() {
            return this.updated;
        }

        public static final class Builder {
            private String id; 
            private String acl; 
            private String name; 
            private String template; 
            private String templateType; 
            private String description; 
            private String tags; 
            private String templateWithHistId; 
            private String created; 
            private String updated; 

            /**
             * <p>The ID of the template. When you update a template, a new template ID is generated.</p>
             * 
             * <strong>example:</strong>
             * <p>72d20cf8-a533-4ea9-a10d-e7630d3d****</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The access control policy of the template.</p>
             * 
             * <strong>example:</strong>
             * <p>private</p>
             */
            public Builder acl(String acl) {
                this.acl = acl;
                return this;
            }

            /**
             * <p>The name of the template.</p>
             * 
             * <strong>example:</strong>
             * <p>web</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The template content in the YAML format.</p>
             * 
             * <strong>example:</strong>
             * <p>apiVersion: V1\n***</p>
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * <p>The type of template. The value can be a custom value.</p>
             * <ul>
             * <li>If the parameter is set to <code>kubernetes</code>, the template is displayed on the Templates page in the console.</li>
             * <li>If the parameter is set to <code>compose</code>, the template is displayed on the Container Service - Swarm page in the console. Container Service for Swarm is deprecated.</li>
             * <li>If the value of the parameter is not <code>kubernetes</code>, the template is not displayed on the Templates page in the console. We recommend that you set the parameter to <code>kubernetes</code>.</li>
             * </ul>
             * <p>Default value: <code>kubernetes</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>kubernetes</p>
             */
            public Builder templateType(String templateType) {
                this.templateType = templateType;
                return this;
            }

            /**
             * <p>The description of the template.</p>
             * 
             * <strong>example:</strong>
             * <p>test template</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The label of the template.</p>
             * 
             * <strong>example:</strong>
             * <p>sa</p>
             */
            public Builder tags(String tags) {
                this.tags = tags;
                return this;
            }

            /**
             * <p>The unique ID of the template. The value remains unchanged after the template is updated.</p>
             * 
             * <strong>example:</strong>
             * <p>874ec485-e7e6-4373-8a3b-47bde8ae****</p>
             */
            public Builder templateWithHistId(String templateWithHistId) {
                this.templateWithHistId = templateWithHistId;
                return this;
            }

            /**
             * <p>The time when the template was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-09-16T19:21:29+08:00</p>
             */
            public Builder created(String created) {
                this.created = created;
                return this;
            }

            /**
             * <p>The time when the template was updated.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-09-16T19:21:29+08:00</p>
             */
            public Builder updated(String updated) {
                this.updated = updated;
                return this;
            }

            public DescribeTemplateAttributeResponseBody build() {
                return new DescribeTemplateAttributeResponseBody(this);
            } 

        } 

    }
}
