// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paiautoml20220828.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListHpoTrialLogNamesRequest} extends {@link RequestModel}
 *
 * <p>ListHpoTrialLogNamesRequest</p>
 */
public class ListHpoTrialLogNamesRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("ExperimentId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String experimentId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("TrialId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String trialId;

    private ListHpoTrialLogNamesRequest(Builder builder) {
        super(builder);
        this.experimentId = builder.experimentId;
        this.trialId = builder.trialId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListHpoTrialLogNamesRequest create() {
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

    public static final class Builder extends Request.Builder<ListHpoTrialLogNamesRequest, Builder> {
        private String experimentId; 
        private String trialId; 

        private Builder() {
            super();
        } 

        private Builder(ListHpoTrialLogNamesRequest request) {
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
        public ListHpoTrialLogNamesRequest build() {
            return new ListHpoTrialLogNamesRequest(this);
        } 

    } 

}
