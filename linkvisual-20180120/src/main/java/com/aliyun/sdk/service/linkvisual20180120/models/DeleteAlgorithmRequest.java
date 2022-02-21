// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteAlgorithmRequest} extends {@link RequestModel}
 *
 * <p>DeleteAlgorithmRequest</p>
 */
public class DeleteAlgorithmRequest extends Request {
    @Query
    @NameInMap("AlgorithmId")
    @Validation(required = true)
    private Long algorithmId;

    private DeleteAlgorithmRequest(Builder builder) {
        super(builder);
        this.algorithmId = builder.algorithmId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteAlgorithmRequest create() {
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

    public static final class Builder extends Request.Builder<DeleteAlgorithmRequest, Builder> {
        private Long algorithmId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteAlgorithmRequest response) {
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
        public DeleteAlgorithmRequest build() {
            return new DeleteAlgorithmRequest(this);
        } 

    } 

}
