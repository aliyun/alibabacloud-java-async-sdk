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
 * {@link ImportDriveRequest} extends {@link RequestModel}
 *
 * <p>ImportDriveRequest</p>
 */
public class ImportDriveRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String domainId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndUserId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String endUserId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ForceUpdate")
    private Boolean forceUpdate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MountUrl")
    private String mountUrl;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Platform")
    @com.aliyun.core.annotation.Validation(required = true)
    private String platform;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private ImportDriveRequest(Builder builder) {
        super(builder);
        this.domainId = builder.domainId;
        this.endUserId = builder.endUserId;
        this.forceUpdate = builder.forceUpdate;
        this.mountUrl = builder.mountUrl;
        this.platform = builder.platform;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ImportDriveRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return domainId
     */
    public String getDomainId() {
        return this.domainId;
    }

    /**
     * @return endUserId
     */
    public String getEndUserId() {
        return this.endUserId;
    }

    /**
     * @return forceUpdate
     */
    public Boolean getForceUpdate() {
        return this.forceUpdate;
    }

    /**
     * @return mountUrl
     */
    public String getMountUrl() {
        return this.mountUrl;
    }

    /**
     * @return platform
     */
    public String getPlatform() {
        return this.platform;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<ImportDriveRequest, Builder> {
        private String domainId; 
        private String endUserId; 
        private Boolean forceUpdate; 
        private String mountUrl; 
        private String platform; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ImportDriveRequest request) {
            super(request);
            this.domainId = request.domainId;
            this.endUserId = request.endUserId;
            this.forceUpdate = request.forceUpdate;
            this.mountUrl = request.mountUrl;
            this.platform = request.platform;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The target UPM domain ID. For workspace scenarios, use the UpmDomainId instead of the NAS file system ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>dom-aaaa****</p>
         */
        public Builder domainId(String domainId) {
            this.putQueryParameter("DomainId", domainId);
            this.domainId = domainId;
            return this;
        }

        /**
         * <p>The target ECD end user ID. The caller account is obtained from the authentication context.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>user01</p>
         */
        public Builder endUserId(String endUserId) {
            this.putQueryParameter("EndUserId", endUserId);
            this.endUserId = endUserId;
            return this;
        }

        /**
         * <p>Specifies whether to force an update. Default value: false. If the file already exists and this parameter is set to false, the request fails. If this parameter is set to true, the original DriveId is reused for the update.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder forceUpdate(Boolean forceUpdate) {
            this.putQueryParameter("ForceUpdate", forceUpdate);
            this.forceUpdate = forceUpdate;
            return this;
        }

        /**
         * <p>The relative path of the cloud application UPM. It must be the same as the path specified during upload authorization. For cloud desktops, do not pass this parameter or pass an empty value.</p>
         * 
         * <strong>example:</strong>
         * <p>appv1/ab****</p>
         */
        public Builder mountUrl(String mountUrl) {
            this.putQueryParameter("MountUrl", mountUrl);
            this.mountUrl = mountUrl;
            return this;
        }

        /**
         * <p>The target platform. Valid values: WINDOWS_10, WINDOWS_11, WINDOWS_SERVER_2019, WINDOWS_SERVER_2022, and WINDOWS_SERVER_2025.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>WINDOWS_SERVER_2025</p>
         */
        public Builder platform(String platform) {
            this.putQueryParameter("Platform", platform);
            this.platform = platform;
            return this;
        }

        /**
         * <p>The region of the target UPM.</p>
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
        public ImportDriveRequest build() {
            return new ImportDriveRequest(this);
        } 

    } 

}
