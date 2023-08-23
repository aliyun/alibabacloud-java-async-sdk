// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDomainRealtimeLogDeliveryRequest} extends {@link RequestModel}
 *
 * <p>DescribeDomainRealtimeLogDeliveryRequest</p>
 */
public class DescribeDomainRealtimeLogDeliveryRequest extends Request {
    @Query
    @NameInMap("Domain")
    @Validation(required = true)
    private String domain;

    private DescribeDomainRealtimeLogDeliveryRequest(Builder builder) {
        super(builder);
        this.domain = builder.domain;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDomainRealtimeLogDeliveryRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeDomainRealtimeLogDeliveryRequest, Builder> {
        private String domain; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDomainRealtimeLogDeliveryRequest request) {
            super(request);
            this.domain = request.domain;
        } 

        /**
         * The accelerated domain name for which real-time log delivery is enabled. You can specify only one domain name.
         */
        public Builder domain(String domain) {
            this.putQueryParameter("Domain", domain);
            this.domain = domain;
            return this;
        }

        @Override
        public DescribeDomainRealtimeLogDeliveryRequest build() {
            return new DescribeDomainRealtimeLogDeliveryRequest(this);
        } 

    } 

}
