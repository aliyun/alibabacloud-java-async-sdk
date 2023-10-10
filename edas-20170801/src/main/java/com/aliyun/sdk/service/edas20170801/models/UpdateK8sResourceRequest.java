// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateK8sResourceRequest} extends {@link RequestModel}
 *
 * <p>UpdateK8sResourceRequest</p>
 */
public class UpdateK8sResourceRequest extends Request {
    @Body
    @NameInMap("ClusterId")
    private String clusterId;

    @Body
    @NameInMap("Namespace")
    private String namespace;

    @Body
    @NameInMap("ResourceContent")
    private String resourceContent;

    private UpdateK8sResourceRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.namespace = builder.namespace;
        this.resourceContent = builder.resourceContent;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateK8sResourceRequest create() {
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
     * @return resourceContent
     */
    public String getResourceContent() {
        return this.resourceContent;
    }

    public static final class Builder extends Request.Builder<UpdateK8sResourceRequest, Builder> {
        private String clusterId; 
        private String namespace; 
        private String resourceContent; 

        private Builder() {
            super();
        } 

        private Builder(UpdateK8sResourceRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.namespace = request.namespace;
            this.resourceContent = request.resourceContent;
        } 

        /**
         * The ID of the cluster.
         */
        public Builder clusterId(String clusterId) {
            this.putBodyParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * The ID of the namespace to which the Kubernetes resource belongs.
         */
        public Builder namespace(String namespace) {
            this.putBodyParameter("Namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        /**
         * The description of the resource in the YAML format.
         */
        public Builder resourceContent(String resourceContent) {
            this.putBodyParameter("ResourceContent", resourceContent);
            this.resourceContent = resourceContent;
            return this;
        }

        @Override
        public UpdateK8sResourceRequest build() {
            return new UpdateK8sResourceRequest(this);
        } 

    } 

}
