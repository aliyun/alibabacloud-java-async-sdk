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
 * {@link BatchAddHotelRoomRequest} extends {@link RequestModel}
 *
 * <p>BatchAddHotelRoomRequest</p>
 */
public class BatchAddHotelRoomRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("HotelId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String hotelId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RoomNoList")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> roomNoList;

    private BatchAddHotelRoomRequest(Builder builder) {
        super(builder);
        this.hotelId = builder.hotelId;
        this.roomNoList = builder.roomNoList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchAddHotelRoomRequest create() {
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
    public java.util.List<String> getRoomNoList() {
        return this.roomNoList;
    }

    public static final class Builder extends Request.Builder<BatchAddHotelRoomRequest, Builder> {
        private String hotelId; 
        private java.util.List<String> roomNoList; 

        private Builder() {
            super();
        } 

        private Builder(BatchAddHotelRoomRequest request) {
            super(request);
            this.hotelId = request.hotelId;
            this.roomNoList = request.roomNoList;
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

        /**
         * <p>This parameter is required.</p>
         */
        public Builder roomNoList(java.util.List<String> roomNoList) {
            String roomNoListShrink = shrink(roomNoList, "RoomNoList", "simple");
            this.putBodyParameter("RoomNoList", roomNoListShrink);
            this.roomNoList = roomNoList;
            return this;
        }

        @Override
        public BatchAddHotelRoomRequest build() {
            return new BatchAddHotelRoomRequest(this);
        } 

    } 

}
