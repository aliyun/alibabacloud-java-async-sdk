// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListSubAccountResponseBody} extends {@link TeaModel}
 *
 * <p>ListSubAccountResponseBody</p>
 */
public class ListSubAccountResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SubAccountList")
    private SubAccountList subAccountList;

    private ListSubAccountResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.subAccountList = builder.subAccountList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSubAccountResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return subAccountList
     */
    public SubAccountList getSubAccountList() {
        return this.subAccountList;
    }

    public static final class Builder {
        private Integer code; 
        private String message; 
        private String requestId; 
        private SubAccountList subAccountList; 

        /**
         * The HTTP status code that is returned.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * The additional information that is returned.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The RAM users.
         */
        public Builder subAccountList(SubAccountList subAccountList) {
            this.subAccountList = subAccountList;
            return this;
        }

        public ListSubAccountResponseBody build() {
            return new ListSubAccountResponseBody(this);
        } 

    } 

    public static class SubAccount extends TeaModel {
        @NameInMap("AdminEdasId")
        private String adminEdasId;

        @NameInMap("AdminUserId")
        private String adminUserId;

        @NameInMap("AdminUserKp")
        private String adminUserKp;

        @NameInMap("Email")
        private String email;

        @NameInMap("Phone")
        private String phone;

        @NameInMap("SubEdasId")
        private String subEdasId;

        @NameInMap("SubUserId")
        private String subUserId;

        @NameInMap("SubUserKp")
        private String subUserKp;

        private SubAccount(Builder builder) {
            this.adminEdasId = builder.adminEdasId;
            this.adminUserId = builder.adminUserId;
            this.adminUserKp = builder.adminUserKp;
            this.email = builder.email;
            this.phone = builder.phone;
            this.subEdasId = builder.subEdasId;
            this.subUserId = builder.subUserId;
            this.subUserKp = builder.subUserKp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SubAccount create() {
            return builder().build();
        }

        /**
         * @return adminEdasId
         */
        public String getAdminEdasId() {
            return this.adminEdasId;
        }

        /**
         * @return adminUserId
         */
        public String getAdminUserId() {
            return this.adminUserId;
        }

        /**
         * @return adminUserKp
         */
        public String getAdminUserKp() {
            return this.adminUserKp;
        }

        /**
         * @return email
         */
        public String getEmail() {
            return this.email;
        }

        /**
         * @return phone
         */
        public String getPhone() {
            return this.phone;
        }

        /**
         * @return subEdasId
         */
        public String getSubEdasId() {
            return this.subEdasId;
        }

        /**
         * @return subUserId
         */
        public String getSubUserId() {
            return this.subUserId;
        }

        /**
         * @return subUserKp
         */
        public String getSubUserKp() {
            return this.subUserKp;
        }

        public static final class Builder {
            private String adminEdasId; 
            private String adminUserId; 
            private String adminUserKp; 
            private String email; 
            private String phone; 
            private String subEdasId; 
            private String subUserId; 
            private String subUserKp; 

            /**
             * The ID of the Alibaba Cloud account. This ID is generated by EDAS.
             */
            public Builder adminEdasId(String adminEdasId) {
                this.adminEdasId = adminEdasId;
                return this;
            }

            /**
             * The ID of the Alibaba Cloud account.
             */
            public Builder adminUserId(String adminUserId) {
                this.adminUserId = adminUserId;
                return this;
            }

            /**
             * This parameter is the same as the AdminEdasId parameter. This parameter is deprecated.
             */
            public Builder adminUserKp(String adminUserKp) {
                this.adminUserKp = adminUserKp;
                return this;
            }

            /**
             * The email address of the RAM user.
             */
            public Builder email(String email) {
                this.email = email;
                return this;
            }

            /**
             * The contact information of the RAM user.
             */
            public Builder phone(String phone) {
                this.phone = phone;
                return this;
            }

            /**
             * The ID of the RAM user. This ID is generated by Enterprise Distributed Application Service (EDAS).
             */
            public Builder subEdasId(String subEdasId) {
                this.subEdasId = subEdasId;
                return this;
            }

            /**
             * The ID of the RAM user.
             */
            public Builder subUserId(String subUserId) {
                this.subUserId = subUserId;
                return this;
            }

            /**
             * This parameter is the same as the SubEdasId parameter. This parameter is deprecated.
             */
            public Builder subUserKp(String subUserKp) {
                this.subUserKp = subUserKp;
                return this;
            }

            public SubAccount build() {
                return new SubAccount(this);
            } 

        } 

    }
    public static class SubAccountList extends TeaModel {
        @NameInMap("SubAccount")
        private java.util.List < SubAccount> subAccount;

        private SubAccountList(Builder builder) {
            this.subAccount = builder.subAccount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SubAccountList create() {
            return builder().build();
        }

        /**
         * @return subAccount
         */
        public java.util.List < SubAccount> getSubAccount() {
            return this.subAccount;
        }

        public static final class Builder {
            private java.util.List < SubAccount> subAccount; 

            /**
             * SubAccount.
             */
            public Builder subAccount(java.util.List < SubAccount> subAccount) {
                this.subAccount = subAccount;
                return this;
            }

            public SubAccountList build() {
                return new SubAccountList(this);
            } 

        } 

    }
}
