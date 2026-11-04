// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

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
 * {@link QueryVisionDeviceInfoResponseBody} extends {@link TeaModel}
 *
 * <p>QueryVisionDeviceInfoResponseBody</p>
 */
public class QueryVisionDeviceInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private QueryVisionDeviceInfoResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryVisionDeviceInfoResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(QueryVisionDeviceInfoResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.errorMessage = model.errorMessage;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

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

        public QueryVisionDeviceInfoResponseBody build() {
            return new QueryVisionDeviceInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryVisionDeviceInfoResponseBody} extends {@link TeaModel}
     *
     * <p>QueryVisionDeviceInfoResponseBody</p>
     */
    public static class GbDeviceInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DeviceProtocol")
        private Integer deviceProtocol;

        @com.aliyun.core.annotation.NameInMap("GbId")
        private String gbId;

        @com.aliyun.core.annotation.NameInMap("NetProtocol")
        private Integer netProtocol;

        @com.aliyun.core.annotation.NameInMap("NickName")
        private String nickName;

        @com.aliyun.core.annotation.NameInMap("Password")
        private String password;

        @com.aliyun.core.annotation.NameInMap("SubProductKey")
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

            private Builder() {
            } 

            private Builder(GbDeviceInfo model) {
                this.deviceProtocol = model.deviceProtocol;
                this.gbId = model.gbId;
                this.netProtocol = model.netProtocol;
                this.nickName = model.nickName;
                this.password = model.password;
                this.subProductKey = model.subProductKey;
            } 

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
    /**
     * 
     * {@link QueryVisionDeviceInfoResponseBody} extends {@link TeaModel}
     *
     * <p>QueryVisionDeviceInfoResponseBody</p>
     */
    public static class RtmpDeviceInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PullAuthKey")
        private String pullAuthKey;

        @com.aliyun.core.annotation.NameInMap("PullKeyExpireTime")
        private Integer pullKeyExpireTime;

        @com.aliyun.core.annotation.NameInMap("PushAuthKey")
        private String pushAuthKey;

        @com.aliyun.core.annotation.NameInMap("PushKeyExpireTime")
        private Integer pushKeyExpireTime;

        @com.aliyun.core.annotation.NameInMap("PushUrlSample")
        private String pushUrlSample;

        @com.aliyun.core.annotation.NameInMap("StreamName")
        private String streamName;

        @com.aliyun.core.annotation.NameInMap("StreamStatus")
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

            private Builder() {
            } 

            private Builder(RtmpDeviceInfo model) {
                this.pullAuthKey = model.pullAuthKey;
                this.pullKeyExpireTime = model.pullKeyExpireTime;
                this.pushAuthKey = model.pushAuthKey;
                this.pushKeyExpireTime = model.pushKeyExpireTime;
                this.pushUrlSample = model.pushUrlSample;
                this.streamName = model.streamName;
                this.streamStatus = model.streamStatus;
            } 

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
    /**
     * 
     * {@link QueryVisionDeviceInfoResponseBody} extends {@link TeaModel}
     *
     * <p>QueryVisionDeviceInfoResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("DeviceType")
        private Integer deviceType;

        @com.aliyun.core.annotation.NameInMap("GbDeviceInfo")
        private GbDeviceInfo gbDeviceInfo;

        @com.aliyun.core.annotation.NameInMap("RtmpDeviceInfo")
        private RtmpDeviceInfo rtmpDeviceInfo;

        private Data(Builder builder) {
            this.description = builder.description;
            this.deviceType = builder.deviceType;
            this.gbDeviceInfo = builder.gbDeviceInfo;
            this.rtmpDeviceInfo = builder.rtmpDeviceInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
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
         * @return rtmpDeviceInfo
         */
        public RtmpDeviceInfo getRtmpDeviceInfo() {
            return this.rtmpDeviceInfo;
        }

        public static final class Builder {
            private String description; 
            private Integer deviceType; 
            private GbDeviceInfo gbDeviceInfo; 
            private RtmpDeviceInfo rtmpDeviceInfo; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.description = model.description;
                this.deviceType = model.deviceType;
                this.gbDeviceInfo = model.gbDeviceInfo;
                this.rtmpDeviceInfo = model.rtmpDeviceInfo;
            } 

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
             * RtmpDeviceInfo.
             */
            public Builder rtmpDeviceInfo(RtmpDeviceInfo rtmpDeviceInfo) {
                this.rtmpDeviceInfo = rtmpDeviceInfo;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
