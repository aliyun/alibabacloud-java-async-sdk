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
 * {@link UpdateK8sConfigMapRequest} extends {@link RequestModel}
 *
 * <p>UpdateK8sConfigMapRequest</p>
 */
public class UpdateK8sConfigMapRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    private String clusterId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Data")
    private String data;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Namespace")
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
         * <p>The ID of the Kubernetes cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>7246cxxx-53xx-xxxx-xxxx-xxxxxxxx</p>
         */
        public Builder clusterId(String clusterId) {
            this.putBodyParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The data of the ConfigMap. Set this parameter to a JSON string.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;Key&quot;:&quot;name&quot;,&quot;Value&quot;:&quot;william&quot;},{&quot;Key&quot;:&quot;age&quot;,&quot;Value&quot;:&quot;12&quot;}]</p>
         */
        public Builder data(String data) {
            this.putBodyParameter("Data", data);
            this.data = data;
            return this;
        }

        /**
         * <p>The name of the ConfigMap. The name must start with a letter, and can contain digits, letters, and hyphens (-). It can be up to 63 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>my-configmap</p>
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The namespace of the Kubernetes cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
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
