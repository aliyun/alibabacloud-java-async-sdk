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
         * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
         * <blockquote>
         * <p>If you do not specify this parameter, the system uses the RequestId of the API request as the ClientToken. The RequestId may be different for each API request.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>5A2CFF0E-5718-45B5-9D4D-70B3FF3898</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>Specifies whether to perform a dry run. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Sends a dry run request without reserving resources. The system checks required parameters, request format, and service limits. If the check fails, the corresponding error is returned. If the check succeeds, the <code>DryRunOperation</code> error code is returned.</li>
         * <li><strong>false</strong> (default): Sends a normal request. After the check succeeds, an HTTP 2xx status code is returned and the operation is performed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * <p>The instance ID of the Application Load Balancing instance. Before you configure a capacity reservation, the instance must have at least one listener in the Running state.</p>
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
         * <p>The minimum reserved load balancing capacity.</p>
         */
        public Builder minimumLoadBalancerCapacity(MinimumLoadBalancerCapacity minimumLoadBalancerCapacity) {
            this.putQueryParameter("MinimumLoadBalancerCapacity", minimumLoadBalancerCapacity);
            this.minimumLoadBalancerCapacity = minimumLoadBalancerCapacity;
            return this;
        }

        /**
         * <p>Specifies whether to cancel the capacity reservation. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Cancels the capacity reservation.</li>
         * <li><strong>false</strong> (default): Does not cancel the capacity reservation. You do not need to specify this parameter when you create or modify a capacity reservation.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
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
             * <p>The number of LCUs reserved per hour.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
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
