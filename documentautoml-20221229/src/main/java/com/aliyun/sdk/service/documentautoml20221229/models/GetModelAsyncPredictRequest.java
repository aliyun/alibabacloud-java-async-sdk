// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.documentautoml20221229.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetModelAsyncPredictRequest} extends {@link RequestModel}
 *
 * <p>GetModelAsyncPredictRequest</p>
 */
public class GetModelAsyncPredictRequest extends Request {
    @Query
    @NameInMap("AsyncPredictId")
    @Validation(required = true, maximum = 99999999999999D, minimum = 1)
    private Long asyncPredictId;

    private GetModelAsyncPredictRequest(Builder builder) {
        super(builder);
        this.asyncPredictId = builder.asyncPredictId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetModelAsyncPredictRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return asyncPredictId
     */
    public Long getAsyncPredictId() {
        return this.asyncPredictId;
    }

    public static final class Builder extends Request.Builder<GetModelAsyncPredictRequest, Builder> {
        private Long asyncPredictId; 

        private Builder() {
            super();
        } 

        private Builder(GetModelAsyncPredictRequest request) {
            super(request);
            this.asyncPredictId = request.asyncPredictId;
        } 

        /**
         * AsyncPredictId.
         */
        public Builder asyncPredictId(Long asyncPredictId) {
            this.putQueryParameter("AsyncPredictId", asyncPredictId);
            this.asyncPredictId = asyncPredictId;
            return this;
        }

        @Override
        public GetModelAsyncPredictRequest build() {
            return new GetModelAsyncPredictRequest(this);
        } 

    } 

}
