// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

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
 * {@link CreateDBProxyEndpointAddressRequest} extends {@link RequestModel}
 *
 * <p>CreateDBProxyEndpointAddressRequest</p>
 */
public class CreateDBProxyEndpointAddressRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConnectionStringPrefix")
    @com.aliyun.core.annotation.Validation(required = true)
    private String connectionStringPrefix;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBProxyConnectStringNetType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBProxyConnectStringNetType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBProxyEndpointId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBProxyEndpointId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBProxyEngineType")
    private String DBProxyEngineType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBProxyNewConnectStringPort")
    private String DBProxyNewConnectStringPort;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VPCId")
    private String VPCId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VSwitchId")
    private String vSwitchId;

    private CreateDBProxyEndpointAddressRequest(Builder builder) {
        super(builder);
        this.connectionStringPrefix = builder.connectionStringPrefix;
        this.DBInstanceId = builder.DBInstanceId;
        this.DBProxyConnectStringNetType = builder.DBProxyConnectStringNetType;
        this.DBProxyEndpointId = builder.DBProxyEndpointId;
        this.DBProxyEngineType = builder.DBProxyEngineType;
        this.DBProxyNewConnectStringPort = builder.DBProxyNewConnectStringPort;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.VPCId = builder.VPCId;
        this.vSwitchId = builder.vSwitchId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDBProxyEndpointAddressRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return connectionStringPrefix
     */
    public String getConnectionStringPrefix() {
        return this.connectionStringPrefix;
    }

    /**
     * @return DBInstanceId
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * @return DBProxyConnectStringNetType
     */
    public String getDBProxyConnectStringNetType() {
        return this.DBProxyConnectStringNetType;
    }

    /**
     * @return DBProxyEndpointId
     */
    public String getDBProxyEndpointId() {
        return this.DBProxyEndpointId;
    }

    /**
     * @return DBProxyEngineType
     */
    public String getDBProxyEngineType() {
        return this.DBProxyEngineType;
    }

    /**
     * @return DBProxyNewConnectStringPort
     */
    public String getDBProxyNewConnectStringPort() {
        return this.DBProxyNewConnectStringPort;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return VPCId
     */
    public String getVPCId() {
        return this.VPCId;
    }

    /**
     * @return vSwitchId
     */
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public static final class Builder extends Request.Builder<CreateDBProxyEndpointAddressRequest, Builder> {
        private String connectionStringPrefix; 
        private String DBInstanceId; 
        private String DBProxyConnectStringNetType; 
        private String DBProxyEndpointId; 
        private String DBProxyEngineType; 
        private String DBProxyNewConnectStringPort; 
        private String regionId; 
        private String resourceGroupId; 
        private String VPCId; 
        private String vSwitchId; 

        private Builder() {
            super();
        } 

        private Builder(CreateDBProxyEndpointAddressRequest request) {
            super(request);
            this.connectionStringPrefix = request.connectionStringPrefix;
            this.DBInstanceId = request.DBInstanceId;
            this.DBProxyConnectStringNetType = request.DBProxyConnectStringNetType;
            this.DBProxyEndpointId = request.DBProxyEndpointId;
            this.DBProxyEngineType = request.DBProxyEngineType;
            this.DBProxyNewConnectStringPort = request.DBProxyNewConnectStringPort;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.VPCId = request.VPCId;
            this.vSwitchId = request.vSwitchId;
        } 

        /**
         * <p>The prefix of the proxy endpoint Enter a custom prefix.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test1234</p>
         */
        public Builder connectionStringPrefix(String connectionStringPrefix) {
            this.putQueryParameter("ConnectionStringPrefix", connectionStringPrefix);
            this.connectionStringPrefix = connectionStringPrefix;
            return this;
        }

        /**
         * <p>The instance ID. You can call the DescribeDBInstances operation to query the instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-t4n3axxxxx</p>
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.putQueryParameter("DBInstanceId", DBInstanceId);
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * <p>The network type of the proxy endpoint. Valid values:</p>
         * <ul>
         * <li><strong>Public</strong>: Internet</li>
         * <li><strong>VPC</strong>: Virtual Private Cloud (VPC)</li>
         * <li><strong>Classic</strong>: classic network</li>
         * </ul>
         * <p>Default value: <strong>Classic</strong></p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Public</p>
         */
        public Builder DBProxyConnectStringNetType(String DBProxyConnectStringNetType) {
            this.putQueryParameter("DBProxyConnectStringNetType", DBProxyConnectStringNetType);
            this.DBProxyConnectStringNetType = DBProxyConnectStringNetType;
            return this;
        }

        /**
         * <p>The proxy endpoint ID. You can call the DescribeDBProxyEndpoint operation to query the proxy endpoint ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ta9um4xxxxx</p>
         */
        public Builder DBProxyEndpointId(String DBProxyEndpointId) {
            this.putQueryParameter("DBProxyEndpointId", DBProxyEndpointId);
            this.DBProxyEndpointId = DBProxyEndpointId;
            return this;
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
         * <p>The port number that is associated with the proxy endpoint.</p>
         * <ul>
         * <li>If the instance runs MySQL, the default value is <strong>3306</strong>.</li>
         * <li>If the instance runs PostgreSQL, the default value is <strong>5432</strong>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>3306</p>
         */
        public Builder DBProxyNewConnectStringPort(String DBProxyNewConnectStringPort) {
            this.putQueryParameter("DBProxyNewConnectStringPort", DBProxyNewConnectStringPort);
            this.DBProxyNewConnectStringPort = DBProxyNewConnectStringPort;
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

        /**
         * <p>The ID of the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmy*****</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The ID of the VPC to which the proxy endpoint belongs. You can call the DescribeDBInstanceAttribute operation to query the information.</p>
         * <blockquote>
         * <p> This parameter must be specified when <strong>DBProxyConnectStringNetType</strong> is set to <strong>VPC</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>vpc-bpxxxxxx</p>
         */
        public Builder VPCId(String VPCId) {
            this.putQueryParameter("VPCId", VPCId);
            this.VPCId = VPCId;
            return this;
        }

        /**
         * <p>The ID of the vSwitch that is associated with the specified VPC. You can call the DescribeDBInstanceAttribute operation to query the vSwitch ID.</p>
         * <blockquote>
         * <p> This parameter must be specified when <strong>DBProxyConnectStringNetType</strong> is set to <strong>VPC</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>vsw-bpxxxxxx</p>
         */
        public Builder vSwitchId(String vSwitchId) {
            this.putQueryParameter("VSwitchId", vSwitchId);
            this.vSwitchId = vSwitchId;
            return this;
        }

        @Override
        public CreateDBProxyEndpointAddressRequest build() {
            return new CreateDBProxyEndpointAddressRequest(this);
        } 

    } 

}
