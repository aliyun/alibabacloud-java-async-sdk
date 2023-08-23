// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligenieip_1_0.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListHotelMessageTemplateRequest} extends {@link RequestModel}
 *
 * <p>ListHotelMessageTemplateRequest</p>
 */
public class ListHotelMessageTemplateRequest extends Request {
    private ListHotelMessageTemplateRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListHotelMessageTemplateRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<ListHotelMessageTemplateRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(ListHotelMessageTemplateRequest request) {
            super(request);
        } 

        @Override
        public ListHotelMessageTemplateRequest build() {
            return new ListHotelMessageTemplateRequest(this);
        } 

    } 

}
