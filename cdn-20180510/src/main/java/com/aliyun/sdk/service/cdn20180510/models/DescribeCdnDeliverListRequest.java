// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeCdnDeliverListRequest} extends {@link RequestModel}
 *
 * <p>DescribeCdnDeliverListRequest</p>
 */
public class DescribeCdnDeliverListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeliverId")
    private Long deliverId;

    private DescribeCdnDeliverListRequest(Builder builder) {
        super(builder);
        this.deliverId = builder.deliverId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCdnDeliverListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return deliverId
     */
    public Long getDeliverId() {
        return this.deliverId;
    }

    public static final class Builder extends Request.Builder<DescribeCdnDeliverListRequest, Builder> {
        private Long deliverId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeCdnDeliverListRequest request) {
            super(request);
            this.deliverId = request.deliverId;
        } 

        /**
         * <p>The ID of the tracking task that you want to query. If you do not specify an ID, all tracking tasks are queried.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder deliverId(Long deliverId) {
            this.putQueryParameter("DeliverId", deliverId);
            this.deliverId = deliverId;
            return this;
        }

        @Override
        public DescribeCdnDeliverListRequest build() {
            return new DescribeCdnDeliverListRequest(this);
        } 

    } 

}
