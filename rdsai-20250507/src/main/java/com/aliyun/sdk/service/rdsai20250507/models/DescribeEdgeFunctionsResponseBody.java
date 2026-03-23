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
         * <p>The list of edge functions.</p>
         */
        public Builder edgeFunctions(java.util.List<EdgeFunctions> edgeFunctions) {
            this.edgeFunctions = edgeFunctions;
            return this;
        }

        /**
         * <p>The ID of the RDS Supabase instance.</p>
         * 
         * <strong>example:</strong>
         * <p>ra-supabase-8moov5lxba****</p>
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
             * <p>The number of vCPUs used by the cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder cpu(String cpu) {
                this.cpu = cpu;
                return this;
            }

            /**
             * <p>The time when the function was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-11-12T21:35:03</p>
             */
            public Builder createdTime(String createdTime) {
                this.createdTime = createdTime;
                return this;
            }

            /**
             * <p>The edge function name.</p>
             * 
             * <strong>example:</strong>
             * <p>ef-****</p>
             */
            public Builder edgeFunctionName(String edgeFunctionName) {
                this.edgeFunctionName = edgeFunctionName;
                return this;
            }

            /**
             * <p>The URL for accessing the function.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://fcnext.console.aliyun.com/cn-beijing/functions/fc">https://fcnext.console.aliyun.com/cn-beijing/functions/fc</a>****</p>
             */
            public Builder functionUrl(String functionUrl) {
                this.functionUrl = functionUrl;
                return this;
            }

            /**
             * <p>The memory size. Unit: MiB.</p>
             * 
             * <strong>example:</strong>
             * <p>512</p>
             */
            public Builder memorySize(String memorySize) {
                this.memorySize = memorySize;
                return this;
            }

            /**
             * <p>The time when the function was last created. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-05-25 10:22:54 +0800</p>
             */
            public Builder modifiedTime(String modifiedTime) {
                this.modifiedTime = modifiedTime;
                return this;
            }

            /**
             * <p>The runtime environment for the function, which includes the Linux environment and the Deno version.</p>
             * 
             * <strong>example:</strong>
             * <p>custom.debian12-deno-2.5.6</p>
             */
            public Builder runtime(String runtime) {
                this.runtime = runtime;
                return this;
            }

            /**
             * <p>The instance status. For more information, see <a href="https://help.aliyun.com/document_detail/2623972.html">Instance state table</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>Running</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The public URL for accessing the application.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://fc-bfvmoi****.cn-beijing.fcapp.run">https://fc-bfvmoi****.cn-beijing.fcapp.run</a></p>
             */
            public Builder urlInternet(String urlInternet) {
                this.urlInternet = urlInternet;
                return this;
            }

            /**
             * <p>The internal URL for accessing the application.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://fc-bfvmoi****.cn-beijing-vpc.fcapp.run">https://fc-bfvmoi****.cn-beijing-vpc.fcapp.run</a></p>
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
