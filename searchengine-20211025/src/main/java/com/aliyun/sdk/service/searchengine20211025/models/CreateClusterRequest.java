// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.searchengine20211025.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ha-cn-0ju2k3qer02</p>
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>Specifies whether to enable automatic connection.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder autoLoad(Boolean autoLoad) {
            this.putBodyParameter("autoLoad", autoLoad);
            this.autoLoad = autoLoad;
            return this;
        }

        /**
         * <p>The details of the Searcher workers.</p>
         */
        public Builder dataNode(DataNode dataNode) {
            this.putBodyParameter("dataNode", dataNode);
            this.dataNode = dataNode;
            return this;
        }

        /**
         * <p>The description of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;ha-tets&quot;</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The cluster name.</p>
         * 
         * <strong>example:</strong>
         * <p>ha-cn-zvp2qr1sk01_qrs</p>
         */
        public Builder name(String name) {
            this.putBodyParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The details of the Query Result Searcher (QRS) workers.</p>
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

    /**
     * 
     * {@link CreateClusterRequest} extends {@link TeaModel}
     *
     * <p>CreateClusterRequest</p>
     */
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
             * <p>The number of Searcher workers.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder number(Integer number) {
                this.number = number;
                return this;
            }

            /**
             * <p>The number of shards.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
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
    /**
     * 
     * {@link CreateClusterRequest} extends {@link TeaModel}
     *
     * <p>CreateClusterRequest</p>
     */
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
             * <p>The number of QRS workers.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
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
