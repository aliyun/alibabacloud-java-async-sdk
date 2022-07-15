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
    @NameInMap("CustWabaId")
    private String custWabaId;

    @Query
    @NameInMap("Language")
    @Validation(required = true)
    private String language;

    @Query
    @NameInMap("TemplateCode")
    @Validation(required = true)
    private String templateCode;

    private GetChatappTemplateDetailRequest(Builder builder) {
        super(builder);
        this.custWabaId = builder.custWabaId;
        this.language = builder.language;
        this.templateCode = builder.templateCode;
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
     * @return custWabaId
     */
    public String getCustWabaId() {
        return this.custWabaId;
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

    public static final class Builder extends Request.Builder<GetChatappTemplateDetailRequest, Builder> {
        private String custWabaId; 
        private String language; 
        private String templateCode; 

        private Builder() {
            super();
        } 

        private Builder(GetChatappTemplateDetailRequest request) {
            super(request);
            this.custWabaId = request.custWabaId;
            this.language = request.language;
            this.templateCode = request.templateCode;
        } 

        /**
         * ISV客户WabaId
         */
        public Builder custWabaId(String custWabaId) {
            this.putQueryParameter("CustWabaId", custWabaId);
            this.custWabaId = custWabaId;
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
         * 模板分类
         */
        public Builder templateCode(String templateCode) {
            this.putQueryParameter("TemplateCode", templateCode);
            this.templateCode = templateCode;
            return this;
        }

        @Override
        public GetChatappTemplateDetailRequest build() {
            return new GetChatappTemplateDetailRequest(this);
        } 

    } 

}
