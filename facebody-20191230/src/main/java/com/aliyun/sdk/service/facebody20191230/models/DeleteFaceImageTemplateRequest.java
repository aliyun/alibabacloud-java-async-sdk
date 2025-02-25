// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.facebody20191230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteFaceImageTemplateRequest} extends {@link RequestModel}
 *
 * <p>DeleteFaceImageTemplateRequest</p>
 */
public class DeleteFaceImageTemplateRequest extends Request {
    @Body
    @NameInMap("TemplateId")
    @Validation(required = true)
    private String templateId;

    private DeleteFaceImageTemplateRequest(Builder builder) {
        super(builder);
        this.templateId = builder.templateId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteFaceImageTemplateRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return templateId
     */
    public String getTemplateId() {
        return this.templateId;
    }

    public static final class Builder extends Request.Builder<DeleteFaceImageTemplateRequest, Builder> {
        private String templateId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteFaceImageTemplateRequest request) {
            super(request);
            this.templateId = request.templateId;
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
        public DeleteFaceImageTemplateRequest build() {
            return new DeleteFaceImageTemplateRequest(this);
        } 

    } 

}
