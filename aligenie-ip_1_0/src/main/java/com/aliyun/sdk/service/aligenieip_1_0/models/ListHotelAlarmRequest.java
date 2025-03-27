// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligenieip_1_0.models;

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
 * {@link ListHotelAlarmRequest} extends {@link RequestModel}
 *
 * <p>ListHotelAlarmRequest</p>
 */
public class ListHotelAlarmRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("HotelId")
    private String hotelId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Rooms")
    private java.util.List<String> rooms;

    private ListHotelAlarmRequest(Builder builder) {
        super(builder);
        this.hotelId = builder.hotelId;
        this.rooms = builder.rooms;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListHotelAlarmRequest create() {
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

    /**
     * @return rooms
     */
    public java.util.List<String> getRooms() {
        return this.rooms;
    }

    public static final class Builder extends Request.Builder<ListHotelAlarmRequest, Builder> {
        private String hotelId; 
        private java.util.List<String> rooms; 

        private Builder() {
            super();
        } 

        private Builder(ListHotelAlarmRequest request) {
            super(request);
            this.hotelId = request.hotelId;
            this.rooms = request.rooms;
        } 

        /**
         * HotelId.
         */
        public Builder hotelId(String hotelId) {
            this.putBodyParameter("HotelId", hotelId);
            this.hotelId = hotelId;
            return this;
        }

        /**
         * Rooms.
         */
        public Builder rooms(java.util.List<String> rooms) {
            String roomsShrink = shrink(rooms, "Rooms", "json");
            this.putBodyParameter("Rooms", roomsShrink);
            this.rooms = rooms;
            return this;
        }

        @Override
        public ListHotelAlarmRequest build() {
            return new ListHotelAlarmRequest(this);
        } 

    } 

}
