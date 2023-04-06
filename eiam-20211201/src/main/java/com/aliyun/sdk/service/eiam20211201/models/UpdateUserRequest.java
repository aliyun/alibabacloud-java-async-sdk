// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateUserRequest} extends {@link RequestModel}
 *
 * <p>UpdateUserRequest</p>
 */
public class UpdateUserRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("CustomFields")
    private java.util.List < CustomFields> customFields;

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
    @NameInMap("UserId")
    @Validation(required = true, maxLength = 64)
    private String userId;

    @Query
    @NameInMap("Username")
    @Validation(maxLength = 64)
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
    public java.util.List < CustomFields> getCustomFields() {
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
        private java.util.List < CustomFields> customFields; 
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
         * 扩展字段列表
         */
        public Builder customFields(java.util.List < CustomFields> customFields) {
            this.putQueryParameter("CustomFields", customFields);
            this.customFields = customFields;
            return this;
        }

        /**
         * 账户展示名
         */
        public Builder displayName(String displayName) {
            this.putQueryParameter("DisplayName", displayName);
            this.displayName = displayName;
            return this;
        }

        /**
         * 邮箱
         */
        public Builder email(String email) {
            this.putQueryParameter("Email", email);
            this.email = email;
            return this;
        }

        /**
         * 邮箱是否验证，邮箱若设置此字段必须设置，无特殊业务可直接设置为true
         */
        public Builder emailVerified(Boolean emailVerified) {
            this.putQueryParameter("EmailVerified", emailVerified);
            this.emailVerified = emailVerified;
            return this;
        }

        /**
         * IDaaS EIAM实例的ID。
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * 手机号
         */
        public Builder phoneNumber(String phoneNumber) {
            this.putQueryParameter("PhoneNumber", phoneNumber);
            this.phoneNumber = phoneNumber;
            return this;
        }

        /**
         * 手机号是否验证，手机号若设置此字段必须设置，无特殊业务可直接设置为true
         */
        public Builder phoneNumberVerified(Boolean phoneNumberVerified) {
            this.putQueryParameter("PhoneNumberVerified", phoneNumberVerified);
            this.phoneNumberVerified = phoneNumberVerified;
            return this;
        }

        /**
         * 手机地区编号,示例：中国大陆手区号为86，不带 00 或 +, 手机号若设置，此参数必填
         */
        public Builder phoneRegion(String phoneRegion) {
            this.putQueryParameter("PhoneRegion", phoneRegion);
            this.phoneRegion = phoneRegion;
            return this;
        }

        /**
         * 账户ID
         */
        public Builder userId(String userId) {
            this.putQueryParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        /**
         * 账户名。
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

    public static class CustomFields extends TeaModel {
        @NameInMap("FieldName")
        @Validation(maxLength = 64)
        private String fieldName;

        @NameInMap("FieldValue")
        @Validation(maxLength = 64)
        private String fieldValue;

        @NameInMap("Operation")
        @Validation(maxLength = 64)
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
             * 扩展字段标识
             */
            public Builder fieldName(String fieldName) {
                this.fieldName = fieldName;
                return this;
            }

            /**
             * 扩展字段值
             */
            public Builder fieldValue(String fieldValue) {
                this.fieldValue = fieldValue;
                return this;
            }

            /**
             * 扩展字段操作类型，枚举值，add（新增),replace（更新),remove(移除)
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
