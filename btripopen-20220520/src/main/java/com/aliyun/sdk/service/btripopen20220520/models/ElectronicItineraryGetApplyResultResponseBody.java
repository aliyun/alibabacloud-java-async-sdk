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
 * {@link ElectronicItineraryGetApplyResultResponseBody} extends {@link TeaModel}
 *
 * <p>ElectronicItineraryGetApplyResultResponseBody</p>
 */
public class ElectronicItineraryGetApplyResultResponseBody extends TeaModel {
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

    private ElectronicItineraryGetApplyResultResponseBody(Builder builder) {
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

    public static ElectronicItineraryGetApplyResultResponseBody create() {
        return builder().build();
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
         * <p>B72B39C8-32DE-558D-AD1C-D53F11F6ADFE</p>
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

        public ElectronicItineraryGetApplyResultResponseBody build() {
            return new ElectronicItineraryGetApplyResultResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ElectronicItineraryGetApplyResultResponseBody} extends {@link TeaModel}
     *
     * <p>ElectronicItineraryGetApplyResultResponseBody</p>
     */
    public static class ApplyTicketList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("failed_code")
        private Integer failedCode;

        @com.aliyun.core.annotation.NameInMap("failed_reason")
        private String failedReason;

        @com.aliyun.core.annotation.NameInMap("itinerary_status")
        private Integer itineraryStatus;

        @com.aliyun.core.annotation.NameInMap("ticket_no")
        private String ticketNo;

        private ApplyTicketList(Builder builder) {
            this.failedCode = builder.failedCode;
            this.failedReason = builder.failedReason;
            this.itineraryStatus = builder.itineraryStatus;
            this.ticketNo = builder.ticketNo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ApplyTicketList create() {
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
         * @return itineraryStatus
         */
        public Integer getItineraryStatus() {
            return this.itineraryStatus;
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
            private Integer itineraryStatus; 
            private String ticketNo; 

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
             * itinerary_status.
             */
            public Builder itineraryStatus(Integer itineraryStatus) {
                this.itineraryStatus = itineraryStatus;
                return this;
            }

            /**
             * ticket_no.
             */
            public Builder ticketNo(String ticketNo) {
                this.ticketNo = ticketNo;
                return this;
            }

            public ApplyTicketList build() {
                return new ApplyTicketList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ElectronicItineraryGetApplyResultResponseBody} extends {@link TeaModel}
     *
     * <p>ElectronicItineraryGetApplyResultResponseBody</p>
     */
    public static class Module extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("apply_ticket_list")
        private java.util.List<ApplyTicketList> applyTicketList;

        @com.aliyun.core.annotation.NameInMap("batch_apply_no")
        private String batchApplyNo;

        private Module(Builder builder) {
            this.applyTicketList = builder.applyTicketList;
            this.batchApplyNo = builder.batchApplyNo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Module create() {
            return builder().build();
        }

        /**
         * @return applyTicketList
         */
        public java.util.List<ApplyTicketList> getApplyTicketList() {
            return this.applyTicketList;
        }

        /**
         * @return batchApplyNo
         */
        public String getBatchApplyNo() {
            return this.batchApplyNo;
        }

        public static final class Builder {
            private java.util.List<ApplyTicketList> applyTicketList; 
            private String batchApplyNo; 

            /**
             * apply_ticket_list.
             */
            public Builder applyTicketList(java.util.List<ApplyTicketList> applyTicketList) {
                this.applyTicketList = applyTicketList;
                return this;
            }

            /**
             * batch_apply_no.
             */
            public Builder batchApplyNo(String batchApplyNo) {
                this.batchApplyNo = batchApplyNo;
                return this;
            }

            public Module build() {
                return new Module(this);
            } 

        } 

    }
}
