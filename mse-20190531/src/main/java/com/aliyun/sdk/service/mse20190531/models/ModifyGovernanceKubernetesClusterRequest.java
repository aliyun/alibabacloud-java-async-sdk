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
         * NamespaceInfos.
         */
        public Builder namespaceInfos(java.util.List < NamespaceInfos> namespaceInfos) {
            String namespaceInfosShrink = shrink(namespaceInfos, "NamespaceInfos", "json");
            this.putBodyParameter("NamespaceInfos", namespaceInfosShrink);
            this.namespaceInfos = namespaceInfos;
            return this;
        }

        /**
         * The region in which the cluster resides.
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
        @NameInMap("labels")
        private java.util.Map < String, String > labels;

        @NameInMap("mseNamespace")
        private String mseNamespace;

        @NameInMap("name")
        private String name;

        private NamespaceInfos(Builder builder) {
            this.labels = builder.labels;
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
         * @return labels
         */
        public java.util.Map < String, String > getLabels() {
            return this.labels;
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
            private java.util.Map < String, String > labels; 
            private String mseNamespace; 
            private String name; 

            /**
             * labels.
             */
            public Builder labels(java.util.Map < String, String > labels) {
                this.labels = labels;
                return this;
            }

            /**
             * mseNamespace.
             */
            public Builder mseNamespace(String mseNamespace) {
                this.mseNamespace = mseNamespace;
                return this;
            }

            /**
             * name.
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
