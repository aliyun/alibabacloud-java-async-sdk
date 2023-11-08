// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListWaypointsRequest} extends {@link RequestModel}
 *
 * <p>ListWaypointsRequest</p>
 */
public class ListWaypointsRequest extends Request {
    @Body
    @NameInMap("ClusterId")
    @Validation(required = true, minLength = 1)
    private String clusterId;

    @Body
    @NameInMap("Continue")
    private String _continue;

    @Body
    @NameInMap("Limit")
    private Long limit;

    @Body
    @NameInMap("Name")
    private String name;

    @Body
    @NameInMap("Namespace")
    private String namespace;

    @Body
    @NameInMap("ServiceMeshId")
    @Validation(required = true, minLength = 1)
    private String serviceMeshId;

    private ListWaypointsRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this._continue = builder._continue;
        this.limit = builder.limit;
        this.name = builder.name;
        this.namespace = builder.namespace;
        this.serviceMeshId = builder.serviceMeshId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListWaypointsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return _continue
     */
    public String get_continue() {
        return this._continue;
    }

    /**
     * @return limit
     */
    public Long getLimit() {
        return this.limit;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return namespace
     */
    public String getNamespace() {
        return this.namespace;
    }

    /**
     * @return serviceMeshId
     */
    public String getServiceMeshId() {
        return this.serviceMeshId;
    }

    public static final class Builder extends Request.Builder<ListWaypointsRequest, Builder> {
        private String clusterId; 
        private String _continue; 
        private Long limit; 
        private String name; 
        private String namespace; 
        private String serviceMeshId; 

        private Builder() {
            super();
        } 

        private Builder(ListWaypointsRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this._continue = request._continue;
            this.limit = request.limit;
            this.name = request.name;
            this.namespace = request.namespace;
            this.serviceMeshId = request.serviceMeshId;
        } 

        /**
         * The ID of the cluster on the data plane.
         */
        public Builder clusterId(String clusterId) {
            this.putBodyParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * Continue.
         */
        public Builder _continue(String _continue) {
            this.putBodyParameter("Continue", _continue);
            this._continue = _continue;
            return this;
        }

        /**
         * Limit.
         */
        public Builder limit(Long limit) {
            this.putBodyParameter("Limit", limit);
            this.limit = limit;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * The namespace.
         */
        public Builder namespace(String namespace) {
            this.putBodyParameter("Namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        /**
         * The Service Mesh (ASM) instance ID.
         */
        public Builder serviceMeshId(String serviceMeshId) {
            this.putBodyParameter("ServiceMeshId", serviceMeshId);
            this.serviceMeshId = serviceMeshId;
            return this;
        }

        @Override
        public ListWaypointsRequest build() {
            return new ListWaypointsRequest(this);
        } 

    } 

}
