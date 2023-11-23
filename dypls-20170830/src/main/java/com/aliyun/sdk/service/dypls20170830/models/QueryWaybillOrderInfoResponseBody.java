// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dypls20170830.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryWaybillOrderInfoResponseBody} extends {@link TeaModel}
 *
 * <p>QueryWaybillOrderInfoResponseBody</p>
 */
public class QueryWaybillOrderInfoResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    private QueryWaybillOrderInfoResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryWaybillOrderInfoResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public QueryWaybillOrderInfoResponseBody build() {
            return new QueryWaybillOrderInfoResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("Aliyunprice")
        private String aliyunprice;

        @NameInMap("AppointGotEndTime")
        private String appointGotEndTime;

        @NameInMap("AppointGotStartTime")
        private String appointGotStartTime;

        @NameInMap("BizType")
        private Integer bizType;

        @NameInMap("City")
        private String city;

        @NameInMap("CpCode")
        private String cpCode;

        @NameInMap("GotCode")
        private String gotCode;

        @NameInMap("LastLogisticDetail")
        private String lastLogisticDetail;

        @NameInMap("LogisticsGmtModified")
        private String logisticsGmtModified;

        @NameInMap("LogisticsStatus")
        private String logisticsStatus;

        @NameInMap("LogisticsStatusDesc")
        private String logisticsStatusDesc;

        @NameInMap("MailNo")
        private String mailNo;

        @NameInMap("OuterOrderCode")
        private String outerOrderCode;

        private Data(Builder builder) {
            this.aliyunprice = builder.aliyunprice;
            this.appointGotEndTime = builder.appointGotEndTime;
            this.appointGotStartTime = builder.appointGotStartTime;
            this.bizType = builder.bizType;
            this.city = builder.city;
            this.cpCode = builder.cpCode;
            this.gotCode = builder.gotCode;
            this.lastLogisticDetail = builder.lastLogisticDetail;
            this.logisticsGmtModified = builder.logisticsGmtModified;
            this.logisticsStatus = builder.logisticsStatus;
            this.logisticsStatusDesc = builder.logisticsStatusDesc;
            this.mailNo = builder.mailNo;
            this.outerOrderCode = builder.outerOrderCode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return aliyunprice
         */
        public String getAliyunprice() {
            return this.aliyunprice;
        }

        /**
         * @return appointGotEndTime
         */
        public String getAppointGotEndTime() {
            return this.appointGotEndTime;
        }

        /**
         * @return appointGotStartTime
         */
        public String getAppointGotStartTime() {
            return this.appointGotStartTime;
        }

        /**
         * @return bizType
         */
        public Integer getBizType() {
            return this.bizType;
        }

        /**
         * @return city
         */
        public String getCity() {
            return this.city;
        }

        /**
         * @return cpCode
         */
        public String getCpCode() {
            return this.cpCode;
        }

        /**
         * @return gotCode
         */
        public String getGotCode() {
            return this.gotCode;
        }

        /**
         * @return lastLogisticDetail
         */
        public String getLastLogisticDetail() {
            return this.lastLogisticDetail;
        }

        /**
         * @return logisticsGmtModified
         */
        public String getLogisticsGmtModified() {
            return this.logisticsGmtModified;
        }

        /**
         * @return logisticsStatus
         */
        public String getLogisticsStatus() {
            return this.logisticsStatus;
        }

        /**
         * @return logisticsStatusDesc
         */
        public String getLogisticsStatusDesc() {
            return this.logisticsStatusDesc;
        }

        /**
         * @return mailNo
         */
        public String getMailNo() {
            return this.mailNo;
        }

        /**
         * @return outerOrderCode
         */
        public String getOuterOrderCode() {
            return this.outerOrderCode;
        }

        public static final class Builder {
            private String aliyunprice; 
            private String appointGotEndTime; 
            private String appointGotStartTime; 
            private Integer bizType; 
            private String city; 
            private String cpCode; 
            private String gotCode; 
            private String lastLogisticDetail; 
            private String logisticsGmtModified; 
            private String logisticsStatus; 
            private String logisticsStatusDesc; 
            private String mailNo; 
            private String outerOrderCode; 

            /**
             * Aliyunprice.
             */
            public Builder aliyunprice(String aliyunprice) {
                this.aliyunprice = aliyunprice;
                return this;
            }

            /**
             * AppointGotEndTime.
             */
            public Builder appointGotEndTime(String appointGotEndTime) {
                this.appointGotEndTime = appointGotEndTime;
                return this;
            }

            /**
             * AppointGotStartTime.
             */
            public Builder appointGotStartTime(String appointGotStartTime) {
                this.appointGotStartTime = appointGotStartTime;
                return this;
            }

            /**
             * BizType.
             */
            public Builder bizType(Integer bizType) {
                this.bizType = bizType;
                return this;
            }

            /**
             * City.
             */
            public Builder city(String city) {
                this.city = city;
                return this;
            }

            /**
             * CpCode.
             */
            public Builder cpCode(String cpCode) {
                this.cpCode = cpCode;
                return this;
            }

            /**
             * GotCode.
             */
            public Builder gotCode(String gotCode) {
                this.gotCode = gotCode;
                return this;
            }

            /**
             * LastLogisticDetail.
             */
            public Builder lastLogisticDetail(String lastLogisticDetail) {
                this.lastLogisticDetail = lastLogisticDetail;
                return this;
            }

            /**
             * LogisticsGmtModified.
             */
            public Builder logisticsGmtModified(String logisticsGmtModified) {
                this.logisticsGmtModified = logisticsGmtModified;
                return this;
            }

            /**
             * LogisticsStatus.
             */
            public Builder logisticsStatus(String logisticsStatus) {
                this.logisticsStatus = logisticsStatus;
                return this;
            }

            /**
             * LogisticsStatusDesc.
             */
            public Builder logisticsStatusDesc(String logisticsStatusDesc) {
                this.logisticsStatusDesc = logisticsStatusDesc;
                return this;
            }

            /**
             * MailNo.
             */
            public Builder mailNo(String mailNo) {
                this.mailNo = mailNo;
                return this;
            }

            /**
             * OuterOrderCode.
             */
            public Builder outerOrderCode(String outerOrderCode) {
                this.outerOrderCode = outerOrderCode;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
