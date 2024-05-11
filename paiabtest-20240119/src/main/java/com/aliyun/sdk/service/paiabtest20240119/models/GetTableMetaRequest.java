// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paiabtest20240119.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetTableMetaRequest} extends {@link RequestModel}
 *
 * <p>GetTableMetaRequest</p>
 */
public class GetTableMetaRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("TableMetaId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String tableMetaId;

    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private GetTableMetaRequest(Builder builder) {
        super(builder);
        this.tableMetaId = builder.tableMetaId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTableMetaRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return tableMetaId
     */
    public String getTableMetaId() {
        return this.tableMetaId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<GetTableMetaRequest, Builder> {
        private String tableMetaId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(GetTableMetaRequest request) {
            super(request);
            this.tableMetaId = request.tableMetaId;
            this.regionId = request.regionId;
        } 

        /**
         * TableMetaId.
         */
        public Builder tableMetaId(String tableMetaId) {
            this.putPathParameter("TableMetaId", tableMetaId);
            this.tableMetaId = tableMetaId;
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

        @Override
        public GetTableMetaRequest build() {
            return new GetTableMetaRequest(this);
        } 

    } 

}
