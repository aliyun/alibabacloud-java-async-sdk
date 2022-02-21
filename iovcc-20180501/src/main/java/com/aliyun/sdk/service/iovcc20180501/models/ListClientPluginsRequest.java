// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListClientPluginsRequest} extends {@link RequestModel}
 *
 * <p>ListClientPluginsRequest</p>
 */
public class ListClientPluginsRequest extends Request {
    @Query
    @NameInMap("OsType")
    @Validation(required = true)
    private String osType;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    private ListClientPluginsRequest(Builder builder) {
        super(builder);
        this.osType = builder.osType;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListClientPluginsRequest create() {
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<ListClientPluginsRequest, Builder> {
        private String osType; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ListClientPluginsRequest response) {
            super(response);
            this.osType = response.osType;
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
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public ListClientPluginsRequest build() {
            return new ListClientPluginsRequest(this);
        } 

    } 

}
