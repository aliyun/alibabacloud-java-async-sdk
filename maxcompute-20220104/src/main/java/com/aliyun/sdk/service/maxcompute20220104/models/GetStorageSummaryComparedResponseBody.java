// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.maxcompute20220104.models;

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
 * {@link GetStorageSummaryComparedResponseBody} extends {@link TeaModel}
 *
 * <p>GetStorageSummaryComparedResponseBody</p>
 */
public class GetStorageSummaryComparedResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("errorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("errorMsg")
    private String errorMsg;

    @com.aliyun.core.annotation.NameInMap("httpCode")
    private Integer httpCode;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private GetStorageSummaryComparedResponseBody(Builder builder) {
        this.data = builder.data;
        this.errorCode = builder.errorCode;
        this.errorMsg = builder.errorMsg;
        this.httpCode = builder.httpCode;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetStorageSummaryComparedResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMsg
     */
    public String getErrorMsg() {
        return this.errorMsg;
    }

    /**
     * @return httpCode
     */
    public Integer getHttpCode() {
        return this.httpCode;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String errorCode; 
        private String errorMsg; 
        private Integer httpCode; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetStorageSummaryComparedResponseBody model) {
            this.data = model.data;
            this.errorCode = model.errorCode;
            this.errorMsg = model.errorMsg;
            this.httpCode = model.httpCode;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The data returned.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error code.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>plan \&quot;***\&quot; does not exist</p>
         */
        public Builder errorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }

        /**
         * <p>The HTTP status code.</p>
         * <ul>
         * <li><p>1xx: informational response. The request is received and is being processed.</p>
         * </li>
         * <li><p>2xx: success. The request is successfully received, understood, and accepted by the server.</p>
         * </li>
         * <li><p>3xx: redirection. The request is redirected. You must take further action to complete the request.</p>
         * </li>
         * <li><p>4xx: client error. The request contains invalid parameters or syntax, or fails to meet specific conditions.</p>
         * </li>
         * <li><p>5xx: server error. The server cannot fulfill the request for other reasons.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpCode(Integer httpCode) {
            this.httpCode = httpCode;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0bc3b4b016674434996033675e71ee</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetStorageSummaryComparedResponseBody build() {
            return new GetStorageSummaryComparedResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetStorageSummaryComparedResponseBody} extends {@link TeaModel}
     *
     * <p>GetStorageSummaryComparedResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("beginDate")
        private String beginDate;

        @com.aliyun.core.annotation.NameInMap("endDate")
        private String endDate;

        @com.aliyun.core.annotation.NameInMap("rate")
        private java.util.Map<String, Double> rate;

        @com.aliyun.core.annotation.NameInMap("unit")
        private java.util.Map<String, String> unit;

        @com.aliyun.core.annotation.NameInMap("value")
        private java.util.Map<String, Double> value;

        private Data(Builder builder) {
            this.beginDate = builder.beginDate;
            this.endDate = builder.endDate;
            this.rate = builder.rate;
            this.unit = builder.unit;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return beginDate
         */
        public String getBeginDate() {
            return this.beginDate;
        }

        /**
         * @return endDate
         */
        public String getEndDate() {
            return this.endDate;
        }

        /**
         * @return rate
         */
        public java.util.Map<String, Double> getRate() {
            return this.rate;
        }

        /**
         * @return unit
         */
        public java.util.Map<String, String> getUnit() {
            return this.unit;
        }

        /**
         * @return value
         */
        public java.util.Map<String, Double> getValue() {
            return this.value;
        }

        public static final class Builder {
            private String beginDate; 
            private String endDate; 
            private java.util.Map<String, Double> rate; 
            private java.util.Map<String, String> unit; 
            private java.util.Map<String, Double> value; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.beginDate = model.beginDate;
                this.endDate = model.endDate;
                this.rate = model.rate;
                this.unit = model.unit;
                this.value = model.value;
            } 

            /**
             * <p>The start date.</p>
             * 
             * <strong>example:</strong>
             * <p>20250601</p>
             */
            public Builder beginDate(String beginDate) {
                this.beginDate = beginDate;
                return this;
            }

            /**
             * <p>The end date.</p>
             * 
             * <strong>example:</strong>
             * <p>20250604</p>
             */
            public Builder endDate(String endDate) {
                this.endDate = endDate;
                return this;
            }

            /**
             * <p>The year-on-year (YoY) change rate of the storage usage from the start date to the end date. Valid values:</p>
             * <ul>
             * <li><p>lowFreqStorageRate</p>
             * </li>
             * <li><p>totalStorageRate</p>
             * </li>
             * <li><p>standardStorageRate</p>
             * </li>
             * <li><p>longTermStorageRate</p>
             * </li>
             * </ul>
             */
            public Builder rate(java.util.Map<String, Double> rate) {
                this.rate = rate;
                return this;
            }

            /**
             * <p>The unit of the change in the storage usage from the start date to the end date. Valid values:</p>
             * <ul>
             * <li><p>lowFreqStorageUnit</p>
             * </li>
             * <li><p>totalStorageUnit</p>
             * </li>
             * <li><p>standardStorageUnit</p>
             * </li>
             * <li><p>longTermStorageUnit</p>
             * </li>
             * </ul>
             */
            public Builder unit(java.util.Map<String, String> unit) {
                this.unit = unit;
                return this;
            }

            /**
             * <p>The change in the storage usage from the start date to the end date. Valid values:</p>
             * <ul>
             * <li><p>lowFreqStorage</p>
             * </li>
             * <li><p>totalStorage</p>
             * </li>
             * <li><p>standardStorage</p>
             * </li>
             * <li><p>longTermStorage</p>
             * </li>
             * </ul>
             */
            public Builder value(java.util.Map<String, Double> value) {
                this.value = value;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
