// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateK8sIngressRuleRequest} extends {@link RequestModel}
 *
 * <p>CreateK8sIngressRuleRequest</p>
 */
public class CreateK8sIngressRuleRequest extends Request {
    @Query
    @NameInMap("Annotations")
    private String annotations;

    @Query
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Query
    @NameInMap("IngressConf")
    private String ingressConf;

    @Query
    @NameInMap("Labels")
    private String labels;

    @Query
    @NameInMap("Name")
    @Validation(required = true)
    private String name;

    @Query
    @NameInMap("Namespace")
    @Validation(required = true)
    private String namespace;

    private CreateK8sIngressRuleRequest(Builder builder) {
        super(builder);
        this.annotations = builder.annotations;
        this.clusterId = builder.clusterId;
        this.ingressConf = builder.ingressConf;
        this.labels = builder.labels;
        this.name = builder.name;
        this.namespace = builder.namespace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateK8sIngressRuleRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return annotations
     */
    public String getAnnotations() {
        return this.annotations;
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return ingressConf
     */
    public String getIngressConf() {
        return this.ingressConf;
    }

    /**
     * @return labels
     */
    public String getLabels() {
        return this.labels;
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

    public static final class Builder extends Request.Builder<CreateK8sIngressRuleRequest, Builder> {
        private String annotations; 
        private String clusterId; 
        private String ingressConf; 
        private String labels; 
        private String name; 
        private String namespace; 

        private Builder() {
            super();
        } 

        private Builder(CreateK8sIngressRuleRequest request) {
            super(request);
            this.annotations = request.annotations;
            this.clusterId = request.clusterId;
            this.ingressConf = request.ingressConf;
            this.labels = request.labels;
            this.name = request.name;
            this.namespace = request.namespace;
        } 

        /**
         * The annotations.
         */
        public Builder annotations(String annotations) {
            this.putQueryParameter("Annotations", annotations);
            this.annotations = annotations;
            return this;
        }

        /**
         * The ID of the Kubernetes cluster.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * The routing rules of the Ingress. Set this parameter to a JSON string in the following format:
         * <p>
         * 
         *     {
         *       "rules": [
         *         {
         *           "host": "abc.com",
         *           "secretName": "tls-secret",
         *           "paths": [
         *             {
         *               "path": "/path",
         *               "backend": {
         *                 "servicePort": 80,
         *                 "serviceName": "xxx"
         *               }
         *             }
         *           ]
         *         }
         *       ]
         *     }
         * 
         * Parameter description:
         * 
         * *   rules: the list of routing rules.
         * *   host: the domain name to be accessed.
         * *   secretName: the name of the Secret that stores the information about the Transport Layer Security (TLS) certificate. The certificate is required if you need to use the HTTPS protocol.
         * *   paths: the list of paths to be accessed.
         * *   path: the path to be accessed.
         * *   backend: the configuration of the backend service. You can specify a service that is created in the Enterprise Distributed Application Service (EDAS) console.
         * *   serviceName: the name of the backend service.
         * *   servicePort: the port of the backend service.
         */
        public Builder ingressConf(String ingressConf) {
            this.putQueryParameter("IngressConf", ingressConf);
            this.ingressConf = ingressConf;
            return this;
        }

        /**
         * The labels.
         */
        public Builder labels(String labels) {
            this.putQueryParameter("Labels", labels);
            this.labels = labels;
            return this;
        }

        /**
         * The name of the Ingress. The name can contain lowercase letters, digits, and hyphens (-). It must start with a lowercase letter but cannot end with a hyphen (-). The name can be up to 63 characters in length.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * The namespace of the Kubernetes cluster.
         */
        public Builder namespace(String namespace) {
            this.putQueryParameter("Namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        @Override
        public CreateK8sIngressRuleRequest build() {
            return new CreateK8sIngressRuleRequest(this);
        } 

    } 

}
