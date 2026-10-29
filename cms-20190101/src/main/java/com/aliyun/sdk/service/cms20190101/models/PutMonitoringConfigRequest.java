// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

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
 * {@link PutMonitoringConfigRequest} extends {@link RequestModel}
 *
 * <p>PutMonitoringConfigRequest</p>
 */
public class PutMonitoringConfigRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoInstall")
    private Boolean autoInstall;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private Boolean dryRun;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnableInstallAgentNewECS")
    private Boolean enableInstallAgentNewECS;

    private PutMonitoringConfigRequest(Builder builder) {
        super(builder);
        this.autoInstall = builder.autoInstall;
        this.dryRun = builder.dryRun;
        this.enableInstallAgentNewECS = builder.enableInstallAgentNewECS;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PutMonitoringConfigRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return autoInstall
     */
    public Boolean getAutoInstall() {
        return this.autoInstall;
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * @return enableInstallAgentNewECS
     */
    public Boolean getEnableInstallAgentNewECS() {
        return this.enableInstallAgentNewECS;
    }

    public static final class Builder extends Request.Builder<PutMonitoringConfigRequest, Builder> {
        private Boolean autoInstall; 
        private Boolean dryRun; 
        private Boolean enableInstallAgentNewECS; 

        private Builder() {
            super();
        } 

        private Builder(PutMonitoringConfigRequest request) {
            super(request);
            this.autoInstall = request.autoInstall;
            this.dryRun = request.dryRun;
            this.enableInstallAgentNewECS = request.enableInstallAgentNewECS;
        } 

        /**
         * <p>This parameter is not required.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder autoInstall(Boolean autoInstall) {
            this.putQueryParameter("AutoInstall", autoInstall);
            this.autoInstall = autoInstall;
            return this;
        }

        /**
         * DryRun.
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * <p>Specifies whether to automatically install the CloudMonitor agent on newly purchased ECS instances. Valid values:</p>
         * <ul>
         * <li><p>true (default): The CloudMonitor agent is automatically installed on newly purchased ECS instances.</p>
         * </li>
         * <li><p>false: The CloudMonitor agent is not automatically installed on newly purchased ECS instances.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enableInstallAgentNewECS(Boolean enableInstallAgentNewECS) {
            this.putQueryParameter("EnableInstallAgentNewECS", enableInstallAgentNewECS);
            this.enableInstallAgentNewECS = enableInstallAgentNewECS;
            return this;
        }

        @Override
        public PutMonitoringConfigRequest build() {
            return new PutMonitoringConfigRequest(this);
        } 

    } 

}
