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
 * {@link CreateOutboundCallNumberRequest} extends {@link RequestModel}
 *
 * <p>CreateOutboundCallNumberRequest</p>
 */
public class CreateOutboundCallNumberRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Number")
    @com.aliyun.core.annotation.Validation(required = true)
    private String number;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RateLimitCount")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer rateLimitCount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RateLimitPeriod")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer rateLimitPeriod;

    private CreateOutboundCallNumberRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.number = builder.number;
        this.rateLimitCount = builder.rateLimitCount;
        this.rateLimitPeriod = builder.rateLimitPeriod;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateOutboundCallNumberRequest create() {
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

    public static final class Builder extends Request.Builder<CreateOutboundCallNumberRequest, Builder> {
        private String instanceId; 
        private String number; 
        private Integer rateLimitCount; 
        private Integer rateLimitPeriod; 

        private Builder() {
            super();
        } 

        private Builder(CreateOutboundCallNumberRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.number = request.number;
            this.rateLimitCount = request.rateLimitCount;
            this.rateLimitPeriod = request.rateLimitPeriod;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>174952ab-9825-4cc9-a5e2-de82d7fa4cdd</p>
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
         * <p>95187</p>
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
         * <p>20</p>
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
         * <p>120</p>
         */
        public Builder rateLimitPeriod(Integer rateLimitPeriod) {
            this.putQueryParameter("RateLimitPeriod", rateLimitPeriod);
            this.rateLimitPeriod = rateLimitPeriod;
            return this;
        }

        @Override
        public CreateOutboundCallNumberRequest build() {
            return new CreateOutboundCallNumberRequest(this);
        } 

    } 

}
