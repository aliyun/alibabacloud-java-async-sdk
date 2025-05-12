// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.selectdb20230522.models;

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
 * {@link DeleteDBClusterBindingRequest} extends {@link RequestModel}
 *
 * <p>DeleteDBClusterBindingRequest</p>
 */
public class DeleteDBClusterBindingRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBClusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBClusterIdBak")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBClusterIdBak;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private DeleteDBClusterBindingRequest(Builder builder) {
        super(builder);
        this.DBClusterId = builder.DBClusterId;
        this.DBClusterIdBak = builder.DBClusterIdBak;
        this.DBInstanceId = builder.DBInstanceId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteDBClusterBindingRequest create() {
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
     * @return DBClusterIdBak
     */
    public String getDBClusterIdBak() {
        return this.DBClusterIdBak;
    }

    /**
     * @return DBInstanceId
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DeleteDBClusterBindingRequest, Builder> {
        private String DBClusterId; 
        private String DBClusterIdBak; 
        private String DBInstanceId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteDBClusterBindingRequest request) {
            super(request);
            this.DBClusterId = request.DBClusterId;
            this.DBClusterIdBak = request.DBClusterIdBak;
            this.DBInstanceId = request.DBInstanceId;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The ID of Cluster 1.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>selectdb-cn-7213cjv2ez-be</p>
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putQueryParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * <p>The ID of Cluster 2.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>selectdb-xxxb9f2w-be</p>
         */
        public Builder DBClusterIdBak(String DBClusterIdBak) {
            this.putQueryParameter("DBClusterIdBak", DBClusterIdBak);
            this.DBClusterIdBak = DBClusterIdBak;
            return this;
        }

        /**
         * <p>The instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>selectdb-cn-7213cjv2ez</p>
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.putQueryParameter("DBInstanceId", DBInstanceId);
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * <p>The region ID.</p>
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
        public DeleteDBClusterBindingRequest build() {
            return new DeleteDBClusterBindingRequest(this);
        } 

    } 

}
