// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TicketChangingApplyResponseBody} extends {@link TeaModel}
 *
 * <p>TicketChangingApplyResponseBody</p>
 */
public class TicketChangingApplyResponseBody extends TeaModel {
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

    private TicketChangingApplyResponseBody(Builder builder) {
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

    public static TicketChangingApplyResponseBody create() {
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

        public TicketChangingApplyResponseBody build() {
            return new TicketChangingApplyResponseBody(this);
        } 

    } 

    public static class Module extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("booking_changed_total_fee")
        private Integer bookingChangedTotalFee;

        @com.aliyun.core.annotation.NameInMap("booking_origin_total_fee")
        private Integer bookingOriginTotalFee;

        @com.aliyun.core.annotation.NameInMap("booking_price_changed")
        private Boolean bookingPriceChanged;

        @com.aliyun.core.annotation.NameInMap("btrip_order_id")
        private Long btripOrderId;

        @com.aliyun.core.annotation.NameInMap("btrip_sub_order_id")
        private Long btripSubOrderId;

        @com.aliyun.core.annotation.NameInMap("can_pay")
        private Boolean canPay;

        @com.aliyun.core.annotation.NameInMap("change_fee")
        private Long changeFee;

        @com.aliyun.core.annotation.NameInMap("deadline_time")
        private String deadlineTime;

        @com.aliyun.core.annotation.NameInMap("dis_order_id")
        private String disOrderId;

        @com.aliyun.core.annotation.NameInMap("dis_sub_order_id")
        private String disSubOrderId;

        @com.aliyun.core.annotation.NameInMap("max_retry_times")
        private Integer maxRetryTimes;

        @com.aliyun.core.annotation.NameInMap("next_retry_interval")
        private Long nextRetryInterval;

        @com.aliyun.core.annotation.NameInMap("retry")
        private Boolean retry;

        @com.aliyun.core.annotation.NameInMap("retry_client_tips")
        private String retryClientTips;

        @com.aliyun.core.annotation.NameInMap("status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("upgrade_fee")
        private Long upgradeFee;

        private Module(Builder builder) {
            this.bookingChangedTotalFee = builder.bookingChangedTotalFee;
            this.bookingOriginTotalFee = builder.bookingOriginTotalFee;
            this.bookingPriceChanged = builder.bookingPriceChanged;
            this.btripOrderId = builder.btripOrderId;
            this.btripSubOrderId = builder.btripSubOrderId;
            this.canPay = builder.canPay;
            this.changeFee = builder.changeFee;
            this.deadlineTime = builder.deadlineTime;
            this.disOrderId = builder.disOrderId;
            this.disSubOrderId = builder.disSubOrderId;
            this.maxRetryTimes = builder.maxRetryTimes;
            this.nextRetryInterval = builder.nextRetryInterval;
            this.retry = builder.retry;
            this.retryClientTips = builder.retryClientTips;
            this.status = builder.status;
            this.upgradeFee = builder.upgradeFee;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Module create() {
            return builder().build();
        }

        /**
         * @return bookingChangedTotalFee
         */
        public Integer getBookingChangedTotalFee() {
            return this.bookingChangedTotalFee;
        }

        /**
         * @return bookingOriginTotalFee
         */
        public Integer getBookingOriginTotalFee() {
            return this.bookingOriginTotalFee;
        }

        /**
         * @return bookingPriceChanged
         */
        public Boolean getBookingPriceChanged() {
            return this.bookingPriceChanged;
        }

        /**
         * @return btripOrderId
         */
        public Long getBtripOrderId() {
            return this.btripOrderId;
        }

        /**
         * @return btripSubOrderId
         */
        public Long getBtripSubOrderId() {
            return this.btripSubOrderId;
        }

        /**
         * @return canPay
         */
        public Boolean getCanPay() {
            return this.canPay;
        }

        /**
         * @return changeFee
         */
        public Long getChangeFee() {
            return this.changeFee;
        }

        /**
         * @return deadlineTime
         */
        public String getDeadlineTime() {
            return this.deadlineTime;
        }

        /**
         * @return disOrderId
         */
        public String getDisOrderId() {
            return this.disOrderId;
        }

        /**
         * @return disSubOrderId
         */
        public String getDisSubOrderId() {
            return this.disSubOrderId;
        }

        /**
         * @return maxRetryTimes
         */
        public Integer getMaxRetryTimes() {
            return this.maxRetryTimes;
        }

        /**
         * @return nextRetryInterval
         */
        public Long getNextRetryInterval() {
            return this.nextRetryInterval;
        }

        /**
         * @return retry
         */
        public Boolean getRetry() {
            return this.retry;
        }

        /**
         * @return retryClientTips
         */
        public String getRetryClientTips() {
            return this.retryClientTips;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return upgradeFee
         */
        public Long getUpgradeFee() {
            return this.upgradeFee;
        }

        public static final class Builder {
            private Integer bookingChangedTotalFee; 
            private Integer bookingOriginTotalFee; 
            private Boolean bookingPriceChanged; 
            private Long btripOrderId; 
            private Long btripSubOrderId; 
            private Boolean canPay; 
            private Long changeFee; 
            private String deadlineTime; 
            private String disOrderId; 
            private String disSubOrderId; 
            private Integer maxRetryTimes; 
            private Long nextRetryInterval; 
            private Boolean retry; 
            private String retryClientTips; 
            private Integer status; 
            private Long upgradeFee; 

            /**
             * booking_changed_total_fee.
             */
            public Builder bookingChangedTotalFee(Integer bookingChangedTotalFee) {
                this.bookingChangedTotalFee = bookingChangedTotalFee;
                return this;
            }

            /**
             * booking_origin_total_fee.
             */
            public Builder bookingOriginTotalFee(Integer bookingOriginTotalFee) {
                this.bookingOriginTotalFee = bookingOriginTotalFee;
                return this;
            }

            /**
             * booking_price_changed.
             */
            public Builder bookingPriceChanged(Boolean bookingPriceChanged) {
                this.bookingPriceChanged = bookingPriceChanged;
                return this;
            }

            /**
             * btrip_order_id.
             */
            public Builder btripOrderId(Long btripOrderId) {
                this.btripOrderId = btripOrderId;
                return this;
            }

            /**
             * btrip_sub_order_id.
             */
            public Builder btripSubOrderId(Long btripSubOrderId) {
                this.btripSubOrderId = btripSubOrderId;
                return this;
            }

            /**
             * can_pay.
             */
            public Builder canPay(Boolean canPay) {
                this.canPay = canPay;
                return this;
            }

            /**
             * change_fee.
             */
            public Builder changeFee(Long changeFee) {
                this.changeFee = changeFee;
                return this;
            }

            /**
             * deadline_time.
             */
            public Builder deadlineTime(String deadlineTime) {
                this.deadlineTime = deadlineTime;
                return this;
            }

            /**
             * dis_order_id.
             */
            public Builder disOrderId(String disOrderId) {
                this.disOrderId = disOrderId;
                return this;
            }

            /**
             * dis_sub_order_id.
             */
            public Builder disSubOrderId(String disSubOrderId) {
                this.disSubOrderId = disSubOrderId;
                return this;
            }

            /**
             * max_retry_times.
             */
            public Builder maxRetryTimes(Integer maxRetryTimes) {
                this.maxRetryTimes = maxRetryTimes;
                return this;
            }

            /**
             * next_retry_interval.
             */
            public Builder nextRetryInterval(Long nextRetryInterval) {
                this.nextRetryInterval = nextRetryInterval;
                return this;
            }

            /**
             * retry.
             */
            public Builder retry(Boolean retry) {
                this.retry = retry;
                return this;
            }

            /**
             * retry_client_tips.
             */
            public Builder retryClientTips(String retryClientTips) {
                this.retryClientTips = retryClientTips;
                return this;
            }

            /**
             * status.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * upgrade_fee.
             */
            public Builder upgradeFee(Long upgradeFee) {
                this.upgradeFee = upgradeFee;
                return this;
            }

            public Module build() {
                return new Module(this);
            } 

        } 

    }
}
