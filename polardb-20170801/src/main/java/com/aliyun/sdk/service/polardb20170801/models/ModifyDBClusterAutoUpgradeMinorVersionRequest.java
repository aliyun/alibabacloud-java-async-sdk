// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link ModifyDBClusterAutoUpgradeMinorVersionRequest} extends {@link RequestModel}
 *
 * <p>ModifyDBClusterAutoUpgradeMinorVersionRequest</p>
 */
public class ModifyDBClusterAutoUpgradeMinorVersionRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoUpgradeMinorVersion")
    @com.aliyun.core.annotation.Validation(required = true)
    private String autoUpgradeMinorVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBClusterId;

    private ModifyDBClusterAutoUpgradeMinorVersionRequest(Builder builder) {
        super(builder);
        this.autoUpgradeMinorVersion = builder.autoUpgradeMinorVersion;
        this.DBClusterId = builder.DBClusterId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDBClusterAutoUpgradeMinorVersionRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return autoUpgradeMinorVersion
     */
    public String getAutoUpgradeMinorVersion() {
        return this.autoUpgradeMinorVersion;
    }

    /**
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public static final class Builder extends Request.Builder<ModifyDBClusterAutoUpgradeMinorVersionRequest, Builder> {
        private String autoUpgradeMinorVersion; 
        private String DBClusterId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyDBClusterAutoUpgradeMinorVersionRequest request) {
            super(request);
            this.autoUpgradeMinorVersion = request.autoUpgradeMinorVersion;
            this.DBClusterId = request.DBClusterId;
        } 

        /**
         * <p>The minor engine version update policy. Valid values:</p>
         * <ul>
         * <li>Auto: Automatic update.</li>
         * <li>Manual: Manual update.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Manual</p>
         */
        public Builder autoUpgradeMinorVersion(String autoUpgradeMinorVersion) {
            this.putQueryParameter("AutoUpgradeMinorVersion", autoUpgradeMinorVersion);
            this.autoUpgradeMinorVersion = autoUpgradeMinorVersion;
            return this;
        }

        /**
         * <p>The ID of the PolarDB cluster.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pc-******************</p>
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putQueryParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        @Override
        public ModifyDBClusterAutoUpgradeMinorVersionRequest build() {
            return new ModifyDBClusterAutoUpgradeMinorVersionRequest(this);
        } 

    } 

}
