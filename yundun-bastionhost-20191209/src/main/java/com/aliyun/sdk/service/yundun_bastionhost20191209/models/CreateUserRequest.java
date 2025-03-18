// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

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
 * {@link CreateUserRequest} extends {@link RequestModel}
 *
 * <p>CreateUserRequest</p>
 */
public class CreateUserRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Comment")
    private String comment;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DisplayName")
    private String displayName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EffectiveEndTime")
    private Long effectiveEndTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EffectiveStartTime")
    private Long effectiveStartTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Email")
    private String email;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Language")
    private String language;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LanguageStatus")
    private String languageStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Mobile")
    private String mobile;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MobileCountryCode")
    private String mobileCountryCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NeedResetPassword")
    private Boolean needResetPassword;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Password")
    private String password;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Source")
    @com.aliyun.core.annotation.Validation(required = true)
    private String source;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceUserId")
    private String sourceUserId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TwoFactorMethods")
    private String twoFactorMethods;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TwoFactorStatus")
    private String twoFactorStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserName")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>The remarks of the user that you want to add. The remarks can be up to 500 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>comment</p>
         */
        public Builder comment(String comment) {
            this.putQueryParameter("Comment", comment);
            this.comment = comment;
            return this;
        }

        /**
         * <p>The display name of the user that you want to add. The display name can be up to 128 characters in length.</p>
         * <blockquote>
         * <p> If you leave this parameter empty, the logon name is used as the display name.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Bob</p>
         */
        public Builder displayName(String displayName) {
            this.putQueryParameter("DisplayName", displayName);
            this.displayName = displayName;
            return this;
        }

        /**
         * <p>The end time of the validity period of the user. Specify a UNIX timestamp. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1672502400</p>
         */
        public Builder effectiveEndTime(Long effectiveEndTime) {
            this.putQueryParameter("EffectiveEndTime", effectiveEndTime);
            this.effectiveEndTime = effectiveEndTime;
            return this;
        }

        /**
         * <p>The start time of the validity period of the user. Specify a UNIX timestamp. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1669630029</p>
         */
        public Builder effectiveStartTime(Long effectiveStartTime) {
            this.putQueryParameter("EffectiveStartTime", effectiveStartTime);
            this.effectiveStartTime = effectiveStartTime;
            return this;
        }

        /**
         * <p>The email address of the user that you want to add.</p>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li><p>This parameter is required if TwoFactorStatus is set to Enable and TwoFactorMethods is set to email, or if TwoFactorStatus is set to Global and TwoFactorMethods is set to email in the global two-factor authentication settings.</p>
         * </li>
         * <li><p>You can call the <a href="https://help.aliyun.com/document_detail/462968.html">GetInstanceTwoFactor</a> operation to query the global two-factor authentication settings.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:username@example.com">username@example.com</a></p>
         */
        public Builder email(String email) {
            this.putQueryParameter("Email", email);
            this.email = email;
            return this;
        }

        /**
         * <p>The ID of the bastion host to which you want to add a user.</p>
         * <blockquote>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/153281.html">DescribeInstances</a> operation to query the bastion host ID.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>bastionhost-cn-st220aw****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>This parameter is required if LanguageStatus is set to Custom. Valid values:</p>
         * <ul>
         * <li><strong>zh-cn</strong>: simplified Chinese.</li>
         * <li><strong>en</strong>: English.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>en</p>
         */
        public Builder language(String language) {
            this.putQueryParameter("Language", language);
            this.language = language;
            return this;
        }

        /**
         * <p>Specifies whether to send notifications in the language specified in the global settings or a custom language.</p>
         * <ul>
         * <li><strong>Global</strong></li>
         * <li><strong>Custom</strong></li>
         * </ul>
         * <blockquote>
         * <p> If you leave this parameter empty, the default value Global is used.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Custom</p>
         */
        public Builder languageStatus(String languageStatus) {
            this.putQueryParameter("LanguageStatus", languageStatus);
            this.languageStatus = languageStatus;
            return this;
        }

        /**
         * <p>The mobile phone number of the user that you want to add.</p>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li><p>This parameter is required if TwoFactorStatus is set to Enable and TwoFactorMethods is set to sms or dingtalk, or if TwoFactorStatus is set to Global and TwoFactorMethods is set to sms or dingtalk in the global two-factor authentication settings.</p>
         * </li>
         * <li><p>You can call the <a href="https://help.aliyun.com/document_detail/462968.html">GetInstanceTwoFactor</a> operation to query the global two-factor authentication settings.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1359999****</p>
         */
        public Builder mobile(String mobile) {
            this.putQueryParameter("Mobile", mobile);
            this.mobile = mobile;
            return this;
        }

        /**
         * <p>The location where the mobile phone number of the user is registered. Default value: CN. Valid values:</p>
         * <ul>
         * <li><strong>CN</strong>: the Chinese mainland, whose international dialing code is +86.</li>
         * <li><strong>HK</strong>: Hong Kong (China), whose international dialing code is +852.</li>
         * <li><strong>MO</strong>: Macao (China), whose international dialing code is +853.</li>
         * <li><strong>TW</strong>: Taiwan (China), whose international dialing code is +886.</li>
         * <li><strong>RU</strong>: Russia, whose international dialing code is +7.</li>
         * <li><strong>SG</strong>: Singapore, whose international dialing code is +65.</li>
         * <li><strong>MY</strong>: Malaysia, whose international dialing code is +60.</li>
         * <li><strong>ID</strong>: Indonesia, whose international dialing code is +62.</li>
         * <li><strong>DE</strong>: Germany, whose international dialing code is +49.</li>
         * <li><strong>AU</strong>: Australia, whose international dialing code is +61.</li>
         * <li><strong>US</strong>: US, whose international dialing code is +1.</li>
         * <li><strong>AE</strong>: United Arab Emirates, whose international dialing code is +971.</li>
         * <li><strong>JP</strong>: Japan, whose international dialing code is +81.</li>
         * <li><strong>GB</strong>: UK, whose international dialing code is +44.</li>
         * <li><strong>IN</strong>: India, whose international dialing code is +91.</li>
         * <li><strong>KR</strong>: Republic of Korea, whose international dialing code is +82.</li>
         * <li><strong>PH</strong>: Philippines, whose international dialing code is +63.</li>
         * <li><strong>CH</strong>: Switzerland, whose international dialing code is +41.</li>
         * <li><strong>SE:</strong> Sweden, whose international dialing code is +46.</li>
         * <li><strong>SA:</strong> Saudi Arabia, whose international dialing code is +966.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CN</p>
         */
        public Builder mobileCountryCode(String mobileCountryCode) {
            this.putQueryParameter("MobileCountryCode", mobileCountryCode);
            this.mobileCountryCode = mobileCountryCode;
            return this;
        }

        /**
         * <p>Specifies whether password reset is required upon the next logon. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * <blockquote>
         * <p> If you leave this parameter empty, the default value false is used.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder needResetPassword(Boolean needResetPassword) {
            this.putQueryParameter("NeedResetPassword", needResetPassword);
            this.needResetPassword = needResetPassword;
            return this;
        }

        /**
         * <p>The logon password of the user that you want to add. The logon password must be 8 to 128 characters in length. It must contain uppercase letters, lowercase letters, digits, and special characters.</p>
         * <blockquote>
         * <p>This parameter is required if Source is set to Local.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>213****</p>
         */
        public Builder password(String password) {
            this.putQueryParameter("Password", password);
            this.password = password;
            return this;
        }

        /**
         * <p>The region ID of the bastion host to which you want to add a user.</p>
         * <blockquote>
         * <p>For more information about the mapping between region IDs and region names, see <a href="https://help.aliyun.com/document_detail/40654.html">Regions and zones</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The type of the user that you want to add. Valid values:</p>
         * <ul>
         * <li><strong>Local</strong>: a local user.</li>
         * <li><strong>Ram</strong>: a RAM user.</li>
         * <li><strong>AD</strong>: an AD-authenticated user.</li>
         * <li><strong>LDAP</strong>: an LDAP-authenticated user.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>local</p>
         */
        public Builder source(String source) {
            this.putQueryParameter("Source", source);
            this.source = source;
            return this;
        }

        /**
         * <p>The unique ID of the user that you want to add.</p>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li><p>This parameter uniquely identifies a RAM user of the bastion host. This parameter is required if Source is set to Ram. You can call the <a href="https://help.aliyun.com/document_detail/28684.html">ListUsers</a> operation in RAM to obtain the unique ID of the user from the UserId response parameter.</p>
         * </li>
         * <li><p>This parameter is required if Source is set to AD or LDAP. Specify the distinguished name (DN) of the Active Directory (AD)-authenticated user or Lightweight Directory Access Protocol (LDAP)-authenticated user that you want to add.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>122748924538****</p>
         */
        public Builder sourceUserId(String sourceUserId) {
            this.putQueryParameter("SourceUserId", sourceUserId);
            this.sourceUserId = sourceUserId;
            return this;
        }

        /**
         * <p>The two-factor authentication method. You can select only one method. Valid values:</p>
         * <ul>
         * <li><strong>sms</strong>: text message-based two-factor authentication.</li>
         * <li><strong>email</strong>: email-based two-factor authentication.</li>
         * <li><strong>dingtalk</strong>: DingTalk-based two-factor authentication.</li>
         * <li><strong>totp OTP</strong>: one-time password (OTP) token-based two-factor authentication.</li>
         * </ul>
         * <blockquote>
         * <p> If TwoFactorStatus is set to Enable, you must select one of the preceding values for TwoFactorMethods.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>[&quot;sms&quot;]</p>
         */
        public Builder twoFactorMethods(String twoFactorMethods) {
            this.putQueryParameter("TwoFactorMethods", twoFactorMethods);
            this.twoFactorMethods = twoFactorMethods;
            return this;
        }

        /**
         * <p>Specifies whether two-factor authentication is enabled for the user. Valid values:</p>
         * <ul>
         * <li><strong>Global</strong>: The global settings apply.</li>
         * <li><strong>Disable</strong>: Two-factor authentication is disabled.</li>
         * <li><strong>Enable</strong>: Two-factor authentication is enabled and user-specific settings apply.</li>
         * </ul>
         * <blockquote>
         * <p> If you leave this parameter empty, the default value Global is used.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Enable</p>
         */
        public Builder twoFactorStatus(String twoFactorStatus) {
            this.putQueryParameter("TwoFactorStatus", twoFactorStatus);
            this.twoFactorStatus = twoFactorStatus;
            return this;
        }

        /**
         * <p>The logon name of the user that you want to add. The logon name must be 1 to 128 characters in length and can contain only letters, digits, and underscores (_).</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>abc_def</p>
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
