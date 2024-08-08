// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paiautoml20220828.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StopHpoTrialsRequest} extends {@link RequestModel}
 *
 * <p>StopHpoTrialsRequest</p>
 */
public class StopHpoTrialsRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("ExperimentId")
    private String experimentId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TrialIds")
    private java.util.List < String > trialIds;

    private StopHpoTrialsRequest(Builder builder) {
        super(builder);
        this.experimentId = builder.experimentId;
        this.trialIds = builder.trialIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StopHpoTrialsRequest create() {
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
     * @return trialIds
     */
    public java.util.List < String > getTrialIds() {
        return this.trialIds;
    }

    public static final class Builder extends Request.Builder<StopHpoTrialsRequest, Builder> {
        private String experimentId; 
        private java.util.List < String > trialIds; 

        private Builder() {
            super();
        } 

        private Builder(StopHpoTrialsRequest request) {
            super(request);
            this.experimentId = request.experimentId;
            this.trialIds = request.trialIds;
        } 

        /**
         * Experiment ID.
         */
        public Builder experimentId(String experimentId) {
            this.putPathParameter("ExperimentId", experimentId);
            this.experimentId = experimentId;
            return this;
        }

        /**
         * Trial Ids to be stopped.
         */
        public Builder trialIds(java.util.List < String > trialIds) {
            this.putBodyParameter("TrialIds", trialIds);
            this.trialIds = trialIds;
            return this;
        }

        @Override
        public StopHpoTrialsRequest build() {
            return new StopHpoTrialsRequest(this);
        } 

    } 

}
