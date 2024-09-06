// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20240730.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link InstallAddonRequest} extends {@link RequestModel}
 *
 * <p>InstallAddonRequest</p>
 */
public class InstallAddonRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AddonName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String addonName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AddonVersion")
    @com.aliyun.core.annotation.Validation(required = true)
    private String addonVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourcesSpec")
    @com.aliyun.core.annotation.Validation(required = true)
    private String resourcesSpec;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServicesSpec")
    @com.aliyun.core.annotation.Validation(required = true)
    private String servicesSpec;

    private InstallAddonRequest(Builder builder) {
        super(builder);
        this.addonName = builder.addonName;
        this.addonVersion = builder.addonVersion;
        this.clusterId = builder.clusterId;
        this.resourcesSpec = builder.resourcesSpec;
        this.servicesSpec = builder.servicesSpec;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InstallAddonRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return addonName
     */
    public String getAddonName() {
        return this.addonName;
    }

    /**
     * @return addonVersion
     */
    public String getAddonVersion() {
        return this.addonVersion;
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return resourcesSpec
     */
    public String getResourcesSpec() {
        return this.resourcesSpec;
    }

    /**
     * @return servicesSpec
     */
    public String getServicesSpec() {
        return this.servicesSpec;
    }

    public static final class Builder extends Request.Builder<InstallAddonRequest, Builder> {
        private String addonName; 
        private String addonVersion; 
        private String clusterId; 
        private String resourcesSpec; 
        private String servicesSpec; 

        private Builder() {
            super();
        } 

        private Builder(InstallAddonRequest request) {
            super(request);
            this.addonName = request.addonName;
            this.addonVersion = request.addonVersion;
            this.clusterId = request.clusterId;
            this.resourcesSpec = request.resourcesSpec;
            this.servicesSpec = request.servicesSpec;
        } 

        /**
         * The addon name.
         */
        public Builder addonName(String addonName) {
            this.putQueryParameter("AddonName", addonName);
            this.addonName = addonName;
            return this;
        }

        /**
         * The addon version.
         */
        public Builder addonVersion(String addonVersion) {
            this.putQueryParameter("AddonVersion", addonVersion);
            this.addonVersion = addonVersion;
            return this;
        }

        /**
         * The cluster ID.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * The resource configurations of the addon.
         */
        public Builder resourcesSpec(String resourcesSpec) {
            this.putQueryParameter("ResourcesSpec", resourcesSpec);
            this.resourcesSpec = resourcesSpec;
            return this;
        }

        /**
         * The service configurations of the addon.
         */
        public Builder servicesSpec(String servicesSpec) {
            this.putQueryParameter("ServicesSpec", servicesSpec);
            this.servicesSpec = servicesSpec;
            return this;
        }

        @Override
        public InstallAddonRequest build() {
            return new InstallAddonRequest(this);
        } 

    } 

}
