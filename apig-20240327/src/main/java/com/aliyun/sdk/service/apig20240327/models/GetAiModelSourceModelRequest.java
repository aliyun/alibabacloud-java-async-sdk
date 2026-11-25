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
 * {@link GetAiModelSourceModelRequest} extends {@link RequestModel}
 *
 * <p>GetAiModelSourceModelRequest</p>
 */
public class GetAiModelSourceModelRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("modelCardId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String modelCardId;

    private GetAiModelSourceModelRequest(Builder builder) {
        super(builder);
        this.modelCardId = builder.modelCardId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAiModelSourceModelRequest create() {
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

    public static final class Builder extends Request.Builder<GetAiModelSourceModelRequest, Builder> {
        private String modelCardId; 

        private Builder() {
            super();
        } 

        private Builder(GetAiModelSourceModelRequest request) {
            super(request);
            this.modelCardId = request.modelCardId;
        } 

        /**
         * <p>The model identifier. For standard models, use the source model card ID. For logical model entries, use the vm- prefix.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>msc-d00000000000000000000</p>
         */
        public Builder modelCardId(String modelCardId) {
            this.putPathParameter("modelCardId", modelCardId);
            this.modelCardId = modelCardId;
            return this;
        }

        @Override
        public GetAiModelSourceModelRequest build() {
            return new GetAiModelSourceModelRequest(this);
        } 

    } 

}
