// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link FlightRefundPreCalResponseBody} extends {@link TeaModel}
 *
 * <p>FlightRefundPreCalResponseBody</p>
 */
public class FlightRefundPreCalResponseBody extends TeaModel {
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

    private FlightRefundPreCalResponseBody(Builder builder) {
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

    public static FlightRefundPreCalResponseBody create() {
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

        public FlightRefundPreCalResponseBody build() {
            return new FlightRefundPreCalResponseBody(this);
        } 

    } 

    public static class MultiRefundCalList extends TeaModel {
        @NameInMap("can_apply_refund")
        private Boolean canApplyRefund;

        @NameInMap("name")
        private String name;

        @NameInMap("pre_refund_money")
        private Long preRefundMoney;

        @NameInMap("refund_fee")
        private Long refundFee;

        @NameInMap("user_id")
        private String userId;

        private MultiRefundCalList(Builder builder) {
            this.canApplyRefund = builder.canApplyRefund;
            this.name = builder.name;
            this.preRefundMoney = builder.preRefundMoney;
            this.refundFee = builder.refundFee;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MultiRefundCalList create() {
            return builder().build();
        }

        /**
         * @return canApplyRefund
         */
        public Boolean getCanApplyRefund() {
            return this.canApplyRefund;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return preRefundMoney
         */
        public Long getPreRefundMoney() {
            return this.preRefundMoney;
        }

        /**
         * @return refundFee
         */
        public Long getRefundFee() {
            return this.refundFee;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private Boolean canApplyRefund; 
            private String name; 
            private Long preRefundMoney; 
            private Long refundFee; 
            private String userId; 

            /**
             * can_apply_refund.
             */
            public Builder canApplyRefund(Boolean canApplyRefund) {
                this.canApplyRefund = canApplyRefund;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
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
             * refund_fee.
             */
            public Builder refundFee(Long refundFee) {
                this.refundFee = refundFee;
                return this;
            }

            /**
             * user_id.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public MultiRefundCalList build() {
                return new MultiRefundCalList(this);
            } 

        } 

    }
    public static class ReturnReason extends TeaModel {
        @NameInMap("extend_desc")
        private String extendDesc;

        @NameInMap("person")
        private Integer person;

        @NameInMap("reason_code")
        private Integer reasonCode;

        @NameInMap("reason_show")
        private String reasonShow;

        @NameInMap("reason_type")
        private Integer reasonType;

        @NameInMap("volunteer")
        private Integer volunteer;

        private ReturnReason(Builder builder) {
            this.extendDesc = builder.extendDesc;
            this.person = builder.person;
            this.reasonCode = builder.reasonCode;
            this.reasonShow = builder.reasonShow;
            this.reasonType = builder.reasonType;
            this.volunteer = builder.volunteer;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ReturnReason create() {
            return builder().build();
        }

        /**
         * @return extendDesc
         */
        public String getExtendDesc() {
            return this.extendDesc;
        }

        /**
         * @return person
         */
        public Integer getPerson() {
            return this.person;
        }

        /**
         * @return reasonCode
         */
        public Integer getReasonCode() {
            return this.reasonCode;
        }

        /**
         * @return reasonShow
         */
        public String getReasonShow() {
            return this.reasonShow;
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
        public Integer getVolunteer() {
            return this.volunteer;
        }

        public static final class Builder {
            private String extendDesc; 
            private Integer person; 
            private Integer reasonCode; 
            private String reasonShow; 
            private Integer reasonType; 
            private Integer volunteer; 

            /**
             * extend_desc.
             */
            public Builder extendDesc(String extendDesc) {
                this.extendDesc = extendDesc;
                return this;
            }

            /**
             * person.
             */
            public Builder person(Integer person) {
                this.person = person;
                return this;
            }

            /**
             * reason_code.
             */
            public Builder reasonCode(Integer reasonCode) {
                this.reasonCode = reasonCode;
                return this;
            }

            /**
             * reason_show.
             */
            public Builder reasonShow(String reasonShow) {
                this.reasonShow = reasonShow;
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
            public Builder volunteer(Integer volunteer) {
                this.volunteer = volunteer;
                return this;
            }

            public ReturnReason build() {
                return new ReturnReason(this);
            } 

        } 

    }
    public static class Module extends TeaModel {
        @NameInMap("flight_change")
        private Boolean flightChange;

        @NameInMap("item_unit_id")
        private String itemUnitId;

        @NameInMap("multi_refund_cal_list")
        private java.util.List < MultiRefundCalList> multiRefundCalList;

        @NameInMap("pre_refund_money")
        private Long preRefundMoney;

        @NameInMap("refund_fee")
        private Long refundFee;

        @NameInMap("return_reason")
        private java.util.List < ReturnReason> returnReason;

        @NameInMap("session_id")
        private String sessionId;

        @NameInMap("tips")
        private String tips;

        private Module(Builder builder) {
            this.flightChange = builder.flightChange;
            this.itemUnitId = builder.itemUnitId;
            this.multiRefundCalList = builder.multiRefundCalList;
            this.preRefundMoney = builder.preRefundMoney;
            this.refundFee = builder.refundFee;
            this.returnReason = builder.returnReason;
            this.sessionId = builder.sessionId;
            this.tips = builder.tips;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Module create() {
            return builder().build();
        }

        /**
         * @return flightChange
         */
        public Boolean getFlightChange() {
            return this.flightChange;
        }

        /**
         * @return itemUnitId
         */
        public String getItemUnitId() {
            return this.itemUnitId;
        }

        /**
         * @return multiRefundCalList
         */
        public java.util.List < MultiRefundCalList> getMultiRefundCalList() {
            return this.multiRefundCalList;
        }

        /**
         * @return preRefundMoney
         */
        public Long getPreRefundMoney() {
            return this.preRefundMoney;
        }

        /**
         * @return refundFee
         */
        public Long getRefundFee() {
            return this.refundFee;
        }

        /**
         * @return returnReason
         */
        public java.util.List < ReturnReason> getReturnReason() {
            return this.returnReason;
        }

        /**
         * @return sessionId
         */
        public String getSessionId() {
            return this.sessionId;
        }

        /**
         * @return tips
         */
        public String getTips() {
            return this.tips;
        }

        public static final class Builder {
            private Boolean flightChange; 
            private String itemUnitId; 
            private java.util.List < MultiRefundCalList> multiRefundCalList; 
            private Long preRefundMoney; 
            private Long refundFee; 
            private java.util.List < ReturnReason> returnReason; 
            private String sessionId; 
            private String tips; 

            /**
             * flight_change.
             */
            public Builder flightChange(Boolean flightChange) {
                this.flightChange = flightChange;
                return this;
            }

            /**
             * item_unit_id.
             */
            public Builder itemUnitId(String itemUnitId) {
                this.itemUnitId = itemUnitId;
                return this;
            }

            /**
             * multi_refund_cal_list.
             */
            public Builder multiRefundCalList(java.util.List < MultiRefundCalList> multiRefundCalList) {
                this.multiRefundCalList = multiRefundCalList;
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
             * refund_fee.
             */
            public Builder refundFee(Long refundFee) {
                this.refundFee = refundFee;
                return this;
            }

            /**
             * return_reason.
             */
            public Builder returnReason(java.util.List < ReturnReason> returnReason) {
                this.returnReason = returnReason;
                return this;
            }

            /**
             * session_id.
             */
            public Builder sessionId(String sessionId) {
                this.sessionId = sessionId;
                return this;
            }

            /**
             * tips.
             */
            public Builder tips(String tips) {
                this.tips = tips;
                return this;
            }

            public Module build() {
                return new Module(this);
            } 

        } 

    }
}
