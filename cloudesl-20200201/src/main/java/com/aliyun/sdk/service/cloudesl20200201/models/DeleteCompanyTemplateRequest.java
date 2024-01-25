// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudesl20200201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteCompanyTemplateRequest} extends {@link RequestModel}
 *
 * <p>DeleteCompanyTemplateRequest</p>
 */
public class DeleteCompanyTemplateRequest extends Request {
    @Body
    @NameInMap("ExtraParams")
    private String extraParams;

    @Body
    @NameInMap("TemplateId")
    @Validation(required = true)
    private String templateId;

    private DeleteCompanyTemplateRequest(Builder builder) {
        super(builder);
        this.extraParams = builder.extraParams;
        this.templateId = builder.templateId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteCompanyTemplateRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return extraParams
     */
    public String getExtraParams() {
        return this.extraParams;
    }

    /**
     * @return templateId
     */
    public String getTemplateId() {
        return this.templateId;
    }

    public static final class Builder extends Request.Builder<DeleteCompanyTemplateRequest, Builder> {
        private String extraParams; 
        private String templateId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteCompanyTemplateRequest request) {
            super(request);
            this.extraParams = request.extraParams;
            this.templateId = request.templateId;
        } 

        /**
         * ExtraParams.
         */
        public Builder extraParams(String extraParams) {
            this.putBodyParameter("ExtraParams", extraParams);
            this.extraParams = extraParams;
            return this;
        }

        /**
         * TemplateId.
         */
        public Builder templateId(String templateId) {
            this.putBodyParameter("TemplateId", templateId);
            this.templateId = templateId;
            return this;
        }

        @Override
        public DeleteCompanyTemplateRequest build() {
            return new DeleteCompanyTemplateRequest(this);
        } 

    } 

}
