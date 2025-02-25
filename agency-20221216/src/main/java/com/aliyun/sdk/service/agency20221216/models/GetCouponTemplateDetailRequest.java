// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agency20221216.models;

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
 * {@link GetCouponTemplateDetailRequest} extends {@link RequestModel}
 *
 * <p>GetCouponTemplateDetailRequest</p>
 */
public class GetCouponTemplateDetailRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long templateId;

    private GetCouponTemplateDetailRequest(Builder builder) {
        super(builder);
        this.templateId = builder.templateId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCouponTemplateDetailRequest create() {
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

    public static final class Builder extends Request.Builder<GetCouponTemplateDetailRequest, Builder> {
        private Long templateId; 

        private Builder() {
            super();
        } 

        private Builder(GetCouponTemplateDetailRequest request) {
            super(request);
            this.templateId = request.templateId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>5093156</p>
         */
        public Builder templateId(Long templateId) {
            this.putQueryParameter("TemplateId", templateId);
            this.templateId = templateId;
            return this;
        }

        @Override
        public GetCouponTemplateDetailRequest build() {
            return new GetCouponTemplateDetailRequest(this);
        } 

    } 

}
