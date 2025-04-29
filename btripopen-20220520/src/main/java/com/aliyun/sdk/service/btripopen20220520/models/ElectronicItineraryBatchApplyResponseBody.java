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
 * {@link ElectronicItineraryBatchApplyResponseBody} extends {@link TeaModel}
 *
 * <p>ElectronicItineraryBatchApplyResponseBody</p>
 */
public class ElectronicItineraryBatchApplyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private Integer code;

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

    private ElectronicItineraryBatchApplyResponseBody(Builder builder) {
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

    public static ElectronicItineraryBatchApplyResponseBody create() {
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
        private Integer code; 
        private String message; 
        private Module module; 
        private String requestId; 
        private Boolean success; 
        private String traceId; 

        private Builder() {
        } 

        private Builder(ElectronicItineraryBatchApplyResponseBody model) {
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
        public Builder code(Integer code) {
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
         * <p>requestId</p>
         * 
         * <strong>example:</strong>
         * <p>A5009956-1077-52FB-B520-EA8C7E91D722</p>
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
         * <p>traceId</p>
         * 
         * <strong>example:</strong>
         * <p>21041ce316577904808056433edbb2</p>
         */
        public Builder traceId(String traceId) {
            this.traceId = traceId;
            return this;
        }

        public ElectronicItineraryBatchApplyResponseBody build() {
            return new ElectronicItineraryBatchApplyResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ElectronicItineraryBatchApplyResponseBody} extends {@link TeaModel}
     *
     * <p>ElectronicItineraryBatchApplyResponseBody</p>
     */
    public static class ApplyFailedTicketList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("failed_code")
        private Integer failedCode;

        @com.aliyun.core.annotation.NameInMap("failed_reason")
        private String failedReason;

        @com.aliyun.core.annotation.NameInMap("ticket_no")
        private String ticketNo;

        private ApplyFailedTicketList(Builder builder) {
            this.failedCode = builder.failedCode;
            this.failedReason = builder.failedReason;
            this.ticketNo = builder.ticketNo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ApplyFailedTicketList create() {
            return builder().build();
        }

        /**
         * @return failedCode
         */
        public Integer getFailedCode() {
            return this.failedCode;
        }

        /**
         * @return failedReason
         */
        public String getFailedReason() {
            return this.failedReason;
        }

        /**
         * @return ticketNo
         */
        public String getTicketNo() {
            return this.ticketNo;
        }

        public static final class Builder {
            private Integer failedCode; 
            private String failedReason; 
            private String ticketNo; 

            private Builder() {
            } 

            private Builder(ApplyFailedTicketList model) {
                this.failedCode = model.failedCode;
                this.failedReason = model.failedReason;
                this.ticketNo = model.ticketNo;
            } 

            /**
             * failed_code.
             */
            public Builder failedCode(Integer failedCode) {
                this.failedCode = failedCode;
                return this;
            }

            /**
             * failed_reason.
             */
            public Builder failedReason(String failedReason) {
                this.failedReason = failedReason;
                return this;
            }

            /**
             * ticket_no.
             */
            public Builder ticketNo(String ticketNo) {
                this.ticketNo = ticketNo;
                return this;
            }

            public ApplyFailedTicketList build() {
                return new ApplyFailedTicketList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ElectronicItineraryBatchApplyResponseBody} extends {@link TeaModel}
     *
     * <p>ElectronicItineraryBatchApplyResponseBody</p>
     */
    public static class Module extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("apply_failed_ticket_list")
        private java.util.List<ApplyFailedTicketList> applyFailedTicketList;

        @com.aliyun.core.annotation.NameInMap("batch_no")
        private String batchNo;

        private Module(Builder builder) {
            this.applyFailedTicketList = builder.applyFailedTicketList;
            this.batchNo = builder.batchNo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Module create() {
            return builder().build();
        }

        /**
         * @return applyFailedTicketList
         */
        public java.util.List<ApplyFailedTicketList> getApplyFailedTicketList() {
            return this.applyFailedTicketList;
        }

        /**
         * @return batchNo
         */
        public String getBatchNo() {
            return this.batchNo;
        }

        public static final class Builder {
            private java.util.List<ApplyFailedTicketList> applyFailedTicketList; 
            private String batchNo; 

            private Builder() {
            } 

            private Builder(Module model) {
                this.applyFailedTicketList = model.applyFailedTicketList;
                this.batchNo = model.batchNo;
            } 

            /**
             * apply_failed_ticket_list.
             */
            public Builder applyFailedTicketList(java.util.List<ApplyFailedTicketList> applyFailedTicketList) {
                this.applyFailedTicketList = applyFailedTicketList;
                return this;
            }

            /**
             * batch_no.
             */
            public Builder batchNo(String batchNo) {
                this.batchNo = batchNo;
                return this;
            }

            public Module build() {
                return new Module(this);
            } 

        } 

    }
}
