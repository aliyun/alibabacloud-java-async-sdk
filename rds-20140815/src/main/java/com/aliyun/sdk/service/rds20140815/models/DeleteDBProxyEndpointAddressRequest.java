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
 * {@link DeleteDBProxyEndpointAddressRequest} extends {@link RequestModel}
 *
 * <p>DeleteDBProxyEndpointAddressRequest</p>
 */
public class DeleteDBProxyEndpointAddressRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private DeleteDBProxyEndpointAddressRequest(Builder builder) {
        super(builder);
        this.DBInstanceId = builder.DBInstanceId;
        this.DBProxyConnectStringNetType = builder.DBProxyConnectStringNetType;
        this.DBProxyEndpointId = builder.DBProxyEndpointId;
        this.DBProxyEngineType = builder.DBProxyEngineType;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteDBProxyEndpointAddressRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DeleteDBProxyEndpointAddressRequest, Builder> {
        private String DBInstanceId; 
        private String DBProxyConnectStringNetType; 
        private String DBProxyEndpointId; 
        private String DBProxyEngineType; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteDBProxyEndpointAddressRequest request) {
            super(request);
            this.DBInstanceId = request.DBInstanceId;
            this.DBProxyConnectStringNetType = request.DBProxyConnectStringNetType;
            this.DBProxyEndpointId = request.DBProxyEndpointId;
            this.DBProxyEngineType = request.DBProxyEngineType;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The instance ID. You can call the DescribeDBInstances operation to query the instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-t4n3a****</p>
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
         * <li><strong>VPC</strong>: virtual private cloud (VPC)</li>
         * <li><strong>Classic</strong>: classic network</li>
         * </ul>
         * <p>If the instance runs MySQL, the default value of this parameter is <strong>Classic</strong>.</p>
         * <blockquote>
         * <p>If the instance runs PostgreSQL, you must set this parameter to <strong>Public</strong> or <strong>VPC</strong>.</p>
         * </blockquote>
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
         * <p>ta9um4****</p>
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
        public DeleteDBProxyEndpointAddressRequest build() {
            return new DeleteDBProxyEndpointAddressRequest(this);
        } 

    } 

}
