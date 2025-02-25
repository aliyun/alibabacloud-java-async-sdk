// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

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
 * {@link GetHistoricalCallerReportResponseBody} extends {@link TeaModel}
 *
 * <p>GetHistoricalCallerReportResponseBody</p>
 */
public class GetHistoricalCallerReportResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetHistoricalCallerReportResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetHistoricalCallerReportResponseBody create() {
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
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
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

    public static final class Builder {
        private String code; 
        private Data data; 
        private Integer httpStatusCode; 
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
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
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

        public GetHistoricalCallerReportResponseBody build() {
            return new GetHistoricalCallerReportResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetHistoricalCallerReportResponseBody} extends {@link TeaModel}
     *
     * <p>GetHistoricalCallerReportResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LastCallingTime")
        private Long lastCallingTime;

        @com.aliyun.core.annotation.NameInMap("TotalCalls")
        private Long totalCalls;

        private Data(Builder builder) {
            this.lastCallingTime = builder.lastCallingTime;
            this.totalCalls = builder.totalCalls;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return lastCallingTime
         */
        public Long getLastCallingTime() {
            return this.lastCallingTime;
        }

        /**
         * @return totalCalls
         */
        public Long getTotalCalls() {
            return this.totalCalls;
        }

        public static final class Builder {
            private Long lastCallingTime; 
            private Long totalCalls; 

            /**
             * LastCallingTime.
             */
            public Builder lastCallingTime(Long lastCallingTime) {
                this.lastCallingTime = lastCallingTime;
                return this;
            }

            /**
             * TotalCalls.
             */
            public Builder totalCalls(Long totalCalls) {
                this.totalCalls = totalCalls;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
