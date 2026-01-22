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
 * {@link AddInstanceRequest} extends {@link RequestModel}
 *
 * <p>AddInstanceRequest</p>
 */
public class AddInstanceRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("DbaId")
    private Long dbaId;

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
    @com.aliyun.core.annotation.NameInMap("EnableSellCommon")
    private String enableSellCommon;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnableSellSitd")
    private String enableSellSitd;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnableSellStable")
    private String enableSellStable;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnableSellTrust")
    @com.aliyun.core.annotation.Validation(required = true)
    private String enableSellTrust;

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
    @com.aliyun.core.annotation.NameInMap("RoleArn")
    private String roleArn;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SafeRule")
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
    @com.aliyun.core.annotation.NameInMap("UseSsl")
    @com.aliyun.core.annotation.Validation(maximum = 1)
    private Integer useSsl;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VpcId")
    private String vpcId;

    private AddInstanceRequest(Builder builder) {
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
        this.instanceSource = builder.instanceSource;
        this.instanceType = builder.instanceType;
        this.networkType = builder.networkType;
        this.port = builder.port;
        this.queryTimeout = builder.queryTimeout;
        this.roleArn = builder.roleArn;
        this.safeRule = builder.safeRule;
        this.sid = builder.sid;
        this.skipTest = builder.skipTest;
        this.templateId = builder.templateId;
        this.templateType = builder.templateType;
        this.tid = builder.tid;
        this.useDsql = builder.useDsql;
        this.useSsl = builder.useSsl;
        this.vpcId = builder.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddInstanceRequest create() {
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
     * @return roleArn
     */
    public String getRoleArn() {
        return this.roleArn;
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
     * @return useSsl
     */
    public Integer getUseSsl() {
        return this.useSsl;
    }

    /**
     * @return vpcId
     */
    public String getVpcId() {
        return this.vpcId;
    }

    public static final class Builder extends Request.Builder<AddInstanceRequest, Builder> {
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
        private String instanceSource; 
        private String instanceType; 
        private String networkType; 
        private Integer port; 
        private Integer queryTimeout; 
        private String roleArn; 
        private String safeRule; 
        private String sid; 
        private Boolean skipTest; 
        private Long templateId; 
        private String templateType; 
        private Long tid; 
        private Integer useDsql; 
        private Integer useSsl; 
        private String vpcId; 

        private Builder() {
            super();
        } 

        private Builder(AddInstanceRequest request) {
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
            this.instanceSource = request.instanceSource;
            this.instanceType = request.instanceType;
            this.networkType = request.networkType;
            this.port = request.port;
            this.queryTimeout = request.queryTimeout;
            this.roleArn = request.roleArn;
            this.safeRule = request.safeRule;
            this.sid = request.sid;
            this.skipTest = request.skipTest;
            this.templateId = request.templateId;
            this.templateType = request.templateType;
            this.tid = request.tid;
            this.useDsql = request.useDsql;
            this.useSsl = request.useSsl;
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
         * <li><p>This property must be specified when UseDsql is set to 1.</p>
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
         * <p>The password of the database account.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test***</p>
         */
        public Builder databasePassword(String databasePassword) {
            this.putQueryParameter("DatabasePassword", databasePassword);
            this.databasePassword = databasePassword;
            return this;
        }

        /**
         * <p>The name of the database account.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>testsdb</p>
         */
        public Builder databaseUser(String databaseUser) {
            this.putQueryParameter("DatabaseUser", databaseUser);
            this.databaseUser = databaseUser;
            return this;
        }

        /**
         * <p>The ID of the user who assumes the database administrator (DBA) role. You can call the <a href="https://help.aliyun.com/document_detail/141938.html">ListUsers</a> or <a href="https://help.aliyun.com/document_detail/141567.html">GetInstance</a> operation to obtain the value of this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>27****</p>
         */
        public Builder dbaId(Long dbaId) {
            this.putQueryParameter("DbaId", dbaId);
            this.dbaId = dbaId;
            return this;
        }

        /**
         * <p>Specifies whether to enable Lock-free Schema Change. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: does not enable lock-free schema change.</li>
         * <li><strong>1</strong>: uses the native online DDL operations of MySQL first.</li>
         * <li><strong>2:</strong> uses lock-free schema change first.</li>
         * </ul>
         * <blockquote>
         * <p>Supported databases include ApsaraDB RDS for MySQL, PolarDB for MySQL, ApsaraDB MyBase for MySQL, and third-party MySQL databases.</p>
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
         * <p>The ID of the instance. If your instance is a database instance connected by using a database gateway, specify the gateway ID for this parameter.</p>
         * <blockquote>
         * <p>This parameter is required if InstanceSource is set to ECS_OWN or GATEWAY.</p>
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
         * <p>The region in which the ECS instance resides.</p>
         * <blockquote>
         * <p>This parameter is required if InstanceSource is set to RDS, ECS_OWN, GATEWAY, or VPC_IDC.</p>
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
         * <p>Specifies whether to enable Security Collaboration for the database instance. Valid values:</p>
         * <ul>
         * <li>Y: enables Security Collaboration.</li>
         * <li>N: disables Security Collaboration.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Y</p>
         */
        public Builder enableSellCommon(String enableSellCommon) {
            this.putQueryParameter("EnableSellCommon", enableSellCommon);
            this.enableSellCommon = enableSellCommon;
            return this;
        }

        /**
         * <p>Specifies whether to enable sensitive data protection. Valid values:</p>
         * <ul>
         * <li>Y: enables the sensitive data protection feature for the database instance.</li>
         * <li>N: disables the sensitive data protection feature for the database instance.</li>
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
         * <p>Specifies whether to enable Stable Change for the database instance. Valid values:</p>
         * <ul>
         * <li>Y: Enables Stable Change.</li>
         * <li>N: Disables Stable Change.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NULL</p>
         */
        public Builder enableSellStable(String enableSellStable) {
            this.putQueryParameter("EnableSellStable", enableSellStable);
            this.enableSellStable = enableSellStable;
            return this;
        }

        /**
         * <p>Specifies whether to enable the security hosting feature for the database instance. Valid values:</p>
         * <ul>
         * <li>Y: enables the security hosting feature for the database instance.</li>
         * <li>N: disables the security hosting feature for the database instance.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Y</p>
         */
        public Builder enableSellTrust(String enableSellTrust) {
            this.putQueryParameter("EnableSellTrust", enableSellTrust);
            this.enableSellTrust = enableSellTrust;
            return this;
        }

        /**
         * <p>The type of the environment to which the database instance belongs. Valid values:</p>
         * <ul>
         * <li><strong>product:</strong> the production environment.</li>
         * <li><strong>dev</strong>: development environment.</li>
         * <li><strong>pre</strong>: pre-release environment.</li>
         * <li><strong>test</strong>: test environment.</li>
         * <li><strong>sit</strong>: system integration testing (SIT) environment.</li>
         * <li><strong>uat</strong>: user acceptance testing (UAT) environment.</li>
         * <li><strong>pet</strong>: stress testing environment.</li>
         * <li><strong>stag</strong>: staging environment.</li>
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
         * <p>86400</p>
         */
        public Builder exportTimeout(Integer exportTimeout) {
            this.putQueryParameter("ExportTimeout", exportTimeout);
            this.exportTimeout = exportTimeout;
            return this;
        }

        /**
         * <p>The endpoint that is used to connect to the database.</p>
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
         */
        public Builder instanceAlias(String instanceAlias) {
            this.putQueryParameter("InstanceAlias", instanceAlias);
            this.instanceAlias = instanceAlias;
            return this;
        }

        /**
         * <p>The source of the database instance. Valid values:</p>
         * <ul>
         * <li><strong>PUBLIC_OWN</strong>: a self-managed database instance that is deployed on the Internet.</li>
         * <li><strong>RDS</strong>: an ApsaraDB RDS instance.</li>
         * <li><strong>ECS_OWN</strong>: a self-managed database instance that is deployed on an Elastic Compute Service (ECS) instance.</li>
         * <li><strong>VPC_IDC</strong>: a self-managed database instance that is deployed in a data center connected over a virtual private cloud (VPC).</li>
         * <li><strong>GATEWAY</strong>: a database instance connected by using a database gateway.</li>
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
         * <p>The type of the database instance. For more information about the valid values of this parameter, see <a href="https://help.aliyun.com/document_detail/198106.html">DbType parameter</a>.</p>
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
         * <p>The network type. Valid values:</p>
         * <ul>
         * <li><strong>CLASSIC:</strong> the classic network.</li>
         * <li><strong>VPC</strong></li>
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
         * <p>The port that is used to connect to the database.</p>
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
         * <p>The timeout period for querying data from the database instance. Unit: seconds.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>7200</p>
         */
        public Builder queryTimeout(Integer queryTimeout) {
            this.putQueryParameter("QueryTimeout", queryTimeout);
            this.queryTimeout = queryTimeout;
            return this;
        }

        /**
         * RoleArn.
         */
        public Builder roleArn(String roleArn) {
            this.putQueryParameter("RoleArn", roleArn);
            this.roleArn = roleArn;
            return this;
        }

        /**
         * <p>The name of the security rule set for the database instance. This parameter is required if Security Collaboration is enabled. You can call the<a href="https://help.aliyun.com/document_detail/465940.html">ListStandardGroups</a> or <a href="https://help.aliyun.com/document_detail/465826.html">GetInstance</a> operation to obtain the name of the security rule set from GroupName.</p>
         */
        public Builder safeRule(String safeRule) {
            this.putQueryParameter("SafeRule", safeRule);
            this.safeRule = safeRule;
            return this;
        }

        /**
         * <p>The system ID (SID) of the database instance.</p>
         * <blockquote>
         * <p>This parameter is required if InstanceType is set to ORACLE.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>testSid</p>
         */
        public Builder sid(String sid) {
            this.putQueryParameter("Sid", sid);
            this.sid = sid;
            return this;
        }

        /**
         * <p>Specifies whether to skip the connectivity test. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder skipTest(Boolean skipTest) {
            this.putQueryParameter("SkipTest", skipTest);
            this.skipTest = skipTest;
            return this;
        }

        /**
         * <p>The ID of the classification and grading template. You can call the <a href="https://help.aliyun.com/document_detail/465947.html">ListClassificationTemplates</a> operation to query the template ID.</p>
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
         * <p>The type of the classification and grading template. You can call the <a href="https://help.aliyun.com/document_detail/465947.html">ListClassificationTemplates</a> operation to query the template type.</p>
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
         * <p>The ID of the tenant.</p>
         * <blockquote>
         * <p>You can move the pointer over the profile picture in the upper-right corner of the DMS console to obtain the tenant ID.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>23****</p>
         */
        public Builder tid(Long tid) {
            this.putQueryParameter("Tid", tid);
            this.tid = tid;
            return this;
        }

        /**
         * <p>Specifies whether to enable cross-database query for the database instance. Valid values:</p>
         * <ul>
         * <li><strong>0: does not enable cross-database query.</strong></li>
         * <li><strong>1</strong>: enables cross-database query.</li>
         * </ul>
         * <blockquote>
         * <p>Supported databases include MySQL, SQL Server, PostgreSQL, PolarDB for Oracle, and Redis.</p>
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
         * <p>Specifies whether to allow Data Management Service (DMS) to connect to the database instance by using SSL connections. Before you use SSL connections, make sure that the SSL encryption feature is enabled for the database instance. Valid values:</p>
         * <ul>
         * <li><strong>0</strong> (default): DMS automatically checks whether self-negotiation is enabled for the database instance. DMS automatically checks whether the SSL encryption feature is enabled for the database instance. If the SSL encryption feature is enabled, DMS connects to the database instance by using SSL connections. Otherwise, DMS connects to the database instance without encryption.</li>
         * <li><strong>1</strong>: DMS connects to the database instance by using SSL connections. This value is invalid if the SSL encryption feature is disabled for the database instance.</li>
         * <li><strong>-1</strong>: DMS does not connect to the database instance by using SSL connections.</li>
         * </ul>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li><p>This parameter is available only for a MySQL or Redis database instance.</p>
         * </li>
         * <li><p>SSL encrypts network connections at the transport layer to improve the security and integrity of data in transmission. However, SSL increases the response time of network connections.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder useSsl(Integer useSsl) {
            this.putQueryParameter("UseSsl", useSsl);
            this.useSsl = useSsl;
            return this;
        }

        /**
         * <p>The ID of the instance connected over a VPC.</p>
         * <blockquote>
         * <p>This parameter is required if InstanceSource is set to VPC_IDC.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>vpc-2zef4o1hu7ljd****</p>
         */
        public Builder vpcId(String vpcId) {
            this.putQueryParameter("VpcId", vpcId);
            this.vpcId = vpcId;
            return this;
        }

        @Override
        public AddInstanceRequest build() {
            return new AddInstanceRequest(this);
        } 

    } 

}
