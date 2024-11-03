// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link EnableRealtimeLogDeliveryRequest} extends {@link RequestModel}
 *
 * <p>EnableRealtimeLogDeliveryRequest</p>
 */
public class EnableRealtimeLogDeliveryRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Domain")
    @com.aliyun.core.annotation.Validation(required = true)
    private String domain;

    private EnableRealtimeLogDeliveryRequest(Builder builder) {
        super(builder);
        this.domain = builder.domain;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EnableRealtimeLogDeliveryRequest create() {
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

    public static final class Builder extends Request.Builder<EnableRealtimeLogDeliveryRequest, Builder> {
        private String domain; 

        private Builder() {
            super();
        } 

        private Builder(EnableRealtimeLogDeliveryRequest request) {
            super(request);
            this.domain = request.domain;
        } 

        /**
         * <p>The accelerated domain name for which you want to enable real-time log delivery. You can specify multiple domain names and separate them with commas (,).</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        public Builder domain(String domain) {
            this.putQueryParameter("Domain", domain);
            this.domain = domain;
            return this;
        }

        @Override
        public EnableRealtimeLogDeliveryRequest build() {
            return new EnableRealtimeLogDeliveryRequest(this);
        } 

    } 

}
