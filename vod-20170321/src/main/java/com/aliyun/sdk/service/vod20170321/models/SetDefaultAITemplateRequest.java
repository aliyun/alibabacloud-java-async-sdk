// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetDefaultAITemplateRequest} extends {@link RequestModel}
 *
 * <p>SetDefaultAITemplateRequest</p>
 */
public class SetDefaultAITemplateRequest extends Request {
    @Query
    @NameInMap("TemplateId")
    @Validation(required = true)
    private String templateId;

    private SetDefaultAITemplateRequest(Builder builder) {
        super(builder);
        this.templateId = builder.templateId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetDefaultAITemplateRequest create() {
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

    public static final class Builder extends Request.Builder<SetDefaultAITemplateRequest, Builder> {
        private String templateId; 

        private Builder() {
            super();
        } 

        private Builder(SetDefaultAITemplateRequest request) {
            super(request);
            this.templateId = request.templateId;
        } 

        /**
         * The ID of the AI template. You can use one of the following methods to obtain the ID of the AI template:
         * <p>
         * 
         * *   Call the [AddAITemplate](~~102930~~) operation to add an AI template if no AI template exists. The value of TemplateId from the response is the ID of the AI template.
         * *   Call the [ListAITemplate](~~102936~~) operation if the template already exists. The value of TemplateId from the response is the ID of the AI template.
         */
        public Builder templateId(String templateId) {
            this.putQueryParameter("TemplateId", templateId);
            this.templateId = templateId;
            return this;
        }

        @Override
        public SetDefaultAITemplateRequest build() {
            return new SetDefaultAITemplateRequest(this);
        } 

    } 

}
