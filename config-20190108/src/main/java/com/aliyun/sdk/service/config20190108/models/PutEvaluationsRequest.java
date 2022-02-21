// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20190108.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PutEvaluationsRequest} extends {@link RequestModel}
 *
 * <p>PutEvaluationsRequest</p>
 */
public class PutEvaluationsRequest extends Request {
    @Body
    @NameInMap("Evaluations")
    private String evaluations;

    @Body
    @NameInMap("ResultToken")
    @Validation(required = true)
    private String resultToken;

    private PutEvaluationsRequest(Builder builder) {
        super(builder);
        this.evaluations = builder.evaluations;
        this.resultToken = builder.resultToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PutEvaluationsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return evaluations
     */
    public String getEvaluations() {
        return this.evaluations;
    }

    /**
     * @return resultToken
     */
    public String getResultToken() {
        return this.resultToken;
    }

    public static final class Builder extends Request.Builder<PutEvaluationsRequest, Builder> {
        private String evaluations; 
        private String resultToken; 

        private Builder() {
            super();
        } 

        private Builder(PutEvaluationsRequest response) {
            super(response);
            this.evaluations = response.evaluations;
            this.resultToken = response.resultToken;
        } 

        /**
         * Evaluations.
         */
        public Builder evaluations(String evaluations) {
            this.putBodyParameter("Evaluations", evaluations);
            this.evaluations = evaluations;
            return this;
        }

        /**
         * ResultToken.
         */
        public Builder resultToken(String resultToken) {
            this.putBodyParameter("ResultToken", resultToken);
            this.resultToken = resultToken;
            return this;
        }

        @Override
        public PutEvaluationsRequest build() {
            return new PutEvaluationsRequest(this);
        } 

    } 

}
