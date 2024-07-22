// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.intelligentcreation20240313.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetTextTemplateRequest} extends {@link RequestModel}
 *
 * <p>GetTextTemplateRequest</p>
 */
public class GetTextTemplateRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("industry")
    private String industry;

    private GetTextTemplateRequest(Builder builder) {
        super(builder);
        this.industry = builder.industry;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTextTemplateRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return industry
     */
    public String getIndustry() {
        return this.industry;
    }

    public static final class Builder extends Request.Builder<GetTextTemplateRequest, Builder> {
        private String industry; 

        private Builder() {
            super();
        } 

        private Builder(GetTextTemplateRequest request) {
            super(request);
            this.industry = request.industry;
        } 

        /**
         * industry.
         */
        public Builder industry(String industry) {
            this.putQueryParameter("industry", industry);
            this.industry = industry;
            return this;
        }

        @Override
        public GetTextTemplateRequest build() {
            return new GetTextTemplateRequest(this);
        } 

    } 

}
