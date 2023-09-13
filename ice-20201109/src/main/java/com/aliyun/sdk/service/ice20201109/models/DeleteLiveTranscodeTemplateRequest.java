// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteLiveTranscodeTemplateRequest} extends {@link RequestModel}
 *
 * <p>DeleteLiveTranscodeTemplateRequest</p>
 */
public class DeleteLiveTranscodeTemplateRequest extends Request {
    @Query
    @NameInMap("TemplateId")
    @Validation(required = true)
    private String templateId;

    private DeleteLiveTranscodeTemplateRequest(Builder builder) {
        super(builder);
        this.templateId = builder.templateId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteLiveTranscodeTemplateRequest create() {
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

    public static final class Builder extends Request.Builder<DeleteLiveTranscodeTemplateRequest, Builder> {
        private String templateId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteLiveTranscodeTemplateRequest request) {
            super(request);
            this.templateId = request.templateId;
        } 

        /**
         * TemplateId.
         */
        public Builder templateId(String templateId) {
            this.putQueryParameter("TemplateId", templateId);
            this.templateId = templateId;
            return this;
        }

        @Override
        public DeleteLiveTranscodeTemplateRequest build() {
            return new DeleteLiveTranscodeTemplateRequest(this);
        } 

    } 

}
