// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

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

        private Builder() {
        } 

        private Builder(QueryResourceStaticsResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.errorCode = model.errorCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
            this.traceId = model.traceId;
        } 

        /**
         * <p>The HTTP status code. Valid values:</p>
         * <ul>
         * <li><strong>2xx</strong>: indicates that the request was successful.</li>
         * <li><strong>3xx</strong>: indicates that the request was redirected.</li>
         * <li><strong>4xx</strong>: indicates that the request was invalid.</li>
         * <li><strong>5xx</strong>: indicates that a server error occurred.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The resource usage.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error code. </p>
         * <ul>
         * <li>The <strong>ErrorCode</strong> parameter is not returned when the request succeeds.</li>
         * <li>The <strong>ErrorCode</strong> parameter is returned when the request fails. For more information, see <strong>Error codes</strong> in this topic.</li>
         * </ul>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>The returned message.</p>
         * <ul>
         * <li><strong>success</strong> is returned when the request succeeds.</li>
         * <li>An error code is returned when the request fails.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>7CCF7092-72CA-4431-90D6-C7D98752****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the resource usage of an application was obtained. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: indicates that the resource usage was obtained.</li>
         * <li><strong>false</strong>: indicates that the resource usage could not be obtained.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>The ID of the trace. It can be used to query the details of a request.</p>
         * 
         * <strong>example:</strong>
         * <p>ac1a08a015623098794277264e****</p>
         */
        public Builder traceId(String traceId) {
            this.traceId = traceId;
            return this;
        }

        public QueryResourceStaticsResponseBody build() {
            return new QueryResourceStaticsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryResourceStaticsResponseBody} extends {@link TeaModel}
     *
     * <p>QueryResourceStaticsResponseBody</p>
     */
    public static class RealTimeRes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Cpu")
        private Float cpu;

        @com.aliyun.core.annotation.NameInMap("EphemeralStorage")
        private Float ephemeralStorage;

        @com.aliyun.core.annotation.NameInMap("Memory")
        private Float memory;

        private RealTimeRes(Builder builder) {
            this.cpu = builder.cpu;
            this.ephemeralStorage = builder.ephemeralStorage;
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
         * @return ephemeralStorage
         */
        public Float getEphemeralStorage() {
            return this.ephemeralStorage;
        }

        /**
         * @return memory
         */
        public Float getMemory() {
            return this.memory;
        }

        public static final class Builder {
            private Float cpu; 
            private Float ephemeralStorage; 
            private Float memory; 

            private Builder() {
            } 

            private Builder(RealTimeRes model) {
                this.cpu = model.cpu;
                this.ephemeralStorage = model.ephemeralStorage;
                this.memory = model.memory;
            } 

            /**
             * <p>The CPU usage. Unit: core per minute.</p>
             * 
             * <strong>example:</strong>
             * <p>13</p>
             */
            public Builder cpu(Float cpu) {
                this.cpu = cpu;
                return this;
            }

            /**
             * EphemeralStorage.
             */
            public Builder ephemeralStorage(Float ephemeralStorage) {
                this.ephemeralStorage = ephemeralStorage;
                return this;
            }

            /**
             * <p>The memory usage. Unit: GiB per minute.</p>
             * 
             * <strong>example:</strong>
             * <p>26</p>
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
    /**
     * 
     * {@link QueryResourceStaticsResponseBody} extends {@link TeaModel}
     *
     * <p>QueryResourceStaticsResponseBody</p>
     */
    public static class Summary extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ActiveCpu")
        private Float activeCpu;

        @com.aliyun.core.annotation.NameInMap("Cpu")
        private Float cpu;

        @com.aliyun.core.annotation.NameInMap("Cu")
        private Float cu;

        @com.aliyun.core.annotation.NameInMap("EphemeralStorage")
        private Float ephemeralStorage;

        @com.aliyun.core.annotation.NameInMap("GpuA10")
        private Float gpuA10;

        @com.aliyun.core.annotation.NameInMap("GpuPpu810e")
        private Float gpuPpu810e;

        @com.aliyun.core.annotation.NameInMap("IdleCpu")
        private Float idleCpu;

        @com.aliyun.core.annotation.NameInMap("Memory")
        private Float memory;

        private Summary(Builder builder) {
            this.activeCpu = builder.activeCpu;
            this.cpu = builder.cpu;
            this.cu = builder.cu;
            this.ephemeralStorage = builder.ephemeralStorage;
            this.gpuA10 = builder.gpuA10;
            this.gpuPpu810e = builder.gpuPpu810e;
            this.idleCpu = builder.idleCpu;
            this.memory = builder.memory;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Summary create() {
            return builder().build();
        }

        /**
         * @return activeCpu
         */
        public Float getActiveCpu() {
            return this.activeCpu;
        }

        /**
         * @return cpu
         */
        public Float getCpu() {
            return this.cpu;
        }

        /**
         * @return cu
         */
        public Float getCu() {
            return this.cu;
        }

        /**
         * @return ephemeralStorage
         */
        public Float getEphemeralStorage() {
            return this.ephemeralStorage;
        }

        /**
         * @return gpuA10
         */
        public Float getGpuA10() {
            return this.gpuA10;
        }

        /**
         * @return gpuPpu810e
         */
        public Float getGpuPpu810e() {
            return this.gpuPpu810e;
        }

        /**
         * @return idleCpu
         */
        public Float getIdleCpu() {
            return this.idleCpu;
        }

        /**
         * @return memory
         */
        public Float getMemory() {
            return this.memory;
        }

        public static final class Builder {
            private Float activeCpu; 
            private Float cpu; 
            private Float cu; 
            private Float ephemeralStorage; 
            private Float gpuA10; 
            private Float gpuPpu810e; 
            private Float idleCpu; 
            private Float memory; 

            private Builder() {
            } 

            private Builder(Summary model) {
                this.activeCpu = model.activeCpu;
                this.cpu = model.cpu;
                this.cu = model.cu;
                this.ephemeralStorage = model.ephemeralStorage;
                this.gpuA10 = model.gpuA10;
                this.gpuPpu810e = model.gpuPpu810e;
                this.idleCpu = model.idleCpu;
                this.memory = model.memory;
            } 

            /**
             * ActiveCpu.
             */
            public Builder activeCpu(Float activeCpu) {
                this.activeCpu = activeCpu;
                return this;
            }

            /**
             * <p>The CPU usage. Unit: core per minute.</p>
             * 
             * <strong>example:</strong>
             * <p>3354</p>
             */
            public Builder cpu(Float cpu) {
                this.cpu = cpu;
                return this;
            }

            /**
             * Cu.
             */
            public Builder cu(Float cu) {
                this.cu = cu;
                return this;
            }

            /**
             * EphemeralStorage.
             */
            public Builder ephemeralStorage(Float ephemeralStorage) {
                this.ephemeralStorage = ephemeralStorage;
                return this;
            }

            /**
             * GpuA10.
             */
            public Builder gpuA10(Float gpuA10) {
                this.gpuA10 = gpuA10;
                return this;
            }

            /**
             * GpuPpu810e.
             */
            public Builder gpuPpu810e(Float gpuPpu810e) {
                this.gpuPpu810e = gpuPpu810e;
                return this;
            }

            /**
             * IdleCpu.
             */
            public Builder idleCpu(Float idleCpu) {
                this.idleCpu = idleCpu;
                return this;
            }

            /**
             * <p>The memory usage. Unit: GiB per minute.</p>
             * 
             * <strong>example:</strong>
             * <p>6708</p>
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
    /**
     * 
     * {@link QueryResourceStaticsResponseBody} extends {@link TeaModel}
     *
     * <p>QueryResourceStaticsResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(Data model) {
                this.realTimeRes = model.realTimeRes;
                this.summary = model.summary;
            } 

            /**
             * <p>The real-time resource usage.</p>
             */
            public Builder realTimeRes(RealTimeRes realTimeRes) {
                this.realTimeRes = realTimeRes;
                return this;
            }

            /**
             * <p>The resource usage of the current month.</p>
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
