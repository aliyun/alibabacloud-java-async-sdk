// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.igraph20210621.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateGraphSchemaRequest} extends {@link RequestModel}
 *
 * <p>CreateGraphSchemaRequest</p>
 */
public class CreateGraphSchemaRequest extends Request {
    @Path
    @NameInMap("instanceId")
    @Validation(required = true)
    private String instanceId;

    @Path
    @NameInMap("graphName")
    @Validation(required = true)
    private String graphName;

    @Body
    @NameInMap("body")
    private String body;

    @Query
    @NameInMap("namespace")
    private String namespace;

    private CreateGraphSchemaRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.graphName = builder.graphName;
        this.body = builder.body;
        this.namespace = builder.namespace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateGraphSchemaRequest create() {
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
     * @return body
     */
    public String getBody() {
        return this.body;
    }

    /**
     * @return namespace
     */
    public String getNamespace() {
        return this.namespace;
    }

    public static final class Builder extends Request.Builder<CreateGraphSchemaRequest, Builder> {
        private String instanceId; 
        private String graphName; 
        private String body; 
        private String namespace; 

        private Builder() {
            super();
        } 

        private Builder(CreateGraphSchemaRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.graphName = request.graphName;
            this.body = request.body;
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
         * body.
         */
        public Builder body(String body) {
            this.putBodyParameter("body", body);
            this.body = body;
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
        public CreateGraphSchemaRequest build() {
            return new CreateGraphSchemaRequest(this);
        } 

    } 

}
