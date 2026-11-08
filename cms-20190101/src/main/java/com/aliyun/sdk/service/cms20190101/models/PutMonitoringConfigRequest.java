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
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private Boolean dryRun;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnableInstallAgentNewECS")
    private Boolean enableInstallAgentNewECS;

    private PutMonitoringConfigRequest(Builder builder) {
        super(builder);
        this.autoInstall = builder.autoInstall;
        this.clientToken = builder.clientToken;
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
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
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
        private String clientToken; 
        private Boolean dryRun; 
        private Boolean enableInstallAgentNewECS; 

        private Builder() {
            super();
        } 

        private Builder(PutMonitoringConfigRequest request) {
            super(request);
            this.autoInstall = request.autoInstall;
            this.clientToken = request.clientToken;
            this.dryRun = request.dryRun;
            this.enableInstallAgentNewECS = request.enableInstallAgentNewECS;
        } 

        /**
         * <p>Ignore this parameter.</p>
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
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>Specifies whether to perform a dry run on the request. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Sends a dry run request without deleting the endpoint IPAM pool. The system checks whether all required parameters are specified, the request format is valid, and service limits are met. If the request fails the check, the corresponding error is returned. If the request passes the check, the <code>DryRunOperation</code> error code is returned.</li>
         * <li><strong>false</strong> (default): Sends a normal request and directly deletes the endpoint IPAM pool if the request passes the check.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * <p>Specifies whether to automatically install the CloudMonitor agent on newly purchased ECS instances. Valid values:</p>
         * <ul>
         * <li><p>true (default): Automatically installs the CloudMonitor agent on newly purchased ECS instances.</p>
         * </li>
         * <li><p>false: Does not automatically install the CloudMonitor agent on newly purchased ECS instances.</p>
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
