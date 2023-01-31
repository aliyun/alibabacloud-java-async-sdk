// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyOutboundCallNumberRequest} extends {@link RequestModel}
 *
 * <p>ModifyOutboundCallNumberRequest</p>
 */
public class ModifyOutboundCallNumberRequest extends Request {
    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("Number")
    @Validation(required = true)
    private String number;

    @Query
    @NameInMap("OutboundCallNumberId")
    @Validation(required = true)
    private String outboundCallNumberId;

    @Query
    @NameInMap("RateLimitCount")
    @Validation(required = true)
    private Integer rateLimitCount;

    @Query
    @NameInMap("RateLimitPeriod")
    @Validation(required = true)
    private Integer rateLimitPeriod;

    private ModifyOutboundCallNumberRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.number = builder.number;
        this.outboundCallNumberId = builder.outboundCallNumberId;
        this.rateLimitCount = builder.rateLimitCount;
        this.rateLimitPeriod = builder.rateLimitPeriod;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyOutboundCallNumberRequest create() {
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
     * @return number
     */
    public String getNumber() {
        return this.number;
    }

    /**
     * @return outboundCallNumberId
     */
    public String getOutboundCallNumberId() {
        return this.outboundCallNumberId;
    }

    /**
     * @return rateLimitCount
     */
    public Integer getRateLimitCount() {
        return this.rateLimitCount;
    }

    /**
     * @return rateLimitPeriod
     */
    public Integer getRateLimitPeriod() {
        return this.rateLimitPeriod;
    }

    public static final class Builder extends Request.Builder<ModifyOutboundCallNumberRequest, Builder> {
        private String instanceId; 
        private String number; 
        private String outboundCallNumberId; 
        private Integer rateLimitCount; 
        private Integer rateLimitPeriod; 

        private Builder() {
            super();
        } 

        private Builder(ModifyOutboundCallNumberRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.number = request.number;
            this.outboundCallNumberId = request.outboundCallNumberId;
            this.rateLimitCount = request.rateLimitCount;
            this.rateLimitPeriod = request.rateLimitPeriod;
        } 

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * Number.
         */
        public Builder number(String number) {
            this.putQueryParameter("Number", number);
            this.number = number;
            return this;
        }

        /**
         * OutboundCallNumberId.
         */
        public Builder outboundCallNumberId(String outboundCallNumberId) {
            this.putQueryParameter("OutboundCallNumberId", outboundCallNumberId);
            this.outboundCallNumberId = outboundCallNumberId;
            return this;
        }

        /**
         * RateLimitCount.
         */
        public Builder rateLimitCount(Integer rateLimitCount) {
            this.putQueryParameter("RateLimitCount", rateLimitCount);
            this.rateLimitCount = rateLimitCount;
            return this;
        }

        /**
         * RateLimitPeriod.
         */
        public Builder rateLimitPeriod(Integer rateLimitPeriod) {
            this.putQueryParameter("RateLimitPeriod", rateLimitPeriod);
            this.rateLimitPeriod = rateLimitPeriod;
            return this;
        }

        @Override
        public ModifyOutboundCallNumberRequest build() {
            return new ModifyOutboundCallNumberRequest(this);
        } 

    } 

}
