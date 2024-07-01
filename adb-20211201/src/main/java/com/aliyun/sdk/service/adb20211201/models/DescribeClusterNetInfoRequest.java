// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeClusterNetInfoRequest} extends {@link RequestModel}
 *
 * <p>DescribeClusterNetInfoRequest</p>
 */
public class DescribeClusterNetInfoRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBClusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Engine")
    private String engine;

    private DescribeClusterNetInfoRequest(Builder builder) {
        super(builder);
        this.DBClusterId = builder.DBClusterId;
        this.engine = builder.engine;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeClusterNetInfoRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeClusterNetInfoRequest, Builder> {
        private String DBClusterId; 
        private String engine; 

        private Builder() {
            super();
        } 

        private Builder(DescribeClusterNetInfoRequest request) {
            super(request);
            this.DBClusterId = request.DBClusterId;
            this.engine = request.engine;
        } 

        /**
         * The ID of the AnalyticDB for MySQL Data Lakehouse Edition (V3.0) cluster.
         * <p>
         * 
         * > You can call the [DescribeDBClusters](~~129857~~) operation to query the information about all AnalyticDB for MySQL Data Lakehouse Edition (V3.0) clusters within a region, including cluster IDs.
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putQueryParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * Engine.
         */
        public Builder engine(String engine) {
            this.putQueryParameter("Engine", engine);
            this.engine = engine;
            return this;
        }

        @Override
        public DescribeClusterNetInfoRequest build() {
            return new DescribeClusterNetInfoRequest(this);
        } 

    } 

}
