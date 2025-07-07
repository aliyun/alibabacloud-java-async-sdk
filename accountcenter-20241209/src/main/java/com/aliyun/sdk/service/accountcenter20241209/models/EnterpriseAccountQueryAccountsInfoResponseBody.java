// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.accountcenter20241209.models;

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
 * {@link EnterpriseAccountQueryAccountsInfoResponseBody} extends {@link TeaModel}
 *
 * <p>EnterpriseAccountQueryAccountsInfoResponseBody</p>
 */
public class EnterpriseAccountQueryAccountsInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccountInfoDtoList")
    private java.util.List<AccountInfoDtoList> accountInfoDtoList;

    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private EnterpriseAccountQueryAccountsInfoResponseBody(Builder builder) {
        this.accountInfoDtoList = builder.accountInfoDtoList;
        this.code = builder.code;
        this.maxResults = builder.maxResults;
        this.message = builder.message;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EnterpriseAccountQueryAccountsInfoResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accountInfoDtoList
     */
    public java.util.List<AccountInfoDtoList> getAccountInfoDtoList() {
        return this.accountInfoDtoList;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
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
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private java.util.List<AccountInfoDtoList> accountInfoDtoList; 
        private String code; 
        private Integer maxResults; 
        private String message; 
        private String nextToken; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(EnterpriseAccountQueryAccountsInfoResponseBody model) {
            this.accountInfoDtoList = model.accountInfoDtoList;
            this.code = model.code;
            this.maxResults = model.maxResults;
            this.message = model.message;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * AccountInfoDtoList.
         */
        public Builder accountInfoDtoList(java.util.List<AccountInfoDtoList> accountInfoDtoList) {
            this.accountInfoDtoList = accountInfoDtoList;
            return this;
        }

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public EnterpriseAccountQueryAccountsInfoResponseBody build() {
            return new EnterpriseAccountQueryAccountsInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link EnterpriseAccountQueryAccountsInfoResponseBody} extends {@link TeaModel}
     *
     * <p>EnterpriseAccountQueryAccountsInfoResponseBody</p>
     */
    public static class AccountInfoDtoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Alias")
        private String alias;

        @com.aliyun.core.annotation.NameInMap("BelongToMasterAccount")
        private Boolean belongToMasterAccount;

        @com.aliyun.core.annotation.NameInMap("Email")
        private String email;

        @com.aliyun.core.annotation.NameInMap("EnterpriseEcId")
        private String enterpriseEcId;

        @com.aliyun.core.annotation.NameInMap("EnterpriseEntityId")
        private String enterpriseEntityId;

        @com.aliyun.core.annotation.NameInMap("EnterpriseLicenseNo")
        private String enterpriseLicenseNo;

        @com.aliyun.core.annotation.NameInMap("EnterpriseName")
        private String enterpriseName;

        @com.aliyun.core.annotation.NameInMap("EnterpriseNbId")
        private String enterpriseNbId;

        @com.aliyun.core.annotation.NameInMap("FreezeLogin")
        private Boolean freezeLogin;

        @com.aliyun.core.annotation.NameInMap("LoginId")
        private String loginId;

        @com.aliyun.core.annotation.NameInMap("ManageInviteTimeStamp")
        private String manageInviteTimeStamp;

        @com.aliyun.core.annotation.NameInMap("Pk")
        private String pk;

        @com.aliyun.core.annotation.NameInMap("SecurityMobile")
        private String securityMobile;

        private AccountInfoDtoList(Builder builder) {
            this.alias = builder.alias;
            this.belongToMasterAccount = builder.belongToMasterAccount;
            this.email = builder.email;
            this.enterpriseEcId = builder.enterpriseEcId;
            this.enterpriseEntityId = builder.enterpriseEntityId;
            this.enterpriseLicenseNo = builder.enterpriseLicenseNo;
            this.enterpriseName = builder.enterpriseName;
            this.enterpriseNbId = builder.enterpriseNbId;
            this.freezeLogin = builder.freezeLogin;
            this.loginId = builder.loginId;
            this.manageInviteTimeStamp = builder.manageInviteTimeStamp;
            this.pk = builder.pk;
            this.securityMobile = builder.securityMobile;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AccountInfoDtoList create() {
            return builder().build();
        }

        /**
         * @return alias
         */
        public String getAlias() {
            return this.alias;
        }

        /**
         * @return belongToMasterAccount
         */
        public Boolean getBelongToMasterAccount() {
            return this.belongToMasterAccount;
        }

        /**
         * @return email
         */
        public String getEmail() {
            return this.email;
        }

        /**
         * @return enterpriseEcId
         */
        public String getEnterpriseEcId() {
            return this.enterpriseEcId;
        }

        /**
         * @return enterpriseEntityId
         */
        public String getEnterpriseEntityId() {
            return this.enterpriseEntityId;
        }

        /**
         * @return enterpriseLicenseNo
         */
        public String getEnterpriseLicenseNo() {
            return this.enterpriseLicenseNo;
        }

        /**
         * @return enterpriseName
         */
        public String getEnterpriseName() {
            return this.enterpriseName;
        }

        /**
         * @return enterpriseNbId
         */
        public String getEnterpriseNbId() {
            return this.enterpriseNbId;
        }

        /**
         * @return freezeLogin
         */
        public Boolean getFreezeLogin() {
            return this.freezeLogin;
        }

        /**
         * @return loginId
         */
        public String getLoginId() {
            return this.loginId;
        }

        /**
         * @return manageInviteTimeStamp
         */
        public String getManageInviteTimeStamp() {
            return this.manageInviteTimeStamp;
        }

        /**
         * @return pk
         */
        public String getPk() {
            return this.pk;
        }

        /**
         * @return securityMobile
         */
        public String getSecurityMobile() {
            return this.securityMobile;
        }

        public static final class Builder {
            private String alias; 
            private Boolean belongToMasterAccount; 
            private String email; 
            private String enterpriseEcId; 
            private String enterpriseEntityId; 
            private String enterpriseLicenseNo; 
            private String enterpriseName; 
            private String enterpriseNbId; 
            private Boolean freezeLogin; 
            private String loginId; 
            private String manageInviteTimeStamp; 
            private String pk; 
            private String securityMobile; 

            private Builder() {
            } 

            private Builder(AccountInfoDtoList model) {
                this.alias = model.alias;
                this.belongToMasterAccount = model.belongToMasterAccount;
                this.email = model.email;
                this.enterpriseEcId = model.enterpriseEcId;
                this.enterpriseEntityId = model.enterpriseEntityId;
                this.enterpriseLicenseNo = model.enterpriseLicenseNo;
                this.enterpriseName = model.enterpriseName;
                this.enterpriseNbId = model.enterpriseNbId;
                this.freezeLogin = model.freezeLogin;
                this.loginId = model.loginId;
                this.manageInviteTimeStamp = model.manageInviteTimeStamp;
                this.pk = model.pk;
                this.securityMobile = model.securityMobile;
            } 

            /**
             * Alias.
             */
            public Builder alias(String alias) {
                this.alias = alias;
                return this;
            }

            /**
             * BelongToMasterAccount.
             */
            public Builder belongToMasterAccount(Boolean belongToMasterAccount) {
                this.belongToMasterAccount = belongToMasterAccount;
                return this;
            }

            /**
             * Email.
             */
            public Builder email(String email) {
                this.email = email;
                return this;
            }

            /**
             * EnterpriseEcId.
             */
            public Builder enterpriseEcId(String enterpriseEcId) {
                this.enterpriseEcId = enterpriseEcId;
                return this;
            }

            /**
             * EnterpriseEntityId.
             */
            public Builder enterpriseEntityId(String enterpriseEntityId) {
                this.enterpriseEntityId = enterpriseEntityId;
                return this;
            }

            /**
             * EnterpriseLicenseNo.
             */
            public Builder enterpriseLicenseNo(String enterpriseLicenseNo) {
                this.enterpriseLicenseNo = enterpriseLicenseNo;
                return this;
            }

            /**
             * EnterpriseName.
             */
            public Builder enterpriseName(String enterpriseName) {
                this.enterpriseName = enterpriseName;
                return this;
            }

            /**
             * EnterpriseNbId.
             */
            public Builder enterpriseNbId(String enterpriseNbId) {
                this.enterpriseNbId = enterpriseNbId;
                return this;
            }

            /**
             * FreezeLogin.
             */
            public Builder freezeLogin(Boolean freezeLogin) {
                this.freezeLogin = freezeLogin;
                return this;
            }

            /**
             * LoginId.
             */
            public Builder loginId(String loginId) {
                this.loginId = loginId;
                return this;
            }

            /**
             * ManageInviteTimeStamp.
             */
            public Builder manageInviteTimeStamp(String manageInviteTimeStamp) {
                this.manageInviteTimeStamp = manageInviteTimeStamp;
                return this;
            }

            /**
             * Pk.
             */
            public Builder pk(String pk) {
                this.pk = pk;
                return this;
            }

            /**
             * SecurityMobile.
             */
            public Builder securityMobile(String securityMobile) {
                this.securityMobile = securityMobile;
                return this;
            }

            public AccountInfoDtoList build() {
                return new AccountInfoDtoList(this);
            } 

        } 

    }
}
