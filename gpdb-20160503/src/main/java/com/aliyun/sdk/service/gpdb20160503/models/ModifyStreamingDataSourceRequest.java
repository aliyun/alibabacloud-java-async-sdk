// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyStreamingDataSourceRequest} extends {@link RequestModel}
 *
 * <p>ModifyStreamingDataSourceRequest</p>
 */
public class ModifyStreamingDataSourceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DataSourceConfig")
    private String dataSourceConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DataSourceDescription")
    private String dataSourceDescription;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DataSourceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dataSourceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private ModifyStreamingDataSourceRequest(Builder builder) {
        super(builder);
        this.DBInstanceId = builder.DBInstanceId;
        this.dataSourceConfig = builder.dataSourceConfig;
        this.dataSourceDescription = builder.dataSourceDescription;
        this.dataSourceId = builder.dataSourceId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyStreamingDataSourceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return DBInstanceId
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * @return dataSourceConfig
     */
    public String getDataSourceConfig() {
        return this.dataSourceConfig;
    }

    /**
     * @return dataSourceDescription
     */
    public String getDataSourceDescription() {
        return this.dataSourceDescription;
    }

    /**
     * @return dataSourceId
     */
    public String getDataSourceId() {
        return this.dataSourceId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<ModifyStreamingDataSourceRequest, Builder> {
        private String DBInstanceId; 
        private String dataSourceConfig; 
        private String dataSourceDescription; 
        private String dataSourceId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyStreamingDataSourceRequest request) {
            super(request);
            this.DBInstanceId = request.DBInstanceId;
            this.dataSourceConfig = request.dataSourceConfig;
            this.dataSourceDescription = request.dataSourceDescription;
            this.dataSourceId = request.dataSourceId;
            this.regionId = request.regionId;
        } 

        /**
         * DBInstanceId.
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.putQueryParameter("DBInstanceId", DBInstanceId);
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * DataSourceConfig.
         */
        public Builder dataSourceConfig(String dataSourceConfig) {
            this.putQueryParameter("DataSourceConfig", dataSourceConfig);
            this.dataSourceConfig = dataSourceConfig;
            return this;
        }

        /**
         * DataSourceDescription.
         */
        public Builder dataSourceDescription(String dataSourceDescription) {
            this.putQueryParameter("DataSourceDescription", dataSourceDescription);
            this.dataSourceDescription = dataSourceDescription;
            return this;
        }

        /**
         * DataSourceId.
         */
        public Builder dataSourceId(String dataSourceId) {
            this.putQueryParameter("DataSourceId", dataSourceId);
            this.dataSourceId = dataSourceId;
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
        public ModifyStreamingDataSourceRequest build() {
            return new ModifyStreamingDataSourceRequest(this);
        } 

    } 

}
