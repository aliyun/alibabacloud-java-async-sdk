// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateDataSourceRequest} extends {@link RequestModel}
 *
 * <p>UpdateDataSourceRequest</p>
 */
public class UpdateDataSourceRequest extends Request {
    @Body
    @NameInMap("ConnectionInfo")
    private String connectionInfo;

    @Body
    @NameInMap("DataSourceId")
    private String dataSourceId;

    @Body
    @NameInMap("DataSourceType")
    private String dataSourceType;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    private UpdateDataSourceRequest(Builder builder) {
        super(builder);
        this.connectionInfo = builder.connectionInfo;
        this.dataSourceId = builder.dataSourceId;
        this.dataSourceType = builder.dataSourceType;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateDataSourceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return connectionInfo
     */
    public String getConnectionInfo() {
        return this.connectionInfo;
    }

    /**
     * @return dataSourceId
     */
    public String getDataSourceId() {
        return this.dataSourceId;
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

    public static final class Builder extends Request.Builder<UpdateDataSourceRequest, Builder> {
        private String connectionInfo; 
        private String dataSourceId; 
        private String dataSourceType; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateDataSourceRequest response) {
            super(response);
            this.connectionInfo = response.connectionInfo;
            this.dataSourceId = response.dataSourceId;
            this.dataSourceType = response.dataSourceType;
            this.regionId = response.regionId;
        } 

        /**
         * ConnectionInfo.
         */
        public Builder connectionInfo(String connectionInfo) {
            this.putBodyParameter("ConnectionInfo", connectionInfo);
            this.connectionInfo = connectionInfo;
            return this;
        }

        /**
         * DataSourceId.
         */
        public Builder dataSourceId(String dataSourceId) {
            this.putBodyParameter("DataSourceId", dataSourceId);
            this.dataSourceId = dataSourceId;
            return this;
        }

        /**
         * DataSourceType.
         */
        public Builder dataSourceType(String dataSourceType) {
            this.putBodyParameter("DataSourceType", dataSourceType);
            this.dataSourceType = dataSourceType;
            return this;
        }

        /**
         * RegionId
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public UpdateDataSourceRequest build() {
            return new UpdateDataSourceRequest(this);
        } 

    } 

}
