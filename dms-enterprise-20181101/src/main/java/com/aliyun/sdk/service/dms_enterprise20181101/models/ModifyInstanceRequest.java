// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyInstanceRequest} extends {@link RequestModel}
 *
 * <p>ModifyInstanceRequest</p>
 */
public class ModifyInstanceRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("DataLinkName")
    private String dataLinkName;

    @Query
    @NameInMap("DatabasePassword")
    private String databasePassword;

    @Query
    @NameInMap("DatabaseUser")
    private String databaseUser;

    @Query
    @NameInMap("DbaId")
    private Long dbaId;

    @Query
    @NameInMap("DdlOnline")
    private Integer ddlOnline;

    @Query
    @NameInMap("EcsInstanceId")
    private String ecsInstanceId;

    @Query
    @NameInMap("EcsRegion")
    private String ecsRegion;

    @Query
    @NameInMap("EnableSellCommon")
    private String enableSellCommon;

    @Query
    @NameInMap("EnableSellSitd")
    private String enableSellSitd;

    @Query
    @NameInMap("EnableSellStable")
    private String enableSellStable;

    @Query
    @NameInMap("EnableSellTrust")
    private String enableSellTrust;

    @Query
    @NameInMap("EnvType")
    private String envType;

    @Query
    @NameInMap("ExportTimeout")
    private Integer exportTimeout;

    @Query
    @NameInMap("Host")
    private String host;

    @Query
    @NameInMap("InstanceAlias")
    private String instanceAlias;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("InstanceSource")
    private String instanceSource;

    @Query
    @NameInMap("InstanceType")
    private String instanceType;

    @Query
    @NameInMap("NetworkType")
    private String networkType;

    @Query
    @NameInMap("Port")
    private Integer port;

    @Query
    @NameInMap("QueryTimeout")
    private Integer queryTimeout;

    @Query
    @NameInMap("SafeRule")
    private String safeRule;

    @Query
    @NameInMap("Sid")
    private String sid;

    @Query
    @NameInMap("SkipTest")
    private Boolean skipTest;

    @Query
    @NameInMap("TemplateId")
    private Long templateId;

    @Query
    @NameInMap("TemplateType")
    private String templateType;

    @Query
    @NameInMap("Tid")
    private Long tid;

    @Query
    @NameInMap("UseDsql")
    private Integer useDsql;

    @Query
    @NameInMap("VpcId")
    private String vpcId;

    private ModifyInstanceRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.dataLinkName = builder.dataLinkName;
        this.databasePassword = builder.databasePassword;
        this.databaseUser = builder.databaseUser;
        this.dbaId = builder.dbaId;
        this.ddlOnline = builder.ddlOnline;
        this.ecsInstanceId = builder.ecsInstanceId;
        this.ecsRegion = builder.ecsRegion;
        this.enableSellCommon = builder.enableSellCommon;
        this.enableSellSitd = builder.enableSellSitd;
        this.enableSellStable = builder.enableSellStable;
        this.enableSellTrust = builder.enableSellTrust;
        this.envType = builder.envType;
        this.exportTimeout = builder.exportTimeout;
        this.host = builder.host;
        this.instanceAlias = builder.instanceAlias;
        this.instanceId = builder.instanceId;
        this.instanceSource = builder.instanceSource;
        this.instanceType = builder.instanceType;
        this.networkType = builder.networkType;
        this.port = builder.port;
        this.queryTimeout = builder.queryTimeout;
        this.safeRule = builder.safeRule;
        this.sid = builder.sid;
        this.skipTest = builder.skipTest;
        this.templateId = builder.templateId;
        this.templateType = builder.templateType;
        this.tid = builder.tid;
        this.useDsql = builder.useDsql;
        this.vpcId = builder.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyInstanceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return dataLinkName
     */
    public String getDataLinkName() {
        return this.dataLinkName;
    }

    /**
     * @return databasePassword
     */
    public String getDatabasePassword() {
        return this.databasePassword;
    }

    /**
     * @return databaseUser
     */
    public String getDatabaseUser() {
        return this.databaseUser;
    }

    /**
     * @return dbaId
     */
    public Long getDbaId() {
        return this.dbaId;
    }

    /**
     * @return ddlOnline
     */
    public Integer getDdlOnline() {
        return this.ddlOnline;
    }

    /**
     * @return ecsInstanceId
     */
    public String getEcsInstanceId() {
        return this.ecsInstanceId;
    }

    /**
     * @return ecsRegion
     */
    public String getEcsRegion() {
        return this.ecsRegion;
    }

    /**
     * @return enableSellCommon
     */
    public String getEnableSellCommon() {
        return this.enableSellCommon;
    }

    /**
     * @return enableSellSitd
     */
    public String getEnableSellSitd() {
        return this.enableSellSitd;
    }

    /**
     * @return enableSellStable
     */
    public String getEnableSellStable() {
        return this.enableSellStable;
    }

    /**
     * @return enableSellTrust
     */
    public String getEnableSellTrust() {
        return this.enableSellTrust;
    }

    /**
     * @return envType
     */
    public String getEnvType() {
        return this.envType;
    }

    /**
     * @return exportTimeout
     */
    public Integer getExportTimeout() {
        return this.exportTimeout;
    }

    /**
     * @return host
     */
    public String getHost() {
        return this.host;
    }

    /**
     * @return instanceAlias
     */
    public String getInstanceAlias() {
        return this.instanceAlias;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return instanceSource
     */
    public String getInstanceSource() {
        return this.instanceSource;
    }

    /**
     * @return instanceType
     */
    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * @return networkType
     */
    public String getNetworkType() {
        return this.networkType;
    }

    /**
     * @return port
     */
    public Integer getPort() {
        return this.port;
    }

    /**
     * @return queryTimeout
     */
    public Integer getQueryTimeout() {
        return this.queryTimeout;
    }

    /**
     * @return safeRule
     */
    public String getSafeRule() {
        return this.safeRule;
    }

    /**
     * @return sid
     */
    public String getSid() {
        return this.sid;
    }

    /**
     * @return skipTest
     */
    public Boolean getSkipTest() {
        return this.skipTest;
    }

    /**
     * @return templateId
     */
    public Long getTemplateId() {
        return this.templateId;
    }

    /**
     * @return templateType
     */
    public String getTemplateType() {
        return this.templateType;
    }

    /**
     * @return tid
     */
    public Long getTid() {
        return this.tid;
    }

    /**
     * @return useDsql
     */
    public Integer getUseDsql() {
        return this.useDsql;
    }

    /**
     * @return vpcId
     */
    public String getVpcId() {
        return this.vpcId;
    }

    public static final class Builder extends Request.Builder<ModifyInstanceRequest, Builder> {
        private String regionId; 
        private String dataLinkName; 
        private String databasePassword; 
        private String databaseUser; 
        private Long dbaId; 
        private Integer ddlOnline; 
        private String ecsInstanceId; 
        private String ecsRegion; 
        private String enableSellCommon; 
        private String enableSellSitd; 
        private String enableSellStable; 
        private String enableSellTrust; 
        private String envType; 
        private Integer exportTimeout; 
        private String host; 
        private String instanceAlias; 
        private String instanceId; 
        private String instanceSource; 
        private String instanceType; 
        private String networkType; 
        private Integer port; 
        private Integer queryTimeout; 
        private String safeRule; 
        private String sid; 
        private Boolean skipTest; 
        private Long templateId; 
        private String templateType; 
        private Long tid; 
        private Integer useDsql; 
        private String vpcId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyInstanceRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.dataLinkName = request.dataLinkName;
            this.databasePassword = request.databasePassword;
            this.databaseUser = request.databaseUser;
            this.dbaId = request.dbaId;
            this.ddlOnline = request.ddlOnline;
            this.ecsInstanceId = request.ecsInstanceId;
            this.ecsRegion = request.ecsRegion;
            this.enableSellCommon = request.enableSellCommon;
            this.enableSellSitd = request.enableSellSitd;
            this.enableSellStable = request.enableSellStable;
            this.enableSellTrust = request.enableSellTrust;
            this.envType = request.envType;
            this.exportTimeout = request.exportTimeout;
            this.host = request.host;
            this.instanceAlias = request.instanceAlias;
            this.instanceId = request.instanceId;
            this.instanceSource = request.instanceSource;
            this.instanceType = request.instanceType;
            this.networkType = request.networkType;
            this.port = request.port;
            this.queryTimeout = request.queryTimeout;
            this.safeRule = request.safeRule;
            this.sid = request.sid;
            this.skipTest = request.skipTest;
            this.templateId = request.templateId;
            this.templateType = request.templateType;
            this.tid = request.tid;
            this.useDsql = request.useDsql;
            this.vpcId = request.vpcId;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * DataLinkName.
         */
        public Builder dataLinkName(String dataLinkName) {
            this.putQueryParameter("DataLinkName", dataLinkName);
            this.dataLinkName = dataLinkName;
            return this;
        }

        /**
         * DatabasePassword.
         */
        public Builder databasePassword(String databasePassword) {
            this.putQueryParameter("DatabasePassword", databasePassword);
            this.databasePassword = databasePassword;
            return this;
        }

        /**
         * DatabaseUser.
         */
        public Builder databaseUser(String databaseUser) {
            this.putQueryParameter("DatabaseUser", databaseUser);
            this.databaseUser = databaseUser;
            return this;
        }

        /**
         * DbaId.
         */
        public Builder dbaId(Long dbaId) {
            this.putQueryParameter("DbaId", dbaId);
            this.dbaId = dbaId;
            return this;
        }

        /**
         * DdlOnline.
         */
        public Builder ddlOnline(Integer ddlOnline) {
            this.putQueryParameter("DdlOnline", ddlOnline);
            this.ddlOnline = ddlOnline;
            return this;
        }

        /**
         * EcsInstanceId.
         */
        public Builder ecsInstanceId(String ecsInstanceId) {
            this.putQueryParameter("EcsInstanceId", ecsInstanceId);
            this.ecsInstanceId = ecsInstanceId;
            return this;
        }

        /**
         * EcsRegion.
         */
        public Builder ecsRegion(String ecsRegion) {
            this.putQueryParameter("EcsRegion", ecsRegion);
            this.ecsRegion = ecsRegion;
            return this;
        }

        /**
         * EnableSellCommon.
         */
        public Builder enableSellCommon(String enableSellCommon) {
            this.putQueryParameter("EnableSellCommon", enableSellCommon);
            this.enableSellCommon = enableSellCommon;
            return this;
        }

        /**
         * EnableSellSitd.
         */
        public Builder enableSellSitd(String enableSellSitd) {
            this.putQueryParameter("EnableSellSitd", enableSellSitd);
            this.enableSellSitd = enableSellSitd;
            return this;
        }

        /**
         * EnableSellStable.
         */
        public Builder enableSellStable(String enableSellStable) {
            this.putQueryParameter("EnableSellStable", enableSellStable);
            this.enableSellStable = enableSellStable;
            return this;
        }

        /**
         * EnableSellTrust.
         */
        public Builder enableSellTrust(String enableSellTrust) {
            this.putQueryParameter("EnableSellTrust", enableSellTrust);
            this.enableSellTrust = enableSellTrust;
            return this;
        }

        /**
         * EnvType.
         */
        public Builder envType(String envType) {
            this.putQueryParameter("EnvType", envType);
            this.envType = envType;
            return this;
        }

        /**
         * ExportTimeout.
         */
        public Builder exportTimeout(Integer exportTimeout) {
            this.putQueryParameter("ExportTimeout", exportTimeout);
            this.exportTimeout = exportTimeout;
            return this;
        }

        /**
         * Host.
         */
        public Builder host(String host) {
            this.putQueryParameter("Host", host);
            this.host = host;
            return this;
        }

        /**
         * InstanceAlias.
         */
        public Builder instanceAlias(String instanceAlias) {
            this.putQueryParameter("InstanceAlias", instanceAlias);
            this.instanceAlias = instanceAlias;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * InstanceSource.
         */
        public Builder instanceSource(String instanceSource) {
            this.putQueryParameter("InstanceSource", instanceSource);
            this.instanceSource = instanceSource;
            return this;
        }

        /**
         * InstanceType.
         */
        public Builder instanceType(String instanceType) {
            this.putQueryParameter("InstanceType", instanceType);
            this.instanceType = instanceType;
            return this;
        }

        /**
         * NetworkType.
         */
        public Builder networkType(String networkType) {
            this.putQueryParameter("NetworkType", networkType);
            this.networkType = networkType;
            return this;
        }

        /**
         * Port.
         */
        public Builder port(Integer port) {
            this.putQueryParameter("Port", port);
            this.port = port;
            return this;
        }

        /**
         * QueryTimeout.
         */
        public Builder queryTimeout(Integer queryTimeout) {
            this.putQueryParameter("QueryTimeout", queryTimeout);
            this.queryTimeout = queryTimeout;
            return this;
        }

        /**
         * SafeRule.
         */
        public Builder safeRule(String safeRule) {
            this.putQueryParameter("SafeRule", safeRule);
            this.safeRule = safeRule;
            return this;
        }

        /**
         * Sid.
         */
        public Builder sid(String sid) {
            this.putQueryParameter("Sid", sid);
            this.sid = sid;
            return this;
        }

        /**
         * SkipTest.
         */
        public Builder skipTest(Boolean skipTest) {
            this.putQueryParameter("SkipTest", skipTest);
            this.skipTest = skipTest;
            return this;
        }

        /**
         * TemplateId.
         */
        public Builder templateId(Long templateId) {
            this.putQueryParameter("TemplateId", templateId);
            this.templateId = templateId;
            return this;
        }

        /**
         * TemplateType.
         */
        public Builder templateType(String templateType) {
            this.putQueryParameter("TemplateType", templateType);
            this.templateType = templateType;
            return this;
        }

        /**
         * Tid.
         */
        public Builder tid(Long tid) {
            this.putQueryParameter("Tid", tid);
            this.tid = tid;
            return this;
        }

        /**
         * UseDsql.
         */
        public Builder useDsql(Integer useDsql) {
            this.putQueryParameter("UseDsql", useDsql);
            this.useDsql = useDsql;
            return this;
        }

        /**
         * VpcId.
         */
        public Builder vpcId(String vpcId) {
            this.putQueryParameter("VpcId", vpcId);
            this.vpcId = vpcId;
            return this;
        }

        @Override
        public ModifyInstanceRequest build() {
            return new ModifyInstanceRequest(this);
        } 

    } 

}
