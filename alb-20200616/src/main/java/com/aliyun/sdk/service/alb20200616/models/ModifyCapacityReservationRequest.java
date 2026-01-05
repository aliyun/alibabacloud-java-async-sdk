// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alb20200616.models;

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
 * {@link ModifyCapacityReservationRequest} extends {@link RequestModel}
 *
 * <p>ModifyCapacityReservationRequest</p>
 */
public class ModifyCapacityReservationRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private Boolean dryRun;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LoadBalancerId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String loadBalancerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MinimumLoadBalancerCapacity")
    private MinimumLoadBalancerCapacity minimumLoadBalancerCapacity;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResetCapacityReservation")
    private Boolean resetCapacityReservation;

    private ModifyCapacityReservationRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.dryRun = builder.dryRun;
        this.loadBalancerId = builder.loadBalancerId;
        this.minimumLoadBalancerCapacity = builder.minimumLoadBalancerCapacity;
        this.resetCapacityReservation = builder.resetCapacityReservation;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyCapacityReservationRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * @return loadBalancerId
     */
    public String getLoadBalancerId() {
        return this.loadBalancerId;
    }

    /**
     * @return minimumLoadBalancerCapacity
     */
    public MinimumLoadBalancerCapacity getMinimumLoadBalancerCapacity() {
        return this.minimumLoadBalancerCapacity;
    }

    /**
     * @return resetCapacityReservation
     */
    public Boolean getResetCapacityReservation() {
        return this.resetCapacityReservation;
    }

    public static final class Builder extends Request.Builder<ModifyCapacityReservationRequest, Builder> {
        private String clientToken; 
        private Boolean dryRun; 
        private String loadBalancerId; 
        private MinimumLoadBalancerCapacity minimumLoadBalancerCapacity; 
        private Boolean resetCapacityReservation; 

        private Builder() {
            super();
        } 

        private Builder(ModifyCapacityReservationRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.dryRun = request.dryRun;
            this.loadBalancerId = request.loadBalancerId;
            this.minimumLoadBalancerCapacity = request.minimumLoadBalancerCapacity;
            this.resetCapacityReservation = request.resetCapacityReservation;
        } 

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * DryRun.
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>alb-iv9gj3spak6fbj****</p>
         */
        public Builder loadBalancerId(String loadBalancerId) {
            this.putQueryParameter("LoadBalancerId", loadBalancerId);
            this.loadBalancerId = loadBalancerId;
            return this;
        }

        /**
         * MinimumLoadBalancerCapacity.
         */
        public Builder minimumLoadBalancerCapacity(MinimumLoadBalancerCapacity minimumLoadBalancerCapacity) {
            this.putQueryParameter("MinimumLoadBalancerCapacity", minimumLoadBalancerCapacity);
            this.minimumLoadBalancerCapacity = minimumLoadBalancerCapacity;
            return this;
        }

        /**
         * ResetCapacityReservation.
         */
        public Builder resetCapacityReservation(Boolean resetCapacityReservation) {
            this.putQueryParameter("ResetCapacityReservation", resetCapacityReservation);
            this.resetCapacityReservation = resetCapacityReservation;
            return this;
        }

        @Override
        public ModifyCapacityReservationRequest build() {
            return new ModifyCapacityReservationRequest(this);
        } 

    } 

    /**
     * 
     * {@link ModifyCapacityReservationRequest} extends {@link TeaModel}
     *
     * <p>ModifyCapacityReservationRequest</p>
     */
    public static class MinimumLoadBalancerCapacity extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CapacityUnits")
        private Integer capacityUnits;

        private MinimumLoadBalancerCapacity(Builder builder) {
            this.capacityUnits = builder.capacityUnits;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MinimumLoadBalancerCapacity create() {
            return builder().build();
        }

        /**
         * @return capacityUnits
         */
        public Integer getCapacityUnits() {
            return this.capacityUnits;
        }

        public static final class Builder {
            private Integer capacityUnits; 

            private Builder() {
            } 

            private Builder(MinimumLoadBalancerCapacity model) {
                this.capacityUnits = model.capacityUnits;
            } 

            /**
             * CapacityUnits.
             */
            public Builder capacityUnits(Integer capacityUnits) {
                this.capacityUnits = capacityUnits;
                return this;
            }

            public MinimumLoadBalancerCapacity build() {
                return new MinimumLoadBalancerCapacity(this);
            } 

        } 

    }
}
