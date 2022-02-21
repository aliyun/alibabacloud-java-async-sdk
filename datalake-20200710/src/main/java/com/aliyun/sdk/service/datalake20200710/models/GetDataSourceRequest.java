// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDataSourceRequest} extends {@link RequestModel}
 *
 * <p>GetDataSourceRequest</p>
 */
public class GetDataSourceRequest extends Request {
    @Query
    @NameInMap("DataSourceId")
    @Validation(required = true)
    private String dataSourceId;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    private GetDataSourceRequest(Builder builder) {
        super(builder);
        this.dataSourceId = builder.dataSourceId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDataSourceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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

    public static final class Builder extends Request.Builder<GetDataSourceRequest, Builder> {
        private String dataSourceId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(GetDataSourceRequest response) {
            super(response);
            this.dataSourceId = response.dataSourceId;
            this.regionId = response.regionId;
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
         * RegionId
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public GetDataSourceRequest build() {
            return new GetDataSourceRequest(this);
        } 

    } 

}
