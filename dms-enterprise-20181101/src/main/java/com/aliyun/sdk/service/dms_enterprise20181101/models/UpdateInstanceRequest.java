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

    @Host
    @NameInMap("RegionId")
    private String regionId;

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
        this.dataLinkName = builder.dataLinkName;
        this.databasePassword = builder.databasePassword;
        this.databaseUser = builder.databaseUser;
        this.dbaId = builder.dbaId;
        this.ddlOnline = builder.ddlOnline;
        this.ecsInstanceId = builder.ecsInstanceId;
        this.ecsRegion = builder.ecsRegion;
        this.envType = builder.envType;
        this.exportTimeout = builder.exportTimeout;
        this.host = builder.host;
        this.instanceAlias = builder.instanceAlias;
        this.instanceId = builder.instanceId;
        this.instanceSource = builder.instanceSource;
        this.instanceType = builder.instanceType;
        this.port = builder.port;
        this.queryTimeout = builder.queryTimeout;
        this.regionId = builder.regionId;
        this.safeRuleId = builder.safeRuleId;
        this.sid = builder.sid;
        this.skipTest = builder.skipTest;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
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
        private String dataLinkName; 
        private String databasePassword; 
        private String databaseUser; 
        private String dbaId; 
        private Integer ddlOnline; 
        private String ecsInstanceId; 
        private String ecsRegion; 
        private String envType; 
        private Integer exportTimeout; 
        private String host; 
        private String instanceAlias; 
        private String instanceId; 
        private String instanceSource; 
        private String instanceType; 
        private Integer port; 
        private Integer queryTimeout; 
        private String regionId; 
        private String safeRuleId; 
        private String sid; 
        private Boolean skipTest; 
        private Long tid; 
        private Integer useDsql; 
        private String vpcId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateInstanceRequest response) {
            super(response);
            this.dataLinkName = response.dataLinkName;
            this.databasePassword = response.databasePassword;
            this.databaseUser = response.databaseUser;
            this.dbaId = response.dbaId;
            this.ddlOnline = response.ddlOnline;
            this.ecsInstanceId = response.ecsInstanceId;
            this.ecsRegion = response.ecsRegion;
            this.envType = response.envType;
            this.exportTimeout = response.exportTimeout;
            this.host = response.host;
            this.instanceAlias = response.instanceAlias;
            this.instanceId = response.instanceId;
            this.instanceSource = response.instanceSource;
            this.instanceType = response.instanceType;
            this.port = response.port;
            this.queryTimeout = response.queryTimeout;
            this.regionId = response.regionId;
            this.safeRuleId = response.safeRuleId;
            this.sid = response.sid;
            this.skipTest = response.skipTest;
            this.tid = response.tid;
            this.useDsql = response.useDsql;
            this.vpcId = response.vpcId;
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
        public Builder dbaId(String dbaId) {
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
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * SafeRuleId.
         */
        public Builder safeRuleId(String safeRuleId) {
            this.putQueryParameter("SafeRuleId", safeRuleId);
            this.safeRuleId = safeRuleId;
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
        public UpdateInstanceRequest build() {
            return new UpdateInstanceRequest(this);
        } 

    } 

}
