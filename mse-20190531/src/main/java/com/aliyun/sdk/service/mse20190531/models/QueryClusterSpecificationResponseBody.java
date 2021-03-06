// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryClusterSpecificationResponseBody} extends {@link TeaModel}
 *
 * <p>QueryClusterSpecificationResponseBody</p>
 */
public class QueryClusterSpecificationResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("Data")
    private java.util.List < Data> data;

    @NameInMap("ErrorCode")
    private String errorCode;

    @NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private QueryClusterSpecificationResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.errorCode = builder.errorCode;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryClusterSpecificationResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
        return this.data;
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
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
        private Integer code; 
        private java.util.List < Data> data; 
        private String errorCode; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * Code.
         */
        public Builder code(Integer code) {
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
         * ErrorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
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

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public QueryClusterSpecificationResponseBody build() {
            return new QueryClusterSpecificationResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("ClusterSpecificationName")
        private String clusterSpecificationName;

        @NameInMap("CpuCapacity")
        private String cpuCapacity;

        @NameInMap("DiskCapacity")
        private String diskCapacity;

        @NameInMap("InstanceCount")
        private String instanceCount;

        @NameInMap("MaxCon")
        private String maxCon;

        @NameInMap("MaxTps")
        private String maxTps;

        @NameInMap("MemoryCapacity")
        private String memoryCapacity;

        private Data(Builder builder) {
            this.clusterSpecificationName = builder.clusterSpecificationName;
            this.cpuCapacity = builder.cpuCapacity;
            this.diskCapacity = builder.diskCapacity;
            this.instanceCount = builder.instanceCount;
            this.maxCon = builder.maxCon;
            this.maxTps = builder.maxTps;
            this.memoryCapacity = builder.memoryCapacity;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return clusterSpecificationName
         */
        public String getClusterSpecificationName() {
            return this.clusterSpecificationName;
        }

        /**
         * @return cpuCapacity
         */
        public String getCpuCapacity() {
            return this.cpuCapacity;
        }

        /**
         * @return diskCapacity
         */
        public String getDiskCapacity() {
            return this.diskCapacity;
        }

        /**
         * @return instanceCount
         */
        public String getInstanceCount() {
            return this.instanceCount;
        }

        /**
         * @return maxCon
         */
        public String getMaxCon() {
            return this.maxCon;
        }

        /**
         * @return maxTps
         */
        public String getMaxTps() {
            return this.maxTps;
        }

        /**
         * @return memoryCapacity
         */
        public String getMemoryCapacity() {
            return this.memoryCapacity;
        }

        public static final class Builder {
            private String clusterSpecificationName; 
            private String cpuCapacity; 
            private String diskCapacity; 
            private String instanceCount; 
            private String maxCon; 
            private String maxTps; 
            private String memoryCapacity; 

            /**
             * ClusterSpecificationName.
             */
            public Builder clusterSpecificationName(String clusterSpecificationName) {
                this.clusterSpecificationName = clusterSpecificationName;
                return this;
            }

            /**
             * CpuCapacity.
             */
            public Builder cpuCapacity(String cpuCapacity) {
                this.cpuCapacity = cpuCapacity;
                return this;
            }

            /**
             * DiskCapacity.
             */
            public Builder diskCapacity(String diskCapacity) {
                this.diskCapacity = diskCapacity;
                return this;
            }

            /**
             * InstanceCount.
             */
            public Builder instanceCount(String instanceCount) {
                this.instanceCount = instanceCount;
                return this;
            }

            /**
             * MaxCon.
             */
            public Builder maxCon(String maxCon) {
                this.maxCon = maxCon;
                return this;
            }

            /**
             * MaxTps.
             */
            public Builder maxTps(String maxTps) {
                this.maxTps = maxTps;
                return this;
            }

            /**
             * MemoryCapacity.
             */
            public Builder memoryCapacity(String memoryCapacity) {
                this.memoryCapacity = memoryCapacity;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
