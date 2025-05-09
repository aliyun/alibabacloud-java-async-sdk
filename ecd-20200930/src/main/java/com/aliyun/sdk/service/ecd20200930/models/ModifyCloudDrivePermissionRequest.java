// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

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
 * {@link ModifyCloudDrivePermissionRequest} extends {@link RequestModel}
 *
 * <p>ModifyCloudDrivePermissionRequest</p>
 */
public class ModifyCloudDrivePermissionRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CdsId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String cdsId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DownloadEndUserIds")
    private java.util.List<String> downloadEndUserIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DownloadUploadEndUserIds")
    private java.util.List<String> downloadUploadEndUserIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NoDownloadNoUploadEndUserIds")
    private java.util.List<String> noDownloadNoUploadEndUserIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private ModifyCloudDrivePermissionRequest(Builder builder) {
        super(builder);
        this.cdsId = builder.cdsId;
        this.downloadEndUserIds = builder.downloadEndUserIds;
        this.downloadUploadEndUserIds = builder.downloadUploadEndUserIds;
        this.noDownloadNoUploadEndUserIds = builder.noDownloadNoUploadEndUserIds;
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
    public java.util.List<String> getDownloadEndUserIds() {
        return this.downloadEndUserIds;
    }

    /**
     * @return downloadUploadEndUserIds
     */
    public java.util.List<String> getDownloadUploadEndUserIds() {
        return this.downloadUploadEndUserIds;
    }

    /**
     * @return noDownloadNoUploadEndUserIds
     */
    public java.util.List<String> getNoDownloadNoUploadEndUserIds() {
        return this.noDownloadNoUploadEndUserIds;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<ModifyCloudDrivePermissionRequest, Builder> {
        private String cdsId; 
        private java.util.List<String> downloadEndUserIds; 
        private java.util.List<String> downloadUploadEndUserIds; 
        private java.util.List<String> noDownloadNoUploadEndUserIds; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyCloudDrivePermissionRequest request) {
            super(request);
            this.cdsId = request.cdsId;
            this.downloadEndUserIds = request.downloadEndUserIds;
            this.downloadUploadEndUserIds = request.downloadUploadEndUserIds;
            this.noDownloadNoUploadEndUserIds = request.noDownloadNoUploadEndUserIds;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The ID of the cloud disk in Cloud Drive Service.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou+cds-60911*****</p>
         */
        public Builder cdsId(String cdsId) {
            this.putQueryParameter("CdsId", cdsId);
            this.cdsId = cdsId;
            return this;
        }

        /**
         * <p>The IDs of the users who have the download permissions.</p>
         */
        public Builder downloadEndUserIds(java.util.List<String> downloadEndUserIds) {
            this.putQueryParameter("DownloadEndUserIds", downloadEndUserIds);
            this.downloadEndUserIds = downloadEndUserIds;
            return this;
        }

        /**
         * <p>The IDs of the users who have the upload and download permissions.</p>
         */
        public Builder downloadUploadEndUserIds(java.util.List<String> downloadUploadEndUserIds) {
            this.putQueryParameter("DownloadUploadEndUserIds", downloadUploadEndUserIds);
            this.downloadUploadEndUserIds = downloadUploadEndUserIds;
            return this;
        }

        /**
         * NoDownloadNoUploadEndUserIds.
         */
        public Builder noDownloadNoUploadEndUserIds(java.util.List<String> noDownloadNoUploadEndUserIds) {
            this.putQueryParameter("NoDownloadNoUploadEndUserIds", noDownloadNoUploadEndUserIds);
            this.noDownloadNoUploadEndUserIds = noDownloadNoUploadEndUserIds;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
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
