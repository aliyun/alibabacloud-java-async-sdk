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
    @NameInMap("IsvCode")
    private String isvCode;

    @Query
    @NameInMap("TemplateCode")
    @Validation(required = true)
    private String templateCode;

    private DeleteChatappTemplateRequest(Builder builder) {
        super(builder);
        this.custWabaId = builder.custWabaId;
        this.isvCode = builder.isvCode;
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
     * @return isvCode
     */
    public String getIsvCode() {
        return this.isvCode;
    }

    /**
     * @return templateCode
     */
    public String getTemplateCode() {
        return this.templateCode;
    }

    public static final class Builder extends Request.Builder<DeleteChatappTemplateRequest, Builder> {
        private String custWabaId; 
        private String isvCode; 
        private String templateCode; 

        private Builder() {
            super();
        } 

        private Builder(DeleteChatappTemplateRequest request) {
            super(request);
            this.custWabaId = request.custWabaId;
            this.isvCode = request.isvCode;
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
         * Isv校验码，用于校验子帐号是否由ISV授权
         */
        public Builder isvCode(String isvCode) {
            this.putQueryParameter("IsvCode", isvCode);
            this.isvCode = isvCode;
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
