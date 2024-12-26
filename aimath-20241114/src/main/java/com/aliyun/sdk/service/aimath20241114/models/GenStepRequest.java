// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aimath20241114.models;

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
 * {@link GenStepRequest} extends {@link RequestModel}
 *
 * <p>GenStepRequest</p>
 */
public class GenStepRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ExerciseCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String exerciseCode;

    private GenStepRequest(Builder builder) {
        super(builder);
        this.exerciseCode = builder.exerciseCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GenStepRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return exerciseCode
     */
    public String getExerciseCode() {
        return this.exerciseCode;
    }

    public static final class Builder extends Request.Builder<GenStepRequest, Builder> {
        private String exerciseCode; 

        private Builder() {
            super();
        } 

        private Builder(GenStepRequest request) {
            super(request);
            this.exerciseCode = request.exerciseCode;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Ex_pop_1731848070815_funI</p>
         */
        public Builder exerciseCode(String exerciseCode) {
            this.putBodyParameter("ExerciseCode", exerciseCode);
            this.exerciseCode = exerciseCode;
            return this;
        }

        @Override
        public GenStepRequest build() {
            return new GenStepRequest(this);
        } 

    } 

}
