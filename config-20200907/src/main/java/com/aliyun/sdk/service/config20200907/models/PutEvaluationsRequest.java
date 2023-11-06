// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20200907.models;

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
    @NameInMap("DeleteMode")
    private Boolean deleteMode;

    @Body
    @NameInMap("Evaluations")
    private String evaluations;

    @Body
    @NameInMap("ResultToken")
    @Validation(required = true)
    private String resultToken;

    private PutEvaluationsRequest(Builder builder) {
        super(builder);
        this.deleteMode = builder.deleteMode;
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
     * @return deleteMode
     */
    public Boolean getDeleteMode() {
        return this.deleteMode;
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
        private Boolean deleteMode; 
        private String evaluations; 
        private String resultToken; 

        private Builder() {
            super();
        } 

        private Builder(PutEvaluationsRequest request) {
            super(request);
            this.deleteMode = request.deleteMode;
            this.evaluations = request.evaluations;
            this.resultToken = request.resultToken;
        } 

        /**
         * Specifies whether to enable the delete mode. Valid values:
         * <p>
         * 
         * *   true: enables the delete mode
         * *   false (default): disables the delete mode
         * 
         * > This parameter is valid only when you manually trigger or periodically trigger custom rules to evaluate resources. If you enable the delete mode, the evaluation results that are not updated during the current evaluation are automatically deleted.
         */
        public Builder deleteMode(Boolean deleteMode) {
            this.putBodyParameter("DeleteMode", deleteMode);
            this.deleteMode = deleteMode;
            return this;
        }

        /**
         * The evaluation results.
         */
        public Builder evaluations(String evaluations) {
            this.putBodyParameter("Evaluations", evaluations);
            this.evaluations = evaluations;
            return this;
        }

        /**
         * The callback token. When Cloud Config triggers a custom rule to evaluate resources, the token information is sent to Function Compute as an input parameter. The token must be specified when you submit the evaluation results.
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
