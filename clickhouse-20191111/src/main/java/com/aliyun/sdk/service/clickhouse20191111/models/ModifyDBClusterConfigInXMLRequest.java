// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.clickhouse20191111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyDBClusterConfigInXMLRequest} extends {@link RequestModel}
 *
 * <p>ModifyDBClusterConfigInXMLRequest</p>
 */
public class ModifyDBClusterConfigInXMLRequest extends Request {
    @Query
    @NameInMap("Config")
    @Validation(required = true)
    private String config;

    @Query
    @NameInMap("DBClusterId")
    @Validation(required = true)
    private String DBClusterId;

    @Query
    @NameInMap("Reason")
    private String reason;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    private ModifyDBClusterConfigInXMLRequest(Builder builder) {
        super(builder);
        this.config = builder.config;
        this.DBClusterId = builder.DBClusterId;
        this.reason = builder.reason;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDBClusterConfigInXMLRequest create() {
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

    /**
     * @return reason
     */
    public String getReason() {
        return this.reason;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<ModifyDBClusterConfigInXMLRequest, Builder> {
        private String config; 
        private String DBClusterId; 
        private String reason; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyDBClusterConfigInXMLRequest request) {
            super(request);
            this.config = request.config;
            this.DBClusterId = request.DBClusterId;
            this.reason = request.reason;
            this.regionId = request.regionId;
        } 

        /**
         * Config.
         */
        public Builder config(String config) {
            this.putQueryParameter("Config", config);
            this.config = config;
            return this;
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
         * Reason.
         */
        public Builder reason(String reason) {
            this.putQueryParameter("Reason", reason);
            this.reason = reason;
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

        @Override
        public ModifyDBClusterConfigInXMLRequest build() {
            return new ModifyDBClusterConfigInXMLRequest(this);
        } 

    } 

}
