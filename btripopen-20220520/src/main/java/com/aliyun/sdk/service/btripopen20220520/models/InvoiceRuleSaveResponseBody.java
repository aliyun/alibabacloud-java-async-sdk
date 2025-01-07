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
 * {@link InvoiceRuleSaveResponseBody} extends {@link TeaModel}
 *
 * <p>InvoiceRuleSaveResponseBody</p>
 */
public class InvoiceRuleSaveResponseBody extends TeaModel {
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

    private InvoiceRuleSaveResponseBody(Builder builder) {
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

    public static InvoiceRuleSaveResponseBody create() {
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

        public InvoiceRuleSaveResponseBody build() {
            return new InvoiceRuleSaveResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link InvoiceRuleSaveResponseBody} extends {@link TeaModel}
     *
     * <p>InvoiceRuleSaveResponseBody</p>
     */
    public static class Module extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("add_num")
        private Integer addNum;

        @com.aliyun.core.annotation.NameInMap("remove_num")
        private Integer removeNum;

        private Module(Builder builder) {
            this.addNum = builder.addNum;
            this.removeNum = builder.removeNum;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Module create() {
            return builder().build();
        }

        /**
         * @return addNum
         */
        public Integer getAddNum() {
            return this.addNum;
        }

        /**
         * @return removeNum
         */
        public Integer getRemoveNum() {
            return this.removeNum;
        }

        public static final class Builder {
            private Integer addNum; 
            private Integer removeNum; 

            /**
             * add_num.
             */
            public Builder addNum(Integer addNum) {
                this.addNum = addNum;
                return this;
            }

            /**
             * remove_num.
             */
            public Builder removeNum(Integer removeNum) {
                this.removeNum = removeNum;
                return this;
            }

            public Module build() {
                return new Module(this);
            } 

        } 

    }
}
