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
         * 非阿里云主机安装云监控插件时所需要的AccessKey
         */
        public Builder agentAccessKey(String agentAccessKey) {
            this.putQueryParameter("AgentAccessKey", agentAccessKey);
            this.agentAccessKey = agentAccessKey;
            return this;
        }

        /**
         * 非阿里云主机安装云监控插件时所需要的AccessSecret
         */
        public Builder agentSecretKey(String agentSecretKey) {
            this.putQueryParameter("AgentSecretKey", agentSecretKey);
            this.agentSecretKey = agentSecretKey;
            return this;
        }

        /**
         * 云监控版本
         */
        public Builder argusVersion(String argusVersion) {
            this.putQueryParameter("ArgusVersion", argusVersion);
            this.argusVersion = argusVersion;
            return this;
        }

        /**
         * 实例 instanceId
         */
        public Builder instanceIdList(java.util.List < String > instanceIdList) {
            this.putQueryParameter("InstanceIdList", instanceIdList);
            this.instanceIdList = instanceIdList;
            return this;
        }

        /**
         * uuid 列表
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
