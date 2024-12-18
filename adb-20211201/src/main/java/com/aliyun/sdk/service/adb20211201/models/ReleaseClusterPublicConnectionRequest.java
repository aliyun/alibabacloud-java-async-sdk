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

    private ReleaseClusterPublicConnectionRequest(Builder builder) {
        super(builder);
        this.DBClusterId = builder.DBClusterId;
        this.engine = builder.engine;
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

    public static final class Builder extends Request.Builder<ReleaseClusterPublicConnectionRequest, Builder> {
        private String DBClusterId; 
        private String engine; 

        private Builder() {
            super();
        } 

        private Builder(ReleaseClusterPublicConnectionRequest request) {
            super(request);
            this.DBClusterId = request.DBClusterId;
            this.engine = request.engine;
        } 

        /**
         * <p>The ID of the AnalyticDB for MySQL Data Lakehouse Edition (V3.0) cluster.</p>
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
        public ReleaseClusterPublicConnectionRequest build() {
            return new ReleaseClusterPublicConnectionRequest(this);
        } 

    } 

}
