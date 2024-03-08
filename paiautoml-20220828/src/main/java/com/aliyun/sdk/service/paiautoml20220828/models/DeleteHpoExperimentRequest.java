// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paiautoml20220828.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteHpoExperimentRequest} extends {@link RequestModel}
 *
 * <p>DeleteHpoExperimentRequest</p>
 */
public class DeleteHpoExperimentRequest extends Request {
    @Path
    @NameInMap("ExperimentId")
    private String experimentId;

    private DeleteHpoExperimentRequest(Builder builder) {
        super(builder);
        this.experimentId = builder.experimentId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteHpoExperimentRequest create() {
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

    public static final class Builder extends Request.Builder<DeleteHpoExperimentRequest, Builder> {
        private String experimentId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteHpoExperimentRequest request) {
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
        public DeleteHpoExperimentRequest build() {
            return new DeleteHpoExperimentRequest(this);
        } 

    } 

}
