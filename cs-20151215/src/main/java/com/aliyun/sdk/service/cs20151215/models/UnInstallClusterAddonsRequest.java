// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UnInstallClusterAddonsRequest} extends {@link RequestModel}
 *
 * <p>UnInstallClusterAddonsRequest</p>
 */
public class UnInstallClusterAddonsRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("addons")
    private java.util.List < Addons> addons;

    private UnInstallClusterAddonsRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.addons = builder.addons;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UnInstallClusterAddonsRequest create() {
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
     * @return addons
     */
    public java.util.List < Addons> getAddons() {
        return this.addons;
    }

    public static final class Builder extends Request.Builder<UnInstallClusterAddonsRequest, Builder> {
        private String clusterId; 
        private java.util.List < Addons> addons; 

        private Builder() {
            super();
        } 

        private Builder(UnInstallClusterAddonsRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.addons = request.addons;
        } 

        /**
         * The ID of the cluster.
         */
        public Builder clusterId(String clusterId) {
            this.putPathParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * The list of components that you want to uninstall. The list is an array.
         */
        public Builder addons(java.util.List < Addons> addons) {
            this.putBodyParameter("addons", addons);
            this.addons = addons;
            return this;
        }

        @Override
        public UnInstallClusterAddonsRequest build() {
            return new UnInstallClusterAddonsRequest(this);
        } 

    } 

    public static class Addons extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("cleanup_cloud_resources")
        private Boolean cleanupCloudResources;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        private Addons(Builder builder) {
            this.cleanupCloudResources = builder.cleanupCloudResources;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Addons create() {
            return builder().build();
        }

        /**
         * @return cleanupCloudResources
         */
        public Boolean getCleanupCloudResources() {
            return this.cleanupCloudResources;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private Boolean cleanupCloudResources; 
            private String name; 

            /**
             * Whether to clean up cloud resources.
             */
            public Builder cleanupCloudResources(Boolean cleanupCloudResources) {
                this.cleanupCloudResources = cleanupCloudResources;
                return this;
            }

            /**
             * The component name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public Addons build() {
                return new Addons(this);
            } 

        } 

    }
}
