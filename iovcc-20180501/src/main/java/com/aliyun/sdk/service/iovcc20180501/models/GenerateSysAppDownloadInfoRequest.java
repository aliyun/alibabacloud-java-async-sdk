// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GenerateSysAppDownloadInfoRequest} extends {@link RequestModel}
 *
 * <p>GenerateSysAppDownloadInfoRequest</p>
 */
public class GenerateSysAppDownloadInfoRequest extends Request {
    @Query
    @NameInMap("CertFileObjectKey")
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
    @NameInMap("Plugins")
    @Validation(required = true)
    private String plugins;

    @Query
    @NameInMap("ProjectId")
    @Validation(required = true)
    private String projectId;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("SignMode")
    @Validation(required = true)
    private String signMode;

    private GenerateSysAppDownloadInfoRequest(Builder builder) {
        super(builder);
        this.certFileObjectKey = builder.certFileObjectKey;
        this.osType = builder.osType;
        this.pkgName = builder.pkgName;
        this.plugins = builder.plugins;
        this.projectId = builder.projectId;
        this.regionId = builder.regionId;
        this.signMode = builder.signMode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GenerateSysAppDownloadInfoRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return plugins
     */
    public String getPlugins() {
        return this.plugins;
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
     * @return signMode
     */
    public String getSignMode() {
        return this.signMode;
    }

    public static final class Builder extends Request.Builder<GenerateSysAppDownloadInfoRequest, Builder> {
        private String certFileObjectKey; 
        private Integer osType; 
        private String pkgName; 
        private String plugins; 
        private String projectId; 
        private String regionId; 
        private String signMode; 

        private Builder() {
            super();
        } 

        private Builder(GenerateSysAppDownloadInfoRequest response) {
            super(response);
            this.certFileObjectKey = response.certFileObjectKey;
            this.osType = response.osType;
            this.pkgName = response.pkgName;
            this.plugins = response.plugins;
            this.projectId = response.projectId;
            this.regionId = response.regionId;
            this.signMode = response.signMode;
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
         * Plugins.
         */
        public Builder plugins(String plugins) {
            this.putQueryParameter("Plugins", plugins);
            this.plugins = plugins;
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
         * SignMode.
         */
        public Builder signMode(String signMode) {
            this.putQueryParameter("SignMode", signMode);
            this.signMode = signMode;
            return this;
        }

        @Override
        public GenerateSysAppDownloadInfoRequest build() {
            return new GenerateSysAppDownloadInfoRequest(this);
        } 

    } 

}
