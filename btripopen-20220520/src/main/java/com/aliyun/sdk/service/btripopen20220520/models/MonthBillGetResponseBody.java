// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link MonthBillGetResponseBody} extends {@link TeaModel}
 *
 * <p>MonthBillGetResponseBody</p>
 */
public class MonthBillGetResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("module")
    private java.util.List < Module> module;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("traceId")
    private String traceId;

    private MonthBillGetResponseBody(Builder builder) {
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

    public static MonthBillGetResponseBody create() {
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

        public MonthBillGetResponseBody build() {
            return new MonthBillGetResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link MonthBillGetResponseBody} extends {@link TeaModel}
     *
     * <p>MonthBillGetResponseBody</p>
     */
    public static class MonthAccountBillDetail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("billConfirmed")
        private Integer billConfirmed;

        @com.aliyun.core.annotation.NameInMap("carAmount")
        private Double carAmount;

        @com.aliyun.core.annotation.NameInMap("damageAmount")
        private Double damageAmount;

        @com.aliyun.core.annotation.NameInMap("flightAmount")
        private Double flightAmount;

        @com.aliyun.core.annotation.NameInMap("fuPoint")
        private Double fuPoint;

        @com.aliyun.core.annotation.NameInMap("hotelAmount")
        private Double hotelAmount;

        @com.aliyun.core.annotation.NameInMap("ieFlightAmount")
        private Double ieFlightAmount;

        @com.aliyun.core.annotation.NameInMap("ieHotelAmount")
        private Double ieHotelAmount;

        @com.aliyun.core.annotation.NameInMap("mailBillDate")
        private Long mailBillDate;

        @com.aliyun.core.annotation.NameInMap("serviceAmount")
        private Double serviceAmount;

        @com.aliyun.core.annotation.NameInMap("trainAmount")
        private Double trainAmount;

        private MonthAccountBillDetail(Builder builder) {
            this.billConfirmed = builder.billConfirmed;
            this.carAmount = builder.carAmount;
            this.damageAmount = builder.damageAmount;
            this.flightAmount = builder.flightAmount;
            this.fuPoint = builder.fuPoint;
            this.hotelAmount = builder.hotelAmount;
            this.ieFlightAmount = builder.ieFlightAmount;
            this.ieHotelAmount = builder.ieHotelAmount;
            this.mailBillDate = builder.mailBillDate;
            this.serviceAmount = builder.serviceAmount;
            this.trainAmount = builder.trainAmount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MonthAccountBillDetail create() {
            return builder().build();
        }

        /**
         * @return billConfirmed
         */
        public Integer getBillConfirmed() {
            return this.billConfirmed;
        }

        /**
         * @return carAmount
         */
        public Double getCarAmount() {
            return this.carAmount;
        }

        /**
         * @return damageAmount
         */
        public Double getDamageAmount() {
            return this.damageAmount;
        }

        /**
         * @return flightAmount
         */
        public Double getFlightAmount() {
            return this.flightAmount;
        }

        /**
         * @return fuPoint
         */
        public Double getFuPoint() {
            return this.fuPoint;
        }

        /**
         * @return hotelAmount
         */
        public Double getHotelAmount() {
            return this.hotelAmount;
        }

        /**
         * @return ieFlightAmount
         */
        public Double getIeFlightAmount() {
            return this.ieFlightAmount;
        }

        /**
         * @return ieHotelAmount
         */
        public Double getIeHotelAmount() {
            return this.ieHotelAmount;
        }

        /**
         * @return mailBillDate
         */
        public Long getMailBillDate() {
            return this.mailBillDate;
        }

        /**
         * @return serviceAmount
         */
        public Double getServiceAmount() {
            return this.serviceAmount;
        }

        /**
         * @return trainAmount
         */
        public Double getTrainAmount() {
            return this.trainAmount;
        }

        public static final class Builder {
            private Integer billConfirmed; 
            private Double carAmount; 
            private Double damageAmount; 
            private Double flightAmount; 
            private Double fuPoint; 
            private Double hotelAmount; 
            private Double ieFlightAmount; 
            private Double ieHotelAmount; 
            private Long mailBillDate; 
            private Double serviceAmount; 
            private Double trainAmount; 

            /**
             * billConfirmed.
             */
            public Builder billConfirmed(Integer billConfirmed) {
                this.billConfirmed = billConfirmed;
                return this;
            }

            /**
             * <p>用车金额（单位：元）</p>
             * 
             * <strong>example:</strong>
             * <p>xx.xx</p>
             */
            public Builder carAmount(Double carAmount) {
                this.carAmount = carAmount;
                return this;
            }

            /**
             * <p>违约金金额（单位：元）</p>
             * 
             * <strong>example:</strong>
             * <p>xx.xx</p>
             */
            public Builder damageAmount(Double damageAmount) {
                this.damageAmount = damageAmount;
                return this;
            }

            /**
             * <p>机票金额（单位：元）</p>
             * 
             * <strong>example:</strong>
             * <p>xx.xx</p>
             */
            public Builder flightAmount(Double flightAmount) {
                this.flightAmount = flightAmount;
                return this;
            }

            /**
             * <p>福豆金额（单位：元）</p>
             * 
             * <strong>example:</strong>
             * <p>xx.xx</p>
             */
            public Builder fuPoint(Double fuPoint) {
                this.fuPoint = fuPoint;
                return this;
            }

            /**
             * <p>酒店金额（单位：元）</p>
             * 
             * <strong>example:</strong>
             * <p>xx.xx</p>
             */
            public Builder hotelAmount(Double hotelAmount) {
                this.hotelAmount = hotelAmount;
                return this;
            }

            /**
             * <p>国际机票金额（单位：元）</p>
             * 
             * <strong>example:</strong>
             * <p>xx.xx</p>
             */
            public Builder ieFlightAmount(Double ieFlightAmount) {
                this.ieFlightAmount = ieFlightAmount;
                return this;
            }

            /**
             * ieHotelAmount.
             */
            public Builder ieHotelAmount(Double ieHotelAmount) {
                this.ieHotelAmount = ieHotelAmount;
                return this;
            }

            /**
             * <p>账期日：YYYYMMDD</p>
             * 
             * <strong>example:</strong>
             * <p>20200501</p>
             */
            public Builder mailBillDate(Long mailBillDate) {
                this.mailBillDate = mailBillDate;
                return this;
            }

            /**
             * <p>服务费金额（单位：元）</p>
             * 
             * <strong>example:</strong>
             * <p>xx.xx</p>
             */
            public Builder serviceAmount(Double serviceAmount) {
                this.serviceAmount = serviceAmount;
                return this;
            }

            /**
             * <p>火车票金额（单位：元）</p>
             * 
             * <strong>example:</strong>
             * <p>xx.xx</p>
             */
            public Builder trainAmount(Double trainAmount) {
                this.trainAmount = trainAmount;
                return this;
            }

            public MonthAccountBillDetail build() {
                return new MonthAccountBillDetail(this);
            } 

        } 

    }
    /**
     * 
     * {@link MonthBillGetResponseBody} extends {@link TeaModel}
     *
     * <p>MonthBillGetResponseBody</p>
     */
    public static class Module extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("end_date")
        private String endDate;

        @com.aliyun.core.annotation.NameInMap("monthAccountBillDetail")
        private MonthAccountBillDetail monthAccountBillDetail;

        @com.aliyun.core.annotation.NameInMap("start_date")
        private String startDate;

        @com.aliyun.core.annotation.NameInMap("url")
        private String url;

        private Module(Builder builder) {
            this.endDate = builder.endDate;
            this.monthAccountBillDetail = builder.monthAccountBillDetail;
            this.startDate = builder.startDate;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Module create() {
            return builder().build();
        }

        /**
         * @return endDate
         */
        public String getEndDate() {
            return this.endDate;
        }

        /**
         * @return monthAccountBillDetail
         */
        public MonthAccountBillDetail getMonthAccountBillDetail() {
            return this.monthAccountBillDetail;
        }

        /**
         * @return startDate
         */
        public String getStartDate() {
            return this.startDate;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private String endDate; 
            private MonthAccountBillDetail monthAccountBillDetail; 
            private String startDate; 
            private String url; 

            /**
             * end_date.
             */
            public Builder endDate(String endDate) {
                this.endDate = endDate;
                return this;
            }

            /**
             * <p>CorpMonthAccountBillFeeDetail</p>
             */
            public Builder monthAccountBillDetail(MonthAccountBillDetail monthAccountBillDetail) {
                this.monthAccountBillDetail = monthAccountBillDetail;
                return this;
            }

            /**
             * start_date.
             */
            public Builder startDate(String startDate) {
                this.startDate = startDate;
                return this;
            }

            /**
             * url.
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public Module build() {
                return new Module(this);
            } 

        } 

    }
}
