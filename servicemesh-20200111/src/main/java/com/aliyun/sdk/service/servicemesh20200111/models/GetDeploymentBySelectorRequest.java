// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDeploymentBySelectorRequest} extends {@link RequestModel}
 *
 * <p>GetDeploymentBySelectorRequest</p>
 */
public class GetDeploymentBySelectorRequest extends Request {
    @Body
    @NameInMap("GuestCluster")
    private String guestCluster;

    @Body
    @NameInMap("LabelSelector")
    private java.util.Map < String, String > labelSelector;

    @Body
    @NameInMap("Limit")
    private Long limit;

    @Body
    @NameInMap("Mark")
    private String mark;

    @Body
    @NameInMap("NameSpace")
    private String nameSpace;

    @Body
    @NameInMap("ServiceMeshId")
    @Validation(required = true)
    private String serviceMeshId;

    private GetDeploymentBySelectorRequest(Builder builder) {
        super(builder);
        this.guestCluster = builder.guestCluster;
        this.labelSelector = builder.labelSelector;
        this.limit = builder.limit;
        this.mark = builder.mark;
        this.nameSpace = builder.nameSpace;
        this.serviceMeshId = builder.serviceMeshId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDeploymentBySelectorRequest create() {
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
     * @return labelSelector
     */
    public java.util.Map < String, String > getLabelSelector() {
        return this.labelSelector;
    }

    /**
     * @return limit
     */
    public Long getLimit() {
        return this.limit;
    }

    /**
     * @return mark
     */
    public String getMark() {
        return this.mark;
    }

    /**
     * @return nameSpace
     */
    public String getNameSpace() {
        return this.nameSpace;
    }

    /**
     * @return serviceMeshId
     */
    public String getServiceMeshId() {
        return this.serviceMeshId;
    }

    public static final class Builder extends Request.Builder<GetDeploymentBySelectorRequest, Builder> {
        private String guestCluster; 
        private java.util.Map < String, String > labelSelector; 
        private Long limit; 
        private String mark; 
        private String nameSpace; 
        private String serviceMeshId; 

        private Builder() {
            super();
        } 

        private Builder(GetDeploymentBySelectorRequest request) {
            super(request);
            this.guestCluster = request.guestCluster;
            this.labelSelector = request.labelSelector;
            this.limit = request.limit;
            this.mark = request.mark;
            this.nameSpace = request.nameSpace;
            this.serviceMeshId = request.serviceMeshId;
        } 

        /**
         * The name of the cluster.
         */
        public Builder guestCluster(String guestCluster) {
            this.putBodyParameter("GuestCluster", guestCluster);
            this.guestCluster = guestCluster;
            return this;
        }

        /**
         * The label selector information.
         */
        public Builder labelSelector(java.util.Map < String, String > labelSelector) {
            String labelSelectorShrink = shrink(labelSelector, "LabelSelector", "json");
            this.putBodyParameter("LabelSelector", labelSelectorShrink);
            this.labelSelector = labelSelector;
            return this;
        }

        /**
         * The maximum number of returned data entries.
         */
        public Builder limit(Long limit) {
            this.putBodyParameter("Limit", limit);
            this.limit = limit;
            return this;
        }

        /**
         * The marker of data queried last time.
         */
        public Builder mark(String mark) {
            this.putBodyParameter("Mark", mark);
            this.mark = mark;
            return this;
        }

        /**
         * The namespace.
         */
        public Builder nameSpace(String nameSpace) {
            this.putBodyParameter("NameSpace", nameSpace);
            this.nameSpace = nameSpace;
            return this;
        }

        /**
         * The ID of the Alibaba Cloud Service Mesh (ASM) instance.
         */
        public Builder serviceMeshId(String serviceMeshId) {
            this.putBodyParameter("ServiceMeshId", serviceMeshId);
            this.serviceMeshId = serviceMeshId;
            return this;
        }

        @Override
        public GetDeploymentBySelectorRequest build() {
            return new GetDeploymentBySelectorRequest(this);
        } 

    } 

}
