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
 * {@link GetAiModelProviderRequest} extends {@link RequestModel}
 *
 * <p>GetAiModelProviderRequest</p>
 */
public class GetAiModelProviderRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("modelProviderId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String modelProviderId;

    private GetAiModelProviderRequest(Builder builder) {
        super(builder);
        this.modelProviderId = builder.modelProviderId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAiModelProviderRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return modelProviderId
     */
    public String getModelProviderId() {
        return this.modelProviderId;
    }

    public static final class Builder extends Request.Builder<GetAiModelProviderRequest, Builder> {
        private String modelProviderId; 

        private Builder() {
            super();
        } 

        private Builder(GetAiModelProviderRequest request) {
            super(request);
            this.modelProviderId = request.modelProviderId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>mp-8c13d2b4f8a1</p>
         */
        public Builder modelProviderId(String modelProviderId) {
            this.putPathParameter("modelProviderId", modelProviderId);
            this.modelProviderId = modelProviderId;
            return this;
        }

        @Override
        public GetAiModelProviderRequest build() {
            return new GetAiModelProviderRequest(this);
        } 

    } 

}
