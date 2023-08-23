// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DisableRealtimeLogDeliveryRequest} extends {@link RequestModel}
 *
 * <p>DisableRealtimeLogDeliveryRequest</p>
 */
public class DisableRealtimeLogDeliveryRequest extends Request {
    @Query
    @NameInMap("Domain")
    @Validation(required = true)
    private String domain;

    private DisableRealtimeLogDeliveryRequest(Builder builder) {
        super(builder);
        this.domain = builder.domain;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DisableRealtimeLogDeliveryRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return domain
     */
    public String getDomain() {
        return this.domain;
    }

    public static final class Builder extends Request.Builder<DisableRealtimeLogDeliveryRequest, Builder> {
        private String domain; 

        private Builder() {
            super();
        } 

        private Builder(DisableRealtimeLogDeliveryRequest request) {
            super(request);
            this.domain = request.domain;
        } 

        /**
         * The accelerated domain name for which you want to disable real-time log delivery. You can specify multiple domain names and separate them with commas (,).
         */
        public Builder domain(String domain) {
            this.putQueryParameter("Domain", domain);
            this.domain = domain;
            return this;
        }

        @Override
        public DisableRealtimeLogDeliveryRequest build() {
            return new DisableRealtimeLogDeliveryRequest(this);
        } 

    } 

}
