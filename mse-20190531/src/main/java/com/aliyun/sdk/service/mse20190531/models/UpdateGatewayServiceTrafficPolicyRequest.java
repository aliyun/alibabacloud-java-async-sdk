// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

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
 * {@link UpdateGatewayServiceTrafficPolicyRequest} extends {@link RequestModel}
 *
 * <p>UpdateGatewayServiceTrafficPolicyRequest</p>
 */
public class UpdateGatewayServiceTrafficPolicyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AcceptLanguage")
    private String acceptLanguage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GatewayId")
    private Long gatewayId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GatewayTrafficPolicy")
    @com.aliyun.core.annotation.Validation(required = true)
    private TrafficPolicy gatewayTrafficPolicy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GatewayUniqueId")
    private String gatewayUniqueId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceId")
    private Long serviceId;

    private UpdateGatewayServiceTrafficPolicyRequest(Builder builder) {
        super(builder);
        this.acceptLanguage = builder.acceptLanguage;
        this.gatewayId = builder.gatewayId;
        this.gatewayTrafficPolicy = builder.gatewayTrafficPolicy;
        this.gatewayUniqueId = builder.gatewayUniqueId;
        this.serviceId = builder.serviceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateGatewayServiceTrafficPolicyRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return acceptLanguage
     */
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    /**
     * @return gatewayId
     */
    public Long getGatewayId() {
        return this.gatewayId;
    }

    /**
     * @return gatewayTrafficPolicy
     */
    public TrafficPolicy getGatewayTrafficPolicy() {
        return this.gatewayTrafficPolicy;
    }

    /**
     * @return gatewayUniqueId
     */
    public String getGatewayUniqueId() {
        return this.gatewayUniqueId;
    }

    /**
     * @return serviceId
     */
    public Long getServiceId() {
        return this.serviceId;
    }

    public static final class Builder extends Request.Builder<UpdateGatewayServiceTrafficPolicyRequest, Builder> {
        private String acceptLanguage; 
        private Long gatewayId; 
        private TrafficPolicy gatewayTrafficPolicy; 
        private String gatewayUniqueId; 
        private Long serviceId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateGatewayServiceTrafficPolicyRequest request) {
            super(request);
            this.acceptLanguage = request.acceptLanguage;
            this.gatewayId = request.gatewayId;
            this.gatewayTrafficPolicy = request.gatewayTrafficPolicy;
            this.gatewayUniqueId = request.gatewayUniqueId;
            this.serviceId = request.serviceId;
        } 

        /**
         * <p>The language of the response. Valid values:</p>
         * <ul>
         * <li><strong>zh-CN</strong> (default): Chinese</li>
         * <li><strong>en-US</strong>: English</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder acceptLanguage(String acceptLanguage) {
            this.putQueryParameter("AcceptLanguage", acceptLanguage);
            this.acceptLanguage = acceptLanguage;
            return this;
        }

        /**
         * <p>The ID of the gateway.</p>
         * 
         * <strong>example:</strong>
         * <p>429</p>
         */
        public Builder gatewayId(Long gatewayId) {
            this.putQueryParameter("GatewayId", gatewayId);
            this.gatewayId = gatewayId;
            return this;
        }

        /**
         * <p>The traffic policy of the gateway.</p>
         * <p>This parameter is required.</p>
         */
        public Builder gatewayTrafficPolicy(TrafficPolicy gatewayTrafficPolicy) {
            String gatewayTrafficPolicyShrink = shrink(gatewayTrafficPolicy, "GatewayTrafficPolicy", "json");
            this.putQueryParameter("GatewayTrafficPolicy", gatewayTrafficPolicyShrink);
            this.gatewayTrafficPolicy = gatewayTrafficPolicy;
            return this;
        }

        /**
         * <p>The unique ID of the gateway.</p>
         * 
         * <strong>example:</strong>
         * <p>gw-75c5036c083e4f89ba8ef9fafff2e902</p>
         */
        public Builder gatewayUniqueId(String gatewayUniqueId) {
            this.putQueryParameter("GatewayUniqueId", gatewayUniqueId);
            this.gatewayUniqueId = gatewayUniqueId;
            return this;
        }

        /**
         * <p>The ID of the service.</p>
         * 
         * <strong>example:</strong>
         * <p>411</p>
         */
        public Builder serviceId(Long serviceId) {
            this.putQueryParameter("ServiceId", serviceId);
            this.serviceId = serviceId;
            return this;
        }

        @Override
        public UpdateGatewayServiceTrafficPolicyRequest build() {
            return new UpdateGatewayServiceTrafficPolicyRequest(this);
        } 

    } 

}
