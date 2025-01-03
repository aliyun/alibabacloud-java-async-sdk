// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbase20190101.models;

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
 * {@link UpgradeMultiZoneClusterRequest} extends {@link RequestModel}
 *
 * <p>UpgradeMultiZoneClusterRequest</p>
 */
public class UpgradeMultiZoneClusterRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Components")
    @com.aliyun.core.annotation.Validation(required = true)
    private String components;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RestartComponents")
    private String restartComponents;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RunMode")
    private String runMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UpgradeInsName")
    private String upgradeInsName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Versions")
    private String versions;

    private UpgradeMultiZoneClusterRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.components = builder.components;
        this.restartComponents = builder.restartComponents;
        this.runMode = builder.runMode;
        this.upgradeInsName = builder.upgradeInsName;
        this.versions = builder.versions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpgradeMultiZoneClusterRequest create() {
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
     * @return components
     */
    public String getComponents() {
        return this.components;
    }

    /**
     * @return restartComponents
     */
    public String getRestartComponents() {
        return this.restartComponents;
    }

    /**
     * @return runMode
     */
    public String getRunMode() {
        return this.runMode;
    }

    /**
     * @return upgradeInsName
     */
    public String getUpgradeInsName() {
        return this.upgradeInsName;
    }

    /**
     * @return versions
     */
    public String getVersions() {
        return this.versions;
    }

    public static final class Builder extends Request.Builder<UpgradeMultiZoneClusterRequest, Builder> {
        private String clusterId; 
        private String components; 
        private String restartComponents; 
        private String runMode; 
        private String upgradeInsName; 
        private String versions; 

        private Builder() {
            super();
        } 

        private Builder(UpgradeMultiZoneClusterRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.components = request.components;
            this.restartComponents = request.restartComponents;
            this.runMode = request.runMode;
            this.upgradeInsName = request.upgradeInsName;
            this.versions = request.versions;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ld-***************</p>
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>LINDORM</p>
         */
        public Builder components(String components) {
            this.putQueryParameter("Components", components);
            this.components = components;
            return this;
        }

        /**
         * RestartComponents.
         */
        public Builder restartComponents(String restartComponents) {
            this.putQueryParameter("RestartComponents", restartComponents);
            this.restartComponents = restartComponents;
            return this;
        }

        /**
         * RunMode.
         */
        public Builder runMode(String runMode) {
            this.putQueryParameter("RunMode", runMode);
            this.runMode = runMode;
            return this;
        }

        /**
         * UpgradeInsName.
         */
        public Builder upgradeInsName(String upgradeInsName) {
            this.putQueryParameter("UpgradeInsName", upgradeInsName);
            this.upgradeInsName = upgradeInsName;
            return this;
        }

        /**
         * Versions.
         */
        public Builder versions(String versions) {
            this.putQueryParameter("Versions", versions);
            this.versions = versions;
            return this;
        }

        @Override
        public UpgradeMultiZoneClusterRequest build() {
            return new UpgradeMultiZoneClusterRequest(this);
        } 

    } 

}
