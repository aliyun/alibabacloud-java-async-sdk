// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link MonthBillGetResponseBody} extends {@link TeaModel}
 *
 * <p>MonthBillGetResponseBody</p>
 */
public class MonthBillGetResponseBody extends TeaModel {
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

    public static class MonthAccountBillDetail extends TeaModel {
        @NameInMap("carAmount")
        private Double carAmount;

        @NameInMap("damageAmount")
        private Double damageAmount;

        @NameInMap("flightAmount")
        private Double flightAmount;

        @NameInMap("fuPoint")
        private Double fuPoint;

        @NameInMap("hotelAmount")
        private Double hotelAmount;

        @NameInMap("ieFlightAmount")
        private Double ieFlightAmount;

        @NameInMap("mailBillDate")
        private Long mailBillDate;

        @NameInMap("serviceAmount")
        private Double serviceAmount;

        @NameInMap("trainAmount")
        private Double trainAmount;

        private MonthAccountBillDetail(Builder builder) {
            this.carAmount = builder.carAmount;
            this.damageAmount = builder.damageAmount;
            this.flightAmount = builder.flightAmount;
            this.fuPoint = builder.fuPoint;
            this.hotelAmount = builder.hotelAmount;
            this.ieFlightAmount = builder.ieFlightAmount;
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
            private Double carAmount; 
            private Double damageAmount; 
            private Double flightAmount; 
            private Double fuPoint; 
            private Double hotelAmount; 
            private Double ieFlightAmount; 
            private Long mailBillDate; 
            private Double serviceAmount; 
            private Double trainAmount; 

            /**
             * 用车金额（单位：元）
             */
            public Builder carAmount(Double carAmount) {
                this.carAmount = carAmount;
                return this;
            }

            /**
             * 违约金金额（单位：元）
             */
            public Builder damageAmount(Double damageAmount) {
                this.damageAmount = damageAmount;
                return this;
            }

            /**
             * 机票金额（单位：元）
             */
            public Builder flightAmount(Double flightAmount) {
                this.flightAmount = flightAmount;
                return this;
            }

            /**
             * 福豆金额（单位：元）
             */
            public Builder fuPoint(Double fuPoint) {
                this.fuPoint = fuPoint;
                return this;
            }

            /**
             * 酒店金额（单位：元）
             */
            public Builder hotelAmount(Double hotelAmount) {
                this.hotelAmount = hotelAmount;
                return this;
            }

            /**
             * 国际机票金额（单位：元）
             */
            public Builder ieFlightAmount(Double ieFlightAmount) {
                this.ieFlightAmount = ieFlightAmount;
                return this;
            }

            /**
             * 账期日：YYYYMMDD
             */
            public Builder mailBillDate(Long mailBillDate) {
                this.mailBillDate = mailBillDate;
                return this;
            }

            /**
             * 服务费金额（单位：元）
             */
            public Builder serviceAmount(Double serviceAmount) {
                this.serviceAmount = serviceAmount;
                return this;
            }

            /**
             * 火车票金额（单位：元）
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
    public static class Module extends TeaModel {
        @NameInMap("end_date")
        private String endDate;

        @NameInMap("monthAccountBillDetail")
        private MonthAccountBillDetail monthAccountBillDetail;

        @NameInMap("start_date")
        private String startDate;

        @NameInMap("url")
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
             * CorpMonthAccountBillFeeDetail
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
