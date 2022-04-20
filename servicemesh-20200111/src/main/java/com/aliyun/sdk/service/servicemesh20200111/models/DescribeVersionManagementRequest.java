// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeVersionManagementRequest} extends {@link RequestModel}
 *
 * <p>DescribeVersionManagementRequest</p>
 */
public class DescribeVersionManagementRequest extends Request {
    @Body
    @NameInMap("GuestCluster")
    private String guestCluster;

    @Body
    @NameInMap("Namespace")
    private String namespace;

    @Body
    @NameInMap("ServiceMeshId")
    private String serviceMeshId;

    @Body
    @NameInMap("ServiceName")
    private String serviceName;

    private DescribeVersionManagementRequest(Builder builder) {
        super(builder);
        this.guestCluster = builder.guestCluster;
        this.namespace = builder.namespace;
        this.serviceMeshId = builder.serviceMeshId;
        this.serviceName = builder.serviceName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVersionManagementRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return guestCluster
     */
    public String getGuestCluster() {
        return this.guestCluster;
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

    public static final class Builder extends Request.Builder<DescribeVersionManagementRequest, Builder> {
        private String guestCluster; 
        private String namespace; 
        private String serviceMeshId; 
        private String serviceName; 

        private Builder() {
            super();
        } 

        private Builder(DescribeVersionManagementRequest request) {
            super(request);
            this.guestCluster = request.guestCluster;
            this.namespace = request.namespace;
            this.serviceMeshId = request.serviceMeshId;
            this.serviceName = request.serviceName;
        } 

        /**
         * GuestCluster.
         */
        public Builder guestCluster(String guestCluster) {
            this.putBodyParameter("GuestCluster", guestCluster);
            this.guestCluster = guestCluster;
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

        /**
         * ServiceName.
         */
        public Builder serviceName(String serviceName) {
            this.putBodyParameter("ServiceName", serviceName);
            this.serviceName = serviceName;
            return this;
        }

        @Override
        public DescribeVersionManagementRequest build() {
            return new DescribeVersionManagementRequest(this);
        } 

    } 

}
