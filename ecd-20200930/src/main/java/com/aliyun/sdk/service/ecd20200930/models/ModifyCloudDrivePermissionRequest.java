// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyCloudDrivePermissionRequest} extends {@link RequestModel}
 *
 * <p>ModifyCloudDrivePermissionRequest</p>
 */
public class ModifyCloudDrivePermissionRequest extends Request {
    @Query
    @NameInMap("CdsId")
    @Validation(required = true)
    private String cdsId;

    @Query
    @NameInMap("DownloadEndUserIds")
    private java.util.List < String > downloadEndUserIds;

    @Query
    @NameInMap("DownloadUploadEndUserIds")
    private java.util.List < String > downloadUploadEndUserIds;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private ModifyCloudDrivePermissionRequest(Builder builder) {
        super(builder);
        this.cdsId = builder.cdsId;
        this.downloadEndUserIds = builder.downloadEndUserIds;
        this.downloadUploadEndUserIds = builder.downloadUploadEndUserIds;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyCloudDrivePermissionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cdsId
     */
    public String getCdsId() {
        return this.cdsId;
    }

    /**
     * @return downloadEndUserIds
     */
    public java.util.List < String > getDownloadEndUserIds() {
        return this.downloadEndUserIds;
    }

    /**
     * @return downloadUploadEndUserIds
     */
    public java.util.List < String > getDownloadUploadEndUserIds() {
        return this.downloadUploadEndUserIds;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<ModifyCloudDrivePermissionRequest, Builder> {
        private String cdsId; 
        private java.util.List < String > downloadEndUserIds; 
        private java.util.List < String > downloadUploadEndUserIds; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyCloudDrivePermissionRequest request) {
            super(request);
            this.cdsId = request.cdsId;
            this.downloadEndUserIds = request.downloadEndUserIds;
            this.downloadUploadEndUserIds = request.downloadUploadEndUserIds;
            this.regionId = request.regionId;
        } 

        /**
         * The ID of the cloud disk in Cloud Drive Service.
         */
        public Builder cdsId(String cdsId) {
            this.putQueryParameter("CdsId", cdsId);
            this.cdsId = cdsId;
            return this;
        }

        /**
         * The IDs of the users who have the download permissions.
         */
        public Builder downloadEndUserIds(java.util.List < String > downloadEndUserIds) {
            this.putQueryParameter("DownloadEndUserIds", downloadEndUserIds);
            this.downloadEndUserIds = downloadEndUserIds;
            return this;
        }

        /**
         * The IDs of the users who have the upload and download permissions.
         */
        public Builder downloadUploadEndUserIds(java.util.List < String > downloadUploadEndUserIds) {
            this.putQueryParameter("DownloadUploadEndUserIds", downloadUploadEndUserIds);
            this.downloadUploadEndUserIds = downloadUploadEndUserIds;
            return this;
        }

        /**
         * The region ID.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public ModifyCloudDrivePermissionRequest build() {
            return new ModifyCloudDrivePermissionRequest(this);
        } 

    } 

}
