// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aicontent20240611.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link PersonalizedTextToImageQueryPreModelInferenceJobInfoRequest} extends {@link RequestModel}
 *
 * <p>PersonalizedTextToImageQueryPreModelInferenceJobInfoRequest</p>
 */
public class PersonalizedTextToImageQueryPreModelInferenceJobInfoRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("inferenceJobId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String inferenceJobId;

    private PersonalizedTextToImageQueryPreModelInferenceJobInfoRequest(Builder builder) {
        super(builder);
        this.inferenceJobId = builder.inferenceJobId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PersonalizedTextToImageQueryPreModelInferenceJobInfoRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return inferenceJobId
     */
    public String getInferenceJobId() {
        return this.inferenceJobId;
    }

    public static final class Builder extends Request.Builder<PersonalizedTextToImageQueryPreModelInferenceJobInfoRequest, Builder> {
        private String inferenceJobId; 

        private Builder() {
            super();
        } 

        private Builder(PersonalizedTextToImageQueryPreModelInferenceJobInfoRequest request) {
            super(request);
            this.inferenceJobId = request.inferenceJobId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>girl-xxxx-xxxx-xxxx-xxxx</p>
         */
        public Builder inferenceJobId(String inferenceJobId) {
            this.putQueryParameter("inferenceJobId", inferenceJobId);
            this.inferenceJobId = inferenceJobId;
            return this;
        }

        @Override
        public PersonalizedTextToImageQueryPreModelInferenceJobInfoRequest build() {
            return new PersonalizedTextToImageQueryPreModelInferenceJobInfoRequest(this);
        } 

    } 

}
