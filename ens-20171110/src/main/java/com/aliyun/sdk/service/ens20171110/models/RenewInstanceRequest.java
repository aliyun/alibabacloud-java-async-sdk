// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RenewInstanceRequest} extends {@link RequestModel}
 *
 * <p>RenewInstanceRequest</p>
 */
public class RenewInstanceRequest extends Request {
    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("Period")
    @Validation(required = true)
    private Long period;

    private RenewInstanceRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.period = builder.period;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RenewInstanceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return period
     */
    public Long getPeriod() {
        return this.period;
    }

    public static final class Builder extends Request.Builder<RenewInstanceRequest, Builder> {
        private String instanceId; 
        private Long period; 

        private Builder() {
            super();
        } 

        private Builder(RenewInstanceRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.period = request.period;
        } 

        /**
         * The ID of the instance.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The renewal duration of the subscription instance.
         * <p>
         * 
         * Valid values:
         * 
         * *   1
         * *   2
         * *   3
         * *   4
         * *   5
         * *   6
         * *   7
         * *   8
         * *   9
         * *   12
         */
        public Builder period(Long period) {
            this.putQueryParameter("Period", period);
            this.period = period;
            return this;
        }

        @Override
        public RenewInstanceRequest build() {
            return new RenewInstanceRequest(this);
        } 

    } 

}
