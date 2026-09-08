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
 * {@link CreateTrainingJobResponseBody} extends {@link TeaModel}
 *
 * <p>CreateTrainingJobResponseBody</p>
 */
public class CreateTrainingJobResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TrainingJobId")
    private String trainingJobId;

    private CreateTrainingJobResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.trainingJobId = builder.trainingJobId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateTrainingJobResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return trainingJobId
     */
    public String getTrainingJobId() {
        return this.trainingJobId;
    }

    public static final class Builder {
        private String requestId; 
        private String trainingJobId; 

        private Builder() {
        } 

        private Builder(CreateTrainingJobResponseBody model) {
            this.requestId = model.requestId;
            this.trainingJobId = model.trainingJobId;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>E7C42CC7-2E85-508A-84F4-923B605FD10F</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The training job ID.</p>
         * 
         * <strong>example:</strong>
         * <p>traineyfz0m2hsfv</p>
         */
        public Builder trainingJobId(String trainingJobId) {
            this.trainingJobId = trainingJobId;
            return this;
        }

        public CreateTrainingJobResponseBody build() {
            return new CreateTrainingJobResponseBody(this);
        } 

    } 

}
