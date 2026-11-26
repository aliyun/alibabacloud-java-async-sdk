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
 * {@link FindUserlistToAuthLoginWithPhoneNumberResponseBody} extends {@link TeaModel}
 *
 * <p>FindUserlistToAuthLoginWithPhoneNumberResponseBody</p>
 */
public class FindUserlistToAuthLoginWithPhoneNumberResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("DataObj")
    private DataObj dataObj;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private Result result;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private FindUserlistToAuthLoginWithPhoneNumberResponseBody(Builder builder) {
        this.code = builder.code;
        this.dataObj = builder.dataObj;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static FindUserlistToAuthLoginWithPhoneNumberResponseBody create() {
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
     * @return dataObj
     */
    public DataObj getDataObj() {
        return this.dataObj;
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
        private DataObj dataObj; 
        private String message; 
        private String requestId; 
        private Result result; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(FindUserlistToAuthLoginWithPhoneNumberResponseBody model) {
            this.code = model.code;
            this.dataObj = model.dataObj;
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
         * <p>When the code is 5140003, it indicates that the invocation failed because no account list eligible for authorization login was found for the given phone number. The frontend can prompt the user to confirm generating a Jingle account via the phone number or suggest registering a Taobao account using the phone number first. In subsequent flows, the frontend must return the sessionId from DataObj to the server.</p>
         */
        public Builder dataObj(DataObj dataObj) {
            this.dataObj = dataObj;
            return this;
        }

        /**
         * <p>Response message</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Request ID</p>
         * 
         * <strong>example:</strong>
         * <p>73C67BD9-175A-1324-8202-9FAABBB3E6FA</p>
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
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public FindUserlistToAuthLoginWithPhoneNumberResponseBody build() {
            return new FindUserlistToAuthLoginWithPhoneNumberResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link FindUserlistToAuthLoginWithPhoneNumberResponseBody} extends {@link TeaModel}
     *
     * <p>FindUserlistToAuthLoginWithPhoneNumberResponseBody</p>
     */
    public static class DataObj extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SessionId")
        private String sessionId;

        private DataObj(Builder builder) {
            this.sessionId = builder.sessionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataObj create() {
            return builder().build();
        }

        /**
         * @return sessionId
         */
        public String getSessionId() {
            return this.sessionId;
        }

        public static final class Builder {
            private String sessionId; 

            private Builder() {
            } 

            private Builder(DataObj model) {
                this.sessionId = model.sessionId;
            } 

            /**
             * <p>Session ID</p>
             * 
             * <strong>example:</strong>
             * <p>dbe2eb4458302b9246c6da17fbc95f4b</p>
             */
            public Builder sessionId(String sessionId) {
                this.sessionId = sessionId;
                return this;
            }

            public DataObj build() {
                return new DataObj(this);
            } 

        } 

    }
    /**
     * 
     * {@link FindUserlistToAuthLoginWithPhoneNumberResponseBody} extends {@link TeaModel}
     *
     * <p>FindUserlistToAuthLoginWithPhoneNumberResponseBody</p>
     */
    public static class UserListToAuthLogin extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Avatar")
        private String avatar;

        @com.aliyun.core.annotation.NameInMap("EncryptedUserIdentifier")
        private String encryptedUserIdentifier;

        @com.aliyun.core.annotation.NameInMap("FindingType")
        private String findingType;

        @com.aliyun.core.annotation.NameInMap("Nickname")
        private String nickname;

        @com.aliyun.core.annotation.NameInMap("UserType")
        private String userType;

        private UserListToAuthLogin(Builder builder) {
            this.avatar = builder.avatar;
            this.encryptedUserIdentifier = builder.encryptedUserIdentifier;
            this.findingType = builder.findingType;
            this.nickname = builder.nickname;
            this.userType = builder.userType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UserListToAuthLogin create() {
            return builder().build();
        }

        /**
         * @return avatar
         */
        public String getAvatar() {
            return this.avatar;
        }

        /**
         * @return encryptedUserIdentifier
         */
        public String getEncryptedUserIdentifier() {
            return this.encryptedUserIdentifier;
        }

        /**
         * @return findingType
         */
        public String getFindingType() {
            return this.findingType;
        }

        /**
         * @return nickname
         */
        public String getNickname() {
            return this.nickname;
        }

        /**
         * @return userType
         */
        public String getUserType() {
            return this.userType;
        }

        public static final class Builder {
            private String avatar; 
            private String encryptedUserIdentifier; 
            private String findingType; 
            private String nickname; 
            private String userType; 

            private Builder() {
            } 

            private Builder(UserListToAuthLogin model) {
                this.avatar = model.avatar;
                this.encryptedUserIdentifier = model.encryptedUserIdentifier;
                this.findingType = model.findingType;
                this.nickname = model.nickname;
                this.userType = model.userType;
            } 

            /**
             * <p>Profile picture</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://xxx">https://xxx</a></p>
             */
            public Builder avatar(String avatar) {
                this.avatar = avatar;
                return this;
            }

            /**
             * <p>Encrypted User Identifier</p>
             * 
             * <strong>example:</strong>
             * <p>KsVgypxAipf+xNECMZV2ONMcheqiIoEGFvgx+T8s1oV6/euTK9+ImYvLVPsSqFDh</p>
             */
            public Builder encryptedUserIdentifier(String encryptedUserIdentifier) {
                this.encryptedUserIdentifier = encryptedUserIdentifier;
                return this;
            }

            /**
             * <p>User Search Type  </p>
             * <p>For Taobao users, the value is fixed as:<br>PHONE_NUMBER_BINDING_WITH_TAOBAO: The phoneNumber is queried as the phone number bound to a Taobao account.  </p>
             * <p>For Tmall Genie users, the value can be:<br>PHONE_NUMBER_BINDING_WITH_ALIGENIE: The phoneNumber is queried as the phone number bound to a Tmall Genie device;<br>PHONE_NUMBER_BINDING_WITH_TAOBAO: The phoneNumber is queried as the phone number bound to a Taobao account.</p>
             * 
             * <strong>example:</strong>
             * <p>PHONE_NUMBER_BINDING_WITH_ALIGENIE：phoneNumber</p>
             */
            public Builder findingType(String findingType) {
                this.findingType = findingType;
                return this;
            }

            /**
             * <p>Nickname</p>
             * 
             * <strong>example:</strong>
             * <p>XXX</p>
             */
            public Builder nickname(String nickname) {
                this.nickname = nickname;
                return this;
            }

            /**
             * <p>User Type<br>TAOBAO: Taobao user<br>ALIGENIE: Tmall Genie user</p>
             * 
             * <strong>example:</strong>
             * <p>ALIGENIE</p>
             */
            public Builder userType(String userType) {
                this.userType = userType;
                return this;
            }

            public UserListToAuthLogin build() {
                return new UserListToAuthLogin(this);
            } 

        } 

    }
    /**
     * 
     * {@link FindUserlistToAuthLoginWithPhoneNumberResponseBody} extends {@link TeaModel}
     *
     * <p>FindUserlistToAuthLoginWithPhoneNumberResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("UserListToAuthLogin")
        private java.util.List<UserListToAuthLogin> userListToAuthLogin;

        private Result(Builder builder) {
            this.userListToAuthLogin = builder.userListToAuthLogin;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return userListToAuthLogin
         */
        public java.util.List<UserListToAuthLogin> getUserListToAuthLogin() {
            return this.userListToAuthLogin;
        }

        public static final class Builder {
            private java.util.List<UserListToAuthLogin> userListToAuthLogin; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.userListToAuthLogin = model.userListToAuthLogin;
            } 

            /**
             * <p>List of accounts eligible for authorization login</p>
             */
            public Builder userListToAuthLogin(java.util.List<UserListToAuthLogin> userListToAuthLogin) {
                this.userListToAuthLogin = userListToAuthLogin;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
