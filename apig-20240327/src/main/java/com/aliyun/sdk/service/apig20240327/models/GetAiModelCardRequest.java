// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

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
 * {@link GetAiModelCardRequest} extends {@link RequestModel}
 *
 * <p>GetAiModelCardRequest</p>
 */
public class GetAiModelCardRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("modelCardId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String modelCardId;

    private GetAiModelCardRequest(Builder builder) {
        super(builder);
        this.modelCardId = builder.modelCardId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAiModelCardRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return modelCardId
     */
    public String getModelCardId() {
        return this.modelCardId;
    }

    public static final class Builder extends Request.Builder<GetAiModelCardRequest, Builder> {
        private String modelCardId; 

        private Builder() {
            super();
        } 

        private Builder(GetAiModelCardRequest request) {
            super(request);
            this.modelCardId = request.modelCardId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>mc-8c13d2b4f8a1</p>
         */
        public Builder modelCardId(String modelCardId) {
            this.putPathParameter("modelCardId", modelCardId);
            this.modelCardId = modelCardId;
            return this;
        }

        @Override
        public GetAiModelCardRequest build() {
            return new GetAiModelCardRequest(this);
        } 

    } 

}
