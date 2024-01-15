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
    @NameInMap("OperateType")
    private String operateType;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private RebuildDesktopsRequest(Builder builder) {
        super(builder);
        this.desktopId = builder.desktopId;
        this.imageId = builder.imageId;
        this.operateType = builder.operateType;
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
     * @return operateType
     */
    public String getOperateType() {
        return this.operateType;
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
        private String operateType; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(RebuildDesktopsRequest request) {
            super(request);
            this.desktopId = request.desktopId;
            this.imageId = request.imageId;
            this.operateType = request.operateType;
            this.regionId = request.regionId;
        } 

        /**
         * The IDs of the cloud desktops.
         */
        public Builder desktopId(java.util.List < String > desktopId) {
            this.putQueryParameter("DesktopId", desktopId);
            this.desktopId = desktopId;
            return this;
        }

        /**
         * The ID of the new image.
         */
        public Builder imageId(String imageId) {
            this.putQueryParameter("ImageId", imageId);
            this.imageId = imageId;
            return this;
        }

        /**
         * The operation type on the data disk.
         * <p>
         * 
         * > For cloud desktops that do not have data disks, when you call this operation, you do not need to configure this parameter.
         * 
         * *   Cloud desktops do not have data disks\
         *     The values that you configured have no impacts.
         * 
         * *   Cloud desktops have data disks
         * 
         *     1.  If the OS of the cloud desktop is the same as the OS of a destination image:
         * 
         *         *   The value replace indicates that the data disk of the cloud desktop is replaced.
         *         *   If you do not specify this parameter, the data disk of the cloud desktop is retained.
         * 
         *     2.  If the OS of the cloud desktop is the different from the OS of a destination image:
         * 
         *         *   The value replace indicates that the data disk of the cloud desktop is replaced.
         *         *   If you do not specify this parameter, the data disk of the cloud desktop is cleared.
         */
        public Builder operateType(String operateType) {
            this.putQueryParameter("OperateType", operateType);
            this.operateType = operateType;
            return this;
        }

        /**
         * The ID of the region.
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
