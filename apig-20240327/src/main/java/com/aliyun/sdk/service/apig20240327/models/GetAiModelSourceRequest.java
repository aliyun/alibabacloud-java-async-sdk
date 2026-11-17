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
 * {@link GetAiModelSourceRequest} extends {@link RequestModel}
 *
 * <p>GetAiModelSourceRequest</p>
 */
public class GetAiModelSourceRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("modelSourceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String modelSourceId;

    private GetAiModelSourceRequest(Builder builder) {
        super(builder);
        this.modelSourceId = builder.modelSourceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAiModelSourceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return modelSourceId
     */
    public String getModelSourceId() {
        return this.modelSourceId;
    }

    public static final class Builder extends Request.Builder<GetAiModelSourceRequest, Builder> {
        private String modelSourceId; 

        private Builder() {
            super();
        } 

        private Builder(GetAiModelSourceRequest request) {
            super(request);
            this.modelSourceId = request.modelSourceId;
        } 

        /**
         * <p>The ID of the model source. Use the modelSourceId returned by CreateAiModelSource.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ms-d00000000000000000000</p>
         */
        public Builder modelSourceId(String modelSourceId) {
            this.putPathParameter("modelSourceId", modelSourceId);
            this.modelSourceId = modelSourceId;
            return this;
        }

        @Override
        public GetAiModelSourceRequest build() {
            return new GetAiModelSourceRequest(this);
        } 

    } 

}
