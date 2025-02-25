// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mindlive20210301.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RequestBindingStateResponseBody} extends {@link TeaModel}
 *
 * <p>RequestBindingStateResponseBody</p>
 */
public class RequestBindingStateResponseBody extends TeaModel {
    @NameInMap("Data")
    private Data data;

    @NameInMap("ErrorCode")
    private String errorCode;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private RequestBindingStateResponseBody(Builder builder) {
        this.data = builder.data;
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RequestBindingStateResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
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
        private Data data; 
        private String errorCode; 
        private String errorMessage; 
        private String requestId; 
        private Boolean success; 

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * ErrorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
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

        public RequestBindingStateResponseBody build() {
            return new RequestBindingStateResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("BindAt")
        private Long bindAt;

        @NameInMap("DeviceId")
        private String deviceId;

        @NameInMap("UserAvatar")
        private String userAvatar;

        @NameInMap("UserId")
        private String userId;

        @NameInMap("UserNick")
        private String userNick;

        @NameInMap("UserSource")
        private String userSource;

        private Data(Builder builder) {
            this.bindAt = builder.bindAt;
            this.deviceId = builder.deviceId;
            this.userAvatar = builder.userAvatar;
            this.userId = builder.userId;
            this.userNick = builder.userNick;
            this.userSource = builder.userSource;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return bindAt
         */
        public Long getBindAt() {
            return this.bindAt;
        }

        /**
         * @return deviceId
         */
        public String getDeviceId() {
            return this.deviceId;
        }

        /**
         * @return userAvatar
         */
        public String getUserAvatar() {
            return this.userAvatar;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        /**
         * @return userNick
         */
        public String getUserNick() {
            return this.userNick;
        }

        /**
         * @return userSource
         */
        public String getUserSource() {
            return this.userSource;
        }

        public static final class Builder {
            private Long bindAt; 
            private String deviceId; 
            private String userAvatar; 
            private String userId; 
            private String userNick; 
            private String userSource; 

            /**
             * BindAt.
             */
            public Builder bindAt(Long bindAt) {
                this.bindAt = bindAt;
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
             * UserAvatar.
             */
            public Builder userAvatar(String userAvatar) {
                this.userAvatar = userAvatar;
                return this;
            }

            /**
             * UserId.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            /**
             * UserNick.
             */
            public Builder userNick(String userNick) {
                this.userNick = userNick;
                return this;
            }

            /**
             * UserSource.
             */
            public Builder userSource(String userSource) {
                this.userSource = userSource;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
