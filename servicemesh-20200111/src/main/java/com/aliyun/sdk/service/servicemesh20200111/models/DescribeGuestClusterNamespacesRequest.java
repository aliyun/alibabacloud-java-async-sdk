// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeGuestClusterNamespacesRequest} extends {@link RequestModel}
 *
 * <p>DescribeGuestClusterNamespacesRequest</p>
 */
public class DescribeGuestClusterNamespacesRequest extends Request {
    @Body
    @NameInMap("GuestClusterID")
    @Validation(required = true)
    private String guestClusterID;

    @Body
    @NameInMap("ServiceMeshId")
    @Validation(required = true)
    private String serviceMeshId;

    @Body
    @NameInMap("ShowNsLabels")
    private Boolean showNsLabels;

    private DescribeGuestClusterNamespacesRequest(Builder builder) {
        super(builder);
        this.guestClusterID = builder.guestClusterID;
        this.serviceMeshId = builder.serviceMeshId;
        this.showNsLabels = builder.showNsLabels;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeGuestClusterNamespacesRequest create() {
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
     * @return serviceMeshId
     */
    public String getServiceMeshId() {
        return this.serviceMeshId;
    }

    /**
     * @return showNsLabels
     */
    public Boolean getShowNsLabels() {
        return this.showNsLabels;
    }

    public static final class Builder extends Request.Builder<DescribeGuestClusterNamespacesRequest, Builder> {
        private String guestClusterID; 
        private String serviceMeshId; 
        private Boolean showNsLabels; 

        private Builder() {
            super();
        } 

        private Builder(DescribeGuestClusterNamespacesRequest request) {
            super(request);
            this.guestClusterID = request.guestClusterID;
            this.serviceMeshId = request.serviceMeshId;
            this.showNsLabels = request.showNsLabels;
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
         * The ID of the ASM instance.
         */
        public Builder serviceMeshId(String serviceMeshId) {
            this.putBodyParameter("ServiceMeshId", serviceMeshId);
            this.serviceMeshId = serviceMeshId;
            return this;
        }

        /**
         * Specifies whether to return the labels of the namespaces.
         */
        public Builder showNsLabels(Boolean showNsLabels) {
            this.putBodyParameter("ShowNsLabels", showNsLabels);
            this.showNsLabels = showNsLabels;
            return this;
        }

        @Override
        public DescribeGuestClusterNamespacesRequest build() {
            return new DescribeGuestClusterNamespacesRequest(this);
        } 

    } 

}
