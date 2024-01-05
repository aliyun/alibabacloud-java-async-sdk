// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.igraph20210621.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListGraphSchemasRequest} extends {@link RequestModel}
 *
 * <p>ListGraphSchemasRequest</p>
 */
public class ListGraphSchemasRequest extends Request {
    @Path
    @NameInMap("instanceId")
    @Validation(required = true)
    private String instanceId;

    @Path
    @NameInMap("graphName")
    @Validation(required = true)
    private String graphName;

    @Query
    @NameInMap("namespace")
    private String namespace;

    @Query
    @NameInMap("pageLimit")
    private String pageLimit;

    @Query
    @NameInMap("pageStart")
    private String pageStart;

    @Query
    @NameInMap("returnSpec")
    private String returnSpec;

    @Query
    @NameInMap("schemaStatus")
    private String schemaStatus;

    private ListGraphSchemasRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.graphName = builder.graphName;
        this.namespace = builder.namespace;
        this.pageLimit = builder.pageLimit;
        this.pageStart = builder.pageStart;
        this.returnSpec = builder.returnSpec;
        this.schemaStatus = builder.schemaStatus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListGraphSchemasRequest create() {
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
     * @return graphName
     */
    public String getGraphName() {
        return this.graphName;
    }

    /**
     * @return namespace
     */
    public String getNamespace() {
        return this.namespace;
    }

    /**
     * @return pageLimit
     */
    public String getPageLimit() {
        return this.pageLimit;
    }

    /**
     * @return pageStart
     */
    public String getPageStart() {
        return this.pageStart;
    }

    /**
     * @return returnSpec
     */
    public String getReturnSpec() {
        return this.returnSpec;
    }

    /**
     * @return schemaStatus
     */
    public String getSchemaStatus() {
        return this.schemaStatus;
    }

    public static final class Builder extends Request.Builder<ListGraphSchemasRequest, Builder> {
        private String instanceId; 
        private String graphName; 
        private String namespace; 
        private String pageLimit; 
        private String pageStart; 
        private String returnSpec; 
        private String schemaStatus; 

        private Builder() {
            super();
        } 

        private Builder(ListGraphSchemasRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.graphName = request.graphName;
            this.namespace = request.namespace;
            this.pageLimit = request.pageLimit;
            this.pageStart = request.pageStart;
            this.returnSpec = request.returnSpec;
            this.schemaStatus = request.schemaStatus;
        } 

        /**
         * instanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * graphName.
         */
        public Builder graphName(String graphName) {
            this.putPathParameter("graphName", graphName);
            this.graphName = graphName;
            return this;
        }

        /**
         * namespace.
         */
        public Builder namespace(String namespace) {
            this.putQueryParameter("namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        /**
         * pageLimit.
         */
        public Builder pageLimit(String pageLimit) {
            this.putQueryParameter("pageLimit", pageLimit);
            this.pageLimit = pageLimit;
            return this;
        }

        /**
         * pageStart.
         */
        public Builder pageStart(String pageStart) {
            this.putQueryParameter("pageStart", pageStart);
            this.pageStart = pageStart;
            return this;
        }

        /**
         * returnSpec.
         */
        public Builder returnSpec(String returnSpec) {
            this.putQueryParameter("returnSpec", returnSpec);
            this.returnSpec = returnSpec;
            return this;
        }

        /**
         * schemaStatus.
         */
        public Builder schemaStatus(String schemaStatus) {
            this.putQueryParameter("schemaStatus", schemaStatus);
            this.schemaStatus = schemaStatus;
            return this;
        }

        @Override
        public ListGraphSchemasRequest build() {
            return new ListGraphSchemasRequest(this);
        } 

    } 

}
