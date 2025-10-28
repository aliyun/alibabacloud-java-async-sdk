// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

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
 * {@link UpdateK8sResourceRequest} extends {@link RequestModel}
 *
 * <p>UpdateK8sResourceRequest</p>
 */
public class UpdateK8sResourceRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    private String clusterId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Namespace")
    private String namespace;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ResourceContent")
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
         * <p>The ID of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>2e7059e9-2d********5e8ecac64ff</p>
         */
        public Builder clusterId(String clusterId) {
            this.putBodyParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The ID of the namespace to which the Kubernetes resource belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>app-namespace</p>
         */
        public Builder namespace(String namespace) {
            this.putBodyParameter("Namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        /**
         * <p>The description of the resource in the YAML format.</p>
         * 
         * <strong>example:</strong>
         * <p>apiVersion: apps/v1 kind: Deployment metadata:   name: demo-app   namespace: app-namespace spec:   replicas: 3   selector:     matchLabels:       cluster: abc   template: # create pods using pod definition in this template     metadata:       labels:         cluster: abc     spec:       containers:       - image: registry-vpc.cn-hangzhou.aliyuncs.com/edas-demo-image/consumer:1.0         imagePullPolicy: Always         name: test-container         ports:         - containerPort: 80         env:         - name: foo           value: bar</p>
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
