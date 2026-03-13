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
 * {@link QueryCompenInfosForOpResponseBody} extends {@link TeaModel}
 *
 * <p>QueryCompenInfosForOpResponseBody</p>
 */
public class QueryCompenInfosForOpResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("module")
    private java.util.List<Module> module;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("traceId")
    private String traceId;

    private QueryCompenInfosForOpResponseBody(Builder builder) {
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

    public static QueryCompenInfosForOpResponseBody create() {
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
    public java.util.List<Module> getModule() {
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
        private java.util.List<Module> module; 
        private String requestId; 
        private Boolean success; 
        private String traceId; 

        private Builder() {
        } 

        private Builder(QueryCompenInfosForOpResponseBody model) {
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
        public Builder module(java.util.List<Module> module) {
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

        public QueryCompenInfosForOpResponseBody build() {
            return new QueryCompenInfosForOpResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryCompenInfosForOpResponseBody} extends {@link TeaModel}
     *
     * <p>QueryCompenInfosForOpResponseBody</p>
     */
    public static class Module extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("amount")
        private Long amount;

        @com.aliyun.core.annotation.NameInMap("category")
        private Integer category;

        @com.aliyun.core.annotation.NameInMap("compen_id")
        private String compenId;

        @com.aliyun.core.annotation.NameInMap("compensation_type")
        private String compensationType;

        @com.aliyun.core.annotation.NameInMap("order_id")
        private String orderId;

        @com.aliyun.core.annotation.NameInMap("settle_time")
        private String settleTime;

        @com.aliyun.core.annotation.NameInMap("settle_type")
        private Integer settleType;

        @com.aliyun.core.annotation.NameInMap("ticket_no")
        private String ticketNo;

        private Module(Builder builder) {
            this.amount = builder.amount;
            this.category = builder.category;
            this.compenId = builder.compenId;
            this.compensationType = builder.compensationType;
            this.orderId = builder.orderId;
            this.settleTime = builder.settleTime;
            this.settleType = builder.settleType;
            this.ticketNo = builder.ticketNo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Module create() {
            return builder().build();
        }

        /**
         * @return amount
         */
        public Long getAmount() {
            return this.amount;
        }

        /**
         * @return category
         */
        public Integer getCategory() {
            return this.category;
        }

        /**
         * @return compenId
         */
        public String getCompenId() {
            return this.compenId;
        }

        /**
         * @return compensationType
         */
        public String getCompensationType() {
            return this.compensationType;
        }

        /**
         * @return orderId
         */
        public String getOrderId() {
            return this.orderId;
        }

        /**
         * @return settleTime
         */
        public String getSettleTime() {
            return this.settleTime;
        }

        /**
         * @return settleType
         */
        public Integer getSettleType() {
            return this.settleType;
        }

        /**
         * @return ticketNo
         */
        public String getTicketNo() {
            return this.ticketNo;
        }

        public static final class Builder {
            private Long amount; 
            private Integer category; 
            private String compenId; 
            private String compensationType; 
            private String orderId; 
            private String settleTime; 
            private Integer settleType; 
            private String ticketNo; 

            private Builder() {
            } 

            private Builder(Module model) {
                this.amount = model.amount;
                this.category = model.category;
                this.compenId = model.compenId;
                this.compensationType = model.compensationType;
                this.orderId = model.orderId;
                this.settleTime = model.settleTime;
                this.settleType = model.settleType;
                this.ticketNo = model.ticketNo;
            } 

            /**
             * amount.
             */
            public Builder amount(Long amount) {
                this.amount = amount;
                return this;
            }

            /**
             * category.
             */
            public Builder category(Integer category) {
                this.category = category;
                return this;
            }

            /**
             * compen_id.
             */
            public Builder compenId(String compenId) {
                this.compenId = compenId;
                return this;
            }

            /**
             * compensation_type.
             */
            public Builder compensationType(String compensationType) {
                this.compensationType = compensationType;
                return this;
            }

            /**
             * order_id.
             */
            public Builder orderId(String orderId) {
                this.orderId = orderId;
                return this;
            }

            /**
             * settle_time.
             */
            public Builder settleTime(String settleTime) {
                this.settleTime = settleTime;
                return this;
            }

            /**
             * settle_type.
             */
            public Builder settleType(Integer settleType) {
                this.settleType = settleType;
                return this;
            }

            /**
             * ticket_no.
             */
            public Builder ticketNo(String ticketNo) {
                this.ticketNo = ticketNo;
                return this;
            }

            public Module build() {
                return new Module(this);
            } 

        } 

    }
}
