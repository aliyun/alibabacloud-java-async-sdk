// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

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
 * {@link ModifyOutboundCallNumberRequest} extends {@link RequestModel}
 *
 * <p>ModifyOutboundCallNumberRequest</p>
 */
public class ModifyOutboundCallNumberRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Number")
    @com.aliyun.core.annotation.Validation(required = true)
    private String number;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OutboundCallNumberId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String outboundCallNumberId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RateLimitCount")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer rateLimitCount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RateLimitPeriod")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>52e80b02-0126-4556-a1e6-ef5b3747ed53/a9a3ddc7-d7d7-48cd-82b5-b31bb5510e71_2a66f8ad-dfbb-4980-9b84-439171295a11.xlsx</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10088</p>
         */
        public Builder number(String number) {
            this.putQueryParameter("Number", number);
            this.number = number;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>fa0e21e9-caab-4629-9121-1e341243d599</p>
         */
        public Builder outboundCallNumberId(String outboundCallNumberId) {
            this.putQueryParameter("OutboundCallNumberId", outboundCallNumberId);
            this.outboundCallNumberId = outboundCallNumberId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder rateLimitCount(Integer rateLimitCount) {
            this.putQueryParameter("RateLimitCount", rateLimitCount);
            this.rateLimitCount = rateLimitCount;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
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
