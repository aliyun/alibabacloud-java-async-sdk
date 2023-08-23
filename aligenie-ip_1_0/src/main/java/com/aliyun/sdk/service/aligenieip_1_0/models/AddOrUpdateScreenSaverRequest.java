// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligenieip_1_0.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddOrUpdateScreenSaverRequest} extends {@link RequestModel}
 *
 * <p>AddOrUpdateScreenSaverRequest</p>
 */
public class AddOrUpdateScreenSaverRequest extends Request {
    @Body
    @NameInMap("HotelId")
    @Validation(required = true)
    private String hotelId;

    @Body
    @NameInMap("HotelScreenSaver")
    @Validation(required = true)
    private HotelScreenSaver hotelScreenSaver;

    private AddOrUpdateScreenSaverRequest(Builder builder) {
        super(builder);
        this.hotelId = builder.hotelId;
        this.hotelScreenSaver = builder.hotelScreenSaver;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddOrUpdateScreenSaverRequest create() {
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
     * @return hotelScreenSaver
     */
    public HotelScreenSaver getHotelScreenSaver() {
        return this.hotelScreenSaver;
    }

    public static final class Builder extends Request.Builder<AddOrUpdateScreenSaverRequest, Builder> {
        private String hotelId; 
        private HotelScreenSaver hotelScreenSaver; 

        private Builder() {
            super();
        } 

        private Builder(AddOrUpdateScreenSaverRequest request) {
            super(request);
            this.hotelId = request.hotelId;
            this.hotelScreenSaver = request.hotelScreenSaver;
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
         * HotelScreenSaver.
         */
        public Builder hotelScreenSaver(HotelScreenSaver hotelScreenSaver) {
            String hotelScreenSaverShrink = shrink(hotelScreenSaver, "HotelScreenSaver", "json");
            this.putBodyParameter("HotelScreenSaver", hotelScreenSaverShrink);
            this.hotelScreenSaver = hotelScreenSaver;
            return this;
        }

        @Override
        public AddOrUpdateScreenSaverRequest build() {
            return new AddOrUpdateScreenSaverRequest(this);
        } 

    } 

    public static class HotelScreenSaver extends TeaModel {
        @NameInMap("ScreenSaverPicUrl")
        private String screenSaverPicUrl;

        @NameInMap("ScreenSaverStyle")
        private String screenSaverStyle;

        private HotelScreenSaver(Builder builder) {
            this.screenSaverPicUrl = builder.screenSaverPicUrl;
            this.screenSaverStyle = builder.screenSaverStyle;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HotelScreenSaver create() {
            return builder().build();
        }

        /**
         * @return screenSaverPicUrl
         */
        public String getScreenSaverPicUrl() {
            return this.screenSaverPicUrl;
        }

        /**
         * @return screenSaverStyle
         */
        public String getScreenSaverStyle() {
            return this.screenSaverStyle;
        }

        public static final class Builder {
            private String screenSaverPicUrl; 
            private String screenSaverStyle; 

            /**
             * ScreenSaverPicUrl.
             */
            public Builder screenSaverPicUrl(String screenSaverPicUrl) {
                this.screenSaverPicUrl = screenSaverPicUrl;
                return this;
            }

            /**
             * ScreenSaverStyle.
             */
            public Builder screenSaverStyle(String screenSaverStyle) {
                this.screenSaverStyle = screenSaverStyle;
                return this;
            }

            public HotelScreenSaver build() {
                return new HotelScreenSaver(this);
            } 

        } 

    }
}
