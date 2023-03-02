// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDefaultAITemplateRequest} extends {@link RequestModel}
 *
 * <p>GetDefaultAITemplateRequest</p>
 */
public class GetDefaultAITemplateRequest extends Request {
    @Query
    @NameInMap("TemplateType")
    @Validation(required = true)
    private String templateType;

    private GetDefaultAITemplateRequest(Builder builder) {
        super(builder);
        this.templateType = builder.templateType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDefaultAITemplateRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return templateType
     */
    public String getTemplateType() {
        return this.templateType;
    }

    public static final class Builder extends Request.Builder<GetDefaultAITemplateRequest, Builder> {
        private String templateType; 

        private Builder() {
            super();
        } 

        private Builder(GetDefaultAITemplateRequest request) {
            super(request);
            this.templateType = request.templateType;
        } 

        /**
         * The type of the AI template. Set the value to **AIMediaAudit**, which specifies the automated review.
         */
        public Builder templateType(String templateType) {
            this.putQueryParameter("TemplateType", templateType);
            this.templateType = templateType;
            return this;
        }

        @Override
        public GetDefaultAITemplateRequest build() {
            return new GetDefaultAITemplateRequest(this);
        } 

    } 

}
