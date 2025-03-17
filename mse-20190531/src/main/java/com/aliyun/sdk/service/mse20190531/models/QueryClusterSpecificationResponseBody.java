// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

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
 * {@link QueryClusterSpecificationResponseBody} extends {@link TeaModel}
 *
 * <p>QueryClusterSpecificationResponseBody</p>
 */
public class QueryClusterSpecificationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
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

    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List<Data> getData() {
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
        private java.util.List<Data> data; 
        private String errorCode; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(QueryClusterSpecificationResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.errorCode = model.errorCode;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The return value.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The details of the data.</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error code returned if the request failed.</p>
         * 
         * <strong>example:</strong>
         * <p>mse-100-000</p>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>The HTTP status code returned.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The message returned.</p>
         * 
         * <strong>example:</strong>
         * <p>The request was successfully processed.</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>EE5C32A1-BC0E-4B79-817C-103E4EDF****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li><code>true</code>: The request was successful.</li>
         * <li><code>false</code>: The request failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public QueryClusterSpecificationResponseBody build() {
            return new QueryClusterSpecificationResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryClusterSpecificationResponseBody} extends {@link TeaModel}
     *
     * <p>QueryClusterSpecificationResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClusterSpecificationName")
        private String clusterSpecificationName;

        @com.aliyun.core.annotation.NameInMap("CpuCapacity")
        private String cpuCapacity;

        @com.aliyun.core.annotation.NameInMap("MemoryCapacity")
        private String memoryCapacity;

        private Data(Builder builder) {
            this.clusterSpecificationName = builder.clusterSpecificationName;
            this.cpuCapacity = builder.cpuCapacity;
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
         * @return memoryCapacity
         */
        public String getMemoryCapacity() {
            return this.memoryCapacity;
        }

        public static final class Builder {
            private String clusterSpecificationName; 
            private String cpuCapacity; 
            private String memoryCapacity; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.clusterSpecificationName = model.clusterSpecificationName;
                this.cpuCapacity = model.cpuCapacity;
                this.memoryCapacity = model.memoryCapacity;
            } 

            /**
             * <p>The engine specifications that can be used.</p>
             * 
             * <strong>example:</strong>
             * <p>MSE_SC_1_2_200_c</p>
             */
            public Builder clusterSpecificationName(String clusterSpecificationName) {
                this.clusterSpecificationName = clusterSpecificationName;
                return this;
            }

            /**
             * <p>The number of vCPUs in the specifications.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder cpuCapacity(String cpuCapacity) {
                this.cpuCapacity = cpuCapacity;
                return this;
            }

            /**
             * <p>The memory size in the specifications. Unit: GB.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
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
