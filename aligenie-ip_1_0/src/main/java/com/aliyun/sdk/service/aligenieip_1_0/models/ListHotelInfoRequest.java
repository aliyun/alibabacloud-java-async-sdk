// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligenieip_1_0.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListHotelInfoRequest} extends {@link RequestModel}
 *
 * <p>ListHotelInfoRequest</p>
 */
public class ListHotelInfoRequest extends Request {
    private ListHotelInfoRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListHotelInfoRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<ListHotelInfoRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(ListHotelInfoRequest request) {
            super(request);
        } 

        @Override
        public ListHotelInfoRequest build() {
            return new ListHotelInfoRequest(this);
        } 

    } 

}
