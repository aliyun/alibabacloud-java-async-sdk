// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetUserResponseBody} extends {@link TeaModel}
 *
 * <p>GetUserResponseBody</p>
 */
public class GetUserResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("User")
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
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>EC9BF0F4-8983-491A-BC8C-1B4DD94976DE</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The detailed information about the queried user.</p>
         */
        public Builder user(User user) {
            this.user = user;
            return this;
        }

        public GetUserResponseBody build() {
            return new GetUserResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetUserResponseBody} extends {@link TeaModel}
     *
     * <p>GetUserResponseBody</p>
     */
    public static class User extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Comment")
        private String comment;

        @com.aliyun.core.annotation.NameInMap("DisplayName")
        private String displayName;

        @com.aliyun.core.annotation.NameInMap("EffectiveEndTime")
        private Long effectiveEndTime;

        @com.aliyun.core.annotation.NameInMap("EffectiveStartTime")
        private Long effectiveStartTime;

        @com.aliyun.core.annotation.NameInMap("Email")
        private String email;

        @com.aliyun.core.annotation.NameInMap("Language")
        private String language;

        @com.aliyun.core.annotation.NameInMap("LanguageStatus")
        private String languageStatus;

        @com.aliyun.core.annotation.NameInMap("Mobile")
        private String mobile;

        @com.aliyun.core.annotation.NameInMap("MobileCountryCode")
        private String mobileCountryCode;

        @com.aliyun.core.annotation.NameInMap("NeedResetPassword")
        private Boolean needResetPassword;

        @com.aliyun.core.annotation.NameInMap("Source")
        private String source;

        @com.aliyun.core.annotation.NameInMap("SourceUserId")
        private String sourceUserId;

        @com.aliyun.core.annotation.NameInMap("TwoFactorMethods")
        private java.util.List < String > twoFactorMethods;

        @com.aliyun.core.annotation.NameInMap("TwoFactorStatus")
        private String twoFactorStatus;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        @com.aliyun.core.annotation.NameInMap("UserName")
        private String userName;

        @com.aliyun.core.annotation.NameInMap("UserState")
        private java.util.List < String > userState;

        private User(Builder builder) {
            this.comment = builder.comment;
            this.displayName = builder.displayName;
            this.effectiveEndTime = builder.effectiveEndTime;
            this.effectiveStartTime = builder.effectiveStartTime;
            this.email = builder.email;
            this.language = builder.language;
            this.languageStatus = builder.languageStatus;
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
         * @return language
         */
        public String getLanguage() {
            return this.language;
        }

        /**
         * @return languageStatus
         */
        public String getLanguageStatus() {
            return this.languageStatus;
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
            private String language; 
            private String languageStatus; 
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
             * <p>The description of the user.</p>
             * 
             * <strong>example:</strong>
             * <p>comment</p>
             */
            public Builder comment(String comment) {
                this.comment = comment;
                return this;
            }

            /**
             * <p>The display name of the user.</p>
             * 
             * <strong>example:</strong>
             * <p>Bob</p>
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * <p>The end of the validity period of the user. The value is a UNIX timestamp. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1672502400</p>
             */
            public Builder effectiveEndTime(Long effectiveEndTime) {
                this.effectiveEndTime = effectiveEndTime;
                return this;
            }

            /**
             * <p>The beginning of the validity period of the user. The value is a UNIX timestamp. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1669630029</p>
             */
            public Builder effectiveStartTime(Long effectiveStartTime) {
                this.effectiveStartTime = effectiveStartTime;
                return this;
            }

            /**
             * <p>The email address of the user.</p>
             * 
             * <strong>example:</strong>
             * <p>1099**@qq.com</p>
             */
            public Builder email(String email) {
                this.email = email;
                return this;
            }

            /**
             * <p>This parameter is required if LanguageStatus is set to Custom.</p>
             * <ul>
             * <li><strong>zh-cn</strong>: simplified Chinese.</li>
             * <li><strong>en</strong>: English.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>en</p>
             */
            public Builder language(String language) {
                this.language = language;
                return this;
            }

            /**
             * <p>Indicates whether notifications are sent in the language specified in the global settings or a custom language.</p>
             * <ul>
             * <li><strong>Global</strong>: Global</li>
             * <li><strong>Custom</strong>: Custom</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Custom</p>
             */
            public Builder languageStatus(String languageStatus) {
                this.languageStatus = languageStatus;
                return this;
            }

            /**
             * <p>The mobile phone number of the user.</p>
             * 
             * <strong>example:</strong>
             * <p>1359999****</p>
             */
            public Builder mobile(String mobile) {
                this.mobile = mobile;
                return this;
            }

            /**
             * <p>The location in which the mobile number of the user is registered. Valid values:</p>
             * <ul>
             * <li><strong>CN</strong>: the Chinese mainland, whose country calling code is +86</li>
             * <li><strong>HK</strong>: Hong Kong (China), whose country calling code is +852</li>
             * <li><strong>MO</strong>: Macao (China), whose country calling code is +853</li>
             * <li><strong>TW</strong>: Taiwan (China), whose country calling code is +886</li>
             * <li><strong>RU</strong>: Russia, whose country calling code is +7</li>
             * <li><strong>SG</strong>: Singapore, whose country calling code is +65</li>
             * <li><strong>MY</strong>: Malaysia, whose country calling code is +60</li>
             * <li><strong>ID</strong>: Indonesia, whose country calling code is +62</li>
             * <li><strong>DE</strong>: Germany, whose country calling code is +49</li>
             * <li><strong>AU</strong>: Australia, whose country calling code is +61</li>
             * <li><strong>US</strong>: US, whose country calling code is +1</li>
             * <li><strong>AE</strong>: United Arab Emirates, whose country calling code is +971</li>
             * <li><strong>JP:</strong> Japan, whose country calling code is +81</li>
             * <li><strong>GB</strong>: UK, whose country calling code is +44</li>
             * <li><strong>IN</strong>: India, whose country calling code is +91</li>
             * <li><strong>KR</strong>: Republic of Korea, whose country calling code is +82</li>
             * <li><strong>PH</strong>: Philippines, whose country calling code is +63</li>
             * <li><strong>CH</strong>: Switzerland, whose country calling code is +41</li>
             * <li><strong>SE</strong>: Sweden, whose country calling code is +46</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>CN</p>
             */
            public Builder mobileCountryCode(String mobileCountryCode) {
                this.mobileCountryCode = mobileCountryCode;
                return this;
            }

            /**
             * <p>Specifies whether password reset is required upon the next logon. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: yes</li>
             * <li><strong>false</strong>: no</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder needResetPassword(Boolean needResetPassword) {
                this.needResetPassword = needResetPassword;
                return this;
            }

            /**
             * <p>The source of the user. Valid values:</p>
             * <ul>
             * <li><strong>Local</strong>: a local user</li>
             * <li><strong>Ram</strong>: a RAM user</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Local</p>
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            /**
             * <p>The unique ID of the user.</p>
             * <blockquote>
             * <p>This parameter uniquely identifies a RAM user of the bastion host. A value is returned for this parameter if the <strong>Source</strong> parameter is set to <strong>Ram</strong>. No value is returned for this parameter if the <strong>Source</strong> parameter is set to <strong>Local</strong>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>122748924538****</p>
             */
            public Builder sourceUserId(String sourceUserId) {
                this.sourceUserId = sourceUserId;
                return this;
            }

            /**
             * <p>An array that consists of the details of the two-factor authentication method.</p>
             */
            public Builder twoFactorMethods(java.util.List < String > twoFactorMethods) {
                this.twoFactorMethods = twoFactorMethods;
                return this;
            }

            /**
             * <p>The two-factor authentication status of the user. Valid values:</p>
             * <ul>
             * <li><strong>Global</strong>: The global settings are used.</li>
             * <li><strong>Disable</strong>: The two-factor authentication is disabled.</li>
             * <li><strong>Enable</strong>: The two-factor authentication is enabled and the user-specific setting is used.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Enable</p>
             */
            public Builder twoFactorStatus(String twoFactorStatus) {
                this.twoFactorStatus = twoFactorStatus;
                return this;
            }

            /**
             * <p>The ID of the user.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            /**
             * <p>The logon name of the user.</p>
             * 
             * <strong>example:</strong>
             * <p>abcabc_def</p>
             */
            public Builder userName(String userName) {
                this.userName = userName;
                return this;
            }

            /**
             * <p>An array that consists of the details of the user status.</p>
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
