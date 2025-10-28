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
 * {@link CreateK8sIngressRuleRequest} extends {@link RequestModel}
 *
 * <p>CreateK8sIngressRuleRequest</p>
 */
public class CreateK8sIngressRuleRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Annotations")
    private String annotations;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IngressConf")
    private String ingressConf;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Labels")
    private String labels;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Namespace")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>The annotations.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;alb.ingress.kubernetes.io/rewrite-target&quot;:&quot;/consumer-echo/test&quot;}</p>
         */
        public Builder annotations(String annotations) {
            this.putQueryParameter("Annotations", annotations);
            this.annotations = annotations;
            return this;
        }

        /**
         * <p>The ID of the Kubernetes cluster.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>5b2b4ab4-efbc-4a81-9c45-xxxxxxxxxxxxx</p>
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The routing rules of the Ingress. Set this parameter to a JSON string in the following format:</p>
         * <pre><code>{
         *   &quot;rules&quot;: [
         *     {
         *       &quot;host&quot;: &quot;abc.com&quot;,
         *       &quot;secretName&quot;: &quot;tls-secret&quot;,
         *       &quot;paths&quot;: [
         *         {
         *           &quot;path&quot;: &quot;/path&quot;,
         *           &quot;backend&quot;: {
         *             &quot;servicePort&quot;: 80,
         *             &quot;serviceName&quot;: &quot;xxx&quot;
         *           }
         *         }
         *       ]
         *     }
         *   ]
         * }
         * </code></pre>
         * <p>Parameter description:</p>
         * <ul>
         * <li>rules: the list of routing rules.</li>
         * <li>host: the domain name to be accessed.</li>
         * <li>secretName: the name of the Secret that stores the information about the Transport Layer Security (TLS) certificate. The certificate is required if you need to use the HTTPS protocol.</li>
         * <li>paths: the list of paths to be accessed.</li>
         * <li>path: the path to be accessed.</li>
         * <li>backend: the configuration of the backend service. You can specify a service that is created in the Enterprise Distributed Application Service (EDAS) console.</li>
         * <li>serviceName: the name of the backend service.</li>
         * <li>servicePort: the port of the backend service.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{&quot;rules&quot;:[{&quot;host&quot;:&quot;abc.com&quot;,&quot;secretName&quot;:&quot;tls-secret&quot;,&quot;paths&quot;:[{&quot;path&quot;:&quot;/path&quot;,&quot;backend&quot;:{&quot;servicePort&quot;:80,&quot;serviceName&quot;:&quot;xxx&quot;}}]}]}</p>
         */
        public Builder ingressConf(String ingressConf) {
            this.putQueryParameter("IngressConf", ingressConf);
            this.ingressConf = ingressConf;
            return this;
        }

        /**
         * <p>The labels.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;test-labels&quot;:&quot;test-value&quot;}</p>
         */
        public Builder labels(String labels) {
            this.putQueryParameter("Labels", labels);
            this.labels = labels;
            return this;
        }

        /**
         * <p>The name of the Ingress. The name can contain lowercase letters, digits, and hyphens (-). It must start with a lowercase letter but cannot end with a hyphen (-). The name can be up to 63 characters in length.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>my-ingress-rule</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The namespace of the Kubernetes cluster.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
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
