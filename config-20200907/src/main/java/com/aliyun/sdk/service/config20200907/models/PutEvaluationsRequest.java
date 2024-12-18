// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20200907.models;

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
 * {@link PutEvaluationsRequest} extends {@link RequestModel}
 *
 * <p>PutEvaluationsRequest</p>
 */
public class PutEvaluationsRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DeleteMode")
    private Boolean deleteMode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Evaluations")
    private String evaluations;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ResultToken")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>Specifies whether to enable the delete mode. Valid values:</p>
         * <ul>
         * <li>true: enables the delete mode</li>
         * <li>false (default): disables the delete mode</li>
         * </ul>
         * <blockquote>
         * <p>This parameter is valid only when you manually trigger or periodically trigger custom rules to evaluate resources. If you enable the delete mode, the evaluation results that are not updated during the current evaluation are automatically deleted.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder deleteMode(Boolean deleteMode) {
            this.putBodyParameter("DeleteMode", deleteMode);
            this.deleteMode = deleteMode;
            return this;
        }

        /**
         * <p>The evaluation results.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;accountId&quot;:120886317861****,&quot;annotation&quot;:&quot;The flow log is not enabled.&quot;,&quot;complianceResourceId&quot;:&quot;flowlog-o6wdfo1yvgo4i8****&quot;,&quot;complianceResourceType&quot;:&quot;ACS::CEN::Flowlog&quot;,&quot;complianceRegionId&quot;:&quot;cn-shanghai&quot;,&quot;complianceType&quot;:&quot;NON_COMPLIANT&quot;,&quot;orderingTimestamp&quot;:1588907220408}]</p>
         */
        public Builder evaluations(String evaluations) {
            this.putBodyParameter("Evaluations", evaluations);
            this.evaluations = evaluations;
            return this;
        }

        /**
         * <p>The callback token. When Cloud Config triggers a custom rule to evaluate resources, the token information is sent to Function Compute as an input parameter. The token must be specified when you submit the evaluation results.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>=lAUbfkWp7GL9AFoQEIStinqBMc4FC8sHvip/1F1npkWUDNS2GEm6xwL6Zl/fSr0bbkWY+aiCLjTJxnp4H/yp/8p/Q8VCAtqG5uhRii4sfnYRnTPnE****</p>
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
