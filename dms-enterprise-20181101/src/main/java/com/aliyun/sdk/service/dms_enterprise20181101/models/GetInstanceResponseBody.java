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
 * {@link GetInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>GetInstanceResponseBody</p>
 */
public class GetInstanceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("Instance")
    private Instance instance;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetInstanceResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.instance = builder.instance;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetInstanceResponseBody create() {
        return builder().build();
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return instance
     */
    public Instance getInstance() {
        return this.instance;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String errorCode; 
        private String errorMessage; 
        private Instance instance; 
        private String requestId; 
        private Boolean success; 

        /**
         * <p>The error code that is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>UnknownError</p>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>The error message that is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>UnknownError</p>
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * <p>The details of the database instance.</p>
         */
        public Builder instance(Instance instance) {
            this.instance = instance;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>F6C80B69-3203-56AC-8021-18BA72A6F4E1</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The request was successful.</li>
         * <li><strong>false</strong>: The request failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetInstanceResponseBody build() {
            return new GetInstanceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>GetInstanceResponseBody</p>
     */
    public static class OwnerIdList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("OwnerIds")
        private java.util.List<String> ownerIds;

        private OwnerIdList(Builder builder) {
            this.ownerIds = builder.ownerIds;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OwnerIdList create() {
            return builder().build();
        }

        /**
         * @return ownerIds
         */
        public java.util.List<String> getOwnerIds() {
            return this.ownerIds;
        }

        public static final class Builder {
            private java.util.List<String> ownerIds; 

            /**
             * OwnerIds.
             */
            public Builder ownerIds(java.util.List<String> ownerIds) {
                this.ownerIds = ownerIds;
                return this;
            }

            public OwnerIdList build() {
                return new OwnerIdList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>GetInstanceResponseBody</p>
     */
    public static class OwnerNameList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("OwnerNames")
        private java.util.List<String> ownerNames;

        private OwnerNameList(Builder builder) {
            this.ownerNames = builder.ownerNames;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OwnerNameList create() {
            return builder().build();
        }

        /**
         * @return ownerNames
         */
        public java.util.List<String> getOwnerNames() {
            return this.ownerNames;
        }

        public static final class Builder {
            private java.util.List<String> ownerNames; 

            /**
             * OwnerNames.
             */
            public Builder ownerNames(java.util.List<String> ownerNames) {
                this.ownerNames = ownerNames;
                return this;
            }

            public OwnerNameList build() {
                return new OwnerNameList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>GetInstanceResponseBody</p>
     */
    public static class StandardGroup extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("GroupMode")
        private String groupMode;

        @com.aliyun.core.annotation.NameInMap("GroupName")
        private String groupName;

        private StandardGroup(Builder builder) {
            this.groupMode = builder.groupMode;
            this.groupName = builder.groupName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StandardGroup create() {
            return builder().build();
        }

        /**
         * @return groupMode
         */
        public String getGroupMode() {
            return this.groupMode;
        }

        /**
         * @return groupName
         */
        public String getGroupName() {
            return this.groupName;
        }

        public static final class Builder {
            private String groupMode; 
            private String groupName; 

            /**
             * <p>The type of the control mode. Valid values:</p>
             * <ul>
             * <li><strong>COMMON</strong>: Security Collaboration</li>
             * <li><strong>NONE_CONTROL</strong>: Flexible Management</li>
             * <li><strong>STABLE</strong>: Stable Change</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>NONE_CONTROL</p>
             */
            public Builder groupMode(String groupMode) {
                this.groupMode = groupMode;
                return this;
            }

            /**
             * <p>The name of the security rule set corresponding to the control mode.</p>
             * 
             * <strong>example:</strong>
             * <p>test group name</p>
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            public StandardGroup build() {
                return new StandardGroup(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>GetInstanceResponseBody</p>
     */
    public static class Instance extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DataLinkName")
        private String dataLinkName;

        @com.aliyun.core.annotation.NameInMap("DatabasePassword")
        private String databasePassword;

        @com.aliyun.core.annotation.NameInMap("DatabaseUser")
        private String databaseUser;

        @com.aliyun.core.annotation.NameInMap("DbaId")
        private String dbaId;

        @com.aliyun.core.annotation.NameInMap("DbaNickName")
        private String dbaNickName;

        @com.aliyun.core.annotation.NameInMap("DdlOnline")
        private Integer ddlOnline;

        @com.aliyun.core.annotation.NameInMap("EcsInstanceId")
        private String ecsInstanceId;

        @com.aliyun.core.annotation.NameInMap("EcsRegion")
        private String ecsRegion;

        @com.aliyun.core.annotation.NameInMap("EnvType")
        private String envType;

        @com.aliyun.core.annotation.NameInMap("ExportTimeout")
        private Integer exportTimeout;

        @com.aliyun.core.annotation.NameInMap("Host")
        private String host;

        @com.aliyun.core.annotation.NameInMap("InstanceAlias")
        private String instanceAlias;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("InstanceSource")
        private String instanceSource;

        @com.aliyun.core.annotation.NameInMap("InstanceType")
        private String instanceType;

        @com.aliyun.core.annotation.NameInMap("OwnerIdList")
        private OwnerIdList ownerIdList;

        @com.aliyun.core.annotation.NameInMap("OwnerNameList")
        private OwnerNameList ownerNameList;

        @com.aliyun.core.annotation.NameInMap("Port")
        private Integer port;

        @com.aliyun.core.annotation.NameInMap("QueryTimeout")
        private Integer queryTimeout;

        @com.aliyun.core.annotation.NameInMap("SafeRuleId")
        private String safeRuleId;

        @com.aliyun.core.annotation.NameInMap("SellSitd")
        private String sellSitd;

        @com.aliyun.core.annotation.NameInMap("Sid")
        private String sid;

        @com.aliyun.core.annotation.NameInMap("StandardGroup")
        private StandardGroup standardGroup;

        @com.aliyun.core.annotation.NameInMap("State")
        private String state;

        @com.aliyun.core.annotation.NameInMap("UseDsql")
        private Integer useDsql;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        private Instance(Builder builder) {
            this.dataLinkName = builder.dataLinkName;
            this.databasePassword = builder.databasePassword;
            this.databaseUser = builder.databaseUser;
            this.dbaId = builder.dbaId;
            this.dbaNickName = builder.dbaNickName;
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
            this.ownerIdList = builder.ownerIdList;
            this.ownerNameList = builder.ownerNameList;
            this.port = builder.port;
            this.queryTimeout = builder.queryTimeout;
            this.safeRuleId = builder.safeRuleId;
            this.sellSitd = builder.sellSitd;
            this.sid = builder.sid;
            this.standardGroup = builder.standardGroup;
            this.state = builder.state;
            this.useDsql = builder.useDsql;
            this.vpcId = builder.vpcId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Instance create() {
            return builder().build();
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
         * @return dbaNickName
         */
        public String getDbaNickName() {
            return this.dbaNickName;
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
         * @return ownerIdList
         */
        public OwnerIdList getOwnerIdList() {
            return this.ownerIdList;
        }

        /**
         * @return ownerNameList
         */
        public OwnerNameList getOwnerNameList() {
            return this.ownerNameList;
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
         * @return sellSitd
         */
        public String getSellSitd() {
            return this.sellSitd;
        }

        /**
         * @return sid
         */
        public String getSid() {
            return this.sid;
        }

        /**
         * @return standardGroup
         */
        public StandardGroup getStandardGroup() {
            return this.standardGroup;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
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

        public static final class Builder {
            private String dataLinkName; 
            private String databasePassword; 
            private String databaseUser; 
            private String dbaId; 
            private String dbaNickName; 
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
            private OwnerIdList ownerIdList; 
            private OwnerNameList ownerNameList; 
            private Integer port; 
            private Integer queryTimeout; 
            private String safeRuleId; 
            private String sellSitd; 
            private String sid; 
            private StandardGroup standardGroup; 
            private String state; 
            private Integer useDsql; 
            private String vpcId; 

            /**
             * <p>The name of the database link for the database instance.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder dataLinkName(String dataLinkName) {
                this.dataLinkName = dataLinkName;
                return this;
            }

            /**
             * <p>The password that is used to log on to the database.</p>
             * 
             * <strong>example:</strong>
             * <hr>
             */
            public Builder databasePassword(String databasePassword) {
                this.databasePassword = databasePassword;
                return this;
            }

            /**
             * <p>The account that is used to log on to the database instance.</p>
             * 
             * <strong>example:</strong>
             * <p>dbuser</p>
             */
            public Builder databaseUser(String databaseUser) {
                this.databaseUser = databaseUser;
                return this;
            }

            /**
             * <p>The ID of the database administrator (DBA) for the database instance.</p>
             * 
             * <strong>example:</strong>
             * <p>29****</p>
             */
            public Builder dbaId(String dbaId) {
                this.dbaId = dbaId;
                return this;
            }

            /**
             * <p>The nickname of the DBA for the database instance.</p>
             * 
             * <strong>example:</strong>
             * <p>dbaname</p>
             */
            public Builder dbaNickName(String dbaNickName) {
                this.dbaNickName = dbaNickName;
                return this;
            }

            /**
             * <p>Indicates whether the lock-free schema change feature is enabled for the database instance.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder ddlOnline(Integer ddlOnline) {
                this.ddlOnline = ddlOnline;
                return this;
            }

            /**
             * <p>The ID of the Elastic Compute Service (ECS) instance on which the database instance is deployed.</p>
             * 
             * <strong>example:</strong>
             * <p>i-bp124ldpklqz59y3****</p>
             */
            public Builder ecsInstanceId(String ecsInstanceId) {
                this.ecsInstanceId = ecsInstanceId;
                return this;
            }

            /**
             * <p>The ID of the region in which the database instance resides.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-beijing</p>
             */
            public Builder ecsRegion(String ecsRegion) {
                this.ecsRegion = ecsRegion;
                return this;
            }

            /**
             * <p>The type of the environment to which the database instance belongs. Valid values:</p>
             * <ul>
             * <li><strong>product</strong>: production environment</li>
             * <li><strong>dev</strong>: development environment</li>
             * <li><strong>pre</strong>: staging environment</li>
             * <li><strong>test</strong>: test environment</li>
             * <li><strong>sit</strong>: system integration testing (SIT) environment</li>
             * <li><strong>uat</strong>: user acceptance testing (UAT) environment</li>
             * <li><strong>pet</strong>: stress testing environment</li>
             * <li><strong>stag</strong>: STAG environment</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder envType(String envType) {
                this.envType = envType;
                return this;
            }

            /**
             * <p>The timeout period for exporting data from the database instance.</p>
             * 
             * <strong>example:</strong>
             * <p>86400</p>
             */
            public Builder exportTimeout(Integer exportTimeout) {
                this.exportTimeout = exportTimeout;
                return this;
            }

            /**
             * <p>The host address that is used to connect to the database instance.</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.XXX.XXX</p>
             */
            public Builder host(String host) {
                this.host = host;
                return this;
            }

            /**
             * <p>The alias of the database instance.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder instanceAlias(String instanceAlias) {
                this.instanceAlias = instanceAlias;
                return this;
            }

            /**
             * <p>The ID of the database instance.</p>
             * 
             * <strong>example:</strong>
             * <p>188****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The source of the database instance.</p>
             * 
             * <strong>example:</strong>
             * <p>ECS_OWN</p>
             */
            public Builder instanceSource(String instanceSource) {
                this.instanceSource = instanceSource;
                return this;
            }

            /**
             * <p>The type of the database instance.</p>
             * 
             * <strong>example:</strong>
             * <p>postgresql</p>
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * <p>The IDs of the owners for the database instance.</p>
             */
            public Builder ownerIdList(OwnerIdList ownerIdList) {
                this.ownerIdList = ownerIdList;
                return this;
            }

            /**
             * <p>The nicknames of the owners for the database instance.</p>
             */
            public Builder ownerNameList(OwnerNameList ownerNameList) {
                this.ownerNameList = ownerNameList;
                return this;
            }

            /**
             * <p>The port number that is used to connect to the database instance.</p>
             * 
             * <strong>example:</strong>
             * <p>5432</p>
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * <p>The timeout period for querying data in the database instance.</p>
             * 
             * <strong>example:</strong>
             * <p>7200</p>
             */
            public Builder queryTimeout(Integer queryTimeout) {
                this.queryTimeout = queryTimeout;
                return this;
            }

            /**
             * <p>The ID of the security rule set for the database instance.</p>
             * 
             * <strong>example:</strong>
             * <p>3****</p>
             */
            public Builder safeRuleId(String safeRuleId) {
                this.safeRuleId = safeRuleId;
                return this;
            }

            /**
             * <p>Whether sensitive data protection is enabled.  Valid values:</p>
             * <ul>
             * <li><p><strong>true</strong>: Enable.</p>
             * </li>
             * <li><p><strong>false</strong>: Close.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder sellSitd(String sellSitd) {
                this.sellSitd = sellSitd;
                return this;
            }

            /**
             * <p>The SID of the database instance.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder sid(String sid) {
                this.sid = sid;
                return this;
            }

            /**
             * <p>The control mode of the database instance.</p>
             */
            public Builder standardGroup(StandardGroup standardGroup) {
                this.standardGroup = standardGroup;
                return this;
            }

            /**
             * <p>The status of the database instance. Valid values:</p>
             * <ul>
             * <li><strong>NORMAL</strong>: normal</li>
             * <li><strong>DISABLE</strong>: disabled</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>NORMAL</p>
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * <p>Indicates whether the cross-database query feature is enabled for the database instance. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: disabled</li>
             * <li><strong>1</strong>: enabled</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder useDsql(Integer useDsql) {
                this.useDsql = useDsql;
                return this;
            }

            /**
             * <p>The ID of the virtual private cloud (VPC) to which the database instance belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-o6wrloqsdqc9io3mg****</p>
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            public Instance build() {
                return new Instance(this);
            } 

        } 

    }
}
