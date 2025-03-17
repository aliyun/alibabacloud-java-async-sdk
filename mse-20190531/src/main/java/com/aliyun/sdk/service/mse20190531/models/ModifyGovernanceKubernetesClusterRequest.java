// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

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
 * {@link ModifyGovernanceKubernetesClusterRequest} extends {@link RequestModel}
 *
 * <p>ModifyGovernanceKubernetesClusterRequest</p>
 */
public class ModifyGovernanceKubernetesClusterRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AcceptLanguage")
    private String acceptLanguage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NamespaceInfos")
    private java.util.List<NamespaceInfos> namespaceInfos;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private ModifyGovernanceKubernetesClusterRequest(Builder builder) {
        super(builder);
        this.acceptLanguage = builder.acceptLanguage;
        this.clusterId = builder.clusterId;
        this.namespaceInfos = builder.namespaceInfos;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyGovernanceKubernetesClusterRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return acceptLanguage
     */
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return namespaceInfos
     */
    public java.util.List<NamespaceInfos> getNamespaceInfos() {
        return this.namespaceInfos;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<ModifyGovernanceKubernetesClusterRequest, Builder> {
        private String acceptLanguage; 
        private String clusterId; 
        private java.util.List<NamespaceInfos> namespaceInfos; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyGovernanceKubernetesClusterRequest request) {
            super(request);
            this.acceptLanguage = request.acceptLanguage;
            this.clusterId = request.clusterId;
            this.namespaceInfos = request.namespaceInfos;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The language of the response. Valid values:</p>
         * <ul>
         * <li>zh: Chinese</li>
         * <li>en: English</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder acceptLanguage(String acceptLanguage) {
            this.putQueryParameter("AcceptLanguage", acceptLanguage);
            this.acceptLanguage = acceptLanguage;
            return this;
        }

        /**
         * <p>The ID of the instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cd23228b3c80c4d4f9ad87cc3****</p>
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The information about the namespace for which Microservices Engine(MSE) Microservices Governance is enabled.</p>
         */
        public Builder namespaceInfos(java.util.List<NamespaceInfos> namespaceInfos) {
            String namespaceInfosShrink = shrink(namespaceInfos, "NamespaceInfos", "json");
            this.putBodyParameter("NamespaceInfos", namespaceInfosShrink);
            this.namespaceInfos = namespaceInfos;
            return this;
        }

        /**
         * <p>The ID of the region in which the instance resides. The region is supported by MSE.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public ModifyGovernanceKubernetesClusterRequest build() {
            return new ModifyGovernanceKubernetesClusterRequest(this);
        } 

    } 

    /**
     * 
     * {@link ModifyGovernanceKubernetesClusterRequest} extends {@link TeaModel}
     *
     * <p>ModifyGovernanceKubernetesClusterRequest</p>
     */
    public static class NamespaceInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MseNamespace")
        private String mseNamespace;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private NamespaceInfos(Builder builder) {
            this.mseNamespace = builder.mseNamespace;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NamespaceInfos create() {
            return builder().build();
        }

        /**
         * @return mseNamespace
         */
        public String getMseNamespace() {
            return this.mseNamespace;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String mseNamespace; 
            private String name; 

            private Builder() {
            } 

            private Builder(NamespaceInfos model) {
                this.mseNamespace = model.mseNamespace;
                this.name = model.name;
            } 

            /**
             * <p>The microservice namespace. If you do not specify this parameter, Microservice Governance is not enabled for the namespace.</p>
             * 
             * <strong>example:</strong>
             * <p>default</p>
             */
            public Builder mseNamespace(String mseNamespace) {
                this.mseNamespace = mseNamespace;
                return this;
            }

            /**
             * <p>The name of the Kubernetes namespace.</p>
             * 
             * <strong>example:</strong>
             * <p>default</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public NamespaceInfos build() {
                return new NamespaceInfos(this);
            } 

        } 

    }
}
