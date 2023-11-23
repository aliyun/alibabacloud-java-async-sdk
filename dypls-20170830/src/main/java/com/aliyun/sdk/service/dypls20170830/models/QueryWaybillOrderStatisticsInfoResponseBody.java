// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dypls20170830.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryWaybillOrderStatisticsInfoResponseBody} extends {@link TeaModel}
 *
 * <p>QueryWaybillOrderStatisticsInfoResponseBody</p>
 */
public class QueryWaybillOrderStatisticsInfoResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private java.util.List < Data> data;

    @NameInMap("HttpStatusCode")
    private String httpStatusCode;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private QueryWaybillOrderStatisticsInfoResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryWaybillOrderStatisticsInfoResponseBody create() {
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
    public java.util.List < Data> getData() {
        return this.data;
    }

    /**
     * @return httpStatusCode
     */
    public String getHttpStatusCode() {
        return this.httpStatusCode;
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

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private java.util.List < Data> data; 
        private String httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

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
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(String httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
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

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public QueryWaybillOrderStatisticsInfoResponseBody build() {
            return new QueryWaybillOrderStatisticsInfoResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("AliyunpriceAmount")
        private Double aliyunpriceAmount;

        @NameInMap("CancelCount")
        private Integer cancelCount;

        @NameInMap("GmtCreate")
        private String gmtCreate;

        @NameInMap("GotCount")
        private Integer gotCount;

        @NameInMap("OrderTotal")
        private Integer orderTotal;

        private Data(Builder builder) {
            this.aliyunpriceAmount = builder.aliyunpriceAmount;
            this.cancelCount = builder.cancelCount;
            this.gmtCreate = builder.gmtCreate;
            this.gotCount = builder.gotCount;
            this.orderTotal = builder.orderTotal;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return aliyunpriceAmount
         */
        public Double getAliyunpriceAmount() {
            return this.aliyunpriceAmount;
        }

        /**
         * @return cancelCount
         */
        public Integer getCancelCount() {
            return this.cancelCount;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gotCount
         */
        public Integer getGotCount() {
            return this.gotCount;
        }

        /**
         * @return orderTotal
         */
        public Integer getOrderTotal() {
            return this.orderTotal;
        }

        public static final class Builder {
            private Double aliyunpriceAmount; 
            private Integer cancelCount; 
            private String gmtCreate; 
            private Integer gotCount; 
            private Integer orderTotal; 

            /**
             * AliyunpriceAmount.
             */
            public Builder aliyunpriceAmount(Double aliyunpriceAmount) {
                this.aliyunpriceAmount = aliyunpriceAmount;
                return this;
            }

            /**
             * CancelCount.
             */
            public Builder cancelCount(Integer cancelCount) {
                this.cancelCount = cancelCount;
                return this;
            }

            /**
             * GmtCreate.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * GotCount.
             */
            public Builder gotCount(Integer gotCount) {
                this.gotCount = gotCount;
                return this;
            }

            /**
             * OrderTotal.
             */
            public Builder orderTotal(Integer orderTotal) {
                this.orderTotal = orderTotal;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
