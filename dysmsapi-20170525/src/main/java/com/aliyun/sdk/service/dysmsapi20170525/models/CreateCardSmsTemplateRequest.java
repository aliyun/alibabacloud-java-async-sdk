// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dysmsapi20170525.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateCardSmsTemplateRequest} extends {@link RequestModel}
 *
 * <p>CreateCardSmsTemplateRequest</p>
 */
public class CreateCardSmsTemplateRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Factorys")
    private String factorys;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Memo")
    private String memo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Template")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.Map < String, ? > template;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String templateName;

    private CreateCardSmsTemplateRequest(Builder builder) {
        super(builder);
        this.factorys = builder.factorys;
        this.memo = builder.memo;
        this.template = builder.template;
        this.templateName = builder.templateName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCardSmsTemplateRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return factorys
     */
    public String getFactorys() {
        return this.factorys;
    }

    /**
     * @return memo
     */
    public String getMemo() {
        return this.memo;
    }

    /**
     * @return template
     */
    public java.util.Map < String, ? > getTemplate() {
        return this.template;
    }

    /**
     * @return templateName
     */
    public String getTemplateName() {
        return this.templateName;
    }

    public static final class Builder extends Request.Builder<CreateCardSmsTemplateRequest, Builder> {
        private String factorys; 
        private String memo; 
        private java.util.Map < String, ? > template; 
        private String templateName; 

        private Builder() {
            super();
        } 

        private Builder(CreateCardSmsTemplateRequest request) {
            super(request);
            this.factorys = request.factorys;
            this.memo = request.memo;
            this.template = request.template;
            this.templateName = request.templateName;
        } 

        /**
         * The mobile phone manufacturer. Valid values:
         * <p>
         * 
         * *   **HuaWei**: HUAWEI
         * *   **XiaoMi**: Xiaomi
         * *   **OPPO**: OPPO
         * *   **VIVO**: vivo
         * *   **MEIZU**: MEIZU
         * 
         * > If this parameter is not specified, the system automatically specifies a supported mobile phone manufacturer.
         */
        public Builder factorys(String factorys) {
            this.putQueryParameter("Factorys", factorys);
            this.factorys = factorys;
            return this;
        }

        /**
         * The description of the message template.
         */
        public Builder memo(String memo) {
            this.putQueryParameter("Memo", memo);
            this.memo = memo;
            return this;
        }

        /**
         * The content of the card message template.
         * <p>
         * 
         * > 
         * 
         * *   For information about fields such as Template, ExtendInfo, TemplateContent, TmpCard, and Action, see [Parameters of card message templates](~~434929~~).
         * 
         * *   Message template content varies based on the template type. For more information, see [Sample message templates](~~435361~~).
         */
        public Builder template(java.util.Map < String, ? > template) {
            String templateShrink = shrink(template, "Template", "json");
            this.putQueryParameter("Template", templateShrink);
            this.template = template;
            return this;
        }

        /**
         * The name of the card message template.
         */
        public Builder templateName(String templateName) {
            this.putQueryParameter("TemplateName", templateName);
            this.templateName = templateName;
            return this;
        }

        @Override
        public CreateCardSmsTemplateRequest build() {
            return new CreateCardSmsTemplateRequest(this);
        } 

    } 

}
