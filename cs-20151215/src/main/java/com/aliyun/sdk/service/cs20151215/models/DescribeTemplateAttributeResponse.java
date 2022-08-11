// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeTemplateAttributeResponse} extends {@link TeaModel}
 *
 * <p>DescribeTemplateAttributeResponse</p>
 */
public class DescribeTemplateAttributeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private java.util.List < DescribeTemplateAttributeResponseBody> body;

    private DescribeTemplateAttributeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
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
     * @return body
     */
    public java.util.List < DescribeTemplateAttributeResponseBody> getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeTemplateAttributeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(java.util.List < DescribeTemplateAttributeResponseBody> body);

        @Override
        DescribeTemplateAttributeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeTemplateAttributeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private java.util.List < DescribeTemplateAttributeResponseBody> body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeTemplateAttributeResponse response) {
            super(response);
            this.headers = response.headers;
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

    public static class DescribeTemplateAttributeResponseBody extends TeaModel {
        @NameInMap("id")
        private String id;

        @NameInMap("acl")
        private String acl;

        @NameInMap("name")
        private String name;

        @NameInMap("template")
        private String template;

        @NameInMap("template_type")
        private String templateType;

        @NameInMap("description")
        private String description;

        @NameInMap("tags")
        private String tags;

        @NameInMap("template_with_hist_id")
        private String templateWithHistId;

        @NameInMap("created")
        private String created;

        @NameInMap("updated")
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
             * 编排模板ID，模板每次修改，这个ID都会改变。	
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * 编排模板权限。取值：private，public，shared。
             */
            public Builder acl(String acl) {
                this.acl = acl;
                return this;
            }

            /**
             * 编排模板名称。	
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * 编排模板内容。	
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * 编排模板类型
             */
            public Builder templateType(String templateType) {
                this.templateType = templateType;
                return this;
            }

            /**
             * 编排模板描述。
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * 部署模板的标签。
             */
            public Builder tags(String tags) {
                this.tags = tags;
                return this;
            }

            /**
             * 编排模板ID，该ID唯一不随更新而改变。	
             */
            public Builder templateWithHistId(String templateWithHistId) {
                this.templateWithHistId = templateWithHistId;
                return this;
            }

            /**
             * 编排模板创建时间。
             */
            public Builder created(String created) {
                this.created = created;
                return this;
            }

            /**
             * 编排模板修改时间。	
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
