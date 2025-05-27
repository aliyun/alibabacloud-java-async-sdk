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
 * {@link DiscoverEventSourceRequest} extends {@link RequestModel}
 *
 * <p>DiscoverEventSourceRequest</p>
 */
public class DiscoverEventSourceRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SourceMySQLParameters")
    private SourceMySQLParameters sourceMySQLParameters;

    private DiscoverEventSourceRequest(Builder builder) {
        super(builder);
        this.sourceMySQLParameters = builder.sourceMySQLParameters;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DiscoverEventSourceRequest create() {
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

    public static final class Builder extends Request.Builder<DiscoverEventSourceRequest, Builder> {
        private SourceMySQLParameters sourceMySQLParameters; 

        private Builder() {
            super();
        } 

        private Builder(DiscoverEventSourceRequest request) {
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
        public DiscoverEventSourceRequest build() {
            return new DiscoverEventSourceRequest(this);
        } 

    } 

    /**
     * 
     * {@link DiscoverEventSourceRequest} extends {@link TeaModel}
     *
     * <p>DiscoverEventSourceRequest</p>
     */
    public static class SourceMySQLParameters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DatabaseName")
        private String databaseName;

        @com.aliyun.core.annotation.NameInMap("HostName")
        private String hostName;

        @com.aliyun.core.annotation.NameInMap("Limit")
        private String limit;

        @com.aliyun.core.annotation.NameInMap("NetworkType")
        private String networkType;

        @com.aliyun.core.annotation.NameInMap("Offset")
        private String offset;

        @com.aliyun.core.annotation.NameInMap("Password")
        private String password;

        @com.aliyun.core.annotation.NameInMap("Port")
        private Integer port;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("SecurityGroupId")
        private String securityGroupId;

        @com.aliyun.core.annotation.NameInMap("TableName")
        private String tableName;

        @com.aliyun.core.annotation.NameInMap("User")
        private String user;

        @com.aliyun.core.annotation.NameInMap("VSwitchIds")
        private String vSwitchIds;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        private SourceMySQLParameters(Builder builder) {
            this.databaseName = builder.databaseName;
            this.hostName = builder.hostName;
            this.limit = builder.limit;
            this.networkType = builder.networkType;
            this.offset = builder.offset;
            this.password = builder.password;
            this.port = builder.port;
            this.regionId = builder.regionId;
            this.securityGroupId = builder.securityGroupId;
            this.tableName = builder.tableName;
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
         * @return limit
         */
        public String getLimit() {
            return this.limit;
        }

        /**
         * @return networkType
         */
        public String getNetworkType() {
            return this.networkType;
        }

        /**
         * @return offset
         */
        public String getOffset() {
            return this.offset;
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
         * @return tableName
         */
        public String getTableName() {
            return this.tableName;
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
            private String limit; 
            private String networkType; 
            private String offset; 
            private String password; 
            private Integer port; 
            private String regionId; 
            private String securityGroupId; 
            private String tableName; 
            private String user; 
            private String vSwitchIds; 
            private String vpcId; 

            private Builder() {
            } 

            private Builder(SourceMySQLParameters model) {
                this.databaseName = model.databaseName;
                this.hostName = model.hostName;
                this.limit = model.limit;
                this.networkType = model.networkType;
                this.offset = model.offset;
                this.password = model.password;
                this.port = model.port;
                this.regionId = model.regionId;
                this.securityGroupId = model.securityGroupId;
                this.tableName = model.tableName;
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
             * Limit.
             */
            public Builder limit(String limit) {
                this.limit = limit;
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
             * Offset.
             */
            public Builder offset(String offset) {
                this.offset = offset;
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
             * TableName.
             */
            public Builder tableName(String tableName) {
                this.tableName = tableName;
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
             * VpcId.
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
