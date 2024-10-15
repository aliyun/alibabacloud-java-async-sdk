// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link InsureRefundDetailResponseBody} extends {@link TeaModel}
 *
 * <p>InsureRefundDetailResponseBody</p>
 */
public class InsureRefundDetailResponseBody extends TeaModel {
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

    private InsureRefundDetailResponseBody(Builder builder) {
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

    public static InsureRefundDetailResponseBody create() {
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

        public InsureRefundDetailResponseBody build() {
            return new InsureRefundDetailResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link InsureRefundDetailResponseBody} extends {@link TeaModel}
     *
     * <p>InsureRefundDetailResponseBody</p>
     */
    public static class Applicant extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("cert_name")
        private String certName;

        @com.aliyun.core.annotation.NameInMap("cert_no")
        private String certNo;

        @com.aliyun.core.annotation.NameInMap("cert_type")
        private String certType;

        @com.aliyun.core.annotation.NameInMap("phone")
        private String phone;

        private Applicant(Builder builder) {
            this.certName = builder.certName;
            this.certNo = builder.certNo;
            this.certType = builder.certType;
            this.phone = builder.phone;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Applicant create() {
            return builder().build();
        }

        /**
         * @return certName
         */
        public String getCertName() {
            return this.certName;
        }

        /**
         * @return certNo
         */
        public String getCertNo() {
            return this.certNo;
        }

        /**
         * @return certType
         */
        public String getCertType() {
            return this.certType;
        }

        /**
         * @return phone
         */
        public String getPhone() {
            return this.phone;
        }

        public static final class Builder {
            private String certName; 
            private String certNo; 
            private String certType; 
            private String phone; 

            /**
             * cert_name.
             */
            public Builder certName(String certName) {
                this.certName = certName;
                return this;
            }

            /**
             * cert_no.
             */
            public Builder certNo(String certNo) {
                this.certNo = certNo;
                return this;
            }

            /**
             * cert_type.
             */
            public Builder certType(String certType) {
                this.certType = certType;
                return this;
            }

            /**
             * phone.
             */
            public Builder phone(String phone) {
                this.phone = phone;
                return this;
            }

            public Applicant build() {
                return new Applicant(this);
            } 

        } 

    }
    /**
     * 
     * {@link InsureRefundDetailResponseBody} extends {@link TeaModel}
     *
     * <p>InsureRefundDetailResponseBody</p>
     */
    public static class InsureOrder extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("applicant")
        private Applicant applicant;

        @com.aliyun.core.annotation.NameInMap("biz_order_id")
        private String bizOrderId;

        @com.aliyun.core.annotation.NameInMap("biz_type")
        private Integer bizType;

        @com.aliyun.core.annotation.NameInMap("close_time")
        private String closeTime;

        @com.aliyun.core.annotation.NameInMap("ins_order_id")
        private String insOrderId;

        @com.aliyun.core.annotation.NameInMap("out_ins_order_id")
        private String outInsOrderId;

        @com.aliyun.core.annotation.NameInMap("pay_time")
        private String payTime;

        @com.aliyun.core.annotation.NameInMap("price")
        private Long price;

        @com.aliyun.core.annotation.NameInMap("settle_type")
        private Integer settleType;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        private InsureOrder(Builder builder) {
            this.applicant = builder.applicant;
            this.bizOrderId = builder.bizOrderId;
            this.bizType = builder.bizType;
            this.closeTime = builder.closeTime;
            this.insOrderId = builder.insOrderId;
            this.outInsOrderId = builder.outInsOrderId;
            this.payTime = builder.payTime;
            this.price = builder.price;
            this.settleType = builder.settleType;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InsureOrder create() {
            return builder().build();
        }

        /**
         * @return applicant
         */
        public Applicant getApplicant() {
            return this.applicant;
        }

        /**
         * @return bizOrderId
         */
        public String getBizOrderId() {
            return this.bizOrderId;
        }

        /**
         * @return bizType
         */
        public Integer getBizType() {
            return this.bizType;
        }

        /**
         * @return closeTime
         */
        public String getCloseTime() {
            return this.closeTime;
        }

        /**
         * @return insOrderId
         */
        public String getInsOrderId() {
            return this.insOrderId;
        }

        /**
         * @return outInsOrderId
         */
        public String getOutInsOrderId() {
            return this.outInsOrderId;
        }

        /**
         * @return payTime
         */
        public String getPayTime() {
            return this.payTime;
        }

        /**
         * @return price
         */
        public Long getPrice() {
            return this.price;
        }

        /**
         * @return settleType
         */
        public Integer getSettleType() {
            return this.settleType;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private Applicant applicant; 
            private String bizOrderId; 
            private Integer bizType; 
            private String closeTime; 
            private String insOrderId; 
            private String outInsOrderId; 
            private String payTime; 
            private Long price; 
            private Integer settleType; 
            private String status; 

            /**
             * applicant.
             */
            public Builder applicant(Applicant applicant) {
                this.applicant = applicant;
                return this;
            }

            /**
             * biz_order_id.
             */
            public Builder bizOrderId(String bizOrderId) {
                this.bizOrderId = bizOrderId;
                return this;
            }

            /**
             * biz_type.
             */
            public Builder bizType(Integer bizType) {
                this.bizType = bizType;
                return this;
            }

            /**
             * close_time.
             */
            public Builder closeTime(String closeTime) {
                this.closeTime = closeTime;
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
             * out_ins_order_id.
             */
            public Builder outInsOrderId(String outInsOrderId) {
                this.outInsOrderId = outInsOrderId;
                return this;
            }

            /**
             * pay_time.
             */
            public Builder payTime(String payTime) {
                this.payTime = payTime;
                return this;
            }

            /**
             * price.
             */
            public Builder price(Long price) {
                this.price = price;
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
             * status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public InsureOrder build() {
                return new InsureOrder(this);
            } 

        } 

    }
    /**
     * 
     * {@link InsureRefundDetailResponseBody} extends {@link TeaModel}
     *
     * <p>InsureRefundDetailResponseBody</p>
     */
    public static class InsureSegment extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("arr_airport_code")
        private String arrAirportCode;

        @com.aliyun.core.annotation.NameInMap("arr_city")
        private String arrCity;

        @com.aliyun.core.annotation.NameInMap("arr_city_code")
        private String arrCityCode;

        @com.aliyun.core.annotation.NameInMap("arr_time")
        private String arrTime;

        @com.aliyun.core.annotation.NameInMap("dep_airport_code")
        private String depAirportCode;

        @com.aliyun.core.annotation.NameInMap("dep_city")
        private String depCity;

        @com.aliyun.core.annotation.NameInMap("dep_city_code")
        private String depCityCode;

        @com.aliyun.core.annotation.NameInMap("dep_time")
        private String depTime;

        @com.aliyun.core.annotation.NameInMap("flight_no")
        private String flightNo;

        private InsureSegment(Builder builder) {
            this.arrAirportCode = builder.arrAirportCode;
            this.arrCity = builder.arrCity;
            this.arrCityCode = builder.arrCityCode;
            this.arrTime = builder.arrTime;
            this.depAirportCode = builder.depAirportCode;
            this.depCity = builder.depCity;
            this.depCityCode = builder.depCityCode;
            this.depTime = builder.depTime;
            this.flightNo = builder.flightNo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InsureSegment create() {
            return builder().build();
        }

        /**
         * @return arrAirportCode
         */
        public String getArrAirportCode() {
            return this.arrAirportCode;
        }

        /**
         * @return arrCity
         */
        public String getArrCity() {
            return this.arrCity;
        }

        /**
         * @return arrCityCode
         */
        public String getArrCityCode() {
            return this.arrCityCode;
        }

        /**
         * @return arrTime
         */
        public String getArrTime() {
            return this.arrTime;
        }

        /**
         * @return depAirportCode
         */
        public String getDepAirportCode() {
            return this.depAirportCode;
        }

        /**
         * @return depCity
         */
        public String getDepCity() {
            return this.depCity;
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

        public static final class Builder {
            private String arrAirportCode; 
            private String arrCity; 
            private String arrCityCode; 
            private String arrTime; 
            private String depAirportCode; 
            private String depCity; 
            private String depCityCode; 
            private String depTime; 
            private String flightNo; 

            /**
             * arr_airport_code.
             */
            public Builder arrAirportCode(String arrAirportCode) {
                this.arrAirportCode = arrAirportCode;
                return this;
            }

            /**
             * arr_city.
             */
            public Builder arrCity(String arrCity) {
                this.arrCity = arrCity;
                return this;
            }

            /**
             * arr_city_code.
             */
            public Builder arrCityCode(String arrCityCode) {
                this.arrCityCode = arrCityCode;
                return this;
            }

            /**
             * arr_time.
             */
            public Builder arrTime(String arrTime) {
                this.arrTime = arrTime;
                return this;
            }

            /**
             * dep_airport_code.
             */
            public Builder depAirportCode(String depAirportCode) {
                this.depAirportCode = depAirportCode;
                return this;
            }

            /**
             * dep_city.
             */
            public Builder depCity(String depCity) {
                this.depCity = depCity;
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

            public InsureSegment build() {
                return new InsureSegment(this);
            } 

        } 

    }
    /**
     * 
     * {@link InsureRefundDetailResponseBody} extends {@link TeaModel}
     *
     * <p>InsureRefundDetailResponseBody</p>
     */
    public static class Insured extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("birthday")
        private String birthday;

        @com.aliyun.core.annotation.NameInMap("btrip_user_id")
        private String btripUserId;

        @com.aliyun.core.annotation.NameInMap("cert_name")
        private String certName;

        @com.aliyun.core.annotation.NameInMap("cert_no")
        private String certNo;

        @com.aliyun.core.annotation.NameInMap("cert_type")
        private String certType;

        @com.aliyun.core.annotation.NameInMap("gender")
        private String gender;

        @com.aliyun.core.annotation.NameInMap("phone")
        private String phone;

        private Insured(Builder builder) {
            this.birthday = builder.birthday;
            this.btripUserId = builder.btripUserId;
            this.certName = builder.certName;
            this.certNo = builder.certNo;
            this.certType = builder.certType;
            this.gender = builder.gender;
            this.phone = builder.phone;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Insured create() {
            return builder().build();
        }

        /**
         * @return birthday
         */
        public String getBirthday() {
            return this.birthday;
        }

        /**
         * @return btripUserId
         */
        public String getBtripUserId() {
            return this.btripUserId;
        }

        /**
         * @return certName
         */
        public String getCertName() {
            return this.certName;
        }

        /**
         * @return certNo
         */
        public String getCertNo() {
            return this.certNo;
        }

        /**
         * @return certType
         */
        public String getCertType() {
            return this.certType;
        }

        /**
         * @return gender
         */
        public String getGender() {
            return this.gender;
        }

        /**
         * @return phone
         */
        public String getPhone() {
            return this.phone;
        }

        public static final class Builder {
            private String birthday; 
            private String btripUserId; 
            private String certName; 
            private String certNo; 
            private String certType; 
            private String gender; 
            private String phone; 

            /**
             * birthday.
             */
            public Builder birthday(String birthday) {
                this.birthday = birthday;
                return this;
            }

            /**
             * btrip_user_id.
             */
            public Builder btripUserId(String btripUserId) {
                this.btripUserId = btripUserId;
                return this;
            }

            /**
             * cert_name.
             */
            public Builder certName(String certName) {
                this.certName = certName;
                return this;
            }

            /**
             * cert_no.
             */
            public Builder certNo(String certNo) {
                this.certNo = certNo;
                return this;
            }

            /**
             * cert_type.
             */
            public Builder certType(String certType) {
                this.certType = certType;
                return this;
            }

            /**
             * gender.
             */
            public Builder gender(String gender) {
                this.gender = gender;
                return this;
            }

            /**
             * phone.
             */
            public Builder phone(String phone) {
                this.phone = phone;
                return this;
            }

            public Insured build() {
                return new Insured(this);
            } 

        } 

    }
    /**
     * 
     * {@link InsureRefundDetailResponseBody} extends {@link TeaModel}
     *
     * <p>InsureRefundDetailResponseBody</p>
     */
    public static class SubOrderRefundList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("effective_end_time")
        private String effectiveEndTime;

        @com.aliyun.core.annotation.NameInMap("effective_start_time")
        private String effectiveStartTime;

        @com.aliyun.core.annotation.NameInMap("insure_segment")
        private InsureSegment insureSegment;

        @com.aliyun.core.annotation.NameInMap("insure_time")
        private String insureTime;

        @com.aliyun.core.annotation.NameInMap("insured")
        private Insured insured;

        @com.aliyun.core.annotation.NameInMap("out_sub_ins_order_id")
        private String outSubInsOrderId;

        @com.aliyun.core.annotation.NameInMap("policy_no")
        private String policyNo;

        @com.aliyun.core.annotation.NameInMap("policy_refund_no")
        private String policyRefundNo;

        @com.aliyun.core.annotation.NameInMap("price")
        private Long price;

        @com.aliyun.core.annotation.NameInMap("product_name")
        private String productName;

        @com.aliyun.core.annotation.NameInMap("product_no")
        private String productNo;

        @com.aliyun.core.annotation.NameInMap("refund_status")
        private String refundStatus;

        @com.aliyun.core.annotation.NameInMap("refund_time")
        private String refundTime;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("sub_ins_order_id")
        private String subInsOrderId;

        private SubOrderRefundList(Builder builder) {
            this.effectiveEndTime = builder.effectiveEndTime;
            this.effectiveStartTime = builder.effectiveStartTime;
            this.insureSegment = builder.insureSegment;
            this.insureTime = builder.insureTime;
            this.insured = builder.insured;
            this.outSubInsOrderId = builder.outSubInsOrderId;
            this.policyNo = builder.policyNo;
            this.policyRefundNo = builder.policyRefundNo;
            this.price = builder.price;
            this.productName = builder.productName;
            this.productNo = builder.productNo;
            this.refundStatus = builder.refundStatus;
            this.refundTime = builder.refundTime;
            this.status = builder.status;
            this.subInsOrderId = builder.subInsOrderId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SubOrderRefundList create() {
            return builder().build();
        }

        /**
         * @return effectiveEndTime
         */
        public String getEffectiveEndTime() {
            return this.effectiveEndTime;
        }

        /**
         * @return effectiveStartTime
         */
        public String getEffectiveStartTime() {
            return this.effectiveStartTime;
        }

        /**
         * @return insureSegment
         */
        public InsureSegment getInsureSegment() {
            return this.insureSegment;
        }

        /**
         * @return insureTime
         */
        public String getInsureTime() {
            return this.insureTime;
        }

        /**
         * @return insured
         */
        public Insured getInsured() {
            return this.insured;
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
         * @return policyRefundNo
         */
        public String getPolicyRefundNo() {
            return this.policyRefundNo;
        }

        /**
         * @return price
         */
        public Long getPrice() {
            return this.price;
        }

        /**
         * @return productName
         */
        public String getProductName() {
            return this.productName;
        }

        /**
         * @return productNo
         */
        public String getProductNo() {
            return this.productNo;
        }

        /**
         * @return refundStatus
         */
        public String getRefundStatus() {
            return this.refundStatus;
        }

        /**
         * @return refundTime
         */
        public String getRefundTime() {
            return this.refundTime;
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
            private String effectiveEndTime; 
            private String effectiveStartTime; 
            private InsureSegment insureSegment; 
            private String insureTime; 
            private Insured insured; 
            private String outSubInsOrderId; 
            private String policyNo; 
            private String policyRefundNo; 
            private Long price; 
            private String productName; 
            private String productNo; 
            private String refundStatus; 
            private String refundTime; 
            private String status; 
            private String subInsOrderId; 

            /**
             * effective_end_time.
             */
            public Builder effectiveEndTime(String effectiveEndTime) {
                this.effectiveEndTime = effectiveEndTime;
                return this;
            }

            /**
             * effective_start_time.
             */
            public Builder effectiveStartTime(String effectiveStartTime) {
                this.effectiveStartTime = effectiveStartTime;
                return this;
            }

            /**
             * insure_segment.
             */
            public Builder insureSegment(InsureSegment insureSegment) {
                this.insureSegment = insureSegment;
                return this;
            }

            /**
             * insure_time.
             */
            public Builder insureTime(String insureTime) {
                this.insureTime = insureTime;
                return this;
            }

            /**
             * insured.
             */
            public Builder insured(Insured insured) {
                this.insured = insured;
                return this;
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
             * policy_refund_no.
             */
            public Builder policyRefundNo(String policyRefundNo) {
                this.policyRefundNo = policyRefundNo;
                return this;
            }

            /**
             * price.
             */
            public Builder price(Long price) {
                this.price = price;
                return this;
            }

            /**
             * product_name.
             */
            public Builder productName(String productName) {
                this.productName = productName;
                return this;
            }

            /**
             * product_no.
             */
            public Builder productNo(String productNo) {
                this.productNo = productNo;
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
             * refund_time.
             */
            public Builder refundTime(String refundTime) {
                this.refundTime = refundTime;
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

            public SubOrderRefundList build() {
                return new SubOrderRefundList(this);
            } 

        } 

    }
    /**
     * 
     * {@link InsureRefundDetailResponseBody} extends {@link TeaModel}
     *
     * <p>InsureRefundDetailResponseBody</p>
     */
    public static class Module extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("apply_id")
        private String applyId;

        @com.aliyun.core.annotation.NameInMap("gmt_create")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("gmt_modified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("ins_order_id")
        private String insOrderId;

        @com.aliyun.core.annotation.NameInMap("insure_order")
        private InsureOrder insureOrder;

        @com.aliyun.core.annotation.NameInMap("out_apply_id")
        private String outApplyId;

        @com.aliyun.core.annotation.NameInMap("sub_order_refund_list")
        private java.util.List < SubOrderRefundList> subOrderRefundList;

        private Module(Builder builder) {
            this.applyId = builder.applyId;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.insOrderId = builder.insOrderId;
            this.insureOrder = builder.insureOrder;
            this.outApplyId = builder.outApplyId;
            this.subOrderRefundList = builder.subOrderRefundList;
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
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return insOrderId
         */
        public String getInsOrderId() {
            return this.insOrderId;
        }

        /**
         * @return insureOrder
         */
        public InsureOrder getInsureOrder() {
            return this.insureOrder;
        }

        /**
         * @return outApplyId
         */
        public String getOutApplyId() {
            return this.outApplyId;
        }

        /**
         * @return subOrderRefundList
         */
        public java.util.List < SubOrderRefundList> getSubOrderRefundList() {
            return this.subOrderRefundList;
        }

        public static final class Builder {
            private String applyId; 
            private String gmtCreate; 
            private String gmtModified; 
            private String insOrderId; 
            private InsureOrder insureOrder; 
            private String outApplyId; 
            private java.util.List < SubOrderRefundList> subOrderRefundList; 

            /**
             * apply_id.
             */
            public Builder applyId(String applyId) {
                this.applyId = applyId;
                return this;
            }

            /**
             * gmt_create.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * gmt_modified.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
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
             * insure_order.
             */
            public Builder insureOrder(InsureOrder insureOrder) {
                this.insureOrder = insureOrder;
                return this;
            }

            /**
             * out_apply_id.
             */
            public Builder outApplyId(String outApplyId) {
                this.outApplyId = outApplyId;
                return this;
            }

            /**
             * sub_order_refund_list.
             */
            public Builder subOrderRefundList(java.util.List < SubOrderRefundList> subOrderRefundList) {
                this.subOrderRefundList = subOrderRefundList;
                return this;
            }

            public Module build() {
                return new Module(this);
            } 

        } 

    }
}
