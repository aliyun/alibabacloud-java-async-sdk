// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteDataSourceRequest} extends {@link RequestModel}
 *
 * <p>DeleteDataSourceRequest</p>
 */
public class DeleteDataSourceRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DataSourceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long dataSourceId;

    private DeleteDataSourceRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.dataSourceId = builder.dataSourceId;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return dataSourceId
     */
    public Long getDataSourceId() {
        return this.dataSourceId;
    }

    public static final class Builder extends Request.Builder<DeleteDataSourceRequest, Builder> {
        private String regionId; 
        private Long dataSourceId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteDataSourceRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.dataSourceId = request.dataSourceId;
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
         * The data source ID. You can call the [ListDataSources](~~211431~~) operation to query the ID.
         */
        public Builder dataSourceId(Long dataSourceId) {
            this.putQueryParameter("DataSourceId", dataSourceId);
            this.dataSourceId = dataSourceId;
            return this;
        }

        @Override
        public DeleteDataSourceRequest build() {
            return new DeleteDataSourceRequest(this);
        } 

    } 

}
