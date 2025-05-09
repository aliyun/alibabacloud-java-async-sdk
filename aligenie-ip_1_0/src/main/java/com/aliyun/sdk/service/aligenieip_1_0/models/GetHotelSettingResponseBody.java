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
 * {@link GetHotelSettingResponseBody} extends {@link TeaModel}
 *
 * <p>GetHotelSettingResponseBody</p>
 */
public class GetHotelSettingResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private Result result;

    @com.aliyun.core.annotation.NameInMap("StatusCode")
    private Integer statusCode;

    private GetHotelSettingResponseBody(Builder builder) {
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.statusCode = builder.statusCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetHotelSettingResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return result
     */
    public Result getResult() {
        return this.result;
    }

    /**
     * @return statusCode
     */
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public static final class Builder {
        private String message; 
        private String requestId; 
        private Result result; 
        private Integer statusCode; 

        private Builder() {
        } 

        private Builder(GetHotelSettingResponseBody model) {
            this.message = model.message;
            this.requestId = model.requestId;
            this.result = model.result;
            this.statusCode = model.statusCode;
        } 

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Result.
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        /**
         * StatusCode.
         */
        public Builder statusCode(Integer statusCode) {
            this.statusCode = statusCode;
            return this;
        }

        public GetHotelSettingResponseBody build() {
            return new GetHotelSettingResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetHotelSettingResponseBody} extends {@link TeaModel}
     *
     * <p>GetHotelSettingResponseBody</p>
     */
    public static class HotelScreenSaver extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ScreenSaverPicUrl")
        private String screenSaverPicUrl;

        @com.aliyun.core.annotation.NameInMap("ScreenSaverStyle")
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

            private Builder() {
            } 

            private Builder(HotelScreenSaver model) {
                this.screenSaverPicUrl = model.screenSaverPicUrl;
                this.screenSaverStyle = model.screenSaverStyle;
            } 

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
    /**
     * 
     * {@link GetHotelSettingResponseBody} extends {@link TeaModel}
     *
     * <p>GetHotelSettingResponseBody</p>
     */
    public static class NightMode extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DefaultBright")
        private String defaultBright;

        @com.aliyun.core.annotation.NameInMap("DefaultVolume")
        private String defaultVolume;

        @com.aliyun.core.annotation.NameInMap("Enable")
        private Boolean enable;

        @com.aliyun.core.annotation.NameInMap("End")
        private String end;

        @com.aliyun.core.annotation.NameInMap("StandbyAction")
        private String standbyAction;

        @com.aliyun.core.annotation.NameInMap("Start")
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

            private Builder() {
            } 

            private Builder(NightMode model) {
                this.defaultBright = model.defaultBright;
                this.defaultVolume = model.defaultVolume;
                this.enable = model.enable;
                this.end = model.end;
                this.standbyAction = model.standbyAction;
                this.start = model.start;
            } 

            /**
             * <p>夜间模式下的默认亮度</p>
             */
            public Builder defaultBright(String defaultBright) {
                this.defaultBright = defaultBright;
                return this;
            }

            /**
             * <p>夜间模式下的默认音量</p>
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
    /**
     * 
     * {@link GetHotelSettingResponseBody} extends {@link TeaModel}
     *
     * <p>GetHotelSettingResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DeleteToken")
        private Long deleteToken;

        @com.aliyun.core.annotation.NameInMap("ExtInfo")
        private String extInfo;

        @com.aliyun.core.annotation.NameInMap("HotelDeviceModeList")
        private java.util.List<String> hotelDeviceModeList;

        @com.aliyun.core.annotation.NameInMap("HotelId")
        private String hotelId;

        @com.aliyun.core.annotation.NameInMap("HotelScreenSaver")
        private HotelScreenSaver hotelScreenSaver;

        @com.aliyun.core.annotation.NameInMap("NightMode")
        private NightMode nightMode;

        @com.aliyun.core.annotation.NameInMap("SettingType")
        private String settingType;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Result(Builder builder) {
            this.deleteToken = builder.deleteToken;
            this.extInfo = builder.extInfo;
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

        public static Result create() {
            return builder().build();
        }

        /**
         * @return deleteToken
         */
        public Long getDeleteToken() {
            return this.deleteToken;
        }

        /**
         * @return extInfo
         */
        public String getExtInfo() {
            return this.extInfo;
        }

        /**
         * @return hotelDeviceModeList
         */
        public java.util.List<String> getHotelDeviceModeList() {
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

        public static final class Builder {
            private Long deleteToken; 
            private String extInfo; 
            private java.util.List<String> hotelDeviceModeList; 
            private String hotelId; 
            private HotelScreenSaver hotelScreenSaver; 
            private NightMode nightMode; 
            private String settingType; 
            private String value; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.deleteToken = model.deleteToken;
                this.extInfo = model.extInfo;
                this.hotelDeviceModeList = model.hotelDeviceModeList;
                this.hotelId = model.hotelId;
                this.hotelScreenSaver = model.hotelScreenSaver;
                this.nightMode = model.nightMode;
                this.settingType = model.settingType;
                this.value = model.value;
            } 

            /**
             * DeleteToken.
             */
            public Builder deleteToken(Long deleteToken) {
                this.deleteToken = deleteToken;
                return this;
            }

            /**
             * ExtInfo.
             */
            public Builder extInfo(String extInfo) {
                this.extInfo = extInfo;
                return this;
            }

            /**
             * HotelDeviceModeList.
             */
            public Builder hotelDeviceModeList(java.util.List<String> hotelDeviceModeList) {
                this.hotelDeviceModeList = hotelDeviceModeList;
                return this;
            }

            /**
             * HotelId.
             */
            public Builder hotelId(String hotelId) {
                this.hotelId = hotelId;
                return this;
            }

            /**
             * HotelScreenSaver.
             */
            public Builder hotelScreenSaver(HotelScreenSaver hotelScreenSaver) {
                this.hotelScreenSaver = hotelScreenSaver;
                return this;
            }

            /**
             * NightMode.
             */
            public Builder nightMode(NightMode nightMode) {
                this.nightMode = nightMode;
                return this;
            }

            /**
             * SettingType.
             */
            public Builder settingType(String settingType) {
                this.settingType = settingType;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
