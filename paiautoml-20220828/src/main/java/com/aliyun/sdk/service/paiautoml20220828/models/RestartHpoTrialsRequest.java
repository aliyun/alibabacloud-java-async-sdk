// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paiautoml20220828.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RestartHpoTrialsRequest} extends {@link RequestModel}
 *
 * <p>RestartHpoTrialsRequest</p>
 */
public class RestartHpoTrialsRequest extends Request {
    @Path
    @NameInMap("ExperimentId")
    private String experimentId;

    @Body
    @NameInMap("TrialHyperParameters")
    private String trialHyperParameters;

    @Body
    @NameInMap("TrialIds")
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
         * ExperimentId.
         */
        public Builder experimentId(String experimentId) {
            this.putPathParameter("ExperimentId", experimentId);
            this.experimentId = experimentId;
            return this;
        }

        /**
         * TrialHyperParameters.
         */
        public Builder trialHyperParameters(String trialHyperParameters) {
            this.putBodyParameter("TrialHyperParameters", trialHyperParameters);
            this.trialHyperParameters = trialHyperParameters;
            return this;
        }

        /**
         * TrialIds.
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
