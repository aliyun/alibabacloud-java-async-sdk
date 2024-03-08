// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paiautoml20220828.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StopHpoTrialsRequest} extends {@link RequestModel}
 *
 * <p>StopHpoTrialsRequest</p>
 */
public class StopHpoTrialsRequest extends Request {
    @Path
    @NameInMap("ExperimentId")
    private String experimentId;

    @Body
    @NameInMap("TrialIds")
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
         * ExperimentId.
         */
        public Builder experimentId(String experimentId) {
            this.putPathParameter("ExperimentId", experimentId);
            this.experimentId = experimentId;
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
        public StopHpoTrialsRequest build() {
            return new StopHpoTrialsRequest(this);
        } 

    } 

}
