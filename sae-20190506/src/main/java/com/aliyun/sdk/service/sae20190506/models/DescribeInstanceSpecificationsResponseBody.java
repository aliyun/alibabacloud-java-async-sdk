// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeInstanceSpecificationsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInstanceSpecificationsResponseBody</p>
 */
public class DescribeInstanceSpecificationsResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private java.util.List < Data> data;

    @NameInMap("ErrorCode")
    private String errorCode;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("TraceId")
    private String traceId;

    private DescribeInstanceSpecificationsResponseBody(Builder builder) {
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

    public static DescribeInstanceSpecificationsResponseBody create() {
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
        private java.util.List < Data> data; 
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
         * Information of instance types.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * The error code.
         * <p>
         * 
         * *   If the request is successful, this parameter is not returned.****
         * *   This parameter is returned only if the request failed.**** For more information, see **Error codes** in this topic.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * The returned message. Valid values:
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
         * Indicates whether information of the instance types is successfully obtained. Valid values:
         * <p>
         * 
         * *   **true**
         * *   **false**
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * The ID of the trace. It is used to query the details of a request.
         */
        public Builder traceId(String traceId) {
            this.traceId = traceId;
            return this;
        }

        public DescribeInstanceSpecificationsResponseBody build() {
            return new DescribeInstanceSpecificationsResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("Cpu")
        private Integer cpu;

        @NameInMap("Enable")
        private Boolean enable;

        @NameInMap("Id")
        private Integer id;

        @NameInMap("Memory")
        private Integer memory;

        @NameInMap("SpecInfo")
        private String specInfo;

        @NameInMap("Version")
        private Integer version;

        private Data(Builder builder) {
            this.cpu = builder.cpu;
            this.enable = builder.enable;
            this.id = builder.id;
            this.memory = builder.memory;
            this.specInfo = builder.specInfo;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return cpu
         */
        public Integer getCpu() {
            return this.cpu;
        }

        /**
         * @return enable
         */
        public Boolean getEnable() {
            return this.enable;
        }

        /**
         * @return id
         */
        public Integer getId() {
            return this.id;
        }

        /**
         * @return memory
         */
        public Integer getMemory() {
            return this.memory;
        }

        /**
         * @return specInfo
         */
        public String getSpecInfo() {
            return this.specInfo;
        }

        /**
         * @return version
         */
        public Integer getVersion() {
            return this.version;
        }

        public static final class Builder {
            private Integer cpu; 
            private Boolean enable; 
            private Integer id; 
            private Integer memory; 
            private String specInfo; 
            private Integer version; 

            /**
             * The CPU specification of the instance type. Unit: millicore.
             */
            public Builder cpu(Integer cpu) {
                this.cpu = cpu;
                return this;
            }

            /**
             * Indicates whether the instance type is available. Valid values:
             * <p>
             * 
             * *   **true**
             * *   **false**
             */
            public Builder enable(Boolean enable) {
                this.enable = enable;
                return this;
            }

            /**
             * The ID of the instance type.
             */
            public Builder id(Integer id) {
                this.id = id;
                return this;
            }

            /**
             * The memory size of the instance type. Unit: MB.
             */
            public Builder memory(Integer memory) {
                this.memory = memory;
                return this;
            }

            /**
             * The name of the instance type.
             */
            public Builder specInfo(String specInfo) {
                this.specInfo = specInfo;
                return this;
            }

            /**
             * The version number of the instance type.
             */
            public Builder version(Integer version) {
                this.version = version;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
