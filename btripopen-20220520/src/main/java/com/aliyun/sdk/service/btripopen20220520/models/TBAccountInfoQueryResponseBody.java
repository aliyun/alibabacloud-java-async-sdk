// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TBAccountInfoQueryResponseBody} extends {@link TeaModel}
 *
 * <p>TBAccountInfoQueryResponseBody</p>
 */
public class TBAccountInfoQueryResponseBody extends TeaModel {
    @NameInMap("code")
    private String code;

    @NameInMap("message")
    private String message;

    @NameInMap("module")
    private Module module;

    @NameInMap("requestId")
    private String requestId;

    @NameInMap("success")
    private Boolean success;

    @NameInMap("traceId")
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

    public static class Module extends TeaModel {
        @NameInMap("tb_account")
        private String tbAccount;

        @NameInMap("tb_bond")
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
             * 淘宝账号
             */
            public Builder tbAccount(String tbAccount) {
                this.tbAccount = tbAccount;
                return this;
            }

            /**
             * 是否绑定淘宝
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
