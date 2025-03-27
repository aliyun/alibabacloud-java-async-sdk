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
 * {@link ListHotelRoomsRequest} extends {@link RequestModel}
 *
 * <p>ListHotelRoomsRequest</p>
 */
public class ListHotelRoomsRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("HotelAdminRoom")
    private HotelAdminRoom hotelAdminRoom;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("HotelId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String hotelId;

    private ListHotelRoomsRequest(Builder builder) {
        super(builder);
        this.hotelAdminRoom = builder.hotelAdminRoom;
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
     * @return hotelAdminRoom
     */
    public HotelAdminRoom getHotelAdminRoom() {
        return this.hotelAdminRoom;
    }

    /**
     * @return hotelId
     */
    public String getHotelId() {
        return this.hotelId;
    }

    public static final class Builder extends Request.Builder<ListHotelRoomsRequest, Builder> {
        private HotelAdminRoom hotelAdminRoom; 
        private String hotelId; 

        private Builder() {
            super();
        } 

        private Builder(ListHotelRoomsRequest request) {
            super(request);
            this.hotelAdminRoom = request.hotelAdminRoom;
            this.hotelId = request.hotelId;
        } 

        /**
         * HotelAdminRoom.
         */
        public Builder hotelAdminRoom(HotelAdminRoom hotelAdminRoom) {
            String hotelAdminRoomShrink = shrink(hotelAdminRoom, "HotelAdminRoom", "json");
            this.putBodyParameter("HotelAdminRoom", hotelAdminRoomShrink);
            this.hotelAdminRoom = hotelAdminRoom;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>e6dd44fd16084db8a60d69fd625d9f0f</p>
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

    /**
     * 
     * {@link ListHotelRoomsRequest} extends {@link TeaModel}
     *
     * <p>ListHotelRoomsRequest</p>
     */
    public static class HotelAdminRoom extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RoomNo")
        private String roomNo;

        private HotelAdminRoom(Builder builder) {
            this.roomNo = builder.roomNo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HotelAdminRoom create() {
            return builder().build();
        }

        /**
         * @return roomNo
         */
        public String getRoomNo() {
            return this.roomNo;
        }

        public static final class Builder {
            private String roomNo; 

            private Builder() {
            } 

            private Builder(HotelAdminRoom model) {
                this.roomNo = model.roomNo;
            } 

            /**
             * RoomNo.
             */
            public Builder roomNo(String roomNo) {
                this.roomNo = roomNo;
                return this;
            }

            public HotelAdminRoom build() {
                return new HotelAdminRoom(this);
            } 

        } 

    }
}
