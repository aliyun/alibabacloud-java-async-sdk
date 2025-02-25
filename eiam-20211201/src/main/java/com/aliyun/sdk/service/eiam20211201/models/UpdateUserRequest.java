// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

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
 * {@link UpdateUserRequest} extends {@link RequestModel}
 *
 * <p>UpdateUserRequest</p>
 */
public class UpdateUserRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CustomFields")
    private java.util.List<CustomFields> customFields;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DisplayName")
    @com.aliyun.core.annotation.Validation(maxLength = 64)
    private String displayName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Email")
    @com.aliyun.core.annotation.Validation(maxLength = 64)
    private String email;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EmailVerified")
    @com.aliyun.core.annotation.Validation(maxLength = 64)
    private Boolean emailVerified;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PhoneNumber")
    @com.aliyun.core.annotation.Validation(maxLength = 32)
    private String phoneNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PhoneNumberVerified")
    @com.aliyun.core.annotation.Validation(maxLength = 64)
    private Boolean phoneNumberVerified;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PhoneRegion")
    @com.aliyun.core.annotation.Validation(maxLength = 32)
    private String phoneRegion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String userId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Username")
    @com.aliyun.core.annotation.Validation(maxLength = 64)
    private String username;

    private UpdateUserRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.customFields = builder.customFields;
        this.displayName = builder.displayName;
        this.email = builder.email;
        this.emailVerified = builder.emailVerified;
        this.instanceId = builder.instanceId;
        this.phoneNumber = builder.phoneNumber;
        this.phoneNumberVerified = builder.phoneNumberVerified;
        this.phoneRegion = builder.phoneRegion;
        this.userId = builder.userId;
        this.username = builder.username;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateUserRequest create() {
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
    public java.util.List<CustomFields> getCustomFields() {
        return this.customFields;
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
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    /**
     * @return username
     */
    public String getUsername() {
        return this.username;
    }

    public static final class Builder extends Request.Builder<UpdateUserRequest, Builder> {
        private String regionId; 
        private java.util.List<CustomFields> customFields; 
        private String displayName; 
        private String email; 
        private Boolean emailVerified; 
        private String instanceId; 
        private String phoneNumber; 
        private Boolean phoneNumberVerified; 
        private String phoneRegion; 
        private String userId; 
        private String username; 

        private Builder() {
            super();
        } 

        private Builder(UpdateUserRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.customFields = request.customFields;
            this.displayName = request.displayName;
            this.email = request.email;
            this.emailVerified = request.emailVerified;
            this.instanceId = request.instanceId;
            this.phoneNumber = request.phoneNumber;
            this.phoneNumberVerified = request.phoneNumberVerified;
            this.phoneRegion = request.phoneRegion;
            this.userId = request.userId;
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
         * <p>The custom extended fields.</p>
         */
        public Builder customFields(java.util.List<CustomFields> customFields) {
            this.putQueryParameter("CustomFields", customFields);
            this.customFields = customFields;
            return this;
        }

        /**
         * <p>The display name of the account. The display name can be up to 64 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>test_name</p>
         */
        public Builder displayName(String displayName) {
            this.putQueryParameter("DisplayName", displayName);
            this.displayName = displayName;
            return this;
        }

        /**
         * <p>The email address. The prefix of the email address can contain letters, digits, periods (.), underscores (_), and hyphens (-).</p>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:example@example.com">example@example.com</a></p>
         */
        public Builder email(String email) {
            this.putQueryParameter("Email", email);
            this.email = email;
            return this;
        }

        /**
         * <p>Specifies whether the email address is verified. This parameter must be specified if you specify Email. You can set this parameter to true if you have no special business requirements.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder emailVerified(Boolean emailVerified) {
            this.putQueryParameter("EmailVerified", emailVerified);
            this.emailVerified = emailVerified;
            return this;
        }

        /**
         * <p>The instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The mobile number. The mobile number must be 6 to 15 digits in length.</p>
         * 
         * <strong>example:</strong>
         * <p>156xxxxxxxxx</p>
         */
        public Builder phoneNumber(String phoneNumber) {
            this.putQueryParameter("PhoneNumber", phoneNumber);
            this.phoneNumber = phoneNumber;
            return this;
        }

        /**
         * <p>Specifies whether the mobile number is verified. This parameter must be specified if you specify PhoneNumber. You can set this parameter to true if you have no special business requirements.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder phoneNumberVerified(Boolean phoneNumberVerified) {
            this.putQueryParameter("PhoneNumberVerified", phoneNumberVerified);
            this.phoneNumberVerified = phoneNumberVerified;
            return this;
        }

        /**
         * <p>The area code of the mobile number. For example, the area code of a mobile number in the Chinese mainland is 86 without 00 or the plus sign (+). This parameter must be specified if you specify PhoneNumber.</p>
         * 
         * <strong>example:</strong>
         * <p>86</p>
         */
        public Builder phoneRegion(String phoneRegion) {
            this.putQueryParameter("PhoneRegion", phoneRegion);
            this.phoneRegion = phoneRegion;
            return this;
        }

        /**
         * <p>The account ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>user_d6sbsuumeta4h66ec3il7yxxxx</p>
         */
        public Builder userId(String userId) {
            this.putQueryParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        /**
         * <p>The name of the account. The name can be up to 64 characters in length. It can contain letters, digits, and the following special characters: _ . @ -</p>
         * 
         * <strong>example:</strong>
         * <p>username_test</p>
         */
        public Builder username(String username) {
            this.putQueryParameter("Username", username);
            this.username = username;
            return this;
        }

        @Override
        public UpdateUserRequest build() {
            return new UpdateUserRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateUserRequest} extends {@link TeaModel}
     *
     * <p>UpdateUserRequest</p>
     */
    public static class CustomFields extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FieldName")
        @com.aliyun.core.annotation.Validation(maxLength = 64)
        private String fieldName;

        @com.aliyun.core.annotation.NameInMap("FieldValue")
        @com.aliyun.core.annotation.Validation(maxLength = 64)
        private String fieldValue;

        @com.aliyun.core.annotation.NameInMap("Operation")
        @com.aliyun.core.annotation.Validation(maxLength = 64)
        private String operation;

        private CustomFields(Builder builder) {
            this.fieldName = builder.fieldName;
            this.fieldValue = builder.fieldValue;
            this.operation = builder.operation;
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

        /**
         * @return operation
         */
        public String getOperation() {
            return this.operation;
        }

        public static final class Builder {
            private String fieldName; 
            private String fieldValue; 
            private String operation; 

            /**
             * <p>The name of the extended field. You must create an extended field before you specify this parameter. To create an extended field, go to the Extended Fields page of the specified EIAM instance in the IDaaS console.</p>
             * 
             * <strong>example:</strong>
             * <p>nick_name</p>
             */
            public Builder fieldName(String fieldName) {
                this.fieldName = fieldName;
                return this;
            }

            /**
             * <p>The value of the extended field. The value follows the limits on the properties of the extended field.</p>
             * 
             * <strong>example:</strong>
             * <p>test_value</p>
             */
            public Builder fieldValue(String fieldValue) {
                this.fieldValue = fieldValue;
                return this;
            }

            /**
             * <p>The operation type of the extended field. Valid values:</p>
             * <ul>
             * <li>add: adds a value to the extended field of the account.</li>
             * <li>replace: replaces the existing value of the extended field of the account. If the existing value to be replaced does not exist, this operation changes to the add operation.</li>
             * <li>remove: removes a value from the extended field of the account.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>add</p>
             */
            public Builder operation(String operation) {
                this.operation = operation;
                return this;
            }

            public CustomFields build() {
                return new CustomFields(this);
            } 

        } 

    }
}
