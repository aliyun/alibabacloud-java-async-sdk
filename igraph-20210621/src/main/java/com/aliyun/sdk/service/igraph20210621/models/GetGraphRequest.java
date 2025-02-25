// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.igraph20210621.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetGraphRequest} extends {@link RequestModel}
 *
 * <p>GetGraphRequest</p>
 */
public class GetGraphRequest extends Request {
    @Path
    @NameInMap("instanceId")
    private String instanceId;

    @Path
    @NameInMap("graphName")
    private String graphName;

    @Query
    @NameInMap("namespace")
    private String namespace;

    private GetGraphRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.graphName = builder.graphName;
        this.namespace = builder.namespace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetGraphRequest create() {
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

    public static final class Builder extends Request.Builder<GetGraphRequest, Builder> {
        private String instanceId; 
        private String graphName; 
        private String namespace; 

        private Builder() {
            super();
        } 

        private Builder(GetGraphRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.graphName = request.graphName;
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
         * namespace.
         */
        public Builder namespace(String namespace) {
            this.putQueryParameter("namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        @Override
        public GetGraphRequest build() {
            return new GetGraphRequest(this);
        } 

    } 

}
