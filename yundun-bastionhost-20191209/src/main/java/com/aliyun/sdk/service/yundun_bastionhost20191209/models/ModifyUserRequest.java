// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyUserRequest} extends {@link RequestModel}
 *
 * <p>ModifyUserRequest</p>
 */
public class ModifyUserRequest extends Request {
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
    @NameInMap("TwoFactorMethods")
    private String twoFactorMethods;

    @Query
    @NameInMap("TwoFactorStatus")
    private String twoFactorStatus;

    @Query
    @NameInMap("UserId")
    @Validation(required = true)
    private String userId;

    private ModifyUserRequest(Builder builder) {
        super(builder);
        this.comment = builder.comment;
        this.displayName = builder.displayName;
        this.effectiveEndTime = builder.effectiveEndTime;
        this.effectiveStartTime = builder.effectiveStartTime;
        this.email = builder.email;
        this.instanceId = builder.instanceId;
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
         * The new description of the user. The description can be up to 500 characters in length.
         */
        public Builder comment(String comment) {
            this.putQueryParameter("Comment", comment);
            this.comment = comment;
            return this;
        }

        /**
         * The new display name of the user. This display name can be up to 128 characters in length.
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
         * The new email address of the user.
         * <p>
         * 
         * > This parameter is required when the TwoFactorStatus parameter is set to Enable and the TwoFactorMethods parameter is set to email.
         */
        public Builder email(String email) {
            this.putQueryParameter("Email", email);
            this.email = email;
            return this;
        }

        /**
         * The ID of the bastion host where you want to modify user information.
         * <p>
         * 
         * > You can call the [DescribeInstances](~~153281~~) operation to query the ID of the bastion host.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The new mobile number of the user.
         * <p>
         * 
         * > This parameter is required when the TwoFactorStatus parameter is set to Enable and the TwoFactorMethods parameter is set to sms or dingtalk.
         */
        public Builder mobile(String mobile) {
            this.putQueryParameter("Mobile", mobile);
            this.mobile = mobile;
            return this;
        }

        /**
         * The country where the new mobile number of the user is registered. Valid values:
         * <p>
         * 
         * *   **CN:** the Chinese mainland, whose country calling code is +86
         * *   **HK:** Hong Kong (China), whose country calling code is +852
         * *   **MO:** Macao (China), whose country calling code is +853
         * *   **TW:** Taiwan (China), whose country calling code is +886
         * *   **RU:** Russia, whose country calling code is +7
         * *   **SG:** Singapore, whose country calling code is +65
         * *   **MY:** Malaysia, whose country calling code is +60
         * *   **ID:** Indonesia, whose country calling code is +62
         * *   **DE:** Germany, whose country calling code is +49
         * *   **AU:** Australia, whose country calling code is +61
         * *   **US:** US, whose country calling code is +1
         * *   **AE:** United Arab Emirates, whose country calling code is +971
         * *   **JP:** Japan, whose country calling code is +81
         * *   **GB:** UK, whose country calling code is +44
         * *   **IN:** India, whose country calling code is +91
         * *   **KR:** Republic of Korea, whose country calling code is +82
         * *   **PH:** Philippines, whose country calling code is +63
         * *   **CH:** Switzerland, whose country calling code is +41
         * *   **SE:** Sweden, whose country calling code is +46
         * *   **SA:** Saudi Arabia, whose country calling code is +966
         */
        public Builder mobileCountryCode(String mobileCountryCode) {
            this.putQueryParameter("MobileCountryCode", mobileCountryCode);
            this.mobileCountryCode = mobileCountryCode;
            return this;
        }

        /**
         * The original password of the user. The password must be 8 to 128 characters in length and must contain lowercase letters, uppercase letters, digits, and special characters.
         */
        public Builder needResetPassword(Boolean needResetPassword) {
            this.putQueryParameter("NeedResetPassword", needResetPassword);
            this.needResetPassword = needResetPassword;
            return this;
        }

        /**
         * The new password of the user. The password must be 8 to 128 characters in length and must contain lowercase letters, uppercase letters, digits, and special characters.
         */
        public Builder password(String password) {
            this.putQueryParameter("Password", password);
            this.password = password;
            return this;
        }

        /**
         * The region ID of the bastion host where you want to modify user information.
         * <p>
         * 
         * > For more information about the mapping between region IDs and region names, see [Regions and zones](~~40654~~).
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
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
         * > 
         * 
         * *   When the TwoFactorStatus parameter is set to Enable, you must specify one of the preceding values.
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
         * *   **Global:** follows the global settings
         * *   **Disable:** disables two-factor authentication
         * *   **Enable:** enable two-factor authentication and follows settings of the single user
         */
        public Builder twoFactorStatus(String twoFactorStatus) {
            this.putQueryParameter("TwoFactorStatus", twoFactorStatus);
            this.twoFactorStatus = twoFactorStatus;
            return this;
        }

        /**
         * The ID of the user whose information you want to modify.
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
