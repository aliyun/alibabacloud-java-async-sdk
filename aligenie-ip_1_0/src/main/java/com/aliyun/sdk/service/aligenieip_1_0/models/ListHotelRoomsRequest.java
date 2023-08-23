// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligenieip_1_0.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListHotelRoomsRequest} extends {@link RequestModel}
 *
 * <p>ListHotelRoomsRequest</p>
 */
public class ListHotelRoomsRequest extends Request {
    @Body
    @NameInMap("HotelId")
    @Validation(required = true)
    private String hotelId;

    private ListHotelRoomsRequest(Builder builder) {
        super(builder);
        this.hotelId = builder.hotelId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListHotelRoomsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return hotelId
     */
    public String getHotelId() {
        return this.hotelId;
    }

    public static final class Builder extends Request.Builder<ListHotelRoomsRequest, Builder> {
        private String hotelId; 

        private Builder() {
            super();
        } 

        private Builder(ListHotelRoomsRequest request) {
            super(request);
            this.hotelId = request.hotelId;
        } 

        /**
         * HotelId.
         */
        public Builder hotelId(String hotelId) {
            this.putBodyParameter("HotelId", hotelId);
            this.hotelId = hotelId;
            return this;
        }

        @Override
        public ListHotelRoomsRequest build() {
            return new ListHotelRoomsRequest(this);
        } 

    } 

}
