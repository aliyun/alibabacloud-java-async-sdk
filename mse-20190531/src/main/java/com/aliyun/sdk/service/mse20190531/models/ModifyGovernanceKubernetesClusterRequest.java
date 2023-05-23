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

    @Query
    @NameInMap("NamespaceInfos")
    @Validation(required = true)
    private String namespaceInfos;

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
    public String getNamespaceInfos() {
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
        private String namespaceInfos; 
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
         * 返回结果显示的语言。取值：zh（默认值）：中文，en：英文
         */
        public Builder acceptLanguage(String acceptLanguage) {
            this.putQueryParameter("AcceptLanguage", acceptLanguage);
            this.acceptLanguage = acceptLanguage;
            return this;
        }

        /**
         * ClusterId.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * NamespaceInfos.
         */
        public Builder namespaceInfos(String namespaceInfos) {
            this.putQueryParameter("NamespaceInfos", namespaceInfos);
            this.namespaceInfos = namespaceInfos;
            return this;
        }

        /**
         * RegionId.
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

}
