// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam_developerapi20220225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.eiam.dev.models.*;

/**
 * {@link GetUserResponseBody} extends {@link TeaModel}
 *
 * <p>GetUserResponseBody</p>
 */
public class GetUserResponseBody extends TeaModel {
    @NameInMap("accountExpireTime")
    private Long accountExpireTime;

    @NameInMap("createTime")
    private Long createTime;

    @NameInMap("description")
    private String description;

    @NameInMap("displayName")
    private String displayName;

    @NameInMap("email")
    private String email;

    @NameInMap("emailVerified")
    private Boolean emailVerified;

    @NameInMap("instanceId")
    private String instanceId;

    @NameInMap("lockExpireTime")
    private Long lockExpireTime;

    @NameInMap("organizationalUnits")
    private java.util.List < OrganizationalUnits> organizationalUnits;

    @NameInMap("passwordSet")
    private Boolean passwordSet;

    @NameInMap("phoneNumber")
    private String phoneNumber;

    @NameInMap("phoneNumberVerified")
    private Boolean phoneNumberVerified;

    @NameInMap("phoneRegion")
    private String phoneRegion;

    @NameInMap("primaryOrganizationalUnitId")
    private String primaryOrganizationalUnitId;

    @NameInMap("registerTime")
    private Long registerTime;

    @NameInMap("status")
    private String status;

    @NameInMap("updateTime")
    private Long updateTime;

    @NameInMap("userExternalId")
    private String userExternalId;

    @NameInMap("userId")
    private String userId;

    @NameInMap("userSourceId")
    private String userSourceId;

    @NameInMap("userSourceType")
    private String userSourceType;

    @NameInMap("username")
    private String username;

    private GetUserResponseBody(Builder builder) {
        this.accountExpireTime = builder.accountExpireTime;
        this.createTime = builder.createTime;
        this.description = builder.description;
        this.displayName = builder.displayName;
        this.email = builder.email;
        this.emailVerified = builder.emailVerified;
        this.instanceId = builder.instanceId;
        this.lockExpireTime = builder.lockExpireTime;
        this.organizationalUnits = builder.organizationalUnits;
        this.passwordSet = builder.passwordSet;
        this.phoneNumber = builder.phoneNumber;
        this.phoneNumberVerified = builder.phoneNumberVerified;
        this.phoneRegion = builder.phoneRegion;
        this.primaryOrganizationalUnitId = builder.primaryOrganizationalUnitId;
        this.registerTime = builder.registerTime;
        this.status = builder.status;
        this.updateTime = builder.updateTime;
        this.userExternalId = builder.userExternalId;
        this.userId = builder.userId;
        this.userSourceId = builder.userSourceId;
        this.userSourceType = builder.userSourceType;
        this.username = builder.username;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetUserResponseBody create() {
        return builder().build();
    }

    /**
     * @return accountExpireTime
     */
    public Long getAccountExpireTime() {
        return this.accountExpireTime;
    }

    /**
     * @return createTime
     */
    public Long getCreateTime() {
        return this.createTime;
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
     * @return lockExpireTime
     */
    public Long getLockExpireTime() {
        return this.lockExpireTime;
    }

    /**
     * @return organizationalUnits
     */
    public java.util.List < OrganizationalUnits> getOrganizationalUnits() {
        return this.organizationalUnits;
    }

    /**
     * @return passwordSet
     */
    public Boolean getPasswordSet() {
        return this.passwordSet;
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
     * @return registerTime
     */
    public Long getRegisterTime() {
        return this.registerTime;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return updateTime
     */
    public Long getUpdateTime() {
        return this.updateTime;
    }

    /**
     * @return userExternalId
     */
    public String getUserExternalId() {
        return this.userExternalId;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    /**
     * @return userSourceId
     */
    public String getUserSourceId() {
        return this.userSourceId;
    }

    /**
     * @return userSourceType
     */
    public String getUserSourceType() {
        return this.userSourceType;
    }

    /**
     * @return username
     */
    public String getUsername() {
        return this.username;
    }

    public static final class Builder {
        private Long accountExpireTime; 
        private Long createTime; 
        private String description; 
        private String displayName; 
        private String email; 
        private Boolean emailVerified; 
        private String instanceId; 
        private Long lockExpireTime; 
        private java.util.List < OrganizationalUnits> organizationalUnits; 
        private Boolean passwordSet; 
        private String phoneNumber; 
        private Boolean phoneNumberVerified; 
        private String phoneRegion; 
        private String primaryOrganizationalUnitId; 
        private Long registerTime; 
        private String status; 
        private Long updateTime; 
        private String userExternalId; 
        private String userId; 
        private String userSourceId; 
        private String userSourceType; 
        private String username; 

        /**
         * ??????????????????, ????????????
         */
        public Builder accountExpireTime(Long accountExpireTime) {
            this.accountExpireTime = accountExpireTime;
            return this;
        }

        /**
         * ????????????, ????????????
         */
        public Builder createTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * ????????????
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * ?????????
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            return this;
        }

        /**
         * ??????
         */
        public Builder email(String email) {
            this.email = email;
            return this;
        }

        /**
         * ??????????????????
         */
        public Builder emailVerified(Boolean emailVerified) {
            this.emailVerified = emailVerified;
            return this;
        }

        /**
         * ??????ID
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * ??????????????????, ????????????
         */
        public Builder lockExpireTime(Long lockExpireTime) {
            this.lockExpireTime = lockExpireTime;
            return this;
        }

        /**
         * ????????????????????????
         */
        public Builder organizationalUnits(java.util.List < OrganizationalUnits> organizationalUnits) {
            this.organizationalUnits = organizationalUnits;
            return this;
        }

        /**
         * ?????????????????????
         */
        public Builder passwordSet(Boolean passwordSet) {
            this.passwordSet = passwordSet;
            return this;
        }

        /**
         * ?????????
         */
        public Builder phoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        /**
         * ?????????????????????
         */
        public Builder phoneNumberVerified(Boolean phoneNumberVerified) {
            this.phoneNumberVerified = phoneNumberVerified;
            return this;
        }

        /**
         * ??????????????????,?????????????????????????????????86????????? 00 ??? +
         */
        public Builder phoneRegion(String phoneRegion) {
            this.phoneRegion = phoneRegion;
            return this;
        }

        /**
         * ???????????????ID
         */
        public Builder primaryOrganizationalUnitId(String primaryOrganizationalUnitId) {
            this.primaryOrganizationalUnitId = primaryOrganizationalUnitId;
            return this;
        }

        /**
         * registerTime.
         */
        public Builder registerTime(Long registerTime) {
            this.registerTime = registerTime;
            return this;
        }

        /**
         * ????????????, enabled:??????,disabled:??????
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * ????????????????????????, ????????????
         */
        public Builder updateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        /**
         * ??????ID
         */
        public Builder userExternalId(String userExternalId) {
            this.userExternalId = userExternalId;
            return this;
        }

        /**
         * ??????ID
         */
        public Builder userId(String userId) {
            this.userId = userId;
            return this;
        }

        /**
         * ??????ID
         */
        public Builder userSourceId(String userSourceId) {
            this.userSourceId = userSourceId;
            return this;
        }

        /**
         * ???????????????build_in[??????],ding_talk[????????????],ad[AD??????],ldap[LDAP??????]
         */
        public Builder userSourceType(String userSourceType) {
            this.userSourceType = userSourceType;
            return this;
        }

        /**
         * ?????????
         */
        public Builder username(String username) {
            this.username = username;
            return this;
        }

        public GetUserResponseBody build() {
            return new GetUserResponseBody(this);
        } 

    } 

    public static class OrganizationalUnits extends TeaModel {
        @NameInMap("organizationalUnitId")
        private String organizationalUnitId;

        @NameInMap("organizationalUnitName")
        private String organizationalUnitName;

        @NameInMap("primary")
        private Boolean primary;

        private OrganizationalUnits(Builder builder) {
            this.organizationalUnitId = builder.organizationalUnitId;
            this.organizationalUnitName = builder.organizationalUnitName;
            this.primary = builder.primary;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OrganizationalUnits create() {
            return builder().build();
        }

        /**
         * @return organizationalUnitId
         */
        public String getOrganizationalUnitId() {
            return this.organizationalUnitId;
        }

        /**
         * @return organizationalUnitName
         */
        public String getOrganizationalUnitName() {
            return this.organizationalUnitName;
        }

        /**
         * @return primary
         */
        public Boolean getPrimary() {
            return this.primary;
        }

        public static final class Builder {
            private String organizationalUnitId; 
            private String organizationalUnitName; 
            private Boolean primary; 

            /**
             * ??????ID
             */
            public Builder organizationalUnitId(String organizationalUnitId) {
                this.organizationalUnitId = organizationalUnitId;
                return this;
            }

            /**
             * ????????????
             */
            public Builder organizationalUnitName(String organizationalUnitName) {
                this.organizationalUnitName = organizationalUnitName;
                return this;
            }

            /**
             * ???????????????
             */
            public Builder primary(Boolean primary) {
                this.primary = primary;
                return this;
            }

            public OrganizationalUnits build() {
                return new OrganizationalUnits(this);
            } 

        } 

    }
}
