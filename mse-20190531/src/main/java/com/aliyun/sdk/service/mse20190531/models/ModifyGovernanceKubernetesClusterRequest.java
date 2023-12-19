// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyGovernanceKubernetesClusterRequest} extends {@link RequestModel}
 *
 * <p>ModifyGovernanceKubernetesClusterRequest</p>
 */
public class ModifyGovernanceKubernetesClusterRequest extends Request {
    @Query
    @NameInMap("AcceptLanguage")
    private String acceptLanguage;

    @Query
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Body
    @NameInMap("NamespaceInfos")
    private java.util.List < NamespaceInfos> namespaceInfos;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
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
    public java.util.List < NamespaceInfos> getNamespaceInfos() {
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
        private java.util.List < NamespaceInfos> namespaceInfos; 
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
         * The language of the response. Valid values:
         * <p>
         * 
         * *   zh: Chinese
         * *   en: English
         */
        public Builder acceptLanguage(String acceptLanguage) {
            this.putQueryParameter("AcceptLanguage", acceptLanguage);
            this.acceptLanguage = acceptLanguage;
            return this;
        }

        /**
         * The ID of the instance.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * The information about the namespace for which Microservices Engine(MSE) Microservices Governance is enabled.
         */
        public Builder namespaceInfos(java.util.List < NamespaceInfos> namespaceInfos) {
            String namespaceInfosShrink = shrink(namespaceInfos, "NamespaceInfos", "json");
            this.putBodyParameter("NamespaceInfos", namespaceInfosShrink);
            this.namespaceInfos = namespaceInfos;
            return this;
        }

        /**
         * The ID of the region in which the instance resides. The region is supported by MSE.
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

    public static class NamespaceInfos extends TeaModel {
        @NameInMap("MseNamespace")
        private String mseNamespace;

        @NameInMap("Name")
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

            /**
             * The microservice namespace.If you do not specify this parameter, Microservice Governance is not enabled for the namespace.
             */
            public Builder mseNamespace(String mseNamespace) {
                this.mseNamespace = mseNamespace;
                return this;
            }

            /**
             * The name of the Kubernetes namespace.
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
