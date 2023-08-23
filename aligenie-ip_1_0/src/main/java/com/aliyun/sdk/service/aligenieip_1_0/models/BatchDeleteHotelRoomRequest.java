// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligenieip_1_0.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BatchDeleteHotelRoomRequest} extends {@link RequestModel}
 *
 * <p>BatchDeleteHotelRoomRequest</p>
 */
public class BatchDeleteHotelRoomRequest extends Request {
    @Body
    @NameInMap("HotelId")
    @Validation(required = true)
    private String hotelId;

    @Body
    @NameInMap("RoomNoList")
    @Validation(required = true)
    private java.util.List < String > roomNoList;

    private BatchDeleteHotelRoomRequest(Builder builder) {
        super(builder);
        this.hotelId = builder.hotelId;
        this.roomNoList = builder.roomNoList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchDeleteHotelRoomRequest create() {
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
     * @return roomNoList
     */
    public java.util.List < String > getRoomNoList() {
        return this.roomNoList;
    }

    public static final class Builder extends Request.Builder<BatchDeleteHotelRoomRequest, Builder> {
        private String hotelId; 
        private java.util.List < String > roomNoList; 

        private Builder() {
            super();
        } 

        private Builder(BatchDeleteHotelRoomRequest request) {
            super(request);
            this.hotelId = request.hotelId;
            this.roomNoList = request.roomNoList;
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
         * RoomNoList.
         */
        public Builder roomNoList(java.util.List < String > roomNoList) {
            String roomNoListShrink = shrink(roomNoList, "RoomNoList", "simple");
            this.putBodyParameter("RoomNoList", roomNoListShrink);
            this.roomNoList = roomNoList;
            return this;
        }

        @Override
        public BatchDeleteHotelRoomRequest build() {
            return new BatchDeleteHotelRoomRequest(this);
        } 

    } 

}
