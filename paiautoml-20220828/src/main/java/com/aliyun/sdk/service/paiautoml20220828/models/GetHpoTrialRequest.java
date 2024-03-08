// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paiautoml20220828.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetHpoTrialRequest} extends {@link RequestModel}
 *
 * <p>GetHpoTrialRequest</p>
 */
public class GetHpoTrialRequest extends Request {
    @Path
    @NameInMap("ExperimentId")
    @Validation(required = true)
    private String experimentId;

    @Path
    @NameInMap("TrialId")
    @Validation(required = true)
    private String trialId;

    private GetHpoTrialRequest(Builder builder) {
        super(builder);
        this.experimentId = builder.experimentId;
        this.trialId = builder.trialId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetHpoTrialRequest create() {
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
     * @return trialId
     */
    public String getTrialId() {
        return this.trialId;
    }

    public static final class Builder extends Request.Builder<GetHpoTrialRequest, Builder> {
        private String experimentId; 
        private String trialId; 

        private Builder() {
            super();
        } 

        private Builder(GetHpoTrialRequest request) {
            super(request);
            this.experimentId = request.experimentId;
            this.trialId = request.trialId;
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
         * trial id
         */
        public Builder trialId(String trialId) {
            this.putPathParameter("TrialId", trialId);
            this.trialId = trialId;
            return this;
        }

        @Override
        public GetHpoTrialRequest build() {
            return new GetHpoTrialRequest(this);
        } 

    } 

}
