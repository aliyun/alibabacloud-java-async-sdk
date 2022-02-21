// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nlp20180408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ReviewAnalysisRequest} extends {@link RequestModel}
 *
 * <p>ReviewAnalysisRequest</p>
 */
public class ReviewAnalysisRequest extends Request {
    @Path
    @NameInMap("Domain")
    @Validation(required = true)
    private String domain;

    private ReviewAnalysisRequest(Builder builder) {
        super(builder);
        this.domain = builder.domain;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ReviewAnalysisRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return domain
     */
    public String getDomain() {
        return this.domain;
    }

    public static final class Builder extends Request.Builder<ReviewAnalysisRequest, Builder> {
        private String domain; 

        private Builder() {
            super();
        } 

        private Builder(ReviewAnalysisRequest response) {
            super(response);
            this.domain = response.domain;
        } 

        /**
         * Domain.
         */
        public Builder domain(String domain) {
            this.putPathParameter("Domain", domain);
            this.domain = domain;
            return this;
        }

        @Override
        public ReviewAnalysisRequest build() {
            return new ReviewAnalysisRequest(this);
        } 

    } 

}
