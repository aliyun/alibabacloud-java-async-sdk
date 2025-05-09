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
 * {@link UpdateTrainingJobLabelsRequest} extends {@link RequestModel}
 *
 * <p>UpdateTrainingJobLabelsRequest</p>
 */
public class UpdateTrainingJobLabelsRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("TrainingJobId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String trainingJobId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Labels")
    private java.util.List<Labels> labels;

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
    public java.util.List<Labels> getLabels() {
        return this.labels;
    }

    public static final class Builder extends Request.Builder<UpdateTrainingJobLabelsRequest, Builder> {
        private String trainingJobId; 
        private java.util.List<Labels> labels; 

        private Builder() {
            super();
        } 

        private Builder(UpdateTrainingJobLabelsRequest request) {
            super(request);
            this.trainingJobId = request.trainingJobId;
            this.labels = request.labels;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>train76rcaupa2cz</p>
         */
        public Builder trainingJobId(String trainingJobId) {
            this.putPathParameter("TrainingJobId", trainingJobId);
            this.trainingJobId = trainingJobId;
            return this;
        }

        /**
         * Labels.
         */
        public Builder labels(java.util.List<Labels> labels) {
            this.putBodyParameter("Labels", labels);
            this.labels = labels;
            return this;
        }

        @Override
        public UpdateTrainingJobLabelsRequest build() {
            return new UpdateTrainingJobLabelsRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateTrainingJobLabelsRequest} extends {@link TeaModel}
     *
     * <p>UpdateTrainingJobLabelsRequest</p>
     */
    public static class Labels extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
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

            private Builder() {
            } 

            private Builder(Labels model) {
                this.key = model.key;
                this.value = model.value;
            } 

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
