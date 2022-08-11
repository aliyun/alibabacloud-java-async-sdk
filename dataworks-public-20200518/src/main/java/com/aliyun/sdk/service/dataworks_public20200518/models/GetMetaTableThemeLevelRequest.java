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
    @Query
    @NameInMap("DataSourceType")
    @Validation(required = true)
    private String dataSourceType;

    @Host
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("TableGuid")
    @Validation(required = true)
    private String tableGuid;

    private GetMetaTableThemeLevelRequest(Builder builder) {
        super(builder);
        this.dataSourceType = builder.dataSourceType;
        this.regionId = builder.regionId;
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
     * @return tableGuid
     */
    public String getTableGuid() {
        return this.tableGuid;
    }

    public static final class Builder extends Request.Builder<GetMetaTableThemeLevelRequest, Builder> {
        private String dataSourceType; 
        private String regionId; 
        private String tableGuid; 

        private Builder() {
            super();
        } 

        private Builder(GetMetaTableThemeLevelRequest request) {
            super(request);
            this.dataSourceType = request.dataSourceType;
            this.regionId = request.regionId;
            this.tableGuid = request.tableGuid;
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
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * TableGuid.
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
