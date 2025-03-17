// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

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
 * {@link RegisterInstanceRequest} extends {@link RequestModel}
 *
 * <p>RegisterInstanceRequest</p>
 */
public class RegisterInstanceRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DataLinkName")
    private String dataLinkName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DatabasePassword")
    @com.aliyun.core.annotation.Validation(required = true)
    private String databasePassword;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DatabaseUser")
    @com.aliyun.core.annotation.Validation(required = true)
    private String databaseUser;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DbaUid")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long dbaUid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DbaUidByString")
    private String dbaUidByString;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DdlOnline")
    private Integer ddlOnline;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EcsInstanceId")
    private String ecsInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EcsRegion")
    private String ecsRegion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnableSellSitd")
    private String enableSellSitd;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnvType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String envType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExportTimeout")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer exportTimeout;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Host")
    @com.aliyun.core.annotation.Validation(required = true)
    private String host;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceAlias")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceAlias;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceSource")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceSource;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NetworkType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String networkType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Port")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer port;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QueryTimeout")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer queryTimeout;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SafeRule")
    @com.aliyun.core.annotation.Validation(required = true)
    private String safeRule;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Sid")
    private String sid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SkipTest")
    private Boolean skipTest;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateId")
    private Long templateId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateType")
    private String templateType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tid")
    private Long tid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UseDsql")
    private Integer useDsql;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VpcId")
    private String vpcId;

    private RegisterInstanceRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.dataLinkName = builder.dataLinkName;
        this.databasePassword = builder.databasePassword;
        this.databaseUser = builder.databaseUser;
        this.dbaUid = builder.dbaUid;
        this.dbaUidByString = builder.dbaUidByString;
        this.ddlOnline = builder.ddlOnline;
        this.ecsInstanceId = builder.ecsInstanceId;
        this.ecsRegion = builder.ecsRegion;
        this.enableSellSitd = builder.enableSellSitd;
        this.envType = builder.envType;
        this.exportTimeout = builder.exportTimeout;
        this.host = builder.host;
        this.instanceAlias = builder.instanceAlias;
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

    public static RegisterInstanceRequest create() {
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
     * @return dbaUid
     */
    public Long getDbaUid() {
        return this.dbaUid;
    }

    /**
     * @return dbaUidByString
     */
    public String getDbaUidByString() {
        return this.dbaUidByString;
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

    public static final class Builder extends Request.Builder<RegisterInstanceRequest, Builder> {
        private String regionId; 
        private String dataLinkName; 
        private String databasePassword; 
        private String databaseUser; 
        private Long dbaUid; 
        private String dbaUidByString; 
        private Integer ddlOnline; 
        private String ecsInstanceId; 
        private String ecsRegion; 
        private String enableSellSitd; 
        private String envType; 
        private Integer exportTimeout; 
        private String host; 
        private String instanceAlias; 
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

        private Builder(RegisterInstanceRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.dataLinkName = request.dataLinkName;
            this.databasePassword = request.databasePassword;
            this.databaseUser = request.databaseUser;
            this.dbaUid = request.dbaUid;
            this.dbaUidByString = request.dbaUidByString;
            this.ddlOnline = request.ddlOnline;
            this.ecsInstanceId = request.ecsInstanceId;
            this.ecsRegion = request.ecsRegion;
            this.enableSellSitd = request.enableSellSitd;
            this.envType = request.envType;
            this.exportTimeout = request.exportTimeout;
            this.host = request.host;
            this.instanceAlias = request.instanceAlias;
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
         * <p>The name of the database link for cross-database queries.</p>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li><p>This parameter is required if UseDsql is set to 1.</p>
         * </li>
         * <li><p>The name can contain only lowercase letters and underscores (_).</p>
         * </li>
         * <li><p>The name must be unique within a tenant.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>dblink_test</p>
         */
        public Builder dataLinkName(String dataLinkName) {
            this.putQueryParameter("DataLinkName", dataLinkName);
            this.dataLinkName = dataLinkName;
            return this;
        }

        /**
         * <p>The password that is used to log on to the database.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        public Builder databasePassword(String databasePassword) {
            this.putQueryParameter("DatabasePassword", databasePassword);
            this.databasePassword = databasePassword;
            return this;
        }

        /**
         * <p>The account that is used to log on to the database.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>dmstest</p>
         */
        public Builder databaseUser(String databaseUser) {
            this.putQueryParameter("DatabaseUser", databaseUser);
            this.databaseUser = databaseUser;
            return this;
        }

        /**
         * <p>The ID of the user who assumes the DBA role of the database instance. You can call the <a href="https://help.aliyun.com/document_detail/141938.html">ListUsers</a> or <a href="https://help.aliyun.com/document_detail/141567.html">GetInstance</a> operation to query the user ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>22275482072787****</p>
         */
        public Builder dbaUid(Long dbaUid) {
            this.putQueryParameter("DbaUid", dbaUid);
            this.dbaUid = dbaUid;
            return this;
        }

        /**
         * <p>The ID of the user who assumes the DBA role of the database instance. If the user ID is a non-numeric value such as a role or an account, you can use this parameter to replace DbaUid.</p>
         * 
         * <strong>example:</strong>
         * <p>22275482072787****</p>
         */
        public Builder dbaUidByString(String dbaUidByString) {
            this.putQueryParameter("DbaUidByString", dbaUidByString);
            this.dbaUidByString = dbaUidByString;
            return this;
        }

        /**
         * <p>Specifies whether to enable the lock-free schema change feature for the database instance. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: disables the lock-free schema change feature.</li>
         * <li><strong>1</strong>: uses the online DDL of MySQL first.</li>
         * <li><strong>2</strong>: uses the lock-free schema change feature of DMS first.</li>
         * </ul>
         * <blockquote>
         * <p>Supported database types: ApsaraDB RDS for MySQL, PolarDB for MySQL, ApsaraDB MyBase for MySQL, and third-party MySQL databases.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder ddlOnline(Integer ddlOnline) {
            this.putQueryParameter("DdlOnline", ddlOnline);
            this.ddlOnline = ddlOnline;
            return this;
        }

        /**
         * <p>The ID of the ECS instance on which the database instance is deployed.</p>
         * <blockquote>
         * <p>This parameter is required if the InstanceSource parameter is set to ECS_OWN.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>i-2zei9gs1t7h8l7ac****</p>
         */
        public Builder ecsInstanceId(String ecsInstanceId) {
            this.putQueryParameter("EcsInstanceId", ecsInstanceId);
            this.ecsInstanceId = ecsInstanceId;
            return this;
        }

        /**
         * <p>The ID of the region in which the database instance resides.</p>
         * <blockquote>
         * <p>This parameter is required if the InstanceSource parameter is set to RDS, ECS_OWN, or VPC_IDC.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder ecsRegion(String ecsRegion) {
            this.putQueryParameter("EcsRegion", ecsRegion);
            this.ecsRegion = ecsRegion;
            return this;
        }

        /**
         * <ul>
         * <li><strong>Y:</strong> enables the sensitive data protection feature</li>
         * <li><strong>NULL or other:</strong> disables the sensitive data protection feature</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Y</p>
         */
        public Builder enableSellSitd(String enableSellSitd) {
            this.putQueryParameter("EnableSellSitd", enableSellSitd);
            this.enableSellSitd = enableSellSitd;
            return this;
        }

        /**
         * <p>The type of the environment in which the database instance is deployed. Valid values:</p>
         * <ul>
         * <li>product: production environment</li>
         * <li>dev: development environment</li>
         * <li>pre: pre-release environment</li>
         * <li>test: test environment</li>
         * <li>sit: system integration testing (SIT) environment</li>
         * <li>uat: user acceptance testing (UAT) environment</li>
         * <li>pet: stress testing environment</li>
         * <li>stag: staging environment</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>product</p>
         */
        public Builder envType(String envType) {
            this.putQueryParameter("EnvType", envType);
            this.envType = envType;
            return this;
        }

        /**
         * <p>The timeout period for exporting data from the database instance. Unit: seconds.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>600</p>
         */
        public Builder exportTimeout(Integer exportTimeout) {
            this.putQueryParameter("ExportTimeout", exportTimeout);
            this.exportTimeout = exportTimeout;
            return this;
        }

        /**
         * <p>The host address that is used to connect to the database instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>172.XX.XXX.254</p>
         */
        public Builder host(String host) {
            this.putQueryParameter("Host", host);
            this.host = host;
            return this;
        }

        /**
         * <p>The alias of the database instance. Specify an alias that can help you identify the database instance in DMS.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Test instance</p>
         */
        public Builder instanceAlias(String instanceAlias) {
            this.putQueryParameter("InstanceAlias", instanceAlias);
            this.instanceAlias = instanceAlias;
            return this;
        }

        /**
         * <p>The source of the database instance. Valid values:</p>
         * <ul>
         * <li><strong>PUBLIC_OWN:</strong> a self-managed database instance that is deployed on the Internet</li>
         * <li><strong>RDS:</strong> an ApsaraDB RDS instance</li>
         * <li><strong>ECS_OWN:</strong> a self-managed database that is deployed on an Elastic Compute Service (ECS) instance</li>
         * <li><strong>VPC_IDC:</strong> a self-managed database instance that is deployed in a data center connected over a virtual private cloud (VPC)</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>RDS</p>
         */
        public Builder instanceSource(String instanceSource) {
            this.putQueryParameter("InstanceSource", instanceSource);
            this.instanceSource = instanceSource;
            return this;
        }

        /**
         * <p>The type of the database. For more information about the valid values of this parameter, see <a href="https://help.aliyun.com/document_detail/198106.html">DbType parameter</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>MySQL</p>
         */
        public Builder instanceType(String instanceType) {
            this.putQueryParameter("InstanceType", instanceType);
            this.instanceType = instanceType;
            return this;
        }

        /**
         * <p>The network type of the database instance. Valid values:</p>
         * <ul>
         * <li><strong>CLASSIC:</strong> classic network</li>
         * <li><strong>VPC:</strong> VPC</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>VPC</p>
         */
        public Builder networkType(String networkType) {
            this.putQueryParameter("NetworkType", networkType);
            this.networkType = networkType;
            return this;
        }

        /**
         * <p>The port that is used to connect to the database instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>3306</p>
         */
        public Builder port(Integer port) {
            this.putQueryParameter("Port", port);
            this.port = port;
            return this;
        }

        /**
         * <p>The timeout period for querying data in the database instance. Unit: seconds.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        public Builder queryTimeout(Integer queryTimeout) {
            this.putQueryParameter("QueryTimeout", queryTimeout);
            this.queryTimeout = queryTimeout;
            return this;
        }

        /**
         * <p>The name of the security rule set (GroupName) for the database instance. You can call the <a href="https://help.aliyun.com/document_detail/417891.html">ListStandardGroups</a> or <a href="https://help.aliyun.com/document_detail/141567.html">GetInstance</a> operation to query the name of the security rule set.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Test</p>
         */
        public Builder safeRule(String safeRule) {
            this.putQueryParameter("SafeRule", safeRule);
            this.safeRule = safeRule;
            return this;
        }

        /**
         * <p>The system ID (SID) of the database.</p>
         * <blockquote>
         * <p>This parameter is required if the InstanceType parameter is set to ORACLE.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>XXX</p>
         */
        public Builder sid(String sid) {
            this.putQueryParameter("Sid", sid);
            this.sid = sid;
            return this;
        }

        /**
         * <p>Specifies whether to skip the connectivity test. Valid values:</p>
         * <ul>
         * <li><strong>true:</strong> skips the connectivity test</li>
         * <li><strong>false:</strong> does not skip the connectivity test</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder skipTest(Boolean skipTest) {
            this.putQueryParameter("SkipTest", skipTest);
            this.skipTest = skipTest;
            return this;
        }

        /**
         * <p>The ID of the classification template. You can call the <a href="https://help.aliyun.com/document_detail/460613.html">ListClassificationTemplates</a> operation to query the template ID.</p>
         * 
         * <strong>example:</strong>
         * <p>31***</p>
         */
        public Builder templateId(Long templateId) {
            this.putQueryParameter("TemplateId", templateId);
            this.templateId = templateId;
            return this;
        }

        /**
         * <p>The type of the classification template. You can call the <a href="https://help.aliyun.com/document_detail/460613.html">ListClassificationTemplates</a> operation to query the template type.</p>
         * 
         * <strong>example:</strong>
         * <p>INNER</p>
         */
        public Builder templateType(String templateType) {
            this.putQueryParameter("TemplateType", templateType);
            this.templateType = templateType;
            return this;
        }

        /**
         * <p>The ID of the tenant. You can call the <a href="https://help.aliyun.com/document_detail/198073.html">GetUserActiveTenant</a> operation to query the tenant ID.</p>
         * 
         * <strong>example:</strong>
         * <p>3***</p>
         */
        public Builder tid(Long tid) {
            this.putQueryParameter("Tid", tid);
            this.tid = tid;
            return this;
        }

        /**
         * <p>Specifies whether to enable the cross-database query feature for the database instance. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: disables the cross-database query feature.</li>
         * <li><strong>1</strong>: enables the cross-database query feature.</li>
         * </ul>
         * <blockquote>
         * <p>Supported database types: MySQL, SQL Server, PostgreSQL, PolarDB for PostgreSQL (compatible with Oracle), and ApsaraDB for Redis.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder useDsql(Integer useDsql) {
            this.putQueryParameter("UseDsql", useDsql);
            this.useDsql = useDsql;
            return this;
        }

        /**
         * <p>The ID of the VPC to which the database instance belongs.</p>
         * <blockquote>
         * <p>This parameter is required if the InstanceSource parameter is set to VPC_IDC.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>vpc-xxxxxxxxxxxxxxxxxxxxx</p>
         */
        public Builder vpcId(String vpcId) {
            this.putQueryParameter("VpcId", vpcId);
            this.vpcId = vpcId;
            return this;
        }

        @Override
        public RegisterInstanceRequest build() {
            return new RegisterInstanceRequest(this);
        } 

    } 

}
