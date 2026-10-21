// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms20250414.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DeleteAgenticDataSourceRequest} extends {@link RequestModel}
 *
 * <p>DeleteAgenticDataSourceRequest</p>
 */
public class DeleteAgenticDataSourceRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DataSourceUuid")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dataSourceUuid;

    private DeleteAgenticDataSourceRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.dataSourceUuid = builder.dataSourceUuid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteAgenticDataSourceRequest create() {
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
     * @return dataSourceUuid
     */
    public String getDataSourceUuid() {
        return this.dataSourceUuid;
    }

    public static final class Builder extends Request.Builder<DeleteAgenticDataSourceRequest, Builder> {
        private String regionId; 
        private String dataSourceUuid; 

        private Builder() {
            super();
        } 

        private Builder(DeleteAgenticDataSourceRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.dataSourceUuid = request.dataSourceUuid;
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
         * <p>The UUID of the data source to delete. Ensure that no workloads are using the data source before deletion.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou_a1b2c3d4e5f6</p>
         */
        public Builder dataSourceUuid(String dataSourceUuid) {
            this.putQueryParameter("DataSourceUuid", dataSourceUuid);
            this.dataSourceUuid = dataSourceUuid;
            return this;
        }

        @Override
        public DeleteAgenticDataSourceRequest build() {
            return new DeleteAgenticDataSourceRequest(this);
        } 

    } 

}
