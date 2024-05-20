// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryResourceStaticsResponseBody} extends {@link TeaModel}
 *
 * <p>QueryResourceStaticsResponseBody</p>
 */
public class QueryResourceStaticsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TraceId")
    private String traceId;

    private QueryResourceStaticsResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.errorCode = builder.errorCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.traceId = builder.traceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryResourceStaticsResponseBody create() {
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
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
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

    /**
     * @return traceId
     */
    public String getTraceId() {
        return this.traceId;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String errorCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 
        private String traceId; 

        /**
         * The HTTP status code. Valid values:
         * <p>
         * 
         * *   **2xx**: indicates that the request was successful.
         * *   **3xx**: indicates that the request was redirected.
         * *   **4xx**: indicates that the request was invalid.
         * *   **5xx**: indicates that a server error occurred.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The resource usage.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The error code. 
         * <p>
         * 
         * - The **ErrorCode** parameter is not returned when the request succeeds.
         * - The **ErrorCode** parameter is returned when the request fails. For more information, see **Error codes** in this topic.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * The returned message.
         * <p>
         * 
         * *   **success** is returned when the request succeeds.
         * *   An error code is returned when the request fails.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the resource usage of an application was obtained. Valid values:
         * <p>
         * 
         * *   **true**: indicates that the resource usage was obtained.
         * *   **false**: indicates that the resource usage could not be obtained.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * The ID of the trace. It can be used to query the details of a request.
         */
        public Builder traceId(String traceId) {
            this.traceId = traceId;
            return this;
        }

        public QueryResourceStaticsResponseBody build() {
            return new QueryResourceStaticsResponseBody(this);
        } 

    } 

    public static class RealTimeRes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Cpu")
        private Float cpu;

        @com.aliyun.core.annotation.NameInMap("Memory")
        private Float memory;

        private RealTimeRes(Builder builder) {
            this.cpu = builder.cpu;
            this.memory = builder.memory;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RealTimeRes create() {
            return builder().build();
        }

        /**
         * @return cpu
         */
        public Float getCpu() {
            return this.cpu;
        }

        /**
         * @return memory
         */
        public Float getMemory() {
            return this.memory;
        }

        public static final class Builder {
            private Float cpu; 
            private Float memory; 

            /**
             * The CPU usage. Unit: core per minute.
             */
            public Builder cpu(Float cpu) {
                this.cpu = cpu;
                return this;
            }

            /**
             * The memory usage. Unit: GiB per minute.
             */
            public Builder memory(Float memory) {
                this.memory = memory;
                return this;
            }

            public RealTimeRes build() {
                return new RealTimeRes(this);
            } 

        } 

    }
    public static class Summary extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Cpu")
        private Float cpu;

        @com.aliyun.core.annotation.NameInMap("Memory")
        private Float memory;

        private Summary(Builder builder) {
            this.cpu = builder.cpu;
            this.memory = builder.memory;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Summary create() {
            return builder().build();
        }

        /**
         * @return cpu
         */
        public Float getCpu() {
            return this.cpu;
        }

        /**
         * @return memory
         */
        public Float getMemory() {
            return this.memory;
        }

        public static final class Builder {
            private Float cpu; 
            private Float memory; 

            /**
             * The CPU usage. Unit: core per minute.
             */
            public Builder cpu(Float cpu) {
                this.cpu = cpu;
                return this;
            }

            /**
             * The memory usage. Unit: GiB per minute.
             */
            public Builder memory(Float memory) {
                this.memory = memory;
                return this;
            }

            public Summary build() {
                return new Summary(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RealTimeRes")
        private RealTimeRes realTimeRes;

        @com.aliyun.core.annotation.NameInMap("Summary")
        private Summary summary;

        private Data(Builder builder) {
            this.realTimeRes = builder.realTimeRes;
            this.summary = builder.summary;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return realTimeRes
         */
        public RealTimeRes getRealTimeRes() {
            return this.realTimeRes;
        }

        /**
         * @return summary
         */
        public Summary getSummary() {
            return this.summary;
        }

        public static final class Builder {
            private RealTimeRes realTimeRes; 
            private Summary summary; 

            /**
             * The real-time resource usage.
             */
            public Builder realTimeRes(RealTimeRes realTimeRes) {
                this.realTimeRes = realTimeRes;
                return this;
            }

            /**
             * The resource usage of the current month.
             */
            public Builder summary(Summary summary) {
                this.summary = summary;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
