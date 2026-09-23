// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam_developerapi20220225.models;

import com.aliyun.sdk.gateway.eiam.dev.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.eiam.dev.models.*;

/**
 * 
 * {@link CreateUserRequest} extends {@link RequestModel}
 *
 * <p>CreateUserRequest</p>
 */
public class CreateUserRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("regionId")
    private String regionId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("instanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("applicationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String applicationId;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("Authorization")
    @com.aliyun.core.annotation.Validation(required = true)
    private String authorization;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("customFields")
    private java.util.List<CustomFields> customFields;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("displayName")
    private String displayName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("email")
    private String email;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("emailVerified")
    private Boolean emailVerified;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("password")
    private String password;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("passwordInitializationConfig")
    private PasswordInitializationConfig passwordInitializationConfig;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("phoneNumber")
    private String phoneNumber;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("phoneNumberVerified")
    private Boolean phoneNumberVerified;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("phoneRegion")
    private String phoneRegion;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("primaryOrganizationalUnitId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String primaryOrganizationalUnitId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("userExternalId")
    private String userExternalId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("username")
    @com.aliyun.core.annotation.Validation(required = true)
    private String username;

    private CreateUserRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.instanceId = builder.instanceId;
        this.applicationId = builder.applicationId;
        this.authorization = builder.authorization;
        this.customFields = builder.customFields;
        this.description = builder.description;
        this.displayName = builder.displayName;
        this.email = builder.email;
        this.emailVerified = builder.emailVerified;
        this.password = builder.password;
        this.passwordInitializationConfig = builder.passwordInitializationConfig;
        this.phoneNumber = builder.phoneNumber;
        this.phoneNumberVerified = builder.phoneNumberVerified;
        this.phoneRegion = builder.phoneRegion;
        this.primaryOrganizationalUnitId = builder.primaryOrganizationalUnitId;
        this.userExternalId = builder.userExternalId;
        this.username = builder.username;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return applicationId
     */
    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * @return authorization
     */
    public String getAuthorization() {
        return this.authorization;
    }

    /**
     * @return customFields
     */
    public java.util.List<CustomFields> getCustomFields() {
        return this.customFields;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return displayName
     */
    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * @return email
     */
    public String getEmail() {
        return this.email;
    }

    /**
     * @return emailVerified
     */
    public Boolean getEmailVerified() {
        return this.emailVerified;
    }

    /**
     * @return password
     */
    public String getPassword() {
        return this.password;
    }

    /**
     * @return passwordInitializationConfig
     */
    public PasswordInitializationConfig getPasswordInitializationConfig() {
        return this.passwordInitializationConfig;
    }

    /**
     * @return phoneNumber
     */
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    /**
     * @return phoneNumberVerified
     */
    public Boolean getPhoneNumberVerified() {
        return this.phoneNumberVerified;
    }

    /**
     * @return phoneRegion
     */
    public String getPhoneRegion() {
        return this.phoneRegion;
    }

    /**
     * @return primaryOrganizationalUnitId
     */
    public String getPrimaryOrganizationalUnitId() {
        return this.primaryOrganizationalUnitId;
    }

    /**
     * @return userExternalId
     */
    public String getUserExternalId() {
        return this.userExternalId;
    }

    /**
     * @return username
     */
    public String getUsername() {
        return this.username;
    }

    public static final class Builder extends Request.Builder<CreateUserRequest, Builder> {
        private String regionId; 
        private String instanceId; 
        private String applicationId; 
        private String authorization; 
        private java.util.List<CustomFields> customFields; 
        private String description; 
        private String displayName; 
        private String email; 
        private Boolean emailVerified; 
        private String password; 
        private PasswordInitializationConfig passwordInitializationConfig; 
        private String phoneNumber; 
        private Boolean phoneNumberVerified; 
        private String phoneRegion; 
        private String primaryOrganizationalUnitId; 
        private String userExternalId; 
        private String username; 

        private Builder() {
            super();
        } 

        private Builder(CreateUserRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.instanceId = request.instanceId;
            this.applicationId = request.applicationId;
            this.authorization = request.authorization;
            this.customFields = request.customFields;
            this.description = request.description;
            this.displayName = request.displayName;
            this.email = request.email;
            this.emailVerified = request.emailVerified;
            this.password = request.password;
            this.passwordInitializationConfig = request.passwordInitializationConfig;
            this.phoneNumber = request.phoneNumber;
            this.phoneNumberVerified = request.phoneNumberVerified;
            this.phoneRegion = request.phoneRegion;
            this.primaryOrganizationalUnitId = request.primaryOrganizationalUnitId;
            this.userExternalId = request.userExternalId;
            this.username = request.username;
        } 

        /**
         * regionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("regionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The ID of the instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The ID of the application.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>app_mkv7rgt4d7i4u7zqtzev2mxxxx</p>
         */
        public Builder applicationId(String applicationId) {
            this.putPathParameter("applicationId", applicationId);
            this.applicationId = applicationId;
            return this;
        }

        /**
         * <p>The authentication information.
         * Format: <code>Bearer ${access_token}</code>.
         * Example: <code>Bearer ATxxxx</code>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Bearer AT8csE2seYxxxxxij</p>
         */
        public Builder authorization(String authorization) {
            this.putHeaderParameter("Authorization", authorization);
            this.authorization = authorization;
            return this;
        }

        /**
         * <p>A list of custom fields for the account.</p>
         */
        public Builder customFields(java.util.List<CustomFields> customFields) {
            this.putBodyParameter("customFields", customFields);
            this.customFields = customFields;
            return this;
        }

        /**
         * <p>The account description. The maximum length is 256 characters.</p>
         * 
         * <strong>example:</strong>
         * <p>测试账户</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The display name. The maximum length is 128 characters.</p>
         * 
         * <strong>example:</strong>
         * <p>display_name001</p>
         */
        public Builder displayName(String displayName) {
            this.putBodyParameter("displayName", displayName);
            this.displayName = displayName;
            return this;
        }

        /**
         * <p>The email address. The local-part of the address can contain uppercase and lowercase letters, digits, periods (<code>.</code>), underscores (<code>_</code>), and hyphens (<code>-</code>). The maximum length is 128 characters.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:example@example.com">example@example.com</a></p>
         */
        public Builder email(String email) {
            this.putBodyParameter("email", email);
            this.email = email;
            return this;
        }

        /**
         * <p>Specifies whether the email is verified. This parameter is required if <code>email</code> is set. Typically, set this to <code>true</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder emailVerified(Boolean emailVerified) {
            this.putBodyParameter("emailVerified", emailVerified);
            this.emailVerified = emailVerified;
            return this;
        }

        /**
         * <p>The account password. For password complexity rules, see the password policy in the IDaaS console.</p>
         * 
         * <strong>example:</strong>
         * <p>xxxxx</p>
         */
        public Builder password(String password) {
            this.putBodyParameter("password", password);
            this.password = password;
            return this;
        }

        /**
         * <p>The password initialization configuration.</p>
         */
        public Builder passwordInitializationConfig(PasswordInitializationConfig passwordInitializationConfig) {
            this.putBodyParameter("passwordInitializationConfig", passwordInitializationConfig);
            this.passwordInitializationConfig = passwordInitializationConfig;
            return this;
        }

        /**
         * <p>The account phone number. It must be 6 to 15 digits long.</p>
         * 
         * <strong>example:</strong>
         * <p>156xxxxxxx</p>
         */
        public Builder phoneNumber(String phoneNumber) {
            this.putBodyParameter("phoneNumber", phoneNumber);
            this.phoneNumber = phoneNumber;
            return this;
        }

        /**
         * <p>Specifies whether the phone number is verified. This parameter is required if <code>phoneNumber</code> is set. Typically, set this to <code>true</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder phoneNumberVerified(Boolean phoneNumberVerified) {
            this.putBodyParameter("phoneNumberVerified", phoneNumberVerified);
            this.phoneNumberVerified = phoneNumberVerified;
            return this;
        }

        /**
         * <p>The phone region code. For example, the code for the Chinese mainland is <code>86</code>. Do not include a <code>00</code> prefix or a plus sign (<code>+</code>). This parameter is required if <code>phoneNumber</code> is set.</p>
         * 
         * <strong>example:</strong>
         * <p>86</p>
         */
        public Builder phoneRegion(String phoneRegion) {
            this.putBodyParameter("phoneRegion", phoneRegion);
            this.phoneRegion = phoneRegion;
            return this;
        }

        /**
         * <p>The ID of the primary organizational unit.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ou_wovwffm62xifdziem7an7xxxxx</p>
         */
        public Builder primaryOrganizationalUnitId(String primaryOrganizationalUnitId) {
            this.putBodyParameter("primaryOrganizationalUnitId", primaryOrganizationalUnitId);
            this.primaryOrganizationalUnitId = primaryOrganizationalUnitId;
            return this;
        }

        /**
         * <p>The external user ID, used to associate the account with an external system. The maximum length is 128 characters. If unspecified, it defaults to the account ID.</p>
         * 
         * <strong>example:</strong>
         * <p>user_d6sbsuumeta4h66ec3il7yxxxx</p>
         */
        public Builder userExternalId(String userExternalId) {
            this.putBodyParameter("userExternalId", userExternalId);
            this.userExternalId = userExternalId;
            return this;
        }

        /**
         * <p>The username. It can contain letters, digits, and the following special characters: underscore (<code>_</code>), period (<code>.</code>), at sign (<code>@</code>), and hyphen (<code>-</code>). The maximum length is 256 characters.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>name001</p>
         */
        public Builder username(String username) {
            this.putBodyParameter("username", username);
            this.username = username;
            return this;
        }

        @Override
        public CreateUserRequest build() {
            return new CreateUserRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateUserRequest} extends {@link TeaModel}
     *
     * <p>CreateUserRequest</p>
     */
    public static class CustomFields extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("fieldName")
        private String fieldName;

        @com.aliyun.core.annotation.NameInMap("fieldValue")
        private String fieldValue;

        private CustomFields(Builder builder) {
            this.fieldName = builder.fieldName;
            this.fieldValue = builder.fieldValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CustomFields create() {
            return builder().build();
        }

        /**
         * @return fieldName
         */
        public String getFieldName() {
            return this.fieldName;
        }

        /**
         * @return fieldValue
         */
        public String getFieldValue() {
            return this.fieldValue;
        }

        public static final class Builder {
            private String fieldName; 
            private String fieldValue; 

            private Builder() {
            } 

            private Builder(CustomFields model) {
                this.fieldName = model.fieldName;
                this.fieldValue = model.fieldValue;
            } 

            /**
             * <p>The name of the custom field. You can view the field\&quot;s data type and value range in the IDaaS console.</p>
             * 
             * <strong>example:</strong>
             * <p>age</p>
             */
            public Builder fieldName(String fieldName) {
                this.fieldName = fieldName;
                return this;
            }

            /**
             * <p>The value of the custom field.</p>
             * 
             * <strong>example:</strong>
             * <p>fieldValue_001</p>
             */
            public Builder fieldValue(String fieldValue) {
                this.fieldValue = fieldValue;
                return this;
            }

            public CustomFields build() {
                return new CustomFields(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateUserRequest} extends {@link TeaModel}
     *
     * <p>CreateUserRequest</p>
     */
    public static class PasswordInitializationConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("passwordForcedUpdateStatus")
        private String passwordForcedUpdateStatus;

        @com.aliyun.core.annotation.NameInMap("passwordInitializationPolicyPriority")
        private String passwordInitializationPolicyPriority;

        @com.aliyun.core.annotation.NameInMap("passwordInitializationType")
        private String passwordInitializationType;

        @com.aliyun.core.annotation.NameInMap("userNotificationChannels")
        private java.util.List<String> userNotificationChannels;

        private PasswordInitializationConfig(Builder builder) {
            this.passwordForcedUpdateStatus = builder.passwordForcedUpdateStatus;
            this.passwordInitializationPolicyPriority = builder.passwordInitializationPolicyPriority;
            this.passwordInitializationType = builder.passwordInitializationType;
            this.userNotificationChannels = builder.userNotificationChannels;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PasswordInitializationConfig create() {
            return builder().build();
        }

        /**
         * @return passwordForcedUpdateStatus
         */
        public String getPasswordForcedUpdateStatus() {
            return this.passwordForcedUpdateStatus;
        }

        /**
         * @return passwordInitializationPolicyPriority
         */
        public String getPasswordInitializationPolicyPriority() {
            return this.passwordInitializationPolicyPriority;
        }

        /**
         * @return passwordInitializationType
         */
        public String getPasswordInitializationType() {
            return this.passwordInitializationType;
        }

        /**
         * @return userNotificationChannels
         */
        public java.util.List<String> getUserNotificationChannels() {
            return this.userNotificationChannels;
        }

        public static final class Builder {
            private String passwordForcedUpdateStatus; 
            private String passwordInitializationPolicyPriority; 
            private String passwordInitializationType; 
            private java.util.List<String> userNotificationChannels; 

            private Builder() {
            } 

            private Builder(PasswordInitializationConfig model) {
                this.passwordForcedUpdateStatus = model.passwordForcedUpdateStatus;
                this.passwordInitializationPolicyPriority = model.passwordInitializationPolicyPriority;
                this.passwordInitializationType = model.passwordInitializationType;
                this.userNotificationChannels = model.userNotificationChannels;
            } 

            /**
             * <p>The password forced update status. By default, this feature is disabled. Valid values:</p>
             * <ul>
             * <li><p><code>enabled</code>: Enables the feature.</p>
             * </li>
             * <li><p><code>disabled</code>: Disables the feature.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>enabled</p>
             */
            public Builder passwordForcedUpdateStatus(String passwordForcedUpdateStatus) {
                this.passwordForcedUpdateStatus = passwordForcedUpdateStatus;
                return this;
            }

            /**
             * <p>The priority of the password initialization policy. Valid values:</p>
             * <ul>
             * <li><p><code>global</code>: Uses the instance-level password initialization policy and ignores the custom settings in this request. For more information, see the password initialization policy configuration in the IDaaS console.</p>
             * </li>
             * <li><p><code>custom</code>: Uses the custom password initialization policy defined in this request. This includes settings for forced password updates, the initialization type, and notification channels.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>global</p>
             */
            public Builder passwordInitializationPolicyPriority(String passwordInitializationPolicyPriority) {
                this.passwordInitializationPolicyPriority = passwordInitializationPolicyPriority;
                return this;
            }

            /**
             * <p>The password initialization type. Valid values:</p>
             * <ul>
             * <li><code>random</code>: A randomly generated password.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>random</p>
             */
            public Builder passwordInitializationType(String passwordInitializationType) {
                this.passwordInitializationType = passwordInitializationType;
                return this;
            }

            /**
             * <p>The user notification channels. Valid values:</p>
             * <ul>
             * <li><p><code>email</code>: Email</p>
             * </li>
             * <li><p><code>sms</code>: SMS</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>sms</p>
             */
            public Builder userNotificationChannels(java.util.List<String> userNotificationChannels) {
                this.userNotificationChannels = userNotificationChannels;
                return this;
            }

            public PasswordInitializationConfig build() {
                return new PasswordInitializationConfig(this);
            } 

        } 

    }
}
