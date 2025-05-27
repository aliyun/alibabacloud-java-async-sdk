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
 * {@link EnterpriseRegisterAccountResponseBody} extends {@link TeaModel}
 *
 * <p>EnterpriseRegisterAccountResponseBody</p>
 */
public class EnterpriseRegisterAccountResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccountInfo")
    private AccountInfo accountInfo;

    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private EnterpriseRegisterAccountResponseBody(Builder builder) {
        this.accountInfo = builder.accountInfo;
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EnterpriseRegisterAccountResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accountInfo
     */
    public AccountInfo getAccountInfo() {
        return this.accountInfo;
    }

    /**
     * @return code
     */
    public String getCode() {
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
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private AccountInfo accountInfo; 
        private String code; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(EnterpriseRegisterAccountResponseBody model) {
            this.accountInfo = model.accountInfo;
            this.code = model.code;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * AccountInfo.
         */
        public Builder accountInfo(AccountInfo accountInfo) {
            this.accountInfo = accountInfo;
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
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
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

        public EnterpriseRegisterAccountResponseBody build() {
            return new EnterpriseRegisterAccountResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link EnterpriseRegisterAccountResponseBody} extends {@link TeaModel}
     *
     * <p>EnterpriseRegisterAccountResponseBody</p>
     */
    public static class AccountInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EnterpriseLicenseNo")
        private String enterpriseLicenseNo;

        @com.aliyun.core.annotation.NameInMap("EnterpriseName")
        private String enterpriseName;

        @com.aliyun.core.annotation.NameInMap("LoginId")
        private String loginId;

        @com.aliyun.core.annotation.NameInMap("Pk")
        private String pk;

        private AccountInfo(Builder builder) {
            this.enterpriseLicenseNo = builder.enterpriseLicenseNo;
            this.enterpriseName = builder.enterpriseName;
            this.loginId = builder.loginId;
            this.pk = builder.pk;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AccountInfo create() {
            return builder().build();
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
         * @return loginId
         */
        public String getLoginId() {
            return this.loginId;
        }

        /**
         * @return pk
         */
        public String getPk() {
            return this.pk;
        }

        public static final class Builder {
            private String enterpriseLicenseNo; 
            private String enterpriseName; 
            private String loginId; 
            private String pk; 

            private Builder() {
            } 

            private Builder(AccountInfo model) {
                this.enterpriseLicenseNo = model.enterpriseLicenseNo;
                this.enterpriseName = model.enterpriseName;
                this.loginId = model.loginId;
                this.pk = model.pk;
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
             * LoginId.
             */
            public Builder loginId(String loginId) {
                this.loginId = loginId;
                return this;
            }

            /**
             * Pk.
             */
            public Builder pk(String pk) {
                this.pk = pk;
                return this;
            }

            public AccountInfo build() {
                return new AccountInfo(this);
            } 

        } 

    }
}
