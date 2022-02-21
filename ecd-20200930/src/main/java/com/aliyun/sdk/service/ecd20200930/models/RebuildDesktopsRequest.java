// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RebuildDesktopsRequest} extends {@link RequestModel}
 *
 * <p>RebuildDesktopsRequest</p>
 */
public class RebuildDesktopsRequest extends Request {
    @Query
    @NameInMap("DesktopId")
    @Validation(required = true)
    private java.util.List < String > desktopId;

    @Query
    @NameInMap("ImageId")
    private String imageId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private RebuildDesktopsRequest(Builder builder) {
        super(builder);
        this.desktopId = builder.desktopId;
        this.imageId = builder.imageId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RebuildDesktopsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return desktopId
     */
    public java.util.List < String > getDesktopId() {
        return this.desktopId;
    }

    /**
     * @return imageId
     */
    public String getImageId() {
        return this.imageId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<RebuildDesktopsRequest, Builder> {
        private java.util.List < String > desktopId; 
        private String imageId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(RebuildDesktopsRequest response) {
            super(response);
            this.desktopId = response.desktopId;
            this.imageId = response.imageId;
            this.regionId = response.regionId;
        } 

        /**
         * DesktopId.
         */
        public Builder desktopId(java.util.List < String > desktopId) {
            this.putQueryParameter("DesktopId", desktopId);
            this.desktopId = desktopId;
            return this;
        }

        /**
         * ImageId.
         */
        public Builder imageId(String imageId) {
            this.putQueryParameter("ImageId", imageId);
            this.imageId = imageId;
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
        public RebuildDesktopsRequest build() {
            return new RebuildDesktopsRequest(this);
        } 

    } 

}
