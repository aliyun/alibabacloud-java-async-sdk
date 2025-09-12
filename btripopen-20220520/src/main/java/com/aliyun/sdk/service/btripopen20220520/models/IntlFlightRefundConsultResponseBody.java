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
 * {@link IntlFlightRefundConsultResponseBody} extends {@link TeaModel}
 *
 * <p>IntlFlightRefundConsultResponseBody</p>
 */
public class IntlFlightRefundConsultResponseBody extends TeaModel {
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

    private IntlFlightRefundConsultResponseBody(Builder builder) {
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

    public static IntlFlightRefundConsultResponseBody create() {
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

        private Builder(IntlFlightRefundConsultResponseBody model) {
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

        public IntlFlightRefundConsultResponseBody build() {
            return new IntlFlightRefundConsultResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link IntlFlightRefundConsultResponseBody} extends {@link TeaModel}
     *
     * <p>IntlFlightRefundConsultResponseBody</p>
     */
    public static class PassengerList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("full_name")
        private String fullName;

        @com.aliyun.core.annotation.NameInMap("passenger_id")
        private Long passengerId;

        private PassengerList(Builder builder) {
            this.fullName = builder.fullName;
            this.passengerId = builder.passengerId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PassengerList create() {
            return builder().build();
        }

        /**
         * @return fullName
         */
        public String getFullName() {
            return this.fullName;
        }

        /**
         * @return passengerId
         */
        public Long getPassengerId() {
            return this.passengerId;
        }

        public static final class Builder {
            private String fullName; 
            private Long passengerId; 

            private Builder() {
            } 

            private Builder(PassengerList model) {
                this.fullName = model.fullName;
                this.passengerId = model.passengerId;
            } 

            /**
             * full_name.
             */
            public Builder fullName(String fullName) {
                this.fullName = fullName;
                return this;
            }

            /**
             * passenger_id.
             */
            public Builder passengerId(Long passengerId) {
                this.passengerId = passengerId;
                return this;
            }

            public PassengerList build() {
                return new PassengerList(this);
            } 

        } 

    }
    /**
     * 
     * {@link IntlFlightRefundConsultResponseBody} extends {@link TeaModel}
     *
     * <p>IntlFlightRefundConsultResponseBody</p>
     */
    public static class PassengerSegmentStatusInfoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("can_refund")
        private Boolean canRefund;

        @com.aliyun.core.annotation.NameInMap("passenger_id")
        private Long passengerId;

        @com.aliyun.core.annotation.NameInMap("segment_key")
        private String segmentKey;

        @com.aliyun.core.annotation.NameInMap("un_refund_reason")
        private String unRefundReason;

        @com.aliyun.core.annotation.NameInMap("un_refund_reason_code")
        private String unRefundReasonCode;

        private PassengerSegmentStatusInfoList(Builder builder) {
            this.canRefund = builder.canRefund;
            this.passengerId = builder.passengerId;
            this.segmentKey = builder.segmentKey;
            this.unRefundReason = builder.unRefundReason;
            this.unRefundReasonCode = builder.unRefundReasonCode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PassengerSegmentStatusInfoList create() {
            return builder().build();
        }

        /**
         * @return canRefund
         */
        public Boolean getCanRefund() {
            return this.canRefund;
        }

        /**
         * @return passengerId
         */
        public Long getPassengerId() {
            return this.passengerId;
        }

        /**
         * @return segmentKey
         */
        public String getSegmentKey() {
            return this.segmentKey;
        }

        /**
         * @return unRefundReason
         */
        public String getUnRefundReason() {
            return this.unRefundReason;
        }

        /**
         * @return unRefundReasonCode
         */
        public String getUnRefundReasonCode() {
            return this.unRefundReasonCode;
        }

        public static final class Builder {
            private Boolean canRefund; 
            private Long passengerId; 
            private String segmentKey; 
            private String unRefundReason; 
            private String unRefundReasonCode; 

            private Builder() {
            } 

            private Builder(PassengerSegmentStatusInfoList model) {
                this.canRefund = model.canRefund;
                this.passengerId = model.passengerId;
                this.segmentKey = model.segmentKey;
                this.unRefundReason = model.unRefundReason;
                this.unRefundReasonCode = model.unRefundReasonCode;
            } 

            /**
             * can_refund.
             */
            public Builder canRefund(Boolean canRefund) {
                this.canRefund = canRefund;
                return this;
            }

            /**
             * passenger_id.
             */
            public Builder passengerId(Long passengerId) {
                this.passengerId = passengerId;
                return this;
            }

            /**
             * segment_key.
             */
            public Builder segmentKey(String segmentKey) {
                this.segmentKey = segmentKey;
                return this;
            }

            /**
             * un_refund_reason.
             */
            public Builder unRefundReason(String unRefundReason) {
                this.unRefundReason = unRefundReason;
                return this;
            }

            /**
             * un_refund_reason_code.
             */
            public Builder unRefundReasonCode(String unRefundReasonCode) {
                this.unRefundReasonCode = unRefundReasonCode;
                return this;
            }

            public PassengerSegmentStatusInfoList build() {
                return new PassengerSegmentStatusInfoList(this);
            } 

        } 

    }
    /**
     * 
     * {@link IntlFlightRefundConsultResponseBody} extends {@link TeaModel}
     *
     * <p>IntlFlightRefundConsultResponseBody</p>
     */
    public static class RefundReasonInfoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("reason_code")
        private String reasonCode;

        @com.aliyun.core.annotation.NameInMap("reason_desc")
        private String reasonDesc;

        @com.aliyun.core.annotation.NameInMap("voluntary")
        private Boolean voluntary;

        private RefundReasonInfoList(Builder builder) {
            this.reasonCode = builder.reasonCode;
            this.reasonDesc = builder.reasonDesc;
            this.voluntary = builder.voluntary;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RefundReasonInfoList create() {
            return builder().build();
        }

        /**
         * @return reasonCode
         */
        public String getReasonCode() {
            return this.reasonCode;
        }

        /**
         * @return reasonDesc
         */
        public String getReasonDesc() {
            return this.reasonDesc;
        }

        /**
         * @return voluntary
         */
        public Boolean getVoluntary() {
            return this.voluntary;
        }

        public static final class Builder {
            private String reasonCode; 
            private String reasonDesc; 
            private Boolean voluntary; 

            private Builder() {
            } 

            private Builder(RefundReasonInfoList model) {
                this.reasonCode = model.reasonCode;
                this.reasonDesc = model.reasonDesc;
                this.voluntary = model.voluntary;
            } 

            /**
             * reason_code.
             */
            public Builder reasonCode(String reasonCode) {
                this.reasonCode = reasonCode;
                return this;
            }

            /**
             * reason_desc.
             */
            public Builder reasonDesc(String reasonDesc) {
                this.reasonDesc = reasonDesc;
                return this;
            }

            /**
             * voluntary.
             */
            public Builder voluntary(Boolean voluntary) {
                this.voluntary = voluntary;
                return this;
            }

            public RefundReasonInfoList build() {
                return new RefundReasonInfoList(this);
            } 

        } 

    }
    /**
     * 
     * {@link IntlFlightRefundConsultResponseBody} extends {@link TeaModel}
     *
     * <p>IntlFlightRefundConsultResponseBody</p>
     */
    public static class SegmentList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("arr_city_code")
        private String arrCityCode;

        @com.aliyun.core.annotation.NameInMap("dep_city_code")
        private String depCityCode;

        @com.aliyun.core.annotation.NameInMap("dep_time")
        private String depTime;

        @com.aliyun.core.annotation.NameInMap("flight_no")
        private String flightNo;

        @com.aliyun.core.annotation.NameInMap("journey_index")
        private Integer journeyIndex;

        @com.aliyun.core.annotation.NameInMap("segment_index")
        private Integer segmentIndex;

        @com.aliyun.core.annotation.NameInMap("segment_key")
        private String segmentKey;

        private SegmentList(Builder builder) {
            this.arrCityCode = builder.arrCityCode;
            this.depCityCode = builder.depCityCode;
            this.depTime = builder.depTime;
            this.flightNo = builder.flightNo;
            this.journeyIndex = builder.journeyIndex;
            this.segmentIndex = builder.segmentIndex;
            this.segmentKey = builder.segmentKey;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SegmentList create() {
            return builder().build();
        }

        /**
         * @return arrCityCode
         */
        public String getArrCityCode() {
            return this.arrCityCode;
        }

        /**
         * @return depCityCode
         */
        public String getDepCityCode() {
            return this.depCityCode;
        }

        /**
         * @return depTime
         */
        public String getDepTime() {
            return this.depTime;
        }

        /**
         * @return flightNo
         */
        public String getFlightNo() {
            return this.flightNo;
        }

        /**
         * @return journeyIndex
         */
        public Integer getJourneyIndex() {
            return this.journeyIndex;
        }

        /**
         * @return segmentIndex
         */
        public Integer getSegmentIndex() {
            return this.segmentIndex;
        }

        /**
         * @return segmentKey
         */
        public String getSegmentKey() {
            return this.segmentKey;
        }

        public static final class Builder {
            private String arrCityCode; 
            private String depCityCode; 
            private String depTime; 
            private String flightNo; 
            private Integer journeyIndex; 
            private Integer segmentIndex; 
            private String segmentKey; 

            private Builder() {
            } 

            private Builder(SegmentList model) {
                this.arrCityCode = model.arrCityCode;
                this.depCityCode = model.depCityCode;
                this.depTime = model.depTime;
                this.flightNo = model.flightNo;
                this.journeyIndex = model.journeyIndex;
                this.segmentIndex = model.segmentIndex;
                this.segmentKey = model.segmentKey;
            } 

            /**
             * arr_city_code.
             */
            public Builder arrCityCode(String arrCityCode) {
                this.arrCityCode = arrCityCode;
                return this;
            }

            /**
             * dep_city_code.
             */
            public Builder depCityCode(String depCityCode) {
                this.depCityCode = depCityCode;
                return this;
            }

            /**
             * dep_time.
             */
            public Builder depTime(String depTime) {
                this.depTime = depTime;
                return this;
            }

            /**
             * flight_no.
             */
            public Builder flightNo(String flightNo) {
                this.flightNo = flightNo;
                return this;
            }

            /**
             * journey_index.
             */
            public Builder journeyIndex(Integer journeyIndex) {
                this.journeyIndex = journeyIndex;
                return this;
            }

            /**
             * segment_index.
             */
            public Builder segmentIndex(Integer segmentIndex) {
                this.segmentIndex = segmentIndex;
                return this;
            }

            /**
             * segment_key.
             */
            public Builder segmentKey(String segmentKey) {
                this.segmentKey = segmentKey;
                return this;
            }

            public SegmentList build() {
                return new SegmentList(this);
            } 

        } 

    }
    /**
     * 
     * {@link IntlFlightRefundConsultResponseBody} extends {@link TeaModel}
     *
     * <p>IntlFlightRefundConsultResponseBody</p>
     */
    public static class PassengerJourneyGroupInfoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("passenger_journey_group_key")
        private String passengerJourneyGroupKey;

        @com.aliyun.core.annotation.NameInMap("passenger_list")
        private java.util.List<PassengerList> passengerList;

        @com.aliyun.core.annotation.NameInMap("passenger_segment_status_info_list")
        private java.util.List<PassengerSegmentStatusInfoList> passengerSegmentStatusInfoList;

        @com.aliyun.core.annotation.NameInMap("refund_reason_info_list")
        private java.util.List<RefundReasonInfoList> refundReasonInfoList;

        @com.aliyun.core.annotation.NameInMap("segment_list")
        private java.util.List<SegmentList> segmentList;

        private PassengerJourneyGroupInfoList(Builder builder) {
            this.passengerJourneyGroupKey = builder.passengerJourneyGroupKey;
            this.passengerList = builder.passengerList;
            this.passengerSegmentStatusInfoList = builder.passengerSegmentStatusInfoList;
            this.refundReasonInfoList = builder.refundReasonInfoList;
            this.segmentList = builder.segmentList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PassengerJourneyGroupInfoList create() {
            return builder().build();
        }

        /**
         * @return passengerJourneyGroupKey
         */
        public String getPassengerJourneyGroupKey() {
            return this.passengerJourneyGroupKey;
        }

        /**
         * @return passengerList
         */
        public java.util.List<PassengerList> getPassengerList() {
            return this.passengerList;
        }

        /**
         * @return passengerSegmentStatusInfoList
         */
        public java.util.List<PassengerSegmentStatusInfoList> getPassengerSegmentStatusInfoList() {
            return this.passengerSegmentStatusInfoList;
        }

        /**
         * @return refundReasonInfoList
         */
        public java.util.List<RefundReasonInfoList> getRefundReasonInfoList() {
            return this.refundReasonInfoList;
        }

        /**
         * @return segmentList
         */
        public java.util.List<SegmentList> getSegmentList() {
            return this.segmentList;
        }

        public static final class Builder {
            private String passengerJourneyGroupKey; 
            private java.util.List<PassengerList> passengerList; 
            private java.util.List<PassengerSegmentStatusInfoList> passengerSegmentStatusInfoList; 
            private java.util.List<RefundReasonInfoList> refundReasonInfoList; 
            private java.util.List<SegmentList> segmentList; 

            private Builder() {
            } 

            private Builder(PassengerJourneyGroupInfoList model) {
                this.passengerJourneyGroupKey = model.passengerJourneyGroupKey;
                this.passengerList = model.passengerList;
                this.passengerSegmentStatusInfoList = model.passengerSegmentStatusInfoList;
                this.refundReasonInfoList = model.refundReasonInfoList;
                this.segmentList = model.segmentList;
            } 

            /**
             * passenger_journey_group_key.
             */
            public Builder passengerJourneyGroupKey(String passengerJourneyGroupKey) {
                this.passengerJourneyGroupKey = passengerJourneyGroupKey;
                return this;
            }

            /**
             * passenger_list.
             */
            public Builder passengerList(java.util.List<PassengerList> passengerList) {
                this.passengerList = passengerList;
                return this;
            }

            /**
             * passenger_segment_status_info_list.
             */
            public Builder passengerSegmentStatusInfoList(java.util.List<PassengerSegmentStatusInfoList> passengerSegmentStatusInfoList) {
                this.passengerSegmentStatusInfoList = passengerSegmentStatusInfoList;
                return this;
            }

            /**
             * refund_reason_info_list.
             */
            public Builder refundReasonInfoList(java.util.List<RefundReasonInfoList> refundReasonInfoList) {
                this.refundReasonInfoList = refundReasonInfoList;
                return this;
            }

            /**
             * segment_list.
             */
            public Builder segmentList(java.util.List<SegmentList> segmentList) {
                this.segmentList = segmentList;
                return this;
            }

            public PassengerJourneyGroupInfoList build() {
                return new PassengerJourneyGroupInfoList(this);
            } 

        } 

    }
    /**
     * 
     * {@link IntlFlightRefundConsultResponseBody} extends {@link TeaModel}
     *
     * <p>IntlFlightRefundConsultResponseBody</p>
     */
    public static class Module extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("passenger_journey_group_info_list")
        private java.util.List<PassengerJourneyGroupInfoList> passengerJourneyGroupInfoList;

        private Module(Builder builder) {
            this.passengerJourneyGroupInfoList = builder.passengerJourneyGroupInfoList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Module create() {
            return builder().build();
        }

        /**
         * @return passengerJourneyGroupInfoList
         */
        public java.util.List<PassengerJourneyGroupInfoList> getPassengerJourneyGroupInfoList() {
            return this.passengerJourneyGroupInfoList;
        }

        public static final class Builder {
            private java.util.List<PassengerJourneyGroupInfoList> passengerJourneyGroupInfoList; 

            private Builder() {
            } 

            private Builder(Module model) {
                this.passengerJourneyGroupInfoList = model.passengerJourneyGroupInfoList;
            } 

            /**
             * passenger_journey_group_info_list.
             */
            public Builder passengerJourneyGroupInfoList(java.util.List<PassengerJourneyGroupInfoList> passengerJourneyGroupInfoList) {
                this.passengerJourneyGroupInfoList = passengerJourneyGroupInfoList;
                return this;
            }

            public Module build() {
                return new Module(this);
            } 

        } 

    }
}
