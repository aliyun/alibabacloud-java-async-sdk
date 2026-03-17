// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rdsai20250507.models;

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
 * {@link DescribeEdgeFunctionsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeEdgeFunctionsResponseBody</p>
 */
public class DescribeEdgeFunctionsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("EdgeFunctions")
    private java.util.List<EdgeFunctions> edgeFunctions;

    @com.aliyun.core.annotation.NameInMap("InstanceName")
    private String instanceName;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeEdgeFunctionsResponseBody(Builder builder) {
        this.edgeFunctions = builder.edgeFunctions;
        this.instanceName = builder.instanceName;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeEdgeFunctionsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return edgeFunctions
     */
    public java.util.List<EdgeFunctions> getEdgeFunctions() {
        return this.edgeFunctions;
    }

    /**
     * @return instanceName
     */
    public String getInstanceName() {
        return this.instanceName;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<EdgeFunctions> edgeFunctions; 
        private String instanceName; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeEdgeFunctionsResponseBody model) {
            this.edgeFunctions = model.edgeFunctions;
            this.instanceName = model.instanceName;
            this.requestId = model.requestId;
        } 

        /**
         * EdgeFunctions.
         */
        public Builder edgeFunctions(java.util.List<EdgeFunctions> edgeFunctions) {
            this.edgeFunctions = edgeFunctions;
            return this;
        }

        /**
         * InstanceName.
         */
        public Builder instanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>FE9C65D7-930F-57A5-A207-8C396329****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeEdgeFunctionsResponseBody build() {
            return new DescribeEdgeFunctionsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeEdgeFunctionsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeEdgeFunctionsResponseBody</p>
     */
    public static class EdgeFunctions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Cpu")
        private String cpu;

        @com.aliyun.core.annotation.NameInMap("CreatedTime")
        private String createdTime;

        @com.aliyun.core.annotation.NameInMap("EdgeFunctionName")
        private String edgeFunctionName;

        @com.aliyun.core.annotation.NameInMap("FunctionUrl")
        private String functionUrl;

        @com.aliyun.core.annotation.NameInMap("MemorySize")
        private String memorySize;

        @com.aliyun.core.annotation.NameInMap("ModifiedTime")
        private String modifiedTime;

        @com.aliyun.core.annotation.NameInMap("Runtime")
        private String runtime;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("UrlInternet")
        private String urlInternet;

        @com.aliyun.core.annotation.NameInMap("UrlIntranet")
        private String urlIntranet;

        private EdgeFunctions(Builder builder) {
            this.cpu = builder.cpu;
            this.createdTime = builder.createdTime;
            this.edgeFunctionName = builder.edgeFunctionName;
            this.functionUrl = builder.functionUrl;
            this.memorySize = builder.memorySize;
            this.modifiedTime = builder.modifiedTime;
            this.runtime = builder.runtime;
            this.status = builder.status;
            this.urlInternet = builder.urlInternet;
            this.urlIntranet = builder.urlIntranet;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EdgeFunctions create() {
            return builder().build();
        }

        /**
         * @return cpu
         */
        public String getCpu() {
            return this.cpu;
        }

        /**
         * @return createdTime
         */
        public String getCreatedTime() {
            return this.createdTime;
        }

        /**
         * @return edgeFunctionName
         */
        public String getEdgeFunctionName() {
            return this.edgeFunctionName;
        }

        /**
         * @return functionUrl
         */
        public String getFunctionUrl() {
            return this.functionUrl;
        }

        /**
         * @return memorySize
         */
        public String getMemorySize() {
            return this.memorySize;
        }

        /**
         * @return modifiedTime
         */
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        /**
         * @return runtime
         */
        public String getRuntime() {
            return this.runtime;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return urlInternet
         */
        public String getUrlInternet() {
            return this.urlInternet;
        }

        /**
         * @return urlIntranet
         */
        public String getUrlIntranet() {
            return this.urlIntranet;
        }

        public static final class Builder {
            private String cpu; 
            private String createdTime; 
            private String edgeFunctionName; 
            private String functionUrl; 
            private String memorySize; 
            private String modifiedTime; 
            private String runtime; 
            private String status; 
            private String urlInternet; 
            private String urlIntranet; 

            private Builder() {
            } 

            private Builder(EdgeFunctions model) {
                this.cpu = model.cpu;
                this.createdTime = model.createdTime;
                this.edgeFunctionName = model.edgeFunctionName;
                this.functionUrl = model.functionUrl;
                this.memorySize = model.memorySize;
                this.modifiedTime = model.modifiedTime;
                this.runtime = model.runtime;
                this.status = model.status;
                this.urlInternet = model.urlInternet;
                this.urlIntranet = model.urlIntranet;
            } 

            /**
             * Cpu.
             */
            public Builder cpu(String cpu) {
                this.cpu = cpu;
                return this;
            }

            /**
             * CreatedTime.
             */
            public Builder createdTime(String createdTime) {
                this.createdTime = createdTime;
                return this;
            }

            /**
             * EdgeFunctionName.
             */
            public Builder edgeFunctionName(String edgeFunctionName) {
                this.edgeFunctionName = edgeFunctionName;
                return this;
            }

            /**
             * FunctionUrl.
             */
            public Builder functionUrl(String functionUrl) {
                this.functionUrl = functionUrl;
                return this;
            }

            /**
             * MemorySize.
             */
            public Builder memorySize(String memorySize) {
                this.memorySize = memorySize;
                return this;
            }

            /**
             * ModifiedTime.
             */
            public Builder modifiedTime(String modifiedTime) {
                this.modifiedTime = modifiedTime;
                return this;
            }

            /**
             * Runtime.
             */
            public Builder runtime(String runtime) {
                this.runtime = runtime;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * UrlInternet.
             */
            public Builder urlInternet(String urlInternet) {
                this.urlInternet = urlInternet;
                return this;
            }

            /**
             * UrlIntranet.
             */
            public Builder urlIntranet(String urlIntranet) {
                this.urlIntranet = urlIntranet;
                return this;
            }

            public EdgeFunctions build() {
                return new EdgeFunctions(this);
            } 

        } 

    }
}
