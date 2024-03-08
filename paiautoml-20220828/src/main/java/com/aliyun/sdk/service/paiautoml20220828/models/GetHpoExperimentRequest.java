// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paiautoml20220828.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetHpoExperimentRequest} extends {@link RequestModel}
 *
 * <p>GetHpoExperimentRequest</p>
 */
public class GetHpoExperimentRequest extends Request {
    @Path
    @NameInMap("ExperimentId")
    private String experimentId;

    private GetHpoExperimentRequest(Builder builder) {
        super(builder);
        this.experimentId = builder.experimentId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetHpoExperimentRequest create() {
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

    public static final class Builder extends Request.Builder<GetHpoExperimentRequest, Builder> {
        private String experimentId; 

        private Builder() {
            super();
        } 

        private Builder(GetHpoExperimentRequest request) {
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
        public GetHpoExperimentRequest build() {
            return new GetHpoExperimentRequest(this);
        } 

    } 

}
