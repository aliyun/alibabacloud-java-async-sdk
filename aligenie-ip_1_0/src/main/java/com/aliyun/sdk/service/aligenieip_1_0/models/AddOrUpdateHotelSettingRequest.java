// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligenieip_1_0.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddOrUpdateHotelSettingRequest} extends {@link RequestModel}
 *
 * <p>AddOrUpdateHotelSettingRequest</p>
 */
public class AddOrUpdateHotelSettingRequest extends Request {
    @Body
    @NameInMap("HotelDeviceModeList")
    private java.util.List < String > hotelDeviceModeList;

    @Body
    @NameInMap("HotelId")
    private String hotelId;

    @Body
    @NameInMap("HotelScreenSaver")
    private HotelScreenSaver hotelScreenSaver;

    @Body
    @NameInMap("NightMode")
    private NightMode nightMode;

    @Body
    @NameInMap("SettingType")
    private String settingType;

    @Body
    @NameInMap("Value")
    private String value;

    private AddOrUpdateHotelSettingRequest(Builder builder) {
        super(builder);
        this.hotelDeviceModeList = builder.hotelDeviceModeList;
        this.hotelId = builder.hotelId;
        this.hotelScreenSaver = builder.hotelScreenSaver;
        this.nightMode = builder.nightMode;
        this.settingType = builder.settingType;
        this.value = builder.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddOrUpdateHotelSettingRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return hotelDeviceModeList
     */
    public java.util.List < String > getHotelDeviceModeList() {
        return this.hotelDeviceModeList;
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

    /**
     * @return nightMode
     */
    public NightMode getNightMode() {
        return this.nightMode;
    }

    /**
     * @return settingType
     */
    public String getSettingType() {
        return this.settingType;
    }

    /**
     * @return value
     */
    public String getValue() {
        return this.value;
    }

    public static final class Builder extends Request.Builder<AddOrUpdateHotelSettingRequest, Builder> {
        private java.util.List < String > hotelDeviceModeList; 
        private String hotelId; 
        private HotelScreenSaver hotelScreenSaver; 
        private NightMode nightMode; 
        private String settingType; 
        private String value; 

        private Builder() {
            super();
        } 

        private Builder(AddOrUpdateHotelSettingRequest request) {
            super(request);
            this.hotelDeviceModeList = request.hotelDeviceModeList;
            this.hotelId = request.hotelId;
            this.hotelScreenSaver = request.hotelScreenSaver;
            this.nightMode = request.nightMode;
            this.settingType = request.settingType;
            this.value = request.value;
        } 

        /**
         * HotelDeviceModeList.
         */
        public Builder hotelDeviceModeList(java.util.List < String > hotelDeviceModeList) {
            String hotelDeviceModeListShrink = shrink(hotelDeviceModeList, "HotelDeviceModeList", "json");
            this.putBodyParameter("HotelDeviceModeList", hotelDeviceModeListShrink);
            this.hotelDeviceModeList = hotelDeviceModeList;
            return this;
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

        /**
         * NightMode.
         */
        public Builder nightMode(NightMode nightMode) {
            String nightModeShrink = shrink(nightMode, "NightMode", "json");
            this.putBodyParameter("NightMode", nightModeShrink);
            this.nightMode = nightMode;
            return this;
        }

        /**
         * SettingType.
         */
        public Builder settingType(String settingType) {
            this.putBodyParameter("SettingType", settingType);
            this.settingType = settingType;
            return this;
        }

        /**
         * Value.
         */
        public Builder value(String value) {
            this.putBodyParameter("Value", value);
            this.value = value;
            return this;
        }

        @Override
        public AddOrUpdateHotelSettingRequest build() {
            return new AddOrUpdateHotelSettingRequest(this);
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
    public static class NightMode extends TeaModel {
        @NameInMap("DefaultBright")
        private String defaultBright;

        @NameInMap("DefaultVolume")
        private String defaultVolume;

        @NameInMap("Enable")
        private Boolean enable;

        @NameInMap("End")
        private String end;

        @NameInMap("StandbyAction")
        private String standbyAction;

        @NameInMap("Start")
        private String start;

        private NightMode(Builder builder) {
            this.defaultBright = builder.defaultBright;
            this.defaultVolume = builder.defaultVolume;
            this.enable = builder.enable;
            this.end = builder.end;
            this.standbyAction = builder.standbyAction;
            this.start = builder.start;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NightMode create() {
            return builder().build();
        }

        /**
         * @return defaultBright
         */
        public String getDefaultBright() {
            return this.defaultBright;
        }

        /**
         * @return defaultVolume
         */
        public String getDefaultVolume() {
            return this.defaultVolume;
        }

        /**
         * @return enable
         */
        public Boolean getEnable() {
            return this.enable;
        }

        /**
         * @return end
         */
        public String getEnd() {
            return this.end;
        }

        /**
         * @return standbyAction
         */
        public String getStandbyAction() {
            return this.standbyAction;
        }

        /**
         * @return start
         */
        public String getStart() {
            return this.start;
        }

        public static final class Builder {
            private String defaultBright; 
            private String defaultVolume; 
            private Boolean enable; 
            private String end; 
            private String standbyAction; 
            private String start; 

            /**
             * DefaultBright.
             */
            public Builder defaultBright(String defaultBright) {
                this.defaultBright = defaultBright;
                return this;
            }

            /**
             * DefaultVolume.
             */
            public Builder defaultVolume(String defaultVolume) {
                this.defaultVolume = defaultVolume;
                return this;
            }

            /**
             * Enable.
             */
            public Builder enable(Boolean enable) {
                this.enable = enable;
                return this;
            }

            /**
             * End.
             */
            public Builder end(String end) {
                this.end = end;
                return this;
            }

            /**
             * StandbyAction.
             */
            public Builder standbyAction(String standbyAction) {
                this.standbyAction = standbyAction;
                return this;
            }

            /**
             * Start.
             */
            public Builder start(String start) {
                this.start = start;
                return this;
            }

            public NightMode build() {
                return new NightMode(this);
            } 

        } 

    }
}
