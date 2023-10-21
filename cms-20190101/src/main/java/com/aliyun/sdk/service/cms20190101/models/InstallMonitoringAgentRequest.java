// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link InstallMonitoringAgentRequest} extends {@link RequestModel}
 *
 * <p>InstallMonitoringAgentRequest</p>
 */
public class InstallMonitoringAgentRequest extends Request {
    @Query
    @NameInMap("Force")
    private Boolean force;

    @Query
    @NameInMap("InstallCommand")
    private String installCommand;

    @Query
    @NameInMap("InstanceIds")
    private java.util.List < String > instanceIds;

    private InstallMonitoringAgentRequest(Builder builder) {
        super(builder);
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
    public java.util.List < String > getInstanceIds() {
        return this.instanceIds;
    }

    public static final class Builder extends Request.Builder<InstallMonitoringAgentRequest, Builder> {
        private Boolean force; 
        private String installCommand; 
        private java.util.List < String > instanceIds; 

        private Builder() {
            super();
        } 

        private Builder(InstallMonitoringAgentRequest request) {
            super(request);
            this.force = request.force;
            this.installCommand = request.installCommand;
            this.instanceIds = request.instanceIds;
        } 

        /**
         * Specifies whether to install the CloudMonitor agent. Valid values:
         * <p>
         * 
         * *   true (default value): yes
         * *   false: no
         */
        public Builder force(Boolean force) {
            this.putQueryParameter("Force", force);
            this.force = force;
            return this;
        }

        /**
         * Specifies whether to install the CloudMonitor agent on all ECS instances that belong to the current Alibaba Cloud account. Valid values:
         * <p>
         * 
         * *   `onlyInstallNotHasAgent`: installs the latest version of the CloudMonitor agent only on ECS instances on which the agent is not installed.
         * *   `onlyUpgradeAgent`: upgrades the CloudMonitor agent to the latest version only for ECS instances on which an earlier version of the agent is installed.
         * *   `installAndUpgrade`: installs the latest version of the CloudMonitor agent on ECS instances on which the agent is not installed, and upgrades the CloudMonitor agent to the latest version for ECS instances on which an earlier version of the agent is installed.
         * 
         * >  If you set the InstallCommand parameter, the `InstanceIds` parameter does not take effect.
         */
        public Builder installCommand(String installCommand) {
            this.putQueryParameter("InstallCommand", installCommand);
            this.installCommand = installCommand;
            return this;
        }

        /**
         * InstanceIds.
         */
        public Builder instanceIds(java.util.List < String > instanceIds) {
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
