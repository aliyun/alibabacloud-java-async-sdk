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
 * {@link AddClusterIntoServiceMeshRequest} extends {@link RequestModel}
 *
 * <p>AddClusterIntoServiceMeshRequest</p>
 */
public class AddClusterIntoServiceMeshRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DiscoveryOnly")
    private Boolean discoveryOnly;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IgnoreNamespaceCheck")
    private Boolean ignoreNamespaceCheck;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Kubeconfig")
    private String kubeconfig;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ServiceMeshId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String serviceMeshId;

    private AddClusterIntoServiceMeshRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.discoveryOnly = builder.discoveryOnly;
        this.ignoreNamespaceCheck = builder.ignoreNamespaceCheck;
        this.kubeconfig = builder.kubeconfig;
        this.serviceMeshId = builder.serviceMeshId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddClusterIntoServiceMeshRequest create() {
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
     * @return discoveryOnly
     */
    public Boolean getDiscoveryOnly() {
        return this.discoveryOnly;
    }

    /**
     * @return ignoreNamespaceCheck
     */
    public Boolean getIgnoreNamespaceCheck() {
        return this.ignoreNamespaceCheck;
    }

    /**
     * @return kubeconfig
     */
    public String getKubeconfig() {
        return this.kubeconfig;
    }

    /**
     * @return serviceMeshId
     */
    public String getServiceMeshId() {
        return this.serviceMeshId;
    }

    public static final class Builder extends Request.Builder<AddClusterIntoServiceMeshRequest, Builder> {
        private String clusterId; 
        private Boolean discoveryOnly; 
        private Boolean ignoreNamespaceCheck; 
        private String kubeconfig; 
        private String serviceMeshId; 

        private Builder() {
            super();
        } 

        private Builder(AddClusterIntoServiceMeshRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.discoveryOnly = request.discoveryOnly;
            this.ignoreNamespaceCheck = request.ignoreNamespaceCheck;
            this.kubeconfig = request.kubeconfig;
            this.serviceMeshId = request.serviceMeshId;
        } 

        /**
         * <p>The ID of the cluster to be added.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ce3c25e247da24f3aab9b7edfae83****</p>
         */
        public Builder clusterId(String clusterId) {
            this.putBodyParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>Indicates whether to add the cluster to an ASM instance in only service discovery mode.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder discoveryOnly(Boolean discoveryOnly) {
            this.putBodyParameter("DiscoveryOnly", discoveryOnly);
            this.discoveryOnly = discoveryOnly;
            return this;
        }

        /**
         * <p>Specifies whether to check that the cluster you want to add to the ASM instance belongs to the istio-system namespace. This parameter is often used in scenarios where you migrate traffic from self-managed open source Istio to ASM. Valid values: true and false.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder ignoreNamespaceCheck(Boolean ignoreNamespaceCheck) {
            this.putBodyParameter("IgnoreNamespaceCheck", ignoreNamespaceCheck);
            this.ignoreNamespaceCheck = ignoreNamespaceCheck;
            return this;
        }

        /**
         * <p>The cluster certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>apiVersion: v1 clusters: - cluster:     server: <a href="https://47.110.xx.xx:6443">https://47.110.xx.xx:6443</a>     certificate-authority-data: LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCk1JSURUakNDQWphZ0F3SUJBZ0lVYzBQVy82ejR1aHlxYkRRdnNsV1htSmpJeFdNd0RRWUpLb1pJaHZjTkFRRUwKQlFBd1BqRW5NQThHQTFVRUNoTUlhR0Z1WjNwb2IzVXdGQVlEVlFRS0V3MWhiR2xpWVdKaElHTnNiM1ZrTVJNdwpFUVlEVlFRREV3cHJkV0psY201bGRHVnpNQ0FYRFRJeU1EUXdOekExTVRnd01Gb1lEekl3TlRJd016TXdNRFV4Ck9EQXdXakErTVNjd0R3WURWUVFLRXdob1lXNW5lbWh2ZFRBVUJnTlZCQW9URFdGc2FXSmhZbUVnWTJ4dmRXUXgKRXpBUkJnTlZCQU1UQ210MVltVnlibVYwWlhNd2dnRWlNQTBHQ1NxR1NJYjNEUUVCQVFVQUE0SUJE****</p>
         */
        public Builder kubeconfig(String kubeconfig) {
            this.putBodyParameter("Kubeconfig", kubeconfig);
            this.kubeconfig = kubeconfig;
            return this;
        }

        /**
         * <p>The ID of the Service Mesh (ASM) instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cb8963379255149cb98c8686f274x****</p>
         */
        public Builder serviceMeshId(String serviceMeshId) {
            this.putBodyParameter("ServiceMeshId", serviceMeshId);
            this.serviceMeshId = serviceMeshId;
            return this;
        }

        @Override
        public AddClusterIntoServiceMeshRequest build() {
            return new AddClusterIntoServiceMeshRequest(this);
        } 

    } 

}
