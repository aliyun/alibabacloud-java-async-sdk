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
 * {@link InvokeRobotPushRequest} extends {@link RequestModel}
 *
 * <p>InvokeRobotPushRequest</p>
 */
public class InvokeRobotPushRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("HotelId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String hotelId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PushType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String pushType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RoomName")
    private String roomName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RoomNo")
    private String roomNo;

    private InvokeRobotPushRequest(Builder builder) {
        super(builder);
        this.hotelId = builder.hotelId;
        this.pushType = builder.pushType;
        this.roomName = builder.roomName;
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
     * @return roomName
     */
    public String getRoomName() {
        return this.roomName;
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
        private String roomName; 
        private String roomNo; 

        private Builder() {
            super();
        } 

        private Builder(InvokeRobotPushRequest request) {
            super(request);
            this.hotelId = request.hotelId;
            this.pushType = request.pushType;
            this.roomName = request.roomName;
            this.roomNo = request.roomNo;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>af7***536</p>
         */
        public Builder hotelId(String hotelId) {
            this.putBodyParameter("HotelId", hotelId);
            this.hotelId = hotelId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>GET</p>
         */
        public Builder pushType(String pushType) {
            this.putBodyParameter("PushType", pushType);
            this.pushType = pushType;
            return this;
        }

        /**
         * RoomName.
         */
        public Builder roomName(String roomName) {
            this.putBodyParameter("RoomName", roomName);
            this.roomName = roomName;
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
