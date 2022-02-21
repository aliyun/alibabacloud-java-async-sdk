// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyTenantUserStatusResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyTenantUserStatusResponseBody</p>
 */
public class ModifyTenantUserStatusResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TenantUser")
    private java.util.List < TenantUser> tenantUser;

    private ModifyTenantUserStatusResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.tenantUser = builder.tenantUser;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyTenantUserStatusResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return tenantUser
     */
    public java.util.List < TenantUser> getTenantUser() {
        return this.tenantUser;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < TenantUser> tenantUser; 

        /**
         * 请求ID
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * 租户中的数据库账号信息
         */
        public Builder tenantUser(java.util.List < TenantUser> tenantUser) {
            this.tenantUser = tenantUser;
            return this;
        }

        public ModifyTenantUserStatusResponseBody build() {
            return new ModifyTenantUserStatusResponseBody(this);
        } 

    } 

    public static class TenantUser extends TeaModel {
        @NameInMap("TenantId")
        private String tenantId;

        @NameInMap("UserName")
        private String userName;

        @NameInMap("UserStatus")
        private String userStatus;

        private TenantUser(Builder builder) {
            this.tenantId = builder.tenantId;
            this.userName = builder.userName;
            this.userStatus = builder.userStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TenantUser create() {
            return builder().build();
        }

        /**
         * @return tenantId
         */
        public String getTenantId() {
            return this.tenantId;
        }

        /**
         * @return userName
         */
        public String getUserName() {
            return this.userName;
        }

        /**
         * @return userStatus
         */
        public String getUserStatus() {
            return this.userStatus;
        }

        public static final class Builder {
            private String tenantId; 
            private String userName; 
            private String userStatus; 

            /**
             * 租户ID。
             */
            public Builder tenantId(String tenantId) {
                this.tenantId = tenantId;
                return this;
            }

            /**
             * 账号名称。
             */
            public Builder userName(String userName) {
                this.userName = userName;
                return this;
            }

            /**
             * 数据库账号的状态。 - LOCKED：锁定 - ONLINE：解锁
             */
            public Builder userStatus(String userStatus) {
                this.userStatus = userStatus;
                return this;
            }

            public TenantUser build() {
                return new TenantUser(this);
            } 

        } 

    }
}
