// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.searchengine20211025.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateClusterRequest} extends {@link RequestModel}
 *
 * <p>CreateClusterRequest</p>
 */
public class CreateClusterRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("instanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("autoLoad")
    private Boolean autoLoad;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("dataNode")
    private DataNode dataNode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("queryNode")
    private QueryNode queryNode;

    private CreateClusterRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.autoLoad = builder.autoLoad;
        this.dataNode = builder.dataNode;
        this.description = builder.description;
        this.name = builder.name;
        this.queryNode = builder.queryNode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateClusterRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return autoLoad
     */
    public Boolean getAutoLoad() {
        return this.autoLoad;
    }

    /**
     * @return dataNode
     */
    public DataNode getDataNode() {
        return this.dataNode;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return queryNode
     */
    public QueryNode getQueryNode() {
        return this.queryNode;
    }

    public static final class Builder extends Request.Builder<CreateClusterRequest, Builder> {
        private String instanceId; 
        private Boolean autoLoad; 
        private DataNode dataNode; 
        private String description; 
        private String name; 
        private QueryNode queryNode; 

        private Builder() {
            super();
        } 

        private Builder(CreateClusterRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.autoLoad = request.autoLoad;
            this.dataNode = request.dataNode;
            this.description = request.description;
            this.name = request.name;
            this.queryNode = request.queryNode;
        } 

        /**
         * The ID of the instance
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The remarks of the query node
         */
        public Builder autoLoad(Boolean autoLoad) {
            this.putBodyParameter("autoLoad", autoLoad);
            this.autoLoad = autoLoad;
            return this;
        }

        /**
         * The description of the data node
         */
        public Builder dataNode(DataNode dataNode) {
            this.putBodyParameter("dataNode", dataNode);
            this.dataNode = dataNode;
            return this;
        }

        /**
         * The description of the cluster
         */
        public Builder description(String description) {
            this.putBodyParameter("description", description);
            this.description = description;
            return this;
        }

        /**
         * The name of the node
         */
        public Builder name(String name) {
            this.putBodyParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * The description of the query node
         */
        public Builder queryNode(QueryNode queryNode) {
            this.putBodyParameter("queryNode", queryNode);
            this.queryNode = queryNode;
            return this;
        }

        @Override
        public CreateClusterRequest build() {
            return new CreateClusterRequest(this);
        } 

    } 

    public static class DataNode extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("number")
        private Integer number;

        @com.aliyun.core.annotation.NameInMap("partition")
        private String partition;

        private DataNode(Builder builder) {
            this.number = builder.number;
            this.partition = builder.partition;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataNode create() {
            return builder().build();
        }

        /**
         * @return number
         */
        public Integer getNumber() {
            return this.number;
        }

        /**
         * @return partition
         */
        public String getPartition() {
            return this.partition;
        }

        public static final class Builder {
            private Integer number; 
            private String partition; 

            /**
             * The number of data nodes
             */
            public Builder number(Integer number) {
                this.number = number;
                return this;
            }

            /**
             * partition.
             */
            public Builder partition(String partition) {
                this.partition = partition;
                return this;
            }

            public DataNode build() {
                return new DataNode(this);
            } 

        } 

    }
    public static class QueryNode extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("number")
        private Integer number;

        private QueryNode(Builder builder) {
            this.number = builder.number;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static QueryNode create() {
            return builder().build();
        }

        /**
         * @return number
         */
        public Integer getNumber() {
            return this.number;
        }

        public static final class Builder {
            private Integer number; 

            /**
             * The number of nodes to query
             */
            public Builder number(Integer number) {
                this.number = number;
                return this;
            }

            public QueryNode build() {
                return new QueryNode(this);
            } 

        } 

    }
}
