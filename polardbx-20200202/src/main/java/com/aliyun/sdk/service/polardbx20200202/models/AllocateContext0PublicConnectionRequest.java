// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardbx20200202.models;

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
 * {@link AllocateContext0PublicConnectionRequest} extends {@link RequestModel}
 *
 * <p>AllocateContext0PublicConnectionRequest</p>
 */
public class AllocateContext0PublicConnectionRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConnectionStringPrefix")
    private String connectionStringPrefix;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBInstanceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NodeType")
    private String nodeType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Port")
    private String port;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private AllocateContext0PublicConnectionRequest(Builder builder) {
        super(builder);
        this.connectionStringPrefix = builder.connectionStringPrefix;
        this.DBInstanceName = builder.DBInstanceName;
        this.nodeType = builder.nodeType;
        this.port = builder.port;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AllocateContext0PublicConnectionRequest create() {
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
     * @return DBInstanceName
     */
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

    /**
     * @return nodeType
     */
    public String getNodeType() {
        return this.nodeType;
    }

    /**
     * @return port
     */
    public String getPort() {
        return this.port;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<AllocateContext0PublicConnectionRequest, Builder> {
        private String connectionStringPrefix; 
        private String DBInstanceName; 
        private String nodeType; 
        private String port; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(AllocateContext0PublicConnectionRequest request) {
            super(request);
            this.connectionStringPrefix = request.connectionStringPrefix;
            this.DBInstanceName = request.DBInstanceName;
            this.nodeType = request.nodeType;
            this.port = request.port;
            this.regionId = request.regionId;
        } 

        /**
         * <p>公网连接串前缀（无需包含 -pub）；不传时按目标物理实例名生成</p>
         * 
         * <strong>example:</strong>
         * <p>pxc-**************</p>
         */
        public Builder connectionStringPrefix(String connectionStringPrefix) {
            this.putQueryParameter("ConnectionStringPrefix", connectionStringPrefix);
            this.connectionStringPrefix = connectionStringPrefix;
            return this;
        }

        /**
         * <p>关联的 PolarDB-X 实例名（pxc- 前缀）</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pxsp-*********</p>
         */
        public Builder DBInstanceName(String DBInstanceName) {
            this.putQueryParameter("DBInstanceName", DBInstanceName);
            this.DBInstanceName = DBInstanceName;
            return this;
        }

        /**
         * <p>目标节点类型：service 或 dashboard</p>
         * 
         * <strong>example:</strong>
         * <p>dn</p>
         */
        public Builder nodeType(String nodeType) {
            this.putQueryParameter("NodeType", nodeType);
            this.nodeType = nodeType;
            return this;
        }

        /**
         * <p>公网端口；不传时 service 使用 4040，dashboard 使用 8080</p>
         * 
         * <strong>example:</strong>
         * <p>3306</p>
         */
        public Builder port(String port) {
            this.putQueryParameter("Port", port);
            this.port = port;
            return this;
        }

        /**
         * <p>地域 ID</p>
         * <p>This parameter is required.</p>
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
        public AllocateContext0PublicConnectionRequest build() {
            return new AllocateContext0PublicConnectionRequest(this);
        } 

    } 

}
