// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paistudio20220112.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteTrainingJobRequest} extends {@link RequestModel}
 *
 * <p>DeleteTrainingJobRequest</p>
 */
public class DeleteTrainingJobRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("TrainingJobId")
    private String trainingJobId;

    private DeleteTrainingJobRequest(Builder builder) {
        super(builder);
        this.trainingJobId = builder.trainingJobId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteTrainingJobRequest create() {
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

    public static final class Builder extends Request.Builder<DeleteTrainingJobRequest, Builder> {
        private String trainingJobId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteTrainingJobRequest request) {
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
        public DeleteTrainingJobRequest build() {
            return new DeleteTrainingJobRequest(this);
        } 

    } 

}
