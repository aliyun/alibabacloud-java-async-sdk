// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paiautoml20220828.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StopHpoExperimentRequest} extends {@link RequestModel}
 *
 * <p>StopHpoExperimentRequest</p>
 */
public class StopHpoExperimentRequest extends Request {
    @Path
    @NameInMap("ExperimentId")
    @Validation(required = true)
    private String experimentId;

    private StopHpoExperimentRequest(Builder builder) {
        super(builder);
        this.experimentId = builder.experimentId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StopHpoExperimentRequest create() {
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

    public static final class Builder extends Request.Builder<StopHpoExperimentRequest, Builder> {
        private String experimentId; 

        private Builder() {
            super();
        } 

        private Builder(StopHpoExperimentRequest request) {
            super(request);
            this.experimentId = request.experimentId;
        } 

        /**
         * ExperimentId.
         */
        public Builder experimentId(String experimentId) {
            this.putPathParameter("ExperimentId", experimentId);
            this.experimentId = experimentId;
            return this;
        }

        @Override
        public StopHpoExperimentRequest build() {
            return new StopHpoExperimentRequest(this);
        } 

    } 

}
