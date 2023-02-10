// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link FlightItineraryScanQueryResponseBody} extends {@link TeaModel}
 *
 * <p>FlightItineraryScanQueryResponseBody</p>
 */
public class FlightItineraryScanQueryResponseBody extends TeaModel {
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

    private FlightItineraryScanQueryResponseBody(Builder builder) {
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

    public static FlightItineraryScanQueryResponseBody create() {
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

        public FlightItineraryScanQueryResponseBody build() {
            return new FlightItineraryScanQueryResponseBody(this);
        } 

    } 

    public static class Items extends TeaModel {
        @NameInMap("bill_date")
        private String billDate;

        @NameInMap("build")
        private String build;

        @NameInMap("cost_center")
        private String costCenter;

        @NameInMap("department")
        private String department;

        @NameInMap("fuel_surcharge")
        private String fuelSurcharge;

        @NameInMap("insurance")
        private String insurance;

        @NameInMap("invoice_title")
        private String invoiceTitle;

        @NameInMap("itinerary_num")
        private String itineraryNum;

        @NameInMap("order_id")
        private Long orderId;

        @NameInMap("oss_url")
        private String ossUrl;

        @NameInMap("passenger_name")
        private String passengerName;

        @NameInMap("project")
        private String project;

        @NameInMap("tax_amount")
        private String taxAmount;

        @NameInMap("tax_rate")
        private String taxRate;

        @NameInMap("ticket_no")
        private String ticketNo;

        @NameInMap("ticket_price")
        private String ticketPrice;

        @NameInMap("total_price")
        private String totalPrice;

        private Items(Builder builder) {
            this.billDate = builder.billDate;
            this.build = builder.build;
            this.costCenter = builder.costCenter;
            this.department = builder.department;
            this.fuelSurcharge = builder.fuelSurcharge;
            this.insurance = builder.insurance;
            this.invoiceTitle = builder.invoiceTitle;
            this.itineraryNum = builder.itineraryNum;
            this.orderId = builder.orderId;
            this.ossUrl = builder.ossUrl;
            this.passengerName = builder.passengerName;
            this.project = builder.project;
            this.taxAmount = builder.taxAmount;
            this.taxRate = builder.taxRate;
            this.ticketNo = builder.ticketNo;
            this.ticketPrice = builder.ticketPrice;
            this.totalPrice = builder.totalPrice;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return billDate
         */
        public String getBillDate() {
            return this.billDate;
        }

        /**
         * @return build
         */
        public String getBuild() {
            return this.build;
        }

        /**
         * @return costCenter
         */
        public String getCostCenter() {
            return this.costCenter;
        }

        /**
         * @return department
         */
        public String getDepartment() {
            return this.department;
        }

        /**
         * @return fuelSurcharge
         */
        public String getFuelSurcharge() {
            return this.fuelSurcharge;
        }

        /**
         * @return insurance
         */
        public String getInsurance() {
            return this.insurance;
        }

        /**
         * @return invoiceTitle
         */
        public String getInvoiceTitle() {
            return this.invoiceTitle;
        }

        /**
         * @return itineraryNum
         */
        public String getItineraryNum() {
            return this.itineraryNum;
        }

        /**
         * @return orderId
         */
        public Long getOrderId() {
            return this.orderId;
        }

        /**
         * @return ossUrl
         */
        public String getOssUrl() {
            return this.ossUrl;
        }

        /**
         * @return passengerName
         */
        public String getPassengerName() {
            return this.passengerName;
        }

        /**
         * @return project
         */
        public String getProject() {
            return this.project;
        }

        /**
         * @return taxAmount
         */
        public String getTaxAmount() {
            return this.taxAmount;
        }

        /**
         * @return taxRate
         */
        public String getTaxRate() {
            return this.taxRate;
        }

        /**
         * @return ticketNo
         */
        public String getTicketNo() {
            return this.ticketNo;
        }

        /**
         * @return ticketPrice
         */
        public String getTicketPrice() {
            return this.ticketPrice;
        }

        /**
         * @return totalPrice
         */
        public String getTotalPrice() {
            return this.totalPrice;
        }

        public static final class Builder {
            private String billDate; 
            private String build; 
            private String costCenter; 
            private String department; 
            private String fuelSurcharge; 
            private String insurance; 
            private String invoiceTitle; 
            private String itineraryNum; 
            private Long orderId; 
            private String ossUrl; 
            private String passengerName; 
            private String project; 
            private String taxAmount; 
            private String taxRate; 
            private String ticketNo; 
            private String ticketPrice; 
            private String totalPrice; 

            /**
             * 出账日
             */
            public Builder billDate(String billDate) {
                this.billDate = billDate;
                return this;
            }

            /**
             * 基建
             */
            public Builder build(String build) {
                this.build = build;
                return this;
            }

            /**
             * 成本中心
             */
            public Builder costCenter(String costCenter) {
                this.costCenter = costCenter;
                return this;
            }

            /**
             * 部门
             */
            public Builder department(String department) {
                this.department = department;
                return this;
            }

            /**
             * 燃油
             */
            public Builder fuelSurcharge(String fuelSurcharge) {
                this.fuelSurcharge = fuelSurcharge;
                return this;
            }

            /**
             * 保险
             */
            public Builder insurance(String insurance) {
                this.insurance = insurance;
                return this;
            }

            /**
             * 发票抬头
             */
            public Builder invoiceTitle(String invoiceTitle) {
                this.invoiceTitle = invoiceTitle;
                return this;
            }

            /**
             * 行程单号
             */
            public Builder itineraryNum(String itineraryNum) {
                this.itineraryNum = itineraryNum;
                return this;
            }

            /**
             * 商旅订单号
             */
            public Builder orderId(Long orderId) {
                this.orderId = orderId;
                return this;
            }

            /**
             * 图片下载url
             */
            public Builder ossUrl(String ossUrl) {
                this.ossUrl = ossUrl;
                return this;
            }

            /**
             * 旅客姓名
             */
            public Builder passengerName(String passengerName) {
                this.passengerName = passengerName;
                return this;
            }

            /**
             * 项目
             */
            public Builder project(String project) {
                this.project = project;
                return this;
            }

            /**
             * 税额
             */
            public Builder taxAmount(String taxAmount) {
                this.taxAmount = taxAmount;
                return this;
            }

            /**
             * 税率
             */
            public Builder taxRate(String taxRate) {
                this.taxRate = taxRate;
                return this;
            }

            /**
             * 票号
             */
            public Builder ticketNo(String ticketNo) {
                this.ticketNo = ticketNo;
                return this;
            }

            /**
             * 票价
             */
            public Builder ticketPrice(String ticketPrice) {
                this.ticketPrice = ticketPrice;
                return this;
            }

            /**
             * 总金额
             */
            public Builder totalPrice(String totalPrice) {
                this.totalPrice = totalPrice;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
    public static class Module extends TeaModel {
        @NameInMap("items")
        private java.util.List < Items> items;

        @NameInMap("page_no")
        private Integer pageNo;

        @NameInMap("page_size")
        private Integer pageSize;

        @NameInMap("total_page")
        private Integer totalPage;

        @NameInMap("total_size")
        private Integer totalSize;

        private Module(Builder builder) {
            this.items = builder.items;
            this.pageNo = builder.pageNo;
            this.pageSize = builder.pageSize;
            this.totalPage = builder.totalPage;
            this.totalSize = builder.totalSize;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Module create() {
            return builder().build();
        }

        /**
         * @return items
         */
        public java.util.List < Items> getItems() {
            return this.items;
        }

        /**
         * @return pageNo
         */
        public Integer getPageNo() {
            return this.pageNo;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return totalPage
         */
        public Integer getTotalPage() {
            return this.totalPage;
        }

        /**
         * @return totalSize
         */
        public Integer getTotalSize() {
            return this.totalSize;
        }

        public static final class Builder {
            private java.util.List < Items> items; 
            private Integer pageNo; 
            private Integer pageSize; 
            private Integer totalPage; 
            private Integer totalSize; 

            /**
             * items.
             */
            public Builder items(java.util.List < Items> items) {
                this.items = items;
                return this;
            }

            /**
             * page_no.
             */
            public Builder pageNo(Integer pageNo) {
                this.pageNo = pageNo;
                return this;
            }

            /**
             * page_size.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * total_page.
             */
            public Builder totalPage(Integer totalPage) {
                this.totalPage = totalPage;
                return this;
            }

            /**
             * total_size.
             */
            public Builder totalSize(Integer totalSize) {
                this.totalSize = totalSize;
                return this;
            }

            public Module build() {
                return new Module(this);
            } 

        } 

    }
}
