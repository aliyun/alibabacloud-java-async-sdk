// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbase20170115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link OpenBackupRequest} extends {@link RequestModel}
 *
 * <p>OpenBackupRequest</p>
 */
public class OpenBackupRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ZoneId")
    private String zoneId;

    private OpenBackupRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.regionId = builder.regionId;
        this.zoneId = builder.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OpenBackupRequest create() {
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return zoneId
     */
    public String getZoneId() {
        return this.zoneId;
    }

    public static final class Builder extends Request.Builder<OpenBackupRequest, Builder> {
        private String clusterId; 
        private String regionId; 
        private String zoneId; 

        private Builder() {
            super();
        } 

        private Builder(OpenBackupRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.regionId = request.regionId;
            this.zoneId = request.zoneId;
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
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
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
        public OpenBackupRequest build() {
            return new OpenBackupRequest(this);
        } 

    } 

}
