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
 * {@link CreateRelatedConversationRequest} extends {@link RequestModel}
 *
 * <p>CreateRelatedConversationRequest</p>
 */
public class CreateRelatedConversationRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ExerciseCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String exerciseCode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OuterBizId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String outerBizId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UserId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String userId;

    private CreateRelatedConversationRequest(Builder builder) {
        super(builder);
        this.exerciseCode = builder.exerciseCode;
        this.outerBizId = builder.outerBizId;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateRelatedConversationRequest create() {
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
     * @return outerBizId
     */
    public String getOuterBizId() {
        return this.outerBizId;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    public static final class Builder extends Request.Builder<CreateRelatedConversationRequest, Builder> {
        private String exerciseCode; 
        private String outerBizId; 
        private String userId; 

        private Builder() {
            super();
        } 

        private Builder(CreateRelatedConversationRequest request) {
            super(request);
            this.exerciseCode = request.exerciseCode;
            this.outerBizId = request.outerBizId;
            this.userId = request.userId;
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>725e5550-8f81-42e0-a4db-d2de1be52afc</p>
         */
        public Builder outerBizId(String outerBizId) {
            this.putBodyParameter("OuterBizId", outerBizId);
            this.outerBizId = outerBizId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pop_1731848070815</p>
         */
        public Builder userId(String userId) {
            this.putBodyParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        @Override
        public CreateRelatedConversationRequest build() {
            return new CreateRelatedConversationRequest(this);
        } 

    } 

}
