// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateRegisteredLocationRequest} extends {@link RequestModel}
 *
 * <p>UpdateRegisteredLocationRequest</p>
 */
public class UpdateRegisteredLocationRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("InventoryCollectEnabled")
    private Boolean inventoryCollectEnabled;

    @Body
    @NameInMap("LocationId")
    @Validation(required = true)
    private String locationId;

    @Body
    @NameInMap("OssLogCollectEnabled")
    private Boolean ossLogCollectEnabled;

    private UpdateRegisteredLocationRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.inventoryCollectEnabled = builder.inventoryCollectEnabled;
        this.locationId = builder.locationId;
        this.ossLogCollectEnabled = builder.ossLogCollectEnabled;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateRegisteredLocationRequest create() {
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
     * @return inventoryCollectEnabled
     */
    public Boolean getInventoryCollectEnabled() {
        return this.inventoryCollectEnabled;
    }

    /**
     * @return locationId
     */
    public String getLocationId() {
        return this.locationId;
    }

    /**
     * @return ossLogCollectEnabled
     */
    public Boolean getOssLogCollectEnabled() {
        return this.ossLogCollectEnabled;
    }

    public static final class Builder extends Request.Builder<UpdateRegisteredLocationRequest, Builder> {
        private String regionId; 
        private Boolean inventoryCollectEnabled; 
        private String locationId; 
        private Boolean ossLogCollectEnabled; 

        private Builder() {
            super();
        } 

        private Builder(UpdateRegisteredLocationRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.inventoryCollectEnabled = request.inventoryCollectEnabled;
            this.locationId = request.locationId;
            this.ossLogCollectEnabled = request.ossLogCollectEnabled;
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
         * InventoryCollectEnabled.
         */
        public Builder inventoryCollectEnabled(Boolean inventoryCollectEnabled) {
            this.putBodyParameter("InventoryCollectEnabled", inventoryCollectEnabled);
            this.inventoryCollectEnabled = inventoryCollectEnabled;
            return this;
        }

        /**
         * LocationId.
         */
        public Builder locationId(String locationId) {
            this.putBodyParameter("LocationId", locationId);
            this.locationId = locationId;
            return this;
        }

        /**
         * OssLogCollectEnabled.
         */
        public Builder ossLogCollectEnabled(Boolean ossLogCollectEnabled) {
            this.putBodyParameter("OssLogCollectEnabled", ossLogCollectEnabled);
            this.ossLogCollectEnabled = ossLogCollectEnabled;
            return this;
        }

        @Override
        public UpdateRegisteredLocationRequest build() {
            return new UpdateRegisteredLocationRequest(this);
        } 

    } 

}
