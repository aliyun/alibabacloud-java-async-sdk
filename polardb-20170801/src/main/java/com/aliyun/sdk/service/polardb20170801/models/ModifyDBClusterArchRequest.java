// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link ModifyDBClusterArchRequest} extends {@link RequestModel}
 *
 * <p>ModifyDBClusterArchRequest</p>
 */
public class ModifyDBClusterArchRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    private String DBClusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HotStandbyCluster")
    private String hotStandbyCluster;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StandbyAZ")
    private String standbyAZ;

    private ModifyDBClusterArchRequest(Builder builder) {
        super(builder);
        this.DBClusterId = builder.DBClusterId;
        this.hotStandbyCluster = builder.hotStandbyCluster;
        this.regionId = builder.regionId;
        this.standbyAZ = builder.standbyAZ;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDBClusterArchRequest create() {
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
     * @return hotStandbyCluster
     */
    public String getHotStandbyCluster() {
        return this.hotStandbyCluster;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return standbyAZ
     */
    public String getStandbyAZ() {
        return this.standbyAZ;
    }

    public static final class Builder extends Request.Builder<ModifyDBClusterArchRequest, Builder> {
        private String DBClusterId; 
        private String hotStandbyCluster; 
        private String regionId; 
        private String standbyAZ; 

        private Builder() {
            super();
        } 

        private Builder(ModifyDBClusterArchRequest request) {
            super(request);
            this.DBClusterId = request.DBClusterId;
            this.hotStandbyCluster = request.hotStandbyCluster;
            this.regionId = request.regionId;
            this.standbyAZ = request.standbyAZ;
        } 

        /**
         * DBClusterId.
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putQueryParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * HotStandbyCluster.
         */
        public Builder hotStandbyCluster(String hotStandbyCluster) {
            this.putQueryParameter("HotStandbyCluster", hotStandbyCluster);
            this.hotStandbyCluster = hotStandbyCluster;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * StandbyAZ.
         */
        public Builder standbyAZ(String standbyAZ) {
            this.putQueryParameter("StandbyAZ", standbyAZ);
            this.standbyAZ = standbyAZ;
            return this;
        }

        @Override
        public ModifyDBClusterArchRequest build() {
            return new ModifyDBClusterArchRequest(this);
        } 

    } 

}
