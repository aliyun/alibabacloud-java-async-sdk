// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDeviceConfigResponseBody} extends {@link TeaModel}
 *
 * <p>GetDeviceConfigResponseBody</p>
 */
public class GetDeviceConfigResponseBody extends TeaModel {
    @NameInMap("AudioEnable")
    private String audioEnable;

    @NameInMap("AudioFormat")
    private String audioFormat;

    @NameInMap("BitRate")
    private String bitRate;

    @NameInMap("ChannelList")
    private java.util.List < ChannelList> channelList;

    @NameInMap("Code")
    private String code;

    @NameInMap("DeviceAddress")
    private String deviceAddress;

    @NameInMap("DeviceId")
    private String deviceId;

    @NameInMap("DeviceName")
    private String deviceName;

    @NameInMap("EncodeFormat")
    private String encodeFormat;

    @NameInMap("FrameRate")
    private String frameRate;

    @NameInMap("GovLength")
    private Long govLength;

    @NameInMap("Latitude")
    private String latitude;

    @NameInMap("Longitude")
    private String longitude;

    @NameInMap("Message")
    private String message;

    @NameInMap("OSDList")
    private java.util.List < OSDList> OSDList;

    @NameInMap("OSDTimeEnable")
    private String OSDTimeEnable;

    @NameInMap("OSDTimeType")
    private String OSDTimeType;

    @NameInMap("OSDTimeX")
    private String OSDTimeX;

    @NameInMap("OSDTimeY")
    private String OSDTimeY;

    @NameInMap("PassWord")
    private String passWord;

    @NameInMap("Protocol")
    private String protocol;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Resolution")
    private String resolution;

    @NameInMap("RetryInterval")
    private String retryInterval;

    @NameInMap("ServerId")
    private String serverId;

    @NameInMap("ServerIp")
    private String serverIp;

    @NameInMap("ServerPort")
    private String serverPort;

    @NameInMap("UserName")
    private String userName;

    private GetDeviceConfigResponseBody(Builder builder) {
        this.audioEnable = builder.audioEnable;
        this.audioFormat = builder.audioFormat;
        this.bitRate = builder.bitRate;
        this.channelList = builder.channelList;
        this.code = builder.code;
        this.deviceAddress = builder.deviceAddress;
        this.deviceId = builder.deviceId;
        this.deviceName = builder.deviceName;
        this.encodeFormat = builder.encodeFormat;
        this.frameRate = builder.frameRate;
        this.govLength = builder.govLength;
        this.latitude = builder.latitude;
        this.longitude = builder.longitude;
        this.message = builder.message;
        this.OSDList = builder.OSDList;
        this.OSDTimeEnable = builder.OSDTimeEnable;
        this.OSDTimeType = builder.OSDTimeType;
        this.OSDTimeX = builder.OSDTimeX;
        this.OSDTimeY = builder.OSDTimeY;
        this.passWord = builder.passWord;
        this.protocol = builder.protocol;
        this.requestId = builder.requestId;
        this.resolution = builder.resolution;
        this.retryInterval = builder.retryInterval;
        this.serverId = builder.serverId;
        this.serverIp = builder.serverIp;
        this.serverPort = builder.serverPort;
        this.userName = builder.userName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDeviceConfigResponseBody create() {
        return builder().build();
    }

    /**
     * @return audioEnable
     */
    public String getAudioEnable() {
        return this.audioEnable;
    }

    /**
     * @return audioFormat
     */
    public String getAudioFormat() {
        return this.audioFormat;
    }

    /**
     * @return bitRate
     */
    public String getBitRate() {
        return this.bitRate;
    }

    /**
     * @return channelList
     */
    public java.util.List < ChannelList> getChannelList() {
        return this.channelList;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return deviceAddress
     */
    public String getDeviceAddress() {
        return this.deviceAddress;
    }

    /**
     * @return deviceId
     */
    public String getDeviceId() {
        return this.deviceId;
    }

    /**
     * @return deviceName
     */
    public String getDeviceName() {
        return this.deviceName;
    }

    /**
     * @return encodeFormat
     */
    public String getEncodeFormat() {
        return this.encodeFormat;
    }

    /**
     * @return frameRate
     */
    public String getFrameRate() {
        return this.frameRate;
    }

    /**
     * @return govLength
     */
    public Long getGovLength() {
        return this.govLength;
    }

    /**
     * @return latitude
     */
    public String getLatitude() {
        return this.latitude;
    }

    /**
     * @return longitude
     */
    public String getLongitude() {
        return this.longitude;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return OSDList
     */
    public java.util.List < OSDList> getOSDList() {
        return this.OSDList;
    }

    /**
     * @return OSDTimeEnable
     */
    public String getOSDTimeEnable() {
        return this.OSDTimeEnable;
    }

    /**
     * @return OSDTimeType
     */
    public String getOSDTimeType() {
        return this.OSDTimeType;
    }

    /**
     * @return OSDTimeX
     */
    public String getOSDTimeX() {
        return this.OSDTimeX;
    }

    /**
     * @return OSDTimeY
     */
    public String getOSDTimeY() {
        return this.OSDTimeY;
    }

    /**
     * @return passWord
     */
    public String getPassWord() {
        return this.passWord;
    }

    /**
     * @return protocol
     */
    public String getProtocol() {
        return this.protocol;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resolution
     */
    public String getResolution() {
        return this.resolution;
    }

    /**
     * @return retryInterval
     */
    public String getRetryInterval() {
        return this.retryInterval;
    }

    /**
     * @return serverId
     */
    public String getServerId() {
        return this.serverId;
    }

    /**
     * @return serverIp
     */
    public String getServerIp() {
        return this.serverIp;
    }

    /**
     * @return serverPort
     */
    public String getServerPort() {
        return this.serverPort;
    }

    /**
     * @return userName
     */
    public String getUserName() {
        return this.userName;
    }

    public static final class Builder {
        private String audioEnable; 
        private String audioFormat; 
        private String bitRate; 
        private java.util.List < ChannelList> channelList; 
        private String code; 
        private String deviceAddress; 
        private String deviceId; 
        private String deviceName; 
        private String encodeFormat; 
        private String frameRate; 
        private Long govLength; 
        private String latitude; 
        private String longitude; 
        private String message; 
        private java.util.List < OSDList> OSDList; 
        private String OSDTimeEnable; 
        private String OSDTimeType; 
        private String OSDTimeX; 
        private String OSDTimeY; 
        private String passWord; 
        private String protocol; 
        private String requestId; 
        private String resolution; 
        private String retryInterval; 
        private String serverId; 
        private String serverIp; 
        private String serverPort; 
        private String userName; 

        /**
         * AudioEnable.
         */
        public Builder audioEnable(String audioEnable) {
            this.audioEnable = audioEnable;
            return this;
        }

        /**
         * AudioFormat.
         */
        public Builder audioFormat(String audioFormat) {
            this.audioFormat = audioFormat;
            return this;
        }

        /**
         * BitRate.
         */
        public Builder bitRate(String bitRate) {
            this.bitRate = bitRate;
            return this;
        }

        /**
         * ChannelList.
         */
        public Builder channelList(java.util.List < ChannelList> channelList) {
            this.channelList = channelList;
            return this;
        }

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * DeviceAddress.
         */
        public Builder deviceAddress(String deviceAddress) {
            this.deviceAddress = deviceAddress;
            return this;
        }

        /**
         * DeviceId.
         */
        public Builder deviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }

        /**
         * DeviceName.
         */
        public Builder deviceName(String deviceName) {
            this.deviceName = deviceName;
            return this;
        }

        /**
         * EncodeFormat.
         */
        public Builder encodeFormat(String encodeFormat) {
            this.encodeFormat = encodeFormat;
            return this;
        }

        /**
         * FrameRate.
         */
        public Builder frameRate(String frameRate) {
            this.frameRate = frameRate;
            return this;
        }

        /**
         * GovLength.
         */
        public Builder govLength(Long govLength) {
            this.govLength = govLength;
            return this;
        }

        /**
         * Latitude.
         */
        public Builder latitude(String latitude) {
            this.latitude = latitude;
            return this;
        }

        /**
         * Longitude.
         */
        public Builder longitude(String longitude) {
            this.longitude = longitude;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * OSDList.
         */
        public Builder OSDList(java.util.List < OSDList> OSDList) {
            this.OSDList = OSDList;
            return this;
        }

        /**
         * OSDTimeEnable.
         */
        public Builder OSDTimeEnable(String OSDTimeEnable) {
            this.OSDTimeEnable = OSDTimeEnable;
            return this;
        }

        /**
         * OSDTimeType.
         */
        public Builder OSDTimeType(String OSDTimeType) {
            this.OSDTimeType = OSDTimeType;
            return this;
        }

        /**
         * OSDTimeX.
         */
        public Builder OSDTimeX(String OSDTimeX) {
            this.OSDTimeX = OSDTimeX;
            return this;
        }

        /**
         * OSDTimeY.
         */
        public Builder OSDTimeY(String OSDTimeY) {
            this.OSDTimeY = OSDTimeY;
            return this;
        }

        /**
         * PassWord.
         */
        public Builder passWord(String passWord) {
            this.passWord = passWord;
            return this;
        }

        /**
         * Protocol.
         */
        public Builder protocol(String protocol) {
            this.protocol = protocol;
            return this;
        }

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Resolution.
         */
        public Builder resolution(String resolution) {
            this.resolution = resolution;
            return this;
        }

        /**
         * RetryInterval.
         */
        public Builder retryInterval(String retryInterval) {
            this.retryInterval = retryInterval;
            return this;
        }

        /**
         * ServerId.
         */
        public Builder serverId(String serverId) {
            this.serverId = serverId;
            return this;
        }

        /**
         * ServerIp.
         */
        public Builder serverIp(String serverIp) {
            this.serverIp = serverIp;
            return this;
        }

        /**
         * ServerPort.
         */
        public Builder serverPort(String serverPort) {
            this.serverPort = serverPort;
            return this;
        }

        /**
         * UserName.
         */
        public Builder userName(String userName) {
            this.userName = userName;
            return this;
        }

        public GetDeviceConfigResponseBody build() {
            return new GetDeviceConfigResponseBody(this);
        } 

    } 

    public static class ChannelList extends TeaModel {
        @NameInMap("ChannelGbId")
        private String channelGbId;

        @NameInMap("FridayCaptureStrategy")
        private String fridayCaptureStrategy;

        @NameInMap("MondayCaptureStrategy")
        private String mondayCaptureStrategy;

        @NameInMap("SaturdayCaptureStrategy")
        private String saturdayCaptureStrategy;

        @NameInMap("SundayCaptureStrategy")
        private String sundayCaptureStrategy;

        @NameInMap("ThursdayCaptureStrategy")
        private String thursdayCaptureStrategy;

        @NameInMap("TuesdayCaptureStrategy")
        private String tuesdayCaptureStrategy;

        @NameInMap("WednesdayCaptureStrategy")
        private String wednesdayCaptureStrategy;

        private ChannelList(Builder builder) {
            this.channelGbId = builder.channelGbId;
            this.fridayCaptureStrategy = builder.fridayCaptureStrategy;
            this.mondayCaptureStrategy = builder.mondayCaptureStrategy;
            this.saturdayCaptureStrategy = builder.saturdayCaptureStrategy;
            this.sundayCaptureStrategy = builder.sundayCaptureStrategy;
            this.thursdayCaptureStrategy = builder.thursdayCaptureStrategy;
            this.tuesdayCaptureStrategy = builder.tuesdayCaptureStrategy;
            this.wednesdayCaptureStrategy = builder.wednesdayCaptureStrategy;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ChannelList create() {
            return builder().build();
        }

        /**
         * @return channelGbId
         */
        public String getChannelGbId() {
            return this.channelGbId;
        }

        /**
         * @return fridayCaptureStrategy
         */
        public String getFridayCaptureStrategy() {
            return this.fridayCaptureStrategy;
        }

        /**
         * @return mondayCaptureStrategy
         */
        public String getMondayCaptureStrategy() {
            return this.mondayCaptureStrategy;
        }

        /**
         * @return saturdayCaptureStrategy
         */
        public String getSaturdayCaptureStrategy() {
            return this.saturdayCaptureStrategy;
        }

        /**
         * @return sundayCaptureStrategy
         */
        public String getSundayCaptureStrategy() {
            return this.sundayCaptureStrategy;
        }

        /**
         * @return thursdayCaptureStrategy
         */
        public String getThursdayCaptureStrategy() {
            return this.thursdayCaptureStrategy;
        }

        /**
         * @return tuesdayCaptureStrategy
         */
        public String getTuesdayCaptureStrategy() {
            return this.tuesdayCaptureStrategy;
        }

        /**
         * @return wednesdayCaptureStrategy
         */
        public String getWednesdayCaptureStrategy() {
            return this.wednesdayCaptureStrategy;
        }

        public static final class Builder {
            private String channelGbId; 
            private String fridayCaptureStrategy; 
            private String mondayCaptureStrategy; 
            private String saturdayCaptureStrategy; 
            private String sundayCaptureStrategy; 
            private String thursdayCaptureStrategy; 
            private String tuesdayCaptureStrategy; 
            private String wednesdayCaptureStrategy; 

            /**
             * ChannelGbId.
             */
            public Builder channelGbId(String channelGbId) {
                this.channelGbId = channelGbId;
                return this;
            }

            /**
             * FridayCaptureStrategy.
             */
            public Builder fridayCaptureStrategy(String fridayCaptureStrategy) {
                this.fridayCaptureStrategy = fridayCaptureStrategy;
                return this;
            }

            /**
             * MondayCaptureStrategy.
             */
            public Builder mondayCaptureStrategy(String mondayCaptureStrategy) {
                this.mondayCaptureStrategy = mondayCaptureStrategy;
                return this;
            }

            /**
             * SaturdayCaptureStrategy.
             */
            public Builder saturdayCaptureStrategy(String saturdayCaptureStrategy) {
                this.saturdayCaptureStrategy = saturdayCaptureStrategy;
                return this;
            }

            /**
             * SundayCaptureStrategy.
             */
            public Builder sundayCaptureStrategy(String sundayCaptureStrategy) {
                this.sundayCaptureStrategy = sundayCaptureStrategy;
                return this;
            }

            /**
             * ThursdayCaptureStrategy.
             */
            public Builder thursdayCaptureStrategy(String thursdayCaptureStrategy) {
                this.thursdayCaptureStrategy = thursdayCaptureStrategy;
                return this;
            }

            /**
             * TuesdayCaptureStrategy.
             */
            public Builder tuesdayCaptureStrategy(String tuesdayCaptureStrategy) {
                this.tuesdayCaptureStrategy = tuesdayCaptureStrategy;
                return this;
            }

            /**
             * WednesdayCaptureStrategy.
             */
            public Builder wednesdayCaptureStrategy(String wednesdayCaptureStrategy) {
                this.wednesdayCaptureStrategy = wednesdayCaptureStrategy;
                return this;
            }

            public ChannelList build() {
                return new ChannelList(this);
            } 

        } 

    }
    public static class OSDList extends TeaModel {
        @NameInMap("LeftTopX")
        private String leftTopX;

        @NameInMap("LeftTopY")
        private String leftTopY;

        @NameInMap("Text")
        private String text;

        private OSDList(Builder builder) {
            this.leftTopX = builder.leftTopX;
            this.leftTopY = builder.leftTopY;
            this.text = builder.text;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OSDList create() {
            return builder().build();
        }

        /**
         * @return leftTopX
         */
        public String getLeftTopX() {
            return this.leftTopX;
        }

        /**
         * @return leftTopY
         */
        public String getLeftTopY() {
            return this.leftTopY;
        }

        /**
         * @return text
         */
        public String getText() {
            return this.text;
        }

        public static final class Builder {
            private String leftTopX; 
            private String leftTopY; 
            private String text; 

            /**
             * LeftTopX.
             */
            public Builder leftTopX(String leftTopX) {
                this.leftTopX = leftTopX;
                return this;
            }

            /**
             * LeftTopY.
             */
            public Builder leftTopY(String leftTopY) {
                this.leftTopY = leftTopY;
                return this;
            }

            /**
             * Text.
             */
            public Builder text(String text) {
                this.text = text;
                return this;
            }

            public OSDList build() {
                return new OSDList(this);
            } 

        } 

    }
}
