// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BatchQueryVisionDeviceInfoResponseBody} extends {@link TeaModel}
 *
 * <p>BatchQueryVisionDeviceInfoResponseBody</p>
 */
public class BatchQueryVisionDeviceInfoResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private BatchQueryVisionDeviceInfoResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchQueryVisionDeviceInfoResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String errorMessage; 
        private String requestId; 
        private Boolean success; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * ErrorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
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
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public BatchQueryVisionDeviceInfoResponseBody build() {
            return new BatchQueryVisionDeviceInfoResponseBody(this);
        } 

    } 

    public static class GbDeviceInfo extends TeaModel {
        @NameInMap("DeviceProtocol")
        private Integer deviceProtocol;

        @NameInMap("GbId")
        private String gbId;

        @NameInMap("NetProtocol")
        private Integer netProtocol;

        @NameInMap("NickName")
        private String nickName;

        @NameInMap("Password")
        private String password;

        @NameInMap("SubProductKey")
        private String subProductKey;

        private GbDeviceInfo(Builder builder) {
            this.deviceProtocol = builder.deviceProtocol;
            this.gbId = builder.gbId;
            this.netProtocol = builder.netProtocol;
            this.nickName = builder.nickName;
            this.password = builder.password;
            this.subProductKey = builder.subProductKey;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GbDeviceInfo create() {
            return builder().build();
        }

        /**
         * @return deviceProtocol
         */
        public Integer getDeviceProtocol() {
            return this.deviceProtocol;
        }

        /**
         * @return gbId
         */
        public String getGbId() {
            return this.gbId;
        }

        /**
         * @return netProtocol
         */
        public Integer getNetProtocol() {
            return this.netProtocol;
        }

        /**
         * @return nickName
         */
        public String getNickName() {
            return this.nickName;
        }

        /**
         * @return password
         */
        public String getPassword() {
            return this.password;
        }

        /**
         * @return subProductKey
         */
        public String getSubProductKey() {
            return this.subProductKey;
        }

        public static final class Builder {
            private Integer deviceProtocol; 
            private String gbId; 
            private Integer netProtocol; 
            private String nickName; 
            private String password; 
            private String subProductKey; 

            /**
             * DeviceProtocol.
             */
            public Builder deviceProtocol(Integer deviceProtocol) {
                this.deviceProtocol = deviceProtocol;
                return this;
            }

            /**
             * GbId.
             */
            public Builder gbId(String gbId) {
                this.gbId = gbId;
                return this;
            }

            /**
             * NetProtocol.
             */
            public Builder netProtocol(Integer netProtocol) {
                this.netProtocol = netProtocol;
                return this;
            }

            /**
             * NickName.
             */
            public Builder nickName(String nickName) {
                this.nickName = nickName;
                return this;
            }

            /**
             * Password.
             */
            public Builder password(String password) {
                this.password = password;
                return this;
            }

            /**
             * SubProductKey.
             */
            public Builder subProductKey(String subProductKey) {
                this.subProductKey = subProductKey;
                return this;
            }

            public GbDeviceInfo build() {
                return new GbDeviceInfo(this);
            } 

        } 

    }
    public static class RtmpDeviceInfo extends TeaModel {
        @NameInMap("PullAuthKey")
        private String pullAuthKey;

        @NameInMap("PullKeyExpireTime")
        private Integer pullKeyExpireTime;

        @NameInMap("PushAuthKey")
        private String pushAuthKey;

        @NameInMap("PushKeyExpireTime")
        private Integer pushKeyExpireTime;

        @NameInMap("PushUrlSample")
        private String pushUrlSample;

        @NameInMap("StreamName")
        private String streamName;

        @NameInMap("StreamStatus")
        private Integer streamStatus;

        private RtmpDeviceInfo(Builder builder) {
            this.pullAuthKey = builder.pullAuthKey;
            this.pullKeyExpireTime = builder.pullKeyExpireTime;
            this.pushAuthKey = builder.pushAuthKey;
            this.pushKeyExpireTime = builder.pushKeyExpireTime;
            this.pushUrlSample = builder.pushUrlSample;
            this.streamName = builder.streamName;
            this.streamStatus = builder.streamStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RtmpDeviceInfo create() {
            return builder().build();
        }

        /**
         * @return pullAuthKey
         */
        public String getPullAuthKey() {
            return this.pullAuthKey;
        }

        /**
         * @return pullKeyExpireTime
         */
        public Integer getPullKeyExpireTime() {
            return this.pullKeyExpireTime;
        }

        /**
         * @return pushAuthKey
         */
        public String getPushAuthKey() {
            return this.pushAuthKey;
        }

        /**
         * @return pushKeyExpireTime
         */
        public Integer getPushKeyExpireTime() {
            return this.pushKeyExpireTime;
        }

        /**
         * @return pushUrlSample
         */
        public String getPushUrlSample() {
            return this.pushUrlSample;
        }

        /**
         * @return streamName
         */
        public String getStreamName() {
            return this.streamName;
        }

        /**
         * @return streamStatus
         */
        public Integer getStreamStatus() {
            return this.streamStatus;
        }

        public static final class Builder {
            private String pullAuthKey; 
            private Integer pullKeyExpireTime; 
            private String pushAuthKey; 
            private Integer pushKeyExpireTime; 
            private String pushUrlSample; 
            private String streamName; 
            private Integer streamStatus; 

            /**
             * PullAuthKey.
             */
            public Builder pullAuthKey(String pullAuthKey) {
                this.pullAuthKey = pullAuthKey;
                return this;
            }

            /**
             * PullKeyExpireTime.
             */
            public Builder pullKeyExpireTime(Integer pullKeyExpireTime) {
                this.pullKeyExpireTime = pullKeyExpireTime;
                return this;
            }

            /**
             * PushAuthKey.
             */
            public Builder pushAuthKey(String pushAuthKey) {
                this.pushAuthKey = pushAuthKey;
                return this;
            }

            /**
             * PushKeyExpireTime.
             */
            public Builder pushKeyExpireTime(Integer pushKeyExpireTime) {
                this.pushKeyExpireTime = pushKeyExpireTime;
                return this;
            }

            /**
             * PushUrlSample.
             */
            public Builder pushUrlSample(String pushUrlSample) {
                this.pushUrlSample = pushUrlSample;
                return this;
            }

            /**
             * StreamName.
             */
            public Builder streamName(String streamName) {
                this.streamName = streamName;
                return this;
            }

            /**
             * StreamStatus.
             */
            public Builder streamStatus(Integer streamStatus) {
                this.streamStatus = streamStatus;
                return this;
            }

            public RtmpDeviceInfo build() {
                return new RtmpDeviceInfo(this);
            } 

        } 

    }
    public static class DeviceInfoList extends TeaModel {
        @NameInMap("Description")
        private String description;

        @NameInMap("DeviceType")
        private Integer deviceType;

        @NameInMap("GbDeviceInfo")
        private GbDeviceInfo gbDeviceInfo;

        @NameInMap("IotId")
        private String iotId;

        @NameInMap("RtmpDeviceInfo")
        private RtmpDeviceInfo rtmpDeviceInfo;

        private DeviceInfoList(Builder builder) {
            this.description = builder.description;
            this.deviceType = builder.deviceType;
            this.gbDeviceInfo = builder.gbDeviceInfo;
            this.iotId = builder.iotId;
            this.rtmpDeviceInfo = builder.rtmpDeviceInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DeviceInfoList create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return deviceType
         */
        public Integer getDeviceType() {
            return this.deviceType;
        }

        /**
         * @return gbDeviceInfo
         */
        public GbDeviceInfo getGbDeviceInfo() {
            return this.gbDeviceInfo;
        }

        /**
         * @return iotId
         */
        public String getIotId() {
            return this.iotId;
        }

        /**
         * @return rtmpDeviceInfo
         */
        public RtmpDeviceInfo getRtmpDeviceInfo() {
            return this.rtmpDeviceInfo;
        }

        public static final class Builder {
            private String description; 
            private Integer deviceType; 
            private GbDeviceInfo gbDeviceInfo; 
            private String iotId; 
            private RtmpDeviceInfo rtmpDeviceInfo; 

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * DeviceType.
             */
            public Builder deviceType(Integer deviceType) {
                this.deviceType = deviceType;
                return this;
            }

            /**
             * GbDeviceInfo.
             */
            public Builder gbDeviceInfo(GbDeviceInfo gbDeviceInfo) {
                this.gbDeviceInfo = gbDeviceInfo;
                return this;
            }

            /**
             * IotId.
             */
            public Builder iotId(String iotId) {
                this.iotId = iotId;
                return this;
            }

            /**
             * RtmpDeviceInfo.
             */
            public Builder rtmpDeviceInfo(RtmpDeviceInfo rtmpDeviceInfo) {
                this.rtmpDeviceInfo = rtmpDeviceInfo;
                return this;
            }

            public DeviceInfoList build() {
                return new DeviceInfoList(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("DeviceInfoList")
        private java.util.List < DeviceInfoList> deviceInfoList;

        private Data(Builder builder) {
            this.deviceInfoList = builder.deviceInfoList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return deviceInfoList
         */
        public java.util.List < DeviceInfoList> getDeviceInfoList() {
            return this.deviceInfoList;
        }

        public static final class Builder {
            private java.util.List < DeviceInfoList> deviceInfoList; 

            /**
             * DeviceInfoList.
             */
            public Builder deviceInfoList(java.util.List < DeviceInfoList> deviceInfoList) {
                this.deviceInfoList = deviceInfoList;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
