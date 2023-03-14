// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetUserResponseBody} extends {@link TeaModel}
 *
 * <p>GetUserResponseBody</p>
 */
public class GetUserResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("User")
    private User user;

    private GetUserResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.user = builder.user;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetUserResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return user
     */
    public User getUser() {
        return this.user;
    }

    public static final class Builder {
        private String requestId; 
        private User user; 

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The information of the user that was queried.
         */
        public Builder user(User user) {
            this.user = user;
            return this;
        }

        public GetUserResponseBody build() {
            return new GetUserResponseBody(this);
        } 

    } 

    public static class User extends TeaModel {
        @NameInMap("Comment")
        private String comment;

        @NameInMap("DisplayName")
        private String displayName;

        @NameInMap("EffectiveEndTime")
        private Long effectiveEndTime;

        @NameInMap("EffectiveStartTime")
        private Long effectiveStartTime;

        @NameInMap("Email")
        private String email;

        @NameInMap("Mobile")
        private String mobile;

        @NameInMap("MobileCountryCode")
        private String mobileCountryCode;

        @NameInMap("NeedResetPassword")
        private Boolean needResetPassword;

        @NameInMap("Source")
        private String source;

        @NameInMap("SourceUserId")
        private String sourceUserId;

        @NameInMap("TwoFactorMethods")
        private java.util.List < String > twoFactorMethods;

        @NameInMap("TwoFactorStatus")
        private String twoFactorStatus;

        @NameInMap("UserId")
        private String userId;

        @NameInMap("UserName")
        private String userName;

        @NameInMap("UserState")
        private java.util.List < String > userState;

        private User(Builder builder) {
            this.comment = builder.comment;
            this.displayName = builder.displayName;
            this.effectiveEndTime = builder.effectiveEndTime;
            this.effectiveStartTime = builder.effectiveStartTime;
            this.email = builder.email;
            this.mobile = builder.mobile;
            this.mobileCountryCode = builder.mobileCountryCode;
            this.needResetPassword = builder.needResetPassword;
            this.source = builder.source;
            this.sourceUserId = builder.sourceUserId;
            this.twoFactorMethods = builder.twoFactorMethods;
            this.twoFactorStatus = builder.twoFactorStatus;
            this.userId = builder.userId;
            this.userName = builder.userName;
            this.userState = builder.userState;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static User create() {
            return builder().build();
        }

        /**
         * @return comment
         */
        public String getComment() {
            return this.comment;
        }

        /**
         * @return displayName
         */
        public String getDisplayName() {
            return this.displayName;
        }

        /**
         * @return effectiveEndTime
         */
        public Long getEffectiveEndTime() {
            return this.effectiveEndTime;
        }

        /**
         * @return effectiveStartTime
         */
        public Long getEffectiveStartTime() {
            return this.effectiveStartTime;
        }

        /**
         * @return email
         */
        public String getEmail() {
            return this.email;
        }

        /**
         * @return mobile
         */
        public String getMobile() {
            return this.mobile;
        }

        /**
         * @return mobileCountryCode
         */
        public String getMobileCountryCode() {
            return this.mobileCountryCode;
        }

        /**
         * @return needResetPassword
         */
        public Boolean getNeedResetPassword() {
            return this.needResetPassword;
        }

        /**
         * @return source
         */
        public String getSource() {
            return this.source;
        }

        /**
         * @return sourceUserId
         */
        public String getSourceUserId() {
            return this.sourceUserId;
        }

        /**
         * @return twoFactorMethods
         */
        public java.util.List < String > getTwoFactorMethods() {
            return this.twoFactorMethods;
        }

        /**
         * @return twoFactorStatus
         */
        public String getTwoFactorStatus() {
            return this.twoFactorStatus;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        /**
         * @return userName
         */
        public String getUserName() {
            return this.userName;
        }

        /**
         * @return userState
         */
        public java.util.List < String > getUserState() {
            return this.userState;
        }

        public static final class Builder {
            private String comment; 
            private String displayName; 
            private Long effectiveEndTime; 
            private Long effectiveStartTime; 
            private String email; 
            private String mobile; 
            private String mobileCountryCode; 
            private Boolean needResetPassword; 
            private String source; 
            private String sourceUserId; 
            private java.util.List < String > twoFactorMethods; 
            private String twoFactorStatus; 
            private String userId; 
            private String userName; 
            private java.util.List < String > userState; 

            /**
             * The description of the user.
             */
            public Builder comment(String comment) {
                this.comment = comment;
                return this;
            }

            /**
             * The display name of the user.
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * EffectiveEndTime.
             */
            public Builder effectiveEndTime(Long effectiveEndTime) {
                this.effectiveEndTime = effectiveEndTime;
                return this;
            }

            /**
             * EffectiveStartTime.
             */
            public Builder effectiveStartTime(Long effectiveStartTime) {
                this.effectiveStartTime = effectiveStartTime;
                return this;
            }

            /**
             * The email address of the user.
             */
            public Builder email(String email) {
                this.email = email;
                return this;
            }

            /**
             * The mobile number of the user.
             */
            public Builder mobile(String mobile) {
                this.mobile = mobile;
                return this;
            }

            /**
             * The country where the mobile number of the user is registered. Valid values:
             * <p>
             * 
             * *   **CN**: the Chinese mainland, whose country calling code is +86
             * *   **HK**: Hong Kong (China), whose country calling code is +852
             * *   **MO**: Macau (China), whose country calling code is +853
             * *   **TW**: Taiwan (China), whose country calling code is +886
             * *   **RU**: Russia, whose country calling code is +7
             * *   **SG**: Singapore, whose country calling code is +65
             * *   **MY**: Malaysia, whose country calling code is +60
             * *   **ID**: Indonesia, whose country calling code is +62
             * *   **DE**: Germany, whose country calling code is +49
             * *   **AU**: Australia, whose country calling code is +61
             * *   **US**: United States, whose country calling code is +1
             * *   **AE**: United Arab Emirates, whose country calling code is +971
             * *   **JP**: Japan, whose country calling code is +81
             * *   **GB**: United Kingdom, whose country calling code is +44
             * *   **IN**: India, whose country calling code is +91
             * *   **KR**: South Korea, whose country calling code is +82
             * *   **PH**: Philippines, whose country calling code is +63
             * *   **CH**: Switzerland, whose country calling code is +41
             * *   **SE**: Sweden, whose country calling code is +46
             */
            public Builder mobileCountryCode(String mobileCountryCode) {
                this.mobileCountryCode = mobileCountryCode;
                return this;
            }

            /**
             * NeedResetPassword.
             */
            public Builder needResetPassword(Boolean needResetPassword) {
                this.needResetPassword = needResetPassword;
                return this;
            }

            /**
             * The source of the user. Valid values:
             * <p>
             * 
             * *   **Local**: a local user
             * *   **Ram**: a RAM user
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            /**
             * The unique ID of the user.
             * <p>
             * 
             * >  This parameter uniquely identifies a RAM user of the Bastionhost instance. A value is returned for this parameter if the **Source** parameter is set to **Ram**. No value is returned for this parameter if the **Source** parameter is set to **Local**.
             */
            public Builder sourceUserId(String sourceUserId) {
                this.sourceUserId = sourceUserId;
                return this;
            }

            /**
             * TwoFactorMethods.
             */
            public Builder twoFactorMethods(java.util.List < String > twoFactorMethods) {
                this.twoFactorMethods = twoFactorMethods;
                return this;
            }

            /**
             * TwoFactorStatus.
             */
            public Builder twoFactorStatus(String twoFactorStatus) {
                this.twoFactorStatus = twoFactorStatus;
                return this;
            }

            /**
             * The ID of the user.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            /**
             * The logon name of the user.
             */
            public Builder userName(String userName) {
                this.userName = userName;
                return this;
            }

            /**
             * The statuses of the user.
             */
            public Builder userState(java.util.List < String > userState) {
                this.userState = userState;
                return this;
            }

            public User build() {
                return new User(this);
            } 

        } 

    }
}
