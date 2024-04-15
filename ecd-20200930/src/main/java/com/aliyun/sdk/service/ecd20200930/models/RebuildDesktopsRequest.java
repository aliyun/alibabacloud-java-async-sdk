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
         * The IDs of the cloud computers. You can specify 1 to 20 IDs.
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
         * >  This parameter is empty by default regardless of whether data disks are attached to the cloud computer.
         * 
         * *   No data disks are attached to the cloud computer:\
         *     No operation is performed on the data disks of the cloud computer regardless of the value of this parameter.
         * 
         * *   Data disks are attached to the cloud computer:
         * 
         *     1.  The OS of the cloud computer is the same as the OS of the destination image:
         * 
         *         *   If you set the OperateType parameter to `replace`, the data in the data disks of the cloud computer is replaced.
         *         *   If you leave the OperateType parameter empty, the data in the data disks of the cloud computer is retained.
         * 
         *     2.  The OS of the cloud computer is different from the OS of the destination image:
         * 
         *         *   If you set the OperateType parameter to `replace`, the data in the data disks of the cloud computer is replaced.
         *         *   If you leave the OperateType parameter empty, the data in the data disks of the cloud computer is cleared.
         */
        public Builder operateType(String operateType) {
            this.putQueryParameter("OperateType", operateType);
            this.operateType = operateType;
            return this;
        }

        /**
         * The region ID. You can call the [DescribeRegions](~~196646~~) operation to query the most recent region list.
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
