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
 * {@link DescribeInstanceSpecificationsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInstanceSpecificationsResponseBody</p>
 */
public class DescribeInstanceSpecificationsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

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
        private java.util.List<Data> data; 
        private String errorCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 
        private String traceId; 

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
         * <p>Information of instance types.</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error code.</p>
         * <ul>
         * <li>If the request is successful, this parameter is not returned.****</li>
         * <li>This parameter is returned only if the request failed.**** For more information, see <strong>Error codes</strong> in this topic.</li>
         * </ul>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>The returned message. Valid values:</p>
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
         * <p>91F93257-7A4A-4BD3-9A7E-2F6EAE6D****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether information of the instance types is successfully obtained. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
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
         * <p>The ID of the trace. It is used to query the details of a request.</p>
         * 
         * <strong>example:</strong>
         * <p>0a98a02315955564772843261e****</p>
         */
        public Builder traceId(String traceId) {
            this.traceId = traceId;
            return this;
        }

        public DescribeInstanceSpecificationsResponseBody build() {
            return new DescribeInstanceSpecificationsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeInstanceSpecificationsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstanceSpecificationsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Cpu")
        private Integer cpu;

        @com.aliyun.core.annotation.NameInMap("Enable")
        private Boolean enable;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Integer id;

        @com.aliyun.core.annotation.NameInMap("Memory")
        private Integer memory;

        @com.aliyun.core.annotation.NameInMap("SpecInfo")
        private String specInfo;

        @com.aliyun.core.annotation.NameInMap("Version")
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
             * <p>The CPU specification of the instance type. Unit: millicore.</p>
             * 
             * <strong>example:</strong>
             * <p>2000</p>
             */
            public Builder cpu(Integer cpu) {
                this.cpu = cpu;
                return this;
            }

            /**
             * <p>Indicates whether the instance type is available. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enable(Boolean enable) {
                this.enable = enable;
                return this;
            }

            /**
             * <p>The ID of the instance type.</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder id(Integer id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The memory size of the instance type. Unit: MB.</p>
             * 
             * <strong>example:</strong>
             * <p>4096</p>
             */
            public Builder memory(Integer memory) {
                this.memory = memory;
                return this;
            }

            /**
             * <p>The name of the instance type.</p>
             */
            public Builder specInfo(String specInfo) {
                this.specInfo = specInfo;
                return this;
            }

            /**
             * <p>The version number of the instance type.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
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
