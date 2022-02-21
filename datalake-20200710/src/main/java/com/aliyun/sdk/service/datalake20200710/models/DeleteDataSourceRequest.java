// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteDataSourceRequest} extends {@link RequestModel}
 *
 * <p>DeleteDataSourceRequest</p>
 */
public class DeleteDataSourceRequest extends Request {
    @Query
    @NameInMap("DataSourceId")
    @Validation(required = true)
    private String dataSourceId;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    private DeleteDataSourceRequest(Builder builder) {
        super(builder);
        this.dataSourceId = builder.dataSourceId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteDataSourceRequest create() {
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

    public static final class Builder extends Request.Builder<DeleteDataSourceRequest, Builder> {
        private String dataSourceId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteDataSourceRequest response) {
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
        public DeleteDataSourceRequest build() {
            return new DeleteDataSourceRequest(this);
        } 

    } 

}
