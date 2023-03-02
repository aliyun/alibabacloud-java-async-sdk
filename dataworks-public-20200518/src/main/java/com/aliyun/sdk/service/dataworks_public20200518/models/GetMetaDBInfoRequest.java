// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetMetaDBInfoRequest} extends {@link RequestModel}
 *
 * <p>GetMetaDBInfoRequest</p>
 */
public class GetMetaDBInfoRequest extends Request {
    @Host
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("AppGuid")
    private String appGuid;

    @Query
    @NameInMap("ClusterId")
    private String clusterId;

    @Query
    @NameInMap("DataSourceType")
    private String dataSourceType;

    @Query
    @NameInMap("DatabaseName")
    private String databaseName;

    private GetMetaDBInfoRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.appGuid = builder.appGuid;
        this.clusterId = builder.clusterId;
        this.dataSourceType = builder.dataSourceType;
        this.databaseName = builder.databaseName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMetaDBInfoRequest create() {
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
     * @return appGuid
     */
    public String getAppGuid() {
        return this.appGuid;
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return dataSourceType
     */
    public String getDataSourceType() {
        return this.dataSourceType;
    }

    /**
     * @return databaseName
     */
    public String getDatabaseName() {
        return this.databaseName;
    }

    public static final class Builder extends Request.Builder<GetMetaDBInfoRequest, Builder> {
        private String regionId; 
        private String appGuid; 
        private String clusterId; 
        private String dataSourceType; 
        private String databaseName; 

        private Builder() {
            super();
        } 

        private Builder(GetMetaDBInfoRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.appGuid = request.appGuid;
            this.clusterId = request.clusterId;
            this.dataSourceType = request.dataSourceType;
            this.databaseName = request.databaseName;
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
         * The ID of the compute engine instance. Specify the ID in the Engine type.Engine name format.
         */
        public Builder appGuid(String appGuid) {
            this.putQueryParameter("AppGuid", appGuid);
            this.appGuid = appGuid;
            return this;
        }

        /**
         * The ID of the EMR cluster. This parameter is required only if you set the DataSourceType parameter to emr.
         * <p>
         * 
         * You can log on to the [EMR console](https://emr.console.aliyun.com/?spm=a2c4g.11186623.0.0.965cc5c2GeiHet#/cn-hangzhou) to obtain the ID of the EMR cluster.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * The type of the data source. Valid values: odps and emr.
         */
        public Builder dataSourceType(String dataSourceType) {
            this.putQueryParameter("DataSourceType", dataSourceType);
            this.dataSourceType = dataSourceType;
            return this;
        }

        /**
         * The name of the metadatabase. This parameter is required only if you set the DataSourceType parameter to emr.
         * <p>
         * 
         * You can call the [ListMetaDB](~~185662~~) operation to query the name of the metadatabase.
         */
        public Builder databaseName(String databaseName) {
            this.putQueryParameter("DatabaseName", databaseName);
            this.databaseName = databaseName;
            return this;
        }

        @Override
        public GetMetaDBInfoRequest build() {
            return new GetMetaDBInfoRequest(this);
        } 

    } 

}
