// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paistudio20220112.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteTrainingJobLabelsRequest} extends {@link RequestModel}
 *
 * <p>DeleteTrainingJobLabelsRequest</p>
 */
public class DeleteTrainingJobLabelsRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("TrainingJobId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String trainingJobId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Keys")
    @com.aliyun.core.annotation.Validation(required = true)
    private String keys;

    private DeleteTrainingJobLabelsRequest(Builder builder) {
        super(builder);
        this.trainingJobId = builder.trainingJobId;
        this.keys = builder.keys;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteTrainingJobLabelsRequest create() {
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
     * @return keys
     */
    public String getKeys() {
        return this.keys;
    }

    public static final class Builder extends Request.Builder<DeleteTrainingJobLabelsRequest, Builder> {
        private String trainingJobId; 
        private String keys; 

        private Builder() {
            super();
        } 

        private Builder(DeleteTrainingJobLabelsRequest request) {
            super(request);
            this.trainingJobId = request.trainingJobId;
            this.keys = request.keys;
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
         * Keys.
         */
        public Builder keys(String keys) {
            this.putQueryParameter("Keys", keys);
            this.keys = keys;
            return this;
        }

        @Override
        public DeleteTrainingJobLabelsRequest build() {
            return new DeleteTrainingJobLabelsRequest(this);
        } 

    } 

}
