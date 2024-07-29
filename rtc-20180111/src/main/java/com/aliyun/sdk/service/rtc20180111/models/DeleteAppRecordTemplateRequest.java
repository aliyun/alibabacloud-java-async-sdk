// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rtc20180111.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteAppRecordTemplateRequest} extends {@link RequestModel}
 *
 * <p>DeleteAppRecordTemplateRequest</p>
 */
public class DeleteAppRecordTemplateRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Template")
    @com.aliyun.core.annotation.Validation(required = true)
    private Template template;

    private DeleteAppRecordTemplateRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.clientToken = builder.clientToken;
        this.template = builder.template;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteAppRecordTemplateRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return template
     */
    public Template getTemplate() {
        return this.template;
    }

    public static final class Builder extends Request.Builder<DeleteAppRecordTemplateRequest, Builder> {
        private String appId; 
        private String clientToken; 
        private Template template; 

        private Builder() {
            super();
        } 

        private Builder(DeleteAppRecordTemplateRequest request) {
            super(request);
            this.appId = request.appId;
            this.clientToken = request.clientToken;
            this.template = request.template;
        } 

        /**
         * AppId.
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * Template.
         */
        public Builder template(Template template) {
            String templateShrink = shrink(template, "Template", "json");
            this.putQueryParameter("Template", templateShrink);
            this.template = template;
            return this;
        }

        @Override
        public DeleteAppRecordTemplateRequest build() {
            return new DeleteAppRecordTemplateRequest(this);
        } 

    } 

    public static class Template extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TemplateId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String templateId;

        private Template(Builder builder) {
            this.templateId = builder.templateId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Template create() {
            return builder().build();
        }

        /**
         * @return templateId
         */
        public String getTemplateId() {
            return this.templateId;
        }

        public static final class Builder {
            private String templateId; 

            /**
             * TemplateId.
             */
            public Builder templateId(String templateId) {
                this.templateId = templateId;
                return this;
            }

            public Template build() {
                return new Template(this);
            } 

        } 

    }
}
