// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paiabtest20240119.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteTableMetaRequest} extends {@link RequestModel}
 *
 * <p>DeleteTableMetaRequest</p>
 */
public class DeleteTableMetaRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("TableMetaId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String tableMetaId;

    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private DeleteTableMetaRequest(Builder builder) {
        super(builder);
        this.tableMetaId = builder.tableMetaId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteTableMetaRequest create() {
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

    public static final class Builder extends Request.Builder<DeleteTableMetaRequest, Builder> {
        private String tableMetaId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteTableMetaRequest request) {
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
        public DeleteTableMetaRequest build() {
            return new DeleteTableMetaRequest(this);
        } 

    } 

}
