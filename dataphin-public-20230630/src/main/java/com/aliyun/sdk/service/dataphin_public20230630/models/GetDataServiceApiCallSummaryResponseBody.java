// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataphin_public20230630.models;

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
 * {@link GetDataServiceApiCallSummaryResponseBody} extends {@link TeaModel}
 *
 * <p>GetDataServiceApiCallSummaryResponseBody</p>
 */
public class GetDataServiceApiCallSummaryResponseBody extends TeaModel {
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

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetDataServiceApiCallSummaryResponseBody(Builder builder) {
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

    public static GetDataServiceApiCallSummaryResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetDataServiceApiCallSummaryResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

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
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>82E78D6B-AA8F-1FEF-8AA3-5C9DA2A79140</p>
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

        public GetDataServiceApiCallSummaryResponseBody build() {
            return new GetDataServiceApiCallSummaryResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetDataServiceApiCallSummaryResponseBody} extends {@link TeaModel}
     *
     * <p>GetDataServiceApiCallSummaryResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CallCount")
        private Long callCount;

        @com.aliyun.core.annotation.NameInMap("ErrorApiCount")
        private Long errorApiCount;

        @com.aliyun.core.annotation.NameInMap("ErrorAppCount")
        private Long errorAppCount;

        @com.aliyun.core.annotation.NameInMap("ErrorCount")
        private Long errorCount;

        @com.aliyun.core.annotation.NameInMap("ErrorRate")
        private Double errorRate;

        @com.aliyun.core.annotation.NameInMap("OfflineRate")
        private Double offlineRate;

        private Data(Builder builder) {
            this.callCount = builder.callCount;
            this.errorApiCount = builder.errorApiCount;
            this.errorAppCount = builder.errorAppCount;
            this.errorCount = builder.errorCount;
            this.errorRate = builder.errorRate;
            this.offlineRate = builder.offlineRate;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return callCount
         */
        public Long getCallCount() {
            return this.callCount;
        }

        /**
         * @return errorApiCount
         */
        public Long getErrorApiCount() {
            return this.errorApiCount;
        }

        /**
         * @return errorAppCount
         */
        public Long getErrorAppCount() {
            return this.errorAppCount;
        }

        /**
         * @return errorCount
         */
        public Long getErrorCount() {
            return this.errorCount;
        }

        /**
         * @return errorRate
         */
        public Double getErrorRate() {
            return this.errorRate;
        }

        /**
         * @return offlineRate
         */
        public Double getOfflineRate() {
            return this.offlineRate;
        }

        public static final class Builder {
            private Long callCount; 
            private Long errorApiCount; 
            private Long errorAppCount; 
            private Long errorCount; 
            private Double errorRate; 
            private Double offlineRate; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.callCount = model.callCount;
                this.errorApiCount = model.errorApiCount;
                this.errorAppCount = model.errorAppCount;
                this.errorCount = model.errorCount;
                this.errorRate = model.errorRate;
                this.offlineRate = model.offlineRate;
            } 

            /**
             * CallCount.
             */
            public Builder callCount(Long callCount) {
                this.callCount = callCount;
                return this;
            }

            /**
             * ErrorApiCount.
             */
            public Builder errorApiCount(Long errorApiCount) {
                this.errorApiCount = errorApiCount;
                return this;
            }

            /**
             * ErrorAppCount.
             */
            public Builder errorAppCount(Long errorAppCount) {
                this.errorAppCount = errorAppCount;
                return this;
            }

            /**
             * ErrorCount.
             */
            public Builder errorCount(Long errorCount) {
                this.errorCount = errorCount;
                return this;
            }

            /**
             * ErrorRate.
             */
            public Builder errorRate(Double errorRate) {
                this.errorRate = errorRate;
                return this;
            }

            /**
             * OfflineRate.
             */
            public Builder offlineRate(Double offlineRate) {
                this.offlineRate = offlineRate;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
