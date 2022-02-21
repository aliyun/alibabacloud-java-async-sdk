// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListClientPluginVersionsRequest} extends {@link RequestModel}
 *
 * <p>ListClientPluginVersionsRequest</p>
 */
public class ListClientPluginVersionsRequest extends Request {
    @Query
    @NameInMap("OsType")
    @Validation(required = true)
    private String osType;

    @Query
    @NameInMap("PkgName")
    @Validation(required = true)
    private String pkgName;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    private ListClientPluginVersionsRequest(Builder builder) {
        super(builder);
        this.osType = builder.osType;
        this.pkgName = builder.pkgName;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListClientPluginVersionsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return osType
     */
    public String getOsType() {
        return this.osType;
    }

    /**
     * @return pkgName
     */
    public String getPkgName() {
        return this.pkgName;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<ListClientPluginVersionsRequest, Builder> {
        private String osType; 
        private String pkgName; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ListClientPluginVersionsRequest response) {
            super(response);
            this.osType = response.osType;
            this.pkgName = response.pkgName;
            this.regionId = response.regionId;
        } 

        /**
         * OsType.
         */
        public Builder osType(String osType) {
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
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public ListClientPluginVersionsRequest build() {
            return new ListClientPluginVersionsRequest(this);
        } 

    } 

}
