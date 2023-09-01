// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiworkspace20210204.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetModelRequest} extends {@link RequestModel}
 *
 * <p>GetModelRequest</p>
 */
public class GetModelRequest extends Request {
    @Path
    @NameInMap("ModelId")
    @Validation(required = true)
    private String modelId;

    private GetModelRequest(Builder builder) {
        super(builder);
        this.modelId = builder.modelId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetModelRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return modelId
     */
    public String getModelId() {
        return this.modelId;
    }

    public static final class Builder extends Request.Builder<GetModelRequest, Builder> {
        private String modelId; 

        private Builder() {
            super();
        } 

        private Builder(GetModelRequest request) {
            super(request);
            this.modelId = request.modelId;
        } 

        /**
         * ModelId.
         */
        public Builder modelId(String modelId) {
            this.putPathParameter("ModelId", modelId);
            this.modelId = modelId;
            return this;
        }

        @Override
        public GetModelRequest build() {
            return new GetModelRequest(this);
        } 

    } 

}
