// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ApplyInvoiceTaskRequest} extends {@link RequestModel}
 *
 * <p>ApplyInvoiceTaskRequest</p>
 */
public class ApplyInvoiceTaskRequest extends Request {
    @Body
    @NameInMap("bill_date")
    @Validation(required = true)
    private String billDate;

    @Body
    @NameInMap("invoice_task_list")
    @Validation(required = true)
    private java.util.List < InvoiceTaskList> invoiceTaskList;

    @Header
    @NameInMap("x-acs-btrip-so-corp-token")
    private String xAcsBtripSoCorpToken;

    private ApplyInvoiceTaskRequest(Builder builder) {
        super(builder);
        this.billDate = builder.billDate;
        this.invoiceTaskList = builder.invoiceTaskList;
        this.xAcsBtripSoCorpToken = builder.xAcsBtripSoCorpToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ApplyInvoiceTaskRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return billDate
     */
    public String getBillDate() {
        return this.billDate;
    }

    /**
     * @return invoiceTaskList
     */
    public java.util.List < InvoiceTaskList> getInvoiceTaskList() {
        return this.invoiceTaskList;
    }

    /**
     * @return xAcsBtripSoCorpToken
     */
    public String getXAcsBtripSoCorpToken() {
        return this.xAcsBtripSoCorpToken;
    }

    public static final class Builder extends Request.Builder<ApplyInvoiceTaskRequest, Builder> {
        private String billDate; 
        private java.util.List < InvoiceTaskList> invoiceTaskList; 
        private String xAcsBtripSoCorpToken; 

        private Builder() {
            super();
        } 

        private Builder(ApplyInvoiceTaskRequest request) {
            super(request);
            this.billDate = request.billDate;
            this.invoiceTaskList = request.invoiceTaskList;
            this.xAcsBtripSoCorpToken = request.xAcsBtripSoCorpToken;
        } 

        /**
         * 出账日
         */
        public Builder billDate(String billDate) {
            this.putBodyParameter("bill_date", billDate);
            this.billDate = billDate;
            return this;
        }

        /**
         * 调整后的发票任务列表
         */
        public Builder invoiceTaskList(java.util.List < InvoiceTaskList> invoiceTaskList) {
            String invoiceTaskListShrink = shrink(invoiceTaskList, "invoice_task_list", "json");
            this.putBodyParameter("invoice_task_list", invoiceTaskListShrink);
            this.invoiceTaskList = invoiceTaskList;
            return this;
        }

        /**
         * x-acs-btrip-so-corp-token.
         */
        public Builder xAcsBtripSoCorpToken(String xAcsBtripSoCorpToken) {
            this.putHeaderParameter("x-acs-btrip-so-corp-token", xAcsBtripSoCorpToken);
            this.xAcsBtripSoCorpToken = xAcsBtripSoCorpToken;
            return this;
        }

        @Override
        public ApplyInvoiceTaskRequest build() {
            return new ApplyInvoiceTaskRequest(this);
        } 

    } 

    public static class InvoiceTaskList extends TeaModel {
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

        @NameInMap("invoice_third_part_id")
        @Validation(required = true)
        private String invoiceThirdPartId;

        @NameInMap("mail_address")
        private String mailAddress;

        @NameInMap("mail_city")
        private String mailCity;

        @NameInMap("mail_full_address")
        private String mailFullAddress;

        @NameInMap("mail_province")
        private String mailProvince;

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

        private InvoiceTaskList(Builder builder) {
            this.contact = builder.contact;
            this.email = builder.email;
            this.flightInvoiceFee = builder.flightInvoiceFee;
            this.fuPointInvoiceFee = builder.fuPointInvoiceFee;
            this.hotelNormalInvoiceFee = builder.hotelNormalInvoiceFee;
            this.hotelSpecialInvoiceFee = builder.hotelSpecialInvoiceFee;
            this.internationalFlightInvoiceFee = builder.internationalFlightInvoiceFee;
            this.invoiceThirdPartId = builder.invoiceThirdPartId;
            this.mailAddress = builder.mailAddress;
            this.mailCity = builder.mailCity;
            this.mailFullAddress = builder.mailFullAddress;
            this.mailProvince = builder.mailProvince;
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

        public static InvoiceTaskList create() {
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
         * @return invoiceThirdPartId
         */
        public String getInvoiceThirdPartId() {
            return this.invoiceThirdPartId;
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
            private String invoiceThirdPartId; 
            private String mailAddress; 
            private String mailCity; 
            private String mailFullAddress; 
            private String mailProvince; 
            private String penaltyFee; 
            private String remark; 
            private String serviceFee; 
            private String telephone; 
            private String trainInvoiceFee; 
            private String vehicleInvoiceFee; 

            /**
             * 收件人姓名
             */
            public Builder contact(String contact) {
                this.contact = contact;
                return this;
            }

            /**
             * 接收邮箱
             */
            public Builder email(String email) {
                this.email = email;
                return this;
            }

            /**
             * 国内机票-普票发票金额
             */
            public Builder flightInvoiceFee(String flightInvoiceFee) {
                this.flightInvoiceFee = flightInvoiceFee;
                return this;
            }

            /**
             * 福豆发票金额
             */
            public Builder fuPointInvoiceFee(String fuPointInvoiceFee) {
                this.fuPointInvoiceFee = fuPointInvoiceFee;
                return this;
            }

            /**
             * 酒店普票发票金额
             */
            public Builder hotelNormalInvoiceFee(String hotelNormalInvoiceFee) {
                this.hotelNormalInvoiceFee = hotelNormalInvoiceFee;
                return this;
            }

            /**
             * 酒店专票发票金额
             */
            public Builder hotelSpecialInvoiceFee(String hotelSpecialInvoiceFee) {
                this.hotelSpecialInvoiceFee = hotelSpecialInvoiceFee;
                return this;
            }

            /**
             * 国际机票-普票发票金额
             */
            public Builder internationalFlightInvoiceFee(String internationalFlightInvoiceFee) {
                this.internationalFlightInvoiceFee = internationalFlightInvoiceFee;
                return this;
            }

            /**
             * 发票抬头名称
             */
            public Builder invoiceThirdPartId(String invoiceThirdPartId) {
                this.invoiceThirdPartId = invoiceThirdPartId;
                return this;
            }

            /**
             * 邮寄地址-详情地址
             */
            public Builder mailAddress(String mailAddress) {
                this.mailAddress = mailAddress;
                return this;
            }

            /**
             * 邮寄地址-市
             */
            public Builder mailCity(String mailCity) {
                this.mailCity = mailCity;
                return this;
            }

            /**
             * 邮寄完整地址
             */
            public Builder mailFullAddress(String mailFullAddress) {
                this.mailFullAddress = mailFullAddress;
                return this;
            }

            /**
             * 邮寄地址-省
             */
            public Builder mailProvince(String mailProvince) {
                this.mailProvince = mailProvince;
                return this;
            }

            /**
             * 违约金发票金额
             */
            public Builder penaltyFee(String penaltyFee) {
                this.penaltyFee = penaltyFee;
                return this;
            }

            /**
             * 发票备注
             */
            public Builder remark(String remark) {
                this.remark = remark;
                return this;
            }

            /**
             * 服务费发票金额
             */
            public Builder serviceFee(String serviceFee) {
                this.serviceFee = serviceFee;
                return this;
            }

            /**
             * 收件人联系电话
             */
            public Builder telephone(String telephone) {
                this.telephone = telephone;
                return this;
            }

            /**
             * 火车票-普票发票金额
             */
            public Builder trainInvoiceFee(String trainInvoiceFee) {
                this.trainInvoiceFee = trainInvoiceFee;
                return this;
            }

            /**
             * 用车发票金额
             */
            public Builder vehicleInvoiceFee(String vehicleInvoiceFee) {
                this.vehicleInvoiceFee = vehicleInvoiceFee;
                return this;
            }

            public InvoiceTaskList build() {
                return new InvoiceTaskList(this);
            } 

        } 

    }
}
