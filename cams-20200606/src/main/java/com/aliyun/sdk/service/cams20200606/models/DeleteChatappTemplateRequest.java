// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cams20200606.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteChatappTemplateRequest} extends {@link RequestModel}
 *
 * <p>DeleteChatappTemplateRequest</p>
 */
public class DeleteChatappTemplateRequest extends Request {
    @Query
    @NameInMap("CustWabaId")
    private String custWabaId;

    @Query
    @NameInMap("TemplateCode")
    @Validation(required = true)
    private String templateCode;

    private DeleteChatappTemplateRequest(Builder builder) {
        super(builder);
        this.custWabaId = builder.custWabaId;
        this.templateCode = builder.templateCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteChatappTemplateRequest create() {
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
     * @return templateCode
     */
    public String getTemplateCode() {
        return this.templateCode;
    }

    public static final class Builder extends Request.Builder<DeleteChatappTemplateRequest, Builder> {
        private String custWabaId; 
        private String templateCode; 

        private Builder() {
            super();
        } 

        private Builder(DeleteChatappTemplateRequest request) {
            super(request);
            this.custWabaId = request.custWabaId;
            this.templateCode = request.templateCode;
        } 

        /**
         * ISV客户wabaId
         */
        public Builder custWabaId(String custWabaId) {
            this.putQueryParameter("CustWabaId", custWabaId);
            this.custWabaId = custWabaId;
            return this;
        }

        /**
         * 模板编码
         */
        public Builder templateCode(String templateCode) {
            this.putQueryParameter("TemplateCode", templateCode);
            this.templateCode = templateCode;
            return this;
        }

        @Override
        public DeleteChatappTemplateRequest build() {
            return new DeleteChatappTemplateRequest(this);
        } 

    } 

}
