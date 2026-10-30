// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sysom20231230.models;

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
 * {@link GetGpuClusterTopologyResponseBody} extends {@link TeaModel}
 *
 * <p>GetGpuClusterTopologyResponseBody</p>
 */
public class GetGpuClusterTopologyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private GetGpuClusterTopologyResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetGpuClusterTopologyResponseBody create() {
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
        private String message; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetGpuClusterTopologyResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The response code. Valid values: Success, Sysom.ServerError, and Sysom.InvalidParameter.</p>
         * 
         * <strong>example:</strong>
         * <p>Fail/Success</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The data returned by the operation.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error message returned when the code is not Success.</p>
         * 
         * <strong>example:</strong>
         * <p>some error msg if not success，“” if success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>return real request ID</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetGpuClusterTopologyResponseBody build() {
            return new GetGpuClusterTopologyResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetGpuClusterTopologyResponseBody} extends {@link TeaModel}
     *
     * <p>GetGpuClusterTopologyResponseBody</p>
     */
    public static class DataData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("edges")
        private Object edges;

        @com.aliyun.core.annotation.NameInMap("nodes")
        private Object nodes;

        private DataData(Builder builder) {
            this.edges = builder.edges;
            this.nodes = builder.nodes;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataData create() {
            return builder().build();
        }

        /**
         * @return edges
         */
        public Object getEdges() {
            return this.edges;
        }

        /**
         * @return nodes
         */
        public Object getNodes() {
            return this.nodes;
        }

        public static final class Builder {
            private Object edges; 
            private Object nodes; 

            private Builder() {
            } 

            private Builder(DataData model) {
                this.edges = model.edges;
                this.nodes = model.nodes;
            } 

            /**
             * <p>The edge data in the topology structure.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;edges&quot;: [
             *         {
             *           &quot;type&quot;: &quot;GPU&quot;,
             *           &quot;src_id&quot;: &quot;00534a88&quot;,
             *           &quot;dst_id&quot;: &quot;260525e9&quot;,
             *           &quot;values&quot;: {
             *             &quot;Exception&quot;: [
             *               {
             *                 &quot;key&quot;: &quot;NCCL HANG&quot;,
             *                 &quot;value&quot;: &quot;error0&quot;
             *               }
             *             ],
             *             &quot;Metric&quot;: [
             *               {
             *                 &quot;key&quot;: &quot;a&quot;,
             *                 &quot;value&quot;: &quot;372201199012283428&quot;
             *               }
             *             ],
             *             &quot;Basic&quot;: [
             *               {
             *                 &quot;key&quot;: &quot;NCCL Version&quot;,
             *                 &quot;value&quot;: &quot;v2.22.3&quot;
             *               }
             *             ]
             *           },
             *           &quot;style&quot;: {
             *             &quot;lineWidth&quot;: &quot;0.01&quot;,
             *             &quot;opacity&quot;: &quot;1&quot;,
             *             &quot;selectedStyle&quot;: &quot;\&quot;{\\\&quot;opacity\\\&quot;: 1, \\\&quot;lineWidth\\\&quot;: 1}\&quot;&quot;,
             *             &quot;stroke&quot;: &quot;#e94242\n&quot;
             *           }
             *         }
             *       ]</p>
             */
            public Builder edges(Object edges) {
                this.edges = edges;
                return this;
            }

            /**
             * <p>The node data in the topology structure.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;nodes&quot;: [
             *         {
             *           &quot;id&quot;: &quot;i-xxxxxx&quot;,
             *           &quot;name&quot;: &quot;i-xxxxxx&quot;,
             *           &quot;gpu_list&quot;: [
             *             {
             *               &quot;id&quot;: &quot;6cc37fbc&quot;,
             *               &quot;name&quot;: &quot;GPU0&quot;,
             *               &quot;style&quot;: {
             *                 &quot;fill&quot;: &quot;#e94242&quot;,
             *                 &quot;opacity&quot;: &quot;0.1&quot;
             *               },
             *               &quot;values&quot;: {
             *                 &quot;Metric&quot;: [
             *                   {
             *                     &quot;key&quot;: &quot;0&quot;,
             *                     &quot;value&quot;: &quot;gpu_util(%)&quot;
             *                   }
             *                 ],
             *                 &quot;Basic&quot;: [
             *                   {
             *                     &quot;key&quot;: &quot;1&quot;,
             *                     &quot;value&quot;: &quot;Gpu Number&quot;
             *                   }
             *                 ],
             *                 &quot;Exception&quot;: [
             *                   {
             *                     &quot;key&quot;: &quot;NCCL HANG&quot;,
             *                     &quot;value&quot;: &quot;error0&quot;
             *                   }
             *                 ]
             *               }
             *             }
             *           ],
             *           &quot;style&quot;: {
             *             &quot;fillOpacity&quot;: &quot;0.5&quot;,
             *             &quot;fill&quot;: &quot;#e94242&quot;
             *           },
             *           &quot;values&quot;: {
             *             &quot;Exception&quot;: [
             *               {
             *                 &quot;key&quot;: &quot;NCCL HANG&quot;,
             *                 &quot;value&quot;: &quot;error0&quot;
             *               }
             *             ],
             *             &quot;Basic&quot;: [
             *               {
             *                 &quot;key&quot;: &quot;podList&quot;,
             *                 &quot;value&quot;: &quot;podname1&quot;
             *               }
             *             ],
             *             &quot;Metric&quot;: [
             *               {
             *                 &quot;key&quot;: &quot;instance&quot;,
             *                 &quot;value&quot;: &quot;i-xxxxxx&quot;
             *               }
             *             ]
             *           }
             *         }
             *       ],</p>
             */
            public Builder nodes(Object nodes) {
                this.nodes = nodes;
                return this;
            }

            public DataData build() {
                return new DataData(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetGpuClusterTopologyResponseBody} extends {@link TeaModel}
     *
     * <p>GetGpuClusterTopologyResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("data")
        private DataData data;

        @com.aliyun.core.annotation.NameInMap("total")
        private Integer total;

        private Data(Builder builder) {
            this.data = builder.data;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return data
         */
        public DataData getData() {
            return this.data;
        }

        /**
         * @return total
         */
        public Integer getTotal() {
            return this.total;
        }

        public static final class Builder {
            private DataData data; 
            private Integer total; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.data = model.data;
                this.total = model.total;
            } 

            /**
             * <p>The cluster topology data structure.</p>
             */
            public Builder data(DataData data) {
                this.data = data;
                return this;
            }

            /**
             * <p>The total number of GPUs returned.</p>
             * 
             * <strong>example:</strong>
             * <p>36</p>
             */
            public Builder total(Integer total) {
                this.total = total;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
