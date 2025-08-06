// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

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
 * {@link ListVodRealtimeLogDeliveryInfosRequest} extends {@link RequestModel}
 *
 * <p>ListVodRealtimeLogDeliveryInfosRequest</p>
 */
public class ListVodRealtimeLogDeliveryInfosRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    private ListVodRealtimeLogDeliveryInfosRequest(Builder builder) {
        super(builder);
        this.ownerId = builder.ownerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListVodRealtimeLogDeliveryInfosRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    public static final class Builder extends Request.Builder<ListVodRealtimeLogDeliveryInfosRequest, Builder> {
        private Long ownerId; 

        private Builder() {
            super();
        } 

        private Builder(ListVodRealtimeLogDeliveryInfosRequest request) {
            super(request);
            this.ownerId = request.ownerId;
        } 

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        @Override
        public ListVodRealtimeLogDeliveryInfosRequest build() {
            return new ListVodRealtimeLogDeliveryInfosRequest(this);
        } 

    } 

}
