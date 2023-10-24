// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link InsureOrderRefundResponseBody} extends {@link TeaModel}
 *
 * <p>InsureOrderRefundResponseBody</p>
 */
public class InsureOrderRefundResponseBody extends TeaModel {
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

    private InsureOrderRefundResponseBody(Builder builder) {
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

    public static InsureOrderRefundResponseBody create() {
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

        public InsureOrderRefundResponseBody build() {
            return new InsureOrderRefundResponseBody(this);
        } 

    } 

    public static class InsRefundList extends TeaModel {
        @NameInMap("policy_refund_no")
        private String policyRefundNo;

        @NameInMap("refund_status")
        private String refundStatus;

        @NameInMap("sub_ins_order_id")
        private String subInsOrderId;

        private InsRefundList(Builder builder) {
            this.policyRefundNo = builder.policyRefundNo;
            this.refundStatus = builder.refundStatus;
            this.subInsOrderId = builder.subInsOrderId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InsRefundList create() {
            return builder().build();
        }

        /**
         * @return policyRefundNo
         */
        public String getPolicyRefundNo() {
            return this.policyRefundNo;
        }

        /**
         * @return refundStatus
         */
        public String getRefundStatus() {
            return this.refundStatus;
        }

        /**
         * @return subInsOrderId
         */
        public String getSubInsOrderId() {
            return this.subInsOrderId;
        }

        public static final class Builder {
            private String policyRefundNo; 
            private String refundStatus; 
            private String subInsOrderId; 

            /**
             * policy_refund_no.
             */
            public Builder policyRefundNo(String policyRefundNo) {
                this.policyRefundNo = policyRefundNo;
                return this;
            }

            /**
             * refund_status.
             */
            public Builder refundStatus(String refundStatus) {
                this.refundStatus = refundStatus;
                return this;
            }

            /**
             * sub_ins_order_id.
             */
            public Builder subInsOrderId(String subInsOrderId) {
                this.subInsOrderId = subInsOrderId;
                return this;
            }

            public InsRefundList build() {
                return new InsRefundList(this);
            } 

        } 

    }
    public static class Module extends TeaModel {
        @NameInMap("apply_id")
        private String applyId;

        @NameInMap("ins_order_id")
        private String insOrderId;

        @NameInMap("ins_refund_list")
        private java.util.List < InsRefundList> insRefundList;

        @NameInMap("out_apply_id")
        private String outApplyId;

        private Module(Builder builder) {
            this.applyId = builder.applyId;
            this.insOrderId = builder.insOrderId;
            this.insRefundList = builder.insRefundList;
            this.outApplyId = builder.outApplyId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Module create() {
            return builder().build();
        }

        /**
         * @return applyId
         */
        public String getApplyId() {
            return this.applyId;
        }

        /**
         * @return insOrderId
         */
        public String getInsOrderId() {
            return this.insOrderId;
        }

        /**
         * @return insRefundList
         */
        public java.util.List < InsRefundList> getInsRefundList() {
            return this.insRefundList;
        }

        /**
         * @return outApplyId
         */
        public String getOutApplyId() {
            return this.outApplyId;
        }

        public static final class Builder {
            private String applyId; 
            private String insOrderId; 
            private java.util.List < InsRefundList> insRefundList; 
            private String outApplyId; 

            /**
             * apply_id.
             */
            public Builder applyId(String applyId) {
                this.applyId = applyId;
                return this;
            }

            /**
             * ins_order_id.
             */
            public Builder insOrderId(String insOrderId) {
                this.insOrderId = insOrderId;
                return this;
            }

            /**
             * ins_refund_list.
             */
            public Builder insRefundList(java.util.List < InsRefundList> insRefundList) {
                this.insRefundList = insRefundList;
                return this;
            }

            /**
             * out_apply_id.
             */
            public Builder outApplyId(String outApplyId) {
                this.outApplyId = outApplyId;
                return this;
            }

            public Module build() {
                return new Module(this);
            } 

        } 

    }
}
