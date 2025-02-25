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
 * {@link UpdateAnalysisRequest} extends {@link RequestModel}
 *
 * <p>UpdateAnalysisRequest</p>
 */
public class UpdateAnalysisRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Content")
    @com.aliyun.core.annotation.Validation(required = true)
    private String content;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ContentCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String contentCode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ExerciseCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String exerciseCode;

    private UpdateAnalysisRequest(Builder builder) {
        super(builder);
        this.content = builder.content;
        this.contentCode = builder.contentCode;
        this.exerciseCode = builder.exerciseCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateAnalysisRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return content
     */
    public String getContent() {
        return this.content;
    }

    /**
     * @return contentCode
     */
    public String getContentCode() {
        return this.contentCode;
    }

    /**
     * @return exerciseCode
     */
    public String getExerciseCode() {
        return this.exerciseCode;
    }

    public static final class Builder extends Request.Builder<UpdateAnalysisRequest, Builder> {
        private String content; 
        private String contentCode; 
        private String exerciseCode; 

        private Builder() {
            super();
        } 

        private Builder(UpdateAnalysisRequest request) {
            super(request);
            this.content = request.content;
            this.contentCode = request.contentCode;
            this.exerciseCode = request.exerciseCode;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder content(String content) {
            this.putBodyParameter("Content", content);
            this.content = content;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1549d636-b102-4fee-8a99-fcc552aa9aa9</p>
         */
        public Builder contentCode(String contentCode) {
            this.putBodyParameter("ContentCode", contentCode);
            this.contentCode = contentCode;
            return this;
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
        public UpdateAnalysisRequest build() {
            return new UpdateAnalysisRequest(this);
        } 

    } 

}
