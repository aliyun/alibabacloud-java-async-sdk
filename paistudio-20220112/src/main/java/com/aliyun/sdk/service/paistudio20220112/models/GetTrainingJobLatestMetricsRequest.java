// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paistudio20220112.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetTrainingJobLatestMetricsRequest} extends {@link RequestModel}
 *
 * <p>GetTrainingJobLatestMetricsRequest</p>
 */
public class GetTrainingJobLatestMetricsRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("TrainingJobId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String trainingJobId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Names")
    private String names;

    private GetTrainingJobLatestMetricsRequest(Builder builder) {
        super(builder);
        this.trainingJobId = builder.trainingJobId;
        this.names = builder.names;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTrainingJobLatestMetricsRequest create() {
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

    /**
     * @return names
     */
    public String getNames() {
        return this.names;
    }

    public static final class Builder extends Request.Builder<GetTrainingJobLatestMetricsRequest, Builder> {
        private String trainingJobId; 
        private String names; 

        private Builder() {
            super();
        } 

        private Builder(GetTrainingJobLatestMetricsRequest request) {
            super(request);
            this.trainingJobId = request.trainingJobId;
            this.names = request.names;
        } 

        /**
         * TrainingJobId.
         */
        public Builder trainingJobId(String trainingJobId) {
            this.putPathParameter("TrainingJobId", trainingJobId);
            this.trainingJobId = trainingJobId;
            return this;
        }

        /**
         * Names.
         */
        public Builder names(String names) {
            this.putQueryParameter("Names", names);
            this.names = names;
            return this;
        }

        @Override
        public GetTrainingJobLatestMetricsRequest build() {
            return new GetTrainingJobLatestMetricsRequest(this);
        } 

    } 

}
