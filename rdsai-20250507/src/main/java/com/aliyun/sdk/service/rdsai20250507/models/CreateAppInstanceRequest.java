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
    @com.aliyun.core.annotation.NameInMap("InstanceClass")
    private String instanceClass;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PublicNetworkAccessEnabled")
    private Boolean publicNetworkAccessEnabled;

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
        this.DBInstanceName = builder.DBInstanceName;
        this.dashboardPassword = builder.dashboardPassword;
        this.dashboardUsername = builder.dashboardUsername;
        this.databasePassword = builder.databasePassword;
        this.instanceClass = builder.instanceClass;
        this.publicNetworkAccessEnabled = builder.publicNetworkAccessEnabled;
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
     * @return instanceClass
     */
    public String getInstanceClass() {
        return this.instanceClass;
    }

    /**
     * @return publicNetworkAccessEnabled
     */
    public Boolean getPublicNetworkAccessEnabled() {
        return this.publicNetworkAccessEnabled;
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
        private String DBInstanceName; 
        private String dashboardPassword; 
        private String dashboardUsername; 
        private String databasePassword; 
        private String instanceClass; 
        private Boolean publicNetworkAccessEnabled; 
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
            this.DBInstanceName = request.DBInstanceName;
            this.dashboardPassword = request.dashboardPassword;
            this.dashboardUsername = request.dashboardUsername;
            this.databasePassword = request.databasePassword;
            this.instanceClass = request.instanceClass;
            this.publicNetworkAccessEnabled = request.publicNetworkAccessEnabled;
            this.regionId = request.regionId;
            this.vSwitchId = request.vSwitchId;
        } 

        /**
         * AppName.
         */
        public Builder appName(String appName) {
            this.putQueryParameter("AppName", appName);
            this.appName = appName;
            return this;
        }

        /**
         * AppType.
         */
        public Builder appType(String appType) {
            this.putQueryParameter("AppType", appType);
            this.appType = appType;
            return this;
        }

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * DBInstanceName.
         */
        public Builder DBInstanceName(String DBInstanceName) {
            this.putQueryParameter("DBInstanceName", DBInstanceName);
            this.DBInstanceName = DBInstanceName;
            return this;
        }

        /**
         * DashboardPassword.
         */
        public Builder dashboardPassword(String dashboardPassword) {
            this.putQueryParameter("DashboardPassword", dashboardPassword);
            this.dashboardPassword = dashboardPassword;
            return this;
        }

        /**
         * DashboardUsername.
         */
        public Builder dashboardUsername(String dashboardUsername) {
            this.putQueryParameter("DashboardUsername", dashboardUsername);
            this.dashboardUsername = dashboardUsername;
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
         * InstanceClass.
         */
        public Builder instanceClass(String instanceClass) {
            this.putQueryParameter("InstanceClass", instanceClass);
            this.instanceClass = instanceClass;
            return this;
        }

        /**
         * PublicNetworkAccessEnabled.
         */
        public Builder publicNetworkAccessEnabled(Boolean publicNetworkAccessEnabled) {
            this.putQueryParameter("PublicNetworkAccessEnabled", publicNetworkAccessEnabled);
            this.publicNetworkAccessEnabled = publicNetworkAccessEnabled;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * VSwitchId.
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

}
