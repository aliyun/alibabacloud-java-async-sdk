// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyDesktopNameRequest} extends {@link RequestModel}
 *
 * <p>ModifyDesktopNameRequest</p>
 */
public class ModifyDesktopNameRequest extends Request {
    @Query
    @NameInMap("DesktopId")
    @Validation(required = true)
    private String desktopId;

    @Query
    @NameInMap("NewDesktopName")
    @Validation(required = true)
    private String newDesktopName;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private ModifyDesktopNameRequest(Builder builder) {
        super(builder);
        this.desktopId = builder.desktopId;
        this.newDesktopName = builder.newDesktopName;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDesktopNameRequest create() {
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
     * @return newDesktopName
     */
    public String getNewDesktopName() {
        return this.newDesktopName;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<ModifyDesktopNameRequest, Builder> {
        private String desktopId; 
        private String newDesktopName; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyDesktopNameRequest response) {
            super(response);
            this.desktopId = response.desktopId;
            this.newDesktopName = response.newDesktopName;
            this.regionId = response.regionId;
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
         * NewDesktopName.
         */
        public Builder newDesktopName(String newDesktopName) {
            this.putQueryParameter("NewDesktopName", newDesktopName);
            this.newDesktopName = newDesktopName;
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
        public ModifyDesktopNameRequest build() {
            return new ModifyDesktopNameRequest(this);
        } 

    } 

}
