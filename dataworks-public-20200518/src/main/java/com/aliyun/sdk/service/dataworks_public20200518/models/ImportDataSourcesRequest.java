// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ImportDataSourcesRequest} extends {@link RequestModel}
 *
 * <p>ImportDataSourcesRequest</p>
 */
public class ImportDataSourcesRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DataSources")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dataSources;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProjectId")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 10000000000D, minimum = 1)
    private Long projectId;

    private ImportDataSourcesRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.dataSources = builder.dataSources;
        this.projectId = builder.projectId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ImportDataSourcesRequest create() {
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
     * @return dataSources
     */
    public String getDataSources() {
        return this.dataSources;
    }

    /**
     * @return projectId
     */
    public Long getProjectId() {
        return this.projectId;
    }

    public static final class Builder extends Request.Builder<ImportDataSourcesRequest, Builder> {
        private String regionId; 
        private String dataSources; 
        private Long projectId; 

        private Builder() {
            super();
        } 

        private Builder(ImportDataSourcesRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.dataSources = request.dataSources;
            this.projectId = request.projectId;
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
         * The configurations of the data sources that you want to import. The Name, DataSourceType, SubType, Description, Content, and EnvType parameters are required. For more information about the parameters, see [CreateDataSource](~~211429~~).
         */
        public Builder dataSources(String dataSources) {
            this.putQueryParameter("DataSources", dataSources);
            this.dataSources = dataSources;
            return this;
        }

        /**
         * The DataWorks workspace ID. You can log on to the [DataWorks console](https://workbench.data.aliyun.com/console) and go to the Workspace page to obtain the ID.
         */
        public Builder projectId(Long projectId) {
            this.putQueryParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        @Override
        public ImportDataSourcesRequest build() {
            return new ImportDataSourcesRequest(this);
        } 

    } 

}
