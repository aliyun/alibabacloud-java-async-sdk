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
         * SourceMySQLParameters.
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
             * DatabaseName.
             */
            public Builder databaseName(String databaseName) {
                this.databaseName = databaseName;
                return this;
            }

            /**
             * HostName.
             */
            public Builder hostName(String hostName) {
                this.hostName = hostName;
                return this;
            }

            /**
             * NetworkType.
             */
            public Builder networkType(String networkType) {
                this.networkType = networkType;
                return this;
            }

            /**
             * Password.
             */
            public Builder password(String password) {
                this.password = password;
                return this;
            }

            /**
             * Port.
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * SecurityGroupId.
             */
            public Builder securityGroupId(String securityGroupId) {
                this.securityGroupId = securityGroupId;
                return this;
            }

            /**
             * TableNames.
             */
            public Builder tableNames(String tableNames) {
                this.tableNames = tableNames;
                return this;
            }

            /**
             * User.
             */
            public Builder user(String user) {
                this.user = user;
                return this;
            }

            /**
             * VSwitchIds.
             */
            public Builder vSwitchIds(String vSwitchIds) {
                this.vSwitchIds = vSwitchIds;
                return this;
            }

            /**
             * <p>VPC ID。</p>
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
