// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.igraph20210621.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PublishGraphSchemaRequest} extends {@link RequestModel}
 *
 * <p>PublishGraphSchemaRequest</p>
 */
public class PublishGraphSchemaRequest extends Request {
    @Path
    @NameInMap("instanceId")
    @Validation(required = true)
    private String instanceId;

    @Path
    @NameInMap("graphName")
    @Validation(required = true)
    private String graphName;

    @Path
    @NameInMap("graphSchemaName")
    @Validation(required = true)
    private String graphSchemaName;

    @Query
    @NameInMap("namespace")
    private String namespace;

    private PublishGraphSchemaRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.graphName = builder.graphName;
        this.graphSchemaName = builder.graphSchemaName;
        this.namespace = builder.namespace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PublishGraphSchemaRequest create() {
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
     * @return graphSchemaName
     */
    public String getGraphSchemaName() {
        return this.graphSchemaName;
    }

    /**
     * @return namespace
     */
    public String getNamespace() {
        return this.namespace;
    }

    public static final class Builder extends Request.Builder<PublishGraphSchemaRequest, Builder> {
        private String instanceId; 
        private String graphName; 
        private String graphSchemaName; 
        private String namespace; 

        private Builder() {
            super();
        } 

        private Builder(PublishGraphSchemaRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.graphName = request.graphName;
            this.graphSchemaName = request.graphSchemaName;
            this.namespace = request.namespace;
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
         * graphSchemaName.
         */
        public Builder graphSchemaName(String graphSchemaName) {
            this.putPathParameter("graphSchemaName", graphSchemaName);
            this.graphSchemaName = graphSchemaName;
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

        @Override
        public PublishGraphSchemaRequest build() {
            return new PublishGraphSchemaRequest(this);
        } 

    } 

}
