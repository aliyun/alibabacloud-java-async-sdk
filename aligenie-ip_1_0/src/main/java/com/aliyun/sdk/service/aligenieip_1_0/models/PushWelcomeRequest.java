// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligenieip_1_0.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PushWelcomeRequest} extends {@link RequestModel}
 *
 * <p>PushWelcomeRequest</p>
 */
public class PushWelcomeRequest extends Request {
    @Body
    @NameInMap("HotelId")
    @Validation(required = true)
    private String hotelId;

    @Body
    @NameInMap("RoomNo")
    @Validation(required = true)
    private String roomNo;

    @Body
    @NameInMap("WelcomeMusicUrl")
    private String welcomeMusicUrl;

    @Body
    @NameInMap("WelcomeText")
    @Validation(required = true)
    private String welcomeText;

    private PushWelcomeRequest(Builder builder) {
        super(builder);
        this.hotelId = builder.hotelId;
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
        private String roomNo; 
        private String welcomeMusicUrl; 
        private String welcomeText; 

        private Builder() {
            super();
        } 

        private Builder(PushWelcomeRequest request) {
            super(request);
            this.hotelId = request.hotelId;
            this.roomNo = request.roomNo;
            this.welcomeMusicUrl = request.welcomeMusicUrl;
            this.welcomeText = request.welcomeText;
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
         * WelcomeText.
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
