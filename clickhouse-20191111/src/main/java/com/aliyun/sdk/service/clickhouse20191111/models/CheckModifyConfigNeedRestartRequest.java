// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.clickhouse20191111.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CheckModifyConfigNeedRestartRequest} extends {@link RequestModel}
 *
 * <p>CheckModifyConfigNeedRestartRequest</p>
 */
public class CheckModifyConfigNeedRestartRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Config")
    @com.aliyun.core.annotation.Validation(required = true)
    private String config;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBClusterId;

    private CheckModifyConfigNeedRestartRequest(Builder builder) {
        super(builder);
        this.config = builder.config;
        this.DBClusterId = builder.DBClusterId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckModifyConfigNeedRestartRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return config
     */
    public String getConfig() {
        return this.config;
    }

    /**
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public static final class Builder extends Request.Builder<CheckModifyConfigNeedRestartRequest, Builder> {
        private String config; 
        private String DBClusterId; 

        private Builder() {
            super();
        } 

        private Builder(CheckModifyConfigNeedRestartRequest request) {
            super(request);
            this.config = request.config;
            this.DBClusterId = request.DBClusterId;
        } 

        /**
         * The configuration parameters whose settings are modified.
         */
        public Builder config(String config) {
            this.putQueryParameter("Config", config);
            this.config = config;
            return this;
        }

        /**
         * The cluster ID. You can call the [DescribeDBClusters](~~170879~~) operation to query information about all the clusters that are deployed in a specific region. The information includes the cluster IDs.
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putQueryParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        @Override
        public CheckModifyConfigNeedRestartRequest build() {
            return new CheckModifyConfigNeedRestartRequest(this);
        } 

    } 

}
