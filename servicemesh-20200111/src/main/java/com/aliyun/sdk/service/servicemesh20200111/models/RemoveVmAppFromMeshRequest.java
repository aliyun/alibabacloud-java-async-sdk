// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RemoveVmAppFromMeshRequest} extends {@link RequestModel}
 *
 * <p>RemoveVmAppFromMeshRequest</p>
 */
public class RemoveVmAppFromMeshRequest extends Request {
    @Query
    @NameInMap("Namespace")
    @Validation(required = true)
    private String namespace;

    @Query
    @NameInMap("ServiceMeshId")
    @Validation(required = true)
    private String serviceMeshId;

    @Query
    @NameInMap("ServiceName")
    @Validation(required = true)
    private String serviceName;

    private RemoveVmAppFromMeshRequest(Builder builder) {
        super(builder);
        this.namespace = builder.namespace;
        this.serviceMeshId = builder.serviceMeshId;
        this.serviceName = builder.serviceName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RemoveVmAppFromMeshRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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

    /**
     * @return serviceName
     */
    public String getServiceName() {
        return this.serviceName;
    }

    public static final class Builder extends Request.Builder<RemoveVmAppFromMeshRequest, Builder> {
        private String namespace; 
        private String serviceMeshId; 
        private String serviceName; 

        private Builder() {
            super();
        } 

        private Builder(RemoveVmAppFromMeshRequest response) {
            super(response);
            this.namespace = response.namespace;
            this.serviceMeshId = response.serviceMeshId;
            this.serviceName = response.serviceName;
        } 

        /**
         * Namespace.
         */
        public Builder namespace(String namespace) {
            this.putQueryParameter("Namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        /**
         * ServiceMeshId.
         */
        public Builder serviceMeshId(String serviceMeshId) {
            this.putQueryParameter("ServiceMeshId", serviceMeshId);
            this.serviceMeshId = serviceMeshId;
            return this;
        }

        /**
         * ServiceName.
         */
        public Builder serviceName(String serviceName) {
            this.putQueryParameter("ServiceName", serviceName);
            this.serviceName = serviceName;
            return this;
        }

        @Override
        public RemoveVmAppFromMeshRequest build() {
            return new RemoveVmAppFromMeshRequest(this);
        } 

    } 

}
