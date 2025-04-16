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
 * {@link GetTrainingJobErrorInfoRequest} extends {@link RequestModel}
 *
 * <p>GetTrainingJobErrorInfoRequest</p>
 */
public class GetTrainingJobErrorInfoRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("TrainingJobId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String trainingJobId;

    private GetTrainingJobErrorInfoRequest(Builder builder) {
        super(builder);
        this.trainingJobId = builder.trainingJobId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTrainingJobErrorInfoRequest create() {
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

    public static final class Builder extends Request.Builder<GetTrainingJobErrorInfoRequest, Builder> {
        private String trainingJobId; 

        private Builder() {
            super();
        } 

        private Builder(GetTrainingJobErrorInfoRequest request) {
            super(request);
            this.trainingJobId = request.trainingJobId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>traineyfz0m2hsfv</p>
         */
        public Builder trainingJobId(String trainingJobId) {
            this.putPathParameter("TrainingJobId", trainingJobId);
            this.trainingJobId = trainingJobId;
            return this;
        }

        @Override
        public GetTrainingJobErrorInfoRequest build() {
            return new GetTrainingJobErrorInfoRequest(this);
        } 

    } 

}
