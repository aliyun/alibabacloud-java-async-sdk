// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.webplus20190320.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreatePkgVersionRequest} extends {@link RequestModel}
 *
 * <p>CreatePkgVersionRequest</p>
 */
public class CreatePkgVersionRequest extends Request {
    @Body
    @NameInMap("AppId")
    private String appId;

    @Body
    @NameInMap("PackageSource")
    private String packageSource;

    @Body
    @NameInMap("PkgVersionDescription")
    private String pkgVersionDescription;

    @Body
    @NameInMap("PkgVersionLabel")
    private String pkgVersionLabel;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    private CreatePkgVersionRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.packageSource = builder.packageSource;
        this.pkgVersionDescription = builder.pkgVersionDescription;
        this.pkgVersionLabel = builder.pkgVersionLabel;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreatePkgVersionRequest create() {
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
     * @return packageSource
     */
    public String getPackageSource() {
        return this.packageSource;
    }

    /**
     * @return pkgVersionDescription
     */
    public String getPkgVersionDescription() {
        return this.pkgVersionDescription;
    }

    /**
     * @return pkgVersionLabel
     */
    public String getPkgVersionLabel() {
        return this.pkgVersionLabel;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<CreatePkgVersionRequest, Builder> {
        private String appId; 
        private String packageSource; 
        private String pkgVersionDescription; 
        private String pkgVersionLabel; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(CreatePkgVersionRequest response) {
            super(response);
            this.appId = response.appId;
            this.packageSource = response.packageSource;
            this.pkgVersionDescription = response.pkgVersionDescription;
            this.pkgVersionLabel = response.pkgVersionLabel;
            this.regionId = response.regionId;
        } 

        /**
         * AppId.
         */
        public Builder appId(String appId) {
            this.putBodyParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * PackageSource.
         */
        public Builder packageSource(String packageSource) {
            this.putBodyParameter("PackageSource", packageSource);
            this.packageSource = packageSource;
            return this;
        }

        /**
         * PkgVersionDescription.
         */
        public Builder pkgVersionDescription(String pkgVersionDescription) {
            this.putBodyParameter("PkgVersionDescription", pkgVersionDescription);
            this.pkgVersionDescription = pkgVersionDescription;
            return this;
        }

        /**
         * PkgVersionLabel.
         */
        public Builder pkgVersionLabel(String pkgVersionLabel) {
            this.putBodyParameter("PkgVersionLabel", pkgVersionLabel);
            this.pkgVersionLabel = pkgVersionLabel;
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
        public CreatePkgVersionRequest build() {
            return new CreatePkgVersionRequest(this);
        } 

    } 

}
