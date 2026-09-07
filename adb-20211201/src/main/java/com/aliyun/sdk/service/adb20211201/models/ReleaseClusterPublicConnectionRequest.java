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
 * {@link ReleaseClusterPublicConnectionRequest} extends {@link RequestModel}
 *
 * <p>ReleaseClusterPublicConnectionRequest</p>
 */
public class ReleaseClusterPublicConnectionRequest extends Request {
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

    private ReleaseClusterPublicConnectionRequest(Builder builder) {
        super(builder);
        this.DBClusterId = builder.DBClusterId;
        this.engine = builder.engine;
        this.resourceGroupName = builder.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ReleaseClusterPublicConnectionRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
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

    public static final class Builder extends Request.Builder<ReleaseClusterPublicConnectionRequest, Builder> {
        private String DBClusterId; 
        private String engine; 
        private String resourceGroupName; 

        private Builder() {
            super();
        } 

        private Builder(ReleaseClusterPublicConnectionRequest request) {
            super(request);
            this.DBClusterId = request.DBClusterId;
            this.engine = request.engine;
            this.resourceGroupName = request.resourceGroupName;
        } 

        /**
         * <p>&lt;props=&quot;china&quot;&gt;The ID of the Enterprise Edition, Basic Edition, or Data Lakehouse Edition cluster.
         * &lt;props=&quot;intl&quot;&gt;The ID of the Data Lakehouse Edition cluster.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>amv-bp11q28kvl688****</p>
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putQueryParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * <p>The database engine. Valid values:</p>
         * <ul>
         * <li><p><strong>AnalyticDB</strong> (Default): AnalyticDB for MySQL.</p>
         * </li>
         * <li><p><strong>ClickHouse</strong>: a wide table engine.</p>
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
        public ReleaseClusterPublicConnectionRequest build() {
            return new ReleaseClusterPublicConnectionRequest(this);
        } 

    } 

}
