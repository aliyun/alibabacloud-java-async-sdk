// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetMetaTableThemeLevelRequest} extends {@link RequestModel}
 *
 * <p>GetMetaTableThemeLevelRequest</p>
 */
public class GetMetaTableThemeLevelRequest extends Request {
    @Host
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("DataSourceType")
    @Validation(required = true)
    private String dataSourceType;

    @Query
    @NameInMap("TableGuid")
    @Validation(required = true)
    private String tableGuid;

    private GetMetaTableThemeLevelRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.dataSourceType = builder.dataSourceType;
        this.tableGuid = builder.tableGuid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMetaTableThemeLevelRequest create() {
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
     * @return dataSourceType
     */
    public String getDataSourceType() {
        return this.dataSourceType;
    }

    /**
     * @return tableGuid
     */
    public String getTableGuid() {
        return this.tableGuid;
    }

    public static final class Builder extends Request.Builder<GetMetaTableThemeLevelRequest, Builder> {
        private String regionId; 
        private String dataSourceType; 
        private String tableGuid; 

        private Builder() {
            super();
        } 

        private Builder(GetMetaTableThemeLevelRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.dataSourceType = request.dataSourceType;
            this.tableGuid = request.tableGuid;
        } 

        /**
         * The ID of the region in which DataWorks is activated. For example, the ID of the China (Shanghai) region is cn-shanghai, and that of the China (Zhangjiakou) region is cn-zhangjiakou. The system automatically determines the value of this parameter based on the endpoint that is used to call the operation.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The type of the data source. Set the value to odps.
         */
        public Builder dataSourceType(String dataSourceType) {
            this.putQueryParameter("DataSourceType", dataSourceType);
            this.dataSourceType = dataSourceType;
            return this;
        }

        /**
         * The globally unique identifier (GUID) of the table. Specify the GUID in the format of odps.${projectName}.${tableName}.
         */
        public Builder tableGuid(String tableGuid) {
            this.putQueryParameter("TableGuid", tableGuid);
            this.tableGuid = tableGuid;
            return this;
        }

        @Override
        public GetMetaTableThemeLevelRequest build() {
            return new GetMetaTableThemeLevelRequest(this);
        } 

    } 

}
