// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListRealtimeLogDeliveryRequest} extends {@link RequestModel}
 *
 * <p>ListRealtimeLogDeliveryRequest</p>
 */
public class ListRealtimeLogDeliveryRequest extends Request {
    private ListRealtimeLogDeliveryRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListRealtimeLogDeliveryRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<ListRealtimeLogDeliveryRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(ListRealtimeLogDeliveryRequest request) {
            super(request);
        } 

        @Override
        public ListRealtimeLogDeliveryRequest build() {
            return new ListRealtimeLogDeliveryRequest(this);
        } 

    } 

}
