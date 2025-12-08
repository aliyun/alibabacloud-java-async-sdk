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
 * {@link ModifyVirtualClusterRequest} extends {@link RequestModel}
 *
 * <p>ModifyVirtualClusterRequest</p>
 */
public class ModifyVirtualClusterRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ActiveClusterId")
    private String activeClusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBClusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StandbyClusterId")
    private String standbyClusterId;

    private ModifyVirtualClusterRequest(Builder builder) {
        super(builder);
        this.activeClusterId = builder.activeClusterId;
        this.DBClusterId = builder.DBClusterId;
        this.DBInstanceId = builder.DBInstanceId;
        this.regionId = builder.regionId;
        this.standbyClusterId = builder.standbyClusterId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyVirtualClusterRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return activeClusterId
     */
    public String getActiveClusterId() {
        return this.activeClusterId;
    }

    /**
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
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

    /**
     * @return standbyClusterId
     */
    public String getStandbyClusterId() {
        return this.standbyClusterId;
    }

    public static final class Builder extends Request.Builder<ModifyVirtualClusterRequest, Builder> {
        private String activeClusterId; 
        private String DBClusterId; 
        private String DBInstanceId; 
        private String regionId; 
        private String standbyClusterId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyVirtualClusterRequest request) {
            super(request);
            this.activeClusterId = request.activeClusterId;
            this.DBClusterId = request.DBClusterId;
            this.DBInstanceId = request.DBInstanceId;
            this.regionId = request.regionId;
            this.standbyClusterId = request.standbyClusterId;
        } 

        /**
         * ActiveClusterId.
         */
        public Builder activeClusterId(String activeClusterId) {
            this.putQueryParameter("ActiveClusterId", activeClusterId);
            this.activeClusterId = activeClusterId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>selectdb-vcg-b****-be</p>
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putQueryParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>selectdb-cn-7213cjv****</p>
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.putQueryParameter("DBInstanceId", DBInstanceId);
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
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

        /**
         * StandbyClusterId.
         */
        public Builder standbyClusterId(String standbyClusterId) {
            this.putQueryParameter("StandbyClusterId", standbyClusterId);
            this.standbyClusterId = standbyClusterId;
            return this;
        }

        @Override
        public ModifyVirtualClusterRequest build() {
            return new ModifyVirtualClusterRequest(this);
        } 

    } 

}
