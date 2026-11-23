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
 * {@link GetConsumerAccessOverviewRequest} extends {@link RequestModel}
 *
 * <p>GetConsumerAccessOverviewRequest</p>
 */
public class GetConsumerAccessOverviewRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("consumerId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String consumerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("gatewayId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String gatewayId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("includeModelTpm")
    private Boolean includeModelTpm;

    private GetConsumerAccessOverviewRequest(Builder builder) {
        super(builder);
        this.consumerId = builder.consumerId;
        this.gatewayId = builder.gatewayId;
        this.includeModelTpm = builder.includeModelTpm;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetConsumerAccessOverviewRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return consumerId
     */
    public String getConsumerId() {
        return this.consumerId;
    }

    /**
     * @return gatewayId
     */
    public String getGatewayId() {
        return this.gatewayId;
    }

    /**
     * @return includeModelTpm
     */
    public Boolean getIncludeModelTpm() {
        return this.includeModelTpm;
    }

    public static final class Builder extends Request.Builder<GetConsumerAccessOverviewRequest, Builder> {
        private String consumerId; 
        private String gatewayId; 
        private Boolean includeModelTpm; 

        private Builder() {
            super();
        } 

        private Builder(GetConsumerAccessOverviewRequest request) {
            super(request);
            this.consumerId = request.consumerId;
            this.gatewayId = request.gatewayId;
            this.includeModelTpm = request.includeModelTpm;
        } 

        /**
         * <p>The consumer ID, which is the identifier returned by the consumer creation or query API operation.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cs-d00000000000000000000</p>
         */
        public Builder consumerId(String consumerId) {
            this.putPathParameter("consumerId", consumerId);
            this.consumerId = consumerId;
            return this;
        }

        /**
         * <p>The target AI gateway instance ID. Quotas and resources are isolated by instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>gw-123456</p>
         */
        public Builder gatewayId(String gatewayId) {
            this.putQueryParameter("gatewayId", gatewayId);
            this.gatewayId = gatewayId;
            return this;
        }

        /**
         * <p>Specifies whether to also query the model TPM limits. Default value: false. If set to true, modelTpmLimits is returned for dedicated instances.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder includeModelTpm(Boolean includeModelTpm) {
            this.putQueryParameter("includeModelTpm", includeModelTpm);
            this.includeModelTpm = includeModelTpm;
            return this;
        }

        @Override
        public GetConsumerAccessOverviewRequest build() {
            return new GetConsumerAccessOverviewRequest(this);
        } 

    } 

}
