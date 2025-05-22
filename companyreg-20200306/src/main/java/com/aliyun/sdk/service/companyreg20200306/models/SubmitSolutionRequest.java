// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.companyreg20200306.models;

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
 * {@link SubmitSolutionRequest} extends {@link RequestModel}
 *
 * <p>SubmitSolutionRequest</p>
 */
public class SubmitSolutionRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String bizType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IntentionBizId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String intentionBizId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OperateType")
    private String operateType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Solution")
    @com.aliyun.core.annotation.Validation(required = true)
    private String solution;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserId")
    private String userId;

    private SubmitSolutionRequest(Builder builder) {
        super(builder);
        this.bizType = builder.bizType;
        this.intentionBizId = builder.intentionBizId;
        this.operateType = builder.operateType;
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
     * @return operateType
     */
    public String getOperateType() {
        return this.operateType;
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
        private String operateType; 
        private String solution; 
        private String userId; 

        private Builder() {
            super();
        } 

        private Builder(SubmitSolutionRequest request) {
            super(request);
            this.bizType = request.bizType;
            this.intentionBizId = request.intentionBizId;
            this.operateType = request.operateType;
            this.solution = request.solution;
            this.userId = request.userId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>esp.wangwen</p>
         */
        public Builder bizType(String bizType) {
            this.putQueryParameter("BizType", bizType);
            this.bizType = bizType;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>I20211223101045000001</p>
         */
        public Builder intentionBizId(String intentionBizId) {
            this.putQueryParameter("IntentionBizId", intentionBizId);
            this.intentionBizId = intentionBizId;
            return this;
        }

        /**
         * OperateType.
         */
        public Builder operateType(String operateType) {
            this.putQueryParameter("OperateType", operateType);
            this.operateType = operateType;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
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
