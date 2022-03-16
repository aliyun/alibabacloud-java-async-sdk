// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbase20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link XpackRelateDBRequest} extends {@link RequestModel}
 *
 * <p>XpackRelateDBRequest</p>
 */
public class XpackRelateDBRequest extends Request {
    @Query
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Query
    @NameInMap("DbClusterIds")
    @Validation(required = true)
    private String dbClusterIds;

    @Query
    @NameInMap("RelateDbType")
    @Validation(required = true)
    private String relateDbType;

    private XpackRelateDBRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.dbClusterIds = builder.dbClusterIds;
        this.relateDbType = builder.relateDbType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static XpackRelateDBRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return dbClusterIds
     */
    public String getDbClusterIds() {
        return this.dbClusterIds;
    }

    /**
     * @return relateDbType
     */
    public String getRelateDbType() {
        return this.relateDbType;
    }

    public static final class Builder extends Request.Builder<XpackRelateDBRequest, Builder> {
        private String clusterId; 
        private String dbClusterIds; 
        private String relateDbType; 

        private Builder() {
            super();
        } 

        private Builder(XpackRelateDBRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.dbClusterIds = request.dbClusterIds;
            this.relateDbType = request.relateDbType;
        } 

        /**
         * ClusterId.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * DbClusterIds.
         */
        public Builder dbClusterIds(String dbClusterIds) {
            this.putQueryParameter("DbClusterIds", dbClusterIds);
            this.dbClusterIds = dbClusterIds;
            return this;
        }

        /**
         * RelateDbType.
         */
        public Builder relateDbType(String relateDbType) {
            this.putQueryParameter("RelateDbType", relateDbType);
            this.relateDbType = relateDbType;
            return this;
        }

        @Override
        public XpackRelateDBRequest build() {
            return new XpackRelateDBRequest(this);
        } 

    } 

}
