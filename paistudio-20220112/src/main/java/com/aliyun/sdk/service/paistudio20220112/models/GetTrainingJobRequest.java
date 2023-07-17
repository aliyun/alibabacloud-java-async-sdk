// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paistudio20220112.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetTrainingJobRequest} extends {@link RequestModel}
 *
 * <p>GetTrainingJobRequest</p>
 */
public class GetTrainingJobRequest extends Request {
    @Path
    @NameInMap("TrainingJobId")
    @Validation(required = true)
    private String trainingJobId;

    private GetTrainingJobRequest(Builder builder) {
        super(builder);
        this.trainingJobId = builder.trainingJobId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTrainingJobRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return trainingJobId
     */
    public String getTrainingJobId() {
        return this.trainingJobId;
    }

    public static final class Builder extends Request.Builder<GetTrainingJobRequest, Builder> {
        private String trainingJobId; 

        private Builder() {
            super();
        } 

        private Builder(GetTrainingJobRequest request) {
            super(request);
            this.trainingJobId = request.trainingJobId;
        } 

        /**
         * TrainingJobId.
         */
        public Builder trainingJobId(String trainingJobId) {
            this.putPathParameter("TrainingJobId", trainingJobId);
            this.trainingJobId = trainingJobId;
            return this;
        }

        @Override
        public GetTrainingJobRequest build() {
            return new GetTrainingJobRequest(this);
        } 

    } 

}
