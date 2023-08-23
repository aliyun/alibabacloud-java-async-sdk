// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListRealtimeLogDeliveryInfosRequest} extends {@link RequestModel}
 *
 * <p>ListRealtimeLogDeliveryInfosRequest</p>
 */
public class ListRealtimeLogDeliveryInfosRequest extends Request {
    private ListRealtimeLogDeliveryInfosRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListRealtimeLogDeliveryInfosRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<ListRealtimeLogDeliveryInfosRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(ListRealtimeLogDeliveryInfosRequest request) {
            super(request);
        } 

        @Override
        public ListRealtimeLogDeliveryInfosRequest build() {
            return new ListRealtimeLogDeliveryInfosRequest(this);
        } 

    } 

}
