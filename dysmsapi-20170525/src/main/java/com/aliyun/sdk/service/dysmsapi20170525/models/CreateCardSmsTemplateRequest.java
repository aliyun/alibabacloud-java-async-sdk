// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dysmsapi20170525.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The mobile phone manufacturer. Valid values:</p>
         * <ul>
         * <li><strong>HuaWei</strong>: HUAWEI</li>
         * <li><strong>XiaoMi</strong>: Xiaomi</li>
         * <li><strong>OPPO</strong>: OPPO</li>
         * <li><strong>VIVO</strong>: vivo</li>
         * <li><strong>MEIZU</strong>: MEIZU</li>
         * </ul>
         * <blockquote>
         * <p>If this parameter is not specified, the system automatically specifies a supported mobile phone manufacturer.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>XiaoMi</p>
         */
        public Builder factorys(String factorys) {
            this.putQueryParameter("Factorys", factorys);
            this.factorys = factorys;
            return this;
        }

        /**
         * <p>The description of the message template.</p>
         * 
         * <strong>example:</strong>
         * <p>Image and Text Template</p>
         */
        public Builder memo(String memo) {
            this.putQueryParameter("Memo", memo);
            this.memo = memo;
            return this;
        }

        /**
         * <p>The content of the card message template.</p>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li><p>For information about fields such as Template, ExtendInfo, TemplateContent, TmpCard, and Action, see <a href="https://help.aliyun.com/document_detail/434929.html">Parameters of card message templates</a>.</p>
         * </li>
         * <li><p>Message template content varies based on the template type. For more information, see <a href="https://help.aliyun.com/document_detail/435361.html">Sample message templates</a>.</p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *        &quot;extendInfo&quot;:{
         *               &quot;scene&quot;:&quot;HMOVM&quot;,
         *               &quot;purpose&quot;:&quot;2&quot;,
         *               &quot;userExt&quot;:{
         *                      &quot;outId&quot;:&quot;1234554321&quot;
         *               }
         *        },
         *        &quot;templateContent&quot;:{
         *               &quot;pages&quot;:[
         *                      {
         * &quot;tmpCards&quot;:[
         *                                    {
         *                                           &quot;type&quot;:&quot;IMAGE&quot;,
         *                                           &quot;srcType&quot;:1,
         *                                           &quot;src&quot;:&quot;28755&quot;,
         *                                           &quot;actionType&quot;:&quot;OPEN_APP&quot;,
         *                                           &quot;action&quot;:{
         *                                                  &quot;target&quot;:&quot;<a href="https://s.tb.cn/c.KxzZ">https://s.tb.cn/c.KxzZ</a>&quot;,
         *                                                  &quot;merchantName&quot;:&quot;test-template&quot;,
         *                                                  &quot;packageName&quot;:[
         *                                                         &quot;com.taobao.taobao&quot;],
         *                                                  &quot;floorUrl&quot;:&quot;<a href="https://s.tb.cn/c.KxzZ">https://s.tb.cn/c.KxzZ</a>&quot;
         *                                           },
         *                                           &quot;positionNumber&quot;:1
         *                                    },
         *                                    {
         *                                           &quot;type&quot;:&quot;TEXT&quot;,
         *                                           &quot;content&quot;:&quot;this is a test msg.&quot;,
         *                                           &quot;isTextTitle&quot;:true,
         *                                           &quot;positionNumber&quot;:2
         *                                    },
         *                                    {
         *                                           &quot;type&quot;:&quot;TEXT&quot;,
         *                                           &quot;content&quot;:&quot;Promotional information&quot;,
         *                                           &quot;isTextTitle&quot;:false,
         *                                           &quot;positionNumber&quot;:3
         *                                    },
         *                                    {
         *                                           &quot;type&quot;:&quot;BUTTON&quot;,
         *                                           &quot;content&quot;:&quot;Promotional information,&quot;,
         *                                           &quot;actionType&quot;:&quot;OPEN_BROWSER&quot;,
         *                                           &quot;action&quot;:{
         *                                                  &quot;target&quot;:&quot;<a href="https://www.aliyun.com">https://www.aliyun.com</a>&quot;,
         *                                                  &quot;merchantName&quot;:&quot;Currently on the Alibaba Cloud official website.&quot;
         * },
         *                                           &quot;positionNumber&quot;:4
         *                                    }]
         *                      }]
         *        },
         *        &quot;cardSignName&quot;:&quot;aliyun&quot;,
         *        &quot;cardType&quot;:5
         * }</p>
         */
        public Builder template(java.util.Map < String, ? > template) {
            String templateShrink = shrink(template, "Template", "json");
            this.putQueryParameter("Template", templateShrink);
            this.template = template;
            return this;
        }

        /**
         * <p>The name of the card message template.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Aliyun Image and Text Template</p>
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
