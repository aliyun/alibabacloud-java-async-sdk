// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paiautoml20220828.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListHpoTrialCommandsRequest} extends {@link RequestModel}
 *
 * <p>ListHpoTrialCommandsRequest</p>
 */
public class ListHpoTrialCommandsRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("ExperimentId")
    private String experimentId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("TrialId")
    private String trialId;

    private ListHpoTrialCommandsRequest(Builder builder) {
        super(builder);
        this.experimentId = builder.experimentId;
        this.trialId = builder.trialId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListHpoTrialCommandsRequest create() {
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

    public static final class Builder extends Request.Builder<ListHpoTrialCommandsRequest, Builder> {
        private String experimentId; 
        private String trialId; 

        private Builder() {
            super();
        } 

        private Builder(ListHpoTrialCommandsRequest request) {
            super(request);
            this.experimentId = request.experimentId;
            this.trialId = request.trialId;
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
         * Trial id
         */
        public Builder trialId(String trialId) {
            this.putPathParameter("TrialId", trialId);
            this.trialId = trialId;
            return this;
        }

        @Override
        public ListHpoTrialCommandsRequest build() {
            return new ListHpoTrialCommandsRequest(this);
        } 

    } 

}
