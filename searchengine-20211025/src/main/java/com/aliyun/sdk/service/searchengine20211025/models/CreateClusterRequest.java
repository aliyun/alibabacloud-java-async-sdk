// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.searchengine20211025.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateClusterRequest} extends {@link RequestModel}
 *
 * <p>CreateClusterRequest</p>
 */
public class CreateClusterRequest extends Request {
    @Path
    @NameInMap("instanceId")
    @Validation(required = true)
    private String instanceId;

    @Body
    @NameInMap("autoLoad")
    private Boolean autoLoad;

    @Body
    @NameInMap("dataNode")
    private DataNode dataNode;

    @Body
    @NameInMap("description")
    private String description;

    @Body
    @NameInMap("name")
    private String name;

    @Body
    @NameInMap("queryNode")
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
         * The ID of the instance.
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * Specifies whether to automatically balance the load between QRS workers.
         */
        public Builder autoLoad(Boolean autoLoad) {
            this.putBodyParameter("autoLoad", autoLoad);
            this.autoLoad = autoLoad;
            return this;
        }

        /**
         * The information about Searcher workers.
         */
        public Builder dataNode(DataNode dataNode) {
            this.putBodyParameter("dataNode", dataNode);
            this.dataNode = dataNode;
            return this;
        }

        /**
         * The description of the cluster.
         */
        public Builder description(String description) {
            this.putBodyParameter("description", description);
            this.description = description;
            return this;
        }

        /**
         * The name of the cluster.
         */
        public Builder name(String name) {
            this.putBodyParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * The information about Query Result Searcher (QRS) workers.
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
        @NameInMap("number")
        private Integer number;

        private DataNode(Builder builder) {
            this.number = builder.number;
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

        public static final class Builder {
            private Integer number; 

            /**
             * The number of Searcher workers.
             */
            public Builder number(Integer number) {
                this.number = number;
                return this;
            }

            public DataNode build() {
                return new DataNode(this);
            } 

        } 

    }
    public static class QueryNode extends TeaModel {
        @NameInMap("number")
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
             * The number of QRS workers.
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
