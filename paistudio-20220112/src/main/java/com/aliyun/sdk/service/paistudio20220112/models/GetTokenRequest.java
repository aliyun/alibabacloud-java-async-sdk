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
 * {@link GetTokenRequest} extends {@link RequestModel}
 *
 * <p>GetTokenRequest</p>
 */
public class GetTokenRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExpireTime")
    private Long expireTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TrainingJobId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String trainingJobId;

    private GetTokenRequest(Builder builder) {
        super(builder);
        this.expireTime = builder.expireTime;
        this.trainingJobId = builder.trainingJobId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTokenRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return expireTime
     */
    public Long getExpireTime() {
        return this.expireTime;
    }

    /**
     * @return trainingJobId
     */
    public String getTrainingJobId() {
        return this.trainingJobId;
    }

    public static final class Builder extends Request.Builder<GetTokenRequest, Builder> {
        private Long expireTime; 
        private String trainingJobId; 

        private Builder() {
            super();
        } 

        private Builder(GetTokenRequest request) {
            super(request);
            this.expireTime = request.expireTime;
            this.trainingJobId = request.trainingJobId;
        } 

        /**
         * ExpireTime.
         */
        public Builder expireTime(Long expireTime) {
            this.putQueryParameter("ExpireTime", expireTime);
            this.expireTime = expireTime;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>traincclrt205dcs</p>
         */
        public Builder trainingJobId(String trainingJobId) {
            this.putQueryParameter("TrainingJobId", trainingJobId);
            this.trainingJobId = trainingJobId;
            return this;
        }

        @Override
        public GetTokenRequest build() {
            return new GetTokenRequest(this);
        } 

    } 

}
