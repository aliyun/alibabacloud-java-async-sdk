// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cams20200606.models;

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
 * {@link GetChatappTemplateDetailRequest} extends {@link RequestModel}
 *
 * <p>GetChatappTemplateDetailRequest</p>
 */
public class GetChatappTemplateDetailRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CustSpaceId")
    private String custSpaceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CustWabaId")
    @Deprecated
    private String custWabaId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsvCode")
    private String isvCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Language")
    @com.aliyun.core.annotation.Validation(required = true)
    private String language;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateCode")
    private String templateCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateName")
    private String templateName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateType")
    private String templateType;

    private GetChatappTemplateDetailRequest(Builder builder) {
        super(builder);
        this.custSpaceId = builder.custSpaceId;
        this.custWabaId = builder.custWabaId;
        this.isvCode = builder.isvCode;
        this.language = builder.language;
        this.templateCode = builder.templateCode;
        this.templateName = builder.templateName;
        this.templateType = builder.templateType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetChatappTemplateDetailRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return custSpaceId
     */
    public String getCustSpaceId() {
        return this.custSpaceId;
    }

    /**
     * @return custWabaId
     */
    public String getCustWabaId() {
        return this.custWabaId;
    }

    /**
     * @return isvCode
     */
    public String getIsvCode() {
        return this.isvCode;
    }

    /**
     * @return language
     */
    public String getLanguage() {
        return this.language;
    }

    /**
     * @return templateCode
     */
    public String getTemplateCode() {
        return this.templateCode;
    }

    /**
     * @return templateName
     */
    public String getTemplateName() {
        return this.templateName;
    }

    /**
     * @return templateType
     */
    public String getTemplateType() {
        return this.templateType;
    }

    public static final class Builder extends Request.Builder<GetChatappTemplateDetailRequest, Builder> {
        private String custSpaceId; 
        private String custWabaId; 
        private String isvCode; 
        private String language; 
        private String templateCode; 
        private String templateName; 
        private String templateType; 

        private Builder() {
            super();
        } 

        private Builder(GetChatappTemplateDetailRequest request) {
            super(request);
            this.custSpaceId = request.custSpaceId;
            this.custWabaId = request.custWabaId;
            this.isvCode = request.isvCode;
            this.language = request.language;
            this.templateCode = request.templateCode;
            this.templateName = request.templateName;
            this.templateType = request.templateType;
        } 

        /**
         * <p>The space ID of the user within the ISV account.</p>
         * 
         * <strong>example:</strong>
         * <p>28251486512358****</p>
         */
        public Builder custSpaceId(String custSpaceId) {
            this.putQueryParameter("CustSpaceId", custSpaceId);
            this.custSpaceId = custSpaceId;
            return this;
        }

        /**
         * <p>The WhatsApp Business account (WABA) ID of the user within the independent software vendor (ISV) account.</p>
         * <blockquote>
         * <p> CustWabaId is an obsolete parameter. Use CustSpaceId instead.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>65921621816****</p>
         */
        public Builder custWabaId(String custWabaId) {
            this.putQueryParameter("CustWabaId", custWabaId);
            this.custWabaId = custWabaId;
            return this;
        }

        /**
         * <p>The independent software vendor (ISV) verification code. This parameter is used to verify whether the user is authorized by the ISV account.</p>
         * 
         * <strong>example:</strong>
         * <p>skdi3kksloslikdkkdk</p>
         */
        public Builder isvCode(String isvCode) {
            this.putQueryParameter("IsvCode", isvCode);
            this.isvCode = isvCode;
            return this;
        }

        /**
         * <p>The language that is used in the message template. For more information, see <a href="https://help.aliyun.com/document_detail/463420.html">Language codes</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>en_US</p>
         */
        public Builder language(String language) {
            this.putQueryParameter("Language", language);
            this.language = language;
            return this;
        }

        /**
         * <p>The code of the message template.</p>
         * 
         * <strong>example:</strong>
         * <p>****4b5c79c9432497a075bdfca36bf5</p>
         */
        public Builder templateCode(String templateCode) {
            this.putQueryParameter("TemplateCode", templateCode);
            this.templateCode = templateCode;
            return this;
        }

        /**
         * <p>Name of a template.</p>
         * 
         * <strong>example:</strong>
         * <p>test_name</p>
         */
        public Builder templateName(String templateName) {
            this.putQueryParameter("TemplateName", templateName);
            this.templateName = templateName;
            return this;
        }

        /**
         * <p>The type of the message template. Valid values:</p>
         * <ul>
         * <li><strong>WHATSAPP</strong></li>
         * <li><strong>VIBER</strong></li>
         * <li>LINE (developing)</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>WHATSAPP</p>
         */
        public Builder templateType(String templateType) {
            this.putQueryParameter("TemplateType", templateType);
            this.templateType = templateType;
            return this;
        }

        @Override
        public GetChatappTemplateDetailRequest build() {
            return new GetChatappTemplateDetailRequest(this);
        } 

    } 

}
