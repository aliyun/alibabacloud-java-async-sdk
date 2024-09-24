// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
         * The cluster ID.
         */
        public Builder clusterId(String clusterId) {
            this.putPathParameter("cluster_id", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * The parameter used to specify the diagnostic object. Examples of parameters for different types of diagnostic objects:
         * <p>
         * 
         * node:
         * 
         *     {"name": "cn-shanghai.10.10.10.107"}
         * 
         * pod
         * 
         *     {"namespace": "kube-system", "name": "csi-plugin-2cg9f"}
         * 
         * network
         * 
         *     {"src": "10.10.10.108", "dst": "10.11.247.16", "dport": "80"}
         * 
         * ingress
         * 
         *     {"url": "https://example.com"}
         * 
         * memory
         * 
         *     {"node":"cn-hangzhou.172.16.9.240"}
         * 
         * service
         * 
         *     {"namespace": "kube-system", "name": "nginx-ingress-lb"}
         */
        public Builder target(java.util.Map < String, ? > target) {
            this.putBodyParameter("target", target);
            this.target = target;
            return this;
        }

        /**
         * The type of the diagnostic.
         * <p>
         * 
         * Valid values:
         * 
         * *   node
         * *   ingress
         * *   cluster
         * *   memory
         * *   pod
         * *   service
         * *   network
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
