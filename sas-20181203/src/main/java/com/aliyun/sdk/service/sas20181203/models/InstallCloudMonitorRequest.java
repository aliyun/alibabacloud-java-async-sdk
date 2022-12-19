// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link InstallCloudMonitorRequest} extends {@link RequestModel}
 *
 * <p>InstallCloudMonitorRequest</p>
 */
public class InstallCloudMonitorRequest extends Request {
    @Query
    @NameInMap("AgentAccessKey")
    private String agentAccessKey;

    @Query
    @NameInMap("AgentSecretKey")
    private String agentSecretKey;

    @Query
    @NameInMap("ArgusVersion")
    @Validation(required = true)
    private String argusVersion;

    @Query
    @NameInMap("InstanceIdList")
    private java.util.List < String > instanceIdList;

    @Query
    @NameInMap("UuidList")
    private java.util.List < String > uuidList;

    private InstallCloudMonitorRequest(Builder builder) {
        super(builder);
        this.agentAccessKey = builder.agentAccessKey;
        this.agentSecretKey = builder.agentSecretKey;
        this.argusVersion = builder.argusVersion;
        this.instanceIdList = builder.instanceIdList;
        this.uuidList = builder.uuidList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InstallCloudMonitorRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agentAccessKey
     */
    public String getAgentAccessKey() {
        return this.agentAccessKey;
    }

    /**
     * @return agentSecretKey
     */
    public String getAgentSecretKey() {
        return this.agentSecretKey;
    }

    /**
     * @return argusVersion
     */
    public String getArgusVersion() {
        return this.argusVersion;
    }

    /**
     * @return instanceIdList
     */
    public java.util.List < String > getInstanceIdList() {
        return this.instanceIdList;
    }

    /**
     * @return uuidList
     */
    public java.util.List < String > getUuidList() {
        return this.uuidList;
    }

    public static final class Builder extends Request.Builder<InstallCloudMonitorRequest, Builder> {
        private String agentAccessKey; 
        private String agentSecretKey; 
        private String argusVersion; 
        private java.util.List < String > instanceIdList; 
        private java.util.List < String > uuidList; 

        private Builder() {
            super();
        } 

        private Builder(InstallCloudMonitorRequest request) {
            super(request);
            this.agentAccessKey = request.agentAccessKey;
            this.agentSecretKey = request.agentSecretKey;
            this.argusVersion = request.argusVersion;
            this.instanceIdList = request.instanceIdList;
            this.uuidList = request.uuidList;
        } 

        /**
         * The AccessKey ID that is required to install the CloudMonitor agent. You can call the [DescribeMonitoringAgentAccessKey](~~114948~~) operation to query the AccessKey ID.
         * <p>
         * 
         * >  This parameter is required only when you install the CloudMonitor agent on servers that are not deployed on Alibaba Cloud.
         */
        public Builder agentAccessKey(String agentAccessKey) {
            this.putQueryParameter("AgentAccessKey", agentAccessKey);
            this.agentAccessKey = agentAccessKey;
            return this;
        }

        /**
         * The AccessKey secret that is required to install the CloudMonitor agent. You can call the [DescribeMonitoringAgentAccessKey](~~114948~~) operation to query the AccessKey secret.
         * <p>
         * 
         * >  This parameter is required only when you install the CloudMonitor agent on servers that are not deployed on Alibaba Cloud.
         */
        public Builder agentSecretKey(String agentSecretKey) {
            this.putQueryParameter("AgentSecretKey", agentSecretKey);
            this.agentSecretKey = agentSecretKey;
            return this;
        }

        /**
         * The version of the CloudMonitor agent that you want to install on the servers. For more information about the latest version of the CloudMonitor agent, see [Overview](~~183431~~).
         */
        public Builder argusVersion(String argusVersion) {
            this.putQueryParameter("ArgusVersion", argusVersion);
            this.argusVersion = argusVersion;
            return this;
        }

        /**
         * The IDs of the servers on which you want to install the CloudMonitor agent. Separate multiple IDs with commas (,).
         */
        public Builder instanceIdList(java.util.List < String > instanceIdList) {
            this.putQueryParameter("InstanceIdList", instanceIdList);
            this.instanceIdList = instanceIdList;
            return this;
        }

        /**
         * The UUIDs of the servers on which you want to install the CloudMonitor agent. Separate multiple UUIDs with commas (,).
         */
        public Builder uuidList(java.util.List < String > uuidList) {
            this.putQueryParameter("UuidList", uuidList);
            this.uuidList = uuidList;
            return this;
        }

        @Override
        public InstallCloudMonitorRequest build() {
            return new InstallCloudMonitorRequest(this);
        } 

    } 

}
