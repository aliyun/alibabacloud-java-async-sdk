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
         * data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * errorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * errorMsg.
         */
        public Builder errorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }

        /**
         * httpCode.
         */
        public Builder httpCode(Integer httpCode) {
            this.httpCode = httpCode;
            return this;
        }

        /**
         * requestId.
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
             * date.
             */
            public Builder date(String date) {
                this.date = date;
                return this;
            }

            /**
             * timestamp.
             */
            public Builder timestamp(Long timestamp) {
                this.timestamp = timestamp;
                return this;
            }

            /**
             * unit.
             */
            public Builder unit(java.util.Map<String, String> unit) {
                this.unit = unit;
                return this;
            }

            /**
             * value.
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
