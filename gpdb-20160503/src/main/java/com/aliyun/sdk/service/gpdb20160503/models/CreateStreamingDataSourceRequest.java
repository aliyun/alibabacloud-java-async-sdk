// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateStreamingDataSourceRequest} extends {@link RequestModel}
 *
 * <p>CreateStreamingDataSourceRequest</p>
 */
public class CreateStreamingDataSourceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DataSourceConfig")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dataSourceConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DataSourceDescription")
    private String dataSourceDescription;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DataSourceName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dataSourceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DataSourceType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dataSourceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer serviceId;

    private CreateStreamingDataSourceRequest(Builder builder) {
        super(builder);
        this.DBInstanceId = builder.DBInstanceId;
        this.dataSourceConfig = builder.dataSourceConfig;
        this.dataSourceDescription = builder.dataSourceDescription;
        this.dataSourceName = builder.dataSourceName;
        this.dataSourceType = builder.dataSourceType;
        this.regionId = builder.regionId;
        this.serviceId = builder.serviceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateStreamingDataSourceRequest create() {
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
     * @return dataSourceName
     */
    public String getDataSourceName() {
        return this.dataSourceName;
    }

    /**
     * @return dataSourceType
     */
    public String getDataSourceType() {
        return this.dataSourceType;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return serviceId
     */
    public Integer getServiceId() {
        return this.serviceId;
    }

    public static final class Builder extends Request.Builder<CreateStreamingDataSourceRequest, Builder> {
        private String DBInstanceId; 
        private String dataSourceConfig; 
        private String dataSourceDescription; 
        private String dataSourceName; 
        private String dataSourceType; 
        private String regionId; 
        private Integer serviceId; 

        private Builder() {
            super();
        } 

        private Builder(CreateStreamingDataSourceRequest request) {
            super(request);
            this.DBInstanceId = request.DBInstanceId;
            this.dataSourceConfig = request.dataSourceConfig;
            this.dataSourceDescription = request.dataSourceDescription;
            this.dataSourceName = request.dataSourceName;
            this.dataSourceType = request.dataSourceType;
            this.regionId = request.regionId;
            this.serviceId = request.serviceId;
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
         * DataSourceName.
         */
        public Builder dataSourceName(String dataSourceName) {
            this.putQueryParameter("DataSourceName", dataSourceName);
            this.dataSourceName = dataSourceName;
            return this;
        }

        /**
         * DataSourceType.
         */
        public Builder dataSourceType(String dataSourceType) {
            this.putQueryParameter("DataSourceType", dataSourceType);
            this.dataSourceType = dataSourceType;
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
         * ServiceId.
         */
        public Builder serviceId(Integer serviceId) {
            this.putQueryParameter("ServiceId", serviceId);
            this.serviceId = serviceId;
            return this;
        }

        @Override
        public CreateStreamingDataSourceRequest build() {
            return new CreateStreamingDataSourceRequest(this);
        } 

    } 

}
