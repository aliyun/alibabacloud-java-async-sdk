// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

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
 * {@link DescribePlayDetailResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePlayDetailResponseBody</p>
 */
public class DescribePlayDetailResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BaseInfos")
    private java.util.List<BaseInfos> baseInfos;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribePlayDetailResponseBody(Builder builder) {
        this.baseInfos = builder.baseInfos;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePlayDetailResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return baseInfos
     */
    public java.util.List<BaseInfos> getBaseInfos() {
        return this.baseInfos;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<BaseInfos> baseInfos; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribePlayDetailResponseBody model) {
            this.baseInfos = model.baseInfos;
            this.requestId = model.requestId;
        } 

        /**
         * BaseInfos.
         */
        public Builder baseInfos(java.util.List<BaseInfos> baseInfos) {
            this.baseInfos = baseInfos;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribePlayDetailResponseBody build() {
            return new DescribePlayDetailResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribePlayDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePlayDetailResponseBody</p>
     */
    public static class BaseInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppName")
        private String appName;

        @com.aliyun.core.annotation.NameInMap("Bps")
        private String bps;

        @com.aliyun.core.annotation.NameInMap("BroadcastPace")
        private String broadcastPace;

        @com.aliyun.core.annotation.NameInMap("ClientIP")
        private String clientIP;

        @com.aliyun.core.annotation.NameInMap("Codec")
        private String codec;

        @com.aliyun.core.annotation.NameInMap("DecodeStuckTime")
        private String decodeStuckTime;

        @com.aliyun.core.annotation.NameInMap("Definition")
        private String definition;

        @com.aliyun.core.annotation.NameInMap("FirstFrameDuration")
        private String firstFrameDuration;

        @com.aliyun.core.annotation.NameInMap("Fps")
        private String fps;

        @com.aliyun.core.annotation.NameInMap("IsHardDecode")
        private String isHardDecode;

        @com.aliyun.core.annotation.NameInMap("Mdat")
        private String mdat;

        @com.aliyun.core.annotation.NameInMap("Moov")
        private String moov;

        @com.aliyun.core.annotation.NameInMap("Network")
        private String network;

        @com.aliyun.core.annotation.NameInMap("NetworkDuration")
        private String networkDuration;

        @com.aliyun.core.annotation.NameInMap("NetworkStuckTime")
        private String networkStuckTime;

        @com.aliyun.core.annotation.NameInMap("Os")
        private String os;

        @com.aliyun.core.annotation.NameInMap("PlayTs")
        private String playTs;

        @com.aliyun.core.annotation.NameInMap("PlayerLoadDuration")
        private String playerLoadDuration;

        @com.aliyun.core.annotation.NameInMap("PlayerPreDealDuration")
        private String playerPreDealDuration;

        @com.aliyun.core.annotation.NameInMap("PlayerReadyDuration")
        private String playerReadyDuration;

        @com.aliyun.core.annotation.NameInMap("SdkVersion")
        private String sdkVersion;

        @com.aliyun.core.annotation.NameInMap("SessionId")
        private String sessionId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TerminalType")
        private String terminalType;

        private BaseInfos(Builder builder) {
            this.appName = builder.appName;
            this.bps = builder.bps;
            this.broadcastPace = builder.broadcastPace;
            this.clientIP = builder.clientIP;
            this.codec = builder.codec;
            this.decodeStuckTime = builder.decodeStuckTime;
            this.definition = builder.definition;
            this.firstFrameDuration = builder.firstFrameDuration;
            this.fps = builder.fps;
            this.isHardDecode = builder.isHardDecode;
            this.mdat = builder.mdat;
            this.moov = builder.moov;
            this.network = builder.network;
            this.networkDuration = builder.networkDuration;
            this.networkStuckTime = builder.networkStuckTime;
            this.os = builder.os;
            this.playTs = builder.playTs;
            this.playerLoadDuration = builder.playerLoadDuration;
            this.playerPreDealDuration = builder.playerPreDealDuration;
            this.playerReadyDuration = builder.playerReadyDuration;
            this.sdkVersion = builder.sdkVersion;
            this.sessionId = builder.sessionId;
            this.status = builder.status;
            this.terminalType = builder.terminalType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BaseInfos create() {
            return builder().build();
        }

        /**
         * @return appName
         */
        public String getAppName() {
            return this.appName;
        }

        /**
         * @return bps
         */
        public String getBps() {
            return this.bps;
        }

        /**
         * @return broadcastPace
         */
        public String getBroadcastPace() {
            return this.broadcastPace;
        }

        /**
         * @return clientIP
         */
        public String getClientIP() {
            return this.clientIP;
        }

        /**
         * @return codec
         */
        public String getCodec() {
            return this.codec;
        }

        /**
         * @return decodeStuckTime
         */
        public String getDecodeStuckTime() {
            return this.decodeStuckTime;
        }

        /**
         * @return definition
         */
        public String getDefinition() {
            return this.definition;
        }

        /**
         * @return firstFrameDuration
         */
        public String getFirstFrameDuration() {
            return this.firstFrameDuration;
        }

        /**
         * @return fps
         */
        public String getFps() {
            return this.fps;
        }

        /**
         * @return isHardDecode
         */
        public String getIsHardDecode() {
            return this.isHardDecode;
        }

        /**
         * @return mdat
         */
        public String getMdat() {
            return this.mdat;
        }

        /**
         * @return moov
         */
        public String getMoov() {
            return this.moov;
        }

        /**
         * @return network
         */
        public String getNetwork() {
            return this.network;
        }

        /**
         * @return networkDuration
         */
        public String getNetworkDuration() {
            return this.networkDuration;
        }

        /**
         * @return networkStuckTime
         */
        public String getNetworkStuckTime() {
            return this.networkStuckTime;
        }

        /**
         * @return os
         */
        public String getOs() {
            return this.os;
        }

        /**
         * @return playTs
         */
        public String getPlayTs() {
            return this.playTs;
        }

        /**
         * @return playerLoadDuration
         */
        public String getPlayerLoadDuration() {
            return this.playerLoadDuration;
        }

        /**
         * @return playerPreDealDuration
         */
        public String getPlayerPreDealDuration() {
            return this.playerPreDealDuration;
        }

        /**
         * @return playerReadyDuration
         */
        public String getPlayerReadyDuration() {
            return this.playerReadyDuration;
        }

        /**
         * @return sdkVersion
         */
        public String getSdkVersion() {
            return this.sdkVersion;
        }

        /**
         * @return sessionId
         */
        public String getSessionId() {
            return this.sessionId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return terminalType
         */
        public String getTerminalType() {
            return this.terminalType;
        }

        public static final class Builder {
            private String appName; 
            private String bps; 
            private String broadcastPace; 
            private String clientIP; 
            private String codec; 
            private String decodeStuckTime; 
            private String definition; 
            private String firstFrameDuration; 
            private String fps; 
            private String isHardDecode; 
            private String mdat; 
            private String moov; 
            private String network; 
            private String networkDuration; 
            private String networkStuckTime; 
            private String os; 
            private String playTs; 
            private String playerLoadDuration; 
            private String playerPreDealDuration; 
            private String playerReadyDuration; 
            private String sdkVersion; 
            private String sessionId; 
            private String status; 
            private String terminalType; 

            private Builder() {
            } 

            private Builder(BaseInfos model) {
                this.appName = model.appName;
                this.bps = model.bps;
                this.broadcastPace = model.broadcastPace;
                this.clientIP = model.clientIP;
                this.codec = model.codec;
                this.decodeStuckTime = model.decodeStuckTime;
                this.definition = model.definition;
                this.firstFrameDuration = model.firstFrameDuration;
                this.fps = model.fps;
                this.isHardDecode = model.isHardDecode;
                this.mdat = model.mdat;
                this.moov = model.moov;
                this.network = model.network;
                this.networkDuration = model.networkDuration;
                this.networkStuckTime = model.networkStuckTime;
                this.os = model.os;
                this.playTs = model.playTs;
                this.playerLoadDuration = model.playerLoadDuration;
                this.playerPreDealDuration = model.playerPreDealDuration;
                this.playerReadyDuration = model.playerReadyDuration;
                this.sdkVersion = model.sdkVersion;
                this.sessionId = model.sessionId;
                this.status = model.status;
                this.terminalType = model.terminalType;
            } 

            /**
             * AppName.
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
            }

            /**
             * Bps.
             */
            public Builder bps(String bps) {
                this.bps = bps;
                return this;
            }

            /**
             * BroadcastPace.
             */
            public Builder broadcastPace(String broadcastPace) {
                this.broadcastPace = broadcastPace;
                return this;
            }

            /**
             * ClientIP.
             */
            public Builder clientIP(String clientIP) {
                this.clientIP = clientIP;
                return this;
            }

            /**
             * Codec.
             */
            public Builder codec(String codec) {
                this.codec = codec;
                return this;
            }

            /**
             * DecodeStuckTime.
             */
            public Builder decodeStuckTime(String decodeStuckTime) {
                this.decodeStuckTime = decodeStuckTime;
                return this;
            }

            /**
             * Definition.
             */
            public Builder definition(String definition) {
                this.definition = definition;
                return this;
            }

            /**
             * FirstFrameDuration.
             */
            public Builder firstFrameDuration(String firstFrameDuration) {
                this.firstFrameDuration = firstFrameDuration;
                return this;
            }

            /**
             * Fps.
             */
            public Builder fps(String fps) {
                this.fps = fps;
                return this;
            }

            /**
             * IsHardDecode.
             */
            public Builder isHardDecode(String isHardDecode) {
                this.isHardDecode = isHardDecode;
                return this;
            }

            /**
             * Mdat.
             */
            public Builder mdat(String mdat) {
                this.mdat = mdat;
                return this;
            }

            /**
             * Moov.
             */
            public Builder moov(String moov) {
                this.moov = moov;
                return this;
            }

            /**
             * Network.
             */
            public Builder network(String network) {
                this.network = network;
                return this;
            }

            /**
             * NetworkDuration.
             */
            public Builder networkDuration(String networkDuration) {
                this.networkDuration = networkDuration;
                return this;
            }

            /**
             * NetworkStuckTime.
             */
            public Builder networkStuckTime(String networkStuckTime) {
                this.networkStuckTime = networkStuckTime;
                return this;
            }

            /**
             * Os.
             */
            public Builder os(String os) {
                this.os = os;
                return this;
            }

            /**
             * PlayTs.
             */
            public Builder playTs(String playTs) {
                this.playTs = playTs;
                return this;
            }

            /**
             * PlayerLoadDuration.
             */
            public Builder playerLoadDuration(String playerLoadDuration) {
                this.playerLoadDuration = playerLoadDuration;
                return this;
            }

            /**
             * PlayerPreDealDuration.
             */
            public Builder playerPreDealDuration(String playerPreDealDuration) {
                this.playerPreDealDuration = playerPreDealDuration;
                return this;
            }

            /**
             * PlayerReadyDuration.
             */
            public Builder playerReadyDuration(String playerReadyDuration) {
                this.playerReadyDuration = playerReadyDuration;
                return this;
            }

            /**
             * SdkVersion.
             */
            public Builder sdkVersion(String sdkVersion) {
                this.sdkVersion = sdkVersion;
                return this;
            }

            /**
             * SessionId.
             */
            public Builder sessionId(String sessionId) {
                this.sessionId = sessionId;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * TerminalType.
             */
            public Builder terminalType(String terminalType) {
                this.terminalType = terminalType;
                return this;
            }

            public BaseInfos build() {
                return new BaseInfos(this);
            } 

        } 

    }
}
