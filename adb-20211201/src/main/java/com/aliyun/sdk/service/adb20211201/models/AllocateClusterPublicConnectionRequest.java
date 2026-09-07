// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

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
 * {@link AllocateClusterPublicConnectionRequest} extends {@link RequestModel}
 *
 * <p>AllocateClusterPublicConnectionRequest</p>
 */
public class AllocateClusterPublicConnectionRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConnectionStringPrefix")
    private String connectionStringPrefix;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBClusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Engine")
    private String engine;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupName")
    private String resourceGroupName;

    private AllocateClusterPublicConnectionRequest(Builder builder) {
        super(builder);
        this.connectionStringPrefix = builder.connectionStringPrefix;
        this.DBClusterId = builder.DBClusterId;
        this.engine = builder.engine;
        this.resourceGroupName = builder.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AllocateClusterPublicConnectionRequest create() {
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
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    /**
     * @return engine
     */
    public String getEngine() {
        return this.engine;
    }

    /**
     * @return resourceGroupName
     */
    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    public static final class Builder extends Request.Builder<AllocateClusterPublicConnectionRequest, Builder> {
        private String connectionStringPrefix; 
        private String DBClusterId; 
        private String engine; 
        private String resourceGroupName; 

        private Builder() {
            super();
        } 

        private Builder(AllocateClusterPublicConnectionRequest request) {
            super(request);
            this.connectionStringPrefix = request.connectionStringPrefix;
            this.DBClusterId = request.DBClusterId;
            this.engine = request.engine;
            this.resourceGroupName = request.resourceGroupName;
        } 

        /**
         * <p>The prefix of the public connection address.</p>
         * <ul>
         * <li><p>It must begin with a lowercase letter and can contain only lowercase letters, digits, and hyphens (-).</p>
         * </li>
         * <li><p>It must be no more than 30 characters long.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>test12</p>
         */
        public Builder connectionStringPrefix(String connectionStringPrefix) {
            this.putQueryParameter("ConnectionStringPrefix", connectionStringPrefix);
            this.connectionStringPrefix = connectionStringPrefix;
            return this;
        }

        /**
         * <p>&lt;props=&quot;china&quot;&gt;The cluster ID of an Enterprise Edition, Basic Edition, or Data Lakehouse Edition cluster.
         * &lt;props=&quot;intl&quot;&gt;The cluster ID of a Data Lakehouse Edition cluster.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>amv-bp1z5d2q71is2****</p>
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putQueryParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * <p>The database engine. Valid values:</p>
         * <ul>
         * <li><p><strong>AnalyticDB</strong> (default): the AnalyticDB for MySQL engine.</p>
         * </li>
         * <li><p><strong>Clickhouse</strong>: the wide table engine.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Clickhouse</p>
         */
        public Builder engine(String engine) {
            this.putQueryParameter("Engine", engine);
            this.engine = engine;
            return this;
        }

        /**
         * ResourceGroupName.
         */
        public Builder resourceGroupName(String resourceGroupName) {
            this.putQueryParameter("ResourceGroupName", resourceGroupName);
            this.resourceGroupName = resourceGroupName;
            return this;
        }

        @Override
        public AllocateClusterPublicConnectionRequest build() {
            return new AllocateClusterPublicConnectionRequest(this);
        } 

    } 

}
