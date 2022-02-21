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

    private DescribeGuestClusterNamespacesRequest(Builder builder) {
        super(builder);
        this.guestClusterID = builder.guestClusterID;
        this.serviceMeshId = builder.serviceMeshId;
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

    public static final class Builder extends Request.Builder<DescribeGuestClusterNamespacesRequest, Builder> {
        private String guestClusterID; 
        private String serviceMeshId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeGuestClusterNamespacesRequest response) {
            super(response);
            this.guestClusterID = response.guestClusterID;
            this.serviceMeshId = response.serviceMeshId;
        } 

        /**
         * GuestClusterID.
         */
        public Builder guestClusterID(String guestClusterID) {
            this.putBodyParameter("GuestClusterID", guestClusterID);
            this.guestClusterID = guestClusterID;
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
        public DescribeGuestClusterNamespacesRequest build() {
            return new DescribeGuestClusterNamespacesRequest(this);
        } 

    } 

}
