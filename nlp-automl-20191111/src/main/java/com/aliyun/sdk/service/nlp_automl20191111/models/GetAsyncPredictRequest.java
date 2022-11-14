// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nlp_automl20191111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAsyncPredictRequest} extends {@link RequestModel}
 *
 * <p>GetAsyncPredictRequest</p>
 */
public class GetAsyncPredictRequest extends Request {
    @Query
    @NameInMap("AsyncPredictId")
    @Validation(required = true)
    private Integer asyncPredictId;

    private GetAsyncPredictRequest(Builder builder) {
        super(builder);
        this.asyncPredictId = builder.asyncPredictId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAsyncPredictRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return asyncPredictId
     */
    public Integer getAsyncPredictId() {
        return this.asyncPredictId;
    }

    public static final class Builder extends Request.Builder<GetAsyncPredictRequest, Builder> {
        private Integer asyncPredictId; 

        private Builder() {
            super();
        } 

        private Builder(GetAsyncPredictRequest request) {
            super(request);
            this.asyncPredictId = request.asyncPredictId;
        } 

        /**
         * AsyncPredictId.
         */
        public Builder asyncPredictId(Integer asyncPredictId) {
            this.putQueryParameter("AsyncPredictId", asyncPredictId);
            this.asyncPredictId = asyncPredictId;
            return this;
        }

        @Override
        public GetAsyncPredictRequest build() {
            return new GetAsyncPredictRequest(this);
        } 

    } 

}
