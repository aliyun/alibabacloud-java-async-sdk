// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam_developerapi20220225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.eiam.dev.models.*;

/**
 * {@link PatchUserRequest} extends {@link RequestModel}
 *
 * <p>PatchUserRequest</p>
 */
public class PatchUserRequest extends Request {
    @Host
    @NameInMap("regionId")
    private String regionId;

    @Path
    @NameInMap("instanceId")
    @Validation(required = true)
    private String instanceId;

    @Path
    @NameInMap("applicationId")
    @Validation(required = true)
    private String applicationId;

    @Path
    @NameInMap("userId")
    @Validation(required = true)
    private String userId;

    @Header
    @NameInMap("Authorization")
    @Validation(required = true)
    private String authorization;

    @Body
    @NameInMap("customFields")
    private java.util.List < CustomFields> customFields;

    @Body
    @NameInMap("displayName")
    private String displayName;

    @Body
    @NameInMap("email")
    private String email;

    @Body
    @NameInMap("emailVerified")
    private Boolean emailVerified;

    @Body
    @NameInMap("phoneNumber")
    private String phoneNumber;

    @Body
    @NameInMap("phoneNumberVerified")
    private Boolean phoneNumberVerified;

    @Body
    @NameInMap("phoneRegion")
    private String phoneRegion;

    @Body
    @NameInMap("username")
    private String username;

    private PatchUserRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.instanceId = builder.instanceId;
        this.applicationId = builder.applicationId;
        this.userId = builder.userId;
        this.authorization = builder.authorization;
        this.customFields = builder.customFields;
        this.displayName = builder.displayName;
        this.email = builder.email;
        this.emailVerified = builder.emailVerified;
        this.phoneNumber = builder.phoneNumber;
        this.phoneNumberVerified = builder.phoneNumberVerified;
        this.phoneRegion = builder.phoneRegion;
        this.username = builder.username;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PatchUserRequest create() {
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
     * @return userId
     */
    public String getUserId() {
        return this.userId;
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
     * @return username
     */
    public String getUsername() {
        return this.username;
    }

    public static final class Builder extends Request.Builder<PatchUserRequest, Builder> {
        private String regionId; 
        private String instanceId; 
        private String applicationId; 
        private String userId; 
        private String authorization; 
        private java.util.List < CustomFields> customFields; 
        private String displayName; 
        private String email; 
        private Boolean emailVerified; 
        private String phoneNumber; 
        private Boolean phoneNumberVerified; 
        private String phoneRegion; 
        private String username; 

        private Builder() {
            super();
        } 

        private Builder(PatchUserRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.instanceId = request.instanceId;
            this.applicationId = request.applicationId;
            this.userId = request.userId;
            this.authorization = request.authorization;
            this.customFields = request.customFields;
            this.displayName = request.displayName;
            this.email = request.email;
            this.emailVerified = request.emailVerified;
            this.phoneNumber = request.phoneNumber;
            this.phoneNumberVerified = request.phoneNumberVerified;
            this.phoneRegion = request.phoneRegion;
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
         * 实例ID。
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * 应用ID。
         */
        public Builder applicationId(String applicationId) {
            this.putPathParameter("applicationId", applicationId);
            this.applicationId = applicationId;
            return this;
        }

        /**
         * 账户ID
         */
        public Builder userId(String userId) {
            this.putPathParameter("userId", userId);
            this.userId = userId;
            return this;
        }

        /**
         * 认证信息。
         * <p>
         * 格式:Bearer ${access_token}。
         * 示例：Bearer ATxxxx。
         */
        public Builder authorization(String authorization) {
            this.putHeaderParameter("Authorization", authorization);
            this.authorization = authorization;
            return this;
        }

        /**
         * 扩展字段列表
         */
        public Builder customFields(java.util.List < CustomFields> customFields) {
            this.putBodyParameter("customFields", customFields);
            this.customFields = customFields;
            return this;
        }

        /**
         * 账户展示名
         */
        public Builder displayName(String displayName) {
            this.putBodyParameter("displayName", displayName);
            this.displayName = displayName;
            return this;
        }

        /**
         * 邮箱
         */
        public Builder email(String email) {
            this.putBodyParameter("email", email);
            this.email = email;
            return this;
        }

        /**
         * 邮箱是否验证，邮箱若设置此字段必须设置，无特殊业务可直接设置为true
         */
        public Builder emailVerified(Boolean emailVerified) {
            this.putBodyParameter("emailVerified", emailVerified);
            this.emailVerified = emailVerified;
            return this;
        }

        /**
         * 手机号
         */
        public Builder phoneNumber(String phoneNumber) {
            this.putBodyParameter("phoneNumber", phoneNumber);
            this.phoneNumber = phoneNumber;
            return this;
        }

        /**
         * 手机号是否验证，手机号若设置此字段必须设置，无特殊业务可直接设置为true
         */
        public Builder phoneNumberVerified(Boolean phoneNumberVerified) {
            this.putBodyParameter("phoneNumberVerified", phoneNumberVerified);
            this.phoneNumberVerified = phoneNumberVerified;
            return this;
        }

        /**
         * 手机地区编号,示例：中国大陆手区号为86，不带 00 或 +, 手机号若设置，此参数必填
         */
        public Builder phoneRegion(String phoneRegion) {
            this.putBodyParameter("phoneRegion", phoneRegion);
            this.phoneRegion = phoneRegion;
            return this;
        }

        /**
         * 账户名
         */
        public Builder username(String username) {
            this.putBodyParameter("username", username);
            this.username = username;
            return this;
        }

        @Override
        public PatchUserRequest build() {
            return new PatchUserRequest(this);
        } 

    } 

    public static class CustomFields extends TeaModel {
        @NameInMap("fieldName")
        private String fieldName;

        @NameInMap("fieldValue")
        private String fieldValue;

        @NameInMap("operation")
        private String operation;

        @NameInMap("operator")
        @Deprecated
        private String operator;

        private CustomFields(Builder builder) {
            this.fieldName = builder.fieldName;
            this.fieldValue = builder.fieldValue;
            this.operation = builder.operation;
            this.operator = builder.operator;
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

        /**
         * @return operator
         */
        public String getOperator() {
            return this.operator;
        }

        public static final class Builder {
            private String fieldName; 
            private String fieldValue; 
            private String operation; 
            private String operator; 

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
             * 字段操作类型，取值可选范围：
             * <p>
             * - add：添加。
             * - replace：替换。若对应扩展字段无设置值，会转换为add操作。
             * - remove：移除。
             */
            public Builder operation(String operation) {
                this.operation = operation;
                return this;
            }

            /**
             * operator.
             */
            public Builder operator(String operator) {
                this.operator = operator;
                return this;
            }

            public CustomFields build() {
                return new CustomFields(this);
            } 

        } 

    }
}
