// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RecreateDesktopGroupRequest} extends {@link RequestModel}
 *
 * <p>RecreateDesktopGroupRequest</p>
 */
public class RecreateDesktopGroupRequest extends Request {
    @Query
    @NameInMap("DesktopGroupId")
    @Validation(required = true)
    private String desktopGroupId;

    @Query
    @NameInMap("OwnBundleId")
    private String ownBundleId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private RecreateDesktopGroupRequest(Builder builder) {
        super(builder);
        this.desktopGroupId = builder.desktopGroupId;
        this.ownBundleId = builder.ownBundleId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RecreateDesktopGroupRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return desktopGroupId
     */
    public String getDesktopGroupId() {
        return this.desktopGroupId;
    }

    /**
     * @return ownBundleId
     */
    public String getOwnBundleId() {
        return this.ownBundleId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<RecreateDesktopGroupRequest, Builder> {
        private String desktopGroupId; 
        private String ownBundleId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(RecreateDesktopGroupRequest response) {
            super(response);
            this.desktopGroupId = response.desktopGroupId;
            this.ownBundleId = response.ownBundleId;
            this.regionId = response.regionId;
        } 

        /**
         * DesktopGroupId.
         */
        public Builder desktopGroupId(String desktopGroupId) {
            this.putQueryParameter("DesktopGroupId", desktopGroupId);
            this.desktopGroupId = desktopGroupId;
            return this;
        }

        /**
         * OwnBundleId.
         */
        public Builder ownBundleId(String ownBundleId) {
            this.putQueryParameter("OwnBundleId", ownBundleId);
            this.ownBundleId = ownBundleId;
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
        public RecreateDesktopGroupRequest build() {
            return new RecreateDesktopGroupRequest(this);
        } 

    } 

}
