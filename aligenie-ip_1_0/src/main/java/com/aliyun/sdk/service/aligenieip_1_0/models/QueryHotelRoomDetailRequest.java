// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligenieip_1_0.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryHotelRoomDetailRequest} extends {@link RequestModel}
 *
 * <p>QueryHotelRoomDetailRequest</p>
 */
public class QueryHotelRoomDetailRequest extends Request {
    @Body
    @NameInMap("HotelId")
    private String hotelId;

    @Body
    @NameInMap("Mac")
    private String mac;

    @Body
    @NameInMap("RoomNo")
    private String roomNo;

    @Body
    @NameInMap("Sn")
    private String sn;

    @Body
    @NameInMap("Uuid")
    private String uuid;

    private QueryHotelRoomDetailRequest(Builder builder) {
        super(builder);
        this.hotelId = builder.hotelId;
        this.mac = builder.mac;
        this.roomNo = builder.roomNo;
        this.sn = builder.sn;
        this.uuid = builder.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryHotelRoomDetailRequest create() {
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
     * @return mac
     */
    public String getMac() {
        return this.mac;
    }

    /**
     * @return roomNo
     */
    public String getRoomNo() {
        return this.roomNo;
    }

    /**
     * @return sn
     */
    public String getSn() {
        return this.sn;
    }

    /**
     * @return uuid
     */
    public String getUuid() {
        return this.uuid;
    }

    public static final class Builder extends Request.Builder<QueryHotelRoomDetailRequest, Builder> {
        private String hotelId; 
        private String mac; 
        private String roomNo; 
        private String sn; 
        private String uuid; 

        private Builder() {
            super();
        } 

        private Builder(QueryHotelRoomDetailRequest request) {
            super(request);
            this.hotelId = request.hotelId;
            this.mac = request.mac;
            this.roomNo = request.roomNo;
            this.sn = request.sn;
            this.uuid = request.uuid;
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
         * Mac.
         */
        public Builder mac(String mac) {
            this.putBodyParameter("Mac", mac);
            this.mac = mac;
            return this;
        }

        /**
         * RoomNo.
         */
        public Builder roomNo(String roomNo) {
            this.putBodyParameter("RoomNo", roomNo);
            this.roomNo = roomNo;
            return this;
        }

        /**
         * 设备sn信息
         * <p>
         * 注：若在mac uuid sn全都输入的情况下 按照输入正确的内容查询 若全输入都是正确的 则 按照 uuid > mac > sn 优先级查询
         * 传入mac uuid sn其中一个 则酒店id和房间号可不传
         */
        public Builder sn(String sn) {
            this.putBodyParameter("Sn", sn);
            this.sn = sn;
            return this;
        }

        /**
         * Uuid.
         */
        public Builder uuid(String uuid) {
            this.putBodyParameter("Uuid", uuid);
            this.uuid = uuid;
            return this;
        }

        @Override
        public QueryHotelRoomDetailRequest build() {
            return new QueryHotelRoomDetailRequest(this);
        } 

    } 

}
