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
 * {@link InsureOrderCreateResponseBody} extends {@link TeaModel}
 *
 * <p>InsureOrderCreateResponseBody</p>
 */
public class InsureOrderCreateResponseBody extends TeaModel {
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

    private InsureOrderCreateResponseBody(Builder builder) {
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

    public static InsureOrderCreateResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(InsureOrderCreateResponseBody model) {
            this.code = model.code;
            this.message = model.message;
            this.module = model.module;
            this.requestId = model.requestId;
            this.success = model.success;
            this.traceId = model.traceId;
        } 

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

        public InsureOrderCreateResponseBody build() {
            return new InsureOrderCreateResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link InsureOrderCreateResponseBody} extends {@link TeaModel}
     *
     * <p>InsureOrderCreateResponseBody</p>
     */
    public static class InsureOrderDetailList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("out_sub_ins_order_id")
        private String outSubInsOrderId;

        @com.aliyun.core.annotation.NameInMap("policy_no")
        private String policyNo;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("sub_ins_order_id")
        private String subInsOrderId;

        private InsureOrderDetailList(Builder builder) {
            this.outSubInsOrderId = builder.outSubInsOrderId;
            this.policyNo = builder.policyNo;
            this.status = builder.status;
            this.subInsOrderId = builder.subInsOrderId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InsureOrderDetailList create() {
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

            private Builder() {
            } 

            private Builder(InsureOrderDetailList model) {
                this.outSubInsOrderId = model.outSubInsOrderId;
                this.policyNo = model.policyNo;
                this.status = model.status;
                this.subInsOrderId = model.subInsOrderId;
            } 

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

            public InsureOrderDetailList build() {
                return new InsureOrderDetailList(this);
            } 

        } 

    }
    /**
     * 
     * {@link InsureOrderCreateResponseBody} extends {@link TeaModel}
     *
     * <p>InsureOrderCreateResponseBody</p>
     */
    public static class Module extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("copies")
        private Integer copies;

        @com.aliyun.core.annotation.NameInMap("insure_order_detail_list")
        private java.util.List<InsureOrderDetailList> insureOrderDetailList;

        @com.aliyun.core.annotation.NameInMap("insure_order_id")
        private String insureOrderId;

        @com.aliyun.core.annotation.NameInMap("premium")
        private Long premium;

        private Module(Builder builder) {
            this.copies = builder.copies;
            this.insureOrderDetailList = builder.insureOrderDetailList;
            this.insureOrderId = builder.insureOrderId;
            this.premium = builder.premium;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Module create() {
            return builder().build();
        }

        /**
         * @return copies
         */
        public Integer getCopies() {
            return this.copies;
        }

        /**
         * @return insureOrderDetailList
         */
        public java.util.List<InsureOrderDetailList> getInsureOrderDetailList() {
            return this.insureOrderDetailList;
        }

        /**
         * @return insureOrderId
         */
        public String getInsureOrderId() {
            return this.insureOrderId;
        }

        /**
         * @return premium
         */
        public Long getPremium() {
            return this.premium;
        }

        public static final class Builder {
            private Integer copies; 
            private java.util.List<InsureOrderDetailList> insureOrderDetailList; 
            private String insureOrderId; 
            private Long premium; 

            private Builder() {
            } 

            private Builder(Module model) {
                this.copies = model.copies;
                this.insureOrderDetailList = model.insureOrderDetailList;
                this.insureOrderId = model.insureOrderId;
                this.premium = model.premium;
            } 

            /**
             * copies.
             */
            public Builder copies(Integer copies) {
                this.copies = copies;
                return this;
            }

            /**
             * insure_order_detail_list.
             */
            public Builder insureOrderDetailList(java.util.List<InsureOrderDetailList> insureOrderDetailList) {
                this.insureOrderDetailList = insureOrderDetailList;
                return this;
            }

            /**
             * insure_order_id.
             */
            public Builder insureOrderId(String insureOrderId) {
                this.insureOrderId = insureOrderId;
                return this;
            }

            /**
             * premium.
             */
            public Builder premium(Long premium) {
                this.premium = premium;
                return this;
            }

            public Module build() {
                return new Module(this);
            } 

        } 

    }
}
