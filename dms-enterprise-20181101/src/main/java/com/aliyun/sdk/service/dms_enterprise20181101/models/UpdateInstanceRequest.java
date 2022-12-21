// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateInstanceRequest} extends {@link RequestModel}
 *
 * <p>UpdateInstanceRequest</p>
 */
public class UpdateInstanceRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("DataLinkName")
    private String dataLinkName;

    @Query
    @NameInMap("DatabasePassword")
    @Validation(required = true)
    private String databasePassword;

    @Query
    @NameInMap("DatabaseUser")
    @Validation(required = true)
    private String databaseUser;

    @Query
    @NameInMap("DbaId")
    @Validation(required = true)
    private String dbaId;

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
    @NameInMap("EnableSellSitd")
    private String enableSellSitd;

    @Query
    @NameInMap("EnvType")
    @Validation(required = true)
    private String envType;

    @Query
    @NameInMap("ExportTimeout")
    @Validation(required = true)
    private Integer exportTimeout;

    @Query
    @NameInMap("Host")
    @Validation(required = true)
    private String host;

    @Query
    @NameInMap("InstanceAlias")
    @Validation(required = true)
    private String instanceAlias;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("InstanceSource")
    @Validation(required = true)
    private String instanceSource;

    @Query
    @NameInMap("InstanceType")
    @Validation(required = true)
    private String instanceType;

    @Query
    @NameInMap("Port")
    @Validation(required = true)
    private Integer port;

    @Query
    @NameInMap("QueryTimeout")
    @Validation(required = true)
    private Integer queryTimeout;

    @Query
    @NameInMap("SafeRuleId")
    @Validation(required = true)
    private String safeRuleId;

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

    private UpdateInstanceRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.dataLinkName = builder.dataLinkName;
        this.databasePassword = builder.databasePassword;
        this.databaseUser = builder.databaseUser;
        this.dbaId = builder.dbaId;
        this.ddlOnline = builder.ddlOnline;
        this.ecsInstanceId = builder.ecsInstanceId;
        this.ecsRegion = builder.ecsRegion;
        this.enableSellSitd = builder.enableSellSitd;
        this.envType = builder.envType;
        this.exportTimeout = builder.exportTimeout;
        this.host = builder.host;
        this.instanceAlias = builder.instanceAlias;
        this.instanceId = builder.instanceId;
        this.instanceSource = builder.instanceSource;
        this.instanceType = builder.instanceType;
        this.port = builder.port;
        this.queryTimeout = builder.queryTimeout;
        this.safeRuleId = builder.safeRuleId;
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

    public static UpdateInstanceRequest create() {
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
    public String getDbaId() {
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
     * @return enableSellSitd
     */
    public String getEnableSellSitd() {
        return this.enableSellSitd;
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
     * @return safeRuleId
     */
    public String getSafeRuleId() {
        return this.safeRuleId;
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

    public static final class Builder extends Request.Builder<UpdateInstanceRequest, Builder> {
        private String regionId; 
        private String dataLinkName; 
        private String databasePassword; 
        private String databaseUser; 
        private String dbaId; 
        private Integer ddlOnline; 
        private String ecsInstanceId; 
        private String ecsRegion; 
        private String enableSellSitd; 
        private String envType; 
        private Integer exportTimeout; 
        private String host; 
        private String instanceAlias; 
        private String instanceId; 
        private String instanceSource; 
        private String instanceType; 
        private Integer port; 
        private Integer queryTimeout; 
        private String safeRuleId; 
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

        private Builder(UpdateInstanceRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.dataLinkName = request.dataLinkName;
            this.databasePassword = request.databasePassword;
            this.databaseUser = request.databaseUser;
            this.dbaId = request.dbaId;
            this.ddlOnline = request.ddlOnline;
            this.ecsInstanceId = request.ecsInstanceId;
            this.ecsRegion = request.ecsRegion;
            this.enableSellSitd = request.enableSellSitd;
            this.envType = request.envType;
            this.exportTimeout = request.exportTimeout;
            this.host = request.host;
            this.instanceAlias = request.instanceAlias;
            this.instanceId = request.instanceId;
            this.instanceSource = request.instanceSource;
            this.instanceType = request.instanceType;
            this.port = request.port;
            this.queryTimeout = request.queryTimeout;
            this.safeRuleId = request.safeRuleId;
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
         * The name of the data link for cross-database query.
         * <p>
         * 
         * > 
         * *   This parameter is required if the UseDsql parameter is set to 1.
         * *   The name can contain only lowercase letters and underscores (\_).
         * *   The name must be unique within a tenant.
         */
        public Builder dataLinkName(String dataLinkName) {
            this.putQueryParameter("DataLinkName", dataLinkName);
            this.dataLinkName = dataLinkName;
            return this;
        }

        /**
         * The password that is used to log on to the database.
         */
        public Builder databasePassword(String databasePassword) {
            this.putQueryParameter("DatabasePassword", databasePassword);
            this.databasePassword = databasePassword;
            return this;
        }

        /**
         * The account that is used to log on to the database.
         */
        public Builder databaseUser(String databaseUser) {
            this.putQueryParameter("DatabaseUser", databaseUser);
            this.databaseUser = databaseUser;
            return this;
        }

        /**
         * The ID of the user who assumes the DBA role of the database instance. You can call the [ListUsers](~~141938~~) or [GetInstance](~~141567~~) operation to obtain the user ID.
         */
        public Builder dbaId(String dbaId) {
            this.putQueryParameter("DbaId", dbaId);
            this.dbaId = dbaId;
            return this;
        }

        /**
         * Specifies whether to enable the lock-free schema change feature for the database instance. Valid values:
         * <p>
         * 
         * *   0: The feature is disabled.
         * *   1: The native online DDL feature takes precedence.
         * *   2: The lock-free schema change feature of DMS takes precedence.
         */
        public Builder ddlOnline(Integer ddlOnline) {
            this.putQueryParameter("DdlOnline", ddlOnline);
            this.ddlOnline = ddlOnline;
            return this;
        }

        /**
         * The ID of the ECS instance.
         * <p>
         * 
         * >  This parameter is required if the InstanceSource parameter is set to ECS_OWN.
         */
        public Builder ecsInstanceId(String ecsInstanceId) {
            this.putQueryParameter("EcsInstanceId", ecsInstanceId);
            this.ecsInstanceId = ecsInstanceId;
            return this;
        }

        /**
         * The ID of the region in which the database instance resides.
         * <p>
         * 
         * >  This parameter is required if the InstanceSource parameter is set to RDS, ECS_OWN, or VPC_IDC.
         */
        public Builder ecsRegion(String ecsRegion) {
            this.putQueryParameter("EcsRegion", ecsRegion);
            this.ecsRegion = ecsRegion;
            return this;
        }

        /**
         * - Y：开启敏感数据保护
         * <p>
         * - N：关闭敏感数据保护
         * - 为NULL或其它：不更新敏感数据保护的状态（保持原始的开启或关闭状态）
         */
        public Builder enableSellSitd(String enableSellSitd) {
            this.putQueryParameter("EnableSellSitd", enableSellSitd);
            this.enableSellSitd = enableSellSitd;
            return this;
        }

        /**
         * The type of the environment to which the database instance belongs. Valid values:
         * <p>
         * 
         * *   **product**: production environment
         * *   **dev**: development environment
         * *   **pre**: staging environment
         * *   **test**: test environment
         * *   **sit**: system integration testing (SIT) environment
         * *   **uat**: user acceptance testing (UAT) environment
         * *   **pet**: stress testing environment
         * *   **stag**: STAG environment
         */
        public Builder envType(String envType) {
            this.putQueryParameter("EnvType", envType);
            this.envType = envType;
            return this;
        }

        /**
         * The timeout period for exporting data from the database instance.
         */
        public Builder exportTimeout(Integer exportTimeout) {
            this.putQueryParameter("ExportTimeout", exportTimeout);
            this.exportTimeout = exportTimeout;
            return this;
        }

        /**
         * The host address that is used to connect to the database instance.
         */
        public Builder host(String host) {
            this.putQueryParameter("Host", host);
            this.host = host;
            return this;
        }

        /**
         * The alias of the database instance. Specify an alias that can help you identify the database instance in DMS.
         */
        public Builder instanceAlias(String instanceAlias) {
            this.putQueryParameter("InstanceAlias", instanceAlias);
            this.instanceAlias = instanceAlias;
            return this;
        }

        /**
         * The ID of the database instance. You can call the [GetInstance](~~141567~~) operation to obtain the instance ID.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The source of the database instance. Valid values:
         * <p>
         * 
         * *   **PUBLIC_OWN**: a self-managed database instance that is deployed on the Internet
         * *   **RDS**: an ApsaraDB RDS instance
         * *   **ECS_OWN**: a self-managed database that is deployed on an Elastic Compute Service (ECS) instance
         * *   **VPC_IDC**: a self-managed database instance that is deployed in a data center connected over a virtual private cloud (VPC)
         */
        public Builder instanceSource(String instanceSource) {
            this.putQueryParameter("InstanceSource", instanceSource);
            this.instanceSource = instanceSource;
            return this;
        }

        /**
         * The type of the database. For more information about the valid values of this parameter, see [DbType parameter](~~198106~~).
         */
        public Builder instanceType(String instanceType) {
            this.putQueryParameter("InstanceType", instanceType);
            this.instanceType = instanceType;
            return this;
        }

        /**
         * The port number that is used to connect to the database instance.
         */
        public Builder port(Integer port) {
            this.putQueryParameter("Port", port);
            this.port = port;
            return this;
        }

        /**
         * The timeout period for querying data in the database instance.
         */
        public Builder queryTimeout(Integer queryTimeout) {
            this.putQueryParameter("QueryTimeout", queryTimeout);
            this.queryTimeout = queryTimeout;
            return this;
        }

        /**
         * The ID of the security rule set for the instance. You can call the [ListStandardGroups](~~417891~~) or [GetInstance](~~141567~~) operation to obtain the name of the security rule set that you want to use.
         */
        public Builder safeRuleId(String safeRuleId) {
            this.putQueryParameter("SafeRuleId", safeRuleId);
            this.safeRuleId = safeRuleId;
            return this;
        }

        /**
         * The system ID (SID) of the database instance.
         * <p>
         * 
         * >  This parameter is required if the InstanceType parameter is set to ORACLE.
         */
        public Builder sid(String sid) {
            this.putQueryParameter("Sid", sid);
            this.sid = sid;
            return this;
        }

        /**
         * Specifies whether to skip connectivity test. Valid values:
         * <p>
         * 
         * *   **true**: The connectivity test is skipped.
         * *   **false**: The connectivity test is not skipped.
         */
        public Builder skipTest(Boolean skipTest) {
            this.putQueryParameter("SkipTest", skipTest);
            this.skipTest = skipTest;
            return this;
        }

        /**
         * 更新分类分级模板ID，可从ListClassificationTemplates获取
         */
        public Builder templateId(Long templateId) {
            this.putQueryParameter("TemplateId", templateId);
            this.templateId = templateId;
            return this;
        }

        /**
         * 更新分类分级模板类型，可从ListClassificationTemplates获取
         */
        public Builder templateType(String templateType) {
            this.putQueryParameter("TemplateType", templateType);
            this.templateType = templateType;
            return this;
        }

        /**
         * The ID of the tenant. You can call the [GetUserActiveTenant](~~198073~~) operation to obtain the tenant ID.
         */
        public Builder tid(Long tid) {
            this.putQueryParameter("Tid", tid);
            this.tid = tid;
            return this;
        }

        /**
         * Specifies whether to enable the cross-database query feature for the database instance. Valid values:
         * <p>
         * 
         * *   0: The feature is disabled.
         * *   1: The feature is enabled.
         * 
         * >  Supported database types: MySQL, SQL Server, PostgreSQL, PolarDB for Oracle, and ApsaraDB for Redis.
         */
        public Builder useDsql(Integer useDsql) {
            this.putQueryParameter("UseDsql", useDsql);
            this.useDsql = useDsql;
            return this;
        }

        /**
         * The ID of the VPC.
         * <p>
         * 
         * >  This parameter is required if the InstanceSource parameter is set to VPC_IDC.
         */
        public Builder vpcId(String vpcId) {
            this.putQueryParameter("VpcId", vpcId);
            this.vpcId = vpcId;
            return this;
        }

        @Override
        public UpdateInstanceRequest build() {
            return new UpdateInstanceRequest(this);
        } 

    } 

}
