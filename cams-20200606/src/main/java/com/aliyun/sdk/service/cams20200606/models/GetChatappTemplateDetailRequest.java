// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cams20200606.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetChatappTemplateDetailRequest} extends {@link RequestModel}
 *
 * <p>GetChatappTemplateDetailRequest</p>
 */
public class GetChatappTemplateDetailRequest extends Request {
    @Query
    @NameInMap("CustSpaceId")
    private String custSpaceId;

    @Query
    @NameInMap("CustWabaId")
    @Deprecated
    private String custWabaId;

    @Query
    @NameInMap("IsvCode")
    private String isvCode;

    @Query
    @NameInMap("Language")
    @Validation(required = true)
    private String language;

    @Query
    @NameInMap("TemplateCode")
    @Validation(required = true)
    private String templateCode;

    @Query
    @NameInMap("TemplateType")
    private String templateType;

    private GetChatappTemplateDetailRequest(Builder builder) {
        super(builder);
        this.custSpaceId = builder.custSpaceId;
        this.custWabaId = builder.custWabaId;
        this.isvCode = builder.isvCode;
        this.language = builder.language;
        this.templateCode = builder.templateCode;
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
            this.templateType = request.templateType;
        } 

        /**
         * ISV子客户的SpaceId
         */
        public Builder custSpaceId(String custSpaceId) {
            this.putQueryParameter("CustSpaceId", custSpaceId);
            this.custSpaceId = custSpaceId;
            return this;
        }

        /**
         * ISV客户WabaId, 后续会被弃用，请使用CustSpaceId
         */
        public Builder custWabaId(String custWabaId) {
            this.putQueryParameter("CustWabaId", custWabaId);
            this.custWabaId = custWabaId;
            return this;
        }

        /**
         * Isv校验码，用于校验子帐号是否由ISV授权
         */
        public Builder isvCode(String isvCode) {
            this.putQueryParameter("IsvCode", isvCode);
            this.isvCode = isvCode;
            return this;
        }

        /**
         * 语言
         */
        public Builder language(String language) {
            this.putQueryParameter("Language", language);
            this.language = language;
            return this;
        }

        /**
         * The type of the message template. Valid values:
         * <p>
         * 
         * *   **WHATSAPP**
         * *   **VIBER**
         * *   LINE (developing)
         */
        public Builder templateCode(String templateCode) {
            this.putQueryParameter("TemplateCode", templateCode);
            this.templateCode = templateCode;
            return this;
        }

        /**
         * 模板的模板类型，取值为WHATSAPP/VIBER， 当未传递此值时，默认值为WHATSAPP
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
