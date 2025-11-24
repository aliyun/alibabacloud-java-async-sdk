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
 * {@link DescribeGuestClusterNamespacesRequest} extends {@link RequestModel}
 *
 * <p>DescribeGuestClusterNamespacesRequest</p>
 */
public class DescribeGuestClusterNamespacesRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("GuestClusterID")
    @com.aliyun.core.annotation.Validation(required = true)
    private String guestClusterID;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ServiceMeshId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String serviceMeshId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ShowNsLabels")
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
         * <p>The ID of the Kubernetes cluster that is added to the ASM instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>c584d805c7bd442b8bac421f9849f****</p>
         */
        public Builder guestClusterID(String guestClusterID) {
            this.putBodyParameter("GuestClusterID", guestClusterID);
            this.guestClusterID = guestClusterID;
            return this;
        }

        /**
         * <p>The ASM instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ce134b0727aa2492db69f6c3880e****</p>
         */
        public Builder serviceMeshId(String serviceMeshId) {
            this.putBodyParameter("ServiceMeshId", serviceMeshId);
            this.serviceMeshId = serviceMeshId;
            return this;
        }

        /**
         * <p>Specifies whether to return the labels of the namespaces.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
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
