// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TrainTicketScanQueryResponseBody} extends {@link TeaModel}
 *
 * <p>TrainTicketScanQueryResponseBody</p>
 */
public class TrainTicketScanQueryResponseBody extends TeaModel {
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

    private TrainTicketScanQueryResponseBody(Builder builder) {
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

    public static TrainTicketScanQueryResponseBody create() {
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

        public TrainTicketScanQueryResponseBody build() {
            return new TrainTicketScanQueryResponseBody(this);
        } 

    } 

    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("apply_id")
        private String applyId;

        @com.aliyun.core.annotation.NameInMap("arr_station")
        private String arrStation;

        @com.aliyun.core.annotation.NameInMap("bill_date")
        private String billDate;

        @com.aliyun.core.annotation.NameInMap("coach_name")
        private String coachName;

        @com.aliyun.core.annotation.NameInMap("cost_center")
        private String costCenter;

        @com.aliyun.core.annotation.NameInMap("dep_station")
        private String depStation;

        @com.aliyun.core.annotation.NameInMap("dep_time")
        private String depTime;

        @com.aliyun.core.annotation.NameInMap("department")
        private String department;

        @com.aliyun.core.annotation.NameInMap("id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("invoice_title")
        private String invoiceTitle;

        @com.aliyun.core.annotation.NameInMap("order_id")
        private Long orderId;

        @com.aliyun.core.annotation.NameInMap("oss_url")
        private String ossUrl;

        @com.aliyun.core.annotation.NameInMap("passenger")
        private String passenger;

        @com.aliyun.core.annotation.NameInMap("price")
        private String price;

        @com.aliyun.core.annotation.NameInMap("project")
        private String project;

        @com.aliyun.core.annotation.NameInMap("seat")
        private String seat;

        @com.aliyun.core.annotation.NameInMap("seat_no")
        private String seatNo;

        @com.aliyun.core.annotation.NameInMap("serial_number")
        private String serialNumber;

        @com.aliyun.core.annotation.NameInMap("tax_amount")
        private String taxAmount;

        @com.aliyun.core.annotation.NameInMap("tax_rate")
        private String taxRate;

        @com.aliyun.core.annotation.NameInMap("ticket_no")
        private String ticketNo;

        @com.aliyun.core.annotation.NameInMap("train_no")
        private String trainNo;

        private Items(Builder builder) {
            this.applyId = builder.applyId;
            this.arrStation = builder.arrStation;
            this.billDate = builder.billDate;
            this.coachName = builder.coachName;
            this.costCenter = builder.costCenter;
            this.depStation = builder.depStation;
            this.depTime = builder.depTime;
            this.department = builder.department;
            this.id = builder.id;
            this.invoiceTitle = builder.invoiceTitle;
            this.orderId = builder.orderId;
            this.ossUrl = builder.ossUrl;
            this.passenger = builder.passenger;
            this.price = builder.price;
            this.project = builder.project;
            this.seat = builder.seat;
            this.seatNo = builder.seatNo;
            this.serialNumber = builder.serialNumber;
            this.taxAmount = builder.taxAmount;
            this.taxRate = builder.taxRate;
            this.ticketNo = builder.ticketNo;
            this.trainNo = builder.trainNo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return applyId
         */
        public String getApplyId() {
            return this.applyId;
        }

        /**
         * @return arrStation
         */
        public String getArrStation() {
            return this.arrStation;
        }

        /**
         * @return billDate
         */
        public String getBillDate() {
            return this.billDate;
        }

        /**
         * @return coachName
         */
        public String getCoachName() {
            return this.coachName;
        }

        /**
         * @return costCenter
         */
        public String getCostCenter() {
            return this.costCenter;
        }

        /**
         * @return depStation
         */
        public String getDepStation() {
            return this.depStation;
        }

        /**
         * @return depTime
         */
        public String getDepTime() {
            return this.depTime;
        }

        /**
         * @return department
         */
        public String getDepartment() {
            return this.department;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return invoiceTitle
         */
        public String getInvoiceTitle() {
            return this.invoiceTitle;
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
         * @return passenger
         */
        public String getPassenger() {
            return this.passenger;
        }

        /**
         * @return price
         */
        public String getPrice() {
            return this.price;
        }

        /**
         * @return project
         */
        public String getProject() {
            return this.project;
        }

        /**
         * @return seat
         */
        public String getSeat() {
            return this.seat;
        }

        /**
         * @return seatNo
         */
        public String getSeatNo() {
            return this.seatNo;
        }

        /**
         * @return serialNumber
         */
        public String getSerialNumber() {
            return this.serialNumber;
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
         * @return trainNo
         */
        public String getTrainNo() {
            return this.trainNo;
        }

        public static final class Builder {
            private String applyId; 
            private String arrStation; 
            private String billDate; 
            private String coachName; 
            private String costCenter; 
            private String depStation; 
            private String depTime; 
            private String department; 
            private String id; 
            private String invoiceTitle; 
            private Long orderId; 
            private String ossUrl; 
            private String passenger; 
            private String price; 
            private String project; 
            private String seat; 
            private String seatNo; 
            private String serialNumber; 
            private String taxAmount; 
            private String taxRate; 
            private String ticketNo; 
            private String trainNo; 

            /**
             * apply_id.
             */
            public Builder applyId(String applyId) {
                this.applyId = applyId;
                return this;
            }

            /**
             * arr_station.
             */
            public Builder arrStation(String arrStation) {
                this.arrStation = arrStation;
                return this;
            }

            /**
             * bill_date.
             */
            public Builder billDate(String billDate) {
                this.billDate = billDate;
                return this;
            }

            /**
             * coach_name.
             */
            public Builder coachName(String coachName) {
                this.coachName = coachName;
                return this;
            }

            /**
             * cost_center.
             */
            public Builder costCenter(String costCenter) {
                this.costCenter = costCenter;
                return this;
            }

            /**
             * dep_station.
             */
            public Builder depStation(String depStation) {
                this.depStation = depStation;
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
             * department.
             */
            public Builder department(String department) {
                this.department = department;
                return this;
            }

            /**
             * id.
             */
            public Builder id(String id) {
                this.id = id;
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
             * order_id.
             */
            public Builder orderId(Long orderId) {
                this.orderId = orderId;
                return this;
            }

            /**
             * oss_url.
             */
            public Builder ossUrl(String ossUrl) {
                this.ossUrl = ossUrl;
                return this;
            }

            /**
             * passenger.
             */
            public Builder passenger(String passenger) {
                this.passenger = passenger;
                return this;
            }

            /**
             * price.
             */
            public Builder price(String price) {
                this.price = price;
                return this;
            }

            /**
             * project.
             */
            public Builder project(String project) {
                this.project = project;
                return this;
            }

            /**
             * seat.
             */
            public Builder seat(String seat) {
                this.seat = seat;
                return this;
            }

            /**
             * seat_no.
             */
            public Builder seatNo(String seatNo) {
                this.seatNo = seatNo;
                return this;
            }

            /**
             * serial_number.
             */
            public Builder serialNumber(String serialNumber) {
                this.serialNumber = serialNumber;
                return this;
            }

            /**
             * tax_amount.
             */
            public Builder taxAmount(String taxAmount) {
                this.taxAmount = taxAmount;
                return this;
            }

            /**
             * tax_rate.
             */
            public Builder taxRate(String taxRate) {
                this.taxRate = taxRate;
                return this;
            }

            /**
             * 取票号
             */
            public Builder ticketNo(String ticketNo) {
                this.ticketNo = ticketNo;
                return this;
            }

            /**
             * 车次
             */
            public Builder trainNo(String trainNo) {
                this.trainNo = trainNo;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
    public static class Module extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("items")
        private java.util.List < Items> items;

        @com.aliyun.core.annotation.NameInMap("page_no")
        private Integer pageNo;

        @com.aliyun.core.annotation.NameInMap("page_size")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("total_page")
        private Integer totalPage;

        @com.aliyun.core.annotation.NameInMap("total_size")
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
