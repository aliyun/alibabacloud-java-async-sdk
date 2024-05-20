// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.clickhouse20191111.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyDBClusterConfigInXMLRequest} extends {@link RequestModel}
 *
 * <p>ModifyDBClusterConfigInXMLRequest</p>
 */
public class ModifyDBClusterConfigInXMLRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Config")
    @com.aliyun.core.annotation.Validation(required = true)
    private String config;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBClusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Reason")
    private String reason;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
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
         * The configuration parameters whose settings you want to modify. You can call the [DescribeDBClusterConfigInXML](~~452210~~) operation to query configuration parameters, and modify the settings of the returned configuration parameters.
         * <p>
         * 
         * > You must specify all configuration parameters even when you want to modify the setting of a single parameter. If a configuration parameter is not specified, the original value of this parameter is retained or the modification fails.
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

        /**
         * The reason for the modification.
         */
        public Builder reason(String reason) {
            this.putQueryParameter("Reason", reason);
            this.reason = reason;
            return this;
        }

        /**
         * The region ID of the cluster. You can call the [DescribeRegions](~~170875~~) operation to query the most recent region list.
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
