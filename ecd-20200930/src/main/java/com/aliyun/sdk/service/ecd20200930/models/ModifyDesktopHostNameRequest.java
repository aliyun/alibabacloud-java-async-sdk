// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyDesktopHostNameRequest} extends {@link RequestModel}
 *
 * <p>ModifyDesktopHostNameRequest</p>
 */
public class ModifyDesktopHostNameRequest extends Request {
    @Query
    @NameInMap("DesktopId")
    @Validation(required = true)
    private String desktopId;

    @Query
    @NameInMap("NewHostName")
    @Validation(required = true)
    private String newHostName;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private ModifyDesktopHostNameRequest(Builder builder) {
        super(builder);
        this.desktopId = builder.desktopId;
        this.newHostName = builder.newHostName;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDesktopHostNameRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return desktopId
     */
    public String getDesktopId() {
        return this.desktopId;
    }

    /**
     * @return newHostName
     */
    public String getNewHostName() {
        return this.newHostName;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<ModifyDesktopHostNameRequest, Builder> {
        private String desktopId; 
        private String newHostName; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyDesktopHostNameRequest request) {
            super(request);
            this.desktopId = request.desktopId;
            this.newHostName = request.newHostName;
            this.regionId = request.regionId;
        } 

        /**
         * DesktopId.
         */
        public Builder desktopId(String desktopId) {
            this.putQueryParameter("DesktopId", desktopId);
            this.desktopId = desktopId;
            return this;
        }

        /**
         * NewHostName.
         */
        public Builder newHostName(String newHostName) {
            this.putQueryParameter("NewHostName", newHostName);
            this.newHostName = newHostName;
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
        public ModifyDesktopHostNameRequest build() {
            return new ModifyDesktopHostNameRequest(this);
        } 

    } 

}
