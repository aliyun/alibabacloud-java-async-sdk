// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paiautoml20220828.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RestartHpoTrialsRequest} extends {@link RequestModel}
 *
 * <p>RestartHpoTrialsRequest</p>
 */
public class RestartHpoTrialsRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("ExperimentId")
    private String experimentId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TrialHyperParameters")
    private String trialHyperParameters;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TrialIds")
    private java.util.List < String > trialIds;

    private RestartHpoTrialsRequest(Builder builder) {
        super(builder);
        this.experimentId = builder.experimentId;
        this.trialHyperParameters = builder.trialHyperParameters;
        this.trialIds = builder.trialIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RestartHpoTrialsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return experimentId
     */
    public String getExperimentId() {
        return this.experimentId;
    }

    /**
     * @return trialHyperParameters
     */
    public String getTrialHyperParameters() {
        return this.trialHyperParameters;
    }

    /**
     * @return trialIds
     */
    public java.util.List < String > getTrialIds() {
        return this.trialIds;
    }

    public static final class Builder extends Request.Builder<RestartHpoTrialsRequest, Builder> {
        private String experimentId; 
        private String trialHyperParameters; 
        private java.util.List < String > trialIds; 

        private Builder() {
            super();
        } 

        private Builder(RestartHpoTrialsRequest request) {
            super(request);
            this.experimentId = request.experimentId;
            this.trialHyperParameters = request.trialHyperParameters;
            this.trialIds = request.trialIds;
        } 

        /**
         * Experiment ID
         */
        public Builder experimentId(String experimentId) {
            this.putPathParameter("ExperimentId", experimentId);
            this.experimentId = experimentId;
            return this;
        }

        /**
         * A hyperparameter combination instance.
         */
        public Builder trialHyperParameters(String trialHyperParameters) {
            this.putBodyParameter("TrialHyperParameters", trialHyperParameters);
            this.trialHyperParameters = trialHyperParameters;
            return this;
        }

        /**
         * Trial ID array.
         */
        public Builder trialIds(java.util.List < String > trialIds) {
            this.putBodyParameter("TrialIds", trialIds);
            this.trialIds = trialIds;
            return this;
        }

        @Override
        public RestartHpoTrialsRequest build() {
            return new RestartHpoTrialsRequest(this);
        } 

    } 

}
