// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligenieip_1_0.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link InvokeRobotPushRequest} extends {@link RequestModel}
 *
 * <p>InvokeRobotPushRequest</p>
 */
public class InvokeRobotPushRequest extends Request {
    @Body
    @NameInMap("HotelId")
    @Validation(required = true)
    private String hotelId;

    @Body
    @NameInMap("PushType")
    @Validation(required = true)
    private String pushType;

    @Body
    @NameInMap("RoomNo")
    @Validation(required = true)
    private String roomNo;

    private InvokeRobotPushRequest(Builder builder) {
        super(builder);
        this.hotelId = builder.hotelId;
        this.pushType = builder.pushType;
        this.roomNo = builder.roomNo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InvokeRobotPushRequest create() {
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
     * @return pushType
     */
    public String getPushType() {
        return this.pushType;
    }

    /**
     * @return roomNo
     */
    public String getRoomNo() {
        return this.roomNo;
    }

    public static final class Builder extends Request.Builder<InvokeRobotPushRequest, Builder> {
        private String hotelId; 
        private String pushType; 
        private String roomNo; 

        private Builder() {
            super();
        } 

        private Builder(InvokeRobotPushRequest request) {
            super(request);
            this.hotelId = request.hotelId;
            this.pushType = request.pushType;
            this.roomNo = request.roomNo;
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
         * PushType.
         */
        public Builder pushType(String pushType) {
            this.putBodyParameter("PushType", pushType);
            this.pushType = pushType;
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

        @Override
        public InvokeRobotPushRequest build() {
            return new InvokeRobotPushRequest(this);
        } 

    } 

}
