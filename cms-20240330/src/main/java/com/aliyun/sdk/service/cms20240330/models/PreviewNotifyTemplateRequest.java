// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20240330.models;

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
 * {@link PreviewNotifyTemplateRequest} extends {@link RequestModel}
 *
 * <p>PreviewNotifyTemplateRequest</p>
 */
public class PreviewNotifyTemplateRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("data")
    private Object data;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("templates")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<Templates> templates;

    private PreviewNotifyTemplateRequest(Builder builder) {
        super(builder);
        this.data = builder.data;
        this.templates = builder.templates;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PreviewNotifyTemplateRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public Object getData() {
        return this.data;
    }

    /**
     * @return templates
     */
    public java.util.List<Templates> getTemplates() {
        return this.templates;
    }

    public static final class Builder extends Request.Builder<PreviewNotifyTemplateRequest, Builder> {
        private Object data; 
        private java.util.List<Templates> templates; 

        private Builder() {
            super();
        } 

        private Builder(PreviewNotifyTemplateRequest request) {
            super(request);
            this.data = request.data;
            this.templates = request.templates;
        } 

        /**
         * data.
         */
        public Builder data(Object data) {
            this.putBodyParameter("data", data);
            this.data = data;
            return this;
        }

        /**
         * <p>待渲染的模板列表，每项包含模板标识和模板内容</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;key&quot;:&quot;title&quot;,&quot;template&quot;:&quot;云监控报警: {{.incident.title}}&quot;},{&quot;key&quot;:&quot;content&quot;,&quot;template&quot;:&quot;&gt;- 级别: {{.incident.severity}}&quot;}]</p>
         */
        public Builder templates(java.util.List<Templates> templates) {
            this.putBodyParameter("templates", templates);
            this.templates = templates;
            return this;
        }

        @Override
        public PreviewNotifyTemplateRequest build() {
            return new PreviewNotifyTemplateRequest(this);
        } 

    } 

    /**
     * 
     * {@link PreviewNotifyTemplateRequest} extends {@link TeaModel}
     *
     * <p>PreviewNotifyTemplateRequest</p>
     */
    public static class Templates extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("key")
        @com.aliyun.core.annotation.Validation(required = true)
        private String key;

        @com.aliyun.core.annotation.NameInMap("template")
        @com.aliyun.core.annotation.Validation(required = true)
        private String template;

        private Templates(Builder builder) {
            this.key = builder.key;
            this.template = builder.template;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Templates create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return template
         */
        public String getTemplate() {
            return this.template;
        }

        public static final class Builder {
            private String key; 
            private String template; 

            private Builder() {
            } 

            private Builder(Templates model) {
                this.key = model.key;
                this.template = model.template;
            } 

            /**
             * <p>模板标识，前端自定义，原样返回。建议使用 title / content 等语义名称</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>title</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>Go template 语法的模板内容字符串</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>云监控报警: {{.incident.title}}</p>
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            public Templates build() {
                return new Templates(this);
            } 

        } 

    }
}
