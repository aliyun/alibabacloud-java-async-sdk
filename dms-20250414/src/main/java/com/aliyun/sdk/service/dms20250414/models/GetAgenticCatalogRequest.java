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
 * {@link GetAgenticCatalogRequest} extends {@link RequestModel}
 *
 * <p>GetAgenticCatalogRequest</p>
 */
public class GetAgenticCatalogRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CatalogUuid")
    @com.aliyun.core.annotation.Validation(required = true)
    private String catalogUuid;

    private GetAgenticCatalogRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.catalogUuid = builder.catalogUuid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAgenticCatalogRequest create() {
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
     * @return catalogUuid
     */
    public String getCatalogUuid() {
        return this.catalogUuid;
    }

    public static final class Builder extends Request.Builder<GetAgenticCatalogRequest, Builder> {
        private String regionId; 
        private String catalogUuid; 

        private Builder() {
            super();
        } 

        private Builder(GetAgenticCatalogRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.catalogUuid = request.catalogUuid;
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
         * <p>The catalog UUID. You can obtain it by calling ListAgenticCatalog or SearchAgenticCatalog.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>mc-HZ-OfjcNc2z***</p>
         */
        public Builder catalogUuid(String catalogUuid) {
            this.putQueryParameter("CatalogUuid", catalogUuid);
            this.catalogUuid = catalogUuid;
            return this;
        }

        @Override
        public GetAgenticCatalogRequest build() {
            return new GetAgenticCatalogRequest(this);
        } 

    } 

}
