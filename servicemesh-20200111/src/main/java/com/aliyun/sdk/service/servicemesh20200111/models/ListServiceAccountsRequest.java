// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListServiceAccountsRequest} extends {@link RequestModel}
 *
 * <p>ListServiceAccountsRequest</p>
 */
public class ListServiceAccountsRequest extends Request {
    @Body
    @NameInMap("ClusterId")
    @Validation(required = true, minLength = 1)
    private String clusterId;

    @Body
    @NameInMap("Namespace")
    private String namespace;

    @Body
    @NameInMap("ServiceMeshId")
    @Validation(required = true, minLength = 1)
    private String serviceMeshId;

    private ListServiceAccountsRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.namespace = builder.namespace;
        this.serviceMeshId = builder.serviceMeshId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListServiceAccountsRequest create() {
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

    public static final class Builder extends Request.Builder<ListServiceAccountsRequest, Builder> {
        private String clusterId; 
        private String namespace; 
        private String serviceMeshId; 

        private Builder() {
            super();
        } 

        private Builder(ListServiceAccountsRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.namespace = request.namespace;
            this.serviceMeshId = request.serviceMeshId;
        } 

        /**
         * ClusterId.
         */
        public Builder clusterId(String clusterId) {
            this.putBodyParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * Namespace.
         */
        public Builder namespace(String namespace) {
            this.putBodyParameter("Namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        /**
         * ServiceMeshId.
         */
        public Builder serviceMeshId(String serviceMeshId) {
            this.putBodyParameter("ServiceMeshId", serviceMeshId);
            this.serviceMeshId = serviceMeshId;
            return this;
        }

        @Override
        public ListServiceAccountsRequest build() {
            return new ListServiceAccountsRequest(this);
        } 

    } 

}
