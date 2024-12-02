// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ModifyUserRequest} extends {@link RequestModel}
 *
 * <p>ModifyUserRequest</p>
 */
public class ModifyUserRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("TwoFactorMethods")
    private String twoFactorMethods;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TwoFactorStatus")
    private String twoFactorStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String userId;

    private ModifyUserRequest(Builder builder) {
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
        this.twoFactorMethods = builder.twoFactorMethods;
        this.twoFactorStatus = builder.twoFactorStatus;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyUserRequest create() {
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
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    public static final class Builder extends Request.Builder<ModifyUserRequest, Builder> {
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
        private String twoFactorMethods; 
        private String twoFactorStatus; 
        private String userId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyUserRequest request) {
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
            this.twoFactorMethods = request.twoFactorMethods;
            this.twoFactorStatus = request.twoFactorStatus;
            this.userId = request.userId;
        } 

        /**
         * <p>The new remarks of the user. The remarks can be up to 500 characters in length.</p>
         * <blockquote>
         * <p> Leave this parameter empty if you do not want to change the remarks of the user.</p>
         * </blockquote>
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
         * <p>The new display name of the user. The display name can be up to 128 characters in length.</p>
         * <blockquote>
         * <p> Leave this parameter empty if you do not want to change the display name of the user.</p>
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
         * <blockquote>
         * <p> Leave this parameter empty if you do not want to change the end time of the validity period.</p>
         * </blockquote>
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
         * <blockquote>
         * <p> Leave this parameter empty if you do not want to change the start time of the validity period.</p>
         * </blockquote>
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
         * <p>The new email address of the user.</p>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li><p>This parameter is required if TwoFactorStatus is set to Enable and TwoFactorMethods is set to email, or if TwoFactorStatus is set to Global and TwoFactorMethods is set to email in the global two-factor authentication settings.</p>
         * </li>
         * <li><p>You can call the <a href="https://help.aliyun.com/document_detail/462968.html">GetInstanceTwoFactor</a> operation to query the global two-factor authentication settings.</p>
         * </li>
         * <li><p>Leave this parameter empty if you do not want to change the email address of the user.</p>
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
         * <p>The ID of the bastion host on which you want to modify the information about the user.</p>
         * <blockquote>
         * <p> You can call the <a href="https://help.aliyun.com/document_detail/153281.html">DescribeInstances</a> operation to query the bastion host ID.</p>
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
         * <p>This parameter is required if LanguageStatus is set to Custom.</p>
         * <ul>
         * <li><strong>zh-cn</strong>: simplified Chinese</li>
         * <li><strong>en</strong>: English</li>
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
         * <p> Leave this parameter empty if you do not want to change the natural language used to notify the user.</p>
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
         * <p>The new mobile phone number of the user.</p>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li><p>This parameter is required if TwoFactorStatus is set to Enable and TwoFactorMethods is set to sms or dingtalk, or if TwoFactorStatus is set to Global and TwoFactorMethods is set to sms or dingtalk in the global two-factor authentication settings.</p>
         * </li>
         * <li><p>You can call the <a href="https://help.aliyun.com/document_detail/462968.html">GetInstanceTwoFactor</a> operation to query the global two-factor authentication settings.</p>
         * </li>
         * <li><p>Leave this parameter empty if you do not want to change the mobile phone number of the user.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1358888****</p>
         */
        public Builder mobile(String mobile) {
            this.putQueryParameter("Mobile", mobile);
            this.mobile = mobile;
            return this;
        }

        /**
         * <p>The country where the new mobile number of the user is registered. Valid values:</p>
         * <ul>
         * <li><strong>CN:</strong> the Chinese mainland, whose country calling code is +86</li>
         * <li><strong>HK:</strong> Hong Kong (China), whose country calling code is +852</li>
         * <li><strong>MO:</strong> Macao (China), whose country calling code is +853</li>
         * <li><strong>TW:</strong> Taiwan (China), whose country calling code is +886</li>
         * <li><strong>RU:</strong> Russia, whose country calling code is +7</li>
         * <li><strong>SG:</strong> Singapore, whose country calling code is +65</li>
         * <li><strong>MY:</strong> Malaysia, whose country calling code is +60</li>
         * <li><strong>ID:</strong> Indonesia, whose country calling code is +62</li>
         * <li><strong>DE:</strong> Germany, whose country calling code is +49</li>
         * <li><strong>AU:</strong> Australia, whose country calling code is +61</li>
         * <li><strong>US:</strong> US, whose country calling code is +1</li>
         * <li><strong>AE:</strong> United Arab Emirates, whose country calling code is +971</li>
         * <li><strong>JP:</strong> Japan, whose country calling code is +81</li>
         * <li><strong>GB:</strong> UK, whose country calling code is +44</li>
         * <li><strong>IN:</strong> India, whose country calling code is +91</li>
         * <li><strong>KR:</strong> Republic of Korea, whose country calling code is +82</li>
         * <li><strong>PH:</strong> Philippines, whose country calling code is +63</li>
         * <li><strong>CH:</strong> Switzerland, whose country calling code is +41</li>
         * <li><strong>SE:</strong> Sweden, whose country calling code is +46</li>
         * <li><strong>SA:</strong> Saudi Arabia, whose country calling code is +966</li>
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
         * <p> Leave this parameter empty if you do not want to change the password reset settings for the user.</p>
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
         * <p>The new password of the user. The password must be 8 to 128 characters in length. It must contain uppercase letters, lowercase letters, digits, and special characters.</p>
         * <blockquote>
         * <p>Leave this parameter empty if you do not want to change the password of the user.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>321****</p>
         */
        public Builder password(String password) {
            this.putQueryParameter("Password", password);
            this.password = password;
            return this;
        }

        /**
         * <p>The region ID of the bastion host on which you want to modify the information about the user.</p>
         * <blockquote>
         * <p> For more information about the mapping between region IDs and region names, see <a href="https://help.aliyun.com/document_detail/40654.html">Regions and zones</a>.</p>
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
         * <p>The two-factor authentication method. You can select only one method. Valid values:</p>
         * <ul>
         * <li><strong>sms</strong>: text message-based two-factor authentication.</li>
         * <li><strong>email</strong>: email-based two-factor authentication.</li>
         * <li><strong>dingtalk</strong>: DingTalk-based two-factor authentication.</li>
         * <li><strong>totp OTP:</strong> one-time password (OTP) token-based two-factor authentication.</li>
         * </ul>
         * <blockquote>
         * <p> If TwoFactorStatus is set to Enable, you must specify one of the valid values as TwoFactorMethods.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>sms</p>
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
         * <p> Leave this parameter empty if you do not want to change the two-factory authentication settings for the user.</p>
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
         * <p>The ID of the user whose information you want to modify.</p>
         * <blockquote>
         * <p> You can call the <a href="https://help.aliyun.com/document_detail/204522.html">ListUsers</a> operation to query the user ID.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder userId(String userId) {
            this.putQueryParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        @Override
        public ModifyUserRequest build() {
            return new ModifyUserRequest(this);
        } 

    } 

}
