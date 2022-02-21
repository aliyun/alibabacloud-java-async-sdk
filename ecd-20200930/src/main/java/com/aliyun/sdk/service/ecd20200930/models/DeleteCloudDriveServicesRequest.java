// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteCloudDriveServicesRequest} extends {@link RequestModel}
 *
 * <p>DeleteCloudDriveServicesRequest</p>
 */
public class DeleteCloudDriveServicesRequest extends Request {
    @Query
    @NameInMap("CdsId")
    @Validation(required = true)
    private java.util.List < String > cdsId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private DeleteCloudDriveServicesRequest(Builder builder) {
        super(builder);
        this.cdsId = builder.cdsId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteCloudDriveServicesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cdsId
     */
    public java.util.List < String > getCdsId() {
        return this.cdsId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DeleteCloudDriveServicesRequest, Builder> {
        private java.util.List < String > cdsId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteCloudDriveServicesRequest response) {
            super(response);
            this.cdsId = response.cdsId;
            this.regionId = response.regionId;
        } 

        /**
         * CdsId.
         */
        public Builder cdsId(java.util.List < String > cdsId) {
            this.putQueryParameter("CdsId", cdsId);
            this.cdsId = cdsId;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public DeleteCloudDriveServicesRequest build() {
            return new DeleteCloudDriveServicesRequest(this);
        } 

    } 

}
