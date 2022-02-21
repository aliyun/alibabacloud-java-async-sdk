// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GenerateSdkDownloadInfoRequest} extends {@link RequestModel}
 *
 * <p>GenerateSdkDownloadInfoRequest</p>
 */
public class GenerateSdkDownloadInfoRequest extends Request {
    @Query
    @NameInMap("AppId")
    @Validation(required = true)
    private String appId;

    @Query
    @NameInMap("CertFileObjectKey")
    @Validation(required = true)
    private String certFileObjectKey;

    @Query
    @NameInMap("OsType")
    @Validation(required = true)
    private Integer osType;

    @Query
    @NameInMap("PkgName")
    @Validation(required = true)
    private String pkgName;

    @Query
    @NameInMap("ProjectId")
    @Validation(required = true)
    private String projectId;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("Sdks")
    @Validation(required = true)
    private String sdks;

    private GenerateSdkDownloadInfoRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.certFileObjectKey = builder.certFileObjectKey;
        this.osType = builder.osType;
        this.pkgName = builder.pkgName;
        this.projectId = builder.projectId;
        this.regionId = builder.regionId;
        this.sdks = builder.sdks;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GenerateSdkDownloadInfoRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return certFileObjectKey
     */
    public String getCertFileObjectKey() {
        return this.certFileObjectKey;
    }

    /**
     * @return osType
     */
    public Integer getOsType() {
        return this.osType;
    }

    /**
     * @return pkgName
     */
    public String getPkgName() {
        return this.pkgName;
    }

    /**
     * @return projectId
     */
    public String getProjectId() {
        return this.projectId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return sdks
     */
    public String getSdks() {
        return this.sdks;
    }

    public static final class Builder extends Request.Builder<GenerateSdkDownloadInfoRequest, Builder> {
        private String appId; 
        private String certFileObjectKey; 
        private Integer osType; 
        private String pkgName; 
        private String projectId; 
        private String regionId; 
        private String sdks; 

        private Builder() {
            super();
        } 

        private Builder(GenerateSdkDownloadInfoRequest response) {
            super(response);
            this.appId = response.appId;
            this.certFileObjectKey = response.certFileObjectKey;
            this.osType = response.osType;
            this.pkgName = response.pkgName;
            this.projectId = response.projectId;
            this.regionId = response.regionId;
            this.sdks = response.sdks;
        } 

        /**
         * AppId.
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * CertFileObjectKey.
         */
        public Builder certFileObjectKey(String certFileObjectKey) {
            this.putQueryParameter("CertFileObjectKey", certFileObjectKey);
            this.certFileObjectKey = certFileObjectKey;
            return this;
        }

        /**
         * OsType.
         */
        public Builder osType(Integer osType) {
            this.putQueryParameter("OsType", osType);
            this.osType = osType;
            return this;
        }

        /**
         * PkgName.
         */
        public Builder pkgName(String pkgName) {
            this.putQueryParameter("PkgName", pkgName);
            this.pkgName = pkgName;
            return this;
        }

        /**
         * ProjectId.
         */
        public Builder projectId(String projectId) {
            this.putQueryParameter("ProjectId", projectId);
            this.projectId = projectId;
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

        /**
         * Sdks.
         */
        public Builder sdks(String sdks) {
            this.putQueryParameter("Sdks", sdks);
            this.sdks = sdks;
            return this;
        }

        @Override
        public GenerateSdkDownloadInfoRequest build() {
            return new GenerateSdkDownloadInfoRequest(this);
        } 

    } 

}
