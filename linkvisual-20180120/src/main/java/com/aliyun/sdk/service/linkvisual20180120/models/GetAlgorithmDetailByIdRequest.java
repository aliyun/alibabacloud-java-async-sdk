// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAlgorithmDetailByIdRequest} extends {@link RequestModel}
 *
 * <p>GetAlgorithmDetailByIdRequest</p>
 */
public class GetAlgorithmDetailByIdRequest extends Request {
    @Query
    @NameInMap("AlgorithmId")
    @Validation(required = true)
    private Long algorithmId;

    private GetAlgorithmDetailByIdRequest(Builder builder) {
        super(builder);
        this.algorithmId = builder.algorithmId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAlgorithmDetailByIdRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return algorithmId
     */
    public Long getAlgorithmId() {
        return this.algorithmId;
    }

    public static final class Builder extends Request.Builder<GetAlgorithmDetailByIdRequest, Builder> {
        private Long algorithmId; 

        private Builder() {
            super();
        } 

        private Builder(GetAlgorithmDetailByIdRequest response) {
            super(response);
            this.algorithmId = response.algorithmId;
        } 

        /**
         * AlgorithmId.
         */
        public Builder algorithmId(Long algorithmId) {
            this.putQueryParameter("AlgorithmId", algorithmId);
            this.algorithmId = algorithmId;
            return this;
        }

        @Override
        public GetAlgorithmDetailByIdRequest build() {
            return new GetAlgorithmDetailByIdRequest(this);
        } 

    } 

}
