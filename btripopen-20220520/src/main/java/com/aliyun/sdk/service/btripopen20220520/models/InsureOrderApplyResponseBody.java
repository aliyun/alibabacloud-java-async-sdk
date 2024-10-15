// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link InsureOrderApplyResponseBody} extends {@link TeaModel}
 *
 * <p>InsureOrderApplyResponseBody</p>
 */
public class InsureOrderApplyResponseBody extends TeaModel {
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

    private InsureOrderApplyResponseBody(Builder builder) {
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

    public static InsureOrderApplyResponseBody create() {
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

        public InsureOrderApplyResponseBody build() {
            return new InsureOrderApplyResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link InsureOrderApplyResponseBody} extends {@link TeaModel}
     *
     * <p>InsureOrderApplyResponseBody</p>
     */
    public static class InsOrderPolicyList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("out_sub_ins_order_id")
        private String outSubInsOrderId;

        @com.aliyun.core.annotation.NameInMap("policy_no")
        private String policyNo;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("sub_ins_order_id")
        private String subInsOrderId;

        private InsOrderPolicyList(Builder builder) {
            this.outSubInsOrderId = builder.outSubInsOrderId;
            this.policyNo = builder.policyNo;
            this.status = builder.status;
            this.subInsOrderId = builder.subInsOrderId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InsOrderPolicyList create() {
            return builder().build();
        }

        /**
         * @return outSubInsOrderId
         */
        public String getOutSubInsOrderId() {
            return this.outSubInsOrderId;
        }

        /**
         * @return policyNo
         */
        public String getPolicyNo() {
            return this.policyNo;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return subInsOrderId
         */
        public String getSubInsOrderId() {
            return this.subInsOrderId;
        }

        public static final class Builder {
            private String outSubInsOrderId; 
            private String policyNo; 
            private String status; 
            private String subInsOrderId; 

            /**
             * out_sub_ins_order_id.
             */
            public Builder outSubInsOrderId(String outSubInsOrderId) {
                this.outSubInsOrderId = outSubInsOrderId;
                return this;
            }

            /**
             * policy_no.
             */
            public Builder policyNo(String policyNo) {
                this.policyNo = policyNo;
                return this;
            }

            /**
             * status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * sub_ins_order_id.
             */
            public Builder subInsOrderId(String subInsOrderId) {
                this.subInsOrderId = subInsOrderId;
                return this;
            }

            public InsOrderPolicyList build() {
                return new InsOrderPolicyList(this);
            } 

        } 

    }
    /**
     * 
     * {@link InsureOrderApplyResponseBody} extends {@link TeaModel}
     *
     * <p>InsureOrderApplyResponseBody</p>
     */
    public static class Module extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ins_order_id")
        private String insOrderId;

        @com.aliyun.core.annotation.NameInMap("ins_order_policy_list")
        private java.util.List < InsOrderPolicyList> insOrderPolicyList;

        private Module(Builder builder) {
            this.insOrderId = builder.insOrderId;
            this.insOrderPolicyList = builder.insOrderPolicyList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Module create() {
            return builder().build();
        }

        /**
         * @return insOrderId
         */
        public String getInsOrderId() {
            return this.insOrderId;
        }

        /**
         * @return insOrderPolicyList
         */
        public java.util.List < InsOrderPolicyList> getInsOrderPolicyList() {
            return this.insOrderPolicyList;
        }

        public static final class Builder {
            private String insOrderId; 
            private java.util.List < InsOrderPolicyList> insOrderPolicyList; 

            /**
             * ins_order_id.
             */
            public Builder insOrderId(String insOrderId) {
                this.insOrderId = insOrderId;
                return this;
            }

            /**
             * ins_order_policy_list.
             */
            public Builder insOrderPolicyList(java.util.List < InsOrderPolicyList> insOrderPolicyList) {
                this.insOrderPolicyList = insOrderPolicyList;
                return this;
            }

            public Module build() {
                return new Module(this);
            } 

        } 

    }
}
