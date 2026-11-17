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
 * {@link GetAiModelSourceEditImpactRequest} extends {@link RequestModel}
 *
 * <p>GetAiModelSourceEditImpactRequest</p>
 */
public class GetAiModelSourceEditImpactRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("modelSourceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String modelSourceId;

    private GetAiModelSourceEditImpactRequest(Builder builder) {
        super(builder);
        this.modelSourceId = builder.modelSourceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAiModelSourceEditImpactRequest create() {
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

    public static final class Builder extends Request.Builder<GetAiModelSourceEditImpactRequest, Builder> {
        private String modelSourceId; 

        private Builder() {
            super();
        } 

        private Builder(GetAiModelSourceEditImpactRequest request) {
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
        public GetAiModelSourceEditImpactRequest build() {
            return new GetAiModelSourceEditImpactRequest(this);
        } 

    } 

}
