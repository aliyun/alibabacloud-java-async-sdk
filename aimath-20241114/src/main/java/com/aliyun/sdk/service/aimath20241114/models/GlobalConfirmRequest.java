// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aimath20241114.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GlobalConfirmRequest} extends {@link RequestModel}
 *
 * <p>GlobalConfirmRequest</p>
 */
public class GlobalConfirmRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ExerciseCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String exerciseCode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Tag")
    private String tag;

    private GlobalConfirmRequest(Builder builder) {
        super(builder);
        this.exerciseCode = builder.exerciseCode;
        this.tag = builder.tag;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GlobalConfirmRequest create() {
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

    /**
     * @return tag
     */
    public String getTag() {
        return this.tag;
    }

    public static final class Builder extends Request.Builder<GlobalConfirmRequest, Builder> {
        private String exerciseCode; 
        private String tag; 

        private Builder() {
            super();
        } 

        private Builder(GlobalConfirmRequest request) {
            super(request);
            this.exerciseCode = request.exerciseCode;
            this.tag = request.tag;
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

        /**
         * Tag.
         */
        public Builder tag(String tag) {
            this.putBodyParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        @Override
        public GlobalConfirmRequest build() {
            return new GlobalConfirmRequest(this);
        } 

    } 

}
