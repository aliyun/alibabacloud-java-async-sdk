// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>A reserved parameter. You do not need to specify this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>normal</p>
         */
        public Builder DBProxyEngineType(String DBProxyEngineType) {
            this.putQueryParameter("DBProxyEngineType", DBProxyEngineType);
            this.DBProxyEngineType = DBProxyEngineType;
            return this;
        }

        /**
         * <p>The instance ID. You can call the DescribeDBInstances operation to query the instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-t4n3axxxxx</p>
         */
        public Builder dbInstanceId(String dbInstanceId) {
            this.putQueryParameter("DbInstanceId", dbInstanceId);
            this.dbInstanceId = dbInstanceId;
            return this;
        }

        /**
         * <p>The dedicated proxy endpoint of the instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test123456.rwlb.rds.aliyuncs.com</p>
         */
        public Builder dbProxyConnectString(String dbProxyConnectString) {
            this.putQueryParameter("DbProxyConnectString", dbProxyConnectString);
            this.dbProxyConnectString = dbProxyConnectString;
            return this;
        }

        /**
         * <p>The ID of the proxy endpoint. You can call the DescribeDBProxyEndpoint operation to query the ID of the proxy endpoint.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ta9um4xxxxx</p>
         */
        public Builder dbProxyEndpointId(String dbProxyEndpointId) {
            this.putQueryParameter("DbProxyEndpointId", dbProxyEndpointId);
            this.dbProxyEndpointId = dbProxyEndpointId;
            return this;
        }

        /**
         * <p>The SSL configuration setting that you want to apply on the instance. Valid values:</p>
         * <ul>
         * <li>0: disables SSL encryption.</li>
         * <li>1: enables SSL encryption or modifies the endpoint that requires SSL encryption.</li>
         * <li>2: updates the validity period of the SSL certificate.</li>
         * </ul>
         * <blockquote>
         * <p>This setting causes your instance to restart. Proceed with caution.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder dbProxySslEnabled(String dbProxySslEnabled) {
            this.putQueryParameter("DbProxySslEnabled", dbProxySslEnabled);
            this.dbProxySslEnabled = dbProxySslEnabled;
            return this;
        }

        /**
         * <p>The region ID. You can call the DescribeRegions operation to query the most recent region list.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
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
