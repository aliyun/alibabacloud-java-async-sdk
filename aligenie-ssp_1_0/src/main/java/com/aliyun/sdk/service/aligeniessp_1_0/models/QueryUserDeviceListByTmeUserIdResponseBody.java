// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligeniessp_1_0.models;

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
 * {@link QueryUserDeviceListByTmeUserIdResponseBody} extends {@link TeaModel}
 *
 * <p>QueryUserDeviceListByTmeUserIdResponseBody</p>
 */
public class QueryUserDeviceListByTmeUserIdResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private Result result;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private QueryUserDeviceListByTmeUserIdResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryUserDeviceListByTmeUserIdResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
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
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Integer code; 
        private String message; 
        private String requestId; 
        private Result result; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(QueryUserDeviceListByTmeUserIdResponseBody model) {
            this.code = model.code;
            this.message = model.message;
            this.requestId = model.requestId;
            this.result = model.result;
            this.success = model.success;
        } 

        /**
         * <p>Response code</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>Response message</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Request ID</p>
         * 
         * <strong>example:</strong>
         * <p>860194F7-9593-50EA-8E53-BCEC0D325A00</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Response Result</p>
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        /**
         * <p>Flag indicating whether the invocation succeeded</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public QueryUserDeviceListByTmeUserIdResponseBody build() {
            return new QueryUserDeviceListByTmeUserIdResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryUserDeviceListByTmeUserIdResponseBody} extends {@link TeaModel}
     *
     * <p>QueryUserDeviceListByTmeUserIdResponseBody</p>
     */
    public static class AuthorizedDeviceList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DeviceName")
        private String deviceName;

        @com.aliyun.core.annotation.NameInMap("Online")
        private Boolean online;

        @com.aliyun.core.annotation.NameInMap("OpenDeviceId")
        private String openDeviceId;

        @com.aliyun.core.annotation.NameInMap("TmeDeviceId")
        private String tmeDeviceId;

        @com.aliyun.core.annotation.NameInMap("TmeProductId")
        private String tmeProductId;

        private AuthorizedDeviceList(Builder builder) {
            this.deviceName = builder.deviceName;
            this.online = builder.online;
            this.openDeviceId = builder.openDeviceId;
            this.tmeDeviceId = builder.tmeDeviceId;
            this.tmeProductId = builder.tmeProductId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AuthorizedDeviceList create() {
            return builder().build();
        }

        /**
         * @return deviceName
         */
        public String getDeviceName() {
            return this.deviceName;
        }

        /**
         * @return online
         */
        public Boolean getOnline() {
            return this.online;
        }

        /**
         * @return openDeviceId
         */
        public String getOpenDeviceId() {
            return this.openDeviceId;
        }

        /**
         * @return tmeDeviceId
         */
        public String getTmeDeviceId() {
            return this.tmeDeviceId;
        }

        /**
         * @return tmeProductId
         */
        public String getTmeProductId() {
            return this.tmeProductId;
        }

        public static final class Builder {
            private String deviceName; 
            private Boolean online; 
            private String openDeviceId; 
            private String tmeDeviceId; 
            private String tmeProductId; 

            private Builder() {
            } 

            private Builder(AuthorizedDeviceList model) {
                this.deviceName = model.deviceName;
                this.online = model.online;
                this.openDeviceId = model.openDeviceId;
                this.tmeDeviceId = model.tmeDeviceId;
                this.tmeProductId = model.tmeProductId;
            } 

            /**
             * <p>device name</p>
             * 
             * <strong>example:</strong>
             * <p>CC</p>
             */
            public Builder deviceName(String deviceName) {
                this.deviceName = deviceName;
                return this;
            }

            /**
             * <p>Indicates whether the device is online</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder online(Boolean online) {
                this.online = online;
                return this;
            }

            /**
             * <p>Device ID</p>
             * 
             * <strong>example:</strong>
             * <p>fjwZiYQdtkaI95fHaLNjYcaOA/mxUPzxxw2J5iBiTBnjUCWKwER4TSHCqkBnNOYvGJ4bRZA9KzBB2naS4r/Am0lSe8ECDAAOcJ9QKLFF6DM=</p>
             */
            public Builder openDeviceId(String openDeviceId) {
                this.openDeviceId = openDeviceId;
                return this;
            }

            /**
             * <p>Device ID exposed to TME</p>
             */
            public Builder tmeDeviceId(String tmeDeviceId) {
                this.tmeDeviceId = tmeDeviceId;
                return this;
            }

            /**
             * <p>TME product ID</p>
             */
            public Builder tmeProductId(String tmeProductId) {
                this.tmeProductId = tmeProductId;
                return this;
            }

            public AuthorizedDeviceList build() {
                return new AuthorizedDeviceList(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryUserDeviceListByTmeUserIdResponseBody} extends {@link TeaModel}
     *
     * <p>QueryUserDeviceListByTmeUserIdResponseBody</p>
     */
    public static class AligenieUserInfoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AuthorizedDeviceList")
        private java.util.List<AuthorizedDeviceList> authorizedDeviceList;

        @com.aliyun.core.annotation.NameInMap("OpenUserId")
        private String openUserId;

        @com.aliyun.core.annotation.NameInMap("UserNickname")
        private String userNickname;

        private AligenieUserInfoList(Builder builder) {
            this.authorizedDeviceList = builder.authorizedDeviceList;
            this.openUserId = builder.openUserId;
            this.userNickname = builder.userNickname;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AligenieUserInfoList create() {
            return builder().build();
        }

        /**
         * @return authorizedDeviceList
         */
        public java.util.List<AuthorizedDeviceList> getAuthorizedDeviceList() {
            return this.authorizedDeviceList;
        }

        /**
         * @return openUserId
         */
        public String getOpenUserId() {
            return this.openUserId;
        }

        /**
         * @return userNickname
         */
        public String getUserNickname() {
            return this.userNickname;
        }

        public static final class Builder {
            private java.util.List<AuthorizedDeviceList> authorizedDeviceList; 
            private String openUserId; 
            private String userNickname; 

            private Builder() {
            } 

            private Builder(AligenieUserInfoList model) {
                this.authorizedDeviceList = model.authorizedDeviceList;
                this.openUserId = model.openUserId;
                this.userNickname = model.userNickname;
            } 

            /**
             * <p>User Authorization device List</p>
             */
            public Builder authorizedDeviceList(java.util.List<AuthorizedDeviceList> authorizedDeviceList) {
                this.authorizedDeviceList = authorizedDeviceList;
                return this;
            }

            /**
             * <p>User ID</p>
             * 
             * <strong>example:</strong>
             * <p>R457Av3qg/OXTwVnFt12z6MwNe0HAS699V6n63OaLdu+VmwvhcNfMzBd+la553wWJhj3kBMjgHq2Y2dyCFoDBg==</p>
             */
            public Builder openUserId(String openUserId) {
                this.openUserId = openUserId;
                return this;
            }

            /**
             * <p>User nickname</p>
             * 
             * <strong>example:</strong>
             * <p>a***e</p>
             */
            public Builder userNickname(String userNickname) {
                this.userNickname = userNickname;
                return this;
            }

            public AligenieUserInfoList build() {
                return new AligenieUserInfoList(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryUserDeviceListByTmeUserIdResponseBody} extends {@link TeaModel}
     *
     * <p>QueryUserDeviceListByTmeUserIdResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AligenieUserInfoList")
        private java.util.List<AligenieUserInfoList> aligenieUserInfoList;

        @com.aliyun.core.annotation.NameInMap("EncodeKey")
        private String encodeKey;

        @com.aliyun.core.annotation.NameInMap("EncodeType")
        private String encodeType;

        @com.aliyun.core.annotation.NameInMap("Sp")
        private String sp;

        private Result(Builder builder) {
            this.aligenieUserInfoList = builder.aligenieUserInfoList;
            this.encodeKey = builder.encodeKey;
            this.encodeType = builder.encodeType;
            this.sp = builder.sp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return aligenieUserInfoList
         */
        public java.util.List<AligenieUserInfoList> getAligenieUserInfoList() {
            return this.aligenieUserInfoList;
        }

        /**
         * @return encodeKey
         */
        public String getEncodeKey() {
            return this.encodeKey;
        }

        /**
         * @return encodeType
         */
        public String getEncodeType() {
            return this.encodeType;
        }

        /**
         * @return sp
         */
        public String getSp() {
            return this.sp;
        }

        public static final class Builder {
            private java.util.List<AligenieUserInfoList> aligenieUserInfoList; 
            private String encodeKey; 
            private String encodeType; 
            private String sp; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.aligenieUserInfoList = model.aligenieUserInfoList;
                this.encodeKey = model.encodeKey;
                this.encodeType = model.encodeType;
                this.sp = model.sp;
            } 

            /**
             * <p>Tmall Genie User List</p>
             */
            public Builder aligenieUserInfoList(java.util.List<AligenieUserInfoList> aligenieUserInfoList) {
                this.aligenieUserInfoList = aligenieUserInfoList;
                return this;
            }

            /**
             * <p>entity key (pass-through by third party)</p>
             * 
             * <strong>example:</strong>
             * <p>12****7</p>
             */
            public Builder encodeKey(String encodeKey) {
                this.encodeKey = encodeKey;
                return this;
            }

            /**
             * <p>entity Type (pass-through by third party)</p>
             * 
             * <strong>example:</strong>
             * <p>PROJECT_ID</p>
             */
            public Builder encodeType(String encodeType) {
                this.encodeType = encodeType;
                return this;
            }

            /**
             * <p>&quot;KG&quot;: KuGou<br>&quot;KW&quot;: Kuwo<br>&quot;QM&quot;: QQ Music</p>
             * 
             * <strong>example:</strong>
             * <p>KG</p>
             */
            public Builder sp(String sp) {
                this.sp = sp;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
