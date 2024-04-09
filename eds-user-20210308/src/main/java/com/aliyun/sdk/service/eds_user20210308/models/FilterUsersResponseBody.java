// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_user20210308.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link FilterUsersResponseBody} extends {@link TeaModel}
 *
 * <p>FilterUsersResponseBody</p>
 */
public class FilterUsersResponseBody extends TeaModel {
    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Users")
    private java.util.List < Users> users;

    private FilterUsersResponseBody(Builder builder) {
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.users = builder.users;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static FilterUsersResponseBody create() {
        return builder().build();
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return users
     */
    public java.util.List < Users> getUsers() {
        return this.users;
    }

    public static final class Builder {
        private String nextToken; 
        private String requestId; 
        private java.util.List < Users> users; 

        /**
         * The pagination token that is used in the next request to retrieve a new page of results. If not all results are returned in a query, a value is returned for the NextToken parameter. In this case, you can use the returned NextToken value to start the next query.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The information about the convenience user.
         */
        public Builder users(java.util.List < Users> users) {
            this.users = users;
            return this;
        }

        public FilterUsersResponseBody build() {
            return new FilterUsersResponseBody(this);
        } 

    } 

    public static class ExternalInfo extends TeaModel {
        @NameInMap("ExternalName")
        private String externalName;

        @NameInMap("JobNumber")
        private String jobNumber;

        private ExternalInfo(Builder builder) {
            this.externalName = builder.externalName;
            this.jobNumber = builder.jobNumber;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ExternalInfo create() {
            return builder().build();
        }

        /**
         * @return externalName
         */
        public String getExternalName() {
            return this.externalName;
        }

        /**
         * @return jobNumber
         */
        public String getJobNumber() {
            return this.jobNumber;
        }

        public static final class Builder {
            private String externalName; 
            private String jobNumber; 

            /**
             * The account that is associated with the convenience user.
             */
            public Builder externalName(String externalName) {
                this.externalName = externalName;
                return this;
            }

            /**
             * The account, student ID, or employee ID that is associated with the convenience user.
             */
            public Builder jobNumber(String jobNumber) {
                this.jobNumber = jobNumber;
                return this;
            }

            public ExternalInfo build() {
                return new ExternalInfo(this);
            } 

        } 

    }
    public static class PropertyValues extends TeaModel {
        @NameInMap("PropertyValue")
        private String propertyValue;

        @NameInMap("PropertyValueId")
        private Long propertyValueId;

        private PropertyValues(Builder builder) {
            this.propertyValue = builder.propertyValue;
            this.propertyValueId = builder.propertyValueId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PropertyValues create() {
            return builder().build();
        }

        /**
         * @return propertyValue
         */
        public String getPropertyValue() {
            return this.propertyValue;
        }

        /**
         * @return propertyValueId
         */
        public Long getPropertyValueId() {
            return this.propertyValueId;
        }

        public static final class Builder {
            private String propertyValue; 
            private Long propertyValueId; 

            /**
             * The property value.
             */
            public Builder propertyValue(String propertyValue) {
                this.propertyValue = propertyValue;
                return this;
            }

            /**
             * The ID of the property value.
             */
            public Builder propertyValueId(Long propertyValueId) {
                this.propertyValueId = propertyValueId;
                return this;
            }

            public PropertyValues build() {
                return new PropertyValues(this);
            } 

        } 

    }
    public static class UserSetPropertiesModels extends TeaModel {
        @NameInMap("PropertyId")
        private Long propertyId;

        @NameInMap("PropertyKey")
        private String propertyKey;

        @NameInMap("PropertyType")
        private Integer propertyType;

        @NameInMap("PropertyValues")
        private java.util.List < PropertyValues> propertyValues;

        @NameInMap("UserId")
        private Long userId;

        @NameInMap("UserName")
        private String userName;

        private UserSetPropertiesModels(Builder builder) {
            this.propertyId = builder.propertyId;
            this.propertyKey = builder.propertyKey;
            this.propertyType = builder.propertyType;
            this.propertyValues = builder.propertyValues;
            this.userId = builder.userId;
            this.userName = builder.userName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UserSetPropertiesModels create() {
            return builder().build();
        }

        /**
         * @return propertyId
         */
        public Long getPropertyId() {
            return this.propertyId;
        }

        /**
         * @return propertyKey
         */
        public String getPropertyKey() {
            return this.propertyKey;
        }

        /**
         * @return propertyType
         */
        public Integer getPropertyType() {
            return this.propertyType;
        }

        /**
         * @return propertyValues
         */
        public java.util.List < PropertyValues> getPropertyValues() {
            return this.propertyValues;
        }

        /**
         * @return userId
         */
        public Long getUserId() {
            return this.userId;
        }

        /**
         * @return userName
         */
        public String getUserName() {
            return this.userName;
        }

        public static final class Builder {
            private Long propertyId; 
            private String propertyKey; 
            private Integer propertyType; 
            private java.util.List < PropertyValues> propertyValues; 
            private Long userId; 
            private String userName; 

            /**
             * The property ID.
             */
            public Builder propertyId(Long propertyId) {
                this.propertyId = propertyId;
                return this;
            }

            /**
             * The property name.
             */
            public Builder propertyKey(String propertyKey) {
                this.propertyKey = propertyKey;
                return this;
            }

            /**
             * The property type.
             */
            public Builder propertyType(Integer propertyType) {
                this.propertyType = propertyType;
                return this;
            }

            /**
             * The property values.
             */
            public Builder propertyValues(java.util.List < PropertyValues> propertyValues) {
                this.propertyValues = propertyValues;
                return this;
            }

            /**
             * The ID of the convenience user that is bound to the property.
             */
            public Builder userId(Long userId) {
                this.userId = userId;
                return this;
            }

            /**
             * The username of the convenience user that is bound to the property.
             */
            public Builder userName(String userName) {
                this.userName = userName;
                return this;
            }

            public UserSetPropertiesModels build() {
                return new UserSetPropertiesModels(this);
            } 

        } 

    }
    public static class Users extends TeaModel {
        @NameInMap("AutoLockTime")
        private String autoLockTime;

        @NameInMap("DesktopCount")
        private Long desktopCount;

        @NameInMap("DesktopGroupCount")
        private Long desktopGroupCount;

        @NameInMap("Email")
        private String email;

        @NameInMap("EnableAdminAccess")
        private Boolean enableAdminAccess;

        @NameInMap("EndUserId")
        private String endUserId;

        @NameInMap("ExternalInfo")
        private ExternalInfo externalInfo;

        @NameInMap("Id")
        private Long id;

        @NameInMap("IsTenantManager")
        private Boolean isTenantManager;

        @NameInMap("OwnerType")
        private String ownerType;

        @NameInMap("PasswordExpireDays")
        private Integer passwordExpireDays;

        @NameInMap("PasswordExpireRestDays")
        private Integer passwordExpireRestDays;

        @NameInMap("Phone")
        private String phone;

        @NameInMap("RealNickName")
        private String realNickName;

        @NameInMap("Remark")
        private String remark;

        @NameInMap("Status")
        private Long status;

        @NameInMap("UserSetPropertiesModels")
        private java.util.List < UserSetPropertiesModels> userSetPropertiesModels;

        private Users(Builder builder) {
            this.autoLockTime = builder.autoLockTime;
            this.desktopCount = builder.desktopCount;
            this.desktopGroupCount = builder.desktopGroupCount;
            this.email = builder.email;
            this.enableAdminAccess = builder.enableAdminAccess;
            this.endUserId = builder.endUserId;
            this.externalInfo = builder.externalInfo;
            this.id = builder.id;
            this.isTenantManager = builder.isTenantManager;
            this.ownerType = builder.ownerType;
            this.passwordExpireDays = builder.passwordExpireDays;
            this.passwordExpireRestDays = builder.passwordExpireRestDays;
            this.phone = builder.phone;
            this.realNickName = builder.realNickName;
            this.remark = builder.remark;
            this.status = builder.status;
            this.userSetPropertiesModels = builder.userSetPropertiesModels;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Users create() {
            return builder().build();
        }

        /**
         * @return autoLockTime
         */
        public String getAutoLockTime() {
            return this.autoLockTime;
        }

        /**
         * @return desktopCount
         */
        public Long getDesktopCount() {
            return this.desktopCount;
        }

        /**
         * @return desktopGroupCount
         */
        public Long getDesktopGroupCount() {
            return this.desktopGroupCount;
        }

        /**
         * @return email
         */
        public String getEmail() {
            return this.email;
        }

        /**
         * @return enableAdminAccess
         */
        public Boolean getEnableAdminAccess() {
            return this.enableAdminAccess;
        }

        /**
         * @return endUserId
         */
        public String getEndUserId() {
            return this.endUserId;
        }

        /**
         * @return externalInfo
         */
        public ExternalInfo getExternalInfo() {
            return this.externalInfo;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return isTenantManager
         */
        public Boolean getIsTenantManager() {
            return this.isTenantManager;
        }

        /**
         * @return ownerType
         */
        public String getOwnerType() {
            return this.ownerType;
        }

        /**
         * @return passwordExpireDays
         */
        public Integer getPasswordExpireDays() {
            return this.passwordExpireDays;
        }

        /**
         * @return passwordExpireRestDays
         */
        public Integer getPasswordExpireRestDays() {
            return this.passwordExpireRestDays;
        }

        /**
         * @return phone
         */
        public String getPhone() {
            return this.phone;
        }

        /**
         * @return realNickName
         */
        public String getRealNickName() {
            return this.realNickName;
        }

        /**
         * @return remark
         */
        public String getRemark() {
            return this.remark;
        }

        /**
         * @return status
         */
        public Long getStatus() {
            return this.status;
        }

        /**
         * @return userSetPropertiesModels
         */
        public java.util.List < UserSetPropertiesModels> getUserSetPropertiesModels() {
            return this.userSetPropertiesModels;
        }

        public static final class Builder {
            private String autoLockTime; 
            private Long desktopCount; 
            private Long desktopGroupCount; 
            private String email; 
            private Boolean enableAdminAccess; 
            private String endUserId; 
            private ExternalInfo externalInfo; 
            private Long id; 
            private Boolean isTenantManager; 
            private String ownerType; 
            private Integer passwordExpireDays; 
            private Integer passwordExpireRestDays; 
            private String phone; 
            private String realNickName; 
            private String remark; 
            private Long status; 
            private java.util.List < UserSetPropertiesModels> userSetPropertiesModels; 

            /**
             * AutoLockTime.
             */
            public Builder autoLockTime(String autoLockTime) {
                this.autoLockTime = autoLockTime;
                return this;
            }

            /**
             * The number of cloud desktops that are assigned to the convenience user.
             */
            public Builder desktopCount(Long desktopCount) {
                this.desktopCount = desktopCount;
                return this;
            }

            /**
             * The number of cloud desktop pools that are assigned to the convenience user. This value is returned if you set `IncludeDesktopGroupCount` to `true`.
             */
            public Builder desktopGroupCount(Long desktopGroupCount) {
                this.desktopGroupCount = desktopGroupCount;
                return this;
            }

            /**
             * The email address of the convenience user.
             */
            public Builder email(String email) {
                this.email = email;
                return this;
            }

            /**
             * Indicates whether the convenience user is a local administrator.
             * <p>
             * 
             * Valid values:
             * 
             * *   true
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             * *   false
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             */
            public Builder enableAdminAccess(Boolean enableAdminAccess) {
                this.enableAdminAccess = enableAdminAccess;
                return this;
            }

            /**
             * The username of the convenience user.
             */
            public Builder endUserId(String endUserId) {
                this.endUserId = endUserId;
                return this;
            }

            /**
             * The additional information about the convenience user.
             */
            public Builder externalInfo(ExternalInfo externalInfo) {
                this.externalInfo = externalInfo;
                return this;
            }

            /**
             * The ID of the convenience user.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * Indicates whether the convenience user is a tenant administrator.
             * <p>
             * 
             * Valid values:
             * 
             * *   true
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             * *   false
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             */
            public Builder isTenantManager(Boolean isTenantManager) {
                this.isTenantManager = isTenantManager;
                return this;
            }

            /**
             * The type of the account ownership.
             * <p>
             * 
             * Valid values:
             * 
             * *   CreateFromManager: administrator-activated
             * *   Normal: user-activated
             */
            public Builder ownerType(String ownerType) {
                this.ownerType = ownerType;
                return this;
            }

            /**
             * PasswordExpireDays.
             */
            public Builder passwordExpireDays(Integer passwordExpireDays) {
                this.passwordExpireDays = passwordExpireDays;
                return this;
            }

            /**
             * PasswordExpireRestDays.
             */
            public Builder passwordExpireRestDays(Integer passwordExpireRestDays) {
                this.passwordExpireRestDays = passwordExpireRestDays;
                return this;
            }

            /**
             * The mobile number of the convenience user.
             */
            public Builder phone(String phone) {
                this.phone = phone;
                return this;
            }

            /**
             * The nickname of the convenience user.
             */
            public Builder realNickName(String realNickName) {
                this.realNickName = realNickName;
                return this;
            }

            /**
             * The remarks on the convenience user.
             */
            public Builder remark(String remark) {
                this.remark = remark;
                return this;
            }

            /**
             * The status of the convenience user.
             * <p>
             * 
             * Valid values:
             * 
             * *   0: The convenience user is normal.
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             * *   9: The convenience user is locked.
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             */
            public Builder status(Long status) {
                this.status = status;
                return this;
            }

            /**
             * The information about the properties.
             */
            public Builder userSetPropertiesModels(java.util.List < UserSetPropertiesModels> userSetPropertiesModels) {
                this.userSetPropertiesModels = userSetPropertiesModels;
                return this;
            }

            public Users build() {
                return new Users(this);
            } 

        } 

    }
}
