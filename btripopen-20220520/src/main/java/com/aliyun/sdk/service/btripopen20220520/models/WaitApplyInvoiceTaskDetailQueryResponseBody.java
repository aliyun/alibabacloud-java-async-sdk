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
 * {@link WaitApplyInvoiceTaskDetailQueryResponseBody} extends {@link TeaModel}
 *
 * <p>WaitApplyInvoiceTaskDetailQueryResponseBody</p>
 */
public class WaitApplyInvoiceTaskDetailQueryResponseBody extends TeaModel {
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

        private Builder(WaitApplyInvoiceTaskDetailQueryResponseBody model) {
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
         * <p>requestId</p>
         * 
         * <strong>example:</strong>
         * <p>407543AF-2BD9-5890-BD92-9D1AB7218B27</p>
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
         * <p>210f079e16603757182131635d866a</p>
         */
        public Builder traceId(String traceId) {
            this.traceId = traceId;
            return this;
        }

        public WaitApplyInvoiceTaskDetailQueryResponseBody build() {
            return new WaitApplyInvoiceTaskDetailQueryResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link WaitApplyInvoiceTaskDetailQueryResponseBody} extends {@link TeaModel}
     *
     * <p>WaitApplyInvoiceTaskDetailQueryResponseBody</p>
     */
    public static class Module extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("contact")
        private String contact;

        @com.aliyun.core.annotation.NameInMap("email")
        private String email;

        @com.aliyun.core.annotation.NameInMap("flight_invoice_fee")
        private String flightInvoiceFee;

        @com.aliyun.core.annotation.NameInMap("fu_point_invoice_fee")
        private String fuPointInvoiceFee;

        @com.aliyun.core.annotation.NameInMap("hotel_normal_invoice_fee")
        private String hotelNormalInvoiceFee;

        @com.aliyun.core.annotation.NameInMap("hotel_special_invoice_fee")
        private String hotelSpecialInvoiceFee;

        @com.aliyun.core.annotation.NameInMap("international_flight_invoice_fee")
        private String internationalFlightInvoiceFee;

        @com.aliyun.core.annotation.NameInMap("international_hotel_invoice_fee")
        private String internationalHotelInvoiceFee;

        @com.aliyun.core.annotation.NameInMap("invoice_third_part_id")
        private String invoiceThirdPartId;

        @com.aliyun.core.annotation.NameInMap("invoice_title")
        private String invoiceTitle;

        @com.aliyun.core.annotation.NameInMap("mail_address")
        private String mailAddress;

        @com.aliyun.core.annotation.NameInMap("mail_city")
        private String mailCity;

        @com.aliyun.core.annotation.NameInMap("mail_full_address")
        private String mailFullAddress;

        @com.aliyun.core.annotation.NameInMap("mail_province")
        private String mailProvince;

        @com.aliyun.core.annotation.NameInMap("meal_normal_invoice_fee")
        private String mealNormalInvoiceFee;

        @com.aliyun.core.annotation.NameInMap("penalty_fee")
        private String penaltyFee;

        @com.aliyun.core.annotation.NameInMap("remark")
        private String remark;

        @com.aliyun.core.annotation.NameInMap("service_fee")
        private String serviceFee;

        @com.aliyun.core.annotation.NameInMap("telephone")
        private String telephone;

        @com.aliyun.core.annotation.NameInMap("train_acceleration_package_invoice_fee")
        private String trainAccelerationPackageInvoiceFee;

        @com.aliyun.core.annotation.NameInMap("train_invoice_fee")
        private String trainInvoiceFee;

        @com.aliyun.core.annotation.NameInMap("vacation_normal_invoice_fee")
        private String vacationNormalInvoiceFee;

        @com.aliyun.core.annotation.NameInMap("vas_mall_special_invoice_fee")
        private String vasMallSpecialInvoiceFee;

        @com.aliyun.core.annotation.NameInMap("vehicle_invoice_fee")
        private String vehicleInvoiceFee;

        @com.aliyun.core.annotation.NameInMap("vehicle_normal_invoice_fee")
        private String vehicleNormalInvoiceFee;

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
            this.trainAccelerationPackageInvoiceFee = builder.trainAccelerationPackageInvoiceFee;
            this.trainInvoiceFee = builder.trainInvoiceFee;
            this.vacationNormalInvoiceFee = builder.vacationNormalInvoiceFee;
            this.vasMallSpecialInvoiceFee = builder.vasMallSpecialInvoiceFee;
            this.vehicleInvoiceFee = builder.vehicleInvoiceFee;
            this.vehicleNormalInvoiceFee = builder.vehicleNormalInvoiceFee;
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
         * @return trainAccelerationPackageInvoiceFee
         */
        public String getTrainAccelerationPackageInvoiceFee() {
            return this.trainAccelerationPackageInvoiceFee;
        }

        /**
         * @return trainInvoiceFee
         */
        public String getTrainInvoiceFee() {
            return this.trainInvoiceFee;
        }

        /**
         * @return vacationNormalInvoiceFee
         */
        public String getVacationNormalInvoiceFee() {
            return this.vacationNormalInvoiceFee;
        }

        /**
         * @return vasMallSpecialInvoiceFee
         */
        public String getVasMallSpecialInvoiceFee() {
            return this.vasMallSpecialInvoiceFee;
        }

        /**
         * @return vehicleInvoiceFee
         */
        public String getVehicleInvoiceFee() {
            return this.vehicleInvoiceFee;
        }

        /**
         * @return vehicleNormalInvoiceFee
         */
        public String getVehicleNormalInvoiceFee() {
            return this.vehicleNormalInvoiceFee;
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
            private String trainAccelerationPackageInvoiceFee; 
            private String trainInvoiceFee; 
            private String vacationNormalInvoiceFee; 
            private String vasMallSpecialInvoiceFee; 
            private String vehicleInvoiceFee; 
            private String vehicleNormalInvoiceFee; 

            private Builder() {
            } 

            private Builder(Module model) {
                this.contact = model.contact;
                this.email = model.email;
                this.flightInvoiceFee = model.flightInvoiceFee;
                this.fuPointInvoiceFee = model.fuPointInvoiceFee;
                this.hotelNormalInvoiceFee = model.hotelNormalInvoiceFee;
                this.hotelSpecialInvoiceFee = model.hotelSpecialInvoiceFee;
                this.internationalFlightInvoiceFee = model.internationalFlightInvoiceFee;
                this.internationalHotelInvoiceFee = model.internationalHotelInvoiceFee;
                this.invoiceThirdPartId = model.invoiceThirdPartId;
                this.invoiceTitle = model.invoiceTitle;
                this.mailAddress = model.mailAddress;
                this.mailCity = model.mailCity;
                this.mailFullAddress = model.mailFullAddress;
                this.mailProvince = model.mailProvince;
                this.mealNormalInvoiceFee = model.mealNormalInvoiceFee;
                this.penaltyFee = model.penaltyFee;
                this.remark = model.remark;
                this.serviceFee = model.serviceFee;
                this.telephone = model.telephone;
                this.trainAccelerationPackageInvoiceFee = model.trainAccelerationPackageInvoiceFee;
                this.trainInvoiceFee = model.trainInvoiceFee;
                this.vacationNormalInvoiceFee = model.vacationNormalInvoiceFee;
                this.vasMallSpecialInvoiceFee = model.vasMallSpecialInvoiceFee;
                this.vehicleInvoiceFee = model.vehicleInvoiceFee;
                this.vehicleNormalInvoiceFee = model.vehicleNormalInvoiceFee;
            } 

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
             * train_acceleration_package_invoice_fee.
             */
            public Builder trainAccelerationPackageInvoiceFee(String trainAccelerationPackageInvoiceFee) {
                this.trainAccelerationPackageInvoiceFee = trainAccelerationPackageInvoiceFee;
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
             * vacation_normal_invoice_fee.
             */
            public Builder vacationNormalInvoiceFee(String vacationNormalInvoiceFee) {
                this.vacationNormalInvoiceFee = vacationNormalInvoiceFee;
                return this;
            }

            /**
             * vas_mall_special_invoice_fee.
             */
            public Builder vasMallSpecialInvoiceFee(String vasMallSpecialInvoiceFee) {
                this.vasMallSpecialInvoiceFee = vasMallSpecialInvoiceFee;
                return this;
            }

            /**
             * vehicle_invoice_fee.
             */
            public Builder vehicleInvoiceFee(String vehicleInvoiceFee) {
                this.vehicleInvoiceFee = vehicleInvoiceFee;
                return this;
            }

            /**
             * vehicle_normal_invoice_fee.
             */
            public Builder vehicleNormalInvoiceFee(String vehicleNormalInvoiceFee) {
                this.vehicleNormalInvoiceFee = vehicleNormalInvoiceFee;
                return this;
            }

            public Module build() {
                return new Module(this);
            } 

        } 

    }
}
