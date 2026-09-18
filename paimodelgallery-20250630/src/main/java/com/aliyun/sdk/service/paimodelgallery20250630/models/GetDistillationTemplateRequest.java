// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paimodelgallery20250630.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetDistillationTemplateRequest} extends {@link RequestModel}
 *
 * <p>GetDistillationTemplateRequest</p>
 */
public class GetDistillationTemplateRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("TemplateId")
    private String templateId;

    private GetDistillationTemplateRequest(Builder builder) {
        super(builder);
        this.templateId = builder.templateId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDistillationTemplateRequest create() {
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

    public static final class Builder extends Request.Builder<GetDistillationTemplateRequest, Builder> {
        private String templateId; 

        private Builder() {
            super();
        } 

        private Builder(GetDistillationTemplateRequest request) {
            super(request);
            this.templateId = request.templateId;
        } 

        /**
         * <p>The distillation template ID, obtained from the TemplateId field returned by the <code>ListDistillationTemplates</code> operation.</p>
         * 
         * <strong>example:</strong>
         * <p>advanced_cot_distill</p>
         */
        public Builder templateId(String templateId) {
            this.putPathParameter("TemplateId", templateId);
            this.templateId = templateId;
            return this;
        }

        @Override
        public GetDistillationTemplateRequest build() {
            return new GetDistillationTemplateRequest(this);
        } 

    } 

}
