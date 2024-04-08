// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link WaitApplyInvoiceTaskDetailQueryResponseBody} extends {@link TeaModel}
 *
 * <p>WaitApplyInvoiceTaskDetailQueryResponseBody</p>
 */
public class WaitApplyInvoiceTaskDetailQueryResponseBody extends TeaModel {
    @NameInMap("code")
    private String code;

    @NameInMap("message")
    private String message;

    @NameInMap("module")
    private java.util.List < Module> module;

    @NameInMap("requestId")
    private String requestId;

    @NameInMap("success")
    private Boolean success;

    @NameInMap("traceId")
    private String traceId;

    private WaitApplyInvoiceTaskDetailQueryResponseBody(Builder builder) {
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

    public static WaitApplyInvoiceTaskDetailQueryResponseBody create() {
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
    public java.util.List < Module> getModule() {
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
        private java.util.List < Module> module; 
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
        public Builder module(java.util.List < Module> module) {
            this.module = module;
            return this;
        }

        /**
         * requestId
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
         * traceId
         */
        public Builder traceId(String traceId) {
            this.traceId = traceId;
            return this;
        }

        public WaitApplyInvoiceTaskDetailQueryResponseBody build() {
            return new WaitApplyInvoiceTaskDetailQueryResponseBody(this);
        } 

    } 

    public static class Module extends TeaModel {
        @NameInMap("contact")
        private String contact;

        @NameInMap("email")
        private String email;

        @NameInMap("flight_invoice_fee")
        private String flightInvoiceFee;

        @NameInMap("fu_point_invoice_fee")
        private String fuPointInvoiceFee;

        @NameInMap("hotel_normal_invoice_fee")
        private String hotelNormalInvoiceFee;

        @NameInMap("hotel_special_invoice_fee")
        private String hotelSpecialInvoiceFee;

        @NameInMap("international_flight_invoice_fee")
        private String internationalFlightInvoiceFee;

        @NameInMap("international_hotel_invoice_fee")
        private String internationalHotelInvoiceFee;

        @NameInMap("invoice_third_part_id")
        private String invoiceThirdPartId;

        @NameInMap("invoice_title")
        private String invoiceTitle;

        @NameInMap("mail_address")
        private String mailAddress;

        @NameInMap("mail_city")
        private String mailCity;

        @NameInMap("mail_full_address")
        private String mailFullAddress;

        @NameInMap("mail_province")
        private String mailProvince;

        @NameInMap("meal_normal_invoice_fee")
        private String mealNormalInvoiceFee;

        @NameInMap("penalty_fee")
        private String penaltyFee;

        @NameInMap("remark")
        private String remark;

        @NameInMap("service_fee")
        private String serviceFee;

        @NameInMap("telephone")
        private String telephone;

        @NameInMap("train_invoice_fee")
        private String trainInvoiceFee;

        @NameInMap("vehicle_invoice_fee")
        private String vehicleInvoiceFee;

        private Module(Builder builder) {
            this.contact = builder.contact;
            this.email = builder.email;
            this.flightInvoiceFee = builder.flightInvoiceFee;
            this.fuPointInvoiceFee = builder.fuPointInvoiceFee;
            this.hotelNormalInvoiceFee = builder.hotelNormalInvoiceFee;
            this.hotelSpecialInvoiceFee = builder.hotelSpecialInvoiceFee;
            this.internationalFlightInvoiceFee = builder.internationalFlightInvoiceFee;
            this.internationalHotelInvoiceFee = builder.internationalHotelInvoiceFee;
            this.invoiceThirdPartId = builder.invoiceThirdPartId;
            this.invoiceTitle = builder.invoiceTitle;
            this.mailAddress = builder.mailAddress;
            this.mailCity = builder.mailCity;
            this.mailFullAddress = builder.mailFullAddress;
            this.mailProvince = builder.mailProvince;
            this.mealNormalInvoiceFee = builder.mealNormalInvoiceFee;
            this.penaltyFee = builder.penaltyFee;
            this.remark = builder.remark;
            this.serviceFee = builder.serviceFee;
            this.telephone = builder.telephone;
            this.trainInvoiceFee = builder.trainInvoiceFee;
            this.vehicleInvoiceFee = builder.vehicleInvoiceFee;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Module create() {
            return builder().build();
        }

        /**
         * @return contact
         */
        public String getContact() {
            return this.contact;
        }

        /**
         * @return email
         */
        public String getEmail() {
            return this.email;
        }

        /**
         * @return flightInvoiceFee
         */
        public String getFlightInvoiceFee() {
            return this.flightInvoiceFee;
        }

        /**
         * @return fuPointInvoiceFee
         */
        public String getFuPointInvoiceFee() {
            return this.fuPointInvoiceFee;
        }

        /**
         * @return hotelNormalInvoiceFee
         */
        public String getHotelNormalInvoiceFee() {
            return this.hotelNormalInvoiceFee;
        }

        /**
         * @return hotelSpecialInvoiceFee
         */
        public String getHotelSpecialInvoiceFee() {
            return this.hotelSpecialInvoiceFee;
        }

        /**
         * @return internationalFlightInvoiceFee
         */
        public String getInternationalFlightInvoiceFee() {
            return this.internationalFlightInvoiceFee;
        }

        /**
         * @return internationalHotelInvoiceFee
         */
        public String getInternationalHotelInvoiceFee() {
            return this.internationalHotelInvoiceFee;
        }

        /**
         * @return invoiceThirdPartId
         */
        public String getInvoiceThirdPartId() {
            return this.invoiceThirdPartId;
        }

        /**
         * @return invoiceTitle
         */
        public String getInvoiceTitle() {
            return this.invoiceTitle;
        }

        /**
         * @return mailAddress
         */
        public String getMailAddress() {
            return this.mailAddress;
        }

        /**
         * @return mailCity
         */
        public String getMailCity() {
            return this.mailCity;
        }

        /**
         * @return mailFullAddress
         */
        public String getMailFullAddress() {
            return this.mailFullAddress;
        }

        /**
         * @return mailProvince
         */
        public String getMailProvince() {
            return this.mailProvince;
        }

        /**
         * @return mealNormalInvoiceFee
         */
        public String getMealNormalInvoiceFee() {
            return this.mealNormalInvoiceFee;
        }

        /**
         * @return penaltyFee
         */
        public String getPenaltyFee() {
            return this.penaltyFee;
        }

        /**
         * @return remark
         */
        public String getRemark() {
            return this.remark;
        }

        /**
         * @return serviceFee
         */
        public String getServiceFee() {
            return this.serviceFee;
        }

        /**
         * @return telephone
         */
        public String getTelephone() {
            return this.telephone;
        }

        /**
         * @return trainInvoiceFee
         */
        public String getTrainInvoiceFee() {
            return this.trainInvoiceFee;
        }

        /**
         * @return vehicleInvoiceFee
         */
        public String getVehicleInvoiceFee() {
            return this.vehicleInvoiceFee;
        }

        public static final class Builder {
            private String contact; 
            private String email; 
            private String flightInvoiceFee; 
            private String fuPointInvoiceFee; 
            private String hotelNormalInvoiceFee; 
            private String hotelSpecialInvoiceFee; 
            private String internationalFlightInvoiceFee; 
            private String internationalHotelInvoiceFee; 
            private String invoiceThirdPartId; 
            private String invoiceTitle; 
            private String mailAddress; 
            private String mailCity; 
            private String mailFullAddress; 
            private String mailProvince; 
            private String mealNormalInvoiceFee; 
            private String penaltyFee; 
            private String remark; 
            private String serviceFee; 
            private String telephone; 
            private String trainInvoiceFee; 
            private String vehicleInvoiceFee; 

            /**
             * contact.
             */
            public Builder contact(String contact) {
                this.contact = contact;
                return this;
            }

            /**
             * email.
             */
            public Builder email(String email) {
                this.email = email;
                return this;
            }

            /**
             * flight_invoice_fee.
             */
            public Builder flightInvoiceFee(String flightInvoiceFee) {
                this.flightInvoiceFee = flightInvoiceFee;
                return this;
            }

            /**
             * fu_point_invoice_fee.
             */
            public Builder fuPointInvoiceFee(String fuPointInvoiceFee) {
                this.fuPointInvoiceFee = fuPointInvoiceFee;
                return this;
            }

            /**
             * hotel_normal_invoice_fee.
             */
            public Builder hotelNormalInvoiceFee(String hotelNormalInvoiceFee) {
                this.hotelNormalInvoiceFee = hotelNormalInvoiceFee;
                return this;
            }

            /**
             * hotel_special_invoice_fee.
             */
            public Builder hotelSpecialInvoiceFee(String hotelSpecialInvoiceFee) {
                this.hotelSpecialInvoiceFee = hotelSpecialInvoiceFee;
                return this;
            }

            /**
             * international_flight_invoice_fee.
             */
            public Builder internationalFlightInvoiceFee(String internationalFlightInvoiceFee) {
                this.internationalFlightInvoiceFee = internationalFlightInvoiceFee;
                return this;
            }

            /**
             * international_hotel_invoice_fee.
             */
            public Builder internationalHotelInvoiceFee(String internationalHotelInvoiceFee) {
                this.internationalHotelInvoiceFee = internationalHotelInvoiceFee;
                return this;
            }

            /**
             * invoice_third_part_id.
             */
            public Builder invoiceThirdPartId(String invoiceThirdPartId) {
                this.invoiceThirdPartId = invoiceThirdPartId;
                return this;
            }

            /**
             * invoice_title.
             */
            public Builder invoiceTitle(String invoiceTitle) {
                this.invoiceTitle = invoiceTitle;
                return this;
            }

            /**
             * mail_address.
             */
            public Builder mailAddress(String mailAddress) {
                this.mailAddress = mailAddress;
                return this;
            }

            /**
             * mail_city.
             */
            public Builder mailCity(String mailCity) {
                this.mailCity = mailCity;
                return this;
            }

            /**
             * mail_full_address.
             */
            public Builder mailFullAddress(String mailFullAddress) {
                this.mailFullAddress = mailFullAddress;
                return this;
            }

            /**
             * mail_province.
             */
            public Builder mailProvince(String mailProvince) {
                this.mailProvince = mailProvince;
                return this;
            }

            /**
             * meal_normal_invoice_fee.
             */
            public Builder mealNormalInvoiceFee(String mealNormalInvoiceFee) {
                this.mealNormalInvoiceFee = mealNormalInvoiceFee;
                return this;
            }

            /**
             * penalty_fee.
             */
            public Builder penaltyFee(String penaltyFee) {
                this.penaltyFee = penaltyFee;
                return this;
            }

            /**
             * remark.
             */
            public Builder remark(String remark) {
                this.remark = remark;
                return this;
            }

            /**
             * service_fee.
             */
            public Builder serviceFee(String serviceFee) {
                this.serviceFee = serviceFee;
                return this;
            }

            /**
             * telephone.
             */
            public Builder telephone(String telephone) {
                this.telephone = telephone;
                return this;
            }

            /**
             * train_invoice_fee.
             */
            public Builder trainInvoiceFee(String trainInvoiceFee) {
                this.trainInvoiceFee = trainInvoiceFee;
                return this;
            }

            /**
             * vehicle_invoice_fee.
             */
            public Builder vehicleInvoiceFee(String vehicleInvoiceFee) {
                this.vehicleInvoiceFee = vehicleInvoiceFee;
                return this;
            }

            public Module build() {
                return new Module(this);
            } 

        } 

    }
}
