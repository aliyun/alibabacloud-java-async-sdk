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
         * <p>The ID of the multi-zone instance.</p>
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
         * <p>The component names. You can specify multiple component names separated by commas (,).</p>
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
         * <p>The names of the components that need to be restarted after the upgrade. You can specify multiple component names separated by commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>LPROXY</p>
         */
        public Builder restartComponents(String restartComponents) {
            this.putQueryParameter("RestartComponents", restartComponents);
            this.restartComponents = restartComponents;
            return this;
        }

        /**
         * <p>The execution mode. If UpgradeInsName is not empty, the mode is forcibly set to single. If UpgradeInsName is empty and RunMode is not specified, the default value is serial. Valid values:</p>
         * <ul>
         * <li>serial: all sub-instances are upgraded.</li>
         * <li>single: only the specified sub-instance is upgraded.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>serial</p>
         */
        public Builder runMode(String runMode) {
            this.putQueryParameter("RunMode", runMode);
            this.runMode = runMode;
            return this;
        }

        /**
         * <p>The name of the sub-instance to upgrade. You can obtain this value from the MultiZoneInstanceModels field in the response of the <a href="~~DescribeMultiZoneCluster~~">DescribeMultiZoneCluster</a> operation. This parameter is optional. If you do not specify this parameter, all sub-instances are upgraded.</p>
         * 
         * <strong>example:</strong>
         * <p>ld-t4n40m3171t4******-az-b</p>
         */
        public Builder upgradeInsName(String upgradeInsName) {
            this.putQueryParameter("UpgradeInsName", upgradeInsName);
            this.upgradeInsName = upgradeInsName;
            return this;
        }

        /**
         * <p>The RPM version to upgrade to. If you do not specify this parameter, the components are upgraded to the latest version. If you specify multiple values for Components, you must also specify the same number of values for Versions, separated by commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>t-apsara-lindorm-2.1.20-20200518175539.alios7.x86_64</p>
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
