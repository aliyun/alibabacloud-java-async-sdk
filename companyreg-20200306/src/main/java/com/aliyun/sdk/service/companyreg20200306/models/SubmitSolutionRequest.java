// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.companyreg20200306.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SubmitSolutionRequest} extends {@link RequestModel}
 *
 * <p>SubmitSolutionRequest</p>
 */
public class SubmitSolutionRequest extends Request {
    @Query
    @NameInMap("BizType")
    @Validation(required = true)
    private String bizType;

    @Query
    @NameInMap("IntentionBizId")
    @Validation(required = true)
    private String intentionBizId;

    @Query
    @NameInMap("Solution")
    @Validation(required = true)
    private String solution;

    @Query
    @NameInMap("UserId")
    private String userId;

    private SubmitSolutionRequest(Builder builder) {
        super(builder);
        this.bizType = builder.bizType;
        this.intentionBizId = builder.intentionBizId;
        this.solution = builder.solution;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitSolutionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bizType
     */
    public String getBizType() {
        return this.bizType;
    }

    /**
     * @return intentionBizId
     */
    public String getIntentionBizId() {
        return this.intentionBizId;
    }

    /**
     * @return solution
     */
    public String getSolution() {
        return this.solution;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    public static final class Builder extends Request.Builder<SubmitSolutionRequest, Builder> {
        private String bizType; 
        private String intentionBizId; 
        private String solution; 
        private String userId; 

        private Builder() {
            super();
        } 

        private Builder(SubmitSolutionRequest request) {
            super(request);
            this.bizType = request.bizType;
            this.intentionBizId = request.intentionBizId;
            this.solution = request.solution;
            this.userId = request.userId;
        } 

        /**
         * BizType.
         */
        public Builder bizType(String bizType) {
            this.putQueryParameter("BizType", bizType);
            this.bizType = bizType;
            return this;
        }

        /**
         * IntentionBizId.
         */
        public Builder intentionBizId(String intentionBizId) {
            this.putQueryParameter("IntentionBizId", intentionBizId);
            this.intentionBizId = intentionBizId;
            return this;
        }

        /**
         * Solution.
         */
        public Builder solution(String solution) {
            this.putQueryParameter("Solution", solution);
            this.solution = solution;
            return this;
        }

        /**
         * UserId.
         */
        public Builder userId(String userId) {
            this.putQueryParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        @Override
        public SubmitSolutionRequest build() {
            return new SubmitSolutionRequest(this);
        } 

    } 

}
