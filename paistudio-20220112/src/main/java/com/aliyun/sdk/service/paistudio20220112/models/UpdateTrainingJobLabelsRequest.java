// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paistudio20220112.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateTrainingJobLabelsRequest} extends {@link RequestModel}
 *
 * <p>UpdateTrainingJobLabelsRequest</p>
 */
public class UpdateTrainingJobLabelsRequest extends Request {
    @Path
    @NameInMap("TrainingJobId")
    @Validation(required = true)
    private String trainingJobId;

    @Body
    @NameInMap("Labels")
    private java.util.List < Labels> labels;

    private UpdateTrainingJobLabelsRequest(Builder builder) {
        super(builder);
        this.trainingJobId = builder.trainingJobId;
        this.labels = builder.labels;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateTrainingJobLabelsRequest create() {
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
     * @return labels
     */
    public java.util.List < Labels> getLabels() {
        return this.labels;
    }

    public static final class Builder extends Request.Builder<UpdateTrainingJobLabelsRequest, Builder> {
        private String trainingJobId; 
        private java.util.List < Labels> labels; 

        private Builder() {
            super();
        } 

        private Builder(UpdateTrainingJobLabelsRequest request) {
            super(request);
            this.trainingJobId = request.trainingJobId;
            this.labels = request.labels;
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
         * Labels.
         */
        public Builder labels(java.util.List < Labels> labels) {
            this.putBodyParameter("Labels", labels);
            this.labels = labels;
            return this;
        }

        @Override
        public UpdateTrainingJobLabelsRequest build() {
            return new UpdateTrainingJobLabelsRequest(this);
        } 

    } 

    public static class Labels extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
        private String value;

        private Labels(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Labels create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            /**
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Labels build() {
                return new Labels(this);
            } 

        } 

    }
}
