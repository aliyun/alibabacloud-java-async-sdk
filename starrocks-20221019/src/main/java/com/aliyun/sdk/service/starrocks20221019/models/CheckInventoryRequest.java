// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.starrocks20221019.models;

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
 * {@link CheckInventoryRequest} extends {@link RequestModel}
 *
 * <p>CheckInventoryRequest</p>
 */
public class CheckInventoryRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterInfo")
    private String clusterInfo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ZoneId")
    private String zoneId;

    private CheckInventoryRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.clusterInfo = builder.clusterInfo;
        this.zoneId = builder.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckInventoryRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return clusterInfo
     */
    public String getClusterInfo() {
        return this.clusterInfo;
    }

    /**
     * @return zoneId
     */
    public String getZoneId() {
        return this.zoneId;
    }

    public static final class Builder extends Request.Builder<CheckInventoryRequest, Builder> {
        private String regionId; 
        private String clusterInfo; 
        private String zoneId; 

        private Builder() {
            super();
        } 

        private Builder(CheckInventoryRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.clusterInfo = request.clusterInfo;
            this.zoneId = request.zoneId;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ClusterInfo.
         */
        public Builder clusterInfo(String clusterInfo) {
            this.putQueryParameter("ClusterInfo", clusterInfo);
            this.clusterInfo = clusterInfo;
            return this;
        }

        /**
         * ZoneId.
         */
        public Builder zoneId(String zoneId) {
            this.putQueryParameter("ZoneId", zoneId);
            this.zoneId = zoneId;
            return this;
        }

        @Override
        public CheckInventoryRequest build() {
            return new CheckInventoryRequest(this);
        } 

    } 

}
