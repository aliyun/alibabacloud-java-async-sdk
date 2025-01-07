// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

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
 * {@link TBAccountInfoQueryResponseBody} extends {@link TeaModel}
 *
 * <p>TBAccountInfoQueryResponseBody</p>
 */
public class TBAccountInfoQueryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("module")
    private Module module;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("traceId")
    private String traceId;

    private TBAccountInfoQueryResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.module = builder.module;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.traceId = builder.traceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TBAccountInfoQueryResponseBody create() {
        return builder().build();
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
     * @return module
     */
    public Module getModule() {
        return this.module;
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

    /**
     * @return traceId
     */
    public String getTraceId() {
        return this.traceId;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private Module module; 
        private String requestId; 
        private Boolean success; 
        private String traceId; 

        /**
         * code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * module.
         */
        public Builder module(Module module) {
            this.module = module;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * traceId.
         */
        public Builder traceId(String traceId) {
            this.traceId = traceId;
            return this;
        }

        public TBAccountInfoQueryResponseBody build() {
            return new TBAccountInfoQueryResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link TBAccountInfoQueryResponseBody} extends {@link TeaModel}
     *
     * <p>TBAccountInfoQueryResponseBody</p>
     */
    public static class Module extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("tb_account")
        private String tbAccount;

        @com.aliyun.core.annotation.NameInMap("tb_bond")
        private Boolean tbBond;

        private Module(Builder builder) {
            this.tbAccount = builder.tbAccount;
            this.tbBond = builder.tbBond;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Module create() {
            return builder().build();
        }

        /**
         * @return tbAccount
         */
        public String getTbAccount() {
            return this.tbAccount;
        }

        /**
         * @return tbBond
         */
        public Boolean getTbBond() {
            return this.tbBond;
        }

        public static final class Builder {
            private String tbAccount; 
            private Boolean tbBond; 

            /**
             * tb_account.
             */
            public Builder tbAccount(String tbAccount) {
                this.tbAccount = tbAccount;
                return this;
            }

            /**
             * tb_bond.
             */
            public Builder tbBond(Boolean tbBond) {
                this.tbBond = tbBond;
                return this;
            }

            public Module build() {
                return new Module(this);
            } 

        } 

    }
}
