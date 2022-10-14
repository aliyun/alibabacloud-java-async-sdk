// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateCatalogSettingsRequest} extends {@link RequestModel}
 *
 * <p>UpdateCatalogSettingsRequest</p>
 */
public class UpdateCatalogSettingsRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("CatalogId")
    private String catalogId;

    @Body
    @NameInMap("CatalogSettings")
    private CatalogSettings catalogSettings;

    private UpdateCatalogSettingsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.catalogId = builder.catalogId;
        this.catalogSettings = builder.catalogSettings;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateCatalogSettingsRequest create() {
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
     * @return catalogSettings
     */
    public CatalogSettings getCatalogSettings() {
        return this.catalogSettings;
    }

    public static final class Builder extends Request.Builder<UpdateCatalogSettingsRequest, Builder> {
        private String regionId; 
        private String catalogId; 
        private CatalogSettings catalogSettings; 

        private Builder() {
            super();
        } 

        private Builder(UpdateCatalogSettingsRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.catalogId = request.catalogId;
            this.catalogSettings = request.catalogSettings;
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
            this.putBodyParameter("CatalogId", catalogId);
            this.catalogId = catalogId;
            return this;
        }

        /**
         * CatalogSettings.
         */
        public Builder catalogSettings(CatalogSettings catalogSettings) {
            this.putBodyParameter("CatalogSettings", catalogSettings);
            this.catalogSettings = catalogSettings;
            return this;
        }

        @Override
        public UpdateCatalogSettingsRequest build() {
            return new UpdateCatalogSettingsRequest(this);
        } 

    } 

}
