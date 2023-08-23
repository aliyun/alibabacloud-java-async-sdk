// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligenieip_1_0.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryRoomControlDevicesRequest} extends {@link RequestModel}
 *
 * <p>QueryRoomControlDevicesRequest</p>
 */
public class QueryRoomControlDevicesRequest extends Request {
    @Query
    @NameInMap("HotelId")
    @Validation(required = true)
    private String hotelId;

    @Query
    @NameInMap("RoomNo")
    @Validation(required = true)
    private String roomNo;

    private QueryRoomControlDevicesRequest(Builder builder) {
        super(builder);
        this.hotelId = builder.hotelId;
        this.roomNo = builder.roomNo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryRoomControlDevicesRequest create() {
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
     * @return roomNo
     */
    public String getRoomNo() {
        return this.roomNo;
    }

    public static final class Builder extends Request.Builder<QueryRoomControlDevicesRequest, Builder> {
        private String hotelId; 
        private String roomNo; 

        private Builder() {
            super();
        } 

        private Builder(QueryRoomControlDevicesRequest request) {
            super(request);
            this.hotelId = request.hotelId;
            this.roomNo = request.roomNo;
        } 

        /**
         * HotelId.
         */
        public Builder hotelId(String hotelId) {
            this.putQueryParameter("HotelId", hotelId);
            this.hotelId = hotelId;
            return this;
        }

        /**
         * RoomNo.
         */
        public Builder roomNo(String roomNo) {
            this.putQueryParameter("RoomNo", roomNo);
            this.roomNo = roomNo;
            return this;
        }

        @Override
        public QueryRoomControlDevicesRequest build() {
            return new QueryRoomControlDevicesRequest(this);
        } 

    } 

}
