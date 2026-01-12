// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rdsai20250507.models;

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
 * {@link CreateAppInstanceRequest} extends {@link RequestModel}
 *
 * <p>CreateAppInstanceRequest</p>
 */
public class CreateAppInstanceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppName")
    private String appName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppType")
    private String appType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceConfig")
    private DBInstanceConfig DBInstanceConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceName")
    private String DBInstanceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DashboardPassword")
    private String dashboardPassword;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DashboardUsername")
    private String dashboardUsername;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DatabasePassword")
    private String databasePassword;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InitializeWithExistingData")
    private Boolean initializeWithExistingData;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceClass")
    private String instanceClass;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PublicEndpointEnabled")
    private Boolean publicEndpointEnabled;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PublicNetworkAccessEnabled")
    private Boolean publicNetworkAccessEnabled;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RAGEnabled")
    private Boolean RAGEnabled;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VSwitchId")
    private String vSwitchId;

    private CreateAppInstanceRequest(Builder builder) {
        super(builder);
        this.appName = builder.appName;
        this.appType = builder.appType;
        this.clientToken = builder.clientToken;
        this.DBInstanceConfig = builder.DBInstanceConfig;
        this.DBInstanceName = builder.DBInstanceName;
        this.dashboardPassword = builder.dashboardPassword;
        this.dashboardUsername = builder.dashboardUsername;
        this.databasePassword = builder.databasePassword;
        this.initializeWithExistingData = builder.initializeWithExistingData;
        this.instanceClass = builder.instanceClass;
        this.publicEndpointEnabled = builder.publicEndpointEnabled;
        this.publicNetworkAccessEnabled = builder.publicNetworkAccessEnabled;
        this.RAGEnabled = builder.RAGEnabled;
        this.regionId = builder.regionId;
        this.vSwitchId = builder.vSwitchId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAppInstanceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appName
     */
    public String getAppName() {
        return this.appName;
    }

    /**
     * @return appType
     */
    public String getAppType() {
        return this.appType;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return DBInstanceConfig
     */
    public DBInstanceConfig getDBInstanceConfig() {
        return this.DBInstanceConfig;
    }

    /**
     * @return DBInstanceName
     */
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

    /**
     * @return dashboardPassword
     */
    public String getDashboardPassword() {
        return this.dashboardPassword;
    }

    /**
     * @return dashboardUsername
     */
    public String getDashboardUsername() {
        return this.dashboardUsername;
    }

    /**
     * @return databasePassword
     */
    public String getDatabasePassword() {
        return this.databasePassword;
    }

    /**
     * @return initializeWithExistingData
     */
    public Boolean getInitializeWithExistingData() {
        return this.initializeWithExistingData;
    }

    /**
     * @return instanceClass
     */
    public String getInstanceClass() {
        return this.instanceClass;
    }

    /**
     * @return publicEndpointEnabled
     */
    public Boolean getPublicEndpointEnabled() {
        return this.publicEndpointEnabled;
    }

    /**
     * @return publicNetworkAccessEnabled
     */
    public Boolean getPublicNetworkAccessEnabled() {
        return this.publicNetworkAccessEnabled;
    }

    /**
     * @return RAGEnabled
     */
    public Boolean getRAGEnabled() {
        return this.RAGEnabled;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return vSwitchId
     */
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public static final class Builder extends Request.Builder<CreateAppInstanceRequest, Builder> {
        private String appName; 
        private String appType; 
        private String clientToken; 
        private DBInstanceConfig DBInstanceConfig; 
        private String DBInstanceName; 
        private String dashboardPassword; 
        private String dashboardUsername; 
        private String databasePassword; 
        private Boolean initializeWithExistingData; 
        private String instanceClass; 
        private Boolean publicEndpointEnabled; 
        private Boolean publicNetworkAccessEnabled; 
        private Boolean RAGEnabled; 
        private String regionId; 
        private String vSwitchId; 

        private Builder() {
            super();
        } 

        private Builder(CreateAppInstanceRequest request) {
            super(request);
            this.appName = request.appName;
            this.appType = request.appType;
            this.clientToken = request.clientToken;
            this.DBInstanceConfig = request.DBInstanceConfig;
            this.DBInstanceName = request.DBInstanceName;
            this.dashboardPassword = request.dashboardPassword;
            this.dashboardUsername = request.dashboardUsername;
            this.databasePassword = request.databasePassword;
            this.initializeWithExistingData = request.initializeWithExistingData;
            this.instanceClass = request.instanceClass;
            this.publicEndpointEnabled = request.publicEndpointEnabled;
            this.publicNetworkAccessEnabled = request.publicNetworkAccessEnabled;
            this.RAGEnabled = request.RAGEnabled;
            this.regionId = request.regionId;
            this.vSwitchId = request.vSwitchId;
        } 

        /**
         * <p>The ID of the RDS for PostgreSQL instance with which the RDS Supabase instances are associated.</p>
         * <blockquote>
         * <p>: Only newly purchased empty RDS for PostgreSQL instances are supported. The major engine version must be PostgreSQL 17 and the minor version must be 20250630 or later.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>test-supabase</p>
         */
        public Builder appName(String appName) {
            this.putQueryParameter("AppName", appName);
            this.appName = appName;
            return this;
        }

        /**
         * <p>The region ID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>supabase</p>
         */
        public Builder appType(String appType) {
            this.putQueryParameter("AppType", appType);
            this.appType = appType;
            return this;
        }

        /**
         * <p>The name of the new AI application.</p>
         * 
         * <strong>example:</strong>
         * <p>ETnLKlblzczshOTUbOCz****</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>A reserved parameter.</p>
         */
        public Builder DBInstanceConfig(DBInstanceConfig DBInstanceConfig) {
            String DBInstanceConfigShrink = shrink(DBInstanceConfig, "DBInstanceConfig", "json");
            this.putQueryParameter("DBInstanceConfig", DBInstanceConfigShrink);
            this.DBInstanceConfig = DBInstanceConfig;
            return this;
        }

        /**
         * <p>The instance type. Only <strong>rdsai.supabase.basic</strong> is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>pgm-2ze49qv594vi****</p>
         */
        public Builder DBInstanceName(String DBInstanceName) {
            this.putQueryParameter("DBInstanceName", DBInstanceName);
            this.DBInstanceName = DBInstanceName;
            return this;
        }

        /**
         * <p>The Supabase Dashboard user name.</p>
         * 
         * <strong>example:</strong>
         * <p>test_Password</p>
         */
        public Builder dashboardPassword(String dashboardPassword) {
            this.putQueryParameter("DashboardPassword", dashboardPassword);
            this.dashboardPassword = dashboardPassword;
            return this;
        }

        /**
         * <p>The password used to access the RDS database.</p>
         * <p>The password must be 8 to 32 characters in length and must contain at least three of the following characters: uppercase letters, lowercase letters, digits, and underscores (_).</p>
         * 
         * <strong>example:</strong>
         * <p>supabase</p>
         */
        public Builder dashboardUsername(String dashboardUsername) {
            this.putQueryParameter("DashboardUsername", dashboardUsername);
            this.dashboardUsername = dashboardUsername;
            return this;
        }

        /**
         * <p>The idempotency token. The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests.</p>
         * 
         * <strong>example:</strong>
         * <p>test_Password</p>
         */
        public Builder databasePassword(String databasePassword) {
            this.putQueryParameter("DatabasePassword", databasePassword);
            this.databasePassword = databasePassword;
            return this;
        }

        /**
         * <p>Specifies whether to enable public endpoint.</p>
         * <ul>
         * <li>true (default)</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder initializeWithExistingData(Boolean initializeWithExistingData) {
            this.putQueryParameter("InitializeWithExistingData", initializeWithExistingData);
            this.initializeWithExistingData = initializeWithExistingData;
            return this;
        }

        /**
         * <p>The vSwitch ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rdsai.supabase.basic</p>
         */
        public Builder instanceClass(String instanceClass) {
            this.putQueryParameter("InstanceClass", instanceClass);
            this.instanceClass = instanceClass;
            return this;
        }

        /**
         * <p>The billing method of the RDS for PostgreSQL instance.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder publicEndpointEnabled(Boolean publicEndpointEnabled) {
            this.putQueryParameter("PublicEndpointEnabled", publicEndpointEnabled);
            this.publicEndpointEnabled = publicEndpointEnabled;
            return this;
        }

        /**
         * <p>The Supabase Dashboard password.</p>
         * <p>The password must be 8 to 32 characters in length and must contain at least three of the following characters: uppercase letters, lowercase letters, digits, and underscores (_).</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder publicNetworkAccessEnabled(Boolean publicNetworkAccessEnabled) {
            this.putQueryParameter("PublicNetworkAccessEnabled", publicNetworkAccessEnabled);
            this.publicNetworkAccessEnabled = publicNetworkAccessEnabled;
            return this;
        }

        /**
         * <p>Specifies whether to enable the Internet NAT gateway. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: enable the Internet NAT gateway.</li>
         * <li><strong>false</strong> (default): disable the Internet NAT gateway.</li>
         * </ul>
         * <blockquote>
         * <p> If an Internet NAT gateway is enabled for the vSwitch that you specify for VSwitchId, select false for this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder RAGEnabled(Boolean RAGEnabled) {
            this.putQueryParameter("RAGEnabled", RAGEnabled);
            this.RAGEnabled = RAGEnabled;
            return this;
        }

        /**
         * <p>The operation that you want to perform. Set the value to <strong>CreateAppInstance</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The application type. Only <strong>supabase</strong> is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-9dp2hkpm22gxscfgy****</p>
         */
        public Builder vSwitchId(String vSwitchId) {
            this.putQueryParameter("VSwitchId", vSwitchId);
            this.vSwitchId = vSwitchId;
            return this;
        }

        @Override
        public CreateAppInstanceRequest build() {
            return new CreateAppInstanceRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateAppInstanceRequest} extends {@link TeaModel}
     *
     * <p>CreateAppInstanceRequest</p>
     */
    public static class DBInstanceConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DBInstanceClass")
        private String DBInstanceClass;

        @com.aliyun.core.annotation.NameInMap("DBInstanceStorage")
        @com.aliyun.core.annotation.Validation(maximum = 64000, minimum = 10)
        private Integer DBInstanceStorage;

        @com.aliyun.core.annotation.NameInMap("PayType")
        private String payType;

        private DBInstanceConfig(Builder builder) {
            this.DBInstanceClass = builder.DBInstanceClass;
            this.DBInstanceStorage = builder.DBInstanceStorage;
            this.payType = builder.payType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DBInstanceConfig create() {
            return builder().build();
        }

        /**
         * @return DBInstanceClass
         */
        public String getDBInstanceClass() {
            return this.DBInstanceClass;
        }

        /**
         * @return DBInstanceStorage
         */
        public Integer getDBInstanceStorage() {
            return this.DBInstanceStorage;
        }

        /**
         * @return payType
         */
        public String getPayType() {
            return this.payType;
        }

        public static final class Builder {
            private String DBInstanceClass; 
            private Integer DBInstanceStorage; 
            private String payType; 

            private Builder() {
            } 

            private Builder(DBInstanceConfig model) {
                this.DBInstanceClass = model.DBInstanceClass;
                this.DBInstanceStorage = model.DBInstanceStorage;
                this.payType = model.payType;
            } 

            /**
             * DBInstanceClass.
             */
            public Builder DBInstanceClass(String DBInstanceClass) {
                this.DBInstanceClass = DBInstanceClass;
                return this;
            }

            /**
             * DBInstanceStorage.
             */
            public Builder DBInstanceStorage(Integer DBInstanceStorage) {
                this.DBInstanceStorage = DBInstanceStorage;
                return this;
            }

            /**
             * PayType.
             */
            public Builder payType(String payType) {
                this.payType = payType;
                return this;
            }

            public DBInstanceConfig build() {
                return new DBInstanceConfig(this);
            } 

        } 

    }
}
