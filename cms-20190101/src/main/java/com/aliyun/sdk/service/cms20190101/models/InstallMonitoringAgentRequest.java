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
 * {@link InstallMonitoringAgentRequest} extends {@link RequestModel}
 *
 * <p>InstallMonitoringAgentRequest</p>
 */
public class InstallMonitoringAgentRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private Boolean dryRun;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Force")
    private Boolean force;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstallCommand")
    private String installCommand;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceIds")
    private java.util.List<String> instanceIds;

    private InstallMonitoringAgentRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.dryRun = builder.dryRun;
        this.force = builder.force;
        this.installCommand = builder.installCommand;
        this.instanceIds = builder.instanceIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InstallMonitoringAgentRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return force
     */
    public Boolean getForce() {
        return this.force;
    }

    /**
     * @return installCommand
     */
    public String getInstallCommand() {
        return this.installCommand;
    }

    /**
     * @return instanceIds
     */
    public java.util.List<String> getInstanceIds() {
        return this.instanceIds;
    }

    public static final class Builder extends Request.Builder<InstallMonitoringAgentRequest, Builder> {
        private String clientToken; 
        private Boolean dryRun; 
        private Boolean force; 
        private String installCommand; 
        private java.util.List<String> instanceIds; 

        private Builder() {
            super();
        } 

        private Builder(InstallMonitoringAgentRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.dryRun = request.dryRun;
            this.force = request.force;
            this.installCommand = request.installCommand;
            this.instanceIds = request.instanceIds;
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
         * <p>Specifies whether to perform a dry run on the request. A dry run checks permissions and instance status. Valid values:</p>
         * <ul>
         * <li><strong>false</strong> (default): Sends a normal request. After the request passes the check, the name and description of the route table are directly modified.</li>
         * <li><strong>true</strong>: Sends a check request. Only the check is performed, and the name and description of the route table are not modified. The check items include whether required parameters are specified and the request format. If the check fails, a corresponding error is returned. If the check succeeds, the <code>DryRunOperation</code> error code is returned.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * <p>Specifies whether to forcibly install the CloudMonitor agent. Valid values:</p>
         * <ul>
         * <li>true (default): Forcibly installs the agent.</li>
         * <li>false: Does not forcibly install the agent.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder force(Boolean force) {
            this.putQueryParameter("Force", force);
            this.force = force;
            return this;
        }

        /**
         * <p>Installs the CloudMonitor agent on all Alibaba Cloud hosts within the current Alibaba Cloud account. Valid values:</p>
         * <ul>
         * <li><p><code>onlyInstallNotHasAgent</code>: Installs the latest version of the agent only on Alibaba Cloud hosts on which the CloudMonitor agent is not installed.</p>
         * </li>
         * <li><p><code>onlyUpgradeAgent</code>: Upgrades the agent only on Alibaba Cloud hosts on which a non-latest version of the CloudMonitor agent is installed.</p>
         * </li>
         * <li><p><code>installAndUpgrade</code>: Installs the latest version of the agent on Alibaba Cloud hosts on which the CloudMonitor agent is not installed, and upgrades the agent on Alibaba Cloud hosts on which a non-latest version of the CloudMonitor agent is installed.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>If you specify this parameter, the <code>InstanceIds</code> parameter is ignored.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>onlyInstallNotHasAgent</p>
         */
        public Builder installCommand(String installCommand) {
            this.putQueryParameter("InstallCommand", installCommand);
            this.installCommand = installCommand;
            return this;
        }

        /**
         * <p>The ID of the Alibaba Cloud host.</p>
         * <p>Valid values of N: 1 to 10.</p>
         * <blockquote>
         * <p>You must specify either <code>InstallCommand</code> or <code>InstanceIds</code>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>i-m5e0k0bexac8tykr****</p>
         */
        public Builder instanceIds(java.util.List<String> instanceIds) {
            this.putQueryParameter("InstanceIds", instanceIds);
            this.instanceIds = instanceIds;
            return this;
        }

        @Override
        public InstallMonitoringAgentRequest build() {
            return new InstallMonitoringAgentRequest(this);
        } 

    } 

}
