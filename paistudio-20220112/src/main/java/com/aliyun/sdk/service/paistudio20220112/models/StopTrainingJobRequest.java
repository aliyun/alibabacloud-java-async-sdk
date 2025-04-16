// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paistudio20220112.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link StopTrainingJobRequest} extends {@link RequestModel}
 *
 * <p>StopTrainingJobRequest</p>
 */
public class StopTrainingJobRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("TrainingJobId")
    private String trainingJobId;

    private StopTrainingJobRequest(Builder builder) {
        super(builder);
        this.trainingJobId = builder.trainingJobId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StopTrainingJobRequest create() {
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

    public static final class Builder extends Request.Builder<StopTrainingJobRequest, Builder> {
        private String trainingJobId; 

        private Builder() {
            super();
        } 

        private Builder(StopTrainingJobRequest request) {
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
        public StopTrainingJobRequest build() {
            return new StopTrainingJobRequest(this);
        } 

    } 

}
