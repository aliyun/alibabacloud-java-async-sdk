// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AllocateClusterPublicConnectionRequest} extends {@link RequestModel}
 *
 * <p>AllocateClusterPublicConnectionRequest</p>
 */
public class AllocateClusterPublicConnectionRequest extends Request {
    @Query
    @NameInMap("ConnectionStringPrefix")
    private String connectionStringPrefix;

    @Query
    @NameInMap("DBClusterId")
    @Validation(required = true)
    private String DBClusterId;

    private AllocateClusterPublicConnectionRequest(Builder builder) {
        super(builder);
        this.connectionStringPrefix = builder.connectionStringPrefix;
        this.DBClusterId = builder.DBClusterId;
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

    public static final class Builder extends Request.Builder<AllocateClusterPublicConnectionRequest, Builder> {
        private String connectionStringPrefix; 
        private String DBClusterId; 

        private Builder() {
            super();
        } 

        private Builder(AllocateClusterPublicConnectionRequest request) {
            super(request);
            this.connectionStringPrefix = request.connectionStringPrefix;
            this.DBClusterId = request.DBClusterId;
        } 

        /**
         * The prefix of the public endpoint.
         * <p>
         * 
         * *   The prefix can contain lowercase letters, digits, and hyphens (-). It must start with a lowercase letter.
         * *   The prefix can be up to 30 characters in length.
         */
        public Builder connectionStringPrefix(String connectionStringPrefix) {
            this.putQueryParameter("ConnectionStringPrefix", connectionStringPrefix);
            this.connectionStringPrefix = connectionStringPrefix;
            return this;
        }

        /**
         * The ID of the AnalyticDB for MySQL Data Lakehouse Edition (V3.0) cluster.
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putQueryParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        @Override
        public AllocateClusterPublicConnectionRequest build() {
            return new AllocateClusterPublicConnectionRequest(this);
        } 

    } 

}
