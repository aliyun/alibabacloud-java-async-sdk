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
 * {@link GetModelTokenRateLimitRequest} extends {@link RequestModel}
 *
 * <p>GetModelTokenRateLimitRequest</p>
 */
public class GetModelTokenRateLimitRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("gatewayId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String gatewayId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("modelId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String modelId;

    private GetModelTokenRateLimitRequest(Builder builder) {
        super(builder);
        this.gatewayId = builder.gatewayId;
        this.modelId = builder.modelId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetModelTokenRateLimitRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return gatewayId
     */
    public String getGatewayId() {
        return this.gatewayId;
    }

    /**
     * @return modelId
     */
    public String getModelId() {
        return this.modelId;
    }

    public static final class Builder extends Request.Builder<GetModelTokenRateLimitRequest, Builder> {
        private String gatewayId; 
        private String modelId; 

        private Builder() {
            super();
        } 

        private Builder(GetModelTokenRateLimitRequest request) {
            super(request);
            this.gatewayId = request.gatewayId;
            this.modelId = request.modelId;
        } 

        /**
         * <p>The instance ID of the dedicated AI gateway.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>gw-example01</p>
         */
        public Builder gatewayId(String gatewayId) {
            this.putPathParameter("gatewayId", gatewayId);
            this.gatewayId = gatewayId;
            return this;
        }

        /**
         * <p>The actual model card ID (prefixed with msc-) or the logical model ID (prefixed with vm-).</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>msc-example01</p>
         */
        public Builder modelId(String modelId) {
            this.putPathParameter("modelId", modelId);
            this.modelId = modelId;
            return this;
        }

        @Override
        public GetModelTokenRateLimitRequest build() {
            return new GetModelTokenRateLimitRequest(this);
        } 

    } 

}
