// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.account_crm20160606.models;

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
 * {@link BatchQueryAgAccountResponseBody} extends {@link TeaModel}
 *
 * <p>BatchQueryAgAccountResponseBody</p>
 */
public class BatchQueryAgAccountResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AgAccounts")
    private java.util.List<AgAccounts> agAccounts;

    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private BatchQueryAgAccountResponseBody(Builder builder) {
        this.agAccounts = builder.agAccounts;
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchQueryAgAccountResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agAccounts
     */
    public java.util.List<AgAccounts> getAgAccounts() {
        return this.agAccounts;
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
        private java.util.List<AgAccounts> agAccounts; 
        private String code; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(BatchQueryAgAccountResponseBody model) {
            this.agAccounts = model.agAccounts;
            this.code = model.code;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * AgAccounts.
         */
        public Builder agAccounts(java.util.List<AgAccounts> agAccounts) {
            this.agAccounts = agAccounts;
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

        public BatchQueryAgAccountResponseBody build() {
            return new BatchQueryAgAccountResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link BatchQueryAgAccountResponseBody} extends {@link TeaModel}
     *
     * <p>BatchQueryAgAccountResponseBody</p>
     */
    public static class AgAccounts extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LoginEmail")
        private String loginEmail;

        @com.aliyun.core.annotation.NameInMap("Pk")
        private String pk;

        @com.aliyun.core.annotation.NameInMap("ShowNickName")
        private String showNickName;

        private AgAccounts(Builder builder) {
            this.loginEmail = builder.loginEmail;
            this.pk = builder.pk;
            this.showNickName = builder.showNickName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AgAccounts create() {
            return builder().build();
        }

        /**
         * @return loginEmail
         */
        public String getLoginEmail() {
            return this.loginEmail;
        }

        /**
         * @return pk
         */
        public String getPk() {
            return this.pk;
        }

        /**
         * @return showNickName
         */
        public String getShowNickName() {
            return this.showNickName;
        }

        public static final class Builder {
            private String loginEmail; 
            private String pk; 
            private String showNickName; 

            private Builder() {
            } 

            private Builder(AgAccounts model) {
                this.loginEmail = model.loginEmail;
                this.pk = model.pk;
                this.showNickName = model.showNickName;
            } 

            /**
             * LoginEmail.
             */
            public Builder loginEmail(String loginEmail) {
                this.loginEmail = loginEmail;
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
             * ShowNickName.
             */
            public Builder showNickName(String showNickName) {
                this.showNickName = showNickName;
                return this;
            }

            public AgAccounts build() {
                return new AgAccounts(this);
            } 

        } 

    }
}
