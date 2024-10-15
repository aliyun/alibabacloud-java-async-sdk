// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link FlightRefundPreCalV2ResponseBody} extends {@link TeaModel}
 *
 * <p>FlightRefundPreCalV2ResponseBody</p>
 */
public class FlightRefundPreCalV2ResponseBody extends TeaModel {
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

    private FlightRefundPreCalV2ResponseBody(Builder builder) {
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

    public static FlightRefundPreCalV2ResponseBody create() {
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
         * <p>module</p>
         */
        public Builder module(Module module) {
            this.module = module;
            return this;
        }

        /**
         * <p>requestId</p>
         * 
         * <strong>example:</strong>
         * <p>92359A00-85D8-16C4-AED0-249618DEEC17</p>
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

        public FlightRefundPreCalV2ResponseBody build() {
            return new FlightRefundPreCalV2ResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link FlightRefundPreCalV2ResponseBody} extends {@link TeaModel}
     *
     * <p>FlightRefundPreCalV2ResponseBody</p>
     */
    public static class MultiRefundFeeDTOS extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("passenger_id")
        private String passengerId;

        @com.aliyun.core.annotation.NameInMap("passenger_name")
        private String passengerName;

        @com.aliyun.core.annotation.NameInMap("pre_refund_money")
        private Long preRefundMoney;

        @com.aliyun.core.annotation.NameInMap("refund_charge_fee")
        private Long refundChargeFee;

        private MultiRefundFeeDTOS(Builder builder) {
            this.passengerId = builder.passengerId;
            this.passengerName = builder.passengerName;
            this.preRefundMoney = builder.preRefundMoney;
            this.refundChargeFee = builder.refundChargeFee;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MultiRefundFeeDTOS create() {
            return builder().build();
        }

        /**
         * @return passengerId
         */
        public String getPassengerId() {
            return this.passengerId;
        }

        /**
         * @return passengerName
         */
        public String getPassengerName() {
            return this.passengerName;
        }

        /**
         * @return preRefundMoney
         */
        public Long getPreRefundMoney() {
            return this.preRefundMoney;
        }

        /**
         * @return refundChargeFee
         */
        public Long getRefundChargeFee() {
            return this.refundChargeFee;
        }

        public static final class Builder {
            private String passengerId; 
            private String passengerName; 
            private Long preRefundMoney; 
            private Long refundChargeFee; 

            /**
             * passenger_id.
             */
            public Builder passengerId(String passengerId) {
                this.passengerId = passengerId;
                return this;
            }

            /**
             * passenger_name.
             */
            public Builder passengerName(String passengerName) {
                this.passengerName = passengerName;
                return this;
            }

            /**
             * pre_refund_money.
             */
            public Builder preRefundMoney(Long preRefundMoney) {
                this.preRefundMoney = preRefundMoney;
                return this;
            }

            /**
             * refund_charge_fee.
             */
            public Builder refundChargeFee(Long refundChargeFee) {
                this.refundChargeFee = refundChargeFee;
                return this;
            }

            public MultiRefundFeeDTOS build() {
                return new MultiRefundFeeDTOS(this);
            } 

        } 

    }
    /**
     * 
     * {@link FlightRefundPreCalV2ResponseBody} extends {@link TeaModel}
     *
     * <p>FlightRefundPreCalV2ResponseBody</p>
     */
    public static class RefundReasonOptionDTOS extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("reason")
        private String reason;

        @com.aliyun.core.annotation.NameInMap("reason_type")
        private Integer reasonType;

        @com.aliyun.core.annotation.NameInMap("volunteer")
        private Boolean volunteer;

        private RefundReasonOptionDTOS(Builder builder) {
            this.reason = builder.reason;
            this.reasonType = builder.reasonType;
            this.volunteer = builder.volunteer;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RefundReasonOptionDTOS create() {
            return builder().build();
        }

        /**
         * @return reason
         */
        public String getReason() {
            return this.reason;
        }

        /**
         * @return reasonType
         */
        public Integer getReasonType() {
            return this.reasonType;
        }

        /**
         * @return volunteer
         */
        public Boolean getVolunteer() {
            return this.volunteer;
        }

        public static final class Builder {
            private String reason; 
            private Integer reasonType; 
            private Boolean volunteer; 

            /**
             * reason.
             */
            public Builder reason(String reason) {
                this.reason = reason;
                return this;
            }

            /**
             * reason_type.
             */
            public Builder reasonType(Integer reasonType) {
                this.reasonType = reasonType;
                return this;
            }

            /**
             * volunteer.
             */
            public Builder volunteer(Boolean volunteer) {
                this.volunteer = volunteer;
                return this;
            }

            public RefundReasonOptionDTOS build() {
                return new RefundReasonOptionDTOS(this);
            } 

        } 

    }
    /**
     * 
     * {@link FlightRefundPreCalV2ResponseBody} extends {@link TeaModel}
     *
     * <p>FlightRefundPreCalV2ResponseBody</p>
     */
    public static class Module extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("multi_refund_fee_d_t_o_s")
        private java.util.List < MultiRefundFeeDTOS> multiRefundFeeDTOS;

        @com.aliyun.core.annotation.NameInMap("pre_refund_money")
        private Long preRefundMoney;

        @com.aliyun.core.annotation.NameInMap("refund_charge_fee")
        private Long refundChargeFee;

        @com.aliyun.core.annotation.NameInMap("refund_reason_option_d_t_o_s")
        private java.util.List < RefundReasonOptionDTOS> refundReasonOptionDTOS;

        @com.aliyun.core.annotation.NameInMap("service_charge_fee")
        private Long serviceChargeFee;

        private Module(Builder builder) {
            this.multiRefundFeeDTOS = builder.multiRefundFeeDTOS;
            this.preRefundMoney = builder.preRefundMoney;
            this.refundChargeFee = builder.refundChargeFee;
            this.refundReasonOptionDTOS = builder.refundReasonOptionDTOS;
            this.serviceChargeFee = builder.serviceChargeFee;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Module create() {
            return builder().build();
        }

        /**
         * @return multiRefundFeeDTOS
         */
        public java.util.List < MultiRefundFeeDTOS> getMultiRefundFeeDTOS() {
            return this.multiRefundFeeDTOS;
        }

        /**
         * @return preRefundMoney
         */
        public Long getPreRefundMoney() {
            return this.preRefundMoney;
        }

        /**
         * @return refundChargeFee
         */
        public Long getRefundChargeFee() {
            return this.refundChargeFee;
        }

        /**
         * @return refundReasonOptionDTOS
         */
        public java.util.List < RefundReasonOptionDTOS> getRefundReasonOptionDTOS() {
            return this.refundReasonOptionDTOS;
        }

        /**
         * @return serviceChargeFee
         */
        public Long getServiceChargeFee() {
            return this.serviceChargeFee;
        }

        public static final class Builder {
            private java.util.List < MultiRefundFeeDTOS> multiRefundFeeDTOS; 
            private Long preRefundMoney; 
            private Long refundChargeFee; 
            private java.util.List < RefundReasonOptionDTOS> refundReasonOptionDTOS; 
            private Long serviceChargeFee; 

            /**
             * multi_refund_fee_d_t_o_s.
             */
            public Builder multiRefundFeeDTOS(java.util.List < MultiRefundFeeDTOS> multiRefundFeeDTOS) {
                this.multiRefundFeeDTOS = multiRefundFeeDTOS;
                return this;
            }

            /**
             * pre_refund_money.
             */
            public Builder preRefundMoney(Long preRefundMoney) {
                this.preRefundMoney = preRefundMoney;
                return this;
            }

            /**
             * refund_charge_fee.
             */
            public Builder refundChargeFee(Long refundChargeFee) {
                this.refundChargeFee = refundChargeFee;
                return this;
            }

            /**
             * refund_reason_option_d_t_o_s.
             */
            public Builder refundReasonOptionDTOS(java.util.List < RefundReasonOptionDTOS> refundReasonOptionDTOS) {
                this.refundReasonOptionDTOS = refundReasonOptionDTOS;
                return this;
            }

            /**
             * service_charge_fee.
             */
            public Builder serviceChargeFee(Long serviceChargeFee) {
                this.serviceChargeFee = serviceChargeFee;
                return this;
            }

            public Module build() {
                return new Module(this);
            } 

        } 

    }
}
