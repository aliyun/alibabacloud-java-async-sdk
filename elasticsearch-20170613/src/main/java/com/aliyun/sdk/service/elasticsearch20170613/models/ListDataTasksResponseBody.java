// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

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
 * {@link ListDataTasksResponseBody} extends {@link TeaModel}
 *
 * <p>ListDataTasksResponseBody</p>
 */
public class ListDataTasksResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private java.util.List<Result> result;

    private ListDataTasksResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDataTasksResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return result
     */
    public java.util.List<Result> getResult() {
        return this.result;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<Result> result; 

        private Builder() {
        } 

        private Builder(ListDataTasksResponseBody model) {
            this.requestId = model.requestId;
            this.result = model.result;
        } 

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>5FFD9ED4-C2EC-4E89-B22B-1ACB6FE1D***</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The return results.</p>
         */
        public Builder result(java.util.List<Result> result) {
            this.result = result;
            return this;
        }

        public ListDataTasksResponseBody build() {
            return new ListDataTasksResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListDataTasksResponseBody} extends {@link TeaModel}
     *
     * <p>ListDataTasksResponseBody</p>
     */
    public static class SinkCluster extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("dataSourceType")
        private String dataSourceType;

        @com.aliyun.core.annotation.NameInMap("endpoint")
        private String endpoint;

        @com.aliyun.core.annotation.NameInMap("index")
        private String index;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("vpcId")
        private String vpcId;

        @com.aliyun.core.annotation.NameInMap("vpcInstanceId")
        private String vpcInstanceId;

        @com.aliyun.core.annotation.NameInMap("vpcInstancePort")
        private String vpcInstancePort;

        private SinkCluster(Builder builder) {
            this.dataSourceType = builder.dataSourceType;
            this.endpoint = builder.endpoint;
            this.index = builder.index;
            this.type = builder.type;
            this.vpcId = builder.vpcId;
            this.vpcInstanceId = builder.vpcInstanceId;
            this.vpcInstancePort = builder.vpcInstancePort;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SinkCluster create() {
            return builder().build();
        }

        /**
         * @return dataSourceType
         */
        public String getDataSourceType() {
            return this.dataSourceType;
        }

        /**
         * @return endpoint
         */
        public String getEndpoint() {
            return this.endpoint;
        }

        /**
         * @return index
         */
        public String getIndex() {
            return this.index;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        /**
         * @return vpcInstanceId
         */
        public String getVpcInstanceId() {
            return this.vpcInstanceId;
        }

        /**
         * @return vpcInstancePort
         */
        public String getVpcInstancePort() {
            return this.vpcInstancePort;
        }

        public static final class Builder {
            private String dataSourceType; 
            private String endpoint; 
            private String index; 
            private String type; 
            private String vpcId; 
            private String vpcInstanceId; 
            private String vpcInstancePort; 

            private Builder() {
            } 

            private Builder(SinkCluster model) {
                this.dataSourceType = model.dataSourceType;
                this.endpoint = model.endpoint;
                this.index = model.index;
                this.type = model.type;
                this.vpcId = model.vpcId;
                this.vpcInstanceId = model.vpcInstanceId;
                this.vpcInstancePort = model.vpcInstancePort;
            } 

            /**
             * <p>The type of the target cluster. Default value: elasticsearch.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder dataSourceType(String dataSourceType) {
                this.dataSourceType = dataSourceType;
                return this;
            }

            /**
             * <p>The public network access address of the target cluster.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://192.168.xx.xx:4101">http://192.168.xx.xx:4101</a></p>
             */
            public Builder endpoint(String endpoint) {
                this.endpoint = endpoint;
                return this;
            }

            /**
             * <p>The target index.</p>
             * 
             * <strong>example:</strong>
             * <p>product_info</p>
             */
            public Builder index(String index) {
                this.index = index;
                return this;
            }

            /**
             * <p>The type of the destination index.</p>
             * 
             * <strong>example:</strong>
             * <p>_doc</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The ID of the VPC to which the cluster belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-2ze55voww95g82gak****</p>
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * <p>The instance ID or Server Load Balancer (SLB) ID of the current cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>es-cn-09k1rnu3g0002****-worker</p>
             */
            public Builder vpcInstanceId(String vpcInstanceId) {
                this.vpcInstanceId = vpcInstanceId;
                return this;
            }

            /**
             * <p>The access port number of the cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>9200</p>
             */
            public Builder vpcInstancePort(String vpcInstancePort) {
                this.vpcInstancePort = vpcInstancePort;
                return this;
            }

            public SinkCluster build() {
                return new SinkCluster(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListDataTasksResponseBody} extends {@link TeaModel}
     *
     * <p>ListDataTasksResponseBody</p>
     */
    public static class SourceCluster extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("dataSourceType")
        private String dataSourceType;

        @com.aliyun.core.annotation.NameInMap("index")
        private String index;

        @com.aliyun.core.annotation.NameInMap("mapping")
        private String mapping;

        @com.aliyun.core.annotation.NameInMap("routing")
        private String routing;

        @com.aliyun.core.annotation.NameInMap("settings")
        private String settings;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        private SourceCluster(Builder builder) {
            this.dataSourceType = builder.dataSourceType;
            this.index = builder.index;
            this.mapping = builder.mapping;
            this.routing = builder.routing;
            this.settings = builder.settings;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SourceCluster create() {
            return builder().build();
        }

        /**
         * @return dataSourceType
         */
        public String getDataSourceType() {
            return this.dataSourceType;
        }

        /**
         * @return index
         */
        public String getIndex() {
            return this.index;
        }

        /**
         * @return mapping
         */
        public String getMapping() {
            return this.mapping;
        }

        /**
         * @return routing
         */
        public String getRouting() {
            return this.routing;
        }

        /**
         * @return settings
         */
        public String getSettings() {
            return this.settings;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String dataSourceType; 
            private String index; 
            private String mapping; 
            private String routing; 
            private String settings; 
            private String type; 

            private Builder() {
            } 

            private Builder(SourceCluster model) {
                this.dataSourceType = model.dataSourceType;
                this.index = model.index;
                this.mapping = model.mapping;
                this.routing = model.routing;
                this.settings = model.settings;
                this.type = model.type;
            } 

            /**
             * <p>The type of the source cluster. Default value: elasticsearch.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder dataSourceType(String dataSourceType) {
                this.dataSourceType = dataSourceType;
                return this;
            }

            /**
             * <p>The index whose data you want to migrate.</p>
             * 
             * <strong>example:</strong>
             * <p>product_info</p>
             */
            public Builder index(String index) {
                this.index = index;
                return this;
            }

            /**
             * <p>The Mapping configuration of the cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;_doc&quot;:{&quot;properties&quot;:{&quot;user&quot;:{&quot;properties&quot;:{&quot;last&quot;:{&quot;type&quot;:&quot;text&quot;,...}}}}}}</p>
             */
            public Builder mapping(String mapping) {
                this.mapping = mapping;
                return this;
            }

            /**
             * <p>The routing field to index the table. It is set to the primary key by default.</p>
             * 
             * <strong>example:</strong>
             * <p>_id</p>
             */
            public Builder routing(String routing) {
                this.routing = routing;
                return this;
            }

            /**
             * <p>The Settings of the cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>{\n  &quot;index&quot;: {\n    &quot;replication&quot;: {\n}.....}}</p>
             */
            public Builder settings(String settings) {
                this.settings = settings;
                return this;
            }

            /**
             * <p>The type of the destination index.</p>
             * 
             * <strong>example:</strong>
             * <p>_doc</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public SourceCluster build() {
                return new SourceCluster(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListDataTasksResponseBody} extends {@link TeaModel}
     *
     * <p>ListDataTasksResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("createTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("sinkCluster")
        private SinkCluster sinkCluster;

        @com.aliyun.core.annotation.NameInMap("sourceCluster")
        private SourceCluster sourceCluster;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("taskId")
        private String taskId;

        private Result(Builder builder) {
            this.createTime = builder.createTime;
            this.sinkCluster = builder.sinkCluster;
            this.sourceCluster = builder.sourceCluster;
            this.status = builder.status;
            this.taskId = builder.taskId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return sinkCluster
         */
        public SinkCluster getSinkCluster() {
            return this.sinkCluster;
        }

        /**
         * @return sourceCluster
         */
        public SourceCluster getSourceCluster() {
            return this.sourceCluster;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        public static final class Builder {
            private String createTime; 
            private SinkCluster sinkCluster; 
            private SourceCluster sourceCluster; 
            private String status; 
            private String taskId; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.createTime = model.createTime;
                this.sinkCluster = model.sinkCluster;
                this.sourceCluster = model.sourceCluster;
                this.status = model.status;
                this.taskId = model.taskId;
            } 

            /**
             * <p>The time when the site monitoring task was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-07-30 06:32:18</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The information of the target cluster.</p>
             */
            public Builder sinkCluster(SinkCluster sinkCluster) {
                this.sinkCluster = sinkCluster;
                return this;
            }

            /**
             * <p>The information about the source cluster.</p>
             */
            public Builder sourceCluster(SourceCluster sourceCluster) {
                this.sourceCluster = sourceCluster;
                return this;
            }

            /**
             * <p>The status of the task.</p>
             * 
             * <strong>example:</strong>
             * <p>SUCCESS</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The ID of the task.</p>
             * 
             * <strong>example:</strong>
             * <p>et_cn_mfv1233r47272****</p>
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
