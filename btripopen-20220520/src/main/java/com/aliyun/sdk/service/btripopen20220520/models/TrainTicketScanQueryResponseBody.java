// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TrainTicketScanQueryResponseBody} extends {@link TeaModel}
 *
 * <p>TrainTicketScanQueryResponseBody</p>
 */
public class TrainTicketScanQueryResponseBody extends TeaModel {
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
        @NameInMap("arr_station")
        private String arrStation;

        @NameInMap("bill_date")
        private String billDate;

        @NameInMap("coach_name")
        private String coachName;

        @NameInMap("cost_center")
        private String costCenter;

        @NameInMap("dep_station")
        private String depStation;

        @NameInMap("dep_time")
        private String depTime;

        @NameInMap("department")
        private String department;

        @NameInMap("id")
        private String id;

        @NameInMap("invoice_title")
        private String invoiceTitle;

        @NameInMap("order_id")
        private Long orderId;

        @NameInMap("oss_url")
        private String ossUrl;

        @NameInMap("passenger")
        private String passenger;

        @NameInMap("price")
        private String price;

        @NameInMap("project")
        private String project;

        @NameInMap("seat")
        private String seat;

        @NameInMap("seat_no")
        private String seatNo;

        @NameInMap("serial_number")
        private String serialNumber;

        @NameInMap("tax_amount")
        private String taxAmount;

        @NameInMap("tax_rate")
        private String taxRate;

        @NameInMap("ticket_no")
        private String ticketNo;

        @NameInMap("train_no")
        private String trainNo;

        private Items(Builder builder) {
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
             * 到达站
             */
            public Builder arrStation(String arrStation) {
                this.arrStation = arrStation;
                return this;
            }

            /**
             * 出账日
             */
            public Builder billDate(String billDate) {
                this.billDate = billDate;
                return this;
            }

            /**
             * 车厢
             */
            public Builder coachName(String coachName) {
                this.coachName = coachName;
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
             * 出发站
             */
            public Builder depStation(String depStation) {
                this.depStation = depStation;
                return this;
            }

            /**
             * 发车时间
             */
            public Builder depTime(String depTime) {
                this.depTime = depTime;
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
             * 应用ID
             */
            public Builder id(String id) {
                this.id = id;
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
             * 商旅订单号
             */
            public Builder orderId(Long orderId) {
                this.orderId = orderId;
                return this;
            }

            /**
             * 下载地址
             */
            public Builder ossUrl(String ossUrl) {
                this.ossUrl = ossUrl;
                return this;
            }

            /**
             * 乘车人
             */
            public Builder passenger(String passenger) {
                this.passenger = passenger;
                return this;
            }

            /**
             * 票价
             */
            public Builder price(String price) {
                this.price = price;
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
             * 席别
             */
            public Builder seat(String seat) {
                this.seat = seat;
                return this;
            }

            /**
             * 座位号
             */
            public Builder seatNo(String seatNo) {
                this.seatNo = seatNo;
                return this;
            }

            /**
             * 票面票号
             */
            public Builder serialNumber(String serialNumber) {
                this.serialNumber = serialNumber;
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
