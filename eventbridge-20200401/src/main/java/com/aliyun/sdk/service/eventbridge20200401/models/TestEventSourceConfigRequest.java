// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eventbridge20200401.models;

import com.aliyun.sdk.gateway.eventbridge.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.eventbridge.models.*;

/**
 * 
 * {@link TestEventSourceConfigRequest} extends {@link RequestModel}
 *
 * <p>TestEventSourceConfigRequest</p>
 */
public class TestEventSourceConfigRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SourceMySQLParameters")
    private SourceMySQLParameters sourceMySQLParameters;

    private TestEventSourceConfigRequest(Builder builder) {
        super(builder);
        this.sourceMySQLParameters = builder.sourceMySQLParameters;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TestEventSourceConfigRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return sourceMySQLParameters
     */
    public SourceMySQLParameters getSourceMySQLParameters() {
        return this.sourceMySQLParameters;
    }

    public static final class Builder extends Request.Builder<TestEventSourceConfigRequest, Builder> {
        private SourceMySQLParameters sourceMySQLParameters; 

        private Builder() {
            super();
        } 

        private Builder(TestEventSourceConfigRequest request) {
            super(request);
            this.sourceMySQLParameters = request.sourceMySQLParameters;
        } 

        /**
         * <p>The parameters that are configured if you specify MySQL as the event source.</p>
         */
        public Builder sourceMySQLParameters(SourceMySQLParameters sourceMySQLParameters) {
            String sourceMySQLParametersShrink = shrink(sourceMySQLParameters, "SourceMySQLParameters", "json");
            this.putBodyParameter("SourceMySQLParameters", sourceMySQLParametersShrink);
            this.sourceMySQLParameters = sourceMySQLParameters;
            return this;
        }

        @Override
        public TestEventSourceConfigRequest build() {
            return new TestEventSourceConfigRequest(this);
        } 

    } 

    /**
     * 
     * {@link TestEventSourceConfigRequest} extends {@link TeaModel}
     *
     * <p>TestEventSourceConfigRequest</p>
     */
    public static class SourceMySQLParameters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DatabaseName")
        private String databaseName;

        @com.aliyun.core.annotation.NameInMap("HostName")
        private String hostName;

        @com.aliyun.core.annotation.NameInMap("NetworkType")
        private String networkType;

        @com.aliyun.core.annotation.NameInMap("Password")
        private String password;

        @com.aliyun.core.annotation.NameInMap("Port")
        private Integer port;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("SecurityGroupId")
        private String securityGroupId;

        @com.aliyun.core.annotation.NameInMap("TableNames")
        private String tableNames;

        @com.aliyun.core.annotation.NameInMap("User")
        private String user;

        @com.aliyun.core.annotation.NameInMap("VSwitchIds")
        private String vSwitchIds;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        private SourceMySQLParameters(Builder builder) {
            this.databaseName = builder.databaseName;
            this.hostName = builder.hostName;
            this.networkType = builder.networkType;
            this.password = builder.password;
            this.port = builder.port;
            this.regionId = builder.regionId;
            this.securityGroupId = builder.securityGroupId;
            this.tableNames = builder.tableNames;
            this.user = builder.user;
            this.vSwitchIds = builder.vSwitchIds;
            this.vpcId = builder.vpcId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SourceMySQLParameters create() {
            return builder().build();
        }

        /**
         * @return databaseName
         */
        public String getDatabaseName() {
            return this.databaseName;
        }

        /**
         * @return hostName
         */
        public String getHostName() {
            return this.hostName;
        }

        /**
         * @return networkType
         */
        public String getNetworkType() {
            return this.networkType;
        }

        /**
         * @return password
         */
        public String getPassword() {
            return this.password;
        }

        /**
         * @return port
         */
        public Integer getPort() {
            return this.port;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return securityGroupId
         */
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        /**
         * @return tableNames
         */
        public String getTableNames() {
            return this.tableNames;
        }

        /**
         * @return user
         */
        public String getUser() {
            return this.user;
        }

        /**
         * @return vSwitchIds
         */
        public String getVSwitchIds() {
            return this.vSwitchIds;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        public static final class Builder {
            private String databaseName; 
            private String hostName; 
            private String networkType; 
            private String password; 
            private Integer port; 
            private String regionId; 
            private String securityGroupId; 
            private String tableNames; 
            private String user; 
            private String vSwitchIds; 
            private String vpcId; 

            private Builder() {
            } 

            private Builder(SourceMySQLParameters model) {
                this.databaseName = model.databaseName;
                this.hostName = model.hostName;
                this.networkType = model.networkType;
                this.password = model.password;
                this.port = model.port;
                this.regionId = model.regionId;
                this.securityGroupId = model.securityGroupId;
                this.tableNames = model.tableNames;
                this.user = model.user;
                this.vSwitchIds = model.vSwitchIds;
                this.vpcId = model.vpcId;
            } 

            /**
             * <p>The database name.</p>
             * 
             * <strong>example:</strong>
             * <p>database1</p>
             */
            public Builder databaseName(String databaseName) {
                this.databaseName = databaseName;
                return this;
            }

            /**
             * <p>The endpoint of the database.</p>
             * 
             * <strong>example:</strong>
             * <p>rm-bp1vxxx.mysql.rds.aliyuncs.com</p>
             */
            public Builder hostName(String hostName) {
                this.hostName = hostName;
                return this;
            }

            /**
             * <p>The network type.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>PrivateNetwork</li>
             * <li>PublicNetwork</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>PrivateNetwork</p>
             */
            public Builder networkType(String networkType) {
                this.networkType = networkType;
                return this;
            }

            /**
             * <p>The password that is used for authentication.</p>
             * 
             * <strong>example:</strong>
             * <p>1234xxx</p>
             */
            public Builder password(String password) {
                this.password = password;
                return this;
            }

            /**
             * <p>The port that is used to connect to the database.</p>
             * 
             * <strong>example:</strong>
             * <p>80</p>
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * <p>The region ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The ID of the security group.</p>
             * 
             * <strong>example:</strong>
             * <p>sg-xxx</p>
             */
            public Builder securityGroupId(String securityGroupId) {
                this.securityGroupId = securityGroupId;
                return this;
            }

            /**
             * <p>The table name. The name must be prefixed with the database name. ${DatabaseName}.${TableName}</p>
             * 
             * <strong>example:</strong>
             * <p>database1.table1</p>
             */
            public Builder tableNames(String tableNames) {
                this.tableNames = tableNames;
                return this;
            }

            /**
             * <p>The username that is used to log on to the database.</p>
             * 
             * <strong>example:</strong>
             * <p>user***</p>
             */
            public Builder user(String user) {
                this.user = user;
                return this;
            }

            /**
             * <p>The vSwitch ID.</p>
             * 
             * <strong>example:</strong>
             * <p>vsw-bp1gb7xxx</p>
             */
            public Builder vSwitchIds(String vSwitchIds) {
                this.vSwitchIds = vSwitchIds;
                return this;
            }

            /**
             * <p>The virtual private cloud (VPC) ID.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-xxx</p>
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            public SourceMySQLParameters build() {
                return new SourceMySQLParameters(this);
            } 

        } 

    }
}
