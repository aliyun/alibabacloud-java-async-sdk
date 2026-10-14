// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

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
 * {@link UnInstallClusterAddonsRequest} extends {@link RequestModel}
 *
 * <p>UnInstallClusterAddonsRequest</p>
 */
public class UnInstallClusterAddonsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Addons")
    private java.util.List<Addons> addons;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    private UnInstallClusterAddonsRequest(Builder builder) {
        super(builder);
        this.addons = builder.addons;
        this.clusterId = builder.clusterId;
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
     * @return addons
     */
    public java.util.List<Addons> getAddons() {
        return this.addons;
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    public static final class Builder extends Request.Builder<UnInstallClusterAddonsRequest, Builder> {
        private java.util.List<Addons> addons; 
        private String clusterId; 

        private Builder() {
            super();
        } 

        private Builder(UnInstallClusterAddonsRequest request) {
            super(request);
            this.addons = request.addons;
            this.clusterId = request.clusterId;
        } 

        /**
         * <p>The add-on information.</p>
         */
        public Builder addons(java.util.List<Addons> addons) {
            String addonsShrink = shrink(addons, "Addons", "json");
            this.putQueryParameter("Addons", addonsShrink);
            this.addons = addons;
            return this;
        }

        /**
         * <p>The ID of the cluster.</p>
         * <p>The target cluster must be in the running state. You can call DescribeClustersV1 to query the cluster state.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>eck-xxxxxxxx</p>
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        @Override
        public UnInstallClusterAddonsRequest build() {
            return new UnInstallClusterAddonsRequest(this);
        } 

    } 

    /**
     * 
     * {@link UnInstallClusterAddonsRequest} extends {@link TeaModel}
     *
     * <p>UnInstallClusterAddonsRequest</p>
     */
    public static class Addons extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private Addons(Builder builder) {
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Addons create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String name; 

            private Builder() {
            } 

            private Builder(Addons model) {
                this.name = model.name;
            } 

            /**
             * <p>The name of the add-on.</p>
             * 
             * <strong>example:</strong>
             * <p>edge-csi-lite</p>
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
