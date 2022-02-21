// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetModelDetailByIdRequest} extends {@link RequestModel}
 *
 * <p>GetModelDetailByIdRequest</p>
 */
public class GetModelDetailByIdRequest extends Request {
    @Query
    @NameInMap("ModelId")
    @Validation(required = true)
    private Long modelId;

    private GetModelDetailByIdRequest(Builder builder) {
        super(builder);
        this.modelId = builder.modelId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetModelDetailByIdRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return modelId
     */
    public Long getModelId() {
        return this.modelId;
    }

    public static final class Builder extends Request.Builder<GetModelDetailByIdRequest, Builder> {
        private Long modelId; 

        private Builder() {
            super();
        } 

        private Builder(GetModelDetailByIdRequest response) {
            super(response);
            this.modelId = response.modelId;
        } 

        /**
         * ModelId.
         */
        public Builder modelId(Long modelId) {
            this.putQueryParameter("ModelId", modelId);
            this.modelId = modelId;
            return this;
        }

        @Override
        public GetModelDetailByIdRequest build() {
            return new GetModelDetailByIdRequest(this);
        } 

    } 

}
