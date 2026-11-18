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
         * <p>This parameter is not used.</p>
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
         * <p>The client token that is used to ensure the idempotence of the request.</p>
         * <p>You can generate the token on your client to ensure that the token is unique across different requests. The client token supports only ASCII characters.</p>
         * <blockquote>
         * <p>If you do not specify this parameter, the system automatically uses the <strong>RequestId</strong> of the API request as the <strong>ClientToken</strong>. The <strong>RequestId</strong> may be different for each API request.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>6868E9A1-56E6-5FD7-9684-E2963BBAFB5F</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>Specifies whether to perform a dry run on the request. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: sends a check request without deleting the endpoint IPAM pool. The check items include whether required parameters are specified, the request format, and service limits. If the request fails the check, an error is returned. If the request passes the check, the <code>DryRunOperation</code> error code is returned.</li>
         * <li><strong>false</strong> (default value): sends a normal request and directly deletes the endpoint IPAM pool if the request passes the check.
         * Default value: <strong>false</strong>.</li>
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
         * <li>true: Automatically installs the CloudMonitor agent on newly purchased ECS instances.</li>
         * <li>false: Does not automatically install the CloudMonitor agent on newly purchased ECS instances.
         * Default value: true.</li>
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
