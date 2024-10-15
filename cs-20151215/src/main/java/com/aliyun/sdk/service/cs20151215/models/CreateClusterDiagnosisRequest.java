// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateClusterDiagnosisRequest} extends {@link RequestModel}
 *
 * <p>CreateClusterDiagnosisRequest</p>
 */
public class CreateClusterDiagnosisRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("cluster_id")
    private String clusterId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("target")
    private java.util.Map < String, ? > target;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("type")
    private String type;

    private CreateClusterDiagnosisRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.target = builder.target;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateClusterDiagnosisRequest create() {
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
     * @return target
     */
    public java.util.Map < String, ? > getTarget() {
        return this.target;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<CreateClusterDiagnosisRequest, Builder> {
        private String clusterId; 
        private java.util.Map < String, ? > target; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(CreateClusterDiagnosisRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.target = request.target;
            this.type = request.type;
        } 

        /**
         * <p>The cluster ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ce0da5a1d627e4e9e9f96cae8ad07****</p>
         */
        public Builder clusterId(String clusterId) {
            this.putPathParameter("cluster_id", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The parameter used to specify the diagnostic object. Examples of parameters for different types of diagnostic objects:</p>
         * <p>node:</p>
         * <pre><code>{&quot;name&quot;: &quot;cn-shanghai.10.10.10.107&quot;}
         * </code></pre>
         * <p>pod</p>
         * <pre><code>{&quot;namespace&quot;: &quot;kube-system&quot;, &quot;name&quot;: &quot;csi-plugin-2cg9f&quot;}
         * </code></pre>
         * <p>network</p>
         * <pre><code>{&quot;src&quot;: &quot;10.10.10.108&quot;, &quot;dst&quot;: &quot;10.11.247.16&quot;, &quot;dport&quot;: &quot;80&quot;}
         * </code></pre>
         * <p>ingress</p>
         * <pre><code>{&quot;url&quot;: &quot;https://example.com&quot;}
         * </code></pre>
         * <p>memory</p>
         * <pre><code>{&quot;node&quot;:&quot;cn-hangzhou.172.16.9.240&quot;}
         * </code></pre>
         * <p>service</p>
         * <pre><code>{&quot;namespace&quot;: &quot;kube-system&quot;, &quot;name&quot;: &quot;nginx-ingress-lb&quot;}
         * </code></pre>
         * 
         * <strong>example:</strong>
         * <p>{&quot;namespace&quot;: &quot;kube-system&quot;, &quot;name&quot;: &quot;csi-plugin-2cg9f&quot;}</p>
         */
        public Builder target(java.util.Map < String, ? > target) {
            this.putBodyParameter("target", target);
            this.target = target;
            return this;
        }

        /**
         * <p>The type of the diagnostic.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>node</li>
         * <li>ingress</li>
         * <li>cluster</li>
         * <li>memory</li>
         * <li>pod</li>
         * <li>service</li>
         * <li>network</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>node</p>
         */
        public Builder type(String type) {
            this.putBodyParameter("type", type);
            this.type = type;
            return this;
        }

        @Override
        public CreateClusterDiagnosisRequest build() {
            return new CreateClusterDiagnosisRequest(this);
        } 

    } 

}
