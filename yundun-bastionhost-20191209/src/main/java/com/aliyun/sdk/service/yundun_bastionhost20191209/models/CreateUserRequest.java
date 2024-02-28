// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateUserRequest} extends {@link RequestModel}
 *
 * <p>CreateUserRequest</p>
 */
public class CreateUserRequest extends Request {
    @Query
    @NameInMap("Comment")
    private String comment;

    @Query
    @NameInMap("DisplayName")
    private String displayName;

    @Query
    @NameInMap("EffectiveEndTime")
    private Long effectiveEndTime;

    @Query
    @NameInMap("EffectiveStartTime")
    private Long effectiveStartTime;

    @Query
    @NameInMap("Email")
    private String email;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("Language")
    private String language;

    @Query
    @NameInMap("LanguageStatus")
    private String languageStatus;

    @Query
    @NameInMap("Mobile")
    private String mobile;

    @Query
    @NameInMap("MobileCountryCode")
    private String mobileCountryCode;

    @Query
    @NameInMap("NeedResetPassword")
    private Boolean needResetPassword;

    @Query
    @NameInMap("Password")
    private String password;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("Source")
    @Validation(required = true)
    private String source;

    @Query
    @NameInMap("SourceUserId")
    private String sourceUserId;

    @Query
    @NameInMap("TwoFactorMethods")
    private String twoFactorMethods;

    @Query
    @NameInMap("TwoFactorStatus")
    private String twoFactorStatus;

    @Query
    @NameInMap("UserName")
    @Validation(required = true)
    private String userName;

    private CreateUserRequest(Builder builder) {
        super(builder);
        this.comment = builder.comment;
        this.displayName = builder.displayName;
        this.effectiveEndTime = builder.effectiveEndTime;
        this.effectiveStartTime = builder.effectiveStartTime;
        this.email = builder.email;
        this.instanceId = builder.instanceId;
        this.language = builder.language;
        this.languageStatus = builder.languageStatus;
        this.mobile = builder.mobile;
        this.mobileCountryCode = builder.mobileCountryCode;
        this.needResetPassword = builder.needResetPassword;
        this.password = builder.password;
        this.regionId = builder.regionId;
        this.source = builder.source;
        this.sourceUserId = builder.sourceUserId;
        this.twoFactorMethods = builder.twoFactorMethods;
        this.twoFactorStatus = builder.twoFactorStatus;
        this.userName = builder.userName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateUserRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
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
     * @return password
     */
    public String getPassword() {
        return this.password;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
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
    public String getTwoFactorMethods() {
        return this.twoFactorMethods;
    }

    /**
     * @return twoFactorStatus
     */
    public String getTwoFactorStatus() {
        return this.twoFactorStatus;
    }

    /**
     * @return userName
     */
    public String getUserName() {
        return this.userName;
    }

    public static final class Builder extends Request.Builder<CreateUserRequest, Builder> {
        private String comment; 
        private String displayName; 
        private Long effectiveEndTime; 
        private Long effectiveStartTime; 
        private String email; 
        private String instanceId; 
        private String language; 
        private String languageStatus; 
        private String mobile; 
        private String mobileCountryCode; 
        private Boolean needResetPassword; 
        private String password; 
        private String regionId; 
        private String source; 
        private String sourceUserId; 
        private String twoFactorMethods; 
        private String twoFactorStatus; 
        private String userName; 

        private Builder() {
            super();
        } 

        private Builder(CreateUserRequest request) {
            super(request);
            this.comment = request.comment;
            this.displayName = request.displayName;
            this.effectiveEndTime = request.effectiveEndTime;
            this.effectiveStartTime = request.effectiveStartTime;
            this.email = request.email;
            this.instanceId = request.instanceId;
            this.language = request.language;
            this.languageStatus = request.languageStatus;
            this.mobile = request.mobile;
            this.mobileCountryCode = request.mobileCountryCode;
            this.needResetPassword = request.needResetPassword;
            this.password = request.password;
            this.regionId = request.regionId;
            this.source = request.source;
            this.sourceUserId = request.sourceUserId;
            this.twoFactorMethods = request.twoFactorMethods;
            this.twoFactorStatus = request.twoFactorStatus;
            this.userName = request.userName;
        } 

        /**
         * The remarks of the user that you want to add. The remarks can be up to 500 characters in length.
         */
        public Builder comment(String comment) {
            this.putQueryParameter("Comment", comment);
            this.comment = comment;
            return this;
        }

        /**
         * The display name of the user that you want to add. This display name can be up to 128 characters in length.
         */
        public Builder displayName(String displayName) {
            this.putQueryParameter("DisplayName", displayName);
            this.displayName = displayName;
            return this;
        }

        /**
         * The end of the validity period of the user. The value is a UNIX timestamp. Unit: seconds.
         */
        public Builder effectiveEndTime(Long effectiveEndTime) {
            this.putQueryParameter("EffectiveEndTime", effectiveEndTime);
            this.effectiveEndTime = effectiveEndTime;
            return this;
        }

        /**
         * The beginning of the validity period of the user. The value is a UNIX timestamp. Unit: seconds.
         */
        public Builder effectiveStartTime(Long effectiveStartTime) {
            this.putQueryParameter("EffectiveStartTime", effectiveStartTime);
            this.effectiveStartTime = effectiveStartTime;
            return this;
        }

        /**
         * The email address of the user that you want to add.
         */
        public Builder email(String email) {
            this.putQueryParameter("Email", email);
            this.email = email;
            return this;
        }

        /**
         * The ID of the bastion host to which you want to add a user.
         * <p>
         * 
         * >  You can call the [DescribeInstances](~~153281~~) operation to query the ID of the bastion host.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * Language.
         */
        public Builder language(String language) {
            this.putQueryParameter("Language", language);
            this.language = language;
            return this;
        }

        /**
         * LanguageStatus.
         */
        public Builder languageStatus(String languageStatus) {
            this.putQueryParameter("LanguageStatus", languageStatus);
            this.languageStatus = languageStatus;
            return this;
        }

        /**
         * The mobile phone number of the user that you want to add.
         */
        public Builder mobile(String mobile) {
            this.putQueryParameter("Mobile", mobile);
            this.mobile = mobile;
            return this;
        }

        /**
         * The country where the mobile number of the user is registered. Default value: **CN**. Valid values:
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
         * *   **US**: US, whose country calling code is +1
         * *   **AE**: United Arab Emirates, whose country calling code is +971
         * *   **JP**: Japan, whose country calling code is +81
         * *   **GB**: UK, whose country calling code is +44
         * *   **IN**: India, whose country calling code is +91
         * *   **KR**: Republic of Korea, whose country calling code is +82
         * *   **PH**: Philippines, whose country calling code is +63
         * *   **CH**: Switzerland, whose country calling code is +41
         * *   **SE**: Sweden, whose country calling code is +46
         */
        public Builder mobileCountryCode(String mobileCountryCode) {
            this.putQueryParameter("MobileCountryCode", mobileCountryCode);
            this.mobileCountryCode = mobileCountryCode;
            return this;
        }

        /**
         * Specifies whether password reset is required upon the next logon. Valid values:
         * <p>
         * 
         * - true: yes
         * 
         * - false: no
         */
        public Builder needResetPassword(Boolean needResetPassword) {
            this.putQueryParameter("NeedResetPassword", needResetPassword);
            this.needResetPassword = needResetPassword;
            return this;
        }

        /**
         * The logon password of the user that you want to add. The logon password can be up to 128 characters in length.
         * <p>
         * 
         * >  This parameter is required if the **Source** parameter is set to **Local**.
         */
        public Builder password(String password) {
            this.putQueryParameter("Password", password);
            this.password = password;
            return this;
        }

        /**
         * The region ID of the bastion host to which you want to add a user.
         * <p>
         * 
         * >  For more information about the mapping between region IDs and region names, see [Regions and zones](~~40654~~).
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The source of the user that you want to add. Valid values:
         * <p>
         * 
         * - **Local**: a local user
         * - **Ram**: a RAM user
         * - **AD** : an AD-authenticated user
         * - **LDAP** : an LDAP-authenticated user
         */
        public Builder source(String source) {
            this.putQueryParameter("Source", source);
            this.source = source;
            return this;
        }

        /**
         * The unique identifier of the user that you want to add.
         * <p>
         * 
         * >  This parameter uniquely identifies a RAM user of the bastion host. This parameter is required if the **Source** parameter is set to **Ram**. You can call the [ListUsers](~~28684~~) operation to obtain the unique identifier of the user from the **UserId** response parameter.
         */
        public Builder sourceUserId(String sourceUserId) {
            this.putQueryParameter("SourceUserId", sourceUserId);
            this.sourceUserId = sourceUserId;
            return this;
        }

        /**
         * The two-factor authentication method. You can select only one method. Valid values:
         * <p>
         * 
         * *   **sms:** text message
         * *   **email:** email
         * *   **dingtalk:** DingTalk
         * *   **totp OTP:** time-based one-time password (TOTP) app
         * 
         * > *   When the TwoFactorStatus parameter is set to Enable, you must specify one of the preceding values.
         */
        public Builder twoFactorMethods(String twoFactorMethods) {
            this.putQueryParameter("TwoFactorMethods", twoFactorMethods);
            this.twoFactorMethods = twoFactorMethods;
            return this;
        }

        /**
         * The two-factor authentication status of the user. Valid values:
         * <p>
         * 
         * - Global: follows the global settings
         * - Disable: disables two-factor authentication
         * - Enable: enable two-factor authentication and follows settings of the single user
         */
        public Builder twoFactorStatus(String twoFactorStatus) {
            this.putQueryParameter("TwoFactorStatus", twoFactorStatus);
            this.twoFactorStatus = twoFactorStatus;
            return this;
        }

        /**
         * The logon name of the user that you want to add. The logon name can contain only letters, digits, and underscores (\_) and can be up to 128 characters in length.
         */
        public Builder userName(String userName) {
            this.putQueryParameter("UserName", userName);
            this.userName = userName;
            return this;
        }

        @Override
        public CreateUserRequest build() {
            return new CreateUserRequest(this);
        } 

    } 

}
