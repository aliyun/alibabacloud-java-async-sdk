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
 * {@link PushWelcomeRequest} extends {@link RequestModel}
 *
 * <p>PushWelcomeRequest</p>
 */
public class PushWelcomeRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("HotelId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String hotelId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RoomName")
    private String roomName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RoomNo")
    private String roomNo;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WelcomeMusicUrl")
    private String welcomeMusicUrl;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WelcomeText")
    @com.aliyun.core.annotation.Validation(required = true)
    private String welcomeText;

    private PushWelcomeRequest(Builder builder) {
        super(builder);
        this.hotelId = builder.hotelId;
        this.roomName = builder.roomName;
        this.roomNo = builder.roomNo;
        this.welcomeMusicUrl = builder.welcomeMusicUrl;
        this.welcomeText = builder.welcomeText;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PushWelcomeRequest create() {
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

    /**
     * @return welcomeMusicUrl
     */
    public String getWelcomeMusicUrl() {
        return this.welcomeMusicUrl;
    }

    /**
     * @return welcomeText
     */
    public String getWelcomeText() {
        return this.welcomeText;
    }

    public static final class Builder extends Request.Builder<PushWelcomeRequest, Builder> {
        private String hotelId; 
        private String roomName; 
        private String roomNo; 
        private String welcomeMusicUrl; 
        private String welcomeText; 

        private Builder() {
            super();
        } 

        private Builder(PushWelcomeRequest request) {
            super(request);
            this.hotelId = request.hotelId;
            this.roomName = request.roomName;
            this.roomNo = request.roomNo;
            this.welcomeMusicUrl = request.welcomeMusicUrl;
            this.welcomeText = request.welcomeText;
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

        /**
         * WelcomeMusicUrl.
         */
        public Builder welcomeMusicUrl(String welcomeMusicUrl) {
            this.putBodyParameter("WelcomeMusicUrl", welcomeMusicUrl);
            this.welcomeMusicUrl = welcomeMusicUrl;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder welcomeText(String welcomeText) {
            this.putBodyParameter("WelcomeText", welcomeText);
            this.welcomeText = welcomeText;
            return this;
        }

        @Override
        public PushWelcomeRequest build() {
            return new PushWelcomeRequest(this);
        } 

    } 

}
