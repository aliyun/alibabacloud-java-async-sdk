// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aimath20241114.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GenAnalysisRequest} extends {@link RequestModel}
 *
 * <p>GenAnalysisRequest</p>
 */
public class GenAnalysisRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ExerciseContent")
    @com.aliyun.core.annotation.Validation(required = true)
    private String exerciseContent;

    private GenAnalysisRequest(Builder builder) {
        super(builder);
        this.exerciseContent = builder.exerciseContent;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GenAnalysisRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return exerciseContent
     */
    public String getExerciseContent() {
        return this.exerciseContent;
    }

    public static final class Builder extends Request.Builder<GenAnalysisRequest, Builder> {
        private String exerciseContent; 

        private Builder() {
            super();
        } 

        private Builder(GenAnalysisRequest request) {
            super(request);
            this.exerciseContent = request.exerciseContent;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder exerciseContent(String exerciseContent) {
            this.putBodyParameter("ExerciseContent", exerciseContent);
            this.exerciseContent = exerciseContent;
            return this;
        }

        @Override
        public GenAnalysisRequest build() {
            return new GenAnalysisRequest(this);
        } 

    } 

}
