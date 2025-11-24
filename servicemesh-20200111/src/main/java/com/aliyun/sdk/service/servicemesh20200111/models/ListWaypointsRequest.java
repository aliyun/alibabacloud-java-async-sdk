// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

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
 * {@link ListWaypointsRequest} extends {@link RequestModel}
 *
 * <p>ListWaypointsRequest</p>
 */
public class ListWaypointsRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true, minLength = 1)
    private String clusterId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Continue")
    private String _continue;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Limit")
    private Long limit;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Namespace")
    private String namespace;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ServiceMeshId")
    @com.aliyun.core.annotation.Validation(required = true, minLength = 1)
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
         * <p>The ID of the cluster on the data plane.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ce3c25e247da24f3aab9b7edfae83****</p>
         */
        public Builder clusterId(String clusterId) {
            this.putBodyParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>Used in conjunction with Limit, it is used to query waypoints starting from a specified offset. When calling for the first time, no need to care abount it. If the Continue in the returned result is not empty, it means that there is still data that has not been returned, and you need to continue the call with the returned Continue.</p>
         * 
         * <strong>example:</strong>
         * <p>eyJ2IjoibWV0YS5rOHMuaW8vdjEiLCJydiI6MjY4Njc5Miwic3RhcnQiOiJkZWZhdWx0L2Jvb2tpbmZvLXByb2R1Y3RwYWdlXHUwMDAwIn0</p>
         */
        public Builder _continue(String _continue) {
            this.putBodyParameter("Continue", _continue);
            this._continue = _continue;
            return this;
        }

        /**
         * <p>Limit the number of waypoints returned.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder limit(Long limit) {
            this.putBodyParameter("Limit", limit);
            this.limit = limit;
            return this;
        }

        /**
         * <p>Waypoint which you want to get. If empty, return all waypoints.</p>
         * 
         * <strong>example:</strong>
         * <p>bookinfo-productpage</p>
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The namespace.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        public Builder namespace(String namespace) {
            this.putBodyParameter("Namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        /**
         * <p>The Service Mesh (ASM) instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>c08ba3fd1e6484b0f8cc1ad8fe10d****</p>
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
