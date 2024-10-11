// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

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

    private AllocateClusterPublicConnectionRequest(Builder builder) {
        super(builder);
        this.connectionStringPrefix = builder.connectionStringPrefix;
        this.DBClusterId = builder.DBClusterId;
        this.engine = builder.engine;
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

    public static final class Builder extends Request.Builder<AllocateClusterPublicConnectionRequest, Builder> {
        private String connectionStringPrefix; 
        private String DBClusterId; 
        private String engine; 

        private Builder() {
            super();
        } 

        private Builder(AllocateClusterPublicConnectionRequest request) {
            super(request);
            this.connectionStringPrefix = request.connectionStringPrefix;
            this.DBClusterId = request.DBClusterId;
            this.engine = request.engine;
        } 

        /**
         * <p>The prefix of the public endpoint.</p>
         * <ul>
         * <li>The prefix can contain lowercase letters, digits, and hyphens (-). It must start with a lowercase letter.</li>
         * <li>The prefix can be up to 30 characters in length.</li>
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
         * <p>The ID of the AnalyticDB for MySQL Data Lakehouse Edition (V3.0) cluster.</p>
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
         * <p>The database engine of the cluster. Valid values:</p>
         * <ul>
         * <li><strong>AnalyticDB</strong> (default): the AnalyticDB for MySQL engine.</li>
         * <li><strong>Clickhouse</strong>: the wide table engine.</li>
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

        @Override
        public AllocateClusterPublicConnectionRequest build() {
            return new AllocateClusterPublicConnectionRequest(this);
        } 

    } 

}
