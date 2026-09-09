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
 * {@link GetStorageSizeSummaryResponseBody} extends {@link TeaModel}
 *
 * <p>GetStorageSizeSummaryResponseBody</p>
 */
public class GetStorageSizeSummaryResponseBody extends TeaModel {
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

    private GetStorageSizeSummaryResponseBody(Builder builder) {
        this.data = builder.data;
        this.errorCode = builder.errorCode;
        this.errorMsg = builder.errorMsg;
        this.httpCode = builder.httpCode;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetStorageSizeSummaryResponseBody create() {
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

        private Builder(GetStorageSizeSummaryResponseBody model) {
            this.data = model.data;
            this.errorCode = model.errorCode;
            this.errorMsg = model.errorMsg;
            this.httpCode = model.httpCode;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The returned data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The business error code or an empty value.</p>
         * <ul>
         * <li><p>If success is false, a business error code is returned.</p>
         * </li>
         * <li><p>If success is true, an empty value is returned.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>The description of the error.</p>
         * 
         * <strong>example:</strong>
         * <p>this quota is not exist.</p>
         */
        public Builder errorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }

        /**
         * <p>Indicates whether the business is successful. If this parameter is not empty and the value is not 200, the business fails.</p>
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
         * <p>0be3e0aa16667684362147582e038f</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetStorageSizeSummaryResponseBody build() {
            return new GetStorageSizeSummaryResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetStorageSizeSummaryResponseBody} extends {@link TeaModel}
     *
     * <p>GetStorageSizeSummaryResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("date")
        private String date;

        @com.aliyun.core.annotation.NameInMap("timestamp")
        private Long timestamp;

        @com.aliyun.core.annotation.NameInMap("unit")
        private java.util.Map<String, String> unit;

        @com.aliyun.core.annotation.NameInMap("value")
        private java.util.Map<String, Double> value;

        private Data(Builder builder) {
            this.date = builder.date;
            this.timestamp = builder.timestamp;
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
         * @return date
         */
        public String getDate() {
            return this.date;
        }

        /**
         * @return timestamp
         */
        public Long getTimestamp() {
            return this.timestamp;
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
            private String date; 
            private Long timestamp; 
            private java.util.Map<String, String> unit; 
            private java.util.Map<String, Double> value; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.date = model.date;
                this.timestamp = model.timestamp;
                this.unit = model.unit;
                this.value = model.value;
            } 

            /**
             * <p>The date of statistics.</p>
             * 
             * <strong>example:</strong>
             * <p>20241205</p>
             */
            public Builder date(String date) {
                this.date = date;
                return this;
            }

            /**
             * <p>The timestamp of the last data update.</p>
             * 
             * <strong>example:</strong>
             * <p>1749090705919</p>
             */
            public Builder timestamp(Long timestamp) {
                this.timestamp = timestamp;
                return this;
            }

            /**
             * <p>The unit of the storage metric usage. It includes:</p>
             * <ul>
             * <li><p>lowFreqStorage</p>
             * </li>
             * <li><p>standardStorage</p>
             * </li>
             * <li><p>longTermStorage</p>
             * </li>
             * <li><p>totalStorage</p>
             * </li>
             * </ul>
             */
            public Builder unit(java.util.Map<String, String> unit) {
                this.unit = unit;
                return this;
            }

            /**
             * <p>The storage metrics. It includes:</p>
             * <ul>
             * <li><p>lowFreqStorage</p>
             * </li>
             * <li><p>standardStorage</p>
             * </li>
             * <li><p>longTermStorage</p>
             * </li>
             * <li><p>totalStorage</p>
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
