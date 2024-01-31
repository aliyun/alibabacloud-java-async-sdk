// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paifeaturestore20230621.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateModelFeatureTrainingSetFGTableResponseBody} extends {@link TeaModel}
 *
 * <p>CreateModelFeatureTrainingSetFGTableResponseBody</p>
 */
public class CreateModelFeatureTrainingSetFGTableResponseBody extends TeaModel {
    @NameInMap("TrainingSetFGTableName")
    private String trainingSetFGTableName;

    @NameInMap("requestId")
    private String requestId;

    private CreateModelFeatureTrainingSetFGTableResponseBody(Builder builder) {
        this.trainingSetFGTableName = builder.trainingSetFGTableName;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateModelFeatureTrainingSetFGTableResponseBody create() {
        return builder().build();
    }

    /**
     * @return trainingSetFGTableName
     */
    public String getTrainingSetFGTableName() {
        return this.trainingSetFGTableName;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String trainingSetFGTableName; 
        private String requestId; 

        /**
         * TrainingSetFGTableName.
         */
        public Builder trainingSetFGTableName(String trainingSetFGTableName) {
            this.trainingSetFGTableName = trainingSetFGTableName;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateModelFeatureTrainingSetFGTableResponseBody build() {
            return new CreateModelFeatureTrainingSetFGTableResponseBody(this);
        } 

    } 

}
