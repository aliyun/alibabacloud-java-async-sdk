// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligenieip_1_0.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteMessageTemplateRequest} extends {@link RequestModel}
 *
 * <p>DeleteMessageTemplateRequest</p>
 */
public class DeleteMessageTemplateRequest extends Request {
    @Body
    @NameInMap("TemplateId")
    private Long templateId;

    private DeleteMessageTemplateRequest(Builder builder) {
        super(builder);
        this.templateId = builder.templateId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteMessageTemplateRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return templateId
     */
    public Long getTemplateId() {
        return this.templateId;
    }

    public static final class Builder extends Request.Builder<DeleteMessageTemplateRequest, Builder> {
        private Long templateId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteMessageTemplateRequest request) {
            super(request);
            this.templateId = request.templateId;
        } 

        /**
         * TemplateId.
         */
        public Builder templateId(Long templateId) {
            this.putBodyParameter("TemplateId", templateId);
            this.templateId = templateId;
            return this;
        }

        @Override
        public DeleteMessageTemplateRequest build() {
            return new DeleteMessageTemplateRequest(this);
        } 

    } 

}
