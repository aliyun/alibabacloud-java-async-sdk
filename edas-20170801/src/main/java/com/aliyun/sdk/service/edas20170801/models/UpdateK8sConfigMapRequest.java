// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateK8sConfigMapRequest} extends {@link RequestModel}
 *
 * <p>UpdateK8sConfigMapRequest</p>
 */
public class UpdateK8sConfigMapRequest extends Request {
    @Body
    @NameInMap("ClusterId")
    private String clusterId;

    @Body
    @NameInMap("Data")
    private String data;

    @Body
    @NameInMap("Name")
    private String name;

    @Body
    @NameInMap("Namespace")
    private String namespace;

    private UpdateK8sConfigMapRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.data = builder.data;
        this.name = builder.name;
        this.namespace = builder.namespace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateK8sConfigMapRequest create() {
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
     * @return data
     */
    public String getData() {
        return this.data;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return namespace
     */
    public String getNamespace() {
        return this.namespace;
    }

    public static final class Builder extends Request.Builder<UpdateK8sConfigMapRequest, Builder> {
        private String clusterId; 
        private String data; 
        private String name; 
        private String namespace; 

        private Builder() {
            super();
        } 

        private Builder(UpdateK8sConfigMapRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.data = request.data;
            this.name = request.name;
            this.namespace = request.namespace;
        } 

        /**
         * The ID of the Kubernetes cluster.
         */
        public Builder clusterId(String clusterId) {
            this.putBodyParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * The data of the ConfigMap. Set this parameter to a JSON string.
         */
        public Builder data(String data) {
            this.putBodyParameter("Data", data);
            this.data = data;
            return this;
        }

        /**
         * The name of the ConfigMap. The name must start with a letter, and can contain digits, letters, and hyphens (-). It can be up to 63 characters in length.
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * The namespace of the Kubernetes cluster.
         */
        public Builder namespace(String namespace) {
            this.putBodyParameter("Namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        @Override
        public UpdateK8sConfigMapRequest build() {
            return new UpdateK8sConfigMapRequest(this);
        } 

    } 

}
