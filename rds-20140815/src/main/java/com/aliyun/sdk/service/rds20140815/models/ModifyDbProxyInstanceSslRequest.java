// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyDbProxyInstanceSslRequest} extends {@link RequestModel}
 *
 * <p>ModifyDbProxyInstanceSslRequest</p>
 */
public class ModifyDbProxyInstanceSslRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBProxyEngineType")
    private String DBProxyEngineType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DbInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dbInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DbProxyConnectString")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dbProxyConnectString;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DbProxyEndpointId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dbProxyEndpointId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DbProxySslEnabled")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dbProxySslEnabled;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private ModifyDbProxyInstanceSslRequest(Builder builder) {
        super(builder);
        this.DBProxyEngineType = builder.DBProxyEngineType;
        this.dbInstanceId = builder.dbInstanceId;
        this.dbProxyConnectString = builder.dbProxyConnectString;
        this.dbProxyEndpointId = builder.dbProxyEndpointId;
        this.dbProxySslEnabled = builder.dbProxySslEnabled;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDbProxyInstanceSslRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return DBProxyEngineType
     */
    public String getDBProxyEngineType() {
        return this.DBProxyEngineType;
    }

    /**
     * @return dbInstanceId
     */
    public String getDbInstanceId() {
        return this.dbInstanceId;
    }

    /**
     * @return dbProxyConnectString
     */
    public String getDbProxyConnectString() {
        return this.dbProxyConnectString;
    }

    /**
     * @return dbProxyEndpointId
     */
    public String getDbProxyEndpointId() {
        return this.dbProxyEndpointId;
    }

    /**
     * @return dbProxySslEnabled
     */
    public String getDbProxySslEnabled() {
        return this.dbProxySslEnabled;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<ModifyDbProxyInstanceSslRequest, Builder> {
        private String DBProxyEngineType; 
        private String dbInstanceId; 
        private String dbProxyConnectString; 
        private String dbProxyEndpointId; 
        private String dbProxySslEnabled; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyDbProxyInstanceSslRequest request) {
            super(request);
            this.DBProxyEngineType = request.DBProxyEngineType;
            this.dbInstanceId = request.dbInstanceId;
            this.dbProxyConnectString = request.dbProxyConnectString;
            this.dbProxyEndpointId = request.dbProxyEndpointId;
            this.dbProxySslEnabled = request.dbProxySslEnabled;
            this.regionId = request.regionId;
        } 

        /**
         * A reserved parameter. You do not need to specify this parameter.
         */
        public Builder DBProxyEngineType(String DBProxyEngineType) {
            this.putQueryParameter("DBProxyEngineType", DBProxyEngineType);
            this.DBProxyEngineType = DBProxyEngineType;
            return this;
        }

        /**
         * The instance ID. You can call the DescribeDBInstances operation to query the instance ID.
         */
        public Builder dbInstanceId(String dbInstanceId) {
            this.putQueryParameter("DbInstanceId", dbInstanceId);
            this.dbInstanceId = dbInstanceId;
            return this;
        }

        /**
         * The dedicated proxy endpoint of the instance.
         */
        public Builder dbProxyConnectString(String dbProxyConnectString) {
            this.putQueryParameter("DbProxyConnectString", dbProxyConnectString);
            this.dbProxyConnectString = dbProxyConnectString;
            return this;
        }

        /**
         * The ID of the proxy endpoint. You can call the DescribeDBProxyEndpoint operation to query the ID of the proxy endpoint.
         */
        public Builder dbProxyEndpointId(String dbProxyEndpointId) {
            this.putQueryParameter("DbProxyEndpointId", dbProxyEndpointId);
            this.dbProxyEndpointId = dbProxyEndpointId;
            return this;
        }

        /**
         * The SSL configuration setting that you want to apply on the instance. Valid values:
         * <p>
         * 
         * *   0: disables SSL encryption.
         * *   1: enables SSL encryption or modifies the endpoint that requires SSL encryption.
         * *   2: updates the validity period of the SSL certificate.
         * 
         * > This setting causes your instance to restart. Proceed with caution.
         */
        public Builder dbProxySslEnabled(String dbProxySslEnabled) {
            this.putQueryParameter("DbProxySslEnabled", dbProxySslEnabled);
            this.dbProxySslEnabled = dbProxySslEnabled;
            return this;
        }

        /**
         * The region ID. You can call the DescribeRegions operation to query the most recent region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public ModifyDbProxyInstanceSslRequest build() {
            return new ModifyDbProxyInstanceSslRequest(this);
        } 

    } 

}
