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
 * {@link GetStorageAmountSummaryResponseBody} extends {@link TeaModel}
 *
 * <p>GetStorageAmountSummaryResponseBody</p>
 */
public class GetStorageAmountSummaryResponseBody extends TeaModel {
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

    private GetStorageAmountSummaryResponseBody(Builder builder) {
        this.data = builder.data;
        this.errorCode = builder.errorCode;
        this.errorMsg = builder.errorMsg;
        this.httpCode = builder.httpCode;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetStorageAmountSummaryResponseBody create() {
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

        private Builder(GetStorageAmountSummaryResponseBody model) {
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
         * <li>If success is false, a business error code is returned.</li>
         * <li>If success is true, an empty value is returned.</li>
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
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>this quota is not exist.</p>
         */
        public Builder errorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }

        /**
         * <p>Indicates whether the business is successful. If this parameter is not empty and the value is not 200, the business processing failed.</p>
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
         * <p>688003E1-D1B4-5468-957E-2FFB3AC8D79B</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetStorageAmountSummaryResponseBody build() {
            return new GetStorageAmountSummaryResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetStorageAmountSummaryResponseBody} extends {@link TeaModel}
     *
     * <p>GetStorageAmountSummaryResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("date")
        private String date;

        @com.aliyun.core.annotation.NameInMap("timestamp")
        private Long timestamp;

        @com.aliyun.core.annotation.NameInMap("unit")
        private java.util.Map<String, String> unit;

        @com.aliyun.core.annotation.NameInMap("value")
        private java.util.Map<String, Long> value;

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
        public java.util.Map<String, Long> getValue() {
            return this.value;
        }

        public static final class Builder {
            private String date; 
            private Long timestamp; 
            private java.util.Map<String, String> unit; 
            private java.util.Map<String, Long> value; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.date = model.date;
                this.timestamp = model.timestamp;
                this.unit = model.unit;
                this.value = model.value;
            } 

            /**
             * <p>The date of the statistics.</p>
             * 
             * <strong>example:</strong>
             * <p>20241205</p>
             */
            public Builder date(String date) {
                this.date = date;
                return this;
            }

            /**
             * <p>The timestamp. This API does not return this parameter.</p>
             * 
             * <strong>example:</strong>
             * <ul>
             * <li></li>
             * </ul>
             */
            public Builder timestamp(Long timestamp) {
                this.timestamp = timestamp;
                return this;
            }

            /**
             * <p>The unit of the storage metrics. This API does not return this parameter.</p>
             */
            public Builder unit(java.util.Map<String, String> unit) {
                this.unit = unit;
                return this;
            }

            /**
             * <p>The storage metrics. The metrics include the following:</p>
             * <ul>
             * <li>projectAmount</li>
             * <li>schemaAmount</li>
             * <li>tableAmount</li>
             * <li>partitionAmount</li>
             * </ul>
             */
            public Builder value(java.util.Map<String, Long> value) {
                this.value = value;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
