// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteDriveRequest} extends {@link RequestModel}
 *
 * <p>DeleteDriveRequest</p>
 */
public class DeleteDriveRequest extends Request {
    @Query
    @NameInMap("DriveId")
    private String driveId;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    private DeleteDriveRequest(Builder builder) {
        super(builder);
        this.driveId = builder.driveId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteDriveRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return driveId
     */
    public String getDriveId() {
        return this.driveId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DeleteDriveRequest, Builder> {
        private String driveId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteDriveRequest request) {
            super(request);
            this.driveId = request.driveId;
            this.regionId = request.regionId;
        } 

        /**
         * DriveId.
         */
        public Builder driveId(String driveId) {
            this.putQueryParameter("DriveId", driveId);
            this.driveId = driveId;
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
        public DeleteDriveRequest build() {
            return new DeleteDriveRequest(this);
        } 

    } 

}
