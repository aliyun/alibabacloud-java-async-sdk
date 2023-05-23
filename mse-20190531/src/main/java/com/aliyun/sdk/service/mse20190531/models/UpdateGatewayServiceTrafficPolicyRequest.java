// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateGatewayServiceTrafficPolicyRequest} extends {@link RequestModel}
 *
 * <p>UpdateGatewayServiceTrafficPolicyRequest</p>
 */
public class UpdateGatewayServiceTrafficPolicyRequest extends Request {
    @Query
    @NameInMap("AcceptLanguage")
    private String acceptLanguage;

    @Query
    @NameInMap("GatewayId")
    private Long gatewayId;

    @Query
    @NameInMap("GatewayTrafficPolicy")
    @Validation(required = true)
    private TrafficPolicy gatewayTrafficPolicy;

    @Query
    @NameInMap("GatewayUniqueId")
    private String gatewayUniqueId;

    @Query
    @NameInMap("ServiceId")
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
         * The ID of the gateway.
         */
        public Builder acceptLanguage(String acceptLanguage) {
            this.putQueryParameter("AcceptLanguage", acceptLanguage);
            this.acceptLanguage = acceptLanguage;
            return this;
        }

        /**
         * cluster not found
         */
        public Builder gatewayId(Long gatewayId) {
            this.putQueryParameter("GatewayId", gatewayId);
            this.gatewayId = gatewayId;
            return this;
        }

        /**
         * systemError
         */
        public Builder gatewayTrafficPolicy(TrafficPolicy gatewayTrafficPolicy) {
            String gatewayTrafficPolicyShrink = shrink(gatewayTrafficPolicy, "GatewayTrafficPolicy", "json");
            this.putQueryParameter("GatewayTrafficPolicy", gatewayTrafficPolicyShrink);
            this.gatewayTrafficPolicy = gatewayTrafficPolicy;
            return this;
        }

        /**
         * system error
         */
        public Builder gatewayUniqueId(String gatewayUniqueId) {
            this.putQueryParameter("GatewayUniqueId", gatewayUniqueId);
            this.gatewayUniqueId = gatewayUniqueId;
            return this;
        }

        /**
         * mse-100-001
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
