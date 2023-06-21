// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

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
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("CustomFields")
    private java.util.List < CustomFields> customFields;

    @Query
    @NameInMap("Description")
    @Validation(maxLength = 256)
    private String description;

    @Query
    @NameInMap("DisplayName")
    @Validation(maxLength = 64)
    private String displayName;

    @Query
    @NameInMap("Email")
    @Validation(maxLength = 64)
    private String email;

    @Query
    @NameInMap("EmailVerified")
    @Validation(maxLength = 64)
    private Boolean emailVerified;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true, maxLength = 64)
    private String instanceId;

    @Query
    @NameInMap("OrganizationalUnitIds")
    private java.util.List < String > organizationalUnitIds;

    @Query
    @NameInMap("Password")
    @Validation(required = true, maxLength = 64)
    private String password;

    @Query
    @NameInMap("PasswordInitializationConfig")
    private PasswordInitializationConfig passwordInitializationConfig;

    @Query
    @NameInMap("PhoneNumber")
    @Validation(maxLength = 32)
    private String phoneNumber;

    @Query
    @NameInMap("PhoneNumberVerified")
    @Validation(maxLength = 64)
    private Boolean phoneNumberVerified;

    @Query
    @NameInMap("PhoneRegion")
    @Validation(maxLength = 32)
    private String phoneRegion;

    @Query
    @NameInMap("PrimaryOrganizationalUnitId")
    @Validation(required = true, maxLength = 64)
    private String primaryOrganizationalUnitId;

    @Query
    @NameInMap("UserExternalId")
    @Validation(maxLength = 64)
    private String userExternalId;

    @Query
    @NameInMap("Username")
    @Validation(required = true, maxLength = 64)
    private String username;

    private CreateUserRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.customFields = builder.customFields;
        this.description = builder.description;
        this.displayName = builder.displayName;
        this.email = builder.email;
        this.emailVerified = builder.emailVerified;
        this.instanceId = builder.instanceId;
        this.organizationalUnitIds = builder.organizationalUnitIds;
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
     * @return customFields
     */
    public java.util.List < CustomFields> getCustomFields() {
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
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return organizationalUnitIds
     */
    public java.util.List < String > getOrganizationalUnitIds() {
        return this.organizationalUnitIds;
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
        private java.util.List < CustomFields> customFields; 
        private String description; 
        private String displayName; 
        private String email; 
        private Boolean emailVerified; 
        private String instanceId; 
        private java.util.List < String > organizationalUnitIds; 
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
            this.customFields = request.customFields;
            this.description = request.description;
            this.displayName = request.displayName;
            this.email = request.email;
            this.emailVerified = request.emailVerified;
            this.instanceId = request.instanceId;
            this.organizationalUnitIds = request.organizationalUnitIds;
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
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The extended fields.
         */
        public Builder customFields(java.util.List < CustomFields> customFields) {
            this.putQueryParameter("CustomFields", customFields);
            this.customFields = customFields;
            return this;
        }

        /**
         * The description of the organizational unit. The description can be up to 256 characters in length.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * The display name of the account. The display name can be up to 64 characters in length.
         */
        public Builder displayName(String displayName) {
            this.putQueryParameter("DisplayName", displayName);
            this.displayName = displayName;
            return this;
        }

        /**
         * The email address of the user who owns the account. The email address prefix can contain letters, digits, underscores (\_), periods (.), and hyphens (-).
         */
        public Builder email(String email) {
            this.putQueryParameter("Email", email);
            this.email = email;
            return this;
        }

        /**
         * Specifies whether the email address is a trusted email address. This parameter is required if the Email parameter is specified. If you have no special business requirements, set this parameter to true.
         */
        public Builder emailVerified(Boolean emailVerified) {
            this.putQueryParameter("EmailVerified", emailVerified);
            this.emailVerified = emailVerified;
            return this;
        }

        /**
         * The ID of the instance.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The IDs of organizational units to which the account belongs. An account can belong to multiple organizational units.
         */
        public Builder organizationalUnitIds(java.util.List < String > organizationalUnitIds) {
            this.putQueryParameter("OrganizationalUnitIds", organizationalUnitIds);
            this.organizationalUnitIds = organizationalUnitIds;
            return this;
        }

        /**
         * The password of the account. For more information, view the password policy of the instance in the IDaaS console.
         */
        public Builder password(String password) {
            this.putQueryParameter("Password", password);
            this.password = password;
            return this;
        }

        /**
         * The configurations for password initialization.
         */
        public Builder passwordInitializationConfig(PasswordInitializationConfig passwordInitializationConfig) {
            this.putQueryParameter("PasswordInitializationConfig", passwordInitializationConfig);
            this.passwordInitializationConfig = passwordInitializationConfig;
            return this;
        }

        /**
         * The mobile phone number, which contains 6 to 15 digits.
         */
        public Builder phoneNumber(String phoneNumber) {
            this.putQueryParameter("PhoneNumber", phoneNumber);
            this.phoneNumber = phoneNumber;
            return this;
        }

        /**
         * Specifies whether the mobile phone number is a trusted mobile phone number. This parameter is required if the PhoneNumber parameter is specified. If you have no special business requirements, set this parameter to true.
         */
        public Builder phoneNumberVerified(Boolean phoneNumberVerified) {
            this.putQueryParameter("PhoneNumberVerified", phoneNumberVerified);
            this.phoneNumberVerified = phoneNumberVerified;
            return this;
        }

        /**
         * The country code of the mobile phone number. The country code contains only digits and does not contain a plus sign (+).
         */
        public Builder phoneRegion(String phoneRegion) {
            this.putQueryParameter("PhoneRegion", phoneRegion);
            this.phoneRegion = phoneRegion;
            return this;
        }

        /**
         * The ID of the primary organizational unit to which the account belongs.
         */
        public Builder primaryOrganizationalUnitId(String primaryOrganizationalUnitId) {
            this.putQueryParameter("PrimaryOrganizationalUnitId", primaryOrganizationalUnitId);
            this.primaryOrganizationalUnitId = primaryOrganizationalUnitId;
            return this;
        }

        /**
         * The external ID of the account. The external ID can be used to associate the account with an external system. The external ID can be up to 64 characters in length. If you do not specify an external ID for the account, the ID of the account is used as the external ID by default.
         */
        public Builder userExternalId(String userExternalId) {
            this.putQueryParameter("UserExternalId", userExternalId);
            this.userExternalId = userExternalId;
            return this;
        }

        /**
         * The name of the account. The name can be up to 64 characters in length and can contain letters, digits, underscores (\_), periods (.), at signs (@), and hyphens (-).
         */
        public Builder username(String username) {
            this.putQueryParameter("Username", username);
            this.username = username;
            return this;
        }

        @Override
        public CreateUserRequest build() {
            return new CreateUserRequest(this);
        } 

    } 

    public static class CustomFields extends TeaModel {
        @NameInMap("FieldName")
        @Validation(maxLength = 64)
        private String fieldName;

        @NameInMap("FieldValue")
        @Validation(maxLength = 64)
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

            /**
             * The name of the extended field. You must create the extended field in advance. To create an extended field, log on to the IDaaS console. In the left-side navigation pane, choose Accounts > Extended Fields, and then click Create Field on the Extended Fields page.
             */
            public Builder fieldName(String fieldName) {
                this.fieldName = fieldName;
                return this;
            }

            /**
             * The value of the extended field. The value follows the limits on the properties of the extended field.
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
    public static class PasswordInitializationConfig extends TeaModel {
        @NameInMap("PasswordForcedUpdateStatus")
        @Validation(maxLength = 64)
        private String passwordForcedUpdateStatus;

        @NameInMap("PasswordInitializationPolicyPriority")
        @Validation(maxLength = 64)
        private String passwordInitializationPolicyPriority;

        @NameInMap("PasswordInitializationType")
        @Validation(maxLength = 64)
        private String passwordInitializationType;

        @NameInMap("UserNotificationChannels")
        @Validation(maxLength = 64)
        private java.util.List < String > userNotificationChannels;

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
        public java.util.List < String > getUserNotificationChannels() {
            return this.userNotificationChannels;
        }

        public static final class Builder {
            private String passwordForcedUpdateStatus; 
            private String passwordInitializationPolicyPriority; 
            private String passwordInitializationType; 
            private java.util.List < String > userNotificationChannels; 

            /**
             * Specifies whether to forcibly change the password status. Default value: disabled. Valid values:
             * <p>
             * 
             * *   enabled: forcibly changes the password status.
             * *   disabled: does not forcibly change the password status.
             */
            public Builder passwordForcedUpdateStatus(String passwordForcedUpdateStatus) {
                this.passwordForcedUpdateStatus = passwordForcedUpdateStatus;
                return this;
            }

            /**
             * The priority of the password initialization policy. By default, this parameter does not take effect. Valid values:
             * <p>
             * 
             * *   global: The password initialization policy globally takes effect.
             * *   custom: The password initialization policy takes effect based on custom settings.
             */
            public Builder passwordInitializationPolicyPriority(String passwordInitializationPolicyPriority) {
                this.passwordInitializationPolicyPriority = passwordInitializationPolicyPriority;
                return this;
            }

            /**
             * The password initialization method. Set the value to random,
             * <p>
             * 
             * *   which indicates that the password is randomly generated.
             */
            public Builder passwordInitializationType(String passwordInitializationType) {
                this.passwordInitializationType = passwordInitializationType;
                return this;
            }

            /**
             * The password notification methods.
             */
            public Builder userNotificationChannels(java.util.List < String > userNotificationChannels) {
                this.userNotificationChannels = userNotificationChannels;
                return this;
            }

            public PasswordInitializationConfig build() {
                return new PasswordInitializationConfig(this);
            } 

        } 

    }
}
