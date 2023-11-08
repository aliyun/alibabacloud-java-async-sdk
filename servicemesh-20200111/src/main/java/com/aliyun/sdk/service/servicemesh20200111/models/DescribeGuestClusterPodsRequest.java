// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeGuestClusterPodsRequest} extends {@link RequestModel}
 *
 * <p>DescribeGuestClusterPodsRequest</p>
 */
public class DescribeGuestClusterPodsRequest extends Request {
    @Body
    @NameInMap("GuestClusterID")
    @Validation(required = true)
    private String guestClusterID;

    @Body
    @NameInMap("Namespace")
    @Validation(required = true)
    private String namespace;

    @Body
    @NameInMap("ServiceMeshId")
    @Validation(required = true)
    private String serviceMeshId;

    private DescribeGuestClusterPodsRequest(Builder builder) {
        super(builder);
        this.guestClusterID = builder.guestClusterID;
        this.namespace = builder.namespace;
        this.serviceMeshId = builder.serviceMeshId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeGuestClusterPodsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return guestClusterID
     */
    public String getGuestClusterID() {
        return this.guestClusterID;
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

    public static final class Builder extends Request.Builder<DescribeGuestClusterPodsRequest, Builder> {
        private String guestClusterID; 
        private String namespace; 
        private String serviceMeshId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeGuestClusterPodsRequest request) {
            super(request);
            this.guestClusterID = request.guestClusterID;
            this.namespace = request.namespace;
            this.serviceMeshId = request.serviceMeshId;
        } 

        /**
         * The ID of the Kubernetes cluster that is added to the ASM instance.
         */
        public Builder guestClusterID(String guestClusterID) {
            this.putBodyParameter("GuestClusterID", guestClusterID);
            this.guestClusterID = guestClusterID;
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
         * The ASM instance ID.
         */
        public Builder serviceMeshId(String serviceMeshId) {
            this.putBodyParameter("ServiceMeshId", serviceMeshId);
            this.serviceMeshId = serviceMeshId;
            return this;
        }

        @Override
        public DescribeGuestClusterPodsRequest build() {
            return new DescribeGuestClusterPodsRequest(this);
        } 

    } 

}
