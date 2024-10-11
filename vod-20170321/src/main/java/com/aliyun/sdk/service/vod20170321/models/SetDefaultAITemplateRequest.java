// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link SetDefaultAITemplateRequest} extends {@link RequestModel}
 *
 * <p>SetDefaultAITemplateRequest</p>
 */
public class SetDefaultAITemplateRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateId")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>The ID of the AI template.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1706a0063dd733f6a823ef32e0a5****</p>
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
