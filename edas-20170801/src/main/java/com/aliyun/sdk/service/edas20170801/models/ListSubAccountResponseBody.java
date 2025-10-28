// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

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
 * {@link ListSubAccountResponseBody} extends {@link TeaModel}
 *
 * <p>ListSubAccountResponseBody</p>
 */
public class ListSubAccountResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SubAccountList")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(ListSubAccountResponseBody model) {
            this.code = model.code;
            this.message = model.message;
            this.requestId = model.requestId;
            this.subAccountList = model.subAccountList;
        } 

        /**
         * <p>The HTTP status code that is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The additional information that is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>message</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>57609587-DFA2-41EC-<strong><strong>-</strong></strong>*****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The RAM users.</p>
         */
        public Builder subAccountList(SubAccountList subAccountList) {
            this.subAccountList = subAccountList;
            return this;
        }

        public ListSubAccountResponseBody build() {
            return new ListSubAccountResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListSubAccountResponseBody} extends {@link TeaModel}
     *
     * <p>ListSubAccountResponseBody</p>
     */
    public static class SubAccount extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AdminEdasId")
        private String adminEdasId;

        @com.aliyun.core.annotation.NameInMap("AdminUserId")
        private String adminUserId;

        @com.aliyun.core.annotation.NameInMap("AdminUserKp")
        private String adminUserKp;

        @com.aliyun.core.annotation.NameInMap("Email")
        private String email;

        @com.aliyun.core.annotation.NameInMap("Phone")
        private String phone;

        @com.aliyun.core.annotation.NameInMap("SubEdasId")
        private String subEdasId;

        @com.aliyun.core.annotation.NameInMap("SubUserId")
        private String subUserId;

        @com.aliyun.core.annotation.NameInMap("SubUserKp")
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

            private Builder() {
            } 

            private Builder(SubAccount model) {
                this.adminEdasId = model.adminEdasId;
                this.adminUserId = model.adminUserId;
                this.adminUserKp = model.adminUserKp;
                this.email = model.email;
                this.phone = model.phone;
                this.subEdasId = model.subEdasId;
                this.subUserId = model.subUserId;
                this.subUserKp = model.subUserKp;
            } 

            /**
             * <p>The ID of the Alibaba Cloud account. This ID is generated by EDAS.</p>
             * 
             * <strong>example:</strong>
             * <p>12456889****</p>
             */
            public Builder adminEdasId(String adminEdasId) {
                this.adminEdasId = adminEdasId;
                return this;
            }

            /**
             * <p>The ID of the Alibaba Cloud account.</p>
             * 
             * <strong>example:</strong>
             * <p>test@13624697***</p>
             */
            public Builder adminUserId(String adminUserId) {
                this.adminUserId = adminUserId;
                return this;
            }

            /**
             * <p>This parameter is the same as the AdminEdasId parameter. This parameter is deprecated.</p>
             * 
             * <strong>example:</strong>
             * <p>12456889****</p>
             */
            public Builder adminUserKp(String adminUserKp) {
                this.adminUserKp = adminUserKp;
                return this;
            }

            /**
             * <p>The email address of the RAM user.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="mailto:email@aliyun.com">email@aliyun.com</a></p>
             */
            public Builder email(String email) {
                this.email = email;
                return this;
            }

            /**
             * <p>The contact information of the RAM user.</p>
             * 
             * <strong>example:</strong>
             * <p>1373322****</p>
             */
            public Builder phone(String phone) {
                this.phone = phone;
                return this;
            }

            /**
             * <p>The ID of the RAM user. This ID is generated by Enterprise Distributed Application Service (EDAS).</p>
             * 
             * <strong>example:</strong>
             * <p>28382009411268****</p>
             */
            public Builder subEdasId(String subEdasId) {
                this.subEdasId = subEdasId;
                return this;
            }

            /**
             * <p>The ID of the RAM user.</p>
             * 
             * <strong>example:</strong>
             * <p>ram1@117274586608****</p>
             */
            public Builder subUserId(String subUserId) {
                this.subUserId = subUserId;
                return this;
            }

            /**
             * <p>This parameter is the same as the SubEdasId parameter. This parameter is deprecated.</p>
             * 
             * <strong>example:</strong>
             * <p>28382009411268****</p>
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
    /**
     * 
     * {@link ListSubAccountResponseBody} extends {@link TeaModel}
     *
     * <p>ListSubAccountResponseBody</p>
     */
    public static class SubAccountList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SubAccount")
        private java.util.List<SubAccount> subAccount;

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
        public java.util.List<SubAccount> getSubAccount() {
            return this.subAccount;
        }

        public static final class Builder {
            private java.util.List<SubAccount> subAccount; 

            private Builder() {
            } 

            private Builder(SubAccountList model) {
                this.subAccount = model.subAccount;
            } 

            /**
             * SubAccount.
             */
            public Builder subAccount(java.util.List<SubAccount> subAccount) {
                this.subAccount = subAccount;
                return this;
            }

            public SubAccountList build() {
                return new SubAccountList(this);
            } 

        } 

    }
}
