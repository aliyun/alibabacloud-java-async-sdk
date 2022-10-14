// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteCatalogRequest} extends {@link RequestModel}
 *
 * <p>DeleteCatalogRequest</p>
 */
public class DeleteCatalogRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("CatalogId")
    @Validation(required = true)
    private String catalogId;

    @Query
    @NameInMap("IsAsync")
    private Boolean isAsync;

    private DeleteCatalogRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.catalogId = builder.catalogId;
        this.isAsync = builder.isAsync;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteCatalogRequest create() {
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
     * @return catalogId
     */
    public String getCatalogId() {
        return this.catalogId;
    }

    /**
     * @return isAsync
     */
    public Boolean getIsAsync() {
        return this.isAsync;
    }

    public static final class Builder extends Request.Builder<DeleteCatalogRequest, Builder> {
        private String regionId; 
        private String catalogId; 
        private Boolean isAsync; 

        private Builder() {
            super();
        } 

        private Builder(DeleteCatalogRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.catalogId = request.catalogId;
            this.isAsync = request.isAsync;
        } 

        /**
         * RegionId
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * CatalogId
         */
        public Builder catalogId(String catalogId) {
            this.putQueryParameter("CatalogId", catalogId);
            this.catalogId = catalogId;
            return this;
        }

        /**
         * 是否异步，默认同步
         */
        public Builder isAsync(Boolean isAsync) {
            this.putQueryParameter("IsAsync", isAsync);
            this.isAsync = isAsync;
            return this;
        }

        @Override
        public DeleteCatalogRequest build() {
            return new DeleteCatalogRequest(this);
        } 

    } 

}
