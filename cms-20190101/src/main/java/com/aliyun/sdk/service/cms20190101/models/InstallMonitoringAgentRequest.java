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
         * The HTTP status code.
         * <p>
         * 
         * >  The status code 200 indicates that the call was successful.
         */
        public Builder force(Boolean force) {
            this.putQueryParameter("Force", force);
            this.force = force;
            return this;
        }

        /**
         * The ID of the request.
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
