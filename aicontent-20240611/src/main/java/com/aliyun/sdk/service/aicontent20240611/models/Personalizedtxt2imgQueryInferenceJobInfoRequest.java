// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aicontent20240611.models;

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
 * {@link Personalizedtxt2imgQueryInferenceJobInfoRequest} extends {@link RequestModel}
 *
 * <p>Personalizedtxt2imgQueryInferenceJobInfoRequest</p>
 */
public class Personalizedtxt2imgQueryInferenceJobInfoRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("inferenceJobId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String inferenceJobId;

    private Personalizedtxt2imgQueryInferenceJobInfoRequest(Builder builder) {
        super(builder);
        this.inferenceJobId = builder.inferenceJobId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Personalizedtxt2imgQueryInferenceJobInfoRequest create() {
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

    public static final class Builder extends Request.Builder<Personalizedtxt2imgQueryInferenceJobInfoRequest, Builder> {
        private String inferenceJobId; 

        private Builder() {
            super();
        } 

        private Builder(Personalizedtxt2imgQueryInferenceJobInfoRequest request) {
            super(request);
            this.inferenceJobId = request.inferenceJobId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>180</p>
         */
        public Builder inferenceJobId(String inferenceJobId) {
            this.putQueryParameter("inferenceJobId", inferenceJobId);
            this.inferenceJobId = inferenceJobId;
            return this;
        }

        @Override
        public Personalizedtxt2imgQueryInferenceJobInfoRequest build() {
            return new Personalizedtxt2imgQueryInferenceJobInfoRequest(this);
        } 

    } 

}
